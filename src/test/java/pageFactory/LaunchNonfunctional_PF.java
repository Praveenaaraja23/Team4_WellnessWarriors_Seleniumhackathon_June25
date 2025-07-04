package pageFactory;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.ConfigReader;
import utilities.DriverManager;

public class LaunchNonfunctional_PF {
	
	WebDriver driver= DriverManager.getDriver();
	ConfigReader configFileReader=DriverManager.configReader();
	
	 public LaunchNonfunctional_PF() {
	    	
			PageFactory.initElements(driver,this);
	}
	 public long getPageLoadTime() {
	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        // Wait until page is fully loaded
	        new WebDriverWait(driver, Duration.ofSeconds(10)).until(
	            webDriver -> js.executeScript("return document.readyState").equals("complete")
	        );

	        // Return load time in milliseconds
	        return (Long) js.executeScript(
	            "return window.performance.timing.loadEventEnd - window.performance.timing.navigationStart;"
	        );
	    }
	 
	 
	}