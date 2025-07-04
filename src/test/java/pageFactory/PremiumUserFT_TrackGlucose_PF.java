package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigReader;
import utilities.DriverManager;

public class PremiumUserFT_TrackGlucose_PF {
	
	WebDriver driver = DriverManager.getDriver();
	ConfigReader configFileReader = DriverManager.configReader();

	public PremiumUserFT_TrackGlucose_PF() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[contains(text(),'Login')]")
	WebElement loginButton;
	
	@FindBy(xpath = "//input[@name='email']")
	WebElement inputEmail;

	@FindBy(xpath = "//input[@name='password']")
	WebElement inputPwd;
	
	@FindBy(xpath = "//button[text()='Continue with email']")
	WebElement btnContinueEmail;
	
	@FindBy(xpath = "//button[text()='Sign in']")
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
	WebElement bloodGlucoseButton;
	
	public void onClickbloodGlucoseButton() {
	  bloodGlucoseButton.click();
	}
	
	@FindBy(xpath = "//h1[text()= 'Track Glucose']")
	WebElement bloodGlucoseTitle;
	
	@FindBy(xpath = "//p[text()= 'Keep your health in check']")
	WebElement subText;
	
	public boolean subTextDisplayed() {
		return subText.isDisplayed();
	}
	
	@FindBy(xpath = "//*[text()='Blood Glucose Level']")
	WebElement bgLevel;
	
	public boolean bgLevelDisplayed() {
		return bgLevel.isDisplayed();
	}
	
	@FindBy(xpath = "//*[text()='Reading Type']")
	WebElement readingType;
	
	public boolean readingTypeDisplayed() {
		return readingType.isDisplayed();
	}
	
	@FindBy(xpath = "//*[text()='Date']")
	WebElement date;
	
	public boolean dateDisplayed() {
		return date.isDisplayed();
	}
	
	@FindBy(xpath = "//div[@id= ':rn:-form-item']")
	WebElement inputField;
	
	public boolean inputFieldDisplayed() {
		return inputField.isDisplayed();
	}
	
	@FindBy(xpath = "//input[@placeholder= 'Enter blood glucose level']")
	WebElement placeholder;
	
	public void placeholderSend(String value) {
		placeholder.sendKeys(value);
	}
	
	public boolean placeHolderValueBlank() {
		return placeholder.getText().isBlank();
	}
	
	@FindBy(xpath = "//span[text()='mg/dL']")
	WebElement inputFieldText;
	
	public boolean inputFieldTextDisplayed() {
		return inputFieldText.isDisplayed();
	}
	
	@FindBy(xpath = "//div[text()='Low']")
	WebElement transitionFieldLow;
	
	public boolean transitionFieldLowDisplayed() {
		return transitionFieldLow.isDisplayed();
	}
	
	@FindBy(xpath = "//div[contains(@class, 'bg-green') and text()='Normal']")
	WebElement transitionFieldNormal;
	
	public boolean transitionFieldNormalDisplayed() {
		return transitionFieldNormal.isDisplayed();
	}
	
	@FindBy(xpath = "//div[text()='High']")
	WebElement transitionFieldHigh;
	
	public boolean transitionFieldHighDisplayed() {
		return transitionFieldHigh.isDisplayed();
	}
	
	@FindBy(xpath = "//button[text()='Fasting']")
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
	WebElement datePicker;
	
	
	@FindBy(xpath = "//div[contains(@id,'react-day-picker')]")
	WebElement calendar;
	
	
	@FindBy(xpath = "//*[@class= 'lucide lucide-chevron-left h-4 w-4']")
	WebElement previousButton;
	
	@FindBy(xpath = "//*[@class= 'lucide lucide-chevron-right h-4 w-4']")
	WebElement nextButton;
	
	public boolean previousButtonDisplayed() {
		return previousButton.isDisplayed();
	}
	
	public boolean nextButtonDisplayed() {
		return nextButton.isDisplayed();
	}
	
	public boolean calendarDisplayed() {
		return calendar.isDisplayed();
	}
	
	public void datePickerClick() {
		Actions actions = new Actions(driver);
		actions.moveToElement(datePicker).click().build().perform();
	}
	
	public boolean datePickerDisplayed() {
		return datePicker.isDisplayed();
	}
	
	@FindBy(xpath = "//div[text()='Last reading:']")
	WebElement lastReading;
	
	public boolean lastReadingDisplayed() {
		return lastReading.isDisplayed();
	}
	
	@FindBy(xpath = "//button [text()='Record Reading']")
	WebElement recordReadingButton;
	
	public void recordReadingButtonClick() {
		recordReadingButton.click();
	}
	
	public boolean bloodGlucoseTitle() {
		return bloodGlucoseTitle.isDisplayed();
	}
		
}
