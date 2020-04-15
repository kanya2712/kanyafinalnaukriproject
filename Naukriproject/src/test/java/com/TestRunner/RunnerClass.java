package com.TestRunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



           @RunWith(Cucumber.class)
            @CucumberOptions
                            (
		                       features = "src/test/resources/features",
				               glue = {"com.stepdefinition"},
				               plugin = {"pretty", "html:reports/cucumber-html-report", 
				            		    "json:reports/cucumber-html-report/jsonreport",
							            "com.cucumber.listener.ExtentCucumberFormatter:reports/Extentreports/Extentreport.html"},
		                       monochrome = true
		                       
                            )


public class RunnerClass
{
	 @AfterClass
     public static void extendReport()
   {
       Reporter.loadXMLConfig("src/test/resources/Testdata/extent-config.xml");
       Reporter.setSystemInfo("user", System.getProperty("user.name"));
       Reporter.setSystemInfo("os", "Windows");
       Reporter.setTestRunnerOutput("Sample test runner output message");
   }

}