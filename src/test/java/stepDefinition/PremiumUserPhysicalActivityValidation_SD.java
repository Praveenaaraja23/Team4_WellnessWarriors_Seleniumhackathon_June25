package stepDefinition;

import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.PremiumUserPhysicalActivityValidation_PF;
import utilities.ConfigReader;

public class PremiumUserPhysicalActivityValidation_SD {
	PremiumUserPhysicalActivityValidation_PF pf = new PremiumUserPhysicalActivityValidation_PF();
	@Given("PremiumUser PA is in home page")
	public void premium_user_pa_is_in_home_page() {
		pf.initiazeHomeScreen(ConfigReader.getProperty("premiumUser"), ConfigReader.getProperty("premiumPassword"));
	}

	@When("PremiumUser PA clicks physical activity")
	public void premium_user_pa_clicks_physical_activity() {
	    pf.physicalActivityClick();
	}

	@Then("User should see field for Activity Type, Duration,Date,Intensity")
	public void user_should_see_field_for_activity_type_duration_date_intensity() {
	   assertTrue(pf.activityTypeDisplayed() && pf.dateDisplayed() && pf.durationDisplayed() && pf.intensityDisplayed());
	}

	@Then("User should see  dropdown for activity type")
	public void user_should_see_dropdown_for_activity_type() {
		assertTrue(pf.activityTypeDropdownDisplayed());
	}

	@Then("User should see minutes, hours")
	public void user_should_see_min() {
		assertTrue(pf.durationMinDisplayed());
	}
	
	@Then("User should see title Physical Activity")
	public void user_should_see_PA() {
		assertTrue(pf.paTitleDisplayed());
	}
	
	@Then("User should see subtext Track your fitness journey")
	public void user_should_see_subText() {
		assertTrue(pf.subTextDisplayed());
	}
	
	@Then("PA User should see date picker")
	public void user_should_datepicker() {
		assertTrue(pf.datePickerDisplayed());
	}

	@Then("User should see  input field for duration")
	public void user_should_see_input_field_for_duration() {
		assertTrue(pf.presenceInputDisplayed());
	}

	@Then("User should see thirty in placeholder field")
	public void user_should_see_in_placeholder_field(String string) {
		assertTrue(pf.placeholderTextDisplayed());
	}

	@Then("User should see intensity field")
	public void user_should_see_intensity_field() {
	    assertTrue(pf.presenceIntensityDisplayed());
	}

	@Then("User should see save activity button")
	public void user_should_see_save_activity_button() {
		assertTrue(pf.saveActivityDisplayed());
	}
}
