package stepDefinition;

import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.PremiumUserHomeButtonNavigation_PF;
import utilities.ConfigReader;

public class PremiumUserHomeButtonNavigation_SD {

	PremiumUserHomeButtonNavigation_PF pf = new PremiumUserHomeButtonNavigation_PF();
	
	@Given("Home Button User is in home screen") 
	public void homeScreen() {
		pf.homeScreen(ConfigReader.getProperty("premiumUser"), ConfigReader.getProperty("premiumPassword"));
	}

	@When("User clicks on Blood glucose button")
	public void user_clicks_on_blood_glucose_button() {
		pf.onClickbloodGlucoseButton();
	}

	@Then("User should redirect to Blood Glucose popup window")
	public void user_should_redirect_to_blood_glucose_popup_window() {
		assertTrue(pf.bloodGlucoseScreenDisplayed());
	}

	@When("User clicks on physical activity button")
	public void user_clicks_on_physical_activity_button() {
		pf.onClickphysicalActivityButton();
	}

	@Then("User should redirect to physical activity popup window")
	public void user_should_redirect_to_physical_activity_popup_window() {
		assertTrue(pf.physicalActivityScreenDisplayed());
	}
	
	@Then("User should see four button option")
	public void user_should_four_button_option() {
		assertTrue(pf.bloodGlucoseScreenDisplayed() && pf.foodIntakeScreenDisplayed());
	}

	@When("User clicks on food intake button")
	public void user_clicks_on_food_intake_button() {
		pf.onClickfoodIntakeButton();
	}

	@Then("User should redirect to food intake popup window")
	public void user_should_redirect_to_food_intake_popup_window() {
		assertTrue(pf.foodIntakeScreenDisplayed());
	}

	@When("User clicks on medication button")
	public void user_clicks_on_medication_button() {
		pf.onClickmedicationButton();
	}

	@Then("User should redirect to medication popup window")
	public void user_should_redirect_to_medication_popup_window() {
		assertTrue(pf.medicationScreenDisplayed());
	}

	@When("User clicks log button")
	public void user_clicks_log_button() {
		pf.onClicklogButton();
	}

	@Then("User should redirected to dashboard page")
	public void user_should_redirected_to_dashboard_page() {
		assertTrue(pf.logScreenDisplayed());
	}

	@Given("User is in dashboard page")
	public void user_is_in_dashboard_page() {
		pf.onClicklogButton();
	}

	@When("User clicks home tab after logging emotional state in dashboard")
	public void user_clicks_home_tab_after_logging_emotional_state_in_dashboard() {
		pf.onClickhomeButton();
	}

	@Then("User should see emoji and mood text is changed")
	public void user_should_see_emoji_and_mood_text_is_changed() {
		assertTrue(pf.moodTextDisplayed());
	}
	
	@Then("User should see text Blood Glucose")
	public void user_should_see_text_blood_glucose() {
		assertTrue(pf.bloodGlucoseScreenDisplayed());
	}

	@Then("User should see Physical activity")
	public void user_should_see_physical_activity() {
	   assertTrue(pf.physicalActivityScreenDisplayed());
	}

	@Then("User Should see Medication")
	public void user_should_see_medication() {
	   assertTrue(pf.medicationScreenDisplayed());
	}

}
