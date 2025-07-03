package pageFactory;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.ConfigReader;
import utilities.DriverManager;



public class Launchnavigationcomponents_pf {
	
	WebDriver driver= DriverManager.getDriver();
	ConfigReader configFileReader=DriverManager.configReader();
	
	public Launchnavigationcomponents_pf() {
		PageFactory.initElements(driver , this);

	}
	
	//@FindBy(xpath=") WebElement;
	@FindBy(xpath="//button[contains(text(), 'Start Today')]") WebElement StartTodaytxt;
	@FindBy(xpath="//p[@class='text-gray-600']") WebElement signintext;
	@FindBy(xpath="//button[contains(text(), ' Login')]") WebElement Loginvisibletxt;
	@FindBy(xpath="//button[contains(text(), 'Check Your Risk ')]") WebElement clickCheckYourRisk;
	@FindBy(xpath="//h2[contains(text(), 'Diabetes Risk Analyzer')]") WebElement checkyourrisktxt ;
	 
	
	
	 public void clickStartToday() {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.elementToBeClickable(StartTodaytxt)).click();
	    }

	 public String getsignintext() {
		 
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.elementToBeClickable(signintext));
	        return signintext.getText();
	       
	    }

		public String getLoginText() {
		    new WebDriverWait(driver, Duration.ofSeconds(10))
		        .until(ExpectedConditions.visibilityOf(Loginvisibletxt));
		    return Loginvisibletxt.getText();
		}
		
		 public String  getLoginvisibletxt()
		 {
			
			    // Get button text
			    String text = Loginvisibletxt.getText();
			    // Button position
			    int x = Loginvisibletxt.getLocation().getX();
			    int y = Loginvisibletxt.getLocation().getY();
			    int width = Loginvisibletxt.getSize().getWidth();
			    int buttonRight = x + width;
                int containerRight = Loginvisibletxt.getLocation().getX() + Loginvisibletxt.getSize().getWidth();
			   int distanceFromRight = containerRight - buttonRight;
			    int tolerance = 30;

			    boolean isTopRight = distanceFromRight <= tolerance && y <= 50;

			    String alignment = isTopRight ? "top-right" : "not top-right";

			    return "Text: " + text + ", Alignment: " + alignment + ", Position: (" + x + "," + y + ")";
			}
		 
	
		 public void clickLogin() {
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        wait.until(ExpectedConditions.elementToBeClickable(Loginvisibletxt)).click();
		    }
		 
		 public String  getLogintxt()
		 {
			 new WebDriverWait(driver, Duration.ofSeconds(10))
		        .until(ExpectedConditions.visibilityOf(Loginvisibletxt));

			 return Loginvisibletxt.getText();
		 }
		 
		 public void clickcheckyourrisk() {
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        wait.until(ExpectedConditions.elementToBeClickable(clickCheckYourRisk)).click();
		    }
		 
		 public String  getcheckyourrisktxt()
		 {
			 new WebDriverWait(driver, Duration.ofSeconds(10))
		        .until(ExpectedConditions.visibilityOf(checkyourrisktxt));

			 return checkyourrisktxt.getText();
			 
		 }
		 
		 public void scrollToBottom() {
			    JavascriptExecutor js = (JavascriptExecutor) driver;
			    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			}
			
		// Scroll to top of the page
		    public void scrollToTop() {
		        JavascriptExecutor js = (JavascriptExecutor) driver;
		        js.executeScript("window.scrollTo(0, 0)");
		    }
		 
			}

	


