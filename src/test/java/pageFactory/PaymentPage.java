package pageFactory;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.DriverManager;

public class PaymentPage {

    private final WebDriver driver = DriverManager.getDriver();
    private final WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));

    public PaymentPage() { 
    	PageFactory.initElements(driver, this); 
    }
 
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement payBtn;

    private WebElement findInAnyIframe(By locator, int sec) {
        WebDriverWait shortWait = new WebDriverWait(driver, Duration.ofSeconds(sec));
        List<WebElement> frames = driver.findElements(By.tagName("iframe"));

        for (WebElement f : frames) {  //loop
            driver.switchTo().frame(f);
            try {
                return shortWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            } catch (TimeoutException ignored) {
               
            }
            driver.switchTo().defaultContent(); //return back to the page if nothing is found
        }
        driver.switchTo().defaultContent();
        throw new NoSuchElementException("Could not locate: " + locator);
    }

    public void enterCardNumber(String number) {
        WebElement field = findInAnyIframe(
                By.cssSelector("input[name='cardnumber']"), 6);   
        field.clear();
        field.sendKeys(number);
        driver.switchTo().defaultContent();                      
    }


    public void enterExpiry(String mmYY) {
        WebElement field = findInAnyIframe(
                By.cssSelector("input[name='exp-date']"), 6);     
        field.clear();
        field.sendKeys(mmYY);
        driver.switchTo().defaultContent();
    }
    
    public void enterCvc(String cvc) {
        WebElement field = findInAnyIframe(
                By.cssSelector("input[name='cvc']"), 6);          
        field.clear();
        field.sendKeys(cvc);
        driver.switchTo().defaultContent();
    }

    public void clickPay() {
        wait.until(ExpectedConditions.elementToBeClickable(payBtn)).click();
    }

    
    public boolean hasValidationMessage(String snippet) {
        return hasValidationMessage(snippet, 8);   
        //error messages are short lived and cant find xpath
        //this calls the next method 
    }

    public boolean hasValidationMessage(String snippet, int timeoutSec) {
        if (snippet.contains("'")) {
            return driver.getPageSource()
                         .toLowerCase()
                         .contains(snippet.toLowerCase());
        }

        By banner = By.xpath("//*[contains(normalize-space(),'" + snippet + "')]");
        try {
            new WebDriverWait(driver, Duration.ofSeconds(timeoutSec))
                    .until(ExpectedConditions.visibilityOfElementLocated(banner));
            return true;                
        } catch (TimeoutException e) {
           
            return driver.getPageSource()
                         .toLowerCase()
                         .contains(snippet.toLowerCase());
        }
    }

    public boolean confirmationScreenVisible() {
        return wait.until(ExpectedConditions.textToBePresentInElementLocated(
            By.xpath("//*[contains(normalize-space(),'Welcome to Premium')]"),
            "Welcome to Premium"));
    }
}
