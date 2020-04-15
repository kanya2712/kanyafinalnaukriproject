package com.stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.BaseClass.LibraryClass;
import com.pages.HomeCalulatorPage;
import com.seleniumutil.UtilityClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomeCalculatorStep extends LibraryClass {
    
	
	UtilityClass util;
	HomeCalulatorPage calculate;
	final static Logger logger = LogManager.getLogger(HomeCalculatorStep.class.getName());

	
	@Given("^user launchs the chrome$")
	public void user_launchs_the_chrome() throws Throwable {
	    
		launchApp();
		logger.info("chrome is launched");
	}

	@When("^user enters naukri homepage$")
	public void user_enters_naukri_homepage() throws Throwable {
	    
		logger.info("naukri homepage is opened");
	}

	@Then("^user enters home calculator page$")
	public void user_enters_home_calculator_page() throws Throwable {
	   
		calculate = new HomeCalulatorPage(driver);
		calculate.clickHomeCalculator();
		logger.info("HomeCalculator page is opened");
		util = new UtilityClass(driver);
		util.takeSnapShot(
				"C:\\Users\\HOME\\git\\projectsample\\Naukriproject\\src\\test\\resources\\screenshot\\calculatorpage.png");
		logger.info("ScreenShot taken");
	}


	
}
