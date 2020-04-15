package com.stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.BaseClass.LibraryClass;
import com.pages.AdvanceJobSearchPage;
import com.seleniumutil.UtilityClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdvanceJobSearchStep extends LibraryClass {
	
	
	UtilityClass util;
	AdvanceJobSearchPage search;
	final static Logger logger = LogManager.getLogger(AdvanceJobSearchStep.class.getName());

	@Given("^user already on chrome$")
	public void user_already_on_chrome() throws Throwable {
		
		launchApp();
		logger.info("chrome is launched");

	}

	@When("^user go to naukri homepage$")
	public void user_go_to_naukri_homepage() throws Throwable {

		logger.info("naukri home page is opened");

	}

	@Then("^user go to search page and search for the jobs$")
	public void user_go_to_search_page_and_search_for_the_jobs() throws Throwable {
		
		search = new AdvanceJobSearchPage(driver);
		search.clickJobSearch();
		logger.info("jobs page is opened");
		util = new UtilityClass(driver);
		util.takeSnapShot(
				"C:\\Users\\HOME\\git\\projectsample\\Naukriproject\\src\\test\\resources\\screenshot\\jobsearchpage.png");
		logger.info("ScreenShot taken");
	}

}
