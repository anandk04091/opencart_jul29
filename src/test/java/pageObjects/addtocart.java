package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class addtocart extends Basepage{
	public addtocart(WebDriver driver) 
	{
		super(driver);
	}
	@FindBy(xpath="//a[contains(text(),'Build your own computer')]/following::div[@class='buttons'][1]")WebElement AddToCart;
	@FindBy(xpath="//select[@id='product_attribute_2']/option[contains(text(),'2 GB')]")WebElement ram;
	@FindBy(xpath="//label[contains(text(),'320 GB')]")WebElement hdd;

	public void clickAddToCart()
	{
		AddToCart.click();
	}
	public void clickonRam()
	{
		ram.click();
	}
	public void clickOnHDD()
	{
		hdd.click();
	}
	
	
	
}
