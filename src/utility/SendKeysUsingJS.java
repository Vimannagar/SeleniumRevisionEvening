package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SendKeysUsingJS {
	
	
	public static void main(String[] args) {
	WebDriver driver = BaseTest.initBrowser("https://www.spotify.com/in-en/signup");
			
		
		WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
				
		
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 
		 js.executeScript("arguments[0].value='alternate way to sendkeys'", email);
	}

}
