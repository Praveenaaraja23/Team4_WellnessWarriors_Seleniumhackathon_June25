Feature: Home Page – Meal Section Details

  Background:
    Given a new free user is logged in and on the Home page

  @tag @hmd
  Scenario Outline: Meal-tab <mealType> shows its details card with time
    When the user selects the "<mealType>" tab in the meal section
    Then the user should see the dish title
    Then the user should see the description for the dish
    Then the user should see the pre-meal item name
    Then the user should see the pre-meal calorie value
    Then the user should see the "<indicator>" indicator for the "<mealType>" pre-meal
    Then the user should see the pre-meal time in "hh:mm" format
    Then the user should see each macro’s unit displayed as "g"

    Examples:
      | mealType  | indicator |
      | Breakfast | AM        |
      | Lunch     | PM        |
      | Dinner    | PM        |

  @tag @hmd
  Scenario: Meal-tab Snacks shows its details card without time
    When the user selects the "Snacks" tab in the meal section
    Then the user should see the dish title
    Then the user should see the description for the dish
    Then the user should see the pre-meal item name
    Then the user should see the pre-meal calorie value
    Then the user should see each macro’s unit displayed as "g"
