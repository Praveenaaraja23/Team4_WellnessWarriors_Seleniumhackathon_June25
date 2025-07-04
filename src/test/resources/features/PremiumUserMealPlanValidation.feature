Feature: Validation for View full meal plan

Background:
Given User is in View Meal plan



    Scenario Outline: Verify pre-meal includes description under the item name for each meal section
      When User clicks Meal sections "<mealSection>"
    Then Item description  should be displayed below the item name
Examples: 
		| mealSection  |
		| breakfast    |
		| lunch        |
		| dinner       |
		| snacks       |

    Scenario Outline: Verify Pre meal calorie in view full plan for each meal section  
    When User clicks Meal sections "<mealSection>"
    Then Calories value should be displayed 
Examples: 
		| mealSection  |
		| breakfast    |
		| lunch        |
		| dinner       |
		| snacks       |

    Scenario Outline: Verify pre meal preparation in view full plan for each meal section
    When User clicks Meal sections "<mealSection>"
     Then Preparation instructions displayed if available , if not then
Examples: 
		| mealSection  |
		| breakfast    |
		| lunch        |
		| dinner       |
		| snacks       |

    Scenario Outline: Verify Nutrients (Pre-meal portion) in view full plan for each meal section
    When User clicks Meal sections "<mealSection>"
    Then User should see Nutrients Pre-meal portion heading in full plan
Examples: 
		| mealSection  |
		| breakfast    |
		| lunch        |
		| dinner       |
		| snacks       |

    Scenario Outline: Verify the nutrients list (Pre-meal portion) in view full plan for each meal section
    When User clicks Meal sections "<mealSection>"
    Then User should see nutrients text
 Examples: 
		| mealSection  |
		| breakfast    |
		| lunch        |
		| dinner       |
		| snacks       |


    Scenario Outline: Verify the nutrients value (Pre-meal portion) in view full plan for each meal section
    When User clicks Meal sections "<mealSection>"
    Then User should see value present in all each  nutrient
 Examples: 
		| mealSection  |
		| breakfast    |
		| lunch        |
		| dinner       |
		| snacks       |

   

    Scenario Outline: Verify each meal section have meal title 
    When User clicks Meal sections "<mealSection>"
    Then Each meal section should display a meal item with the format
 Examples: 
		| mealSection  |
		| breakfast    |
		| lunch        |
		| dinner       |
		| snacks       |

    Scenario Outline: Verify meal includes description under the item name for each meal section
    When User clicks Meal sections "<mealSection>"
    Then Item description  should be displayed below the item name
 Examples: 
		| mealSection  |
		| breakfast    |
		| lunch        |
		| dinner       |
		| snacks       |




    Scenario Outline: Verify meal total calorie in view full plan for each meal section 
    When User clicks Meal sections "<mealSection>"
    Then Total Calories value should be displayed 
Examples: 
		| mealSection  |
		| breakfast    |
		| lunch        |





    Scenario Outline: Verify the nutrients value in view full plan for each meal section
    When User clicks Meal sections "<mealSection>"
    Then User should see value present in all each  nutrient
Examples: 
		| mealSection  |
		| breakfast    |
		| lunch        |


    Scenario Outline: Verify ingredients details present in main meal for each meal section
    When User clicks Meal sections "<mealSection>"
    Then User should see ingredients list for the main meal for each meal section
Examples: 
		| mealSection  |
		| breakfast    |
		| lunch        |

    Scenario Outline: Verify the presence of heading "Diabetes Management Tips" in view full plan 
    When User clicks Meal sections "<mealSection>"
    Then User should see heading Diabetes Management Tips
Examples: 
		| mealSection  |
		| breakfast    |
		| lunch        |
		| dinner       |
		| snacks       | 

    Scenario Outline: Verify the presence of  tips description for diabetes management
    When User clicks Meal sections "<mealSection>"
    Then User should see tips under diabetes tips
Examples: 
		| mealSection  |
		| breakfast    |
		| lunch        |

    Scenario Outline: Verify the presence of Glycemic Impact
    When User clicks Meal sections "<mealSection>"
    Then User should see impact text 
Examples: 
		| mealSection  |
		| breakfast    |
		| lunch        |

    Scenario Outline: Verify the presence of impact value
    When User clicks Meal sections "<mealSection>"
    Then User should see impact value 
Examples: 
		| mealSection  |
		| breakfast    |
		| lunch        |

    Scenario Outline: Validate impact value
    When User clicks Meal sections "<mealSection>"
    Then Impact value should be low medium high
Examples: 
		| mealSection  |
		| breakfast    |
		| lunch        |
		| dinner       |
		| snacks       | 

