package com.openqa.selenium;

public class IEDriver implements WebDriver {
	
	public IEDriver()
	{
	System.out.println("launching IE");	
	}

	
	public void click(String locator) {
		System.out.println("Clicked on a element in IE"+locator);
		
	}

	
	public void sendKeys(String locator, String value) 
	{
		System.out.println("typed in a element:"+locator+"Typed value"+value);
		
	}

}
