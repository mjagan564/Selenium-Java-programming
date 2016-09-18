package testMyWeDriverProject;

import com.openqa.selenium.ChromeDriver;
import com.openqa.selenium.FirefoxDriver;
import com.openqa.selenium.IEDriver;
import com.openqa.selenium.WebDriver;

public class testSample {

	public static void main(String[] args) {
		//FirefoxDriver driver = new FirefoxDriver();
		//IEDriver driver = new IEDriver();
		//ChromeDriver driver = new ChromeDriver();
		
		
		WebDriver driver = new FirefoxDriver();
		driver.click("Submit button");
		driver.sendKeys("Textbox", "trainer@way2automation.com");
		

	}

}
