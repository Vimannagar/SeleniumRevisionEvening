package testngdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {
	
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
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(ispresent, false);
		
		System.out.println("After assertion");
		
		sa.assertAll();
		
	}
	
	@Test
	public void testCase2()
	{
		System.out.println("**************test case 2***************");
		
		int i = 20;
		int j = 30;
		boolean k = i>j;
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(k);
		sa.assertAll();
		
		
	}
	@Test
	public void testCase3()
	{
		System.out.println("**************test case 2***************");
		
		int i = 20;
		int j = 30;
		boolean k = i>j;
		SoftAssert sa = new SoftAssert();
		sa.assertFalse(k);
		sa.assertAll();
		
		
	}

}
