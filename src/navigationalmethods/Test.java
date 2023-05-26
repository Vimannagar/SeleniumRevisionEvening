package navigationalmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	
	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://livingliquidz.com/");
		
		driver.findElement(By.xpath("(//*[normalize-space(text())='SPIRITS'])[2]")).click();
		
		
		
	}

}
