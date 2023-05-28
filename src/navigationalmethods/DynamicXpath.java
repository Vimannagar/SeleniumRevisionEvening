package navigationalmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		
		
		for(int i=1; i<4; i++)
		{
		driver.findElement(By.xpath("(//*[@type='radio'])["+i+"]")).click();
		}
		
		
	}
	
	public void clickOnRadio(String value)
	{
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.xpath("//*[text()='"+value+"']/following-sibling::input")).click();
	}
	

}
