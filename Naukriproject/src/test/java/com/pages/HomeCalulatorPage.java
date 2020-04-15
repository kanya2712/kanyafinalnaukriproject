package com.pages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeCalulatorPage {

	WebDriver driver;

	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div/ul[1]/li[6]/a/div")
	WebElement more;

	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div/ul[1]/li[6]/div/ul[1]/li[4]/a")
	WebElement calculator;

	@FindBy(xpath = "//*[@id=\"CompanyName\"]")
	WebElement company;

	@FindBy(xpath = "//*[@id=\"JobProfileName\"]")
	WebElement designation;

	@FindBy(xpath = "//*[@id=\"ctc\"]")
	WebElement CTC;

	@FindBy(xpath = "//*[@id=\"routes-margin\"]/div/form/div[4]/button/span")
	WebElement search;

	// Constructor
	public HomeCalulatorPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// opens Home Calculator page
	public void clickHomeCalculator() throws InterruptedException {
		
		Actions action = new Actions(driver);

		action.moveToElement(more).build().perform();
		Thread.sleep(2000);

		calculator.click();

		ArrayList<String> windowhandle = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(windowhandle.get(2));

		driver.close();

		driver.switchTo().window(windowhandle.get(1));

		company.sendKeys("cognizant");

		designation.sendKeys("java developer");

		CTC.sendKeys("4,00,000");

		search.click();
	}
}
