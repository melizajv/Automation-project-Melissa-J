package practotest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import practopage.Practologin;

public class Practologintest {
	WebDriver driver;
	 
	@BeforeTest
	public void setUp()
	{
	driver =new ChromeDriver();
		driver.get("https://accounts.practo.com/");
	}
	@Test
	public void logintest()
	{
		 Practologin p1= new Practologin(driver);
		 p1.setvalues("9400882238","PRACTOmjv4@");
		 p1.login();
		

}
}
