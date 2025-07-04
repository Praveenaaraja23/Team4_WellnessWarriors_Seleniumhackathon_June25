package stepDefinition;

import java.sql.DriverManager;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageFactory.Then;
import pageFactory.PremiumLogbook.PremiumLogbook_SD;
import utilities.ConfigReader;

public class premiumLogbook_SD {

public class PremiumLogbook_SD
{
	WebDriver driver= (WebDriver) DriverManager.getDrivers();
	PremiumLogbook_SD login = new PremiumLogbook_SD();

	@Given("User is on SweetBalance homepage")
	public void user_is_on_sweet_balance_homepage() {
	   String url = ConfigReader.getApplicationUrl(); 
	}

	@When("User clicks on {string} link")
	public void user_clicks_on_link(String string) {
	   login.clickloginbt();
	}

	
		
	}
}

}
