package com.webdriver.saucedemo.webdriverPOM;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Login_Test {
	
	private WebDriver driver;
	Login loginInPage;

	@Before
	public void setUp() throws Exception {
		loginInPage = new Login(driver);
		driver = loginInPage.chromeDriverConnection();
		loginInPage.visit("https://www.saucedemo.com/index.html");
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws Exception {
		loginInPage.LoginValidUser();
		System.out.println("I wish you were here");
		Thread.sleep(2000);
		//assertTrue(loginInPage.isHomePageDisplayed());
	}	
	
}
