package com.webdriver.saucedemo.webdriverPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigateShoppingCart extends Wrapper{
	
	By yourCartLocator = By.xpath("(//div[contains(.,'Your Cart')])[3]");
    By shoppingCartLocator = By.id("shopping_cart_container");
    By productsTextLocator = By.xpath("//div[contains(@class,'product_label')]");
	
    String yourCart;
    
	public NavigateShoppingCart(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

    public Boolean openShoppingCart() {
		if (isDisplayed(productsTextLocator)) {
				
			      click(shoppingCartLocator);

			      if  (isDisplayed(yourCartLocator)) {
			    	  yourCart=getText(yourCartLocator);
			    	  System.out.println("Your Cart was opened"); 
			      }
			      
		}
		else { 
			System.out.println("Your Cart was not opened"); 
			return false; 
		}
		return true;					
		
	}


}
