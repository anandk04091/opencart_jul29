package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registration_Page extends Basepage
{
	
public Registration_Page(WebDriver driver)
{
super(driver);
}

//elements
@FindBy(xpath="//input[@value='M']")WebElement maleclickbutton;
@FindBy(xpath="//input[@id='FirstName']")WebElement Fastname;
@FindBy(xpath = "//input[@id='LastName']")WebElement Lastname;
@FindBy(xpath = "//input[@id='Email']")WebElement email;
@FindBy(xpath = "//input[@id='Company']")WebElement company;
@FindBy(xpath="//input[@id='Password']")WebElement password;
@FindBy(xpath="//input[@id='ConfirmPassword']")WebElement confirmpass;
@FindBy(xpath="//button[@id='register-button']")WebElement registationLast;
@FindBy(xpath="//div[contains(text(),'Your registration completed')]")WebElement text;

//Actions

public void ckickOnMaleButton() 
{
	maleclickbutton.click();
}
public void setFirstName(String Fname) 
{
	Fastname.sendKeys(Fname);;
}
public void setLastName (String Lname) 
{
	Lastname.sendKeys(Lname);;
}
public void setEmail(String EmailId) 
{
	email.sendKeys(EmailId);;
}
public void setComapny(String companyName) 
{
	company.sendKeys(companyName);
}
public void setpassword(String pwd) 
{
	password.sendKeys(pwd);
}
public void setconfirmPassword(String cpass) 
{
	confirmpass.sendKeys(cpass);;
}
public void RegistrationLast() 
{
	registationLast.click();
}
public boolean confirmationPage()
{
	boolean status = text.isDisplayed();
	return status;
}


}
