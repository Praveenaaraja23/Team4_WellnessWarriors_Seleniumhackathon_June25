package stepDefinition;


import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.DiabetesRiskAnalyzer_pf;
import pageFactory.LaunchUIComponents_PF;
import pageFactory.Launchnavigationcomponents_pf;
import utilities.LoggerLoad;
import static org.testng.Assert.assertEquals;

public class DiabetesRiskAnalyzer_SD {
	
	
	LaunchUIComponents_PF uiComponentsPage = new LaunchUIComponents_PF();
	Launchnavigationcomponents_pf navigation=new Launchnavigationcomponents_pf();
	DiabetesRiskAnalyzer_pf riskanalyzer =new DiabetesRiskAnalyzer_pf();

@When("User clicks {string} button")
public void user_clicks_button(String string) {
   
	 navigation.scrollToBottom();
	 navigation.clickcheckyourrisk();
  
}

@Then("User should see {string} header")
public void user_should_see_header(String string) {
   
	Assert.assertEquals("Diabetes Risk Analyzer", riskanalyzer.isRiskAnalyzerVisible());
	
}

@Then("User should see {string} text")
public void user_should_see_text(String expectedtext) {
	Assert.assertEquals(riskanalyzer.getanswertext(),expectedtext);
    
}

@Then("User should see Cancel button")
public void user_should_see_cancel_button() {
	
	//Assert.assertTrue(riskanalyzer.iscancelBtn());
	
	 Assert.assertTrue(riskanalyzer.isCancelBtn(), "Cancel button is not visible on the page.");

    
}

@Then("User should see Calculate Risk button")
public void user_should_see_calculate_risk_button() {
	
	Assert.assertTrue(riskanalyzer.isCalcRiskBtn(), "Calculate Risk button is not visible on the page.");
   
	//Assert.assertTrue(riskanalyzer.iscalcRiskButn());
	 
}

@Then("User should see Calculate Risk button disabled")
public void user_should_see_calculate_risk_button_disabled() {
   
	Assert.assertTrue(riskanalyzer.isCalculateRiskButtonDisabled());
	
    
}

@Then("User should see Age input field to have stepper controls")
public void user_should_see_age_input_field_to_have_stepper_controls() {
   
	Assert.assertTrue(riskanalyzer.isAgeInputWithStepper());
    
}

@Then("User should see Weight input field to have stepper controls")
public void user_should_see_weight_input_field_to_have_stepper_controls() {
	
	Assert.assertTrue(riskanalyzer.isWeightInputWithStepper());
    
}

@Then("User should see checkbox for Family history of diabetes field")
public void user_should_see_checkbox_for_family_history_of_diabetes_field() {
	Assert.assertTrue(riskanalyzer.isfamilyHistoryInputDisplayed());
    
}

@Then("User should be able to view the placeholder {string} in the age field")
public void user_should_be_able_to_view_the_placeholder_in_the_age_field(String expectedtxt) {
	
	 Assert.assertEquals(expectedtxt, riskanalyzer.getAgePlaceholder());
    
}

@Then("User should see {string} in the weight field")
public void user_should_see_in_the_weight_field(String expectedtxt) {
	
	 Assert.assertEquals(expectedtxt, riskanalyzer.getWeightPlaceholder()); 
    
}

@Then("User should see dropdown for Physical Activity Level")
public void user_should_see_dropdown_for_physical_activity_level() {
   
	 assertEquals(riskanalyzer.getphysicalDropdownVisible(), "select", "Tag for Physical Activity Level");
	
    
}

@Then("User should see dropdown for Blood Pressure")
public void user_should_see_dropdown_for_blood_pressure() {
   
	  assertEquals(riskanalyzer.getbpstatusDropdownVisible(), "select", "Tag is not <select> for Blood Pressure");
	
}

@Then("User should see dropdown for Diet Quality")
public void user_should_see_dropdown_for_diet_quality() {
   
	assertEquals(riskanalyzer.getdietqualityDropdownVisible(), "select", "Tag is not <select> for Diet Quality"); 
}

@Then("User should see {string} as the default option")
public void user_should_see_as_the_default_option(String expectedOption) {
	
	  String actualOption = riskanalyzer.getDropdownDefaultText(expectedOption);
	
	  Assert.assertEquals(actualOption, expectedOption, "Default option text does not match!");
	  LoggerLoad.info("Actual Result:" +actualOption);
	  LoggerLoad.info("Expected Result:" +expectedOption);
	  
}
@Then("User should see {string} in the {string} dropdown")
public void user_should_see_in_the_dropdown(String expectedOptions, String dropdownName) {
	
	String actualOptions = riskanalyzer.getDropdownOptionsText(dropdownName);

    Assert.assertEquals(actualOptions, expectedOptions, "Dropdown options do not match!");
   
    LoggerLoad.info("Actual Result:" +actualOptions);
	  LoggerLoad.info("Expected Result:" +expectedOptions);
	  
	}

//

@Given("User is in diabetes risk analyzer")
public void user_is_in_diabetes_risk_analyzer() {
	navigation.scrollToBottom();
	 navigation.clickcheckyourrisk();   
   
}

@When("User clicks Cancel button")
public void user_clicks_cancel_button() {
    
	riskanalyzer.clickcancelBtn();
}

@Then("User should be returned to the home page")
public void user_should_be_returned_to_the_home_page() {
	navigation.scrollToTop();
     assertEquals(uiComponentsPage.getSweetBalanceText(), "SweetBalance");
   
}

@When("User enters values in all fields")
public void user_enters_values_in_all_fields() throws InterruptedException {
    
	riskanalyzer.enterAgeInput(34);
	riskanalyzer.enterWeightInput(75);
	riskanalyzer.selectFamilyHistoryCheckbox();
	riskanalyzer.selectDropdownByName("Physical Activity", "Moderate (Exercise 1-2 times a week)");
	 Thread.sleep(3000);
	riskanalyzer.selectDropdownByName("Blood Pressure", "High");
	Thread.sleep(3000);
	riskanalyzer.selectDropdownByName("Diet Quality", "Average (Mixed whole foods and processed foods)");
	Thread.sleep(3000);
}

@Then("User should see {string} button is enabled")
public void user_should_see_button_is_enabled(String string) {
	 Assert.assertTrue(riskanalyzer.isCalculateRiskButtonEnabled(), "Risk button is not enabled");
   
}

@When("User clicks {string} button after entering valid values in all fields")
public void user_clicks_button_after_entering_valid_values_in_all_fields(String string) throws InterruptedException {

	riskanalyzer.enterAgeInput(34);
	riskanalyzer.enterWeightInput(75);
	riskanalyzer.selectFamilyHistoryCheckbox();
	riskanalyzer.selectDropdownByName("Physical Activity", "Moderate (Exercise 1-2 times a week)");
	 Thread.sleep(3000);
	riskanalyzer.selectDropdownByName("Blood Pressure", "High");
	Thread.sleep(3000);
	riskanalyzer.selectDropdownByName("Diet Quality", "Average (Mixed whole foods and processed foods)");
	Thread.sleep(3000); 
   riskanalyzer.clickcalcRiskBtn();
}

@Then("User should see {string} dialog box")
public void user_should_see_dialog_box(String expectedtext) {
	
	assertEquals(riskanalyzer.riskassesmenttext(), expectedtext);
    

}


}

	
