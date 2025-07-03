package pageFactory;

import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ConfigReader;
import utilities.DriverManager;

public class SubscriptionPage {
  
    private final WebDriver driver = DriverManager.getDriver();
    public SubscriptionPage() { 
    	PageFactory.initElements(driver, this); }

    //locators
    @FindBy(xpath = "//header//button[normalize-space()='Login']")
    private WebElement loginBtn;  
    @FindBy(css  = "input[placeholder='Enter email']")              
    private WebElement emailInput;
    @FindBy(xpath = "//button[normalize-space()='Continue with email']")
    private WebElement continueWithEmailBtn;
    @FindBy(css  = "input[type='password']")                        
    private WebElement passwordInput;
    @FindBy(xpath = "//button[normalize-space()='Sign in']")        
    private WebElement signInBtn;
    @FindBy(xpath = "//button[normalize-space()='View Full Plan']") 
    private WebElement viewFullPlanBtn;
    @FindBy(xpath = "//h1[contains(normalize-space(),'Free vs. Premium Account Features')]")
    private WebElement comparisonHeader;
    @FindBy(xpath = "//table[contains(@class,'border-collapse')]")  // main feature table
    private WebElement featureTable;
    @FindBy(xpath = "//p[contains(text(),'Terms') and contains(text(),'Privacy')]")
    private WebElement legalText;
    @FindBy(xpath = "//button[normalize-space()='Continue Free']")      
    private WebElement continueFreeBtn;
    @FindBy(xpath = "//button[normalize-space()='Upgrade to Premium']") 
    private WebElement upgradeBtn;

  
    public void openFirstPage() { 
    	driver.get(ConfigReader.getApplicationUrl()); }
    public void clickLogin() { 
    	loginBtn.click(); }
    public void enterEmail(String email) { 
    	emailInput.sendKeys(email); }
    public void clickContinueWithEmail() { 
    	continueWithEmailBtn.click(); }
    
    public void enterPassword(String pwd) {
        new WebDriverWait(driver, Duration.ofSeconds(6))
                .until(ExpectedConditions.visibilityOf(passwordInput))
                .sendKeys(pwd);
    }
    public void clickSignIn() { 
    	signInBtn.click(); }
    public void clickViewFullPlan() {
        new WebDriverWait(driver, Duration.ofSeconds(6))
                .until(ExpectedConditions.elementToBeClickable(viewFullPlanBtn))
                .click();
    }

    public boolean isComparisonPageDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(comparisonHeader));
        return comparisonHeader.isDisplayed();
    }

   //1st column is thefeatures
    private static final int FREE_COL    = 2; //2nd column is for free  
    private static final int PREMIUM_COL = 3;  //3rd column is for premium 
    
//hastick used tocheck whether there is a grn tick for some features
    private boolean hasTick(String rowLabel, int col) {
        String xpath = ".//tr[td[normalize-space()='" + rowLabel + "']]" +
                    "/td[" + col + "]//*[normalize-space()='✓']"; //xpath fro grntick
        return featureTable.findElements(By.xpath(xpath)).size() > 0;
    }

    public boolean isFeatureAvailableInFree   (String row){ 
    	return hasTick(row, FREE_COL);    //find available features
    }
    public boolean isFeatureUnavailableInFree (String row){ 
    	return !hasTick(row, FREE_COL);  //check unavailable features 
    }
    public boolean isFeatureAvailableInPremium(String row){ 
    	return hasTick(row, PREMIUM_COL); //find available under premium
    }

   //find wheher there is 9 features
    public boolean featureCountIs(int expected) {
        int rows = featureTable.findElements(
                       By.xpath("./tbody/tr[not(contains(@class,'cta-row'))]")).size();
        return rows == expected;
    }

    public boolean availableFeaturesHaveGreenChecks() {  //available will show grn ticks
        return featureTable.findElements(
                   By.xpath(".//span[normalize-space()='✓' and contains(@class,'text-green')]"))
               .stream().allMatch(WebElement::isDisplayed);
    }

    public boolean missingFeaturesHaveRedXs() {  //unavailable will show red cross
        return featureTable.findElements(
                   By.xpath(".//span[normalize-space()='✗' and contains(@class,'text-red')]"))
               .stream().allMatch(WebElement::isDisplayed);
    }

    public boolean isButtonUnderFree(String row) {  //is continue free under free
        String xpath = ".//tr[td[normalize-space()='" + row + "']]/td[" + FREE_COL + "]//button";
        return featureTable.findElements(By.xpath(xpath)).size() > 0;
    }
    
    public boolean isButtonUnderPremium(String row) {   //is upgrde to prem under premium
        String xpath = ".//tr[td[normalize-space()='" + row + "']]/td[" + PREMIUM_COL + "]//button";
        return featureTable.findElements(By.xpath(xpath)).size() > 0;
    }

    public boolean isButtonVisible(String label) {
        return driver.findElement(
                   By.xpath("//button[normalize-space()='" + label + "']")).isDisplayed();
    }

    public boolean isFreePriceDisplayed() {
        return featureTable.getText().contains("$0");
    }

    public boolean isPremiumPriceDisplayed() {
        return featureTable.getText().contains("$9.99");
    }
   
    public boolean isLegalTextVisible() { 
    	return legalText.isDisplayed(); 
    	}
    
    public boolean isUpgradeHeaderVisible() {
        return driver.getPageSource()	
                     .toLowerCase()      //header has oth upper/lowercase               
                     .contains("upgrade to premium for complete diabetes management");
    }

    public boolean columnsAreSideBySide() {
        return driver.getPageSource().contains("Free Account") &&
               driver.getPageSource().contains("Premium Account");
    }

    public void clickContinueFree() { 
    	continueFreeBtn.click(); 
    	}
    public void clickUpgrade() { 
    	upgradeBtn.click();      
    }
}
