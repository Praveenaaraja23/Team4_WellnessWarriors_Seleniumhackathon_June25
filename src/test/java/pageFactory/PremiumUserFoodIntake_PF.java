package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigReader;
import utilities.DriverManager;

public class PremiumUserFoodIntake_PF {
	
	WebDriver driver = DriverManager.getDriver();
	ConfigReader configFileReader = DriverManager.configReader();

	public PremiumUserFoodIntake_PF() {
		PageFactory.initElements(driver, this);
	}
	
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
	
	@FindBy(xpath = "//button[contains(text(),'Login')]")
	@CacheLookup
	WebElement loginButton;
	
	public void initiazeHomeScreen(String uName, String pwd) {
		loginButton.click();
		inputEmail.clear();
		inputEmail.sendKeys(uName);
		btnContinueEmail.click();
		inputPwd.clear();
		inputPwd.sendKeys(pwd);
		btnSignin.click();
	}
	
	
	@FindBy(xpath = "//span[text()= 'Food Intake']")WebElement fiButton;
	@FindBy(xpath = "//h1[text()='Food Intake Tracker']") WebElement fiTitle;
	@FindBy(xpath = "//p[text()='Track what you eat to manage your diabetes better']") WebElement subText;
	@FindBy(xpath = "//*[text()='Food Name']/ancestor::div//button[text()='Breakfast']") WebElement breakfastButton;
	@FindBy(xpath = "//*[text()='Food Name']/ancestor::div//button[text()='Lunch']") WebElement lunchButton;
	@FindBy(xpath = "//*[text()='Food Name']/ancestor::div//button[text()='Dinner']") WebElement dinnerButton;
	@FindBy(xpath = "//*[text()='Food Name']/ancestor::div//button[text()='Snack']") WebElement snackButton;
	@FindBy(xpath = "//*[text()='Food Name']") WebElement foodName;
	@FindBy(xpath = "//*[text()='Serving Size']") WebElement servingSize;
	@FindBy(xpath = "//*[text()='Date']") WebElement date;
	@FindBy(xpath = "//button[contains(@class, 'bg-gradient-to-r') and text()='Breakfast']") WebElement breakfastButtonDefault;
	@FindBy(xpath = "//input[@id='foodName']") WebElement inputFood;
	@FindBy(xpath = "//input[@placeholder='e.g., Grilled Chicken Salad']") WebElement placeHolderFood;
	@FindBy(xpath = "//select[@id='servingSize']") WebElement servingSizeDropDown;
	@FindBy(xpath = "//*[@class='lucide lucide-calculator h-5 w-5']") WebElement calculatorIcon;
	@FindBy(xpath = "//input[@id='calories']") WebElement calorieInput;
	@FindBy(xpath = "//*[@placeholder='e.g., 250']") WebElement caloriePlaceHolder;
	@FindBy(xpath = "//p[contains(text(),'Enter calories or click the calculator icon')]") WebElement calorieHelperText;
	@FindBy(xpath = "//input[@placeholder='30']") WebElement placeholderText;
	@FindBy(xpath = "//*[@class= 'lucide lucide-calendar mr-2 h-4 w-4']") WebElement datePicker;
	@FindBy(xpath = "//*[@id= 'notes']") WebElement notes;
	@FindBy(xpath = "//span[text()='Save Food Entry']") WebElement saveFoodButton;
	
	
	public void fiButtonClick() { fiButton.click(); }
	
	public boolean fiTitleDisplayed() { return fiTitle.isDisplayed(); } 
	
	public boolean breakfastButtonDisplayed() { return breakfastButton.isDisplayed(); } 
	public boolean lunchButtonDisplayed() { return lunchButton.isDisplayed(); } 
	public boolean dinnerButtonDisplayed() { return dinnerButton.isDisplayed(); } 
	public boolean snackButtonDisplayed() { return snackButton.isDisplayed(); } 
	
	public boolean dateDisplayed() { return date.isDisplayed(); }
	
	public boolean foodNameDisplayed() { return foodName.isDisplayed(); } 
	
	public boolean aservingSizeDisplayed() { return servingSize.isDisplayed(); } 
	
	public boolean breakfastButtonDefaultDisplayed() { return breakfastButtonDefault.isDisplayed(); }
	
	public boolean subTextDisplayed() { return subText.isDisplayed(); }
	
	public boolean inputFoodDisplayed() { return inputFood.isDisplayed(); }
	
	public boolean placeHolderFoodDisplayed() { return placeHolderFood.isDisplayed(); }
	
	public boolean servingSizeDropDownDisplayed() { return servingSizeDropDown.isDisplayed(); }
	
	public boolean datePickerDisplayed() { return datePicker.isDisplayed(); }
	
	public boolean calculatorIconDisplayed() { return calculatorIcon.isDisplayed(); }
	
	public boolean notesDisplayed() { return notes.isDisplayed(); }
	
	public boolean calorieInputDisplayed() { return calorieInput.isDisplayed(); }
	
	public boolean caloriePlaceHolderDisplayed() { return caloriePlaceHolder.isDisplayed(); }
	
	public boolean calorieHelperTextDisplayed() { return calorieHelperText.isDisplayed(); }
	
	public boolean saveFoodButtonDisplayed() { return saveFoodButton.isDisplayed(); }


}
