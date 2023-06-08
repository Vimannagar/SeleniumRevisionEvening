package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.BaseTest;

public class WebTablePrinting {
	
	
	public static void main(String[] args) {
		
		
	WebDriver driver = BaseTest.initBrowser("https://demo.guru99.com/test/web-table-element.php");
		
		List<WebElement> elements = driver.findElements(By.xpath("//*[@class='dataTable']//tbody//tr//td"));
		
		
		for(WebElement ele:elements)
		{
			System.out.print(ele.getText());
		}
		
		System.out.println();
	}
	
//	WAP to print all the elements of webtable as it is in console

}
