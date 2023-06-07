package navigationalmethods;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.ExcelReader;

public class XpathLocators {
	
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		
		ExcelReader er = new ExcelReader();
	
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(er.readData(4, 0));
					
		driver.findElement(By.xpath("//input[contains(@id,'u_0_d_')]")).sendKeys(er.readData(4, 1));
	
		String textonelement = driver.findElement(By.xpath("//div[text()='Create a new account']")).getText();
	
		System.out.println(textonelement);
		
	String	text = driver.findElement(By.xpath("//*[@class='_52lr _9bq0 fsm fwn fcg']")).getText();
	
	System.out.println(text);
	}	

}
