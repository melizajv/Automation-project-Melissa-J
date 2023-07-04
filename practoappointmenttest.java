package practotest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import practopage.practoappointment;

public class practoappointmenttest {

	WebDriver driver;
	 
	@BeforeTest
	public void setUp()
	{
	driver =new ChromeDriver();
		driver.get("https://www.practo.com/doctors");
	}
	@Test
	public void Practoappointmenttest()
	{
		 practoappointment pa= new practoappointment(driver);
		 pa.appointment();
		
		
}
}
