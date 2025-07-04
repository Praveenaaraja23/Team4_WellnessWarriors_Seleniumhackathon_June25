 Feature: Functional Testing Medication After Adding Medication
 Scenario: Verify user able to remove added medication
    Given PremiumUser in medication tracker
    When PremiumUser clicks remove button to the added medication
    Then User should see alert message "Are you sure you want to remove this medication? This action cannot be undone."

    Scenario: Verify user successfully remove medication
    When PremiumUser accepts alert after clicking remove button to the added medication
    Then User should get notification "Medication removed successfully"

    Scenario: Verify  added medication is not visible after accepts the alert
    When PremiumUser accepts alert after clicking remove button to the added medication
    Then User shouldn't see the added medication in the tracker.

    Scenario: Verify user returns to medication tracker after decline the alert
    When PremiumUser decline alert after clicking remove button to the added medication
    Then User should redirect to medication tracker

    Scenario: Verify user can mark as taken 
    When PremiumUser clicks mark as taken to the added medication
    Then User should see added medication is marked as taken