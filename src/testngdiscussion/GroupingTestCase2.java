package testngdiscussion;

import org.testng.annotations.Test;

public class GroupingTestCase2 {
	
	
	@Test(priority = 5, groups = {"functional"})
	public void payment()
	{
		System.out.println("Payment test case");
	}

}
