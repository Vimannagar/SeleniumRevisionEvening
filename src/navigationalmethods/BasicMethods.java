package navigationalmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicMethods {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
			
		driver.navigate().to("https://www.google.com");
		
		driver.get("https://www.google.com");
		
		
		driver.manage().window().maximize();//maximize operation
		
		driver.navigate().refresh();// browser refresh
		
		Thread.sleep(2000);
		
		driver.navigate().back();// browser back button
		
		Thread.sleep(2000);
		
		driver.navigate().forward();// browser forward button
		
		driver.close();
		

		
	}

}
