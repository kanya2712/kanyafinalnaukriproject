package com.pages;

import java.util.ArrayList;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompaniesPage {

	WebDriver driver;

	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div/ul[1]/li[3]/a/div")
	WebElement companies;

	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div/ul[1]/li[3]/div/ul/li[3]/a")
	WebElement questions;

	// Constructor
	public CompaniesPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// opens companies page
	public void clickCompanies() throws InterruptedException {

		Actions action = new Actions(driver);

		action.moveToElement(companies).build().perform();
		Thread.sleep(2000);

		questions.click();

		ArrayList<String> windowhandle = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(windowhandle.get(2));

		driver.close();

		driver.switchTo().window(windowhandle.get(1));

	}
}
