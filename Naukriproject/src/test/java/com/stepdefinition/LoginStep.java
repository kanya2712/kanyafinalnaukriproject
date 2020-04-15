package com.stepdefinition;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.BaseClass.LibraryClass;
import com.pages.LoginPage;
import com.seleniumutil.UtilityClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep extends LibraryClass {
	
	
	LoginPage login_page;
	UtilityClass util;
	final static Logger logger = LogManager.getLogger(LoginStep.class.getName());

	@Given("^user already launchs the chrome$")
	public void user_already_launchs_the_chrome() throws Throwable {

		launchApp();
		logger.info("chrome is launched");

	}

	@When("^user already opens naukri homepage$")
	public void user_already_opens_naukri_homepage() throws Throwable {

		logger.info("naukri home page is opened");
		login_page = new LoginPage(driver);
		login_page.open_Loginpage();
		logger.info("login page is opened");

	}

	@Then("^user enter \"([^\"]*)\" and \"([^\"]*)\" to open login page$")
	public void user_enter_and_to_open_login_page(String EmailId, String password) throws Throwable {

		login_page = new LoginPage(driver);
		login_page.enter_Email(EmailId);
		login_page.enter_Password(password);
		logger.info("entered username and password");
	}

	@Then("^submit the login button$")
	public void submit_the_login_button() throws Throwable {

		login_page = new LoginPage(driver);
		login_page.submit_Login();
		Thread.sleep(3000);
		System.out.println("login success into naukri account");
		util = new UtilityClass(driver);
		util.takeSnapShot(
				"C:\\Users\\HOME\\git\\projectsample\\Naukriproject\\src\\test\\resources\\screenshot\\loginpage.png");
		logger.info("ScreenShot taken for loginpage");
		

	}

}
