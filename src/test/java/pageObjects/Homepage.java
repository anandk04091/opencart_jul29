package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Basepage{
	
public Homepage(WebDriver driver)
{
	super(driver);
}
//elements
@FindBy(xpath="//button[contains(text(),'Register')]")WebElement register;
//Actions

public void clickOnRegistration() 
{
	register.click();
}

}
