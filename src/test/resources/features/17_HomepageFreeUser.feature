Feature: Home-page validation for a registered Free account user

  Background:
    Given a new free user is logged in and on the Home page


  @tag @hpfu
  Scenario: Navigation bar shows items in correct order
    When the user observes the top navigation bar
    Then the navigation bar should list items in the exact order "Home, Dashboard, Education"

  @tag @hpfu
  Scenario: “Today’s Meal Plan” title has a caret toggle icon
    When the user inspects the “Today's Meal Plan” section header
    Then a collapse-toggle caret icon is visible next to the title

  @tag @hpfu
  Scenario Outline: Nutrition Insights card for <meal> (free user)
    When the free user clicks the "<meal>" meal tab
    Then the card shows the heading "Nutrition Insights"
    Then a horizontal nutrition bar for Carbs, Protein and Fat is displayed
    Then the pre-meal title (e.g. pre-breakfast) is shown
    Then Carbs, Protein and Fat values are present
    Then intake time is displayed for the <meal> pre-meal
    Examples:
      | meal      |
      | Breakfast |
      | Lunch     |
      | Dinner    |
      | Snacks    |

  @tag @hpfu
  Scenario: Snack pre-meal shows PM indicator and hh:mm clock
    When the free user clicks the "Snacks" meal tab
    Then the pre-meal indicator reads "PM"
    Then the time is in "hh:mm" format
    Then a dot separator appears between time and calories

  @tag @hpfu
  Scenario: View Full Plan button sends free user to subscription page
    When the user clicks the “View Full Plan” button in the meal section
    Then the user is redirected to the subscription page

  @tag @hpfu
  Scenario: Exercise section header for free user
    When the user views the Exercise section header
    Then the title "Today's Exercise Plan" is displayed

  @tag @hpfu
  Scenario: View Full Schedule button sends free user to subscription page
    When the user clicks the “View Full Schedule” button in the exercise section
    Then the user is redirected to the subscription page
