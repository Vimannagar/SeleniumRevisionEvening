package testngdiscussion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod {
	
	@Test(priority = 1)
	public void login()
	{
		System.out.println("Login test case");
		throw new NullPointerException();
	}
	
	@Test(priority = 2, dependsOnMethods = {"login"})
	public void home()
	{
		System.out.println("Home test case");
	}
	
	@Test(priority = 3, dependsOnMethods = {"home", "login"})
	public void profile()
	{
		System.out.println("Profile test case");
	}

	
	@Test(priority = 4)
	public void logout()
	{
		System.out.println("Logout test case");
		
		throw new ArithmeticException();
	}
}
