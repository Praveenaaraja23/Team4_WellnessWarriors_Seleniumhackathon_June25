Feature: Dashboard page validation for Registered premium account user
Background: Dashboard page validation for Registered premium account user





   Scenario: Verify display of King symbol next to user's name
    Given User is in Home page
    When User click dashboard on the navigation bar
    Then User should see the King symbol 👑 displayed next to their name

  Scenario: Verify display of Premium Activated status next to symbol
    Given User is in Home page
    When User click dashboard on the navigation bar
    Then User should see the "Premium Activated" status next to the symbol

  Scenario: Verify "Manage premium" button is visible
    Given User is in Home page
    Then User should see the "Manage premium" button

  Scenario: Verify "Manage premium" button is clickable and dialog opens
    Given User is in Home page
    When User clicks the "Manage Premium" button
    Then User should see the dialog box open

  Scenario: Verify the display of Start Date text and its value
    Given User is in Home page
    When User click dashboard on the navigation bar
    Then User should see the "Start Date:" with value in format "EEE, MMM dd, yyyy"

  Scenario: Verify the display of End Date text and its value
    Given User is in Home page
    When User click dashboard on the navigation bar
    Then User should see the "End Date:" with value in format "EEE, MMM dd, yyyy"

Feature: Emotional Wellbeing validations on Premium dashboard

  Background:
    Given User is in home page after logged in
    And User is in Dashboard Page
    And User scrolls to the middle

  Scenario: Verify the title of emotional wellbeing
    Then User should see the title "Emotional Wellbeing"

  Scenario: Verify the question about wellbeing is displayed
    Then User should see the question text "How are you feeling today?"

  Scenario: Verify the mood emojis are displayed
    Then User should see six emoji 😄 😊 😐 😔 😠 😰 options visible for selection

  Scenario: Verify the text "Notes on your mood"
    Then User should see the text "Notes on your mood"

  Scenario: Verify the input field of the notes
    Then User should see the Text "What's affecting your mood today?" in input field

  Scenario: Verify able to give inputs to "notes on your mood" input field
    When User scrolls to middle and enter value in notes on your mood input field
    Then User should see the value entered in input field

  Scenario: Verify the text energy level is present with value
    Then User should see the energy level slider

  Scenario: Verify energy level slider is displayed
    Then User should see Energy level slider with labels "low" and "high"

  Scenario: Verify energy level changes when sliders move
    When User scrolls to middle and moves Energy slider to new position
    Then User should see the value changes according to the position

  Scenario: Verify log Emotional state button is displayed
    Then User should see the "log emotional state" button

  Scenario: Verify Emotional state log success message
    When User select mood emoji and click log emotional state button
    Then User should see the success message "Your Emotional State has been recorded Successfully"
    
    
Feature: Manage premium Dialog box Validation
Background: User clicks manage premium in dashboard page after logging 




  
    Given User is logged in and on the Dashboard Page
    When User clicks manage premium in dashboard page
    Then User is in premium subscription dialog box

  Scenario: Verify the message displayed in dialog box
    Then User should see the message "Are you sure you want to cancel your premium subscription? You'll continue to have access to premium features until the end of your current billing period."

  Scenario: Verify loss of features section is displayed
    Then User should see the section "What you'll lose:" with list:
      | Personalized meal plans tailored to your health goals       |
      | Advanced analytics and blood sugar insights                 |
      | Specialized diabetes management plans                       |
      | Priority support and premium features                       |

  Scenario: Verify action buttons are displayed
    Then User should see "Keep Premium" button and "Cancel Premium" button

  Scenario: Verify style and colour of "Keep Premium" button
    Then User should see "Keep Premium" button with white background and dark text

  Scenario: Verify style and colour of "Cancel Premium" button
    Then User should see "Cancel Premium" button with red background and white text

  Scenario: Verify Keep premium button functionality
    When User clicks the Keep Premium button
    Then User should see success message "your premium subscription will continue"

  Scenario: Verify cancel premium button functionality
    When User clicks the Cancel Premium button
    Then User should see message "your premium subscription will cancelled"

  Scenario: Verify "X" button functionality
    When User clicks the X button
    Then User should see the dialog box closed

Feature:User Activity Tracking on premium Dashboard
Background:User is in home page after logged in


  Scenario: Verify Weekly Checks card shows "0" when the user hasn't logged any checks
    Given User has not logged any weekly checks for the current week
    When User navigates to dashboard page
    Then User should see "Weekly Checks" displaying "0" with subtitle "Total log entries per week"

  Scenario: Verify Weekly Checks card shows correct count based on existing check logs
    Given User has logged weekly check for the current week
    When User navigates to dashboard page
    Then User should see "Weekly Checks" displaying value based on the logs

  Scenario: Verify Exercise Minutes card shows "0/150 this week" when there's no exercise logged
    Given User has not logged any exercise minutes for the week
    When User navigates to dashboard page
    Then User should see "Exercise Minutes" displaying "0/150 this week" with subtitle "Target: 150 minutes per week"

  Scenario: Verify Exercise Minutes card shows correct minutes based on user entries
    Given User has logged exercise minutes for the week
    When User navigates to dashboard page
    Then User should see "Exercise Minutes" displaying number of minutes based on the entries

  Scenario: Verify Med Adherence shows "0%" with "Needs improvement" when there's no log
    Given User has not logged Medication adherence for the week
    When User navigates to dashboard page
    Then User should see "Med Adherence" displaying "0%" with subtitle "Needs improvement"

  Scenario: Verify Med Adherence shows the correct percentage based on logged adherence
    Given User has logged Medication Adherence for the week
    When User navigates to dashboard page
    Then User should see "Med Adherence" displaying value based on the log

  Scenario: Verify Carb Goals card shows "0/28" when no meals are logged
    Given User has not logged Carb goals for the week
    When User navigates to dashboard page
    Then User should see "Carb Goals" displaying "0/28" with subtitle "Weekly meals completed"

  Scenario: Verify Carb Goals shows correct number based on logged meal entries
    Given User has logged carb goals for the week
    When User navigates to dashboard page
    Then User should see "Carb Goals" displaying value based on the logs

Feature: Smart Insights Validation on Premium dashboard
Background: User is in home page after logged in

Scenario: Verify Smart Insights section title
    Given User has health data for the last 7 days
    When User navigates to dashboard page
    Then User should see the title "Smart Insights" in smart insights section

  Scenario: Verify Smart Insights section has the label "Last 7 days"
    Given User has health data for the last 7 days
    When User navigates to dashboard page
    Then User should see the label "Last 7 days" in smart insights section

  Scenario: Verify Smart Insights section has titles
    Given User has health data for the last 7 days
    When User navigates to dashboard page
    Then User should see Titles "Target Achievement", "Pattern detected", "Suggestion"

  Scenario: Verify the display of Target Achievement based on health data
    Given User has health data for the last 7 days
    When User navigates to dashboard page
    Then User should see the display of percentage of time the user was in the target range for the last 7 days with the percentage improvement compared to the previous week

  Scenario: Verify the display of Pattern detected based on health data
    Given User has health data for the last 7 days
    When User navigates to dashboard page
    Then User should see percentage of glucose value spike with suggestion to improve

  Scenario: Verify the display of Suggestion based on the health data
    Given User has health data for the last 7 days
    When User navigates to dashboard page
    Then User should see a suggestion of activity with the average expected glucose reduction from this activity






















