package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath = "(//*[normalize-space(text())='SPIRITS'])[2]")
	WebElement spirit;
	
	@FindBy(xpath = "//*[text()='Single Malt']")
	WebElement singlemalt;
	
	WebDriver driver;
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
		this.driver = driver;
		
	}
	
	
	public void clickOnSpirit() {
		spirit.click();
	}
	
	public void navToProductPage()
	{
		singlemalt.click();
		
		
	}


}
