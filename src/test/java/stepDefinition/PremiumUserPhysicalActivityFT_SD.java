package stepDefinition;

import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.PremiumUserPhysicalActivityFT_PF;
import utilities.ConfigReader;

public class PremiumUserPhysicalActivityFT_SD {
	PremiumUserPhysicalActivityFT_PF pf = new PremiumUserPhysicalActivityFT_PF();

	@Given("PremiumUser PAFT is in physical activity")
	public void premium_user_paft_is_in_physical_activity() {
		pf.initiazeHomeScreen(ConfigReader.getProperty("premiumUser"), ConfigReader.getProperty("premiumPassword"));
		pf.physicalActivityClick();
	}

	@When("PremiumUser PAFT enters invalid value in duration text field")
	public void premium_user_paft_enters_invalid_value_in_duration_text_field() {
	    pf.addPresentInput("Invalid");
	   
	}

	@Then("User PAFTshould see blank")
	public void user_paf_tshould_see_blank() {
		 assertTrue(pf.presentInputIsEmpty());
	}
	
	@When("PremiumUser PAFT clicks save activity after entering valid")
	public void validEntry() {
		pf.addPresentInput("40");
		pf.saveActivityClick();
	   
	}

	@Then("User PAFTshould see Your activity is recorded")
	public void user_paf_recorded() {
		 assertTrue(pf.getAlertText().contains("Success!"));
	}

	@When("PremiumUser PAFT clicks date picker")
	public void premium_user_paft_clicks_date_picker() {
	    pf.datePickerClick();
	}

	@Then("User PAFTshould see date calendar")
	public void user_paf_tshould_see_date_calendar() {
		assertTrue(pf.calendarDisplayed());
	}

	@Then("User PAFTshould see previous button in date")
	public void user_paf_tshould_see_previous_button_in_date() {
		assertTrue(pf.previousDateDisplayed());
	}

	@Then("User PAFTshould see next button in date")
	public void user_paf_tshould_see_next_button_in_date() {
		assertTrue(pf.nextDateDisplayed());
	}

}
