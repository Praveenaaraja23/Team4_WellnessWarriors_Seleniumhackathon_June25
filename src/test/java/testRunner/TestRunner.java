package testRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin = {"pretty", "html:target/sweetbalance.html","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, //reporting purpose
		monochrome=false, 
		tags =" ", 
		features = {"src/test/resources/features"}, 
		glue= {"stepDefinition","Hooks"})

public class TestRunner extends AbstractTestNGCucumberTests {


    @DataProvider(parallel =false)
    public Object[][]  scenarios() {
				
		return super.scenarios();
		
    }
}


