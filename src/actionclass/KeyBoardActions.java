package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import utility.BaseTest;

public class KeyBoardActions {
	
	public static void main(String[] args) throws InterruptedException {
		
		
	WebDriver driver = BaseTest.initBrowser("https://online.hrtchp.com/oprs-web/guest/home.do?h=1");
		
		driver.findElement(By.xpath("//*[@id='fromPlaceName']")).sendKeys("Shimla");
		
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.TAB).sendKeys("Abcdef").build().perform();
		
		
		
	}

}
