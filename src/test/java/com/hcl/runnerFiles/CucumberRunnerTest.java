package com.hcl.runnerFiles;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin={"pretty",
				"html:target/cucumber-reports/report.html", 
				"json:target/cucumber-reports/Cucumber.json" },
		features="src//test//resources//Features",
		glue={"com.hcl.stepdefinitions"},
		dryRun=false,
		monochrome=true
		)
public class CucumberRunnerTest {
	

}
