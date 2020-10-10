package com.webdriver.saucedemo.webdriverPOM;

import java.util.List;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 * @author ANTONIOFLORES
 * @version 1
 * This class includes Selenium WebDriver commands
 *
 */

public class Wrapper {
	
	private WebDriver driver;
	
	/*
	 * Wrapper constructor
	 * 
	 */
	
	public Wrapper(WebDriver driver) {		
		          this.driver=driver;
	}
	
	/*
	 * Driver connection
	 * 
	 */
	public WebDriver chromeDriverConnection() {		
		          System.setProperty("webdriver.chrome.driver", ".\\src.test.resources\\chromedriver\\chromedriver.exe" );
		          driver = new ChromeDriver();
		          return driver;
		
	}
	
	public List<WebElement> findElements(By locator) {		
		          return driver.findElements(locator);	
		
	}
    
    public String getText(WebElement element) {
    	          return element.getText();
    }
    
    public String getText(By locator) {
    	         return driver.findElement(locator).getText();
    }
    
    public void type(String inputText, By locator) {
    	         driver.findElement(locator).sendKeys(inputText);    	
    	
    }
    
    public void click(By locator) {
    	        driver.findElement(locator).click();
    }

    public Boolean isDisplayed(By locator) {
    	
    	  try {
    		   return driver.findElement(locator).isDisplayed();
    	  } 
    	  catch(org.openqa.selenium.NoSuchElementException e) {
    	       return false;
    	  }	
    
    }	
    public void visit(String url) {
    	        driver.get(url);
    	
    }
	
	

}
