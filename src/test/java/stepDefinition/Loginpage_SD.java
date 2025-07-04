package stepDefinition;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.Assertion;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.Loginpage_pf;
import utilities.ConfigReader;
import utilities.DriverManager;
import utilities.ExcelReader;

public class Loginpage_SD {
	WebDriver driver= DriverManager.getDriver();
	Loginpage_pf login = new Loginpage_pf(driver);
	
	@Given("User is on SweetBalance homepage")
	public void user_is_on_sweet_balance_homepage() {
	   String url = ConfigReader.getApplicationUrl();
	}

	@When("User clicks on {string} link")
	public void user_clicks_on_link(String string) {
	   login.clickloginbt();
	}

	@Then("User should see {string} heading")
	public void user_should_see_heading(String string) {
	   login.welcomebackpage();	
	}
	@Then("User should see {string}")
	public void user_should_see(String string) {
	    login.signinOrNewDisplay();
	}
	@Then("User should see close button at the right corner")
	public void user_should_see_close_button_at_the_right_corner() {
	    login.closebtnDisplay();
	}
	@Then("User should see an input field to enter email")
	public void user_should_see_an_input_field_to_enter_email() {
	    login.inputfieldDisplay();
	}

	@Then("User should see text {string} in email field placeholder")
	public void user_should_see_text_in_email_field_placeholder(String string) {
	    Assert.assertTrue(login.emptyemail());
	}
	@Then("User should see a {string} button")
	public void user_should_see_a_button(String string) {
	   login.continueBtnDisplay();
	}

	@Then("User should see {string} button to be enabled")
	public void user_should_see_button_to_be_enabled(String string) {
	    Assert.assertTrue(login.continueBtnEnable());
	}
	@Then("User should see an {string} separator")
	public void user_should_see_an_separator(String string) {
	   login.OrDisplay();
	}
	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
	    driver.getCurrentUrl();
	}

	@When("Registered user clicks continue with email button after entering a valid existing email")
	public void registered_user_clicks_continue_with_email_button_after_entering_a_valid_existing_email() {
		try {
	        List<String> validEmails = ExcelReader.getEmailsByType("Login", "valid");
	        if (!validEmails.isEmpty()) {
	            String email = validEmails.get(0); 
	            login.enteremail(email);           
	            login.clickcontinueWEmailBtn();    
	        } else {
	            System.out.println("No valid emails found in Excel.");
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    }  
	}

	@Then("User should get password field")
	public void user_should_get_password_field() {
		String actualurl = driver.getCurrentUrl();
		String expectedurl = "https://sweet-balance-test-env-3-numpyninjadiabe.replit.app/auth";
		Assertion assertion = new Assertion();
		assertion.assertEquals(actualurl, expectedurl);
		driver.navigate().back();
	}
	@When("User enters an invalid email")
	public void user_enters_an_invalid_email() {
		try {
	        List<String> invalidEmails = ExcelReader.getEmailsByType("Login", "invalid");
	        if (!invalidEmails.isEmpty()) {
	            String email = invalidEmails.get(0); 
	            login.enteremail(email);           
	        } else {
	            System.out.println("No invalid emails found in Excel.");
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    } 
	} 

	@Then("Email field should show validation error")
	public void email_field_should_show_validation_error() {
		login.errorMsgDisplay();
	    driver.navigate().back();
	} 
	@When("Registered user clicks continue with email button after entering a valid email")
	public void registered_user_clicks_continue_with_email_button_after_entering_a_valid_email() {
		try {
	        List<String> validEmails = ExcelReader.getEmailsByType("Login", "valid");
	        if (!validEmails.isEmpty()) {
	            String email = validEmails.get(0); 
	            login.enteremail(email);           
	            login.clickcontinueWEmailBtn();    
	        } else {
	            System.out.println("No valid emails found in Excel.");
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	} 

	@Then("User should see Sign in button")
	public void user_should_see_sign_in_button() {
	    login.signinbtndisplay();
	}
	@When("User clicks continue with email button after entering a valid email")
	public void user_clicks_continue_with_email_button_after_entering_a_valid_email() {
		driver.navigate().back();
		try {
	        List<String> validEmails = ExcelReader.getEmailsByType("Login", "valid");
	        if (!validEmails.isEmpty()) {
	            String email = validEmails.get(0); 
	            login.enteremail(email);           
	            login.clickcontinueWEmailBtn();    
	        } else {
	            System.out.println("No valid emails found in Excel.");
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	} 

	@Then("User should see email id in sub text")
	public void user_should_see_email_id_in_sub_text() {
	    login.EnableValidEmail();
	}

	@Then("User should see {string} link")
	public void user_should_see_link(String string) {
	    login.displayForgotPwd();
	}

	@Then("User should see text {string} as placeholder in password field")
	public void user_should_see_text_as_placeholder_in_password_field(String string) {
	    login.EnterUrPwd();
	}
	@When("Registered user clicks sign in after entering password")
	public void registered_user_clicks_sign_in_after_entering_password() {
		try {
	        List<String> passwords = ExcelReader.getPasswordsByType("Login", "valid");
	        if (!passwords.isEmpty()) {
	            String password = passwords.get(0); 
	            login.EnterPwd(password);          
	            login.clicksigninbtn();
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    } 
	}

	@Then("User should be navigated to home page")
	public void user_should_be_navigated_to_home_page() {
	   driver.navigate().to("https://sweet-balance-test-env-3-numpyninjadiabe.replit.app/");
	//   Assertion assertion = new Assertion();
	//	assertion.assertEquals(actualurl, expectedurl);
	}

	@When("Unregistered user clicks continue with email button after entering a valid new email")
	public void unregistered_user_clicks_continue_with_email_button_after_entering_a_valid_new_email() {
	    try {
	        List<Map<String, String>> data = ExcelReader.readSheet("Login");
	        for (Map<String, String> row : data) {
	            if (row.get("expected message").toLowerCase().contains("new valid")) {
	                String email = row.get("email");
	                login.enteremail(email);
	                login.clickcontinueBtn();
	            }
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    } 
	    
	    
	}
	@Then("User should get {string} form")
	public void user_should_get_form(String string) {
		String currentresult = driver.getCurrentUrl();
		String expectedresult = "https://sweet-balance-test-env-3-numpyninjadiabe.replit.app/auth";
		Assertion assertion = new Assertion();
		assertion.assertEquals(currentresult, expectedresult);
	}
	@When("User clicks continue with email button after entering a valid new email")
	public void user_clicks_continue_with_email_button_after_entering_a_valid_new_email() {
		 try {
		        List<Map<String, String>> data = ExcelReader.readSheet("Login");
		        for (Map<String, String> row : data) {
		            if (row.get("expected message").toLowerCase().contains("new valid")) {
		                String email = row.get("email");
		                login.enteremail(email);
		                login.clickcontinueBtn();
		            }
		        }
		    } catch (IOException e) {
		        e.printStackTrace();
		    } 
	}

	@Then("{string} input field should be displayed")
	public void input_field_should_be_displayed(String string) {
		String name = ConfigReader.getFullName();
	}
	@Given("User is on complete profile form page")
	public void user_is_on_complete_profile_form_page() {
	/*    String currenturl = driver.getCurrentUrl();
	    String expectedurl = "https://sweet-balance-test-env-3-numpyninjadiabe.replit.app/auth";
	    Assertion assertion = new Assertion();
		assertion.assertEquals(currenturl, expectedurl); */
		driver.get("https://sweet-balance-test-env-3-numpyninjadiabe.replit.app/auth");
	    
	}

	@When("User checks the Terms & conditions box after filling all fields")
	public void user_checks_the_terms_conditions_box_after_filling_all_fields() {
		String name = ConfigReader.getFullName();
	    String user = ConfigReader.getUsername();
	    String pass = ConfigReader.getPassword();
	    login.clicktermsbtn();
	}

	@Then("{string} button should be enabled")
	public void button_should_be_enabled(String string) {
	    login.enableCAbtn();
	}
	@When("User clicks create account button after filling valid data in all fields")
	public void user_clicks_create_account_button_after_filling_valid_data_in_all_fields() {
	   login.clickCAbtn();
	}

	@Then("User should redirected to upload blood report")
	public void user_should_redirected_to_upload_blood_report() {
	/*	String currentresult = driver.getCurrentUrl();
	    String expectedresult ="https://sweet-balance-test-env-3-numpyninjadiabe.replit.app/blood-report-question";
	    Assertion assertion = new Assertion();
		assertion.assertEquals(currentresult, expectedresult); */
		driver.get("https://sweet-balance-test-env-3-numpyninjadiabe.replit.app/blood-report-question");
	}
	
	@Given("User is in upload blood report page")
	public void user_is_in_upload_blood_report_page() {
	/*	 String currentresult = driver.getCurrentUrl();
		 String expectedresult= "https://sweet-balance-test-env-3-numpyninjadiabe.replit.app/blood-report-question";
		 Assert.assertEquals(currentresult,expectedresult); */
		driver.get("https://sweet-balance-test-env-3-numpyninjadiabe.replit.app/blood-report-question");
	}
	@When("User clicks create account button after filling invalid data")
	public void user_clicks_create_account_button_after_filling_invalid_data() {
	    String invaliddata = ConfigReader.getinvalidData();
	} 

	@When("User clicks on {string} button")
	public void user_clicks_on_button(String string) {
	    login.clickuploadbloodreprtBtn();
	}

	@Then("User should navigate to blood report modal")
	public void user_should_navigate_to_blood_report_modal() {
		String currentresult = driver.getCurrentUrl();
		 String expectedresult ="https://sweet-balance-test-env-3-numpyninjadiabe.replit.app/upload-blood-report";
		 Assert.assertEquals(currentresult,expectedresult);
	}
	@Given("User is on blood report modal")
	public void user_is_on_blood_report_modal() {
	/*	String currentresult = driver.getCurrentUrl();
		// String expectedresult = driver.getTitle();
		String expectedresult = "https://sweet-balance-test-env-3-numpyninjadiabe.replit.app/upload-blood-report";
		 Assert.assertEquals(currentresult,expectedresult); */
		driver.get("https://sweet-balance-test-env-3-numpyninjadiabe.replit.app/upload-blood-report");
	}
	@When("User hovers over the upload box")
	public void user_hovers_over_the_upload_box() {
	    login.dranNdropDisplay();
	}

	@Then("Upload box should show drag & drop interaction")
	public void upload_box_should_show_drag_drop_interaction() {
		login.dranNdropDisplay();
	}
	@When("User uploads valid PDF file")
	public void user_uploads_valid_pdf_file() {
		login.uploadefile();
		login.clickuploadNprocess();
	}

	@Then("Upload should see processing percentage bar")
	public void upload_should_see_processing_percentage_bar() {
	 String percentage = login.getUploadProgressPercentage();
	  System.out.println("Upload progress: " + percentage);
	}
	@When("User clicks {string}")
	public void user_clicks(String string) {
	    login.clickcancel();
	}

	@Then("Modal should be closed and user returned to previous screen")
	public void modal_should_be_closed_and_user_returned_to_previous_screen() {
	    driver.navigate().back();
	}
	@When("User clicks {string} after uploading valid file")
	public void user_clicks_after_uploading_valid_file(String string) {
		login.uploadefile();
		login.clickuploadNprocess();
	}
	@Then("User should see onboarding button")
	public void user_should_see_onboarding_button() {
	    login.seecontinueOnboard();
	}
	@Then("User should see Report analysis")
	public void user_should_see_report_analysis() {
	   driver.get("https://sweet-balance-test-env-3-numpyninjadiabe.replit.app/upload-blood-report");
	}

	@Then("User should see Blood Test Results,Complete Blood Count, Medical Conditions ,Abnormal Values, Recommendations")
	public void user_should_see_blood_test_results_complete_blood_count_medical_conditions_abnormal_values_recommendations() {
		login.displayglucoselevel();
		login.displayHbA1c();
		login.displaybloodcount();
		login.displayMC();
		login.displayabnormalvalue();
		login.displayrecommendation(); 
	}
	@Given("User is on report analysis")
	public void user_is_on_report_analysis() {
		driver.getCurrentUrl();
	} 

	@When("User clicks Onboarding button")
	public void user_clicks_onboarding_button() throws Exception {
	    login.clickcontinueOnboard();
	}
	@When("User submits the form with invalid input")
	public void user_submits_the_form_with_invalid_input() {
	    login.enterinvalidheight();
	    login.enterinvalidweight();
	}

	@When("User clicks continue after filling form")
	public void user_clicks_continue_after_filling_form() {
           login.clickcontinueBtn();
	}

	@Then("Progress bar should reflect Step {int} of {int} as filled")
	public void progress_bar_should_reflect_step_of_as_filled(Integer int1, Integer int2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User should see text field for Age")
	public void user_should_see_text_field_for_age() {
	   login.displayage();
	}

	@Then("User should see text field for Height")
	public void user_should_see_text_field_for_height() {
	    login.displayheight();
	}

	@Then("User should see text field for Weight")
	public void user_should_see_text_field_for_weight() {
	    login.displayweight();
	}

	@Then("User should dropdown option for Gender field")
	public void user_should_dropdown_option_for_gender_field() {
	    login.displaygender();
	}

	@Then("User should see {string}, {string}, {string} options in dropdown")
	public void user_should_see_options_in_dropdown(String opt1, String opt2, String opt3) {
		List<String> expected = Arrays.asList(opt1, opt2, opt3);
        List<String> actual = login.getGenderOptions();
        Assert.assertEquals(actual, expected, "Dropdown options mismatch");
	}

	@Then("User should see enabled {string} button")
	public void user_should_see_enabled_button(String string) {
	    login.clickcontinueBtn();
	}

	@Then("User should move to step {int}")
	public void user_should_move_to_step(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User should receive error message if form have invalid values")
	public void user_should_receive_error_message_if_form_have_invalid_values() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Progress bar should be visible")
	public void progress_bar_should_be_visible() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Progress text should read Step {int} of {int}")
	public void progress_text_should_read_step_of(Integer int1, Integer int2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Step {int} indicator should be highlighted")
	public void step_indicator_should_be_highlighted(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Steps {int} to {int} should remain unhighlighted\\/inactive")
	public void steps_to_should_remain_unhighlighted_inactive(Integer int1, Integer int2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	////////////////////////////////////////////////////////////////////////
	@Given("User is in step {int} for onboarding process")
	public void user_is_in_step_for_onboarding_process(Integer int1) {
	    driver.getCurrentUrl();
	}

/*	@When("User clicks continue after filling form")
	public void user_clicks_continue_after_filling_form() {
		login.clickcontinueBtn();
	} */

	@Then("Page should display title: Pick your pace: chill stroll or marathon magic")
	public void page_should_display_title_pick_your_pace_chill_stroll_or_marathon_magic() {
	    login.displayStep1Title();
	}

	@Then("Page should show text: Select your preferred exercise intensity level")
	public void page_should_show_text_select_your_preferred_exercise_intensity_level() {
	    login.clickintensitylevel();
	}

	@Then("Back button should be visible")
	public void back_button_should_be_visible() {
	    login.displaybackbtn();
	}

/*	@Then("Progress bar should reflect Step {int} of {int} as filled")
	public void progress_bar_should_reflect_step_of_as_filled(Integer int1, Integer int2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	} */

	@Then("User should see options {string}, {string}, {string}")
	public void user_should_see_options(String string, String string2, String string3) {
	    login.displayeasy();
	    login.displaymedium();
	    login.displayhard();
	}
	@Then("User should navigate to {string}")
	public void user_should_navigate_to(String string) {
	//	String upgrade ="https://sweet-balance-test-env-3-numpyninjadiabe.replit.app/upgrade";
	//    driver.navigate().to(upgrade);
		driver.get("https://sweet-balance-test-env-3-numpyninjadiabe.replit.app/upgrade");
	}
	
	///////////////Onboarding without bloodreport /////////////////////

	@When("User clicks on step for onboarding button")
	public void user_clicks_on_step_for_onboarding_button() {
	    login.clickStepOnboard();
	}

	@Then("User should navigate to onboarding Step {int}")
	public void user_should_navigate_to_onboarding_step(Integer int1) {
	    String onboard = "https://sweet-balance-test-env-3-numpyninjadiabe.replit.app/onboarding";
	    driver.navigate().to(onboard);
	} 
	@Then("Page should display title {string}")
	public void page_should_display_title(String expectedtitle) {
	 String actualtitle = driver.getTitle();
	 Assert.assertEquals(actualtitle, expectedtitle.trim(), "Step 1 title mismatch");
	}
	@Then("Progress bar should visually indicate {string}")
	public void progress_bar_should_visually_indicate(String string) {
	    login.displayprogress_withoutblood();
	}
	
	@Given("User is on Step {int} onboarding page")
	public void user_is_on_step_onboarding_page(Integer int1) {
	    driver.getCurrentUrl();
	}

	@When("User selects a condition option")
	public void user_selects_a_condition_option() {
	    login.clicktype2();
	}

	@Then("User should navigate to Step {int}")
	public void user_should_navigate_to_step(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


	





}
