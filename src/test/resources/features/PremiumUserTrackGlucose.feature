Feature: Premium user Record data functionality 

Background: BGPremiumUser TG is in home page 
	Given PremiumUser TrackGlucose is in home page 
	
Scenario: Verify title in blood glucose form 
	When PremiumUser TG clicks Blood Glucose 
	Then User should see title Track Glucose 
	
Scenario: Verify subtext in form 
	When PremiumUser TG clicks Blood Glucose 
	Then User should see subtext  Keep your health in check 
	
Scenario: Verify fields in track glucose 
	When PremiumUser TG clicks Blood Glucose 
	Then User should see field for Blood Glucose Level, Reading Type,Date 
	
Scenario: Verify input field 
	When PremiumUser TG clicks Blood Glucose 
	Then User should see text field for blood glucose 
	
Scenario: Verify the placeholder input in blood glucose field 
	When PremiumUser TG clicks Blood Glucose 
	Then User should see text Enter blood glucose level 
	
Scenario: Verify the text in the input field 
	When PremiumUser TG clicks Blood Glucose 
	Then User should see mg/dL 
	
Scenario: Verify the presence of transition field in track glucose 
	When PremiumUser TG clicks Blood Glucose 
	Then User should see three transition details  with text Low, normal, high 
	

	
Scenario: Verify the four button below reading type 
	When PremiumUser TG clicks Blood Glucose 
	Then User should see button Fasting,Pre-meal,Post-meal,Bedtime 
	
Scenario: Verify the date picker option 
	When PremiumUser TG clicks Blood Glucose 
	Then User should see date picker 
	
Scenario: Verify the last reading time 
	When PremiumUser TG clicks Blood Glucose 
	Then User should see last ready details 
	
Scenario: Verify the record reading button 
	When PremiumUser TG clicks Blood Glucose 
	Then User should see record reading button