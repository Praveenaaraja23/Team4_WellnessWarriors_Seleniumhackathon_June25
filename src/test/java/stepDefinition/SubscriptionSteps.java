package stepDefinition;

import static org.testng.Assert.assertTrue;          
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.SubscriptionPage;

public class SubscriptionSteps {
	
	private static final String TEST_EMAIL    = "nump@gmail.com";
    private static final String TEST_PASSWORD = "phase2selenium";

   SubscriptionPage subscriptionPage = new SubscriptionPage();
  
   @Given("a free test user logs in and opens the Free vs Premium Account Features page")
   public void a_free_test_user_logs_in_and_opens_the_free_vs_premium_account_features_page() {

       subscriptionPage.openFirstPage();
       subscriptionPage.clickLogin();

       subscriptionPage.enterEmail(TEST_EMAIL);
       subscriptionPage.clickContinueWithEmail();
       subscriptionPage.enterPassword(TEST_PASSWORD);
       subscriptionPage.clickSignIn();

       subscriptionPage.clickViewFullPlan();

       assertTrue(subscriptionPage.isComparisonPageDisplayed(),
                  "User should be on Free-vs-Premium comparison page");
   }

    @Given("The user is viewing the Free vs Premium Account Features page")
    public void the_user_is_viewing_the_free_vs_premium_account_features_page() {
        assertTrue(subscriptionPage.isComparisonPageDisplayed(),
                   "Comparison page should be displayed");
    }

    @When("The user does not take any action")
    public void the_user_does_not_take_any_action() {
    }

    @Then("Both Free and Premium should show Daily Meal Plan as available")
    public void both_free_and_premium_should_show_daily_meal_plan_as_available() {
        assertTrue(subscriptionPage.isFeatureAvailableInFree("Daily Meal Plan"));
        assertTrue(subscriptionPage.isFeatureAvailableInPremium("Daily Meal Plan"));
    }

    @Then("Weekly Meal Plan should be available only in Premium")
    public void weekly_meal_plan_should_be_available_only_in_premium() {
        assertTrue(subscriptionPage.isFeatureUnavailableInFree("Weekly Meal Plan"));
        assertTrue(subscriptionPage.isFeatureAvailableInPremium("Weekly Meal Plan"));
    }

    @Then("Personalized Exercise Plan should be available only in Premium")
    public void personalized_exercise_plan_should_be_available_only_in_premium() {
        assertTrue(subscriptionPage.isFeatureUnavailableInFree("Personalized Exercise Plan"));
        assertTrue(subscriptionPage.isFeatureAvailableInPremium ("Personalized Exercise Plan"));
    }

    @Then("{int}-Day Quick Reversal Plan should be available only in Premium")
    public void quick_reversal_plan_should_be_available_only_in_premium(Integer days) {
        String label = days + "-Day Quick Reversal Plan"; //+ jave operator used to combine numberand alphabets
        assertTrue(subscriptionPage.isFeatureUnavailableInFree(label));
        assertTrue(subscriptionPage.isFeatureAvailableInPremium(label));
    }

    @Then("{int}-Day Blood Sugar Reduction Plan should be available only in Premium")
    public void blood_sugar_reduction_plan_should_be_available_only_in_premium(Integer days) {
        String label = days + "-Day Blood Sugar Reduction Plan";
        assertTrue(subscriptionPage.isFeatureUnavailableInFree(label));
        assertTrue(subscriptionPage.isFeatureAvailableInPremium(label));
    }

    @Then("Both Free and Premium should show Glucose Level Graph as available")
    public void both_free_and_premium_should_show_glucose_level_graph_as_available() {
        assertTrue(subscriptionPage.isFeatureAvailableInFree("Glucose Level Graph"));
        assertTrue(subscriptionPage.isFeatureAvailableInPremium("Glucose Level Graph"));
    }

    @Then("Both Free and Premium should show BMI Calculation as available")
    public void both_free_and_premium_should_show_bmi_calculation_as_available() {
        assertTrue(subscriptionPage.isFeatureAvailableInFree("BMI Calculation"));
        assertTrue(subscriptionPage.isFeatureAvailableInPremium("BMI Calculation"));
    }

    @Then("Downloadable Meal Plan PDF should be available only in Premium")
    public void downloadable_meal_plan_pdf_should_be_available_only_in_premium() {
        assertTrue(subscriptionPage.isFeatureUnavailableInFree("Downloadable Meal Plan PDF"));
        assertTrue(subscriptionPage.isFeatureAvailableInPremium ("Downloadable Meal Plan PDF"));
    }

    @Then("{string} should be available only in Premium")
    public void feature_should_be_available_only_in_premium(String featureName) {
        assertTrue(subscriptionPage.isFeatureAvailableInPremium(featureName));
        assertTrue(subscriptionPage.isFeatureUnavailableInFree(featureName));
    }


    @Then("The {string} button should be visible")
    public void the_button_should_be_visible(String label) {
        assertTrue(subscriptionPage.isButtonVisible(label),
                   "Button \"" + label + "\" should be visible");
    }

    @Then("The {string} button should appear under the Free column")
    public void the_button_should_appear_under_the_free_column(String label) {
        assertTrue(subscriptionPage.isButtonUnderFree(label),
                   "\"" + label + "\" button should be under Free column");
    }

    @Then("The {string} button should appear under the Premium column")
    public void the_button_should_appear_under_the_premium_column(String label) {
        assertTrue(subscriptionPage.isButtonUnderPremium(label),
                   "\"" + label + "\" button should be under Premium column");
    }

    @Then("It should display {string} with {string}")
    public void it_should_display_plan_with_price(String plan, String price) {
        if (plan.equals("Free Account"))
            assertTrue(subscriptionPage.isFreePriceDisplayed(),  "Free price missing");//no price for free account
        else
            assertTrue(subscriptionPage.isPremiumPriceDisplayed(),"Premium price missing");
    }

    @Then("Features not included should have red X icons")
    public void features_not_included_should_have_red_x_icons() {
        assertTrue(subscriptionPage.missingFeaturesHaveRedXs(),
                   "Missing features must have red X icons");
    }

    @Then("All included features should have green check-marks")
    public void all_included_features_should_have_green_check_marks() {
        assertTrue(subscriptionPage.availableFeaturesHaveGreenChecks(),
                   "Included features must have green ✓ icons");
    }

    @Then("It should list exactly {int} features")
    public void it_should_list_exactly_features(int expected) {
        assertTrue(subscriptionPage.featureCountIs(expected),
                   "Feature count should be " + expected);
    }

    @Then("Terms & Conditions and Privacy Policy text should be visible")
    public void terms_and_conditions_and_privacy_policy_text_should_be_visible() {
        assertTrue(subscriptionPage.isLegalTextVisible());
    }

    @Then("It should show the text {string}")
    public void it_should_show_the_text(String expected) {
        assertTrue(subscriptionPage.isUpgradeHeaderVisible(),
                   "Upgrade header missing");
    }

    @Then("The Free and Premium plans should be displayed side-by-side in clearly separated columns")
    public void the_free_and_premium_plans_should_be_displayed_side_by_side_in_clearly_separated_columns() {
        assertTrue(subscriptionPage.columnsAreSideBySide(),
                   "Free & Premium columns should be rendered side-by-side");
    }

}