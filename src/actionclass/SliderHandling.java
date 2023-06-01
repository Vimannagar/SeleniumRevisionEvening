package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utility.BaseTest;

public class SliderHandling {
	
	public static void main(String[] args) {
		WebDriver driver = BaseTest.initBrowser("https://jqueryui.com/slider/");
		
		
		WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
		
		driver.switchTo().frame(iframe);
		
		WebElement sliderknob = driver.findElement(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default']"));
	
		Actions act  = new Actions(driver);
		
		act.clickAndHold(sliderknob).moveByOffset(200, 0).moveByOffset(-100, 0).release().build().perform();
	
	
	}

}
