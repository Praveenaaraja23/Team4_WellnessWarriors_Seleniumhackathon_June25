package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigReader;
import utilities.DriverManager;

public class PremiumUserChallengeButton_PF {
	
	WebDriver driver = DriverManager.getDriver();
	ConfigReader configFileReader = DriverManager.configReader();

	public PremiumUserChallengeButton_PF() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[contains(@class,'animate-pulse')]")
	@CacheLookup
	WebElement challengeButton;
	
	
	@FindBy(xpath = "//h2[text ()= 'Choose Your Challenge']")
	@CacheLookup
	WebElement challengeTitle;
	
	@FindBy(xpath = "//p[text()= 'Select a program that best fits your health goals']")
	@CacheLookup
	WebElement subText;

	@FindBy(xpath = "//span[text()='10-Day Challenge']")
	@CacheLookup
	WebElement tenDayChallenge;
	
	@FindBy(xpath = "//span[text()='4-Week Program']")
	@CacheLookup
	WebElement fourWeekProgram;
	
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
	
	public void onClickchallengeButton() {
		challengeButton.click();
	}
	
	public boolean challengeTitleDisplayed() {
		return challengeTitle.isDisplayed();
	}
	
	public boolean subTextDisplayed() {
		return subText.isDisplayed();
	}
	
	public boolean tenDayChallengeDisplayed() {
		return tenDayChallenge.isDisplayed();
	}
	
	public boolean fourWeekProgramDisplayed() {
		return fourWeekProgram.isDisplayed();
	}

}
