package testngdiscussion;

import org.testng.annotations.Test;

public class PriorityKeyword {
	
	
	@Test(priority = 1)
	public void login()
	{
		System.out.println("Login to application");
	}

	
	@Test(priority = 0)
	public void logout()
	{
		System.out.println("Logout from application");
	}
	
	@Test(priority = -30)
	public void profile()
	{
		System.out.println("Profile test case");
	}
	
	@Test(priority = 2)
	public void home()
	{
		System.out.println("Home test case");
	}

}
