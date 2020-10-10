package com.webdriver.saucedemo.webdriverPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login extends Wrapper{
	
	By userLocator = By.id("user-name");
	By passLocator = By.id("password");
	By signInBtnLocator = By.id("login-button");
	By homePageLocator = By.xpath("//*[@id='inventory_filter_container']");
 	By errorLoginLocator = By.xpath("//*[@id=\"login_button_container\"]/div/form/h3");
	
		
	public Login(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void LoginValidUser() {
		if (isDisplayed(userLocator)) {
				type("standard_user",userLocator);
				type("secret_sauce",passLocator);
				click(signInBtnLocator);
			
		}
		else { System.out.println("user name text box was not present"); }
	}
	
	public void LoginInvalidUser() {
		if (isDisplayed(userLocator)) {
				type("xxxxxxxx_user",userLocator);
				type("xxxxxx_sauce",passLocator);
				click(signInBtnLocator);
			
		        if (isDisplayed(errorLoginLocator)) {		
				       System.out.println("user name is wrong");	
				}
		        
		}
		else { System.out.println("user name text box was not present"); }			
		
	}

}
