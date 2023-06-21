package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import utility.BaseTest;

public class ParallelClassExecution1 {
	
	@Test
	public void sliderValidation()
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		
		
		WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
		
		driver.switchTo().frame(iframe);
		
		WebElement sliderknob = driver.findElement(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default']"));
	
		Actions act  = new Actions(driver);
		
		act.clickAndHold(sliderknob).moveByOffset(200, 0).moveByOffset(-100, 0).release().build().perform();
	
	
	}

}
