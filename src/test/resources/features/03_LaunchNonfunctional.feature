Feature: Non-Functional Testing - Home Page

  Scenario: Homepage loads within acceptable time
    Given User is in browser
    When User enters the SweetBalance url
    Then Page should be fully loaded within 3 seconds

  Scenario: Homepage is responsive
    Given User is on SweetBalance homepage
    Then All elements should be readable and accessible without horizontal scrolling

  Scenario: Homepage maintains accessibility standards
    Given User is on SweetBalance homepage
    Then All major sections should be accessible with appropriate labels and alt texts

  Scenario: Website is visually appealing
    Given User is on SweetBalance homepage
    Then User should find the design visually appealing and readable

  Scenario: Navigation bar remains accessible
    Given User is on SweetBalance homepage
    Then User should be able to access other sections without scrolling up

  Scenario: Website supports all browsers
    Given User is on SweetBalance homepage
    Then User should have a consistent experience across browsers