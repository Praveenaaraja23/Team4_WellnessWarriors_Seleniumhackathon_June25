package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



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


