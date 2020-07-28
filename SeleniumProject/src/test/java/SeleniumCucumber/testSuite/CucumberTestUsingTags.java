package SeleniumCucumber.testSuite;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "resources/Features",
		glue={"SeleniumCucumber/pages/steps","SeleniumCucumber/base"},
		tags="@backgroundTest",
		plugin = { "pretty", "html:CucumberReports/CucumberTagsTestReports.html",
				"json:CucumberReports/CucumberTagsTestReports.json",
				"testng:CucumberReports/CucumberTagsTestReports.xml" })

public class CucumberTestUsingTags extends AbstractTestNGCucumberTests {
}
