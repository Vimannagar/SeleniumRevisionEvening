package testngdiscussion;

import org.testng.annotations.Test;

public class InvocationCountKeyword {

	@Test(invocationCount = 5)
	public void testCase()
	{
		System.out.println("Test case is executing");
	}
}
