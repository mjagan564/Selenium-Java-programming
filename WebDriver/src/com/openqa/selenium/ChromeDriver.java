package com.openqa.selenium;

public class ChromeDriver implements WebDriver {
	
	public ChromeDriver()
	{
	System.out.println("launching Chrome");	
	}

	public void click(String locator) {
		System.out.println("Clicked on a element in Chrome"+locator);
		
	}

	
	public void sendKeys(String locator, String value) 
	{
		System.out.println("typed in a element:"+locator+"Typed value"+value);
		
	}
	

}
