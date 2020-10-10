package com.webdriver.saucedemo.webdriverPOM;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class AddItem_Test {

	private WebDriver driver;
	AddItem addItem;
	Boolean isDisplayed;

	@Before
	public void setUp() throws Exception {
		addItem = new AddItem(driver);
		driver = addItem.chromeDriverConnection();
		addItem.visit("https://www.saucedemo.com/inventory.html");
		driver.manage().window().maximize();
		
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws Exception {
		isDisplayed=addItem.addItem();
		assertTrue(isDisplayed);
		Thread.sleep(6000);
		System.out.println("I wish you were here");
	}
}
