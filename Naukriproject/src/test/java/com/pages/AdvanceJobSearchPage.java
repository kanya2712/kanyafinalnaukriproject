package com.pages;

import java.util.ArrayList;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AdvanceJobSearchPage  {
	
	WebDriver driver;

	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div/ul[1]/li[1]/a/div")
	WebElement jobs;

	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div/ul[1]/li[1]/div/ul[1]/li[2]/a")
	WebElement menu;

	@FindBy(xpath = "//*[@id=\"advKeyskills\"]/div[1]/div[2]/input")
	WebElement skills;

	@FindBy(xpath = "//*[@id=\"Sug_advLocation\"]")
	WebElement location;

	@FindBy(xpath = "//*[@id=\"ddAdvIndusrty\"]/div[1]/ul/li/div")
	WebElement industrytab;

	@FindBy(xpath = "//*[@id=\"ul_ddAdvIndusrty\"]/div/div[1]/ul/li[5]/a")
	WebElement industry;

	@FindBy(xpath = "//input[@name='']")
	WebElement label;

	@FindBy(xpath = "//*[@id=\"adv_jobCategory\"]")
	WebElement jobcategorytab;

	@FindBy(xpath = "//*[@id=\"8\"]")
	WebElement jobcatrgory;

	@FindBy(xpath = "//*[@id=\"advFrm\"]/div[5]/div[2]/div/div[1]/a")
	WebElement jobtype;

	@FindBy(xpath = "//*[@id=\"advFrm\"]/div[6]/div[2]/div/div[1]/a")
	WebElement sortby;

	@FindBy(xpath = "//*[@id=\"adv_submit\"]")
	WebElement search;
    
	//Constructor
	public AdvanceJobSearchPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
    
	//opens Advance job search page
	public void clickJobSearch() throws InterruptedException {

		Actions action = new Actions(driver);

		action.moveToElement(jobs).build().perform();

		Thread.sleep(2000);

		menu.click();

		ArrayList<String> windowhandle = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(windowhandle.get(2));

		driver.close();

		driver.switchTo().window(windowhandle.get(1));

		skills.sendKeys("core java");

		location.sendKeys("Chennai");

		industrytab.click();

		industry.click();

		label.click();

		jobcategorytab.click();

		jobcatrgory.click();

		jobtype.click();

		sortby.click();

		search.click();
	}

}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

		
	
	


