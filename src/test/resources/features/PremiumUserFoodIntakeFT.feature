Feature: Functional testing for Food Intake 

Background: 
	PremiumUser FIFT  is in the Breakfast section of the Food Intake Tracker 
	Given PremiumUser FIFT  is in the Breakfast section of the Food Intake Tracker 
	
	
Scenario: Verify the presence of helper text after automatic calorie calculation 
	When PremiumUser FIFT  enters valid food name 
	Then User FIFT should see helper text after automatic calorie calculation 
	
Scenario: Verify datepicker option 
	When PremiumUser FIFT  clicks on date field 
	Then User FIFT should see date calendar 
	
Scenario: Verify the presence the previous button  in date picker 
	When PremiumUser FIFT  clicks on date field 
	Then User FIFT should see previous button in date 
	
Scenario: Verify the presence the Next button  in date picker 
	When PremiumUser FIFT  clicks on date field 
	Then User FIFT should see next button in date 
	
Scenario: 
	Verify user  receives error message for entering more than 250 words in notes 
	When PremiumUser FIFT  clicks save food entry after more than words in notes 
	Then User FIFT should see error message in alert 
