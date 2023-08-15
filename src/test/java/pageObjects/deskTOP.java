package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class deskTOP extends Basepage {
 public deskTOP(WebDriver driver) 
 {
	 super(driver);
	 
 } 
 
 @FindBy(xpath="//h2[@class='title']/child::a[@title='Show products in category Desktops']")WebElement desktop;
 
 public void ClickOnDesktop()
 {
	 desktop.click();
 }
}
