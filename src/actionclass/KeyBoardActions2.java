package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import utility.BaseTest;

public class KeyBoardActions2 {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = BaseTest.initBrowser("https://google.com");
		
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("India");
		
		Thread.sleep(1000);
		
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.ENTER).perform();
		
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		
		
		
		
	}

}
