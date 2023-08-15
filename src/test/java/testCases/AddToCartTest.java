package testCases;

import org.testng.annotations.Test;

import pageObjects.addtocart;
import pageObjects.computer;
import pageObjects.deskTOP;

public class AddToCartTest extends BaseClass
{@Test
	public void TestAdd() 
	{
		computer com = new computer(driver);
		com.ClickonComputer();
		
		deskTOP dt = new deskTOP(driver);
		dt.ClickOnDesktop();
		
		
		addtocart ak = new addtocart(driver);
		ak.clickAddToCart();
		ak.clickonRam();
		ak.clickonRam();
	}
 
}
