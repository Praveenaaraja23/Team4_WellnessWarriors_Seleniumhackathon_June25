Feature: Upgrade-to-Premium payment validation

  Background:
    Given a free test user logs in and opens the Free vs Premium Account Features page
    Given the user clicks the Upgrade to Premium button

  @tag @pay
  Scenario: User clicks Pay with empty fields
    Given the user is on the Upgrade to Premium payment page
    When  the user clicks Pay without entering any card details
    Then  user should see field specific messages

  @tag @pay
  Scenario: User clicks Pay with an invalid card number
    Given the user is on the Upgrade to Premium payment page
    When  the user enters an invalid card number and clicks Pay
    Then  an "Your card number is invalid" message should be displayed

  @tag @pay
  Scenario: User clicks Pay with an expired card
    Given the user is on the Upgrade to Premium payment page
    When  the user enters an expired card and clicks Pay
    Then  an "Your card's expiration year is in the past" message should be displayed

  @tag @pay
  Scenario: User clicks Pay with valid payment details
    Given the user is on the Upgrade to Premium payment page
    When  the user enters valid payment details and clicks Pay
    Then  the Premium confirmation screen should appear
