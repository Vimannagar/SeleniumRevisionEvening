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
			
			System.out.println("Before assertion");
			
			Assert.assertEquals(ispresent, true);// Hard assert
			
			System.out.println("After assertion");
			
		}
		
		@Test
		public void testCase2()
		{
			System.out.println("**************test case 2***************");
			
			int i = 20;
			int j = 30;
			boolean k = i>j;
			
			Assert.assertTrue(k);
			
			
		}
		@Test
		public void testCase3()
		{
			System.out.println("**************test case 2***************");
			
			int i = 20;
			int j = 30;
			boolean k = i>j;
			
			Assert.assertFalse(k);
			
			
		}
		
		
		
}
