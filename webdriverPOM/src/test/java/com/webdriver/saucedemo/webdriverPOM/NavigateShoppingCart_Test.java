package com.webdriver.saucedemo.webdriverPOM;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class NavigateShoppingCart_Test {

	private WebDriver driver;
	NavigateShoppingCart shoppingCart;
	Boolean isDisplayed;

	@Before
	public void setUp() throws Exception {
		shoppingCart = new NavigateShoppingCart(driver);
		driver = shoppingCart.chromeDriverConnection();
		shoppingCart.visit("https://www.saucedemo.com/inventory.html");
		driver.manage().window().maximize();
		
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws Exception {
		isDisplayed=shoppingCart.openShoppingCart();
		assertTrue(isDisplayed);
		Thread.sleep(6000);
		System.out.println("I wish you were here"); 
		
		 
	}	
	
}

