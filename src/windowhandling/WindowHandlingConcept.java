package windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.BaseTest;

public class WindowHandlingConcept {

	public static void main(String[] args) {

		WebDriver driver = BaseTest.initBrowser("https://www.facebook.com/signup");

		String parentid = driver.getWindowHandle();
		
		System.out.println(parentid);
		
		driver.findElement(By.linkText("Learn more")).click();
		
		
		Set<String> allwindowid = driver.getWindowHandles();
		
		for(String winid:allwindowid)
		{
			if(!(parentid.equals(winid)))
			{
				driver.switchTo().window(winid);
				
			}
			System.out.println(winid);
		}
		
		
		driver.findElement(By.xpath("//*[@type='search']")).sendKeys("Text test");
		
		
		
		driver.switchTo().window(parentid);
		
		driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("post to switch");
		
		

	}

}
