Feature: Non-Functional Testing - Home Page

@Launch_pageload
  Scenario: Homepage loads within acceptable time
    Given User is in browser
    When The Users is on SweetBalance homepage
    Then Page should be fully loaded within 3 seconds

