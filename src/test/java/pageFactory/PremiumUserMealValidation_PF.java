package pageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigReader;
import utilities.DriverManager;

public class PremiumUserMealValidation_PF {

	WebDriver driver = DriverManager.getDriver();
	ConfigReader configFileReader = DriverManager.configReader();

	public PremiumUserMealValidation_PF() {
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//button[text()= 'View Full Meal Plan']")
	@CacheLookup
	WebElement viewMealPlanButton;
	

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
	

	@FindBy(xpath = "//h2[contains(text(),'Pre-meal:')]")
	@CacheLookup
	WebElement preMealTitle;

	@FindBy(xpath = "//h2[contains(text(),'Pre-meal:')]/../p")
	@CacheLookup
	WebElement preMealDesc;

	@FindBy(xpath = "//p[contains(text(),'Calories:')]")
	@CacheLookup
	WebElement preMealCalorie;

	@FindBy(xpath = "//p[contains(text(),'Time:')]")
	@CacheLookup
	WebElement preMealTime;

	@FindBy(xpath = "//p[contains(text(),'Preparation:')]")
	@CacheLookup
	WebElement preparationText;

	@FindBy(xpath = "//strong[text()='Nutrients (Pre-meal portion):']")
	@CacheLookup
	WebElement nutrientsPreMealText;

	@FindBy(xpath = "//li[contains(text(),'Carbs:')]")
	@CacheLookup
	WebElement carbsPreMealText;

	@FindBy(xpath = "//li[contains(text(),'Protein:')]")
	@CacheLookup
	WebElement proteinPreMealText;

	@FindBy(xpath = "//li[contains(text(),'Fat:')]")
	@CacheLookup
	WebElement fatPreMealText;

	@FindBy(xpath = "//li[contains(text(),'Fiber:')]")
	@CacheLookup
	WebElement fiberPreMealText;

	@FindBy(xpath = "//h2[contains(text(),'Main:')]")
	@CacheLookup
	WebElement mainMealTitle;

	@FindBy(xpath = "//h2[contains(text(),'Main:')]/../p")
	@CacheLookup
	WebElement mainMealDesc;

	@FindBy(xpath = "//h3[text()= 'Preparation']")
	@CacheLookup
	WebElement mainMealPreparationText;

	@FindBy(xpath = "//h3[text()='Nutrition Information']")
	@CacheLookup
	WebElement nutritionInfoText;

	@FindBy(xpath = "//*[text()='Calories']/../p[2]")
	@CacheLookup
	WebElement totalCalories;

	@FindBy(xpath = "//p[text()='Carbs']")
	@CacheLookup
	WebElement mealPlanCarbs;

	@FindBy(xpath = "//p[text()='Protein']")
	@CacheLookup
	WebElement mealPlanProtein;

	@FindBy(xpath = "//p[text()='Fat']")
	@CacheLookup
	WebElement mealPlanFat;

	@FindBy(xpath = "//p[text()='Fiber']")
	@CacheLookup
	WebElement mealPlanFiber;

	@FindBy(xpath = "//p[text()='Carbs' ]/../p[2]")
	@CacheLookup
	WebElement mealPlanCarbsValue;

	@FindBy(xpath = "//p[text()='Protein' ]/../p[2]")
	@CacheLookup
	WebElement mealPlanProteinValue;

	@FindBy(xpath = "//p[text()='Fat' ]/../p[2]")
	@CacheLookup
	WebElement mealPlanFatValue;

	@FindBy(xpath = "//p[text()='Fiber' ]/../p[2]")
	@CacheLookup
	WebElement mealPlanFiberValue;

	@FindBy(xpath = "//*[text()= 'Ingredients: ']")
	@CacheLookup
	WebElement ingredientsList;

	@FindBy(xpath = "//*[text()= 'Diabetes Management Tips']")
	@CacheLookup
	WebElement diabetesManagement;

	@FindBy(xpath = "//*[text()= 'Diabetes Management Tips']/../p")
	@CacheLookup
	WebElement tipsText;

	@FindBy(xpath = "//*[text()= 'Glycemic Impact:']")
	@CacheLookup
	WebElement glycemicImpactText;

	@FindBy(xpath = "//*[text()= 'SweetBalance ']")
	@CacheLookup
	WebElement homePageScreen;
	
	@FindBy(xpath = "//button[text()= 'Back to Plan']")
	@CacheLookup
	WebElement backToPlanButton;
	
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
	
	
	public void isOnClickBackToPlan() {
		backToPlanButton.click();
	}
	
	public void isOnClickViewMealPlanButton() {
		viewMealPlanButton.click();
	}

	public boolean isHomeScreen() {
		return homePageScreen.isDisplayed();
	}

	public boolean isGlycemicImpactText() {
		return glycemicImpactText.isDisplayed();
	}

	public boolean isGlycemicImpactValueDisplayed() {
		return !getGlycemicImpactValue().isEmpty();
	}
	
	private String getGlycemicImpactValue() {
		return glycemicImpactText.getText().replaceAll("Glycemic Impact:", "").trim();
	}
	
	public boolean isValidGlycemicImpactValue() {
		return List.of("low", "medium", "high").contains(getGlycemicImpactValue());
	}
	
	

	public boolean preMealTitleDisplayed() {
		return preMealTitle.isDisplayed();
	}

	public boolean preMealDescDisplayed() {
		return preMealDesc.isDisplayed();
	}

	public boolean preMealCalorieDisplayed() {
		return preMealCalorie.isDisplayed();
	}

	public boolean preparationTextDisplayed() {
		return preparationText.isDisplayed();
	}

	public boolean nutrientsPreMealTextDisplayed() {
		return nutrientsPreMealText.isDisplayed();
	}

	public boolean carbsPreMealTextDisplayed() {
		return carbsPreMealText.isDisplayed();
	}

	public boolean proteinPreMealTexttDisplayed() {
		return proteinPreMealText.isDisplayed();
	}

	public boolean fatPreMealTextDisplayed() {
		return fatPreMealText.isDisplayed();
	}

	public boolean fiberPreMealTextDisplayed() {
		return fiberPreMealText.isDisplayed();
	}

	public boolean carbsPreMealValueDisplayed() {
		return !carbsPreMealText.getText().replaceAll("Carbs:", "").trim().isEmpty();
	}

	public boolean verifyPreMealTime(String time) {
		return time.equalsIgnoreCase(preMealTime.getText().trim());
	}

	public boolean mainMealTitleDisplayed() {
		return mainMealTitle.isDisplayed();
	}

	public boolean mainMealDescDisplayed() {
		return mainMealDesc.isDisplayed();
	}

	public boolean mainMealPreparationTextDisplayed() {
		return mainMealPreparationText.isDisplayed();
	}

	public boolean nutritionInfoTextDisplayed() {
		return nutritionInfoText.isDisplayed();
	}

	public boolean totalCaloriesDisplayed() {
		return totalCalories.isDisplayed();
	}

	public boolean mealPlanNutritionsDisplayed() {
		return mealPlanCarbs.isDisplayed() && mealPlanProtein.isDisplayed() && mealPlanFat.isDisplayed()
				&& mealPlanFiber.isDisplayed();
	}

	public boolean mealPlanNutritionsValueDisplayed() {
		return mealPlanCarbsValue.isDisplayed() && mealPlanProteinValue.isDisplayed() && mealPlanFatValue.isDisplayed()
				&& mealPlanFiberValue.isDisplayed();
	}

	public boolean ingredientsListDisplayed() {
		return ingredientsList.isDisplayed();
	}

	public boolean diabetesManagementDisplayed() {
		return diabetesManagement.isDisplayed();
	}

	public boolean diabetesTipsDisplayed() {
		return tipsText.isDisplayed();
	}
	
	public void breakFastButtonOnClick() {
		mealPlanBreakfastButton.click();
	}
	
	public void lunchButtonOnClick() {
		mealPlanLunchButton.click();
	}
	
	public void dinnerButtonOnClick() {
		mealPlanDinnerButton.click();
	}
	
	public void snackButtonOnClick() {
		mealPlanSnacksButton.click();
	}
}
