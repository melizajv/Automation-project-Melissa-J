package practopage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Practologin {

	WebDriver driver;
	 
	By mobnumber= By.xpath("//*[@id=\"username\"]");
	By password=By.xpath("//*[@id=\"password\"]");
	By login= By.xpath("//*[@id=\"login\"]");
	
	public Practologin(WebDriver driver)
	{
		this.driver=driver;
	}

public void setvalues(String mob, String pswd)
{
	driver.findElement(mobnumber).sendKeys(mob);
	driver.findElement(password).sendKeys(pswd);

}
public void login()
{
	driver.findElement(login).click();
	

	
}
	
}
