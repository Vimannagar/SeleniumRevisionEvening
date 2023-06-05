package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClickOperationUsingJS {
	
	public static void main(String[] args) {
		
		WebDriver driver = BaseTest.initBrowser("https://www.spotify.com/in-en/signup");
			
		
		WebElement maleradio = driver.findElement(By.xpath("//*[text()='Male']/preceding-sibling::span"));
				
		
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 
		 js.executeScript("arguments[0].click();", maleradio);
		 

	}

}
