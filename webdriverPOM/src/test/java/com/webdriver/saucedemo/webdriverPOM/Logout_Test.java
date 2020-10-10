package com.webdriver.saucedemo.webdriverPOM;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class Logout_Test {

	private WebDriver driver;
	Logout logoutInPage;

	@Before
	public void setUp() throws Exception {
		logoutInPage = new Logout(driver);
		driver = logoutInPage.chromeDriverConnection();
		logoutInPage.visit("https://www.saucedemo.com/inventory.html");
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws Exception {
		Thread.sleep(6000);
		logoutInPage.logout();
		Thread.sleep(6000);
		System.out.println("I wish you were here"); 
		 
	}	

}
