package utilities;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class DriverManager {
	
	private static WebDriver driver;
    private static ConfigReader configFileReader = new ConfigReader();
    private static ThreadLocal<WebDriver> tldriver = new ThreadLocal<>();

    public WebDriver initializeDrivers(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
          //  LoggerLoad.info("Testing on chrome");
            tldriver.set(new ChromeDriver());
        }
        
        getDriver().manage().deleteAllCookies();
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return getDriver();
    }

    public static WebDriver getDriver() {
        return tldriver.get();
    }

    public static void quitDriver() throws Throwable {
        if (tldriver.get() != null) {
            tldriver.get().quit();
            tldriver.remove();
        }
    }

    public static ConfigReader configReader() {
        return configFileReader;
    }
} 
	
/*	private static ThreadLocal<WebDriver> ThreadLocalDriver = new ThreadLocal<>();

	// Intialize the webdriver instance based on the browser name
	public static WebDriver initdriver(String browser) {
		WebDriver driver;
		switch (browser.toLowerCase()) {
		case "chrome":
			LoggerReader.info("chrome intialized");
			driver = new ChromeDriver();
			break;
		case "edge":
			LoggerReader.info("Edge intialized");
			driver = new EdgeDriver();
			break;
		case "firefox":
			LoggerReader.info("firefox intialized");
			driver = new FirefoxDriver();
			break;
		default:
			throw new IllegalArgumentException("Unsupported browser: " + browser);
		}

		ThreadLocalDriver.set(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}

	// Access Drivers in tests
	public static WebDriver getDriver() {
		if (ThreadLocalDriver.get() == null) {
			throw new IllegalStateException("WebDriver is not initialized. Call initdriver() first.");
		}
		return ThreadLocalDriver.get();
	}

	// To Quit the driver
	public static void quitDriver() throws Throwable {
		if (ThreadLocalDriver.get() != null) {
			ThreadLocalDriver.get().quit();
			ThreadLocalDriver.remove();
		}
	}

} */


