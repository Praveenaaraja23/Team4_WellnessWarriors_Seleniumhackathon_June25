package stepDefinition;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.PremiumUserValidationFunctionalNonFunctionalPage_PF;
import utilities.ConfigReader;

public class PremiumUserFunctionalNonFunctionalValidation_SD {
	
	PremiumUserValidationFunctionalNonFunctionalPage_PF pf = new PremiumUserValidationFunctionalNonFunctionalPage_PF();
	
	@Given("User is in home page")
	public void userInHomePage() {
		pf.homeScreen(ConfigReader.getProperty("premiumUser"), ConfigReader.getProperty("premiumPassword"));
	}

	@When("User clicks {string} meal section")
	public void user_clicks_meal_section(String mealSection) {
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
		}
	}

	@Then("User should see Pre-Meal title")
	public void user_should_see_pre_meal_title() {
		Assert.assertTrue(pf.isPreMealTitleDisplayed());
	}

	@Then("User should see alarm clock icon")
	public void user_should_see_alarm_clock_icon() {
		Assert.assertTrue(pf.isPreMealIconDisplayed());
	}

	@Then("User should see pre-meal in first place of  each meal section")
	public void user_should_see_pre_meal_in_first_place_of_each_meal_section() {
		Assert.assertTrue(pf.isPreMealTitleDisplayed());
	}

	@When("User clicks snack section")
	public void user_clicks_snack_section() {
	    pf.snackButtonOnClick();
	}

	//Bug 
	@Then("User should see Pre-Meal entry displays as None by default")
	public void user_should_see_pre_meal_entry_displays_as_none_by_default() {
	    Assert.assertEquals("None", pf.fetchPreMealEntry());
	}

	//Bug 
	@Then("User should see zero calorie in pre-meal snack")
	public void user_should_see_calorie_in_pre_meal_snack() {
	    Assert.assertEquals(0, pf.getPreMealCalorieInNumbers());
	}

	@Then("User should see meal title for main-meal in snack")
	public void user_should_see_meal_title_for_main_meal_in_snack() {
	    Assert.assertTrue(pf.isMainMealDisplayed());
	}

	@Then("User should see description for the dish in snack")
	public void user_should_see_description_for_the_dish_in_snack() {
	    Assert.assertTrue(pf.isMainMealEntryDisplayed());
	}

	@Then("User should see Main-meal as sub title")
	public void user_should_see_main_meal_as_sub_title() {
		Assert.assertTrue(pf.isMainMealDisplayed());
	}

	@Then("User should see utensil icon for each main-meal")
	public void user_should_see_utensil_icon_for_each_main_meal() {
		Assert.assertTrue(pf.isMainMealIconDisplayed());
	}

	@Then("User should see  hh:mm based time in main-meal")
	public void user_should_see_hh_mm_based_time_in_main_meal() {
		Assert.assertTrue(pf.isValidMainMealTimeFormat());
	}

	@Then("User should see indicator AM for breakfast main-meal")
	public void user_should_see_indicator_am_for_breakfast_main_meal() {
	    Assert.assertTrue(pf.isMorningTime());
	}

	@Then("User should see indicator PM for lunch  main-meal")
	public void user_should_see_indicator_pm_for_lunch_main_meal() {
		 Assert.assertTrue(pf.isEveningTime());
	}

	@Then("User should see indicator PM for dinner  main-meal")
	public void user_should_see_indicator_pm_for_dinner_main_meal() {
		Assert.assertTrue(pf.isEveningTime());
	}

	@Then("User should see indicator PM for snack  main-meal")
	public void user_should_see_indicator_pm_for_snack_main_meal() {
		Assert.assertTrue(pf.isEveningTime());
	}

	@Then("User should see {string}")
	public void user_should_see_o_clock(String time) {
	    Assert.assertEquals(time, pf.fetchMainMealTime());
	}

	@Then("User should see the main-meal calorie value")
	public void user_should_see_the_main_meal_calorie_value() {
	   Assert.assertTrue(pf.getMainMealCalorieInNumbers() > 0);
	}

	@Then("User should see text calorie after the calorie value in main meal")
	public void user_should_see_text_calorie_after_the_calorie_value_in_main_meal() {
	    Assert.assertTrue(pf.mainMealCalorieDisplayed());
	}

	@Then("user should see ✅ Completed button")
	public void user_should_see_completed_button() {
	   Assert.assertTrue(pf.isCompletedButtonDisplayed());
	}

	@Then("user should see ⚠️ Partially Completed button")
	public void user_should_see_️_partially_completed_button() {
		 Assert.assertTrue(pf.isPartiallyCompletedButtonDisplayed());
	}

	@Then("user should see ❌ Not Completed button")
	public void user_should_see_not_completed_button() {
		 Assert.assertTrue(pf.isNotCompletedButtonDiplayed());
	}

	@Then("Button color should change to green")
	public void button_color_should_change_to_green() {
		pf.onClickCompletedButton();
	    Assert.assertEquals("rgba(34, 197, 94, 1)", pf.fetchColorCompleteButton());
	}

	@Then("Button color should change to yellow")
	public void button_color_should_change_to_yellow() {
		pf.onClickPartiallyCompletedButton();
	    Assert.assertEquals("rgba(37, 194, 99, 1)", pf.fetchColorPartiallyCompleteButton());
	}

	@Then("Button color should change to red")
	public void button_color_should_change_to_red() {
		pf.onClickNotCompletedButton();
	    Assert.assertEquals("rgba(234, 179, 8, 1)", pf.fetchColorNotCompleteButton());
	}

	@Then("Nutrition Insight summary card should be displayed in each meal section")
	public void nutrition_insight_summary_card_should_be_displayed_in_each_meal_section() {
	    Assert.assertTrue(pf.isFlexCardDisplayed());
	}

	@Then("User should see title  Nutrition Insight")
	public void user_should_see_title_nutrition_insight() {
	    Assert.assertTrue(pf.isNutritionInsightDisplayed());	
	}

	@Then("User should see subtitle Calorie")
	public void user_should_see_subtitle_calorie() {
	    Assert.assertTrue(pf.isCalorieSubTitleDisplayed());
	}

	@Then("total calorie count should equal the sum of Pre-Meal and Meal calories")
	public void total_calorie_count_should_equal_the_sum_of_pre_meal_and_meal_calories() {
	    int totalCalories = pf.totalCaloriesInNumbers();
	    Assert.assertEquals(totalCalories, pf.preMealCalorieInNumbers() + pf.mainMealCalorieInNumbers());
	}

	@Then("calorie detail for each meal should appear on the right side of its section")
	public void calorie_detail_for_each_meal_should_appear_on_the_right_side_of_its_section() {
	   Assert.assertTrue(pf.isPreMealCalorieDetailDisplayed());
	}

	
	@Then("User should see donut chart")
	public void user_should_see_donut_chart() {
		Assert.assertTrue(pf.isDonutChartVisible());
	}

	@Then("User should see total calories in donut chart")
	public void user_should_see_total_calories_in_donut_chart() {
	    Assert.assertTrue(pf.isDonutChartTotalCaloriesVisible());
	}

	@Then("Macro percentages match expected values")
	public void macro_percentages_match_expected_values() {
	    Assert.assertEquals(100, pf.combinedMacroPercentage());
	}

	@Then("User should see macronutrient bar chart in each meal section")
	public void user_should_see_macronutrient_bar_chart_in_each_meal_section() {
	    Assert.assertTrue(pf.isBarChartVisible());
	}

	@Then("Each nutrient bar should show a value consistent with its label")
	public void each_nutrient_bar_should_show_a_value_consistent_with_its_label_e_g_carbs_40g() {
	    Assert.assertTrue(pf.barChartHasValue());
	}

	@Then("All macro percentages combined should make up exactly {int}%")
	public void all_macro_percentages_combined_should_make_up_exactly(int int1) {
		Assert.assertEquals(int1, pf.combinedMacroPercentage());
	}

	@Then("Below the chart, every macronutrient should display its name along with the corresponding percentage")
	public void below_the_chart_every_macronutrient_should_display_its_name_along_with_the_corresponding_percentage() {
	    Assert.assertTrue(pf.isMacroPercentageVisible());
	}

	@When("User Clicks View Meal Plan button")
	public void user_clicks_view_meal_plan_button() {
	    pf.isOnClickViewMealPlanButton();
	}

	@Then("User should redirected to Full meal plan page")
	public void user_should_redirected_to_full_meal_plan_page() {
	    Assert.assertTrue(pf.isMeanPlanTitleDisplayed());
	}

	@Then("User should see title  Full Meal Plan")
	public void user_should_see_title_full_meal_plan() {
	   Assert.assertTrue(pf.isMeanPlanTitleDisplayed());
	}

	@Then("User should see  Back to plan button")
	public void user_should_see_back_to_plan_button() {
		 Assert.assertTrue(pf.isBackToPlanButtonDisplayed());
	}

	@Then("User should see each meal section button")
	public void user_should_see_each_meal_section_button() {
		 Assert.assertTrue(pf.isMealPlanBreakfastDisplayed() && pf.isMealPlanDinnerDisplayed() 
				 && pf.isMealPlanLunchDisplayed() && pf.isMealPlanSnacksDisplayed());
	}




}
