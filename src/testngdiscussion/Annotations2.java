package testngdiscussion;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotations2 {
	
	@Test
	public void testCase3()
	{
		System.out.println("Test case3");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After suite");
	}

}
