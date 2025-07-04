Feature: Complete Profile Form validation for new user

  Background: 
    Given User is on SweetBalance homepage
    When User clicks on "Login" link
    And User is on the login page

  Scenario: Verify Full Name field is visible
    When User clicks continue with email button after entering a valid new email
    Then "Full Name" input field should be displayed

  Scenario: Verify Username field is visible
    When User clicks continue with email button after entering a valid new email
    Then "Username" input field should be displayed

  Scenario: Verify Password field is visible
    When User clicks continue with email button after entering a valid new email
    Then "Password" input field should be displayed

  Scenario: Verify Terms & Conditions checkbox is visible
    When User clicks continue with email button after entering a valid new email

  Scenario: Verify Create Account button is disabled initially
    When User clicks continue with email button after entering a valid new email
