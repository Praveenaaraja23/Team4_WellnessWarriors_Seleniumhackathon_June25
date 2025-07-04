Feature: Upgrade-to-Premium payment page validation

  Background: 
    Given a free test user logs in and opens the Free vs Premium Account Features page
    And the user clicks the Upgrade to Premium button

  @tag @upg
  Scenario: Verify Upgrade page title
    Given the user is on the Upgrade to Premium payment page
    When the user does not take any action
    Then the page title should be "Upgrade to Premium"

  @tag @upg
  Scenario: Verify subtitle text
    Given the user is on the Upgrade to Premium payment page
    When the user does not take any action
    Then the subtitle should be "Get personalized insights and advanced features to better manage your diabetes."

  @tag @upg
  Scenario: Verify premium-features label
    Given the user is on the Upgrade to Premium payment page
    When the user does not take any action
    Then the text "Premium Features" should be visible

  @tag @upg
  Scenario: Verify included features list
    Given the user is on the Upgrade to Premium payment page
    When  the user does not take any action
    Then  the page should list "Personalized meal plans"
    Then  the page should list "Advanced analytics"
    Then  the page should list "Priority support"
  
  @tag @upg
  Scenario: Price is displayed
    Given the user is on the Upgrade to Premium payment page
    When the user does not take any action
    Then the price should be displayed as "$9.99/month"

  @tag @upg
  Scenario: Cancel-anytime text is visible
    Given the user is on the Upgrade to Premium payment page
    When the user does not take any action
    Then the text "cancel anytime" should be visible

  @tag @upg
  Scenario: Card-number heading is visible
    Given the user is on the Upgrade to Premium payment page
    When the user does not take any action
    Then the heading "Card Number" should be visible

  @tag @upg
  Scenario: Card-number field is present
    Given the user is on the Upgrade to Premium payment page
    When the user does not take any action
    Then the card number field should be visible

  @tag @upg
  Scenario: Expiration-date field is present
    Given the user is on the Upgrade to Premium payment page
    When the user does not take any action
    Then the expiration date field should be visible

  @tag @upg
  Scenario: CVV field is present
    Given the user is on the Upgrade to Premium payment page
    When the user does not take any action
    Then the CVV field should be visible

  @tag @upg
  Scenario: Pay button is visible
    Given the user is on the Upgrade to Premium payment page
    When the user does not take any action
    Then the button "Pay $9.99 USD" should be visible

  @tag @upg
  Scenario: Terms-of-service notice is visible
    Given the user is on the Upgrade to Premium payment page
    When the user does not take any action
    Then the terms-of-service notice should be visible

  @tag @upg
  Scenario: Auto-renewal disclaimer is visible
    Given the user is on the Upgrade to Premium payment page
    When the user does not take any action
    Then the auto-renewal disclaimer should be visible

  #@wip @pay
  #Scenario: Continue Free redirects to home
    #Given the user is on the Upgrade to Premium payment page
    #When the user clicks the Continue Free button
    #Then the user should be redirected to the home page
