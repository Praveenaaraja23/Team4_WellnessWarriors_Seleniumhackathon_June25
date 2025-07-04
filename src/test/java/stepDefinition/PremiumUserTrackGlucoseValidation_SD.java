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
	
	@Then("User TG should see title Track Glucose")
	public void user_should_see_title() {
	    assertTrue(pf.bloodGlucoseTitle());
	}

	@Then("User TG should see subtext")
	public void user_should_see_subtext() {
	    assertTrue(pf.subTextDisplayed());
	}

	@Then("User TG should see field for Blood Glucose Level, Reading Type,Date")
	public void user_should_see_field_for_blood_glucose_level_reading_type_date() {
		assertTrue(pf.bgLevelDisplayed() && pf.readingTypeDisplayed() && pf.dateDisplayed());
	    
	}

	@Then("User TG should see text field for blood glucose")
	public void user_should_see_text_field_for_blood_glucose() {
	    assertTrue(pf.placeholderDisplayed());
	}
	
	@Then("User TG should see text Enter blood glucose level")
	public void user_should_see_text_enter_for_blood_glucose() {
	    assertTrue(pf.placeholderDisplayed());
	}


	@Then("User TG should see three transition details  with text Low, normal, high")
	public void user_should_see_three_transition_details_with_text() {
		assertTrue(pf.transitionFieldLowDisplayed() && pf.transitionFieldHighDisplayed() && pf.transitionFieldLowDisplayed());
	}
	
	@Then("User TG should see mg_dL")
	public void user_should_see_mgdl() {
		assertTrue(pf.placeholderDisplayed());
	}

	@Then("User TG should see button Fasting,Pre-meal,Post-meal,Bedtime")
	public void user_should_see_button() {
		assertTrue(pf.fastingButtonDisplayed() && pf.preMealButtonDisplayed() 
				&& pf.postMealButtonDisplayed() && pf.bedTimeButtonDisplayed());
	    
	}

	@Then("User TG should see date picker")
	public void user_should_see_date_picker() {
	    assertTrue(pf.datePickerDisplayed());
	}

	@Then("User TG should see last ready details")
	public void user_should_see_last_ready_details() {
	    assertTrue(pf.lastReadingDisplayed());
	}

	@Then("User TG should see record reading button")
	public void user_should_see_record_reading_button() {
		assertTrue(pf.recordReadingButtonDisplayed());
	}

}
