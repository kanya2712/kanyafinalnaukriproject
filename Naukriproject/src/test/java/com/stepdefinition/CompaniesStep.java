package com.stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.BaseClass.LibraryClass;
import com.pages.CompaniesPage;
import com.seleniumutil.UtilityClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CompaniesStep extends LibraryClass {
	
	CompaniesPage company;
	UtilityClass util;
	final static Logger logger = LogManager.getLogger(CompaniesStep.class.getName());

	@Given("^user is on chrome$")
	public void user_is_on_chrome() throws Throwable {

		launchApp();
		logger.info("chrome is launched");
	}

	@When("^User opens Naukri homepage$")
	public void user_opens_Naukri_homepage() throws Throwable {
		
		logger.info("naukri homepage is opened");
	}

	@Then("^user enter into companies$")
	public void user_enter_into_companies() throws Throwable {

		company = new CompaniesPage(driver);
		company.clickCompanies();
		logger.info("comapnies page is opened");
		util = new UtilityClass(driver);
		util.takeSnapShot(
				"C:\\Users\\HOME\\git\\projectsample\\Naukriproject\\src\\test\\resources\\screenshot\\companiespage.png");
		logger.info("ScreenShot taken");

	}

}
