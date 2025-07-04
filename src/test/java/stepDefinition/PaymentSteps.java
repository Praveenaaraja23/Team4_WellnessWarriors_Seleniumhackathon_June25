package stepDefinition;

import static org.testng.Assert.assertTrue;
import io.cucumber.java.en.*;
import pageFactory.PaymentPage;

public class PaymentSteps {

    private final PaymentPage paymentPage = new PaymentPage();

    
    @When("the user clicks Pay without entering any card details")
    public void the_user_pay_without_entering_any_card_details() { 
    	paymentPage.clickPay(); 
    }

    @Then("user should see field specific messages")
    public void user_should_see_field_specific_messages() {
        assertTrue(
            paymentPage.hasValidationMessage("Please correct the errors", 8) ||
            paymentPage.hasValidationMessage("incomplete", 8),   
            "Expected at least one validation error to appear");
    }
  
    @When("the user enters an invalid card number and clicks Pay")
    public void the_user_enters_an_invalid_card_number_and_clicks_pay() {
        paymentPage.enterCardNumber("1111 1111 1111 1111");
        paymentPage.clickPay();
    }
    
    @Then("an {string} message should be displayed")
    public void an_message_should_be_displayed(String expected) {

        boolean found = paymentPage.hasValidationMessage(expected) ||
                        paymentPage.hasValidationMessage(
                            expected.replace("'", "’"));

        assertTrue(found, "Expected error: " + expected);
    }

    @When("the user enters an expired card and clicks Pay")
    public void the_user_enters_an_expired_card_and_clicks_pay() {
        paymentPage.enterCardNumber("4242 4242 4242 4242");
        paymentPage.enterExpiry("05/23");
        paymentPage.enterCvc("555");
        paymentPage.clickPay();
    }

    @When("the user enters valid payment details and clicks Pay")
    public void the_user_enters_valid_payment_details_and_clicks_pay() {
        paymentPage.enterCardNumber("4242 4242 4242 4242");
        paymentPage.enterExpiry("12/30");
        paymentPage.enterCvc("555");
        paymentPage.clickPay();
    }

    @Then("the Premium confirmation screen should appear")
    public void the_premium_confirmation_screen_should_appear() {
        assertTrue(paymentPage.confirmationScreenVisible(),
                   "Premium confirmation did not appear");
    }
}
