Feature: Home Page Validation for Registered premium Account User 

Background: User logged as premium user 
	Given User is in password auth page 
	When User clicks sign in after entering password 
	
	
Scenario: Verify order of text in navigation bar new
	Then User should see the navigation bar displaying items in the order: Home,Logbook,Dashboard,Education 
	
Scenario: Verify the presence of animation in challenge yourself button
	Then User should see flashing challenge yourself button 
	
Scenario: Verify the duration of animation 
	Then Flashes in two sec 
	
Scenario: Verify the presence of  Challenge yourself today button
	Then User should see a Challenge yourself today! button 
	
Scenario: Verify the presence of gender image in the grid
	Then User should see a gender-specific image based on the gender selected during the onboarding process 
	
Scenario: Verify the presence of  label for gender image
	Then User should see label Mood below the gender image 
	
Scenario: Verify the presence of log button 
	Then User should see log button under gender image 
	
Scenario: Verify the presence of Weekly plan button 
	Then User should see Week plan button 
	
Scenario: Verify the presence of Record New Data in the bottom
	Then User should see Record New Data text 
	
Scenario: Verify the presence of 4 button option below Record New Data
	Then User should see four button option 

Scenario: Verify the first button text Blood Glucose
	Then User should see text Blood Glucose 
	
Scenario: Verify the second button text Physical Activity
	Then User should see Physical activity 
	
Scenario: Verify the third button text Food Intake 
	Then User should see Food Intake 
	
Scenario: Verify the fourth button text  Medication 
	Then User Should see Medication 
	
Scenario: Verify  icon for Blood Glucose
	Then Activity icon should be present in blood glucose 
	
Scenario: Verify icon for  Physical Activity
	Then Running icon should be present in Physical activity 
	
Scenario: Verify icon for Food Intake 
	Then Pizza icon should be present in food intake 
	
Scenario: Verify  icon for Medication 
	Then Pill icon should be present in medication	
	