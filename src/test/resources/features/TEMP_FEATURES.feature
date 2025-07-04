Feature: Validation for View full meal plan

Background:
Given User is in View Meal plan

    Scenario Outline: Verify each meal section have Pre meal title 
    
    When User clicks Meal sections "<mealSection>" 
    Then Each meal section should display a pre-meal item with the format
Examples: 
		| mealSection  |
		| breakfast    |
		
		    Scenario Outline: Verify meal preparation in view full plan for each meal section
    When User clicks Meal sections "<mealSection>"
    Then Preparation instructions displayed if available
 Examples: 
		| mealSection  |
		| breakfast    |

