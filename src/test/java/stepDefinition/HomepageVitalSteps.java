package stepDefinition;

import static org.testng.Assert.*;

import io.cucumber.java.en.*;

import pageFactory.HomepageVitalPage;

public class HomepageVitalSteps {
    
    private static final String TEST_EMAIL    = "freeuser@gmail.com";
    private static final String TEST_PASSWORD = "phase2selenium";
   
    private final HomepageVitalPage vitalPage = new HomepageVitalPage();
   
    @Given("a new free user is logged in and on the Home page")
    public void a_free_user_logs_in_and_opens_the_home_page() {

        vitalPage.openFirstPage();              
        vitalPage.clickLogin();                
        vitalPage.enterEmail(TEST_EMAIL);      
        vitalPage.clickContinueWithEmail();     
        vitalPage.enterPassword(TEST_PASSWORD); 
        vitalPage.clickSignIn();                

        assertTrue(vitalPage.isLoaded(), "Home page failed to load");
    }

    @When("nothing else is done")
    public void nothing_else_is_done() {
        
    }
    
    @Then("the element labelled {string} is visible in the header or nav bar")
    public void element_labelled_is_visible_in_header_or_nav_bar(String label) {
        assertTrue(vitalPage.isElementVisible(label),
                   "Element not visible: " + label);
    }

    @Then("the label {string} is visible in the Current-status section")
    public void label_is_visible_in_current_status_section(String label) {
        assertTrue(vitalPage.isStatusLabelVisible(label),
                   "Status label missing: " + label);
    }

    @Then("a timestamp appears after {string}")
    public void timestamp_appears_after(String ignoredLabel) {
        assertNotNull(vitalPage.getTimestamp(),
                      "Timestamp missing after " + ignoredLabel);
    }

    @Then("^the timestamp shows hh:mm with AM/PM or a relative time such as x min/h ago$")
    public void timestamp_shows_12h_or_relative_time() {

        String timestampText = vitalPage.getTimestamp().trim();

        boolean twelveHour = timestampText.matches("\\d{1,2}:\\d{2}\\s?(AM|PM)");
        boolean relative   = timestampText.matches(
            "\\d+\\s*(h|hr|hrs|hour|hours|min|mins|minute|minutes)\\s*ago"
        );

        assertTrue(twelveHour || relative, //absolute/exact time OR thismuch min/houraago
                   "Unexpected timestamp format: " + timestampText);
    }

    @Then("the numeric value for {string} is visible")
    public void numeric_value_for_metric_is_visible(String metric) {
        assertNotNull(vitalPage.getVitalsValue(metric),
                      "Value not shown for: " + metric);
    }


    @When("the app shows HbA1C value {double}")
    public void the_app_shows_hba1c_value(double value) {

        vitalPage.setHbA1CValue(value);    
        String condition =
                value < 5.7 ? "Normal" :
                value < 6.5 ? "Pre-Diabetic" :
                               "Diabetic";

        vitalPage.setHbA1CCondition(condition);
    }

    @Then("the condition text equals {string}")
    public void the_condition_text_equals(String expected) {
        assertEquals(vitalPage.getHbA1CConditionText(), expected,
                     "HbA1C condition mismatch");
    }

    @When("the app shows BMI value {double}")
    public void the_app_shows_bmi_value(double bmi) {

        vitalPage.setBMIValue(bmi);

        String category =
                bmi < 18.5 ? "Underweight" :
                bmi < 25   ? "Normal"       :
                bmi < 30   ? "Overweight"   :
                             "Obese";

        vitalPage.setBMICategory(category);
    }

    @Then("the category text equals {string}")
    public void the_category_text_equals(String expected) {
        assertEquals(vitalPage.getBMICategoryText(), expected,
                     "BMI category mismatch");
    }

    @Then("the unit {string} appears just below the Average Blood Sugar value")
    public void unit_appears_below_average_blood_sugar(String expected) {
        assertEquals(vitalPage.getUnitBelowAvgBloodSugar(), expected,
                     "Incorrect unit under Average Blood Sugar");
    }

    @Then("the flex container shows a title element")
    public void the_flex_container_shows_a_title_element() {
        assertTrue(vitalPage.mealPlanTitleIsVisible(),
                   "Meal-Plan title is missing");
    }

    @Then("the section titled {string} is visible")
    public void the_section_titled_is_visible(String title) {
        assertTrue(vitalPage.sectionIsVisible(title),
                   "Section not visible: " + title);
    }

    @Then("the sidebar tab container inside the flex layout is visible")
    public void the_sidebar_tab_container_inside_flex_layout_is_visible() {
        assertTrue(vitalPage.mealPlanSidebarVisible(),
                   "Sidebar tab container is not visible");
    }
}
