Feature: Verify Homepage UI components

 @Launch_UI
  Scenario Outline: Validate the <Scenario>
    Given the User launches the browser
    When the User enters the SweetBalance url
    Then User should see "<ScenarioTextORicon>" displayed on the page

    Examples: 
      | Scenario                              | ScenarioTextORicon                                                                                                                             |
      | presence of App Name                  | SweetBalance                                                                                                                                   |
      | presence of policy details            | Our Terms of Service and Privacy Policy have recently been updated                                                                             |
      | homepage heading is visible           | Smart Diabetes Tracking Powered by AI                                                                                                          |
      | Start Today input button is visible   | Start Today                                                                                                                                    |
      | diabetes management tools section     | Comprehensive Diabetes Management Tools                                                                                                        |
      | Health Tracking card is visible       | Health Tracking                                                                                                                                |
      | Nutrition & Exercise card is visible  | Nutrition & Exercise                                                                                                                           |
      | Smart Insights card is visible        | Smart Insights                                                                                                                                 |
      | Health Tracking card description      | Monitor glucose levels, medication, and vital statistics, Easy logging of daily readings, Visualize trends over time, Set personalized targets |
      | Nutrition & Exercise card description | Balance diet and physical activity for optimal control, Carb counting tools, Customized exercise plans, Meal suggestions based on readings     |
      | Smart Insights card description       | Get personalized guidance based on your data, Pattern detection algorithms, Early warning notifications, Actionable recommendations            |
      | Health Tracking card                  | heart icon                                                                                                                                     |
      | Nutrition & Exercise icon             | activity inside square icon                                                                                                                    |
      | Smart Insights icon                   | clock icon                                                                                                                                     |
      | community text above testimonials     | Join our community of successful members                                                                                                       |
      | testimonial from James D.             | James D.                                                                                                                                       |
      | testimonial from Maria L.             | Maria L.                                                                                                                                       |
      | testimonial from Robert T.            | Robert T.                                                                                                                                      |
      | 5 yellow stars above community text   | 5 yellow stars                                                                                                                                 |
      | rating for James D.                   | 5 stars under James D.                                                                                                                         |
      | rating for Maria L.                   | 5 stars under Maria L.                                                                                                                         |
      | rating for Robert T.                  | 5 stars under Robert T.                                                                                                                        |
      | bottom section heading                | Take control of your diabetes today                                                                                                            |
      | Check Your Risk button is visible     | Check Your Risk                                                                                                                                |
