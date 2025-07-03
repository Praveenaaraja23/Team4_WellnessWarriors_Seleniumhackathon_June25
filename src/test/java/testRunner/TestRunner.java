package testRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin = {"pretty", "html:target/sweetbalance.html","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, //reporting purpose
		monochrome=false, 
<<<<<<< HEAD
		tags ="@hmd", 
		features = {"src/test/resources/features"}, 
=======
		tags =" ", 
			 
				features = {
				        "src/test/resources/features/01_Launch UIComponents.feature",
				        "src/test/resources/features/02_Launchnavigationcomponents.feature",
				        "src/test/resources/features/03_LaunchNonfunctional.feature",
				        "src/test/resources/features/04_Diabetesriskanalyzer.feature",
				       
				    },
>>>>>>> main
		glue= {"stepDefinition","hooks"})

public class TestRunner extends AbstractTestNGCucumberTests {

	@Override
    @DataProvider(parallel =false)
    public Object[][]  scenarios() {
				
		return super.scenarios();
		
    }
}


