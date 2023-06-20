package testclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import pages.HomePage;
import pages.ProductPage;

public class BaseTest {
	
	static WebDriver driver ;
	HomePage homepage;
	
	ProductPage productpage;
	@BeforeSuite
	public void initBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://livingliquidz.com/");
		
	}
	
	@BeforeClass
	public void createObject()
	{
		 homepage = new HomePage(driver);
		 productpage = new ProductPage(driver);
	}
	
	@AfterSuite
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}

}
