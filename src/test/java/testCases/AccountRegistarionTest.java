package testCases;



import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Registration_Page;

public class AccountRegistarionTest extends BaseClass
{
	@Test
	public void testAccountregistrain() 
	{
		logger.info("*** Starting Tc1_AccountRegistrationTest****");
		try {
		Homepage hp = new Homepage(driver);
		logger.info("Clicked on My RegistraionTest");
		hp.clickOnRegistration();
		logger.info("Start RegistraionTest");
		Registration_Page rg = new Registration_Page(driver);
		logger.info("Click on male button");
		rg.ckickOnMaleButton();
		logger.info("Enter First Name");
		rg.setFirstName(randomString().toUpperCase());
		logger.info("Enter Second Name");
		rg.setLastName("k");
		logger.info("Enter EmailId");
		rg.setEmail(randomNumandAlpa());
		logger.info("Enter comapany Name");
		rg.setComapny(randomString());
		logger.info("Enter passaword");
		rg.setpassword("123456");
		logger.info("Enter confirm password");
		rg.setconfirmPassword("123456");
		rg.RegistrationLast();
		boolean confirm = rg.confirmationPage();
		Assert.assertEquals(confirm, true);
		}catch (Exception e) {
		 Assert.fail();
		}
	

		
	}
}
