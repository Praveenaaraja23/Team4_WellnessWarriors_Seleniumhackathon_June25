@PremiumExercise
Feature: Premium user Exercise Module on Homepage

  Background: Premium User is in home page after logging in
    Given The user is on the Home page and clicks Sign In
    When The user enters valid credentials and logs in

  
  @ExercisePage
  Scenario Outline: Verify "<Element>" is displayed on the Exercise page
    Given User is on the homepage
    When User clicks the Exercise option from the side panel
    Then "<Element>" should be displayed on the Exercise page

    Examples:
      | Element             |
      | View Full Schedule  |
      | Warm Up             |
      | Main Workout        |
      | Cool Down           |

 
  @ExerciseNavigation
  Scenario: Verify navigation to "Today's Exercise Schedule" page from homepage
    Given User is on the homepage
    When User clicks the Exercise option from the side panel
    And User clicks the View Full Schedule button
    Then User should be redirected to Today's Exercise Schedule page
