Feature: Validation for Home page – Meal-section tabs (free user)
  
  Background:
    Given a new free user is logged in and on the Home page
    
@tag @hms
  Scenario Outline: Meal-tab <tab> shows its details card
    When the user clicks the "<tab>" meal tab
    Then the details card for "<tab>" is visible

    Examples:
      | tab        |
      | Breakfast  |
      | Lunch      |
      | Dinner     |
      | Snacks     |