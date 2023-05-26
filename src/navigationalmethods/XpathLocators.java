package navigationalmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocators {
	
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Velocity");
					
		driver.findElement(By.xpath("//input[contains(@id,'u_0_d_')]")).sendKeys("Corporate");
	
		String textonelement = driver.findElement(By.xpath("//div[text()='Create a new account']")).getText();
	
		System.out.println(textonelement);
		
	String	text = driver.findElement(By.xpath("//*[@class='_52lr _9bq0 fsm fwn fcg']")).getText();
	
	System.out.println(text);
	}	

}
