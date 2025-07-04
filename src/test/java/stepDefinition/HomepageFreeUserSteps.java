package stepDefinition;

import static org.testng.Assert.*;

import io.cucumber.java.en.*;
import pageFactory.HomepageFreeUserPage;

public class HomepageFreeUserSteps {

    private final HomepageFreeUserPage freeUserpage = new HomepageFreeUserPage();


    @When("the user observes the top navigation bar")
    public void observe_nav_bar() {    	
    }

    @Then("the navigation bar should list items in the exact order {string}")
    public void nav_bar_order(String expected) {
        assertEquals(freeUserpage.getItemOrder(), expected,
                     "Navigation bar items are not in the expected order");
    }

    @When("the user inspects the “Today's Meal Plan” section header")
    public void inspect_meal_plan_header() { 
    	
    }

    @Then("a collapse-toggle caret icon is visible next to the title")
    public void caret_icon_visible() {
        assertTrue(freeUserpage.caretIconVisible(), "Caret icon not visible");
    }

    @When("the free user clicks the {string} meal tab")
    public void free_user_clicks_meal_tab(String meal) { 
    	freeUserpage.selectMealTab(meal); 
    }

    @Then("the card shows the heading {string}")
    public void card_heading(String heading) { 
    	assertTrue(freeUserpage.headingIsVisible(heading)); 
    }

    @Then("a horizontal nutrition bar for Carbs, Protein and Fat is displayed")
    public void nutrition_bar_displayed() { 
    	assertTrue(freeUserpage.nutritionBarIsDisplayed()); 
    }

    @Then("^the pre-meal title.*is shown$")
    public void pre_meal_title_shown() { 
    	assertTrue(freeUserpage.preMealTitleIsVisible()); 
    }

    @Then("Carbs, Protein and Fat values are present")
    public void macro_values_present() { 
    	assertTrue(freeUserpage.macroValuesPresent()); 
    }

    @Then("intake time is displayed for the {word} pre-meal")
    public void intake_time_for_meal(String m) { 
    	assertTrue(freeUserpage.intakeTimeIsDisplayed(m)); 
    }

    @Then("the pre-meal indicator reads {string}")
    public void snack_indicator(String txt) { 
    	assertTrue(freeUserpage.snackIndicatorIs(txt)); 
    }

    @Then("the time is in {string} format")
    public void time_format(String fmt) { 
    	assertTrue(freeUserpage.isTimeInFormat(fmt)); 
    }

    @Then("a dot separator appears between time and calories")
    public void dot_between_time_and_calories() { 
    	assertTrue(freeUserpage.dotBetweenTimeAndCalories()); 
    }


    @When("the user clicks the “View Full Plan” button in the meal section")
    public void click_view_full_plan() { 
    	freeUserpage.clickViewFullPlan(); }
    
    @When("the user views the Exercise section header")
    public void the_user_views_the_exercise_section_header() {
        freeUserpage.openExerciseSection();   
    }

    @Then("the title {string} is displayed")
    public void the_title_is_displayed(String expected) {
        String actual = freeUserpage.getExerciseHeaderTitle();
        assertEquals(actual, expected);
    }

    @Then("the user is redirected to the subscription page")
    public void redirected_to_subscription() { 
    	assertTrue(freeUserpage.isOnSubscriptionPage()); 
    }

    @When("the user clicks the “View Full Schedule” button in the exercise section")
    public void click_view_full_schedule() { 
    	freeUserpage.clickViewFullSchedule(); 
    }
}
