Feature: Functional and non functional test validation for premium account user 

Background: User is logged into the app 
	Given User is in home page 
	
Scenario Outline: Verify the presence of Pre-meal title in each meal section 

	When User clicks "<mealSection>" meal section
	Then User should see Pre-Meal title 
	Examples: 
		| mealSection  |
		| breakfast    |
		| lunch        |
		| dinner       |
		| snacks       |
		
Scenario Outline: Verify the presence of icon for Pre-meal  in each meal section 
	When User clicks "<mealSection>" meal section
	Then User should see alarm clock icon 
	Examples: 
		| mealSection  |
		| breakfast    |
		| lunch        |
		| dinner       |
		| snacks       |
		
Scenario Outline: Verify pre-meal title is shown before main meal 
	When User clicks "<mealSection>" meal section
	Then User should see pre-meal in first place of  each meal section 
	Examples: 
		| mealSection  |
		| breakfast    |
		| lunch        |
		| dinner       |
		| snacks       |
		
Scenario: Verify None is displayed for Pre-Meal Snack by default 
	When User clicks snack section 
	Then User should see Pre-Meal entry displays as None by default 
	
Scenario: Verify calorie in pre-meal snack 
	When User clicks snack section 
	Then User should see zero calorie in pre-meal snack
	
Scenario: Verify the presence of meal title for main meal in snack 
	When User clicks snack section 
	Then User should see meal title for main-meal in snack 
	
Scenario: Verify meal section contains dish description in snack 
	When User clicks snack section 
	Then User should see description for the dish in snack 
	
Scenario Outline: Verify the presence of Sub title Main-Meal 
	When User clicks "<mealSection>" meal section
	Then User should see Main-meal as sub title 
	Examples: 
		| mealSection  |
		| breakfast    |
		| lunch        |
		| dinner       |
		| snacks       |
		
Scenario Outline: Verify the presence of icon for main -meal 
	When User clicks "<mealSection>" meal section 
	Then User should see utensil icon for each main-meal 
	Examples: 
		| mealSection  |
		| breakfast    |
		| lunch        |
		| dinner       |
		| snacks       |
		
Scenario Outline: Validate the indicator for breakfast main-meal 
	When User clicks "<mealSection>" meal section 
	Then User should see indicator AM for breakfast main-meal 
	Examples: 
		| mealSection  |
		| breakfast    |
		
Scenario Outline: Validate the indicator for lunch main-meal 
	When User clicks "<mealSection>" meal section 
	Then User should see indicator PM for lunch  main-meal 
	Examples: 
		| mealSection  |
		| lunch        |
		
Scenario Outline: Validate the indicator for dinner main-meal 
	When User clicks "<mealSection>" meal section 
	Then User should see indicator PM for dinner  main-meal 
	Examples: 
		| mealSection  |
		| dinner       |
		
Scenario Outline: Validate the indicator for snack main-meal 
	When User clicks "<mealSection>" meal section 
	Then User should see indicator PM for snack  main-meal 
	Examples: 
		| mealSection  |
		| snacks       |
		

	


	
Scenario Outline: Validate the text   Calorie in main-meal 
	When User clicks "<mealSection>" meal section
	Then User should see text calorie after the calorie value in main meal 
Examples: 
		| mealSection  |
		| breakfast    |
		| lunch        |
	
Scenario Outline: Verify the presence of ✅ Completed button 
	When User clicks "<mealSection>" meal section
	Then user should see ✅ Completed button 
Examples: 
		| mealSection  |
		| breakfast    |
		| lunch        |
	
Scenario Outline: Verify the presence of ⚠️ Partially Completed button 
	When User clicks "<mealSection>" meal section
	Then user should see ⚠️ Partially Completed button 
Examples: 
		| mealSection  |
		| breakfast    |
		| lunch        |
	
Scenario Outline: Verify the presence of ❌ Not Completed button 
	When User clicks "<mealSection>" meal section
	Then user should see ❌ Not Completed button
Examples: 
		| mealSection  |
		| breakfast    |
		| lunch        | 
	

	
	
Scenario Outline: 
	Verify the presence of nutrition insight summary flex card in each meal section 
	When User clicks "<mealSection>" meal section
	Then Nutrition Insight summary card should be displayed in each meal section 
Examples: 
		| mealSection  |
		| snacks       |
	

	
Scenario Outline: Verify the sub title in flex card in each meal section 
	When User clicks "<mealSection>" meal section 
	Then User should see subtitle Calorie 
Examples: 
		| mealSection  |
		| snacks       |
	

	
Scenario Outline: Verify each meal calorie detail on the right side 
	When User clicks "<mealSection>" meal section 
	Then calorie detail for each meal should appear on the right side of its section 
Examples: 
		| mealSection  |
		| snacks       |
	
 
	
Scenario Outline: Verify that the donut chart is displayed 
	When User clicks "<mealSection>" meal section 
	Then User should see donut chart 
Examples: 
		| mealSection  |
		| snacks       |
	
Scenario Outline: Validate that donut chart displays total calories 
	When User clicks "<mealSection>" meal section 
	Then User should see total calories in donut chart
Examples: 
		| mealSection  |
		| snacks       | 
	

	 
	
Scenario Outline: Verify that bar chart is visible 
	When User clicks "<mealSection>" meal section 
	Then User should see macronutrient bar chart in each meal section 
Examples: 
		| mealSection  |
		| snacks       | 
	

	
Scenario Outline: Verify bar chart values match the macro values 
	When User clicks "<mealSection>" meal section 
	Then Each nutrient bar should show a value consistent with its label 
Examples: 
		| mealSection  |
		| snacks       | 
	
	
	
Scenario Outline: Verify presence of macro labels and percentages below the chart 
	When User clicks "<mealSection>" meal section 
	Then Below the chart, every macronutrient should display its name along with the corresponding percentage 
Examples: 
		| mealSection  |
		| snacks       |
	
	
Scenario: Verify the navigation of View Full meal Plan 
	When User Clicks View Meal Plan button 
	Then User should redirected to Full meal plan page 
	
Scenario: Verify the title in view plan 
	When User Clicks View Meal Plan button 
	Then User should see title  Full Meal Plan 
	
Scenario: Verify the presence of Back to plan button 
	When User Clicks View Meal Plan button 
	Then User should see  Back to plan button 
	
Scenario: Verify meal section button in view plan page 
	When User Clicks View Meal Plan button 
	Then User should see each meal section button