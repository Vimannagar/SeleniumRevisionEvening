package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import utility.BaseTest;

public class CopyAndPaste {
	
	
	public static void main(String[] args) {
		
		WebDriver driver = BaseTest.initBrowser("https://facebook.com/signup");
		
		 driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("text to be pasted");
		
		 
		 Actions act = new Actions(driver);
		 
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
	
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		act.sendKeys(Keys.TAB).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	}

}
