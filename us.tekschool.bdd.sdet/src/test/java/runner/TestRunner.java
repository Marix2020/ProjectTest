package runner;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:Features", // features tells cucumber options where are features are located
		glue = { "stepDefinitions" }, // glue tells cucumber options where Step Definitions is located
		tags = {"@registerTest"},
		dryRun = false,//dry run if sets to false checks if all steps in feature files has step definitions
		monochrome = true, // if set to true, makes the console output readable
		strict = false, // if set to false will fail if there are pending undefined steps.
		format = {"pretty",
		        "html:target/cucumber-reports/cucumber-pretty",
		        "json:target/cucumber-reports/CucumberTestReport.json",
		        "rerun:target/cucumber-reports/rerun.txt"
		},
		plugin = "json:target/cucumber-reports/CucumberTestReport.json")

public class TestRunner {

}
