package com.stepdefinition;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.BaseClass.LibraryClass;
import com.pages.RegisterPage;
import com.seleniumutil.UtilityClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterStep extends LibraryClass {
	
	RegisterPage register;
	UtilityClass util;
	final static Logger logger = LogManager.getLogger(RegisterStep.class.getName());

	@Given("^user launchs the chrome browser$")
	public void user_launchs_the_chrome_browser() throws Throwable {

		launchApp();
		logger.info("Browser is lunched");

	}

	@When("^user opens the naukri homepage$")
	public void user_opens_the_naukri_homepage() throws Throwable {

		logger.info("naukri home page is opened");
		register = new RegisterPage(driver);
		register.clickToRegister();
		logger.info("Register page is opened");

	}

	@Then("^enter valid details for register$")
	public void enter_valid_details_for_register() throws Throwable {

		register = new RegisterPage(driver);
		register.enterName("Anthireddy Manasa");
		register.enterEmail("manasaanthireddy34@gmail.com");
		register.enterPassword("Manasa@34");
		logger.info("entered name,emaild and password");
		Thread.sleep(2000);
		util = new UtilityClass(driver);
		util.takeSnapShot(
				"C:\\Users\\HOME\\git\\projectsample\\Naukriproject\\src\\test\\resources\\screenshot\\registerpage.png");
		logger.info("ScreenShot taken");

	}

	@Then("^submit the register button$")
	public void submit_the_register_button() throws Throwable {

		register = new RegisterPage(driver);
		register.enterKey("Manasa@34");
		register.clickSubmit();

	}

}
