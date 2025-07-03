Feature: Subscription page validation

   Background:
    Given a free test user logs in and opens the Free vs Premium Account Features page

  @tag @subs
  Scenario: Verify Daily Meal Plan availability
    Given The user is viewing the Free vs Premium Account Features page
    When The user does not take any action
    Then Both Free and Premium should show Daily Meal Plan as available

  @tag @subs
  Scenario: Verify Weekly Meal Plan availability
    Given The user is viewing the Free vs Premium Account Features page
    When The user does not take any action
    Then Weekly Meal Plan should be available only in Premium

  @tag @subs
  Scenario: Verify Personalized Exercise Plan availability
    Given The user is viewing the Free vs Premium Account Features page
    When The user does not take any action
    Then Personalized Exercise Plan should be available only in Premium

  @tag @subs
  Scenario: Verify 10-Day Quick Reversal Plan availability
    Given The user is viewing the Free vs Premium Account Features page
    When The user does not take any action
    Then 10-Day Quick Reversal Plan should be available only in Premium

  @tag @subs
  Scenario: Verify 30-Day Blood Sugar Reduction Plan availability
    Given The user is viewing the Free vs Premium Account Features page
    When The user does not take any action
    Then 30-Day Blood Sugar Reduction Plan should be available only in Premium

  @tag @subs
  Scenario: Verify Glucose Level Graph availability
    Given The user is viewing the Free vs Premium Account Features page
    When The user does not take any action
    Then Both Free and Premium should show Glucose Level Graph as available

  @tag @subs
  Scenario: Verify BMI Calculation availability
    Given The user is viewing the Free vs Premium Account Features page
    When The user does not take any action
    Then Both Free and Premium should show BMI Calculation as available

  @tag @subs
  Scenario: Verify Downloadable Meal Plan PDF availability
    Given The user is viewing the Free vs Premium Account Features page
    When The user does not take any action
    Then Downloadable Meal Plan PDF should be available only in Premium

  @tag @subs
  Scenario: Verify Reminders availability
    Given The user is viewing the Free vs Premium Account Features page
    When The user does not take any action
    Then "Reminders (Medication, Appointments, Health Tasks)" should be available only in Premium

  @tag @subs
  Scenario: Verify "Continue Free" button is visible
    Given The user is viewing the Free vs Premium Account Features page
    When The user does not take any action
    Then The "Continue Free" button should be visible

  @tag @subs
  Scenario: Verify "Upgrade to Premium" button is visible
    Given The user is viewing the Free vs Premium Account Features page
    When The user does not take any action
    Then The "Upgrade to Premium" button should be visible

  @tag @subs
  Scenario: Verify Free Account label and price
    Given The user is viewing the Free vs Premium Account Features page
    When The user does not take any action
    Then It should display "Free Account" with "$0/month"

  @tag @subs
  Scenario: Verify Premium Account label and price
    Given The user is viewing the Free vs Premium Account Features page
    When The user does not take any action
    Then It should display "Premium Account" with "$9.99/month"

  @tag @subs
  Scenario: Verify unavailable features are marked with red X
    Given The user is viewing the Free vs Premium Account Features page
    When The user does not take any action
    Then Features not included should have red X icons

  @tag @subs
  Scenario: Verify available features are marked with green tick
    Given The user is viewing the Free vs Premium Account Features page
    When The user does not take any action
    Then All included features should have green check-marks

  @tag @subs
  Scenario: Verify total number of features listed
    Given The user is viewing the Free vs Premium Account Features page
    When The user does not take any action
    Then It should list exactly 9 features

  @tag @subs
  Scenario: Verify position of "Continue Free" button
    Given The user is viewing the Free vs Premium Account Features page
    When The user does not take any action
    Then The "Continue Free" button should appear under the Free column

  @tag @subs
  Scenario: Verify position of "Upgrade to Premium" button
    Given The user is viewing the Free vs Premium Account Features page
    When The user does not take any action
    Then The "Upgrade to Premium" button should appear under the Premium column

  @tag @subs
  Scenario: Verify Terms & Conditions and Privacy Policy text is visible
    Given The user is viewing the Free vs Premium Account Features page
    When The user does not take any action
    Then Terms & Conditions and Privacy Policy text should be visible

  @tag @subs
  Scenario: Verify upgrade message header is displayed
    Given The user is viewing the Free vs Premium Account Features page
    When The user does not take any action
    Then It should show the text "Upgrade to premium for complete diabetes management?"

  @tag @subs
  Scenario: Verify visual separation between Free and Premium plans
    Given The user is viewing the Free vs Premium Account Features page
    When The user does not take any action
    Then The Free and Premium plans should be displayed side-by-side in clearly separated columns
