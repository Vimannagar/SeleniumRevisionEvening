package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	static WebDriver driver; 
	
	public static WebDriver initBrowser(String url)
	{
		 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(url);
		
		return driver;
	}

}
