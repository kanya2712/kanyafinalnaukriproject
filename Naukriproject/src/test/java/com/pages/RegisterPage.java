package com.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RegisterPage {
	
	WebDriver driver;

	@FindBy(xpath = "//*[@id=\"top-section-widgets.register-upload-cv-wdgt\"]/div[1]/div[2]/div/div[1]/button")
	WebElement Registerfree;

	@FindBy(xpath = "//*[@id=\"document-section-widgets.register-wdgt\"]/div/div[2]/form/div[3]/div[2]/button")
	WebElement fresher;

	@FindBy(id = "fname")
	WebElement name;

	@FindBy(id = "email")
	WebElement email;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(id = "typePassword")
	WebElement alreadyreg;

	@FindBy(xpath = "//*[@id=\"emailExistBox\"]/div/div[2]/form/div[2]/button")
	WebElement submit;

	// Constructor
	public RegisterPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	// Opens the Register page
	public void clickToRegister() throws InterruptedException {
		
		Registerfree.click();
		fresher.click();
		Thread.sleep(2000);

	}

	// Enters Username
	public void enterName(String un) {
		
		name.sendKeys(un);

	}

	// Enters Email Id
	public void enterEmail(String em) {
		
		email.sendKeys(em);

	}

	// Enters Password
	public void enterPassword(String pass) throws InterruptedException {
		
		password.sendKeys(pass);

	}

	// Again enters Password
	public void enterKey(String p) throws InterruptedException {
		
		alreadyreg.sendKeys(p);
		Thread.sleep(1000);
	}

	// Submits the Register button
	public void clickSubmit() {
		
		submit.click();

	}

}
