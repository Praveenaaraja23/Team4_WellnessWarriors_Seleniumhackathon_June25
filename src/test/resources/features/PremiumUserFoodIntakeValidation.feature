Feature: PremiumUser FI Food Intake Validation

    Background:
    Given PremiumUser FI is in home page


    Scenario: Verify title in Food Intake form
    When PremiumUser FI clicks Food Intake 
    Then User FI should see title Food Intake Tracker

    Scenario: Verify subtext in form
    When PremiumUser FI clicks Food Intake 
    Then User FI should see subtext Track what you eat to manage your diabetes better

    Scenario: Verify the presence of  4 tabs in food intake
    When PremiumUser FI clicks Food Intake 
    Then User FI should see Breakfast, Lunch, dinner, snack tabs

    Scenario: Verify fields in food intake form
    When PremiumUser FI clicks Food Intake 
    Then User FI should see field for Food Name, Serving Size,Calories,Date,Notes

    Scenario: Verify default meal tab selection
    When PremiumUser FI clicks Food Intake 
    Then User FI should see Breakfast tab selected by default

    Scenario: Verify input field for food name
    When PremiumUser FI clicks Food Intake 
    Then User FI should see input field for field food name 

    Scenario: Verify the presence of dropdown for serving size
    When PremiumUser FI clicks Food Intake 
    Then User FI should see  dropdown for serving size



    Scenario: Verify the dropdown options for serving size
    When PremiumUser FI clicks Food Intake 
    Then User FI should see cups custom

    Scenario: Verify the presence calculator icon in calorie
    When PremiumUser FI clicks Food Intake 
    Then User FI should see calculator icon in calorie

    Scenario: Verify the input field for calorie
    When PremiumUser FI clicks Food Intake 
    Then User FI should see input field for calorie


    Scenario: Verify helper text below Calories field
    When PremiumUser FI clicks Food Intake 
    Then User FI should see helper text Enter calories or click the calculator icon for automatic calculation. 

    Scenario: Verify the date picker option
    When PremiumUser FI clicks Food Intake 
    Then User FI should see date picker 

    Scenario: Verify the save food entry button
    When PremiumUser FI clicks Food Intake 
    Then User FI should see save food entry button