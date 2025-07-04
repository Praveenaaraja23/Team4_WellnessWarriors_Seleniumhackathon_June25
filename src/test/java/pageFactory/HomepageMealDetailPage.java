package pageFactory;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import utilities.DriverManager;

public class HomepageMealDetailPage {
	
	private final WebDriver driver = DriverManager.getDriver();
    private final WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    public HomepageMealDetailPage() { 
    	PageFactory.initElements(driver, this); 
    }

    @FindBy(xpath = "//div[contains(@class,'bg-white') and contains(@class,'rounded')]//h3")
    private WebElement dishTitle;

    @FindBy(xpath = "//div[contains(@class,'bg-white') and contains(@class,'rounded')]//div[contains(@class,'text-gray-600')]")
    private WebElement dishDescription;

    @FindBy(css = "div.text-gray-700.font-medium.mb-2")
    private WebElement preMealItemName;

    @FindBy(xpath = "//div[contains(@class,'flex') and contains(@class,'items-center') and contains(@class,'text-sm')]/span[last()]")
    private WebElement calorieValue;

    @FindBy(xpath = "//div[contains(@class,'flex') and contains(@class,'items-center') and contains(@class,'text-sm')]/span[1]")
    private WebElement timeFullSpan;

//    @FindBy(css = "img[alt$=\"o'clock\"]")
//    private List<WebElement> clockIcons;

    @FindBy(css = "[data-testid='macro-carbs']") 
    private WebElement carbsRow;
    
    @FindBy(css = "[data-testid='macro-fat']")      
    private WebElement fatRow;
    
    @FindBy(css = "[data-testid='macro-protein']")  
    private WebElement proteinRow;
    
    @FindBy(css = "[data-testid^='macro-'] span.unit") 
    private List<WebElement> macroUnits;


    private boolean displayed(WebElement el) {
        wait.until(ExpectedConditions.visibilityOf(el));
        return el.isDisplayed();
    }

    public void selectMealTab(String mealType) {
        new HomepageMealSectionPage().selectMealTab(mealType);
        wait.until(ExpectedConditions.visibilityOf(dishTitle));   
    }

    public boolean isDishTitleDisplayed() { 
    	return displayed(dishTitle); 
    }
    
    public boolean isDishDescriptionDisplayed() { 
    	return displayed(dishDescription); 
    }
    public boolean isPreMealItemNameDisplayed() { 
    	return displayed(preMealItemName); 
    }
    
    public boolean isPreMealCaloriesDisplayed() { 
    	return displayed(calorieValue); 
    }

    public String getMealTimeIndicator() {
        String[] parts = timeFullSpan.getText().trim().split("\\s+");
        return parts.length > 1 ? parts[1] : "";   
    }
      
    public boolean isPreMealTimeFormattedCorrectly() {
      
        String hhmm = timeFullSpan.getText().trim().split("\\s+")[0];
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("H:mm");  //to accept time from 0-23hrs

        try {    
            LocalTime.parse(hhmm, fmt);      
            return true;
        } catch (DateTimeParseException element) {
            return false;
        }
    }

//    public boolean isClockIconDisplayed(int hour) {
//        String suffix = hour + " o'clock";
//        return clockIcons.stream().anyMatch(i -> suffix.equalsIgnoreCase(i.getAttribute("alt")) && i.isDisplayed());
//    }

    public boolean isMacroColorCorrect(String macro, String expectedCssFragment) {
        WebElement row;

        switch (macro.toLowerCase()) {
            case "carbs":
                row = carbsRow;
                break;
            case "fat":
                row = fatRow;
                break;
            case "protein":
                row = proteinRow;
                break;
            default:
                throw new IllegalArgumentException("Unknown macro: " + macro);
        }

        return row.getCssValue("background-color").contains(expectedCssFragment);
    }

    public boolean areMacroUnitsCorrect() {
        return macroUnits.stream().allMatch(el -> "g".equalsIgnoreCase(el.getText().trim()));
    }
}