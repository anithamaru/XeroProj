package TestRunner;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Java_Anitha\\XeroProj\\src\\main\\java\\XeroFeature\\Xero.Feature",
		glue= "StepDefinition",
		monochrome = false,
				format = { "pretty", "html:target/cucumber", "json:target/cucumber-report.json" },
				tags= {"@SmokeTest"},
		dryRun=false
		)


public class XeroRunner {

}
