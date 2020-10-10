package com.webdriver.saucedemo.webdriverPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout extends Wrapper{
 
	//By logoutLocator = By.id("logout_sidebar_link");
	By logoutLocator = By.xpath("//*[@id=\"logout_sidebar_link\"]");
	By btnMenuLocator = By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button");
	//By productsLocator = By.linkText(linkText)
	//*[@id="menu_button_container"]/div/div[3]/div/button
	
	
	public Logout(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}	
	
	public void logout() {
	
		//if (getText(productsLocator)) 
		        click(btnMenuLocator);
				click(logoutLocator);			
	    //}
		//else { System.out.println("text was not present"); }
	}

}
