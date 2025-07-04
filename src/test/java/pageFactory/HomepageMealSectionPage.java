package pageFactory;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;

import utilities.DriverManager;

public class HomepageMealSectionPage {
 
    private final WebDriver     driver;
    private final WebDriverWait wait;

    public HomepageMealSectionPage() {
        this.driver = DriverManager.getDriver();
        this.wait   = new WebDriverWait(driver, Duration.ofSeconds(12));
        PageFactory.initElements(driver, this);
    }
   
    @FindBy(xpath = "//h2[normalize-space()=\"Today's Meal Plan\"]")
    private WebElement mealPlanTitle;
   
    @FindBy(xpath = "//button[normalize-space()='Breakfast']")
    private WebElement breakfastTab;

    @FindBy(xpath = "//button[normalize-space()='Lunch']")
    private WebElement lunchTab;

    @FindBy(xpath = "//button[normalize-space()='Dinner']")
    private WebElement dinnerTab;

    @FindBy(xpath = "//button[normalize-space()='Snacks']")
    private WebElement snacksTab;
  
    public void selectMealTab(String tabName) {

    	WebElement btn;
    	switch (tabName.trim().toLowerCase()) {
    	    case "breakfast":
    	        btn = breakfastTab;
    	        break;
    	    case "lunch":
    	        btn = lunchTab;
    	        break;
    	    case "dinner":
    	        btn = dinnerTab;
    	        break;
    	    case "snacks":
    	        btn = snacksTab;
    	        break;
    	    default:
    	        throw new IllegalArgumentException("Unknown tab: " + tabName);
    	}

        // scroll + click
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView({block:'center'});", btn);
        wait.until(ExpectedConditions.elementToBeClickable(btn)).click();

        String panelXp =
              "//button[normalize-space()='" + tabName.trim() + "']"
            + "/ancestor::div[contains(@class,'rounded-full')]"   
            + "/following-sibling::div[1]";                   

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(panelXp)));
    }

    public boolean mealDetailsVisible(String tabName) {
        String panelXp =
              "//button[normalize-space()='" + tabName.trim() + "']"
            + "/ancestor::div[contains(@class,'rounded-full')]/following-sibling::div[1]";
        try {
            return driver.findElement(By.xpath(panelXp)).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

}
