package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigReader;
import utilities.DriverManager;

public class PremiumUserHomeButtonNavigation_PF {
	
	WebDriver driver = DriverManager.getDriver();
	ConfigReader configFileReader = DriverManager.configReader();

	public PremiumUserHomeButtonNavigation_PF() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//span[text()='Blood Glucose']")
	@CacheLookup
	WebElement bloodGlucoseButton;
	
	
	@FindBy(xpath = "//*[text()='Track Glucose']")
	@CacheLookup
	WebElement bloodGlucoseScreen;
	
	@FindBy(xpath = "//span[text()='Physical Activity']")
	@CacheLookup
	WebElement physicalActivityButton;
	
	@FindBy(xpath = "//*[text()='Physical Activity']")
	@CacheLookup
	WebElement physicalActivityScreen;
	
	@FindBy(xpath = "//span[text()='Food Intake']")
	@CacheLookup
	WebElement foodIntakeButton;
	
	@FindBy(xpath = "//*[text()='Food Intake Tracker']")
	@CacheLookup
	WebElement foodIntakeScreen;
	
	@FindBy(xpath = "//span[text()='Medication']")
	@CacheLookup
	WebElement medicationButton;
	
	@FindBy(xpath = "//h1[text()='Diabetes Medication Tracker']")
	@CacheLookup
	WebElement medicationScreen;
	
	@FindBy(xpath = "//button[text()='Log']")
	@CacheLookup
	WebElement logButton;
	
	@FindBy(xpath = "//h3[text()='Welcome Back,' and 'Team4selenium']")
	@CacheLookup
	WebElement logScreen;
	
	@FindBy(xpath = "//button[contains(text(),'Login')]")
	@CacheLookup
	WebElement loginButton;
	
	
	@FindBy(xpath = "//button[text()='Home']")
	@CacheLookup
	WebElement homeButton;
	
	@FindBy(xpath = "//div[text()= 'Mood: Happy']")
	@CacheLookup
	WebElement moodText;
	
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
	
	public void onClickbloodGlucoseButton() {
		bloodGlucoseButton.click();
	}
	
	public boolean bloodGlucoseScreenDisplayed() {
		return bloodGlucoseScreen.isDisplayed();
	}
	
	public void onClickphysicalActivityButton() {
		physicalActivityButton.click();
	}
	
	public boolean physicalActivityScreenDisplayed() {
		return physicalActivityScreen.isDisplayed();
	}
	
	
	public void onClickfoodIntakeButton() {
		foodIntakeButton.click();
	}
	
	public boolean foodIntakeScreenDisplayed() {
		return foodIntakeScreen.isDisplayed();
	}
	
	public void onClickmedicationButton() {
		medicationButton.click();
	}
	
	public boolean medicationScreenDisplayed() {
		return medicationScreen.isDisplayed();
	}
	
	public void onClicklogButton() {
		logButton.click();
	}
	
	public boolean logScreenDisplayed() {
		return logScreen.isDisplayed();
	}
	
	public void onClickhomeButton() {
		homeButton.click();
	}
	
	public boolean moodTextDisplayed() {
		return moodText.isDisplayed();
	}

}
