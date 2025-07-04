package pageFactory;

import java.sql.Driver;
import java.sql.DriverManager;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.ConfigReader;

public class PremiumLogbook {

	
	public class Loginpage_pf {
		Driver driver;
		private WebDriverWait wait;
		ConfigReader configFileReader=DriverManager.ConfigReader();
		
		public Loginpage_pf(WebDriver driver){
			this.driver = DriverManager.getDriver(null);
			wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			PageFactory.initElements(driver , this);
		}
	
}
	
	
}