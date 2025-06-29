package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigReader;
import utilities.DriverManager;



public class Launchpage_pf {
	
	WebDriver driver= DriverManager.getDriver();
	ConfigReader configFileReader=DriverManager.configReader();
	
	public Launchpage_pf() {
		PageFactory.initElements(driver , this);

	}


}
