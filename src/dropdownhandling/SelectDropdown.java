package dropdownhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utility.BaseTest;

public class SelectDropdown {
	
	
		public static void main(String[] args) {
			
			WebDriver driver = BaseTest.initBrowser("https://www.facebook.com/signup");
					
			WebElement day= driver.findElement(By.xpath("//*[@id='day']"));
			
			
			Select sel = new Select(day);
			
			
			sel.selectByVisibleText("23");
			
			
		WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
		
		Select selmonth = new Select(month);
		
		selmonth.selectByValue("10");
		
		
		WebElement year = driver.findElement(By.xpath("//*[@id='year']"));
			
			Select selyear = new Select(year);
			
			selyear.selectByIndex(9);
			
		}
		
	
	
}
