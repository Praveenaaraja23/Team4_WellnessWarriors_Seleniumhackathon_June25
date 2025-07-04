Feature: Add Medication validation

    Background: User clicks medication button after reaching home page
    Given PremiumUser is in diabetes tracker

    Scenario: Verify the presence of iframe
    When PremiumUser clicks add medication
    Then User should see iframe 

    Scenario: Verify the presence of cancel button
    When PremiumUser clicks add medication
    Then User should see cancel button

    Scenario: Verify the heading in iframe
    When PremiumUser clicks add medication
    Then User should see "Add new medication"

    Scenario: Verify the fields in iframe
    When PremiumUser clicks add medication
    Then User should see Medication,Dosage,Frequency,Date,Take with food,Notes (optional)

    Scenario: verify the presence of dropdown in medication field
    When PremiumUser clicks add medication
    Then User should see dropdown for Medication

    Scenario: Verify the options in medication dropdown
    When PremiumUser clicks add medication
    Then User should see Select a medication

    Scenario: Verify the input field for Dosage
    When PremiumUser clicks add medication
    Then User should see input field for dosage

    Scenario: Verify the placeholder text in dosage input field
    When PremiumUser clicks add medication
    Then User should see "e.g., 500mg or 10 units" as placeholder

    Scenario: verify the presence of dropdown for frequency
    When PremiumUser clicks add medication
    Then user should see dropdown for frequency field

    Scenario: Verify the options for frequency 
    When PremiumUser clicks add medication
    Then User should see "Once daily, twice daily, Three times daily"

    Scenario: Verify the presence of date picker
    When PremiumUser clicks add medication
    Then User should see date picker in tracker

    Scenario: Verify the checkbox in take with food 
    When PremiumUser clicks add medication
    Then User should see checkbox for take with food

    Scenario: Verify the presence text block for notes
    When PremiumUser clicks add medication
    Then User should see text block for notes

    Scenario: Verify the add medication button
    When PremiumUser clicks add medication
    Then User should see add medication button