package com.openqa.selenium;

public class FirefoxDriver implements WebDriver {

	public FirefoxDriver()
	{
	System.out.println("launching Firefox");	
	}
	
	
	public void click(String locator) {
		System.out.println("Clicked on a element in Firefox"+locator);
		
	}

	
	public void sendKeys(String locator, String value) 
	{
		System.out.println("typed in a element:"+locator+"Typed value"+value);
		
	}

}
