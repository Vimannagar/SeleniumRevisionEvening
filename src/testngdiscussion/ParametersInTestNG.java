package testngdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersInTestNG {
	WebDriver driver;
	@Parameters("browser")
	@Test
	public void launchBrowser(String browsername)
	{
		
		if(browsername.equals("Chrome"))
		{
		 driver = new ChromeDriver();
		}
		else if(browsername.equals("Firefox"))
		{
			 driver = new FirefoxDriver();
		}
	}
	
	@Parameters({"browser", "url"})
	@Test
	public void redirectToApplication(String browsername, String url)
	{
		if(browsername.equals("Chrome"))
		{
		 driver = new ChromeDriver();
		}
		else if(browsername.equals("Firefox"))
		{
			 driver = new FirefoxDriver();
		}
		
		driver.get(url);
	}

}
