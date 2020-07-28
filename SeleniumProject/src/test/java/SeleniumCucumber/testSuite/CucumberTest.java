package SeleniumCucumber.testSuite;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "resources/Features/login.feature",
		glue={"SeleniumCucumber/pages/steps","SeleniumCucumber/base"},
		plugin = { "pretty", "html:CucumberReports/CucumberTestReports.html",
				"json:CucumberReports/CucumberTestReports.json",
				"testng:CucumberReports/CucumberTestReports.xml" })

public class CucumberTest extends AbstractTestNGCucumberTests {

}
