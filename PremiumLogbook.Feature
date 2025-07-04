Feature: Blood Glucose Tracker Validation
Background: User logged into app
 
Scenario: Verify presence of Blood Glucose Tracker section
    Given the user is on the Home page
    When the user navigates to the Logbook page
    Then the user should see the "Blood Glucose Tracker" section

  Scenario: Verify title of Blood Glucose Tracker section
    Given the user is on the Logbook page
    Then the user should see the title "Blood Glucose Tracker"

  Scenario: Verify colour code for Fasting glucose type
    Given the user is on the Logbook page
    Then the user should see "Fasting" displayed in purple

  Scenario: Verify Fasting glucose type range displayed
    Given the user is on the Logbook page
    Then the user should see the range for "Fasting" be "70-100 mg/dL"

  Scenario: Verify colour code for Pre-Meal glucose type
    Given the user is on the Logbook page
    Then the user should see "Pre-Meal" displayed in green

  Scenario: Verify Pre-Meal glucose type range displayed
    Given the user is on the Logbook page
    Then the user should see the range for "Pre-Meal" be "70-130 mg/dL"

  Scenario: Verify colour code for Post-Meal glucose type
    Given the user is on the Logbook page
    Then the user should see "Post-Meal" displayed in yellow

  Scenario: Verify Post-Meal glucose type range displayed
    Given the user is on the Logbook page
    Then the user should see the range for "Post-Meal" be "<180 mg/dL"

  Scenario: Verify colour code for Bedtime glucose type
    Given the user is on the Logbook page
    Then the user should see "Bedtime" displayed in red

  Scenario: Verify Bedtime glucose type range displayed
    Given the user is on the Logbook page
    Then the user should see the range for "Bedtime" be "100-140 mg/dL"

  Scenario: Verify last 7 days are displayed on X-axis
    Given the user is on the Logbook page
    Then the user should see the X-axis display the last 7 days ending today

  Scenario: Verify Y-axis starts at 70 in glucose chart
    Given the user is on the Logbook page
    Then the user should see the Y-axis minimum value as 70

  Scenario: Verify Y-axis ends at 180 in glucose chart
    Given the user is on the Logbook page
    Then the user should see the Y-axis maximum value as 180


Feature: Meal and Nutrition Validation
Background: User logged into app


Scenario: Verify presence of Meal & Nutrition section
    Given the user is on the Home page
    When the user navigates to the Logbook page
    Then the user should see the "Meal & Nutrition" section

  Scenario: Verify title of Meal & Nutrition section
    Given the user is on the Logbook page
    Then the user should see the title "Meal & Nutrition"

  Scenario: Verify icon for Meal & Nutrition section is displayed
    Given the user is on the Logbook page
    Then the user should see the icon on the left side of the "Meal & Nutrition" title

  Scenario: Verify presence of 7-Day Aggregate Nutrition section
    Given the user is on the Logbook page
    Then the user should see the section "7-Day Aggregate Nutrition"

  Scenario: Verify presence of Daily Nutrition breakdown section
    Given the user is on the Logbook page
    Then the user should see the section "Daily Nutrition breakdown"

  Scenario: Verify text color of Carbs in 7-Day Aggregate Nutrition section
    Given the user is on the Logbook page
    Then the user should see "Carbs" text displayed in pink

  Scenario: Verify text color of Protein in 7-Day Aggregate Nutrition section
    Given the user is on the Logbook page
    Then the user should see "Protein" text displayed in blue

  Scenario: Verify text color of Fats in 7-Day Aggregate Nutrition section
    Given the user is on the Logbook page
    Then the user should see "Fats" text displayed in yellow

  Scenario: Verify last 7 days displayed on X-axis in Daily Nutrition breakdown
    Given the user is on the Logbook page
    Then the user should see the X-axis display the last 7 days ending today

  Scenario: Verify bar chart behavior when user has not logged any meals
    Given the user has not logged any meals
    When the user navigates to the Logbook page
    Then the user should see no bars in the "Daily Nutrition breakdown" section

  Scenario: Verify pie chart is hidden when user has not logged any meals
    Given the user has not logged any meals
    When the user navigates to the Logbook page
    Then the user should not see any pie chart in the "7-Day Aggregate Nutrition" section

  Scenario: Verify Carbs card displays 0g and 0% with no logs
    Given the user has not logged any meals
    When the user navigates to the Logbook page
    Then the user should see the Carbs card display "0g (0%)"

  Scenario: Verify Protein card displays 0g and 0% with no logs
    Given the user has not logged any meals
    When the user navigates to the Logbook page
    Then the user should see the Protein card display "0g (0%)"

  Scenario: Verify Fats card displays 0g and 0% with no logs
    Given the user has not logged any meals
    When the user navigates to the Logbook page
    Then the user should see the Fats card display "0g (0%)"

  Scenario: Verify bar chart behavior when user has logged meals
    Given the user has logged meals
    When the user navigates to the Logbook page
    Then the user should see bars with nutrient distribution in the "Daily Nutrition breakdown" section

  Scenario: Verify pie chart is visible when user has logged meals
    Given the user has logged meals
    When the user navigates to the Logbook page
    Then the user should see a pie chart with nutrient distribution in the "7-Day Aggregate Nutrition" section

  Scenario: Verify Carbs card displays correct value when logs exist
    Given the user has logged meals
    When the user navigates to the Logbook page
    Then the user should see a non-zero value in the Carbs card

  Scenario: Verify Protein card displays correct value when logs exist
    Given the user has logged meals
    When the user navigates to the Logbook page
    Then the user should see a non-zero value in the Protein card

  Scenario: Verify Fats card displays correct value when logs exist
    Given the user has logged meals
    When the user navigates to the Logbook page
    Then the user should see a non-zero value in the Fats card


Feature: Physical Activity Validation
Background: User is in home page after logged in 


Scenario: Verify presence of Physical Activity section
    Given the user is on the Home page
    When the user navigates to the Logbook page
    Then the user should see the "Physical Activity" section

  Scenario: Verify the title of Physical Activity section
    Given the user is on the Logbook page
    Then the user should see the title "Physical Activity"

  Scenario: Verify presence of icons beside title in Physical Activity section
    Given the user is on the Logbook page
    Then the user should see the icons on the left side of the "Physical Activity" title

  Scenario: Verify last 7 days are displayed on X-axis
    Given the user is on the Logbook page
    Then the user should see the X-axis display the last 7 days ending today

  Scenario: Verify alignment of statistic cards
    Given the user is on the Logbook page
    Then the user should see exactly 3 statistic cards: "Total Calories", "Daily Average", and "Peak Day" displayed horizontally

  Scenario: Verify text colour of Total Calories card
    Given the user is on the Logbook page
    Then the user should see the "Total Calories" text in purple colour

  Scenario: Verify text colour of Daily Average card
    Given the user is on the Logbook page
    Then the user should see the "Daily Average" text in orange or brown colour

  Scenario: Verify text colour of Peak Day card
    Given the user is on the Logbook page
    Then the user should see the "Peak Day" text in red or maroon colour

  Scenario: Verify Y-axis label on Physical Activity chart
    Given the user is on the Logbook page
    Then the user should see the Y-axis clearly labeled with the text "Calories"

  Scenario: Verify empty chart display when no activity logs
    Given the user has not logged any physical activity
    When the user navigates to the Logbook page
    Then the user should see no bars in the chart

  Scenario: Verify Total Calories value when no activity logs
    Given the user has not logged any physical activity
    When the user navigates to the Logbook page
    Then the user should see the "Total Calories" card display "0 cal"

  Scenario: Verify Daily Average value when no activity logs
    Given the user has not logged any physical activity
    When the user navigates to the Logbook page
    Then the user should see the "Daily Average" card display "0 cal"

  Scenario: Verify Peak Day value when no activity logs
    Given the user has not logged any physical activity
    When the user navigates to the Logbook page
    Then the user should see the "Peak Day" card with no value or display "--"

  Scenario: Verify bar chart displays only for logged activities
    Given the user has logged physical activity on some days
    When the user navigates to the Logbook page
    Then the user should see bars displayed only for the days with logged activities
    
    
    Feature: Medical Dosage Validation
    Background: User logged into app


Scenario: Verify presence of Medical Dosage section
    Given the user is on the Home page
    When the user navigates to the Logbook page
    Then the user should see the section "Medical Dosage"

  Scenario: Verify the title of Medical Dosage section
    Given the user is on the Logbook page
    Then the user should see the title "Medical Dosage"

  Scenario: Verify the icon beside Medical Dosage title
    Given the user is on the Logbook page
    Then the user should see the icon on the left side of the "Medical Dosage" title

  Scenario: Verify Y-axis has text "Number of Doses"
    Given the user is on the Logbook page
    Then the user should see the Y-axis labeled with the text "Number of Doses"

  Scenario: Verify empty chart display when no medication is scheduled
    Given the user has not scheduled any medication for the week
    When the user navigates to the Logbook page
    Then the user should see no bars in the chart

  Scenario: Verify Total Scheduled displays 0 doses when no medication is scheduled
    Given the user has not scheduled any medication for the week
    When the user navigates to the Logbook page
    Then the user should see "0 doses" in the "Total Scheduled" statistics

  Scenario: Verify Doses Taken displays 0 doses when no medication is scheduled
    Given the user has not scheduled any medication for the week
    When the user navigates to the Logbook page
    Then the user should see "0 doses" in the "Doses Taken" statistics

  Scenario: Verify Doses Missed displays 0 doses when no medication is scheduled
    Given the user has not scheduled any medication for the week
    When the user navigates to the Logbook page
    Then the user should see "0 doses" in the "Doses Missed" statistics

  Scenario: Verify colour of Total Scheduled text
    Given the user is on the Logbook page
    Then the user should see the "Total Scheduled" text in purple colour

  Scenario: Verify colour of Doses Taken text
    Given the user is on the Logbook page
    Then the user should see the "Doses Taken" text in green colour

  Scenario: Verify colour of Doses Missed text
    Given the user is on the Logbook page
    Then the user should see the "Doses Missed" text in yellow colour

  Scenario: Verify green bar is displayed for Doses Taken on a scheduled day
    Given the user has taken the scheduled dose for a day
    When the user navigates to the Logbook page
    Then the user should see a green colour bar for that day in the chart

  Scenario: Verify red bar is displayed for Doses Missed on a scheduled day
    Given the user has missed the scheduled dose for a day
    When the user navigates to the Logbook page
    Then the user should see a red colour bar for that day in the chart








    











    
    




























































