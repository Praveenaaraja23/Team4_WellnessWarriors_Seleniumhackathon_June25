package pageFactory;

import java.time.Duration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;

import utilities.ConfigReader;
import utilities.DriverManager;

public class HomepageVitalPage {

    private final WebDriver driver;
    public HomepageVitalPage() {
        this.driver = DriverManager.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//header//button[normalize-space()='Login']")
    private WebElement loginBtn;

    @FindBy(css = "input[placeholder='Enter email']")
    private WebElement emailInput;

    @FindBy(xpath = "//button[normalize-space()='Continue with email']")
    private WebElement continueWithEmailBtn;

    @FindBy(css = "input[type='password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[normalize-space()='Sign in']")
    private WebElement signInBtn;

    @FindBy(tagName = "header")  
    private WebElement headerBar;
    
    @FindBy(css = "nav")         
    private WebElement navBar;
    
    @FindBy(css = "header span") 
    private WebElement sweetBalanceText;

    @FindBy(xpath = "//header//span[not(contains(.,'SweetBalance'))]")
    private WebElement userName;

    @FindBy(xpath = "//header//button//*[normalize-space()='Logout' or name()='svg']")
    private WebElement logoutBtn;
    
    @FindBy(xpath = "//h3[normalize-space()='Current Status']/ancestor::div[1]")
    private WebElement statusCard;

    @FindBy(xpath =
        "//h3[normalize-space()='Current Status']"
      + "/following::div[contains(translate(normalize-space(.),"
      + " 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz')," //lower/uppercsae
      + " 'last updated')][1]") //1 means we fetch the first one that matches
    private WebElement lastUpdatedRow;

    @FindBy(xpath = "//h2[contains(normalize-space(),'Meal Plan')]")
    private WebElement mealPlanTitle;

    @FindBy(xpath =
        "//div[contains(@class,'flex') and contains(@class,'flex-col') and .//span[text()='Meal Plan']]")
    private WebElement mealPlanSidebar;
    
    @FindBy(xpath = "//div[normalize-space()='Latest HbA1C']/following-sibling::div[1]")
    private WebElement hba1cCategory;
    
    @FindBy(xpath = "//div[normalize-space()='BMI']/following-sibling::div[1]")
    private WebElement bmiCategory;
      
    @FindBy(xpath =
    	    "//*[translate(normalize-space(.), " +
    	    "      'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz')='average blood sugar']" +
    	    "/following-sibling::*[contains(translate(normalize-space(.), " +
    	    "      'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'),'mg/dl')][1]")
    	private WebElement avgBsUnit;

    public String getHbA1CConditionText() { 
    	return hba1cCategory.getText().trim(); 
    }
    
    public String getBMICategoryText() { 
    	return bmiCategory.getText().trim();   
    }
    
    public String getUnitBelowAvgBloodSugar() { 
    	return avgBsUnit.getText().trim();     
    }
    
    public void setHbA1CValue(double value) { 
    	jsSetSquareValue("Latest HbA1C", value); //javscrpt helper
    }
    
    public void setBMIValue(double value) { 
    	jsSetSquareValue("BMI", value); 
    }

    public void setHbA1CCondition(String txt) { 
    	jsSetText(hba1cCategory, txt); 
    }
    
    public void setBMICategory(String txt) { 
    	jsSetText(bmiCategory,  txt);  
    }

    private void jsSetText(WebElement element, String txt) {
        ((JavascriptExecutor) driver)
            .executeScript("arguments[0].textContent='" + txt + "';", element);
    }

    public void openFirstPage() { 
    	driver.get(ConfigReader.getApplicationUrl()); 
    }
    
    public void clickLogin() { 
    	loginBtn.click(); 
    }
    
    public void enterEmail(String mail) { 
    	emailInput.sendKeys(mail); 
    }
    
    public void clickContinueWithEmail() { 
    	continueWithEmailBtn.click(); 
    }
    
    public void enterPassword(String pwd) {
        new WebDriverWait(driver, Duration.ofSeconds(6))
            .until(ExpectedConditions.visibilityOf(passwordInput))
            .sendKeys(pwd);
    }
    
    public void clickSignIn() { 
    	signInBtn.click(); 
    }

    public boolean isLoaded() {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//h3[normalize-space()='Current Status']")));
            return true;
        } catch (TimeoutException e) { return false; } 
        //catch starts wen the elemnt is not found in 10 sec        
    }
    
    public boolean isElementVisible(String rawLabel) {
        String wanted = rawLabel.trim().toLowerCase(); //want element in the way it is 

        if (wanted.equals("sweetbalance")) return sweetBalanceText.isDisplayed();
        if (wanted.equals("logout"))       return logoutBtn.isDisplayed();
        if (wanted.equals("user name"))    return userName.isDisplayed();

        try {
            WebElement element = navBar.findElement(
                By.xpath(".//*[translate(normalize-space(.),"
                       + "'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz')='"
                       + wanted + "']"));
            return element.isDisplayed();
        } catch (NoSuchElementException error) { return false; }
    }
   
    public boolean isStatusLabelVisible(String label) {
        String wanted = label.trim().replaceAll("\\s+", " ").toLowerCase();
        try {
            String cardText = statusCard.getText()
                                        .replaceAll("\\s+", " ")
                                        .toLowerCase();
            return cardText.contains(wanted);
        } catch (Exception element) { return false; }
    }

    public String getTimestamp() {
        new WebDriverWait(driver, Duration.ofSeconds(5))
            .until(ExpectedConditions.visibilityOf(lastUpdatedRow));

        try {
            return lastUpdatedRow.findElement(By.xpath(".//span"))
                                 .getText().trim();
        } catch (NoSuchElementException ignore) {
            String txt = lastUpdatedRow.getText().trim();
            return txt.replaceFirst("(?i)^last\\s+updated\\s*:?", "").trim();
        }
    }

    public String getVitalsValue(String metric) {

        new WebDriverWait(driver, Duration.ofSeconds(5))
            .until(ExpectedConditions.visibilityOf(statusCard));

        String xpath = "//h3[normalize-space()='Current Status']/ancestor::div[1]"
                  + "//*[translate(normalize-space(.),"
                  + "      'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz')='"
                  +        metric.trim().toLowerCase() + "']"
                  + "/preceding-sibling::*[1]";

        try {
            WebElement square = new WebDriverWait(driver, Duration.ofSeconds(5))
                    .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            String txt = square.getText().trim();
            if (!txt.isEmpty()) return txt;
        } catch (TimeoutException | NoSuchElementException ignore) {
           
        }

        try {
            String cardText = statusCard.getText();
            Pattern p = Pattern.compile("([\\d.,]+)\\s+" + Pattern.quote(metric),
                                        Pattern.CASE_INSENSITIVE);
            Matcher m = p.matcher(cardText);
            return m.find() ? m.group(1).trim() : null;
        } catch (Exception e) {
            return null;           
        }
    }

 private void jsSetSquareValue(String metric, double v) {

     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
     WebElement label = wait.until(ExpectedConditions.visibilityOfElementLocated(
             By.xpath("//*[normalize-space()='" + metric + "']")));

     WebElement square = null;

     try {
         square = label.findElement(By.xpath("preceding-sibling::*[1]"));
     } catch (NoSuchElementException ignore) { 
    	 
     }

     if (square == null) {
         square = label.findElement(By.xpath("../preceding-sibling::*[1]"));
     }

     if (square == null) {
         throw new NoSuchElementException(
                 "Could not locate coloured square for metric: " + metric);
     }

     ((JavascriptExecutor) driver)
             .executeScript("arguments[0].textContent='" + v + "';", square);
 }

    public boolean mealPlanTitleIsVisible() { 
    	return mealPlanTitle.isDisplayed(); 
    }
    
    public boolean mealPlanSidebarVisible() { 
    	return mealPlanSidebar.isDisplayed(); 
    }

    public boolean sectionIsVisible(String title) {
        String wanted = title.trim()
                             .toLowerCase()
                             .replace("’", "'");        

        String xp = "//*[self::section or self::div or self::article]" +
                    "[.//*[contains(translate(normalize-space(.), " +
                    "   'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz')," +
                    "   \"" + wanted + "\")]]";

        try {
            driver.findElement(By.xpath(xp));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

}
