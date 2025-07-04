Feature: Onboarding Step 1 UI validation
Scenario: Verify navigation to Step 1 onboarding
    Given User is in upload blood report page
    When User clicks on step for onboarding button
    Then User should navigate to onboarding Step 1
    
    Scenario: Verify Step 1 heading is visible
    Given User is in upload blood report page
    When User clicks on step for onboarding button
  #  Then Page should display title "So, Which sugar rebellion are we dealing with?"
    
     Scenario: Verify progress bar reflects Step 1 of 12
    Given User is in upload blood report page
    When User clicks on step for onboarding button
  #  Then Progress bar should visually indicate "Step 1 of 12"
    
    
    Scenario: Verify user navigates to Step 2 after selecting condition
    Given User is on Step 1 onboarding page
    When User selects a condition option
    Then User should navigate to Step 2