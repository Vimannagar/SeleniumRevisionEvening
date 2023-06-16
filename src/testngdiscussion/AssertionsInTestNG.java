package testngdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsInTestNG {

	
	
		@Test
		public void testCase1()
		{
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.flipkart.com/");
			
			String actualtitle = driver.getTitle();
			
			String expectedtitle = "Shopping";
			
			boolean ispresent = actualtitle.contains(expectedtitle);
			
			Assert.assertEquals(ispresent, false);
			
			
			
			
		}
}
