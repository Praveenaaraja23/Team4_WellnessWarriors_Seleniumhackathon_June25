Feature: Premium User Physical activity Validation

   Background: PremiumUser PA is in blood glucose
   Given PremiumUser PA is in home page

    Scenario: Verify title in physical activity form
    When PremiumUser PA clicks physical activity 
    Then User should see title Physical Activity

    Scenario: Verify subtext in form
    When PremiumUser PA clicks physical activity 
    Then User should see subtext Track your fitness journey

    Scenario: Verify fields in track glucose 
    When PremiumUser PA clicks physical activity 
    Then User should see field for Activity Type, Duration,Date,Intensity

    Scenario: Verify the presence of dropdown for Activity Type 
    When PremiumUser PA clicks physical activity 
    Then User should see  dropdown for activity type

    Scenario: Verify the presence input for Duration 
    When PremiumUser PA clicks physical activity 
    Then User should see  input field for duration

    Scenario: Verify the placeholder text for Duration
    When PremiumUser PA clicks physical activity 
    Then User should see thirty in placeholder field

    Scenario: Verify dropdown for duration options
    When PremiumUser PA clicks physical activity 
    Then User should see drop down duration 

    Scenario: Verify droption option in duration
    When PremiumUser PA clicks physical activity 
    Then User should see minutes, hours

    Scenario: Verify the date picker option
    When PremiumUser PA clicks physical activity 
    Then PA User should see date picker 

    Scenario: Verify the presence of intensity
    When PremiumUser PA clicks physical activity 
    Then User should see intensity field


    Scenario: Verify the save activity button
    When PremiumUser PA clicks physical activity 
    Then User should see save activity button
