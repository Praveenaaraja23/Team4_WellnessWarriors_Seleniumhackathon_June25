package stepDefinition;

import static org.testng.Assert.*;

import io.cucumber.java.en.*;
import pageFactory.HomepageMealDetailPage;

public class HomepageMealDetailSteps {

    private final HomepageMealDetailPage mealDetailPage = new HomepageMealDetailPage();

    @When("the user selects the {string} tab in the meal section")
    public void the_user_selects_meal_tab(String mealType) {
        mealDetailPage.selectMealTab(mealType);
    }

    @Then("the user should see the dish title")
    public void the_user_should_see_dish_title() {
        assertTrue(mealDetailPage.isDishTitleDisplayed(), "Dish title is not visible");
    }

    @Then("the user should see the description for the dish")
    public void the_user_should_see_description() {
        assertTrue(mealDetailPage.isDishDescriptionDisplayed(), "Dish description is not displayed");
    }

    @Then("the user should see the pre-meal item name")
    public void the_user_should_see_pre_meal_item_name() {
        assertTrue(mealDetailPage.isPreMealItemNameDisplayed(), "Pre-meal item name is not displayed");
    }

    @Then("the user should see the pre-meal calorie value")
    public void the_user_should_see_pre_meal_calorie_value() {
        assertTrue(mealDetailPage.isPreMealCaloriesDisplayed(), "Calorie value is not visible");
    }

    @Then("the user should see the {string} indicator for the {string} pre-meal")
    public void the_user_should_see_time_indicator(String expectedIndicator, //am/pm is expected
                                                   String mealType) {

        String actual = mealDetailPage.getMealTimeIndicator();  
        assertEquals(actual, expectedIndicator,
                     "Time indicator mismatch for " + mealType + " pre-meal");
    }

    @Then("the user should see the pre-meal time in \"hh:mm\" format")
    public void the_user_should_see_pre_meal_time_format() {
        assertTrue(mealDetailPage.isPreMealTimeFormattedCorrectly(), "Pre-meal time format is invalid");
    }

    @Then("the user should see green color for Carbs")
    public void the_user_should_see_green_for_carbs() {
        assertTrue(mealDetailPage.isMacroColorCorrect("Carbs", "green"), "Carbs color is not green");
    }

    @Then("the user should see purple color for Fat")
    public void the_user_should_see_purple_for_fat() {
        assertTrue(mealDetailPage.isMacroColorCorrect("Fat", "purple"), "Fat color is not purple");
    }

    @Then("the user should see pink color for Protein")
    public void the_user_should_see_pink_for_protein() {
        assertTrue(mealDetailPage.isMacroColorCorrect("Protein", "pink"), "Protein color is not pink");
    }

    @Then("the user should see each macro’s unit displayed as \"g\"")
    public void the_user_should_see_unit_g_for_macros() {
        assertTrue(mealDetailPage.areMacroUnitsCorrect(), "Not all macro units are displayed as 'g'");
    }

}
