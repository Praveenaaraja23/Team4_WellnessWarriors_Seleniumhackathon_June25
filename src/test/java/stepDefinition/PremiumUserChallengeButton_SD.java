package stepDefinition;

import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.PremiumUserChallengeButton_PF;
import utilities.ConfigReader;

public class PremiumUserChallengeButton_SD {
	PremiumUserChallengeButton_PF pf = new PremiumUserChallengeButton_PF();
	@Given("User is in the home page")
	public void user_is_in_the_home_page() {
		pf.homeScreen(ConfigReader.getProperty("premiumUser"), ConfigReader.getProperty("premiumPassword"));
	}

	@When("User clicks Challenge button")
	public void user_clicks_challenge_button() {
	   pf.onClickchallengeButton();
	}

	@Then("User should get pop window")
	public void user_should_get_pop_window() {
	   assertTrue(pf.challengeTitleDisplayed());
	}

	@Then("User should see title {string}")
	public void user_should_see_title(String string) {
		assertTrue(pf.challengeTitleDisplayed());
	}

	@Then("user should see sub text {string}")
	public void user_should_see_sub_text(String string) {
		assertTrue(pf.subTextDisplayed());
	}

	@Then("User should see two options for challenge option")
	public void user_should_see_two_options_for_challenge_option() {
	    assertTrue(pf.tenDayChallengeDisplayed() && pf.fourWeekProgramDisplayed());
	}

	@Then("User should see {string}  as first option")
	public void user_should_see_as_first_option(String string) {
		assertTrue(pf.tenDayChallengeDisplayed());
	}
	
	@Then("User should see {string}  as second option")
	public void user_should_see_as_second_option(String string) {
		assertTrue(pf.fourWeekProgramDisplayed());
	}

}
