package pageFactory;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.DriverManager;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class HomepageFreeUserPage {

    private final WebDriver  driver = DriverManager.getDriver();
    private final WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(12));

    public HomepageFreeUserPage() { PageFactory.initElements(driver, this); }
   
    @FindBy(css = "nav")                    
    private WebElement navBar;
    
    @FindBy(css = "header nav button:nth-of-type(1)")
    private WebElement homeBtn;
    
    @FindBy(xpath = "//div[@class='meal-card']//div[contains(@class,'font-medium')][1]")
    private WebElement firstCardTitle;

    @FindBy(xpath = "//div[normalize-space()='Nutrition Insights']")
    private WebElement nutritionHeading;
    
    @FindBy(xpath = "//div[contains(@class,'font-medium') and starts-with(normalize-space(),'Pre-')]")
    private WebElement preMealTitle;
    
    @FindBy(xpath = "//span[normalize-space()='Exercise']/ancestor::button")
    private WebElement exerciseNavBtn; 

//    @FindBy(xpath = "//h2[contains(normalize-space(),\"Today's Exercise Plan\")]")
//    private WebElement exerciseHeader;
    //was not able to locate and it was failing
    
    private static final By EXERCISE_HEADER =
            By.xpath("//h2[contains(normalize-space(),'Exercise Plan')]");
    
    @FindBy(xpath = "//div[contains(@class,'text-gray-600')]//span[contains(text(),':')]")
    private WebElement intakeTime;
      
    @FindBy(xpath = "//button[normalize-space()='View Full Plan']")
    private WebElement viewFullPlanBtn;
    
    @FindBy(xpath = "//button[normalize-space()='View Full Schedule']")
    private WebElement viewFullScheduleBtn;

    public String getItemOrder() {
        By navButtons = By.cssSelector("nav button"); //cmn nav button-home,dashboard,edctn
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(navButtons, 0));
        return driver.findElements(navButtons)
                     .stream() //wn drivee gvs the list of buttons, stream is used to convert
                     .filter(WebElement::isDisplayed)
                     .map(WebElement::getText)//converts to txt
                     .collect(Collectors.joining(", "));
    }
 
    public boolean caretIconVisible() {
        By caret = By.xpath("//h2[normalize-space(.)=\"Today's Meal Plan\"]/parent::button//*[name()='svg']");
        return wait.until(ExpectedConditions.visibilityOfElementLocated(caret)).isDisplayed();
    }
    
    public void openExerciseSection() {

        wait.until(ExpectedConditions.elementToBeClickable(exerciseNavBtn)).click();
        WebElement header = wait.until(
                ExpectedConditions.presenceOfElementLocated(EXERCISE_HEADER));
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView({block:'center'});", header); 
        //just to make sure wecan see the elemntin the screen
        wait.until(ExpectedConditions.visibilityOf(header));
    }
    
    private By mealTab(String mealTxt) {
        return By.xpath("//button[normalize-space()='" + mealTxt + "']");
    }

    public void selectMealTab(String meal) {
        wait.until(ExpectedConditions.elementToBeClickable(mealTab(meal))).click();
        wait.until(ExpectedConditions.visibilityOf(nutritionHeading));
    }

    
    private final By colouredMacroBar = By.xpath(   //carb protein ffat
        "//div[contains(@class,'h-2') and contains(@class,'rounded-full') and " +
        "      contains(@class,'bg-') and not(contains(@class,'bg-gray'))]");

 
    public boolean headingIsVisible(String expected) {
        return nutritionHeading.isDisplayed() && nutritionHeading.getText().trim().equals(expected);
    }

    public boolean nutritionBarIsDisplayed() {
        List<WebElement> bars = wait.until(
                ExpectedConditions.numberOfElementsToBeMoreThan(colouredMacroBar, 0));

        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView({block:'center'});", bars.get(0));

        return bars.get(0).isDisplayed();
    }

    public boolean preMealTitleIsVisible() {
        return wait.until(ExpectedConditions.visibilityOf(preMealTitle)).isDisplayed();
    }

    public boolean macroValuesPresent() { 
    	return driver.findElements(colouredMacroBar).size() >= 3;//3 bars shudbe returned-carb,protein,fat 
    }

    public boolean intakeTimeIsDisplayed(String ignored) { 
    	return intakeTime.isDisplayed(); 
    }

    public boolean snackIndicatorIs(String txt) {
        By timeSpans = By.xpath("//span[contains(text(), '" + txt + "')]");
        List<WebElement> matches = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(timeSpans));
        return matches.stream().anyMatch(WebElement::isDisplayed);
    }

    public boolean isTimeInFormat(String ignored) {
        return intakeTime.getText().trim()
                         .matches("\\d{1,2}:\\d{2}(\\s?(AM|PM))?");
    }

    public boolean dotBetweenTimeAndCalories() {
        
        By dot = By.cssSelector("span.mx-2");             
        return wait.until(ExpectedConditions.visibilityOfElementLocated(dot)).isDisplayed();
    }

    public void clickViewFullPlan() {
        wait.until(ExpectedConditions.elementToBeClickable(viewFullPlanBtn)).click();
        wait.until(d -> d.getCurrentUrl().matches(".*(?:subscription|upgrade|pricing).*"));
    }

    public void clickViewFullSchedule() {

        openExerciseSection();                      
        wait.until(ExpectedConditions.elementToBeClickable(viewFullScheduleBtn)).click();
        wait.until(d -> d.getCurrentUrl().matches(".*(?:subscription|upgrade|pricing).*"));
    }

    public String getExerciseHeaderTitle() {
        WebElement header = wait.until(
                ExpectedConditions.visibilityOfElementLocated(EXERCISE_HEADER));

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView({block:'center'});", header);

        return header.getText().trim();
    }
    
    public boolean isOnSubscriptionPage() {
        String url = driver.getCurrentUrl();
        return url.contains("/subscription")
            || url.contains("/upgrade")
            || url.contains("/pricing");
    }
}
