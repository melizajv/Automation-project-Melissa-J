package practotest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import practopage.Practoregister;

public class Practoregistertest {
	
	WebDriver driver;
	 
	@BeforeTest
	public void setUp()
	{
	driver =new ChromeDriver();
		driver.get("https://accounts.practo.com/new_patient_signup?next=%2Fcheckid_request&intent=fabric");
	}
	@Test
	public void registertest()
	{
		 Practoregister p= new Practoregister(driver);
		 p.setvalues("Melissa", "9400882238","PRACTOmjv4@");
	     p.register();

}

}
 