Feature: Blood Report Upload Modal Navigation
Background:
    Given User is in upload blood report page
    
    Scenario: Verify navigation of blood report modal
    When User clicks on "Upload Blood Report" button
    Then User should navigate to blood report modal
      
    Scenario: Verify upload box supports drag & drop
    Given User is on blood report modal
    When User hovers over the upload box
    Then Upload box should show drag & drop interaction
    
    Scenario: Verify valid PDF file upload
    Given User is on blood report modal
    When User uploads valid PDF file
    Then Upload should see processing percentage bar
    
    Scenario: Verify upload cancel button functionality
    Given User is on blood report modal
    When User clicks "Cancel"
    Then Modal should be closed and user returned to previous screen
    
    Scenario: Verify "Upload & Process" processes the file
    Given User is on blood report modal
    When User clicks "Upload & Process" after uploading valid file
    Then User should see Report analysis
    
    Scenario: Verify onboarding button in report analysis
    Given User is on blood report modal
    When User clicks "Upload & Process" after uploading valid file
    Then User should see onboarding button
    
    Scenario: Validate fields on report analysis
    Given User is on blood report modal
    When User clicks "Upload & Process" after uploading valid file
    Then User should see Blood Test Results,Complete Blood Count, Medical Conditions ,Abnormal Values, Recommendations
    
    Scenario: Verify onboarding step 1 fields and UI after report upload
    Given User is on report analysis
    When User clicks Onboarding button
    Then User should see text field for Age
    Then User should see text field for Height
    Then User should see text field for Weight
    Then User should dropdown option for Gender field
    Then User should see "Male", "Female", "Prefer not to say" options in dropdown
    Then User should see enabled "Continue" button
    Then Progress bar should be visible
    Then Progress text should read Step 1 of 5
    Then Step 1 indicator should be highlighted
    Then Steps 2 to 5 should remain unhighlighted/inactive
 
 Scenario: Verify error message for invalid input in step 1 form
    Given User is on report analysis
    When User clicks Onboarding button
    When User submits the form with invalid input
    Then User should receive error message if form have invalid values
  
  Scenario: Verify user navigates to Step 2 after valid input
    Given User is in step 1 for onboarding process
    When User clicks continue after filling form
    Then Page should display title: Pick your pace: chill stroll or marathon magic
    Then Page should show text: Select your preferred exercise intensity level
    Then Back button should be visible
    Then Progress bar should reflect Step 2 of 5 as filled
    Then User should see options "Easy", "Medium", "Hard"
    
    Then User should navigate to "Upgrade to premium plus"