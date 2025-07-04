package stepDefinition;

import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.PremiumUserMealValidation_PF;
import utilities.ConfigReader;

public class PremiumUserMealValidation_SD {

	PremiumUserMealValidation_PF pf = new PremiumUserMealValidation_PF();

	@Given("User is in View Meal plan")
	public void user_is_in_view_meal_plan() {
		pf.homeScreen(ConfigReader.getProperty("premiumUser"), ConfigReader.getProperty("premiumPassword"));
		pf.isOnClickViewMealPlanButton();
	}

	@When("User clicks Meal sections {string}")
	public void user_clicks_meal_sections(String mealSection) {
		switch (mealSection) {
		case "breakfast":
			pf.breakFastButtonOnClick();
			break;
		case "lunch":
			pf.lunchButtonOnClick();
			break;
		case "dinner":
			pf.dinnerButtonOnClick();
			break;
		case "snacks":
			pf.snackButtonOnClick();
			break;
		}
	}

	@Then("Each meal section should display a pre-meal item with the format")
	public void each_meal_section_should_display_a_pre_meal_item_with_the_format() {
		assertTrue(pf.preMealTitleDisplayed());

	}

	@Then("Item description  should be displayed below the item name")
	public void item_description_should_be_displayed_below_the_item_name() {
		assertTrue(pf.preMealDescDisplayed());
	}

	@Then("Calories value should be displayed")
	public void calories_value_should_be_displayed() {
		assertTrue(pf.preMealCalorieDisplayed());
	}

	@Then("Preparation instructions displayed if available , if not then")
	public void preparation_instructions_displayed_if_available_if_not_then() {
		assertTrue(pf.preparationTextDisplayed());
	}

	@Then("User should see Nutrients Pre-meal portion heading in full plan")
	public void user_should_see_heading_in_full_plan() {
		assertTrue(pf.nutrientsPreMealTextDisplayed());
	}

	@Then("User should see nutrients text")
	public void user_should_see() {
		assertTrue(pf.carbsPreMealTextDisplayed());
	}

	@Then("User should see value present in all each  nutrient")
	public void user_should_see_value_present_in_all_each_nutrient() {
		assertTrue(pf.carbsPreMealValueDisplayed());
	}

	@Then("Pre- meal time for Breakfast displayed should be {string}")
	public void pre_meal_time_for_breakfast_displayed_should_be(String string) {
		assertTrue(pf.verifyPreMealTime(string));
	}

	@Then("Pre- meal time for lunch displayed should be {string}")
	public void pre_meal_time_for_lunch_displayed_should_be(String string) {
		assertTrue(pf.verifyPreMealTime(string));
	}

	@Then("Each meal section should display a meal item with the format")
	public void each_meal_section_should_display_a_meal_item_with_the_format() {
		assertTrue(pf.mainMealTitleDisplayed());
	}

	@Then("Total Calories value should be displayed")
	public void total_calories_value_should_be_displayed() {
		assertTrue(pf.totalCaloriesDisplayed());
	}

	@Then("User should see ingredients list for the main meal for each meal section")
	public void user_should_see_ingredients_list_for_the_main_meal_for_each_meal_section() {
		assertTrue(pf.ingredientsListDisplayed());
	}

	@Then("User should see heading")
	public void user_should_see_heading() {
		assertTrue(pf.mealPlanNutritionsDisplayed());
	}

	@Then("User should see tips under diabetes tips")
	public void user_should_see_tips_under_diabetes_tips() {
		assertTrue(pf.diabetesTipsDisplayed());
	}
	
	@Then("User should see impact text")
	public void user_should_see_impact_text() {
		assertTrue(pf.isGlycemicImpactText());
	}

	@Then("User should see impact value")
	public void user_should_see_impact_value() {
		assertTrue(pf.isGlycemicImpactValueDisplayed());
	}

	@Then("Impact value should be low\\/medium\\/high")
	public void impact_value_should_be_low_medium_high() {
		assertTrue(pf.isValidGlycemicImpactValue());
	}

	@Given("User is in view full plan page")
	public void user_is_in_view_full_plan_page() {
		pf.isOnClickViewMealPlanButton();
	}

	@When("User clicks back to plan button")
	public void user_clicks_back_to_plan_button() {
		pf.isOnClickBackToPlan();
	}

	@Then("User should redirected to Home page")
	public void user_should_redirected_to_home_page() {
		// Write code here that turns the phrase above into concrete actions
		assertTrue(pf.isHomeScreen());
	}
	
	@Then("User should see heading Diabetes Management Tips")
	public void user_should_see_heading_Diabetes_Management_Tips() {
		// Write code here that turns the phrase above into concrete actions
		assertTrue(pf.diabetesManagementDisplayed());
	}

}
