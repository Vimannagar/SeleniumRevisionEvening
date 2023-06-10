package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.BaseTest;

public class FluentWaitDisc {

	
public static void main(String[] args) {
		
		WebDriver driver = BaseTest.initBrowser("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
											.pollingEvery(Duration.ofSeconds(9))
											.withTimeout(Duration.ofSeconds(100));

		
	
		driver.findElement(By.xpath("//*[@id='checkbox']")).click();
		
		wait.until(ExpectedConditions.elementSelectionStateToBe(By.xpath("//*[@id='ch']"), true));
		driver.findElement(By.xpath("//*[@id='checkbox']")).click();
		
		
	}

}
