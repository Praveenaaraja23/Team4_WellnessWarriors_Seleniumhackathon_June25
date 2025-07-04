Feature: Login page field and functional Validation

  Background: 
    Given User is on SweetBalance homepage
    When User clicks on "Login" link

  Scenario: Verify email input accepts valid existing email
    Given User is on the login page
    When Registered user clicks continue with email button after entering a valid existing email
    Then User should get password field

  Scenario: Verify email input rejects invalid email
    When User enters an invalid email

  Scenario: Verify password field in login page
    When Registered user clicks continue with email button after entering a valid email
    Then User should see Sign in button

  Scenario: Verify sub text displays email
    When User clicks continue with email button after entering a valid email

  Scenario: Verify presence of forgot password link
    When Registered user clicks continue with email button after entering a valid email

  Scenario: Verify presence of placeholder in password field
    When Registered user clicks continue with email button after entering a valid email

  Scenario: Verify password input accepts valid existing user
    When Registered user clicks sign in after entering password
    Then User should be navigated to home page

  Scenario: Verify email input accepts valid new email
    When Unregistered user clicks continue with email button after entering a valid new email
    Then User should get "Complete your profile" form
