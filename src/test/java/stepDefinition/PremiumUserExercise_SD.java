package stepDefinition;


import static org.testng.Assert.assertEquals;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.LaunchUIComponents_PF;
import pageFactory.Launchnavigationcomponents_pf;
import pageFactory.PremiumUserExercise_PF;
import utilities.LoggerLoad;



public class PremiumUserExercise_SD {
	


Launchnavigationcomponents_pf navigation=new Launchnavigationcomponents_pf();
LaunchUIComponents_PF uiComponentsPage = new LaunchUIComponents_PF();
PremiumUserExercise_PF premiumexercise = new PremiumUserExercise_PF();


@Given("The user is on the Home page and clicks Sign In")
public void the_user_is_on_the_home_page_and_clicks_sign_in() {
	
	navigation.clickLogin();
   
}

@When("The user enters valid credentials and logs in")
public void the_user_enters_valid_credentials_and_logs_in() {
    
	premiumexercise.premiumUserlogin();
}

@Given("User is on the homepage")
public void user_is_on_the_homepage() {
    

	 assertEquals(premiumexercise.getSweetBalancehomeText(),"SweetBalance");
	    LoggerLoad.info("User is navigated to" +premiumexercise.getSweetBalancehomeText()+ "Premium page");
	    System.out.println("User is navigated to" +premiumexercise.getSweetBalancehomeText()+ "page");
   
}
;
@When("User clicks the Exercise option from the side panel")
public void user_clicks_the_exercise_option_from_the_side_panel() {
    
	premiumexercise.clickExerciseBtn();
   
}

@Then("{string} should be displayed on the Exercise page")
public void should_be_displayed_on_the_exercise_page(String element) {
   
	  switch (element) {
      case "View Full Schedule":
          Assert.assertTrue(premiumexercise.isViewFullScheduleBtnDisplayed());
          System.out.println("User is navigated to" +premiumexercise.isViewFullScheduleBtnDisplayed()+ "page");
          break;
      case "Warm Up":
          Assert.assertTrue(premiumexercise.isWarmUpBtnDisplayed());
          System.out.println("User is navigated to" +premiumexercise.isWarmUpBtnDisplayed()+ "page");
      case "Main Workout":
          Assert.assertTrue(premiumexercise.isMainWorkoutBtnDisplayed());
          System.out.println("User is navigated to" +premiumexercise.isMainWorkoutBtnDisplayed()+ "page");
          break;
      case "Cool Down":
          Assert.assertTrue(premiumexercise.isCoolDownBtnDisplayed());
          System.out.println("User is navigated to" +premiumexercise.isMainWorkoutBtnDisplayed()+ "page");
          break;
      default:
          Assert.fail("Invalid element: " + element);
  }
   
}

@When("User clicks the View Full Schedule button")
public void user_clicks_the_view_full_schedule_button() {
    
	premiumexercise.clickViewFullScheduleBtn();
   
}

@Then("User should be redirected to Today's Exercise Schedule page")
public void user_should_be_redirected_to_today_s_exercise_schedule_page() {
	
	 Assert.assertTrue(premiumexercise.isTodaysExerciseScheduleDisplayed());
	 
}
@Given("User is on the Exercise section")
public void user_is_on_the_exercise_section() throws InterruptedException {
    premiumexercise.clickExerciseBtn();
    Thread.sleep(2000);
}

@When("User clicks the Mark As Completed button in {string} section")
public void user_clicks_the_mark_as_completed_button_in_section(String tab) throws InterruptedException {
    switch (tab) {
        case "Warm Up":
            premiumexercise.clickWarmUpTab();
            Thread.sleep(2000);
            premiumexercise.clickMarkAsCompleted();
            Thread.sleep(2000);
            break;

        case "Main Workout":
            premiumexercise.clickMainWorkoutTab();
            Thread.sleep(2000);
            premiumexercise.clickMarkAsCompleted();
            Thread.sleep(2000);
            break;

        case "Cool Down":
            premiumexercise.clickCoolDownTab();
            Thread.sleep(2000);
            premiumexercise.clickMarkAsCompleted();
            Thread.sleep(2000);
            break;

        default:
            Assert.fail("Invalid tab: " + tab);
    }
}

@Then("{string} should be displayed")
public void should_be_displayed(String scenario) throws InterruptedException {
    Thread.sleep(2000);
    switch (scenario) {
        case "Success Dialog":
            Assert.assertTrue(premiumexercise.isSuccessDialogDisplayed());
            System.out.println("User is navigated to Success Dialog page");
            break;

        case "Completed":
            Assert.assertTrue(premiumexercise.isCompletedDisplayed());
            System.out.println("User is navigated to Completed page");
            break;

        case "Undo Option":
            Assert.assertTrue(premiumexercise.isUndoDisplayed());
            System.out.println("User is navigated to Undo Option page");
            break;

        default:
            Assert.fail("Invalid scenario: " + scenario);
    }
}

@Given("User is on the Exercise section after completing exercise")
public void user_is_on_the_exercise_section_after_completing_exercise() throws InterruptedException {
    premiumexercise.clickExerciseBtn();
    Thread.sleep(2000);
}

@When("User clicks Undo after marking Exercise as completed")
public void user_clicks_undo_after_marking_exercise_as_completed() throws InterruptedException {
    premiumexercise.clickUndo();
    Thread.sleep(2000);
}

@Then("Button should revert back to \"Mark As Completed\"")
public void button_should_revert_back_to_mark_as_completed() throws InterruptedException {
    Thread.sleep(2000);
    Assert.assertTrue(premiumexercise.isMarkAsCompletedDisplayed());
}



@Then("User should be redirected to Today's Exercise Schedule page")
public void user_should_be_redirected_to_todays_exercise_schedule_page() throws InterruptedException {
    Thread.sleep(2000);
    Assert.assertTrue(premiumexercise.isTodaysExerciseScheduleDisplayed());
}

@Then("{string} should be displayed on Today's Exercise Schedule page")
public void element_should_be_displayed_on_todays_exercise_schedule_page(String element) throws InterruptedException {
    Thread.sleep(2000);
    switch (element) {
        case "Today's Exercise Schedule":
            Assert.assertTrue(premiumexercise.isTodaysExerciseScheduleDisplayed());
            break;

        case "Back to Home":
            Assert.assertTrue(premiumexercise.isBackToHomeDisplayed());
            break;

        case "Warm Up Section":
            Assert.assertTrue(premiumexercise.isWarmUpSectionDisplayed());
            break;

        case "Warm Up Exercise Name":
            Assert.assertTrue(premiumexercise.isWarmUpExerciseNameDisplayed());
            break;

        case "Warm Up Description":
            Assert.assertTrue(premiumexercise.isExerciseDescriptionDisplayed());
            break;

        case "Warm Up Duration":
            Assert.assertTrue(premiumexercise.isExerciseDurationDisplayed());
            break;

        case "Warm Up Calories":
            Assert.assertTrue(premiumexercise.isCaloriesDisplayed());
            break;

        case "Warm Up Intensity Level":
            Assert.assertTrue(premiumexercise.isIntensityDisplayed());
            break;

        case "Main Workout Section":
            Assert.assertTrue(premiumexercise.isMainWorkoutSectionDisplayed());
            break;

        case "Main Workout Exercise Name":
            Assert.assertTrue(premiumexercise.isMainExerciseNameDisplayed());
            break;

        case "Cool Down Section":
            Assert.assertTrue(premiumexercise.isCoolDownSectionDisplayed());
            break;

        case "Cool Down Exercise Name":
            Assert.assertTrue(premiumexercise.isCoolDownExerciseNameDisplayed());
            break;

     
        case "Total Duration":
            Assert.assertTrue(premiumexercise.isTotalDurationDisplayed());
            break;

        default:
            Assert.fail("Invalid element: " + element);
    }
}

@Then("Exercise intensity should be Low, Medium, or High")
public void exercise_intensity_should_be_low_medium_or_high() throws InterruptedException {
    Thread.sleep(2000);
    String intensity = premiumexercise.getExerciseIntensityText();
    Assert.assertTrue(intensity.contains("Low") || intensity.contains("Medium") || intensity.contains("High"));
}

@Then("Total duration should equal the sum of all individual durations")
public void total_duration_should_equal_the_sum_of_all_individual_durations() throws InterruptedException {
    Thread.sleep(2000);
    int warmUpDuration = premiumexercise.extractNumericValue(premiumexercise.workoutDuration);
    int mainDuration = premiumexercise.extractNumericValue(premiumexercise.mainDuration);
    int coolDownDuration = premiumexercise.extractNumericValue(premiumexercise.coolDownDuration);
    int totalDuration = premiumexercise.extractNumericValue(premiumexercise.totalDuration);

    Assert.assertEquals(totalDuration, warmUpDuration + mainDuration + coolDownDuration);
}

@Then("Total calories should equal the sum of all individual calories")
public void total_calories_should_equal_the_sum_of_all_individual_calories() throws InterruptedException {
    Thread.sleep(2000);
    int warmUpCalories = premiumexercise.extractNumericValue(premiumexercise.Calories);
    int mainCalories = premiumexercise.extractNumericValue(premiumexercise.mainCalories);
    int coolDownCalories = premiumexercise.extractNumericValue(premiumexercise.coolDownCalories);
    int totalCalories = premiumexercise.extractNumericValue(premiumexercise.totalCalories);

    Assert.assertEquals(totalCalories, warmUpCalories + mainCalories + coolDownCalories);
}
}
	