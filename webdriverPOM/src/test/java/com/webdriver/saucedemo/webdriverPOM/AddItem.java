package com.webdriver.saucedemo.webdriverPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddItem extends Wrapper{
	
	By yourCartLocator = By.xpath("(//div[contains(.,'Your Cart')])[3]");
    By shoppingCartLocator = By.id("shopping_cart_container");
    By productsTextLocator = By.xpath("//div[contains(@class,'product_label')]");
    By AddToCartLocator = By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button");
	
    String yourCart;
    String item;

	public AddItem(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

    public Boolean addItem() {
		if (isDisplayed(productsTextLocator)) {
				
			      click(AddToCartLocator);
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
