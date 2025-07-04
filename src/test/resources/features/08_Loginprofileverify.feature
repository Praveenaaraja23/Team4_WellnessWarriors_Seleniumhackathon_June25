Feature: Profile form verification

  Background: 
    Given User is on complete profile form page

  Scenario: Verify Create Account button is enabled after valid input
    When User checks the Terms & conditions box after filling all fields

  Scenario: Verify Create account form with valid data
    When User clicks create account button after filling valid data in all fields
    Then User should redirected to upload blood report

  Scenario: Verify Create account form with invalid data
    When User clicks create account button after filling invalid data

  Scenario: Verify presence of Upload Blood Report button
    When User clicks create account button after filling valid data in all fields
    
  Scenario: Verify presence of Step Through Onboarding button
    When User clicks create account button after filling valid data in all fields
