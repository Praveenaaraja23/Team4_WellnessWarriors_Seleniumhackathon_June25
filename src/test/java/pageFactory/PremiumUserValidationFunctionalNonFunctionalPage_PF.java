package pageFactory;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigReader;
import utilities.DriverManager;

public class PremiumUserValidationFunctionalNonFunctionalPage_PF {

	WebDriver driver = DriverManager.getDriver();
	ConfigReader configFileReader = DriverManager.configReader();

	public PremiumUserValidationFunctionalNonFunctionalPage_PF() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[(text()= 'Pre-Meal')]")
	@CacheLookup
	WebElement preMealElement;

	@FindBy(xpath = "//span[text()= '⏰']")
	@CacheLookup
	WebElement preMealIcon;

	@FindBy(xpath = "//button[text()='Breakfast']")
	@CacheLookup
	WebElement breakFastButton;

	@FindBy(xpath = "//button[text()='Lunch']")
	@CacheLookup
	WebElement lunchButton;

	@FindBy(xpath = "//button[text()='Dinner']")
	@CacheLookup
	WebElement dinnerButton;

	@FindBy(xpath = "//button[text()='Snacks']")
	@CacheLookup
	WebElement snacksButton;

	@FindBy(xpath = "//*[(text()= 'Pre-Meal')]/parent::div/*//div")
	@CacheLookup
	WebElement preMealEntry;

	@FindBy(xpath = "//*[(text()= 'Pre-Meal')]/parent::div/*//div/span[2]")
	@CacheLookup
	WebElement preMealCalorie;

	@FindBy(xpath = "//h3[text()='Main Meal']")
	@CacheLookup
	WebElement mainMealElement;

	@FindBy(xpath = "//h3[text()='Main Meal']/../div/div")
	@CacheLookup
	WebElement mainMealEntry;

	@FindBy(xpath = "//span[text()='🍽️']")
	@CacheLookup
	WebElement mainMealIcon;

	@FindBy(xpath = "//h3[text()='Main Meal']/../div/div/span[1]")
	@CacheLookup
	WebElement mainMealTime;

	@FindBy(xpath = "//span[contains(text(),'AM')]")
	@CacheLookup
	WebElement mealMorning;

	@FindBy(xpath = "//span[contains(text(),'PM')]")
	@CacheLookup
	WebElement mealEvening;

	@FindBy(xpath = "//h3[text()='Main Meal']/../div/div/span[2]")
	@CacheLookup
	WebElement mainMealCalorie;

	@FindBy(xpath = "//button[text()='✅ Completed']")
	@CacheLookup
	WebElement completedButton;

	@FindBy(xpath = "//button[text()='⚠️ Partially Completed' ]")
	@CacheLookup
	WebElement partiallyCompletedButton;

	@FindBy(xpath = "//button[text()='❌ Not Completed' ]")
	@CacheLookup
	WebElement notCompletedButton;

	@FindBy(xpath = "//button[contains(@class, 'bg-green-500')]")
	@CacheLookup
	WebElement completedColor;

	@FindBy(xpath = "//div[contains(@class,'text-card-foreground bg-white/90 backdrop-blur-lg')]")
	@CacheLookup
	WebElement flexCard;

	@FindBy(xpath = "//h3[text()='Nutrition Insights']")
	@CacheLookup
	WebElement nutritionInsight;

	@FindBy(xpath = "//h3[text()='Calories' ]")
	@CacheLookup
	WebElement caloriesSubTitle;

	@FindBy(xpath = "//h3[text()='Calories']/../p")
	@CacheLookup
	WebElement totalCalories;

	@FindBy(xpath = "//div[@class='text-right']/div[contains(text(),'Pre-meal')]")
	@CacheLookup
	WebElement textRightPreMealCalorie;

	@FindBy(xpath = "//div[@class='text-right']/div[contains(text(),'Main meal')]")
	@CacheLookup
	WebElement textRightMainMealCalorie;

	@FindBy(xpath = "//button[text()= 'View Full Meal Plan']")
	@CacheLookup
	WebElement viewMealPlanButton;

	@FindBy(xpath = "//h1[text()= 'Full Meal Plan']")
	@CacheLookup
	WebElement mealPlanTitle;

	@FindBy(xpath = "//button[text()= 'Back to Plan']")
	@CacheLookup
	WebElement backToPlanButton;

	@FindBy(xpath = "//button[text()= 'breakfast']")
	@CacheLookup
	WebElement mealPlanBreakfastButton;

	@FindBy(xpath = "//button[text()= 'lunch']")
	@CacheLookup
	WebElement mealPlanLunchButton;

	@FindBy(xpath = "//button[text()= 'dinner']")
	@CacheLookup
	WebElement mealPlanDinnerButton;

	@FindBy(xpath = "//button[text()= 'snacks']")
	@CacheLookup
	WebElement mealPlanSnacksButton;

	@FindBy(xpath = "//*[local-name()='svg']//*[local-name()='circle']")
	@CacheLookup
	WebElement donutChart;

	@FindBy(xpath = "//div[@class='text-xs text-muted-foreground']/../div")
	@CacheLookup
	WebElement totalCaloriesDonutChart;

	@FindBy(xpath = "//span[text()='Carbs']/../span[2]")
	@CacheLookup
	WebElement barChartCarbsValue;

	@FindBy(xpath = "//span[text()='Carbs']/../../div[2]")
	@CacheLookup
	WebElement barChartVisible;

	@FindBy(xpath = "//div[contains(text(),'Carbs:')]")
	@CacheLookup
	WebElement macroCarbs;

	@FindBy(xpath = "//div[contains(text(),'Protein:')]")
	@CacheLookup
	WebElement macroProtein;

	@FindBy(xpath = "//div[contains(text(),'Fiber:')]")
	@CacheLookup
	WebElement macroFiber;

	@FindBy(xpath = "//div[contains(text(),'Fat:')]")
	@CacheLookup
	WebElement macroFat;
	
	@FindBy(xpath = "//button[contains(text(),'Login')]")
	@CacheLookup
	WebElement loginButton;
	
	@FindBy(xpath = "//input[@name='email']")
	@CacheLookup
	WebElement inputEmail;

	@FindBy(xpath = "//input[@name='password']")
	@CacheLookup
	WebElement inputPwd;
	
	@FindBy(xpath = "//button[text()='Continue with email']")
	@CacheLookup
	WebElement btnContinueEmail;
	
	@FindBy(xpath = "//button[text()='Sign in']")
	@CacheLookup
	WebElement btnSignin;
	
	public void homeScreen(String uName, String pwd) {
		loginButton.click();
		inputEmail.clear();
		inputEmail.sendKeys(uName);
		btnContinueEmail.click();
		inputPwd.clear();
		inputPwd.sendKeys(pwd);
		btnSignin.click();
	}
	
	
	private int getNumbersFromString(String string) {
		return Integer.valueOf(string.replaceAll("[^0-9]", "").trim());
	}	
	
	public int combinedMacroPercentage() {
		return getNumbersFromString(macroCarbs.getText())
				+ getNumbersFromString(macroProtein.getText()) + getNumbersFromString(macroFat.getText())
				+ getNumbersFromString(macroFiber.getText());
	}
	
	public boolean isMacroPercentageVisible() {
		return macroCarbs.isDisplayed() && macroProtein.isDisplayed() 
				&& macroFat.isDisplayed() && macroFiber.isDisplayed();
	}
	

	public boolean isDonutChartVisible() {
		return donutChart.isDisplayed();
	}

	public boolean isDonutChartTotalCaloriesVisible() {
		return totalCaloriesDonutChart.isDisplayed();
	}

	public boolean barChartHasValue() {
		return !barChartCarbsValue.getText().isEmpty();
	}

	public boolean isBarChartVisible() {
		return barChartVisible.isDisplayed();
	}

	public void isOnClickViewMealPlanButton() {
		viewMealPlanButton.click();
	}

	public boolean isMeanPlanTitleDisplayed() {
		return mealPlanTitle.isDisplayed();
	}

	public boolean isBackToPlanButtonDisplayed() {
		return backToPlanButton.isDisplayed();
	}

	public boolean isMealPlanBreakfastDisplayed() {
		return mealPlanBreakfastButton.isDisplayed();
	}

	public boolean isMealPlanLunchDisplayed() {
		return mealPlanLunchButton.isDisplayed();
	}

	public boolean isMealPlanDinnerDisplayed() {
		return mealPlanDinnerButton.isDisplayed();
	}

	public boolean isMealPlanSnacksDisplayed() {
		return mealPlanSnacksButton.isDisplayed();
	}

	public boolean isPreMealTitleDisplayed() {
		return preMealElement.isDisplayed();
	}

	public boolean isPreMealIconDisplayed() {
		return preMealIcon.isDisplayed();
	}

	public void breakFastButtonOnClick() {
		breakFastButton.click();
	}

	public void lunchButtonOnClick() {
		lunchButton.click();
	}

	public void dinnerButtonOnClick() {
		dinnerButton.click();
	}

	public void snackButtonOnClick() {
		snacksButton.click();
	}

	public String fetchPreMealEntry() {
		return preMealEntry.getText();
	}

	public int getPreMealCalorieInNumbers() {
		return Integer.parseInt(preMealCalorie.getText().replaceAll("[^0-9]", "").trim());
	}

	public boolean isMainMealDisplayed() {
		return mainMealElement.isDisplayed();
	}

	public boolean isMainMealEntryDisplayed() {
		return mainMealEntry.isDisplayed();
	}

	public boolean isMainMealIconDisplayed() {
		return mainMealIcon.isDisplayed();
	}

	public boolean isValidMainMealTimeFormat() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm a");
		try {
			LocalDate.parse(mainMealTime.getText(), formatter);
		} catch (DateTimeParseException e) {
			return false;
		}

		return true;
	}

	public boolean isMorningTime() {
		return mealMorning.isDisplayed();
	}

	public boolean isEveningTime() {
		return mealEvening.isDisplayed();
	}

	public String fetchMainMealTime() {
		return mainMealTime.getText();
	}

	public boolean mainMealCalorieDisplayed() {
		return mainMealCalorie.isDisplayed();
	}

	public int getMainMealCalorieInNumbers() {
		return Integer.parseInt(mainMealCalorie.getText().replaceAll("[^0-9]", "").trim());
	}

	public boolean isCompletedButtonDisplayed() {
		return completedButton.isDisplayed();
	}

	public boolean isPartiallyCompletedButtonDisplayed() {
		return partiallyCompletedButton.isDisplayed();
	}

	public boolean isNotCompletedButtonDiplayed() {
		return notCompletedButton.isDisplayed();
	}

	public void onClickCompletedButton() {
		completedButton.click();
	}

	public void onClickPartiallyCompletedButton() {
		partiallyCompletedButton.click();
	}

	public void onClickNotCompletedButton() {
		notCompletedButton.click();
	}

	public String fetchColorCompleteButton() {
		return completedButton.getCssValue("background-color");
	}

	public String fetchColorPartiallyCompleteButton() {
		return partiallyCompletedButton.getCssValue("background-color");
	}

	public String fetchColorNotCompleteButton() {
		return notCompletedButton.getCssValue("background-color");
	}

	public boolean isFlexCardDisplayed() {
		return this.flexCard.isDisplayed();
	}

	public boolean isNutritionInsightDisplayed() {
		return nutritionInsight.isDisplayed();
	}

	public boolean isCalorieSubTitleDisplayed() {
		return caloriesSubTitle.isDisplayed();
	}

	public int totalCaloriesInNumbers() {
		return Integer.parseInt(totalCalories.getText().replaceAll("[^0-9]", "").trim());
	}

	public int preMealCalorieInNumbers() {
		return Integer.parseInt(textRightPreMealCalorie.getText().replaceAll("[^0-9]", "").trim());
	}

	public int mainMealCalorieInNumbers() {
		return Integer.parseInt(textRightMainMealCalorie.getText().replaceAll("[^0-9]", "").trim());
	}

	public boolean isPreMealCalorieDetailDisplayed() {
		return textRightPreMealCalorie.isDisplayed();
	}

	public boolean isMainMealCalorieDetailDisplayed() {
		return textRightMainMealCalorie.isDisplayed();
	}

}
