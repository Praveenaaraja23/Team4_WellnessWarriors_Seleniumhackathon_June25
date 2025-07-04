Feature: Verification on  button navigation in home page

Background: User In home Screen
 Given Home Button User is in home screen


    Scenario: Verify the navigation of blood glucose 
    When User clicks on Blood glucose button
    Then User should redirect to Blood Glucose popup window

    Scenario: Verify the navigation of Physical activity 
    When User clicks on physical activity button
    Then User should redirect to physical activity popup window

    Scenario: Verify the navigation of  food intake
    When User clicks on food intake button
    Then User should redirect to food intake popup window

    Scenario: Verify the navigation of  medication
    When User clicks on medication button
    Then User should redirect to medication popup window

    Scenario: Verify the navigation of log button
    When User clicks log button
    Then User should redirected to dashboard page

    Scenario: Verify user able to change the log 
    Given User is in dashboard page
    When User clicks home tab after logging emotional state in dashboard
    Then User should see emoji and mood text is changed
