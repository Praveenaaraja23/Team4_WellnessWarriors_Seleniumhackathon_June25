Feature: Functional testing for physical activity 

Background: PremiumUser PAFT is in physical activity 
	Given PremiumUser PAFT is in physical activity 
	
Scenario: Verify user unable to enter invalid value 
	When PremiumUser PAFT enters invalid value in duration text field 
	Then User PAFTshould see blank 
	
Scenario: Verify datepicker option 
	When PremiumUser PAFT clicks date picker 
	Then User PAFTshould see date calendar 
	
Scenario: Verify the presence the previous button  in date picker 
	When PremiumUser PAFT clicks date picker 
	Then User PAFTshould see previous button in date 
	
Scenario: Verify the presence the Next button  in date picker 
	When PremiumUser PAFT clicks date picker 
	Then User PAFTshould see next button in date 
