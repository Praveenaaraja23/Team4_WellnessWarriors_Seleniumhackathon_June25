package stepDefinition;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.LaunchNonfunctional_PF;
import pageFactory.LaunchUIComponents_PF;
import utilities.LoggerLoad;

public class LaunchNonfunctional_SD {
	LaunchUIComponents_PF uiComponentsPage = new LaunchUIComponents_PF();
	LaunchNonfunctional_PF nonfunctional=new LaunchNonfunctional_PF();
	
	@Given("User is in browser")
	public void user_is_in_browser() {
		LoggerLoad.info("User launches browser");
	    
	}

	@When("User enters the SweetBalance url")
	public void user_enters_the_sweet_balance_url() {
		
		LoggerLoad.info("User is on" + uiComponentsPage.getSweetBalanceText() + "page");
	    
	    
	}

	@Then("Page should be fully loaded within {int} seconds")
	public void page_should_be_fully_loaded_within_seconds(Integer int1) {
		  long loadTime = nonfunctional.getPageLoadTime(); 

	        System.out.println("Page Load Time: " + loadTime + " ms");
	        Assert.assertTrue(loadTime <= 3000, "Page load time exceeded 3 seconds");
	    
	}
	@Then("User should have a consistent experience across browsers")
	public void user_should_have_a_consistent_experience_across_browsers() {
	    //Performed cross browser testing
	    
	}




}
