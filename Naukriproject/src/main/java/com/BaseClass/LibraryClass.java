package com.BaseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LibraryClass {
	
	public WebDriver driver;
	public Properties prop;
	public FileInputStream file;

	// launching the chrome browser
	public void launchApp() throws IOException, InterruptedException {

		file = new FileInputStream("src\\test\\resources\\config.property\\configfile");
		prop = new Properties();
		prop.load(file);
		String browser = prop.getProperty("browser");

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));

	}

	// closes all other windows except parent window
	public void closeAllChildWindows() {

		String parentwindow = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
			driver.close();
		}
		driver.switchTo().window(parentwindow);

	}

	// closing the app
	public void closeApp() {
		driver.close();
	}

}
