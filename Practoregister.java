package practopage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Practoregister {
	WebDriver driver;
	 
	By fullname= By.xpath("//*[@id=\"name\"]");
	By mobilenumber=By.xpath("//*[@id=\"mobile\"]");
	By password=By.xpath("//*[@id=\"password\"]");
	By sendOTP=By.xpath("//*[@id=\"EmailRegister\"]");
	
	public Practoregister(WebDriver driver)
	{
		this.driver=driver;
	}

public void setvalues(String fname, String mobno, String pswd)
{
	driver.findElement(fullname).sendKeys(fname);
	driver.findElement(mobilenumber).sendKeys(mobno);
	driver.findElement(password).sendKeys(pswd);

}
public void register()
{
	driver.findElement(sendOTP).click();
	

	
}
}


