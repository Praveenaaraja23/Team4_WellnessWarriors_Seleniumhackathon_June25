Feature: Functional testing for Food Intake 

Background:
PremiumUser FIFT  is in the Breakfast section of the Food Intake Tracker 
	Given PremiumUser FIFT  is in the Breakfast section of the Food Intake Tracker 
	
Scenario: Verify user able to save food entry with invalid value 
	When PremiumUser FIFT  clicks save food entry button after entering invalid value in food name 
	Then User FIFT should see alert with message  Failed to save food intake 
	
Scenario:
Verify user error message for invalid value in calorie using  calculator 
	When PremiumUser FIFT  enters invalid value in food name 
	Then User FIFT should see error message Please enter valid food name 
	
Scenario: Verify the presence of automatic calorie calculation in calorie field 
	When PremiumUser FIFT  enters valid food name 
	Then User FIFT should see calorie value for the food name calculated automatically 
	
Scenario: Verify the presence of helper text after automatic calorie calculation 
	When PremiumUser FIFT  enters valid food name 
	Then User FIFT should see helper text after automatic calorie calculation 
	
Scenario: Verify helper text after automatic calorie calculation 
	When PremiumUser FIFT  enters valid food name 
	Then User FIFT should see Calories calculated automatically. You can edit if needed. as helper text in calorie field 
	
Scenario:
Verify user able to edit the calorie value after automatic calorie calculation 
	When PremiumUser FIFT  edit calorie value after automatic calorie calculation 
	Then User FIFT should see edited value in automatic calorie value 
	
Scenario: Verify user able to save food entry with null value in food name 
	When PremiumUser FIFT  clicks the Save Food Entry button after leaving the Food Name field empty 
	Then User FIFT should see an error message indicating that the Food Name is required 
	
Scenario: Verify datepicker option 
	When PremiumUser FIFT  clicks on date field 
	Then User FIFT should see date calendar 
	
Scenario: Verify date in picker 
	When PremiumUser FIFT  clicks on date field 
	Then User FIFT should see today's date highlighted 
	
Scenario: Verify the presence the previous button  in date picker 
	When PremiumUser FIFT  clicks on date field 
	Then User FIFT should see previous button in date 
	
Scenario: Verify the presence the Next button  in date picker 
	When PremiumUser FIFT  clicks on date field 
	Then User FIFT should see next button in date 
	
Scenario: Verify user able to edit date in date picker 
	When PremiumUser FIFT  selects previous date in the calendar after clicking date field 
	Then User FIFT should see selected date in the field 
	
Scenario:
Verify user  receives error message for entering more than 250 words in notes 
	When PremiumUser FIFT  clicks save food entry after more than words in notes 
	Then User FIFT should see error message in alert 
