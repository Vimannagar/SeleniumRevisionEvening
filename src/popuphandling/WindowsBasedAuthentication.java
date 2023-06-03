package popuphandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsBasedAuthentication {
	
	
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
//		https:username:password@url.com
		
		driver.get("https:postman:password@postman-echo.com/basic-auth");
		
	}

}
