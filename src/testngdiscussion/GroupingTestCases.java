package testngdiscussion;

import org.testng.annotations.Test;

public class GroupingTestCases {
	
	

	@Test(priority = 1, groups = {"sanity"})
	public void login()
	{
		System.out.println("Login to application");
	}

	
	@Test(priority = 2, groups = {"regression", "sanity"})
	public void logout()
	{
		System.out.println("Logout from application");
	}
	
	@Test(priority = 3 , groups = {"sanity"})
	public void profile()
	{
		System.out.println("Profile test case");
	}
	
	@Test(priority = 4, groups = {"functional"})
	public void home()
	{
		System.out.println("Home test case");
	}
	
	
	

}
