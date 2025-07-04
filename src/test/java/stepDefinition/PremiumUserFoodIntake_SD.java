package stepDefinition;

import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.PremiumUserFoodIntake_PF;
import utilities.ConfigReader;

public class PremiumUserFoodIntake_SD {
	
	PremiumUserFoodIntake_PF pf = new PremiumUserFoodIntake_PF();
	
	@Given("PremiumUser FI is in home page")
	public void premium_user_fi_is_in_home_page() {
		pf.initiazeHomeScreen(ConfigReader.getProperty("premiumUser"), ConfigReader.getProperty("premiumPassword"));
	}

	@When("PremiumUser FI clicks Food Intake")
	public void premium_user_fi_clicks_food_intake() {
	    pf.fiButtonClick();
	}

	@Then("User FI should see title Food Intake Tracker")
	public void user_fi_should_see_title_food_intake_tracker() {
	    assertTrue(pf.fiTitleDisplayed());
	}

	@Then("User FI should see subtext Track what you eat to manage your diabetes better")
	public void user_fi_should_see_subtext_track_what_you_eat_to_manage_your_diabetes_better() {
		assertTrue(pf.subTextDisplayed());
	}

	@Then("User FI should see Breakfast, Lunch, dinner, snack tabs")
	public void user_fi_should_see_breakfast_lunch_dinner_snack_tabs() {
		assertTrue(pf.breakfastButtonDisplayed() && pf.lunchButtonDisplayed() 
				&& pf.dinnerButtonDisplayed() && pf.snackButtonDisplayed());
	}

	@Then("User FI should see field for Food Name, Serving Size,Calories,Date,Notes")
	public void user_fi_should_see_field_for_food_name_serving_size_calories_date_notes() {
		assertTrue(pf.foodNameDisplayed() && pf.aservingSizeDisplayed() && pf.aservingSizeDisplayed()
				&& pf.dateDisplayed() && pf.notesDisplayed());
	}

	@Then("User FI should see Breakfast tab selected by default")
	public void user_fi_should_see_breakfast_tab_selected_by_default() {
	    assertTrue(pf.breakfastButtonDefaultDisplayed());
	}

	@Then("User FI should see input field for field food name")
	public void user_fi_should_see_input_field_for_field_food_name() {
		assertTrue(pf.inputFoodDisplayed());
	}

	@Then("User FI should see text  e.g., Grilled Chicken Salad as placeholder in input field")
	public void user_fi_should_see_text_e_g_grilled_chicken_salad_as_placeholder_in_input_field() {
		assertTrue(pf.placeHolderFoodDisplayed());
	}

	@Then("User FI should see  dropdown for serving size")
	public void user_fi_should_see_dropdown_for_serving_size() {
		assertTrue(pf.servingSizeDropDownDisplayed());
	}

	@Then("User FI should see calculator icon in calorie")
	public void user_fi_should_see_calculator_icon_in_calorie() {
		assertTrue(pf.calculatorIconDisplayed());
	}

	@Then("User FI should see input field for calorie")
	public void user_fi_should_see_input_field_for_calorie() {
		assertTrue(pf.calorieInputDisplayed());
	}

	@Then("User FI should see text as placeholder in calorie field")
	public void user_fi_should_see_text_eg_as_placeholder_in_calorie_field(Integer int1) {
		assertTrue(pf.caloriePlaceHolderDisplayed());
	}

	@Then("User FI should see helper text Enter calories or click the calculator icon for automatic calculation.")
	public void user_fi_should_see_helper_text_enter_calories_or_click_the_calculator_icon_for_automatic_calculation() {
		assertTrue(pf.calorieHelperTextDisplayed());
	}

	@Then("User FI should see date picker")
	public void user_fi_should_see_date_picker() {
	    assertTrue(pf.datePickerDisplayed());
	}

	@Then("User FI should see input block for notes")
	public void user_fi_should_see_input_block_for_notes() {
		assertTrue(pf.notesDisplayed());
	}

	
	@Then("User FI should see save food entry button")
	public void user_fi_should_see_save_food_entry_button() {
		assertTrue(pf.saveFoodButtonDisplayed());
	}

}
