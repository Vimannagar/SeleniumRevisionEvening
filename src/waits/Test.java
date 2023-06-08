package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import utility.BaseTest;

public class Test {
	

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = BaseTest.initBrowser("https://www.google.com/");
		
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("India");
		
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.ENTER).perform();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		
		driver.findElement(By.xpath("//a[@jsname ='qOiK6e']//*[text()='Central Bank of India']")).click();
		
		
		
	}

}
