package testngdiscussion;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before suite");
	}
	
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before test");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After test");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before class");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("After class");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After method");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before method");
	}
	
	
	@Test
	public void testCase2()
	{
		System.out.println("Test case2");
	}
	
	
	@Test
	public void testCase1()
	{
		System.out.println("Test case 1");
	}

}
