package testngdiscussion;

import org.testng.annotations.Test;

public class Features {
	
	@Test
	public void login()
	{
		System.out.println("Login to application");
	}

	
	@Test
	public void logout()
	{
		System.out.println("Logout from application");
	}
	
	@Test
	public void profile()
	{
		System.out.println("Profile test case");
	}
	
	@Test
	public void home()
	{
		System.out.println("Home test case");
	}
}
