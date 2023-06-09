package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.BaseTest;

public class ExplicitWait {
	
	
	public void getWaitApplied(WebDriver driver, String xpath)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
	
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
		
	}
	
	public static void main(String[] args) {
		
		WebDriver driver = BaseTest.initBrowser("https://www.policybazaar.com/");
		
//		implicit wait
		driver.findElement(By.xpath("//*[text()='Term Life']/ancestor::div[@class= 'prd-block']//a")).click();
	
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
//		
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='nameAdd']")));
//		
//		driver.findElement(By.xpath("//*[@id='nameAdd']")).sendKeys("Ron");

		ExplicitWait ew = new ExplicitWait();
		
		ew.getWaitApplied(driver, "//*[@id='nameAdd']");
		
		driver.findElement(By.xpath("//*[@id='nameAdd']")).sendKeys("Ron");
		
		
		
	}

}
