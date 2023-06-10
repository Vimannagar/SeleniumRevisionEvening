package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.BaseTest;

public class ExplicitWaitPractice {
	
	public static void main(String[] args) {
		
		WebDriver driver = BaseTest.initBrowser("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
//		CTRL + SHIFT +O
		
//		Handling alert based condition
		
//		driver.findElement(By.xpath("//*[@id='alert']")).click();
//		
		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(60));
//		
//		wait.until(ExpectedConditions.alertIsPresent());
//		
//		String text = driver.switchTo().alert().getText();
//		
//		System.out.println(text);
		
		
//		driver.switchTo().alert().accept();
//		
////		Handling till a text is present
//		driver.findElement(By.xpath("//*[@id='populate-text']")).click();
//		
//		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@id='h2']"), "Selenium Webdriver"));
//		
//		driver.findElement(By.xpath("//*[@id='populate-text']")).click();
		
//		Handling till the button gets display
		
		driver.findElement(By.xpath("//*[@id='display-other-button']")).click();
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='hidden']")));
		
		driver.findElement(By.xpath("//*[@id='display-other-button']")).click();
	
		driver.findElement(By.xpath("//*[@id='checkbox']")).click();
		
		wait.until(ExpectedConditions.elementSelectionStateToBe(By.xpath("//*[@id='ch']"), true));
		driver.findElement(By.xpath("//*[@id='checkbox']")).click();
		
		
	}

}
