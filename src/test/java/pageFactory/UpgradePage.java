package pageFactory;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.DriverManager;

public class UpgradePage {

    private final WebDriver driver = DriverManager.getDriver();
    
    public UpgradePage() { 
    	PageFactory.initElements(driver, this); 
    }

    
    @FindBy(xpath = "//h1[normalize-space()='Upgrade to Premium']")
    private WebElement pageTitle;

    @FindBy(xpath = "//p[contains(normalize-space(),'Get personalized insights')]")
    private WebElement subtitle;

    @FindBy(xpath = "//h3[normalize-space()='Premium Features']")
    private WebElement premiumFeaturesText;

    @FindBy(xpath = "//h3[normalize-space()='Premium Features']/following::ul[1]/li")
    private List<WebElement> includedFeatureItems;
    //list used to find multiple features
    //normalize-space used to ignore spaces
   
    @FindBy(xpath = "//*[contains(normalize-space(),'$9.99')]")
    private WebElement priceText;

    @FindBy(xpath = "//*[contains(normalize-space(),'cancel anytime')]")
    private WebElement cancelAnytimeText;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement payButton;

    @FindBy(xpath = "//*[contains(text(),'By completing this purchase')]")
    private WebElement termsNotice;

    @FindBy(xpath = "//*[contains(text(),'automatically renew')]")
    private WebElement autoRenewNotice;


    public String  getTitle() { 
    	return pageTitle.getText(); 
    }
    
    public boolean subtitleIsVisible() { 
    	return subtitle.isDisplayed(); 
    }
    public boolean premiumHeaderIsVisible() { 
    	return premiumFeaturesText.isDisplayed();
    }
    public boolean isPriceDisplayed() { 
    	return priceText.isDisplayed(); 
    }
    public boolean cancelAnytimeIsVisible() { 
    	return cancelAnytimeText.isDisplayed(); 
    }

    public boolean isFeatureListed(String feature) {
        return includedFeatureItems.stream()
                .map(li -> li.getText().trim().toLowerCase()) //used li.getText to get the text
                .anyMatch(t -> t.contains(feature.toLowerCase())); 
        //checking whether it matches with any elements on the appliation page
        //gives lilflexiilty to find anywer in the page
    }

    public boolean pageContainsText(String text) {
        return driver.getPageSource().toLowerCase().contains(text.toLowerCase());
    }


    public boolean cardHeadingIsVisible() {
        return driver.findElement(
                By.xpath("//label[normalize-space()='Card Number' or normalize-space()='Card number']"))
                .isDisplayed();
    }

    
    private boolean visibleInAnyIframe(By locator, int seconds) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        wait.until(d -> d.findElements(By.tagName("iframe")).size() > 0);
        for (WebElement frame : driver.findElements(By.tagName("iframe"))) {
        	//pagesourcce used for simpler thing, iframe is like a page inside a page, more complex that pagesource

            driver.switchTo().frame(frame);
            try {
                wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
                driver.switchTo().defaultContent();    
                return true;                            
            } catch (TimeoutException ignore) {
               
            }
            driver.switchTo().defaultContent();          
        }
        return false;                                
    }

    public boolean cardNumberFieldIsVisible() {
        return visibleInAnyIframe(By.cssSelector("input[name='cardnumber']"), 12);
        //12 minutes to check whether it will show up from any frame
    }

    public boolean expDateFieldIsVisible() {
        return visibleInAnyIframe(By.cssSelector("input[name='exp-date']"), 12);
    }

    public boolean cvvFieldIsVisible() {
        return visibleInAnyIframe(By.cssSelector("input[name='cvc']"), 12);
    }

  
    public boolean payButtonIsVisible() { 
    	return payButton.isDisplayed(); 
    }
    public boolean termsNoticeIsVisible() { 
    	return termsNotice.isDisplayed(); 
    }
    
    public boolean autoRenewNoticeIsVisible() { 
    	return autoRenewNotice.isDisplayed(); 
    }
   
//    public boolean isOnHomePage() {
//        return new WebDriverWait(driver, Duration.ofSeconds(6))
//                .until(ExpectedConditions.urlContains("/FirstPage"));
//    }
}
