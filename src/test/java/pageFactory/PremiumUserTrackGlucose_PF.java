package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigReader;
import utilities.DriverManager;

public class PremiumUserTrackGlucose_PF {
	
	WebDriver driver = DriverManager.getDriver();
	ConfigReader configFileReader = DriverManager.configReader();

	public PremiumUserTrackGlucose_PF() {
		PageFactory.initElements(driver, this);
	}
	
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
	
	
	
	@FindBy(xpath = "//span[text()= 'Blood Glucose']")
	@CacheLookup
	WebElement bloodGlucoseButton;
	
	public boolean onClickbloodGlucoseButton() {
		return bloodGlucoseButton.isDisplayed();
	}
	
	@FindBy(xpath = "//h1[text()= 'Track Glucose']")
	@CacheLookup
	WebElement bloodGlucoseTitle;
	
	@FindBy(xpath = "//p[text()= 'Keep your health in check']")
	@CacheLookup
	WebElement subText;
	
	public boolean subTextDisplayed() {
		return subText.isDisplayed();
	}
	
	@FindBy(xpath = "//*[text()='Blood Glucose Level']")
	@CacheLookup
	WebElement bgLevel;
	
	public boolean bgLevelDisplayed() {
		return bgLevel.isDisplayed();
	}
	
	@FindBy(xpath = "//*[text()='Reading Type']")
	@CacheLookup
	WebElement readingType;
	
	public boolean readingTypeDisplayed() {
		return readingType.isDisplayed();
	}
	
	@FindBy(xpath = "//*[text()='Date']")
	@CacheLookup
	WebElement date;
	
	public boolean dateDisplayed() {
		return date.isDisplayed();
	}
	
	@FindBy(xpath = "//div[@id= ':rn:-form-item']")
	@CacheLookup
	WebElement inputField;
	
	public boolean inputFieldDisplayed() {
		return inputField.isDisplayed();
	}
	
	@FindBy(xpath = "//input[@placeholder= 'Enter blood glucose level']")
	@CacheLookup
	WebElement placeholder;
	
	public boolean placeholderDisplayed() {
		return placeholder.isDisplayed();
	}
	
	@FindBy(xpath = "//span[text()='mg/dL']")
	@CacheLookup
	WebElement inputFieldText;
	
	public boolean inputFieldTextDisplayed() {
		return inputFieldText.isDisplayed();
	}
	
	@FindBy(xpath = "//div[text()='Low']")
	@CacheLookup
	WebElement transitionFieldLow;
	
	public boolean transitionFieldLowDisplayed() {
		return transitionFieldLow.isDisplayed();
	}
	
	@FindBy(xpath = "//div[text()='Normal']")
	@CacheLookup
	WebElement transitionFieldNormal;
	
	public boolean transitionFieldNormalDisplayed() {
		return transitionFieldNormal.isDisplayed();
	}
	
	@FindBy(xpath = "//div[text()='High']")
	@CacheLookup
	WebElement transitionFieldHigh;
	
	public boolean transitionFieldHighDisplayed() {
		return transitionFieldHigh.isDisplayed();
	}
	
	@FindBy(xpath = "//button[text()='Fasting']")
	@CacheLookup
	WebElement fastingButton;
	
	public boolean fastingButtonDisplayed() {
		return fastingButton.isDisplayed();
	}
	
	@FindBy(xpath = "//button[text()='Pre-meal']")
	@CacheLookup
	WebElement preMealButton;
	
	public boolean preMealButtonDisplayed() {
		return preMealButton.isDisplayed();
	}
	
	@FindBy(xpath = "//button[text()='Post-meal']")
	@CacheLookup
	WebElement postMealButton;
	
	public boolean postMealButtonDisplayed() {
		return postMealButton.isDisplayed();
	}
	
	@FindBy(xpath = "//button[text()='Bedtime']")
	@CacheLookup
	WebElement bedTimeButton;
	
	public boolean bedTimeButtonDisplayed() {
		return bedTimeButton.isDisplayed();
	}
	
	@FindBy(xpath = "//*[@class= 'lucide lucide-calendar mr-2 h-4 w-4' ]")
	@CacheLookup
	WebElement datePicker;
	
	public boolean datePickerDisplayed() {
		return datePicker.isDisplayed();
	}
	
	@FindBy(xpath = "//div[text()='Last reading:']")
	@CacheLookup
	WebElement lastReading;
	
	public boolean lastReadingDisplayed() {
		return lastReading.isDisplayed();
	}
	
	@FindBy(xpath = "//button [text()='Record Reading']")
	@CacheLookup
	WebElement recordReadingButton;
	
	public boolean recordReadingButtonDisplayed() {
		return recordReadingButton.isDisplayed();
	}
	
	public boolean bloodGlucoseTitle() {
		return bloodGlucoseTitle.isDisplayed();
	}
		
}
