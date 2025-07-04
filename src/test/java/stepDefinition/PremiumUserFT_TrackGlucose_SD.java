package stepDefinition;

import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.PremiumUserFT_TrackGlucose_PF;
import utilities.ConfigReader;

public class PremiumUserFT_TrackGlucose_SD {
	
	PremiumUserFT_TrackGlucose_PF pf = new PremiumUserFT_TrackGlucose_PF();
	
	@Given("PremiumUser TGFT is in blood glucose")
	public void premium_user_is_in_blood_glucose() {
		pf.homeScreen(ConfigReader.getProperty("premiumUser"), ConfigReader.getProperty("premiumPassword"));
		pf.onClickbloodGlucoseButton();
	}

	@When("PremiumUser TGFT clicks record reading after valid reading")
	public void premium_user_clicks_record_reading_after_valid_reading() throws InterruptedException {
		pf.placeholderSend("300");
		pf.recordReadingButtonClick();
		assertTrue(pf.lastReadingDisplayed());
	}

	@When("PremiumUser TGFT enters invalid value in blood glucose")
	public void premium_user_enters_invalid_value_in_blood_glucose() {
		pf.placeholderSend("someText");
	}

	@Then("User TGFT should see blank value")
	public void user_should_see_blank_value() {
		assertTrue(pf.placeHolderValueBlank());
	}

	@When("PremiumUser TGFT enters value in blood glucose")
	public void premium_user_enters_value_in_blood_glucose() {
	    pf.placeholderSend("100");
	}

	@Then("User TGFT should see transition details highlights")
	public void user_should_see_transition_details_highlights() {
		assertTrue(pf.transitionFieldNormalDisplayed());
	}

	@When("PremiumUser TGFT clicks date picker")
	public void premium_user_clicks_date_picker() {
	    pf.datePickerClick();
	}

	@Then("User TGFT should see date calendar")
	public void user_should_see_date_calendar() {
		assertTrue(pf.calendarDisplayed());
	}
	
	@Then("User TGFT should see previous button in date")
	public void user_should_see_previous_button_in_date() {
		assertTrue(pf.preMealButtonDisplayed());
	}

	@Then("User TGFT should see next button in date")
	public void user_should_see_next_button_in_date() {
		assertTrue(pf.nextButtonDisplayed());
	}

}
