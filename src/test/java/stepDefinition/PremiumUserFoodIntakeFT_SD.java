package stepDefinition;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.PremiumUserFoodIntakeFT_PF;
import utilities.ConfigReader;

public class PremiumUserFoodIntakeFT_SD {
	PremiumUserFoodIntakeFT_PF pf = new PremiumUserFoodIntakeFT_PF();
	
	@Given("PremiumUser FIFT  is in the Breakfast section of the Food Intake Tracker")
	public void premium_user_fift_is_in_the_breakfast_section_of_the_food_intake_tracker() {
		pf.initiazeHomeScreen(ConfigReader.getProperty("premiumUser"), ConfigReader.getProperty("premiumPassword"));
		pf.fiButtonClick();
	}

	@When("PremiumUser FIFT  clicks save food entry button after entering invalid value in food name")
	public void premium_user_fift_clicks_save_food_entry_button_after_entering_invalid_value_in_food_name() {
	    pf.inputFoodSetValue("food");
	    pf.saveFoodClick();
	}

	@Then("User FIFT should see alert with message  Failed to save food intake")
	public void user_fift_should_see_alert_with_message_failed_to_save_food_intake() {
	    assertTrue(pf.getAlertText().contains("Failed to save food intake"));
	}


	@When("PremiumUser FIFT  enters valid food name")
	public void premium_user_fift_enters_valid_food_name() {
		pf.inputFoodSetValue("Chicken");
	}

	@Then("User FIFT should see calorie value for the food name calculated automatically")
	public void user_fift_should_see_calorie_value_for_the_food_name_calculated_automatically() {
	    assertTrue(Integer.valueOf(pf.getCalorieInput()) > 0);
	}

	@Then("User FIFT should see helper text after automatic calorie calculation")
	public void user_fift_should_see_helper_text_after_automatic_calorie_calculation() {
	    assertTrue(pf.calorieHelperTextDisplayed());
	}

	@Then("User FIFT should see Calories calculated automatically. You can edit if needed. as helper text in calorie field")
	public void user_fift_should_see_calories_calculated_automatically_you_can_edit_if_needed_as_helper_text_in_calorie_field() {
	    assertEquals("Calories calculated automatically. You can edit if needed.", pf.getcalorieHelperText());
	}


	@When("PremiumUser FIFT  edit calorie value after automatic calorie calculation")
	public void premium_user_fift_edit_calorie_value_after_automatic_calorie_calculation() {
	    pf.calorieInputSetValue("500");
	}

	@Then("User FIFT should see edited value in automatic calorie value")
	public void user_fift_should_see_edited_value_in_automatic_calorie_value() {
		assertEquals("500", pf.getCalorieInput());
	}

	@When("PremiumUser FIFT  clicks the Save Food Entry button after leaving the Food Name field empty")
	public void premium_user_fift_clicks_the_save_food_entry_button_after_leaving_the_food_name_field_empty() {
	   pf.clearInputFood();
	   pf.saveFoodClick();
	}

	@Then("User FIFT should see an error message indicating that the Food Name is required")
	public void user_fift_should_see_an_error_message_indicating_that_the_food_name_is_required() {
	    assertTrue(pf.getAlertText().contains("Please fill out this field"));
	}

	@When("PremiumUser FIFT  clicks on date field")
	public void premium_user_fift_clicks_on_date_field() {
	    pf.datePickerClick();
	}

	@Then("User FIFT should see date calendar")
	public void user_fift_should_see_date_calendar() {
	    assertTrue(pf.calendarDisplayed());
	}


	@Then("User FIFT should see previous button in date")
	public void user_fift_should_see_previous_button_in_date() {
	    assertTrue(pf.previousDateDisplayed());
	}

	@Then("User FIFT should see next button in date")
	public void user_fift_should_see_next_button_in_date() {
		assertTrue(pf.nextDateDisplayed());
	}

	@When("PremiumUser FIFT  clicks save food entry after more than words in notes")
	public void premium_user_fift_clicks_save_food_entry_after_more_than_words_in_notes() {
	    String morethan250 = "A wonderful serenity has taken possession of my entire soul, like these sweet mornings of spring which I enjoy with my whole heart. I am alone, and feel the charm of existence in this spot, which was created for the bliss of souls like mine. I am so happy, my dear friend, so absorbed in the exquisit";
	    pf.inputFoodSetValue("Chicken");
	    pf.notesSetValue(morethan250);
	    pf.saveFoodClick();
	}

	@Then("User FIFT should see error message in alert")
	public void user_fift_should_see_error_message_in_alert() {
		assertTrue(!pf.getAlertText().isEmpty());
	}

}
