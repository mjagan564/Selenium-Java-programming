
package gmailopen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class gmailaccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
WebDriver f=new gmailopen.WebDriver();
		
		f.get("https://www.gmail.com/r.php");
		
		
		Thread.sleep(5000);
		f.findElement(By.id("u_0_1")).sendKeys("jagadeesh");

		
		Thread.sleep(5000);
		f.findElement(By.id("u_0_3")).sendKeys("kumar");
		
        Thread.sleep(5000);
        f.findElement(By.id("u_0_5")).sendKeys("5519985255");
        
        Thread.sleep(5000);
        f.findElement(By.id("u_0_8")).sendKeys("5519985255");
        
        Thread.sleep(5000);
        f.findElement(By.id("u_0_a")).sendKeys("5519985255");
       
        Thread.sleep(5000);
        WebElement mnth = f.findElement(By.id("month"));
        Select select = new Select(mnth);
        select.selectByVisibleText("Jan"); 
        
        Thread.sleep(5000);
        WebElement dy = f.findElement(By.id("day"));
        Select selectdy = new Select(dy);
        selectdy.selectByVisibleText("2"); 
        
        Thread.sleep(5000);
        WebElement yr = f.findElement(By.id("year"));
        Select selectyr = new Select(yr);
        selectyr.selectByVisibleText("1992");
        
        Thread.sleep(5000);
        f.findElement(By.xpath(".//*[@id='u_0_g']/span[1]/label")).click();
        
        Thread.sleep(5000);
        f.findElement(By.id("u_0_i")).click();
        
        

        
	}

}
