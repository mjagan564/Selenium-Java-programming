package com.thoughtworks.selenium;

public class DefaultSelenium {
	public DefaultSelenium(String serverHost, int serverPort, String browserStartCommand, String browserURL)
	{
		System.out.println("serverHost"+serverHost);
		System.out.println("serverPort"+serverPort);
		System.out.println("browser"+browserStartCommand);
		System.out.println("URL"+browserURL);
	}
	public void start()
	{
	System.out.println("Starting the selenium");	
	}
	
	
	public void click(String locator)
	{
		System.out.println("Clicked on element:"+locator);
	}
	
	
	public void type(String locator, String value)
	{
		System.out.println("Clicked on element:"+locator+"Typed the value as:"+value);
	
	}

}
