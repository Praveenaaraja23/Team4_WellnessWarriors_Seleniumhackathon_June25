package stepDefinition;

import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.PremiumUserTrackGlucose_PF;
import utilities.ConfigReader;

public class PremiumUserTrackGlucoseValidation_SD {
	
	PremiumUserTrackGlucose_PF pf = new PremiumUserTrackGlucose_PF();
	
	@Given("PremiumUser TrackGlucose is in home page")
	public void premium_user_is_in_home_page() {
		pf.homeScreen(ConfigReader.getProperty("premiumUser"), ConfigReader.getProperty("premiumPassword"));
	}

	@When("PremiumUser TG clicks Blood Glucose")
	public void premium_user_clicks_blood_glucose() {
	    pf.onClickbloodGlucoseButton();
	}

	@Then("User should see subtext {string}")
	public void user_should_see_subtext(String string) {
	    assertTrue(pf.subTextDisplayed());
	}

	@Then("User should see field for Blood Glucose Level, Reading Type,Date")
	public void user_should_see_field_for_blood_glucose_level_reading_type_date() {
		assertTrue(pf.bgLevelDisplayed() && pf.readingTypeDisplayed() && pf.dateDisplayed());
	    
	}

	@Then("User should see text field for blood glucose")
	public void user_should_see_text_field_for_blood_glucose() {
	    assertTrue(pf.inputFieldDisplayed());
	}

	@Then("User should see three transition details  with text Low, normal, high")
	public void user_should_see_three_transition_details_with_text() {
		assertTrue(pf.inputFieldTextDisplayed());
	}

	@Then("User should see button Fasting,Pre-meal,Post-meal,Bedtime")
	public void user_should_see_button(String string) {
		assertTrue(pf.fastingButtonDisplayed() && pf.preMealButtonDisplayed() 
				&& pf.postMealButtonDisplayed() && pf.bedTimeButtonDisplayed());
	    
	}

	@Then("User should see date picker")
	public void user_should_see_date_picker() {
	    assertTrue(pf.datePickerDisplayed());
	}

	@Then("User should see last ready details")
	public void user_should_see_last_ready_details() {
	    assertTrue(pf.lastReadingDisplayed());
	}

	@Then("User should see record reading button")
	public void user_should_see_record_reading_button() {
		assertTrue(pf.recordReadingButtonDisplayed());
	}

}
