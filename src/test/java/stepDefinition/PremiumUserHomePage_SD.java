package stepDefinition;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.PremiumUserHomePage_pf;

public class PremiumUserHomePage_SD {
	private PremiumUserHomePage_pf pf = null;

	@Given("User is in password auth page")
	public void user_is_in_password_auth_page() {
		// Write code here that turns the phrase above into concrete actions
		authPageLogin();
	}

	@When("User clicks sign in after entering password")
	public void user_clicks_sign_in_after_entering_password() {
		// Write code here that turns the phrase above into concrete actions
		// *[matches(text(), '😊')]

		pf.signIn();
	}

	@Then("User should see the navigation bar displaying items in the order: Home,Logbook,Dashboard,Education")
	public void user_should_see_the_navigation_bar_displaying_items_in_the_order_home_logbook_dashboard_education() {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(pf.isNavigationBarDisplayed());
	}

	@Then("User should see flashing challenge yourself button")
	public void user_should_see_flashing_challenge_yourself_button() {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(pf.isFlashingButtonDisplayed());
	}

	@Then("Flashes in two sec")
	public void flashes_in_2s() {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(pf.isTwoSecFlashing());
	}

	@Then("User should see a Challenge yourself today! button")
	public void user_should_see_a_button() {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(pf.ischallengeButtonDisplayed());
	}

	@Then("User should see a gender-specific image based on the gender selected during the onboarding process")
	public void user_should_see_a_gender_specific_image_based_on_the_gender_selected_during_the_onboarding_process() {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(pf.isGenderImageDisplayed());
	}

	@Then("User should see an emoji displayed on the top-right corner of the gender image")
	public void user_should_see_an_emoji_displayed_on_the_top_right_corner_of_the_gender_image() {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(pf.isEmojiImageDisplayed());
	}

	@Then("User should see label Mood below the gender image")
	public void user_should_see_label_below_the_gender_image() {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(pf.isMoodLabelDisplayed());
	}

	@Then("User should see log button under gender image")
	public void user_should_see_log_button_under_gender_image() {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(pf.isLogButtonDisplayed());
	}

	@Then("User should see mood text based on the emoji")
	public void user_should_see_mood_text_based_on_the_emoji() {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(pf.isEmojiImageDisplayed() && pf.isMoodTextDisplayed());
	}

	@Then("User should see Week plan button")
	public void user_should_see_week_plan_button() {
		Assert.assertTrue(pf.isWeeklyPlanButtonDisplayed());
	}

	@Then("User should see Record New Data text")
	public void user_should_see_record_new_data_text() {
		Assert.assertTrue(pf.isRecordNewDataDisplayed());
	}

	@Then("User should see four button options")
	public void user_should_see_button_options() {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(pf.isFourButtonOptionDisplayed());
	}

	@Then("User should see Blood Glucose")
	public void user_should_see_BG() {
		Assert.assertTrue(pf.isBloodGlucoseButtonDisplayed());
	}

	@Then("User should see Physical Activity")
	public void user_should_see_Physical_Activity() {
		Assert.assertTrue(pf.isPhysicalActivityButtonDisplayed());
	}

	@Then("User should see Food Intake")
	public void user_should_see_Food_Intake() {
		Assert.assertTrue(pf.isFoodIntakeButtonDisplayed());
	}

	@Then("User should see Medication")
	public void user_should_see_Medication() {
		Assert.assertTrue(pf.isMedicationButtonDisplayed());
	}

	@Then("Activity icon should be present in blood glucose")
	public void activity_icon_should_be_present_in_blood_glucose() {
		Assert.assertTrue(pf.isBloodGlucoseIconDisplayed());
	}

	@Then("Running icon should be present in Physical activity")
	public void running_icon_should_be_present_in_physical_activity() {
		Assert.assertTrue(pf.isPhysicalActivityIconDisplayed());
	}

	@Then("Pizza icon should be present in food intake")
	public void pizza_icon_should_be_present_in_food_intake() {
		Assert.assertTrue(pf.isFoodIntakeIconDisplayed());
	}

	@Then("Pill icon should be present in medication")
	public void pill_icon_should_be_present_in_medication() {
		Assert.assertTrue(pf.isMedicationIconDisplayed());
	}

	private void authPageLogin() {
		pf = new PremiumUserHomePage_pf();
		pf.initiazeHomeScreen();

	}

}
