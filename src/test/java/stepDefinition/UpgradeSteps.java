package stepDefinition;

import static org.testng.Assert.*;

import io.cucumber.java.en.*;

import pageFactory.SubscriptionPage;
import pageFactory.UpgradePage;
import org.openqa.selenium.WebDriver;
import utilities.DriverManager;

public class UpgradeSteps {

    private final SubscriptionPage subscriptionPage = new SubscriptionPage();
    private final UpgradePage upgradePage = new UpgradePage();

    @Given("the user clicks the Upgrade to Premium button")
    public void the_user_clicks_the_upgrade_to_premium_button() {
        subscriptionPage.clickUpgrade();
    }


    @Given("the user is on the Upgrade to Premium payment page")
    public void the_user_is_on_the_upgrade_to_premium_payment_page() {
        assertEquals(upgradePage.getTitle().trim(), "Upgrade to Premium",
                     "User isn’t on the Upgrade page");
    }
 
    @When("the user does not take any action")
    public void the_user_does_not_take_any_action() {
    	//user does no action
    }

    @Then("the page title should be {string}")
    public void the_page_title_should_be(String expected) {
        assertEquals(upgradePage.getTitle().trim(), expected);
        //had some issues with extra spacing so used trim
    }

    @Then("the subtitle should be {string}")
    public void the_subtitle_should_be(String expected) {
        assertTrue(upgradePage.subtitleIsVisible());
        assertTrue(upgradePage.getTitle().contains("Upgrade")); 
        assertTrue(expected.equalsIgnoreCase(  //allows both uppercase and lowercase 
                "Get personalized insights and advanced features to better manage your diabetes."));
    }

    @Then("the page should list {string}")
    public void the_page_should_list(String feature) {
        assertTrue(upgradePage.isFeatureListed(feature),
                   "Feature \"" + feature + "\" missing");
    }

    @Then("the text {string} should be visible")
    public void the_text_should_be_visible(String txt) {
        
        assertTrue(upgradePage.subtitleIsVisible());        
        assertTrue(upgradePage.pageContainsText(txt),
                  "Expected to find text \"" + txt + "\" on upgrade page");
    }

    @Then("the price should be displayed as {string}")
    public void the_price_should_be_displayed_as(String amount) {
        assertTrue(upgradePage.isPriceDisplayed());
        assertTrue(DriverManager.getDriver().getPageSource().contains(amount));
    }

    @Then("the heading {string} should be visible")
    public void the_heading_should_be_visible(String heading) {
        assertTrue(upgradePage.cardHeadingIsVisible());
    }

    @Then("the card number field should be visible")
    public void the_card_number_field_should_be_visible() {
        assertTrue(upgradePage.cardNumberFieldIsVisible());
    }
    @Then("the expiration date field should be visible")
    public void the_expiration_date_field_should_be_visible() {
        assertTrue(upgradePage.expDateFieldIsVisible());
    }
    @Then("the CVV field should be visible")
    public void the_cvv_field_should_be_visible() {
        assertTrue(upgradePage.cvvFieldIsVisible());
    }

    @Then("the button {string} should be visible")
    public void the_button_should_be_visible(String label) {
        assertTrue(label.equals("Pay $9.99 USD"), "Unexpected label");
        assertTrue(upgradePage.payButtonIsVisible());
    }

    @Then("the terms-of-service notice should be visible")
    public void the_terms_of_service_notice_should_be_visible() {
    	assertTrue(upgradePage.termsNoticeIsVisible(),
                "Terms-of-service notice should be visible");
    }
    
    @Then("the auto-renewal disclaimer should be visible")
    public void the_auto_renewal_disclaimer_should_be_visible() {
    	assertTrue(upgradePage.autoRenewNoticeIsVisible()); }

}
