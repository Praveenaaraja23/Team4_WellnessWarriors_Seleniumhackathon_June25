
Feature: Verification on Diabetes Risk Analyzer Modal
@Riskanalyze_01
  Scenario: Validate modal dialog heading
    Given The Users is on SweetBalance homepage
    When User clicks on "Check Your Risk" button on launch page
    Then User should see "Diabetes Risk Analyzer" header

  @Riskanalyze_02
  Scenario: Validate modal dialog sub text
    Given The Users is on SweetBalance homepage
    When User clicks on "Check Your Risk" button on launch page
    Then User should see "Answer a few questions to assess your risk of developing diabetes" text

  @Riskanalyze_03
  Scenario: Verify the presence of Cancel button
    Given The Users is on SweetBalance homepage
   When User clicks on "Check Your Risk" button on launch page
    Then User should see Cancel button

  @Riskanalyze_04
  Scenario: Verify the presence of Calculate Risk button
    Given The Users is on SweetBalance homepage
    When User clicks on "Check Your Risk" button on launch page
    Then User should see Calculate Risk button

  @Riskanalyze_05
  Scenario: Validate "Calculate Risk" is disabled
    Given The Users is on SweetBalance homepage
    When User clicks on "Check Your Risk" button on launch page
    Then User should see Calculate Risk button disabled

  @Riskanalyze_06
  Scenario: Verify age field with Stepper controls
    Given The Users is on SweetBalance homepage
    When User clicks on "Check Your Risk" button on launch page
    Then User should see Age input field to have stepper controls

  @Riskanalyze_07
  Scenario: Verify weight field with Stepper controls
    Given The Users is on SweetBalance homepage
    When User clicks on "Check Your Risk" button on launch page
    Then User should see Weight input field to have stepper controls

  @Riskanalyze_08
  Scenario: Verify the presence of checkbox for family history
    Given The Users is on SweetBalance homepage
    When User clicks on "Check Your Risk" button on launch page
    Then User should see checkbox for Family history of diabetes field

  @Riskanalyze_09
  Scenario: Verify the placeholder text for Age field
    Given The Users is on SweetBalance homepage
    When User clicks on "Check Your Risk" button on launch page
    Then User should be able to view the placeholder "Enter your age (1–150)" in the age field

  @Riskanalyze_10
  Scenario: Verify the placeholder text for Weight field
    Given The Users is on SweetBalance homepage
    When User clicks on "Check Your Risk" button on launch page
    Then User should see "Enter your weight in kg (1-999)" in the weight field

  @Riskanalyze_11
  Scenario: Verify the dropdown for Physical Activity Level
    Given The Users is on SweetBalance homepage
    When User clicks on "Check Your Risk" button on launch page
    Then User should see dropdown for Physical Activity Level

  @Riskanalyze_12
  Scenario: Verify the dropdown for Blood Pressure
    Given The Users is on SweetBalance homepage
    When User clicks on "Check Your Risk" button on launch page
    Then User should see dropdown for Blood Pressure

  @Riskanalyze_13
  Scenario: Verify the dropdown for Diet Quality
    Given The Users is on SweetBalance homepage
    When User clicks on "Check Your Risk" button on launch page
    Then User should see dropdown for Diet Quality

  @Riskanalyze_14
  Scenario: Verify initial value for Physical Activity Level dropdown
    Given The Users is on SweetBalance homepage
    When User clicks on "Check Your Risk" button on launch page
    Then User should see "Select activity level" as the default option

  @Riskanalyze_15
  Scenario: Verify initial value for Blood Pressure dropdown
    Given The Users is on SweetBalance homepage
    When User clicks on "Check Your Risk" button on launch page
    Then User should see "Select blood pressure status" as the default option

  @Riskanalyze_16
  Scenario: Verify initial value for Diet Quality dropdown
    Given The Users is on SweetBalance homepage
    When User clicks on "Check Your Risk" button on launch page
    Then User should see "Select diet quality" as the default option

  @Riskanalyze_17
  Scenario: Verify values in Physical Activity Level dropdown
    Given The Users is on SweetBalance homepage
    When User clicks on "Check Your Risk" button on launch page
    Then User should see "Active (Exercise 3+ times a week), Moderate (Exercise 1-2 times a week), Sedentary (Rarely exercise)" in the "Physical Activity Level" dropdown

  @Riskanalyze_18
  Scenario: Verify values in Blood Pressure dropdown
    Given The Users is on SweetBalance homepage
    When User clicks on "Check Your Risk" button on launch page
    Then User should see "Normal, Elevated, High" in the "Blood Pressure" dropdown

  @Riskanalyze_19
  Scenario: Verify values in Diet Quality dropdown
    Given The Users is on SweetBalance homepage
    When User clicks on "Check Your Risk" button on launch page
    Then User should see "Excellent (Balanced, mostly whole foods), Average (Mixed whole foods and processed foods), Poor (Mostly processed foods, high sugar)" in the "Diet Quality" dropdown
    
    

  Scenario: Validate "Cancel" button navigates to the home page
    Given User is in diabetes risk analyzer
    When User clicks Cancel button
    Then User should be returned to the home page

  Scenario: Validate "Calculate Risk" button is enabled when all fields are filled
    Given User is in diabetes risk analyzer
    When User enters values in all fields
    Then User should see "Calculate Risk" button is enabled

  Scenario: Verify valid values submission shows risk assessment dialog
    Given User is in diabetes risk analyzer
    When User clicks "Calculate Risk" button after entering valid values in all fields
    Then User should see "Your Diabetes Risk Assessment" dialog box
     