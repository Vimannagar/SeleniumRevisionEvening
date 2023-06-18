package testngdiscussion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utility.BaseTest;

public class ExecutingTestCaseOnChromeAndFirefox {
	
	
	WebDriver driver;
	@Parameters("browser")
	@Test
	public void searchProduct(String browsername)
	{
		if(browsername.equals("Chrome"))
		{
			driver = new ChromeDriver();
		}
		
		else if(browsername.equals("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		
		driver.get("https://livingliquidz.com/");
		driver.findElement(By.xpath("//*[@class='wbr-main-search']")).sendKeys("malt");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		
		wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//*[@class='typeahead__list']//li"),8));
		
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
	}

}
