package testCases;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.ResourceBundle;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseClass
{

	public WebDriver driver;
	 public Logger logger;
	 public ResourceBundle rb;
	

	 @BeforeClass
@Parameters("browser")


	public void setup(String br)
	{
	rb=ResourceBundle.getBundle("config");
		logger=LogManager.getLogger(this.getClass());
		
		if (br.equals("chrome")) 
		{
			driver=new ChromeDriver();
			
		}
		else if (br.equals("edge"))
		{
			driver=new EdgeDriver();
			
		}
		else {
			driver=new FirefoxDriver();
		}
	
		
		//driver.get(rb.getString());
		driver.get(rb.getString("Appurl"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
@AfterClass
	public void teardown()
	{
		driver.quit();
	}
@Test
	public String randomString() 
	{
		String strAlp = RandomStringUtils.randomAlphabetic(6);
		return strAlp;
	}
@Test
	public String randomNumerical() 
	{
		String strNum = RandomStringUtils.randomNumeric(6);
		return strNum;
		
	}
@Test
	public String randomNumandAlpa()
	{
		String num = RandomStringUtils.randomNumeric(3);
		String alpa = RandomStringUtils.randomAlphabetic(4);
		return (alpa+num+"@gmail.com");
		
	}
 public String captureScreen(String tname) throws IOException
 {
	SimpleDateFormat df = new SimpleDateFormat("yyyyMMddhhmmss");
	Date dt = new Date();
	String timestamp = df.format(dt);
	TakesScreenshot takesScreenshot = (TakesScreenshot)driver;
	File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
	String destination = System.getProperty("user.dir")+"\\screenshots\\"+ tname +"-"+timestamp+".png";
	 try {
		 FileUtils.copyFile(source, new File(destination));
	 }
	 catch(Exception e)
	 {
		e.getMessage() ;
	 }
	 return destination;
	 
 }

}
