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

    
  @TodaysExerciseSchedule
  Scenario Outline: Verify "<Element>" is displayed in Today's Exercise Schedule page
    Given User is on the Exercise section
    When User clicks the View Full Schedule button
    Then "<Element>" should be displayed on Today's Exercise Schedule page

    Examples:
      | Element                    |
      | Today's Exercise Schedule  |
      | Back to Home               |
      | Warm Up Section            |
      | Warm Up Exercise Name      |
      | Warm Up Description        |
      | Warm Up Duration           |
      | Warm Up Calories           |
      | Warm Up Intensity Level    |
      | Main Workout Section       |
      | Main Workout Exercise Name |
      | Main Workout Description   |
      | Main Workout Duration      |
      | Main Workout Calories      |
      | Main Workout Intensity Level |
      | Cool Down Section          |
      | Cool Down Exercise Name    |
      | Cool Down Description      |
      | Cool Down Duration         |
      | Cool Down Calories         |
      | Cool Down Intensity Level  |
      | Total Duration             |

 
  @ExerciseIntensity
  Scenario: Verify the intensity value
    Given User is on the Exercise section
    When User clicks the View Full Schedule button
    Then Exercise intensity should be Low, Medium, or High

 
  @WorkoutDuration
  Scenario: Verify total duration matches the sum of individual workout durations
    Given User is on the Exercise section
    When User clicks the View Full Schedule button
    Then Total duration should equal the sum of all individual durations

 
  @WorkoutCalories
  Scenario: Verify total calories matches the sum of individual workout calories
    Given User is on the Exercise section
    When User clicks the View Full Schedule button
    Then Total calories should equal the sum of all individual calories


    
