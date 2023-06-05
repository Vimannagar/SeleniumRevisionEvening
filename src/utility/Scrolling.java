package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scrolling {
	
	public static void main(String[] args) {
		
		WebDriver driver = BaseTest.initBrowser("https://www.amazon.in/");
			
		
		WebElement element = driver.findElement(By.linkText("See all deals"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
//		js.executeScript("window.scrollBy(0,2000)");// To perform scroll till the defined pixel
		
//		js.executeScript("arguments[0].scrollIntoView();", element);// to perform scroll till a webelement
		
	}

}
