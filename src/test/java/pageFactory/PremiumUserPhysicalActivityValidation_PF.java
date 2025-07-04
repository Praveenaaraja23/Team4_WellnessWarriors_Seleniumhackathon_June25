package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigReader;
import utilities.DriverManager;

public class PremiumUserPhysicalActivityValidation_PF {
	
	WebDriver driver = DriverManager.getDriver();
	ConfigReader configFileReader = DriverManager.configReader();

	public PremiumUserPhysicalActivityValidation_PF() {
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
	@FindBy(xpath = "//span[text()= 'Physical Activity']/..")WebElement physicalActivityButton;
	@FindBy(xpath = "//h1[text()= 'Physical Activity']") WebElement paTitle;
	@FindBy(xpath = "//p[text()='Track your fitness journey']") WebElement subText;
	@FindBy(xpath = "//*[text()='Activity Type']") WebElement activityType;
	@FindBy(xpath = "//*[text()='Duration']") WebElement duration;
	@FindBy(xpath = "//*[text()='Date']") WebElement date;
	@FindBy(xpath = "//*[text()='Intensity']") WebElement intensity;
	@FindBy(xpath = "//select[@id='activityType']") WebElement activityTypeDropdown;
	@FindBy(xpath = "//option[text()='Walking']") WebElement walkingOption;
	@FindBy(xpath = "//option[text()='Running']") WebElement runningOption;
	@FindBy(xpath = "//option[text()='Cycling']") WebElement cyclingOption;
	@FindBy(xpath = "//option[text()='Swimming']") WebElement swimingOption;
	@FindBy(xpath = "//option[text()='Weight Training']") WebElement weightTrainingOption;
	@FindBy(xpath = "//option[text()='Yoga']") WebElement yogaOption;
	@FindBy(xpath = "//input[@id='duration']") WebElement presenceInput;
	@FindBy(xpath = "//input[@placeholder='30']") WebElement placeholderText;
	@FindBy(xpath = "//option[text()='minutes']") WebElement durationMin;
	@FindBy(xpath = "//option[text()='hours']") WebElement durationHr;
	@FindBy(xpath = "//*[@class='lucide lucide-calendar mr-2 h-4 w-4']") WebElement datePicker;
	@FindBy(xpath = "//*[text()='Intensity']") WebElement presenceIntensity;
	@FindBy(xpath = "//button[text()='Light']") WebElement lightIntensity;
	@FindBy(xpath = "//button[text()='Moderate']") WebElement moderateIntensity;
	@FindBy(xpath = "//button[text()='Vigorous']") WebElement vigorousIntensity;
	@FindBy(xpath = "//*[text()='Save Activity']") WebElement saveActivity;
	
	
	public void physicalActivityClick() { physicalActivityButton.click(); }
	
	public boolean activityTypeDisplayed() { return activityType.isDisplayed(); } 
	
	public boolean durationDisplayed() { return duration.isDisplayed(); } 
	
	public boolean dateDisplayed() { return date.isDisplayed(); }
	
	public boolean intensityDisplayed() { return intensity.isDisplayed(); } 
	
	public boolean activityTypeDropdownDisplayed() { return activityTypeDropdown.isDisplayed(); } 
	
	public boolean durationMinDisplayed() { return durationMin.isDisplayed(); }
	
	public boolean paTitleDisplayed() { return paTitle.isDisplayed(); }
	
	public boolean presenceInputDisplayed() { return presenceInput.isDisplayed(); }
	
	public boolean subTextDisplayed() { return subText.isDisplayed(); }
	
	public boolean placeholderTextDisplayed() { return placeholderText.isDisplayed(); }
	
	public boolean presenceIntensityDisplayed() { return presenceIntensity.isDisplayed(); }
	
	public boolean saveActivityDisplayed() { return saveActivity.isDisplayed(); }
	
	public boolean datePickerDisplayed() { return datePicker.isDisplayed(); }
	
	
	
	

	

	

}
