	package stepDefinition;
	
	
	import org.testng.Assert;
	
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
	import pageFactory.LaunchUIComponents_PF;
import utilities.LoggerLoad;
	
	public class LaunchUIComponents_SD {
		
		LaunchUIComponents_PF uiComponentsPage = new LaunchUIComponents_PF();
		
		@Given("the User launches the browser")
		public void the_user_launches_the_browser() {
			
			LoggerLoad.info("User launches browser");
		   
		}
	
		@When("the User enters the SweetBalance url")
		public void the_user_enters_the_sweet_balance_url() {
			LoggerLoad.info("User is on" + uiComponentsPage.getSweetBalanceText() + "page");
		    
		}
	
			@Then("User should see {string} displayed on the page")
			public void user_should_see_displayed_on_the_page(String expectedText) {
			
		
			        String actualText = null;
		
			        switch (expectedText) {
		
			            case "SweetBalance":
			                actualText = uiComponentsPage.getSweetBalanceText();
			                break;
		
			            case "Our Terms of Service and Privacy Policy have recently been updated":
			                actualText = uiComponentsPage.getPrivacyPolicyText();
			                break;
		
			            case "Smart Diabetes Tracking Powered by AI":
			                actualText = uiComponentsPage.getSmartDiabetesText().replace("\n", " ").trim();
			                break;
		
			            case "Start Today":
			                actualText = uiComponentsPage.getStartTodayText();
			                break;
		
			            case "Comprehensive Diabetes Management Tools":
			                actualText = uiComponentsPage.getComprehensiveDiabetesText();
			                break;
		
			            case "Health Tracking":
			                actualText = uiComponentsPage.getHealthTrackingtext();
			                break;
			                
			        
			            case "Nutrition & Exercise":
			                actualText = uiComponentsPage.getNutritionText();
			                break;
			            
			            case "Smart Insights":
			                actualText = uiComponentsPage.getSmartInsightsText();
			                break;
			                
			            case "Monitor glucose levels, medication, and vital statistics, Easy logging of daily readings, Visualize trends over time, Set personalized targets":
			                uiComponentsPage.verifycardstext(1);
			                return;

			            case "Balance diet and physical activity for optimal control, Carb counting tools, Customized exercise plans, Meal suggestions based on readings":
			                uiComponentsPage.verifycardstext(2);
			                return;

			            case "Get personalized guidance based on your data, Pattern detection algorithms, Early warning notifications, Actionable recommendations":
			                uiComponentsPage.verifycardstext(3);
			                return; 
			                  
			               
			            case "heart icon":
			                boolean isHeartIconVisible = uiComponentsPage.isHeartIconVisible();
			                Assert.assertTrue(isHeartIconVisible, "Heart icon is not visible on the page");
		                    return;
		                    
			            case "activity inside square icon":
			                boolean isactivitysquareicon = uiComponentsPage.isHeartIconVisible();
			                Assert.assertTrue(isactivitysquareicon, "Activitysquare icon is not visible on the page");
		                    return;
		                    
			            case "clock icon":
			                boolean isclockicon = uiComponentsPage.isHeartIconVisible();
			                Assert.assertTrue(isclockicon, "clock icon is not visible on the page");
		                    return;
		                    
			            case "Join our community of successful members":
			                actualText = uiComponentsPage.getJoincommunityText();
			                break;
		                    
		                    
		                    
			            case "James D.":
			                uiComponentsPage.clickSectionByIndex(1);
			                return;
		
			            case "Maria L.":
			                uiComponentsPage.clickSectionByIndex(2);
			                return;
		
			            case "Robert T.":
			                uiComponentsPage.clickSectionByIndex(3);
			                return;
		                    
			                
			            case "5 yellow stars":
			                uiComponentsPage.verifyStarsAboveText();
			                return;
			                
			                
			            case "5 stars under James D.":
			                uiComponentsPage.verifyStarsUnderTestimonial(1);
			                return;

			            case "5 stars under Maria L.":
			                uiComponentsPage.verifyStarsUnderTestimonial(2);
			                return;

			            case "5 stars under Robert T.":
			                uiComponentsPage.verifyStarsUnderTestimonial(3);
			                return; 
			                
			            case "Take control of your diabetes today":
			                actualText = uiComponentsPage.gettakediabeteiccontrltext();
			                break;
			                
			            case "Check Your Risk":
			                actualText = uiComponentsPage.CheckYourRiskButton();
			                break;
	
			            default:
			                throw new IllegalArgumentException("No matching UI component found for: " + expectedText);
			        }
		
			        
			        Assert.assertEquals(actualText, expectedText, "Text does not match on the page");
			        LoggerLoad.info(expectedText + " is correctly displayed on the page.");
			    }
			
			  
			
			
		}
	
	
	
