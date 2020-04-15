package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage  {
	
	WebDriver driver;

	@FindBy(xpath = "//*[@id=\"login_Layer\"]/div")
	WebElement loginpage;

	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div/form/div[2]/input")
	WebElement emailid;

	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div/form/div[3]/input")
	WebElement password;

	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div/form/div[5]/button")
	WebElement loginbtn;

	// Constructor
	public LoginPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	// Opens login page
	public void open_Loginpage() {
		loginpage.click();

	}

	// Enters Email Id
	public void enter_Email(String id) {
		emailid.sendKeys(id);

	}

	// Enters Password
	public void enter_Password(String pwd) throws InterruptedException {

		password.sendKeys(pwd);

	}

	// Submits the Login button
	public void submit_Login() throws InterruptedException {

		loginbtn.click();
		Thread.sleep(2000);
	}

}
