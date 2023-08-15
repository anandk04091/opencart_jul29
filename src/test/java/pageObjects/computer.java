package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class computer extends Basepage {
	public computer(WebDriver driver) 
	{
		super(driver);
	}

	@FindBy(xpath="//ul[@class='top-menu notmobile']/li/a[contains(text(),'Computers')]")WebElement ComputerElemrnt;
	
	public void ClickonComputer()
	{
		ComputerElemrnt.click();
	}
}
