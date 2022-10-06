package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.report.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(   publish=true,
					snippets=SnippetType.CAMELCASE, 
					dryRun = false, 
					name="verifying AdactinHotelApp Login Credentials", 
					stepNotifications = true, 
					monochrome = true, 
					plugin = { "pretty","json:target\\cucumber.json" }, 
					features = "src\\test\\resources\\Features\\Login.feature",
					glue = "com.stepdefn")

public class TestRunner {
	
	@AfterClass
	public static void afterClass() {
		
		Reporting.generateJvmReport("C:\\Users\\hp\\eclipse-workspace\\CucumberExampl\\target\\cucumber.json");
		

	}

}
