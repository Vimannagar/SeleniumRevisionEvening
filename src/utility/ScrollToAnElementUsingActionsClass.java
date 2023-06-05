package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ScrollToAnElementUsingActionsClass {
	
	
	public static void main(String[] args) {
		WebDriver driver = BaseTest.initBrowser("https://www.amazon.in/");
			
		
		WebElement element = driver.findElement(By.linkText("See all deals"));
		
		Actions act = new Actions(driver);
		
		act.scrollToElement(element).perform();
		
	}

}
