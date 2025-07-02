package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigReader;
import utilities.DriverManager;

public class PremiumUserHomePage_pf {

	WebDriver driver = DriverManager.getDriver();
	ConfigReader configFileReader = DriverManager.configReader();

	public PremiumUserHomePage_pf() {
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
	
	
	@FindBy(xpath = "//button[contains(@class,'animate-pulse')]")
	@CacheLookup
	WebElement flashingButton;
	
	@FindBy(xpath = "//div[@class='flex space-x-8']")
	@CacheLookup
	WebElement navigationDiv;
	
	@FindBy(xpath = "//button[contains(@class,'duration-200')]")
	@CacheLookup
	WebElement flashesTwoSec;
	
	@FindBy(xpath = "//button[text()='🎯 Challenge Yourself Today!']")
	@CacheLookup
	WebElement challengeButton;
	
	@FindBy(xpath = "//img[contains(@alt,'Female')]")
	@CacheLookup
	WebElement genderImage;
	
	@FindBy(xpath = "//*[text()='😊']")
	@CacheLookup
	WebElement emojiImage;
	
	@FindBy(xpath = "//button[text()='Log']")
	@CacheLookup
	WebElement logButton;
	
	@FindBy(xpath = "//*[contains(text(),'Mood:')]")
	@CacheLookup
	WebElement moodLabel;
	
	@FindBy(xpath = "//*[(text()= 'Mood: Good')]")
	@CacheLookup
	WebElement moodText;
	
	@FindBy(xpath = "//button[text()='Weekly Plan']")
	@CacheLookup
	WebElement weeklyPlanButton;
	
	@FindBy(xpath = "//*[(text()= 'Record New Data')]")
	@CacheLookup
	WebElement recordNewData;
	

	@FindBy(xpath = "//div[@class='grid grid-cols-2 md:grid-cols-4 gap-4']")
	@CacheLookup
	WebElement fourButtonOption;
	

	@FindBy(xpath = "//span[text()= 'Blood Glucose']")
	@CacheLookup
	WebElement bloodGlucoseButton;
	

	@FindBy(xpath = "//span[text()= 'Physical Activity']")
	@CacheLookup
	WebElement physicalActivityButton;
	
	@FindBy(xpath = "//span[text()= 'Food Intake']")
	@CacheLookup
	WebElement foodIntakeButton;
	
	@FindBy(xpath = "//span[text()= 'Medication']")
	@CacheLookup
	WebElement medicationButton;
	
	
	@FindBy(xpath = "//*[@class='lucide lucide-activity h-6 w-6 mb-2 text-violet-600']")
	@CacheLookup
	WebElement bloodGlucoseIcon;
	
	@FindBy(xpath = "//*[@class='h-6 w-6 mb-2 text-violet-600']")
	@CacheLookup
	WebElement physicalActivityIcon;
	
	@FindBy(xpath = "//*[@class='lucide lucide-pizza h-6 w-6 mb-2 text-fuchsia-600']")
	@CacheLookup
	WebElement foodIntakeIcon;
	
	@FindBy(xpath = "//*[@class='lucide lucide-pill h-6 w-6 mb-2 text-violet-600']")
	@CacheLookup
	WebElement medicationIcon;
	

	public void setUserName(String uName) {
		inputEmail.clear();
		inputEmail.sendKeys(uName);
	}

	public void initiazeHomeScreen() {
		driver.get("https://sweet-balance-test-env-3-numpyninjadiabe.replit.app/auth");
		setUserName("team4selenium@gmail.com");
		btnContinueEmail.click();
	}
	
	public void signIn() {
		inputPwd.clear();
		inputPwd.sendKeys("phase2selenium");
		btnSignin.click();
	}
	
	public boolean isNavigationBarDisplayed() {
		return navigationDiv.isDisplayed();
	}
	
	public boolean isFlashingButtonDisplayed() {
		return flashingButton.isDisplayed();
	}
	
	public boolean isTwoSecFlashing() {
		return flashesTwoSec.isDisplayed();
	}
	
	public boolean ischallengeButtonDisplayed() {
		return challengeButton.isDisplayed();
	}
	
	public boolean isGenderImageDisplayed() {
		return genderImage.isDisplayed();
	}
	
	public boolean isEmojiImageDisplayed() {
		return emojiImage.isDisplayed();
	}
	
	public boolean isLogButtonDisplayed() {
		return logButton.isDisplayed();
	}
	
	public boolean isMoodLabelDisplayed() {
		return moodLabel.isDisplayed();
	}
	
	public boolean isMoodTextDisplayed() {
		return moodText.isDisplayed();
	}
	
	public boolean isWeeklyPlanButtonDisplayed() {
		return weeklyPlanButton.isDisplayed();
	}
	
	public boolean isRecordNewDataDisplayed() {
		return recordNewData.isDisplayed();
	}
	
	public boolean isFourButtonOptionDisplayed() {
		return fourButtonOption.isDisplayed();
	}
	
	public boolean isBloodGlucoseButtonDisplayed() {
		return bloodGlucoseButton.isDisplayed();
	}
	
	public boolean isPhysicalActivityButtonDisplayed() {
		return physicalActivityButton.isDisplayed();
	}
	
	public boolean isFoodIntakeButtonDisplayed() {
		return foodIntakeButton.isDisplayed();
	}
	
	public boolean isMedicationButtonDisplayed() {
		return medicationButton.isDisplayed();
	}

	public boolean isBloodGlucoseIconDisplayed() {
		return bloodGlucoseIcon.isDisplayed();
	}
	
	public boolean isPhysicalActivityIconDisplayed() {
		return physicalActivityIcon.isDisplayed();
	}
	
	public boolean isFoodIntakeIconDisplayed() {
		return foodIntakeIcon.isDisplayed();
	}
	
	public boolean isMedicationIconDisplayed() {
		return medicationIcon.isDisplayed();
	}
}
