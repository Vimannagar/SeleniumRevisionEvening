package popuphandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.BaseTest;

public class ChildBrowserPopUp {
	
	
	
	public static void main(String[] args) {

		WebDriver driver = BaseTest.initBrowser("https://groww.in/");
		
		driver.findElement(By.xpath("//*[text()='Login/Register']")).click();
		
		driver.findElement(By.xpath("//*[@class='rodal-close']")).click();
		
	}

}
