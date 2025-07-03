package pageFactory;

import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.LoggerLoad;
import utilities.ConfigReader;
import utilities.DriverManager;

public class LaunchUIComponents_PF {
	
	WebDriver driver= DriverManager.getDriver();
	ConfigReader configFileReader=DriverManager.configReader();
	
	 public LaunchUIComponents_PF() {
	    	
			PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//div[text()='SweetBalance']") WebElement Sweetbalancetext;
	@FindBy(xpath="//div[text()='Our Terms of Service and Privacy Policy have recently been updated']") WebElement privacypolicytext;
	@FindBy(xpath="//h1[@class='text-3xl md:text-4xl lg:text-4xl font-bold leading-tight']") WebElement smartdiabetestext;
	//@FindBy(xpath="//h1[contains(., 'Smart Diabetes Tracking Powered by AI')]") WebElement smartdiabetestext;
	@FindBy(xpath="//button[contains(text(), 'Start Today')]") WebElement StartTodaytxt;
	
	@FindBy(xpath="//h2[@class='text-3xl font-bold text-gray-900']") WebElement ComprehensiveDiabetesText;
	@FindBy(xpath="//h3[contains(text(), 'Health Tracking')]") WebElement HealthTrackingtext;
	@FindBy(xpath="//h3[contains(text(), 'Nutrition & Exercise')]") WebElement NutritionText;
	@FindBy(xpath="//h3[contains(text(), 'Smart Insights')]") WebElement SmartInsightsText;

	@FindBy(xpath="//p[@class='text-sm text-muted-foreground']") WebElement MainText;
	@FindBy(xpath = "//div[contains(@class, 'p-6') and contains(@class, 'space-y-2')]/p") List<WebElement> additionalTexts;
	//@FindBy(xpath="//p[contains(text(),'Monitor glucose levels, medication, and vital stat')]") WebElement MonitorglucoseText ;
	//@FindBy(xpath="//p[contains(text(),'Balance diet and physical activity for optimal con')]") WebElement BalanceDietText;
	//@FindBy(xpath="//p[contains(text(),'Get personalized guidance based on your data')]") WebElement GetpersonalizedText;
	
	
	
	@FindBy(xpath="//section[@class='py-16 bg-white']//div[@class='max-w-7xl mx-auto px-4 sm:px-6 lg:px-8']//div[1]//div[1]//*[name()='svg']") WebElement hearticon ;
	@FindBy(xpath="//section[@class='py-16 bg-white']//div[@class='grid md:grid-cols-3 gap-8']//div[2]//div[1]//*[name()='svg']") WebElement activitysquareicon;
	@FindBy(xpath="//section[@class='py-16 bg-white']//div[3]//div[1]//*[name()='svg']") WebElement clockicon;
	@FindBy(xpath="//p[contains(text(),'Join our community of successful members')]") WebElement JoincommunityText;
	 @FindBy(xpath = "//div[@class='flex justify-center gap-1 mb-4']") WebElement stars;
	 @FindBy(xpath="//h2[normalize-space()='Take control of your diabetes today']") WebElement takecontrolText;
	 @FindBy(xpath="//button[contains(text(),'Check Your Risk')]") WebElement checkyourriskButton;

	
	  public String getSweetBalanceText() {
	        return Sweetbalancetext.getText();
	    }
	  

	    public String getPrivacyPolicyText() {
	        return privacypolicytext.getText();
	    }

	    public String getSmartDiabetesText() {
	        return smartdiabetestext.getText();
	    }

	    public String getStartTodayText() {
	        return StartTodaytxt.getText();
	    }
	    
	   
	    public String getComprehensiveDiabetesText() {
	        return ComprehensiveDiabetesText.getText();
	    }
	
	    
	    public String getHealthTrackingtext() {
	        return HealthTrackingtext.getText();
	    }
	    
	    public String getNutritionText() {
	        return NutritionText.getText();
	    }
	    
	    public String getSmartInsightsText() {
	        return SmartInsightsText.getText();
	    }
	    
	    public String getMainText() {
	        return MainText.getText();
	    }
	    public String getJoincommunityText() {
	        return JoincommunityText.getText();
	    }
	 
	    public boolean isHeartIconVisible() {
	        return hearticon.isDisplayed();
	    }  

	    public boolean isactivitysquareicon() {
	        return activitysquareicon.isDisplayed();
	    } 
	    
	    public boolean isclockicon() {
	        return clockicon.isDisplayed();
	    }
	    
	    public String CheckYourRiskButton() {
	    	return checkyourriskButton.getText();
		  }
	    
	    
	        
	  public String gettakediabeteiccontrltext() {
		        return takecontrolText.getText();
	    } 
	  
	  public void verifycardstext(int index) {
	      
	        String cardheadingxpath = "//div[@id=\"root\"]/div[1]/main/section[2]/div/div[2]/div[\" + index + \"]/div[1]/p";
	        WebElement nameElement = driver.findElement(By.xpath(cardheadingxpath));
	        Assert.assertTrue(nameElement.isDisplayed(), "Card text at index " + index + " is not visible on the page");
	        
	        String detailsxpath = "(//div[@class='p-6 pt-0 space-y-2'])[\" + index + \"]";
	        WebElement carddetails = driver.findElement(By.xpath(detailsxpath));
	        Assert.assertTrue(carddetails.isDisplayed(), "cards Details at index " + index + " are not visible on the page");

	       }
	  
	    public String getFormattedHealthTrackingText() {
	        // Fetch the first part
	        String text1 = MainText.getText().trim();

	        
	        // Build the second part by joining 
	        List<String> textList = new ArrayList<>();
	        for (WebElement element : additionalTexts) {
	            textList.add(element.getText().trim());
	        }
	        String text2 = String.join(", ", textList);

	        // Combine both parts like in feature file
	        return text1 + ", " + text2;
	    }
	    
	    public void clickSectionByIndex(int index) {
	        String section = "(//div[@class='p-6 pt-6'])[" + index + "]";
	        driver.findElement(By.xpath(section)).click();
	        
	    }
	    
	 
	 

	    	    // Method to verify stars above text
	    	    public void verifyStarsAboveText() {
	    	        Assert.assertTrue(stars.isDisplayed() && JoincommunityText.isDisplayed(), "Either stars or the text is not visible on the page");

	    	        List<WebElement> starscount = stars.findElements(By.xpath("./*"));
	    	        Assert.assertEquals(starscount.size(), 5, "Expected 5 stars, but found " + starscount.size());

	    	        int starsY = stars.getLocation().getY();
	    	        int textY = JoincommunityText.getLocation().getY();

	    	        Assert.assertTrue(starsY < textY, "Validation Failed: Stars are not positioned above the text on the page.");
	    	        
	    	        
	    	    }
	    	 
	    	    public void verifyStarsUnderTestimonial(int index) {
	    	      
	    	        String nameXPath = "//div[@id='root']/div[1]/main/section[3]/div/div[2]/div[" + index + "]/div/div/div[2]/p";
	    	        WebElement nameElement = driver.findElement(By.xpath(nameXPath));
	    	        Assert.assertTrue(nameElement.isDisplayed(), "Testimonial name at index " + index + " is not visible on the page");

	    	        // Dynamic XPath for the stars under the testimonial based on index
	    	        String starsXPath = "(//div[@class='flex'])[" + index + "]";
	    	        WebElement starsContainer = driver.findElement(By.xpath(starsXPath));
	    	        Assert.assertTrue(starsContainer.isDisplayed(), "Stars under testimonial at index " + index + " are not visible on the page");

	    	        // Validate exactly 5 stars are present
	    	        List<WebElement> stars = starsContainer.findElements(By.xpath("./*"));
	    	        Assert.assertEquals(stars.size(), 5, "Expected 5 stars under testimonial at index " + index + ", but found " + stars.size());

	    	        LoggerLoad.info("5 stars are correctly displayed under testimonial at index " + index);
	    	    }

	    	    
	    	    
	    	    
	    	   

}
