package dropdownhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.BaseTest;

public class BootstrapHandling {
	
		public static void main(String[] args) {
			
			WebDriver driver = BaseTest.initBrowser("https://paytm.com/recharge");
		
			
			driver.findElement(By.xpath("//*[text()='Operator']/preceding-sibling::input")).click();
			
			
			driver.findElement(By.xpath("//ul//li//span[text()='BSNL']")).click();
		}

}
