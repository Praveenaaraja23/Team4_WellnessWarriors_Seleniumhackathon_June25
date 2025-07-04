package stepDefinition;

import org.apache.logging.log4j.core.util.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.PremiumAdditional;

public class premiumAdditional_SD {

	private PremiumAdditional pf = null;
	private PremiumAdditional dashboardPage;
		
	
	
	
	
	@Given("User is in Home page")
	public void user_is_in_Home_page() {
		authPageLogin();
	}



	private void authPageLogin() {
		pf = new PremiumAdditional();
		pf.initiazeHomeScreen();}
	
	@When("User clicks sign in after entering password")
	public void user_clicks_sign_in_after_entering_password() {
		
		pf.signIn();
	}
	
	@Then("User should see the navigation bar displaying items in the order: Home,Logbook,Dashboard,Education")
	public void user_should_see_the_navigation_bar_displaying_items_in_the_order_home_logbook_dashboard_education() {
		
		pf.equals(pf.isNavigationBarDisplayed());


	}
	
	
	@Then("Flashes in two sec")
	public void flashes_in_Twos() {
		
		pf.equals(pf.flashesTwoSec());
	}
	
	
	
	@Then("User should see a Challenge yourself today! button")
	public void user_should_see_a_button() {
		pf.equals(pf.flashesTwoSec());
	
	}
	
	@Then("User should see the {string} status next to the symbol")
    public void user_should_see_the_status(String expectedStatus) {
        PremiumAdditional homePage;
		String actualStatus = homePage.getPremiumStatus();
        Assert.assertEquals(expectedStatus, actualStatus);
    }
	
	
	 @Then("User should see the {string} with value in format {string}")
	    public void user_should_see_start_date_with_value_in_format(String labelText, String expectedFormat) {
	        Assert.assertTrue("Start Date label not displayed", dashboardPage.isStartDateLabelDisplayed());
	        Assert.assertTrue("Date format mismatch", dashboardPage.isDateFormatValid(expectedFormat));
	    }
	
	
	

}



	




	

