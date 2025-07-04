package hooks;

import java.io.ByteArrayInputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import utilities.ConfigReader;
import utilities.DriverManager;

public class Hooks {
	private static WebDriver driver;
	private static DriverManager driverFactory;
	ConfigReader configFileReader = new ConfigReader();

	@Before
	public void before() throws Throwable {

		System.out.println("About to open browser: Chrome");
		driverFactory = new DriverManager();
		driver = driverFactory.initializeDrivers("chrome");
		driver.get(ConfigReader.getApplicationUrl());
	}

	@AfterStep
	public void afterStep(Scenario scenario) {
		if (scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "My screenshot");
			Allure.addAttachment("Myscreenshot", new ByteArrayInputStream(screenshot));
		}
	}

	@After
	public static void after() throws Throwable {

		driverFactory.quitDriver();
	}

}
