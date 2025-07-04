Feature: Premium User Functional testing for track glucose 

Background: PremiumUser TGFT is in blood glucose 
	Given PremiumUser TGFT is in blood glucose 
	
	
Scenario: Verify user unable to enter invalid value 
	When PremiumUser TGFT enters invalid value in blood glucose 
	Then User TGFT should see blank value 
	
Scenario: Verify transition details highlights 
	When PremiumUser TGFT enters value in blood glucose 
	Then User TGFT should see transition details highlights 
	
Scenario: Verify datepicker option 
	When PremiumUser TGFT clicks date picker 
	Then User TGFT should see date calendar 
	
Scenario: Verify the presence the previous button  in date picker 
	When PremiumUser TGFT clicks date picker 
	Then User TGFT should see previous button in date 
	
Scenario: Verify the presence the Next button  in date picker 
	When PremiumUser TGFT clicks date picker 
	Then User TGFT should see next button in date