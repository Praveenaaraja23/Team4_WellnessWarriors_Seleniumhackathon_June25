
Feature: Validation for Home page – Vitals, header and navigation (free user)
  
  Background:
    Given a new free user is logged in and on the Home page

 @tag @hpv
  Scenario Outline: Header / nav item "<item>" is visible
    When nothing else is done
    Then the element labelled "<item>" is visible in the header or nav bar

    Examples:
      | item              |
      | SweetBalance      |
      | User name         |
      | Logout            |
      | Home              |
      | Dashboard         |
      | Education         |

  @tag @error 
  Scenario Outline: Status label "<label>" is present
    When nothing else is done
    Then the label "<label>" is visible in the Current-status section

    Examples:
      | label               |
      | Current Status      |
      | Last updated        |
      | Latest HbA1C        |
      | BMI                 |
      | Average Blood Sugar |

  @tag @hpv
  Scenario: Timestamp appears after “Last updated”
    When nothing else is done
    Then a timestamp appears after "Last updated"

  @tag @hpv
  Scenario: Timestamp uses 12-hour time or relative format
    When nothing else is done
    Then the timestamp shows hh:mm with AM/PM or a relative time such as x min/h ago

  @tag @error 
  Scenario Outline: Numeric value for "<metric>" is visible
    When nothing else is done
    Then the numeric value for "<metric>" is visible

    Examples:
      | metric              |
      | Latest HbA1C        |
      | BMI                 |
      | Average Blood Sugar |

 @tag @hpv
  Scenario Outline: HbA1C value <value> shows condition "<condition>"
    When the app shows HbA1C value <value>
    Then the condition text equals "<condition>"

    Examples:
      | value | condition    |
      | 5.6   | Normal       |
      | 6.1   | Pre-Diabetic |
      | 6.5   | Diabetic     |

 @tag @hpv
  Scenario Outline: BMI value <bmi> shows category "<category>"
    When the app shows BMI value <bmi>
    Then the category text equals "<category>"

    Examples:
      | bmi  | category     |
      | 17.9 | Underweight  |
      | 22.0 | Normal       |
      | 27.0 | Overweight   |
      | 31.5 | Obese        |

  @tag @hpv
  Scenario: Unit "mg/dL" appears below Average Blood Sugar
    When nothing else is done
    Then the unit "mg/dL" appears just below the Average Blood Sugar value

  @tag @hpv
  Scenario: Flex-container title is visible
    When nothing else is done
    Then the flex container shows a title element

  @tag @hpv
  Scenario: “Today’s Meal Plan” section is visible
    When nothing else is done
    Then the section titled "Today’s Meal Plan" is visible

  @tag @hpv
  Scenario: Sidebar tab container is visible
    When nothing else is done
    Then the sidebar tab container inside the flex layout is visible
