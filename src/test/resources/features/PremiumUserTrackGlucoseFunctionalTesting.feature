Feature: Premium User Functional testing for track glucose

   Background: PremiumUser is in blood glucose
   Given PremiumUser FT is in blood glucose


    Scenario: Verify user able to record reading
    When PremiumUser clicks record reading after valid reading
    Then User should see "Reading successfully recorded!"

    Scenario: Verify user unable to enter invalid value
    When PremiumUser enters invalid value in blood glucose
    Then User should see blank value 

    Scenario: Verify transition details highlights 
    When PremiumUser enters value in blood glucose
    Then User should see transition details highlights

    Scenario: Verify datepicker option 
    When PremiumUser clicks date picker 
    Then User should see date calendar

    Scenario: Verify the presence the previous button  in date picker
    When PremiumUser clicks date picker 
    Then User should see previous button in date

    Scenario: Verify the presence the Next button  in date picker
    When PremiumUser clicks date picker 
    Then User should see next button in date