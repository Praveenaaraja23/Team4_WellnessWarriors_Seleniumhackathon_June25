Feature: Verify Homepage navigation components


@Launch_ST

  Scenario: Verify redirection from Start Today button
    Given The Users is on SweetBalance homepage
    When User clicks the "Start Today" button
    Then User should be redirected to the Login page

  @Launch_checkLogin
  
  Scenario: Validate Login link visibility
    Given The Users is on SweetBalance homepage
    When User looks at the top right corner
    Then User should see a link labeled "Login"

@Launch_clickLogin

  Scenario: Validate Login link redirection
    Given The Users is on SweetBalance homepage
    When User clicks on the "Login" link
    Then User should be redirected to the Login page


@Launch_CheckRisk

  Scenario: Verify redirection from Check Your Risk button
    Given The Users is on SweetBalance homepage
    When User clicks on "Check Your Risk" button on launch page
    Then User should be redirected to the assessment modal dialog