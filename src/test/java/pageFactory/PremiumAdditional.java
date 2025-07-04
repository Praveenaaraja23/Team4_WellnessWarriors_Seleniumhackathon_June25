package pageFactory;

import java.text.SimpleDateFormat;

import org.apache.logging.log4j.core.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import freemarker.core.ParseException;
import io.cucumber.java.en.Then;
import utilities.ConfigReader;
import utilities.DriverManager;

public class PremiumAdditional {
	
	WebDriver driver = DriverManager.getDriver();
	ConfigReader configFileReader = DriverManager.configReader();
	
	
	public PremiumAdditional() {
		PageFactory.initElements(driver, this);

	}
	
	// login page information with password and pop button
	@FindBy(xpath = "//input[@name='email']")
	WebElement inputEmail;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement inputpwd;
	
	
	@FindBy(xpath = "//button[text()='Continue with email']")
    WebElement btnContinueEmail;
	
	
	@FindBy(xpath = "//button[text()='Sign in']")
	WebElement btnSignin;
	
	
	@FindBy(xpath = "//button[contains(@class,'animate-pulse')]")
    WebElement flashingButton;
	
	@FindBy(xpath = "//div[@class='flex space-x-8']")
	WebElement navigationDiv;
	
	
	@FindBy(xpath = "//h2[normalize-space()='Blood Glucose Tracker']")
	WebElement backdrop ;
		
	
	@FindBy(xpath = "//button[text()='🎯 Challenge Yourself Today!']")
	WebElement challengeButton;
	
	
	
	@FindBy(xpath =" //h2[normalize-space()='Meal & Nutrition']")
	WebElement mealbutton;
			
	@FindBy(xpath ="//div[@class='bg-white rounded-lg p-4 h-//div[@class='recharts-wrapper']//*[name()='svg']")
	WebElement rechartbutton;
			
	

	@FindBy(xpath =" //div[normalize-space()='Fasting']")
	WebElement Fastingbtn;
			


	@FindBy(xpath =" //div[normalize-space()='Pre-Meal']")
	WebElement PreMealbtn;
			

	

	@FindBy(xpath =" //div[normalize-space()='Post-Meal']]")
	WebElement PostMeabltn;
			
	

	@FindBy(xpath =" 	//div[normalize-space()='Bedtime']]")
	WebElement Bedtimebtn;
			
	

	@FindBy(xpath =" //h3[normalize-space()='Daily Nutrition Breakdown']]")
	WebElement DailyNutribtn;
	
	

	
	

	@FindBy(xpath =" //body/div[@id='root']/div[@class='bg-gradient-to-r from-violet-200 to-fuchsia-200 backdrop-blur-lg container mx-auto px-4 py-8']/div[1]/div[1]]")
	WebElement backdropNutribtn;
	
	


	@FindBy(xpath ="//span[@class='font-medium'][normalize-space()='Protein']\r\n']]")
	WebElement proteinbtn;
	
	
	
	
	

	@FindBy(xpath ="//h2[normalize-space()='Physical Activity']]")
	WebElement physicalfont;
	
	
	
	

	@FindBy(xpath ="//div[normalize-space()='Total Calories']]")
	WebElement TotalCaloriest;
	public Object flashesTwoSec;
	
	
	
	
	
	
	
	//div[normalize-space()='Total Calories']
	
	
	
	
	public void setUserName(String uName) {
		inputEmail.clear();
		inputEmail.sendKeys(uName);
	}

	public void initiazeHomeScreen() {
		driver.get("https://sweet-balance-test-env-3-numpyninjadiabe.replit.app/auth");
		setUserName("team4selenium@gmail.com");
		btnContinueEmail.click();
	}
	

	private void authPageLogin(PremiumAdditional pf) {
		pf = new PremiumAdditional();
		pf.initiazeHomeScreen();
	}

		public void signIn() {
			inputpwd.clear();
			inputpwd.sendKeys("phase2selenium");
			btnSignin.click();
		}
	public boolean isNavigationBarDisplayed() {
			return navigationDiv.isDisplayed();
		}

	@Then("User should see flashing challenge yourself button")
	public void user_should_see_flashing_challenge_yourself_button() {
		PremiumAdditional pf;
		
	}
	
	
	public boolean isFlashingButtonDisplayed() {
		return flashingButton.isDisplayed();
	}

	public boolean isTwoSecFlashing() {
		WebElement flashesTwoSec;
		return flashesTwoSec.isDisplayed();
	}

	
	public void clickManagePremium() {
        By managePremiumButton;
		driver.findElement(managePremiumButton).click();
    }

    public String getPremiumStatus() {
        By premiumStatusText;
		return driver.findElement(premiumStatusText).getText();
    }

    public boolean isOnHomePage() {
        return driver.getTitle().contains("Home");
    }

public void clickDashboardLink() {
    By dashboardNavLink;
	driver.findElement(dashboardNavLink).click();
}

public boolean isStartDateLabelDisplayed() {
    By startDateLabel;
	return driver.findElement(startDateLabel).isDisplayed();
}

public String getStartDateValue() {
    By startDateValue;
	return driver.findElement(startDateValue).getText().trim();
}

public boolean isDateFormatValid(String expectedFormat) {
    String dateText = getStartDateValue();
    SimpleDateFormat sdf = new SimpleDateFormat(expectedFormat);
    sdf.setLenient(false);
    try {
        sdf.parse(dateText);
        return true;
    } catch (ParseException e) {
        return false;
    }
}

public Object flashesTwoSec() {
	// TODO Auto-generated method stub
	return null;
}
	
	

	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	

	
	

	
}
}
