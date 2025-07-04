package stepDefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.LaunchUIComponents_PF;
import pageFactory.Launchnavigationcomponents_pf;
import utilities.LoggerLoad;

public class Launchnavigationcomponents_SD {
	
	LaunchUIComponents_PF uiComponentsPage = new LaunchUIComponents_PF();
	Launchnavigationcomponents_pf navigation=new Launchnavigationcomponents_pf();
	

@Given("The Users is on SweetBalance homepage")
public void the_users_is_on_sweet_balance_homepage() {
	  
		LoggerLoad.info("User is on" + uiComponentsPage.getSweetBalanceText() + "page");
	}

	//startToday
	@When("User clicks the {string} button")
	public void user_clicks_the_button(String string) {
		
		navigation.clickStartToday();
	  
	}

	@Then("User should be redirected to the Login page")
	public void user_should_be_redirected_to_the_login_page() {
		
		 assertEquals(navigation.getsignintext(),"Sign in to your account or create a new one");
		    LoggerLoad.info("User is navigated to" +navigation.getsignintext()+ "page");
		   
		}
		
		
	 @When("User looks at the top right corner")
	public void user_looks_at_the_top_right_corner() {
	
		 String result = navigation.getLoginvisibletxt();
		   
		    LoggerLoad.info(result);
		   }

	@Then("User should see a link labeled {string}")
	public void user_should_see_a_link_labeled(String string) {
		    
		String actualText = navigation.getLoginText();
	    assertEquals("Login", actualText);
	    LoggerLoad.info("User sees the login link labeled: " + actualText);
	  
	}

	@When("User clicks on the {string} link")
	public void user_clicks_on_the_link(String string) {
		
	  navigation.clickLogin();
	  
	}

	@When("User clicks on {string} button on launch page")
	public void user_clicks_on_button_on_launch_page(String string) {
		
		 navigation.scrollToBottom();
		 navigation.clickcheckyourrisk();
	  
	}

	@Then("User should be redirected to the assessment modal dialog")
	public void user_should_be_redirected_to_the_assessment_modal_dialog() {
		
		assertEquals(navigation.getcheckyourrisktxt(),"Diabetes Risk Analyzer");
	    LoggerLoad.info("User is navigated to" +navigation.getcheckyourrisktxt()+ "page");
	  
	}



	

	
		}
	
			