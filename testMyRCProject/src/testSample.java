import com.thoughtworks.selenium.DefaultSelenium;

public class testSample {

	public static void main(String[] args) {
		
		DefaultSelenium selenium=new DefaultSelenium("localhost", 4444, "firefox", "http://gmail.com");
		selenium.start();
		selenium.click("Submit button");
		selenium.type("Text box", "trainer@way2automation");
		
		

	}

}
