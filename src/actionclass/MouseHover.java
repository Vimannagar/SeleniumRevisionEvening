package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utility.BaseTest;

public class MouseHover {
	
	
	public static void main(String[] args) {
		WebDriver driver = BaseTest.initBrowser("https://www.amazon.in/");
		
		
	WebElement hoverelement = driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));
	
	Actions act = new Actions(driver);
	
	act.moveToElement(hoverelement).perform();
	
	}

}
