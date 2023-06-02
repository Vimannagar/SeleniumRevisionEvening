package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.BaseTest;

public class DatePicker {

	public static void main(String[] args) {

		WebDriver driver = BaseTest.initBrowser("https://jqueryui.com/datepicker/");

		WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));

		driver.switchTo().frame(iframe);

		driver.findElement(By.xpath("//*[@id='datepicker']")).click();
		
		while(true)
		{
		String monthyear = driver.findElement(By.xpath("//*[@class='ui-datepicker-title']")).getText();

		System.out.println(monthyear);
		
		if(!(monthyear.equals("October 2022")))
		{
			driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		}
		
		else
		{
			break;
		}
		}
		
		driver.findElement(By.xpath("//tbody//tr//td//a[text()='19']")).click();

	}

}
