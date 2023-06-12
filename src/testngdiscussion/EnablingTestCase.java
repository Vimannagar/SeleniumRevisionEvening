package testngdiscussion;

import org.testng.annotations.Test;

public class EnablingTestCase {
	
	
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
	
	@Test(enabled = false)
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
