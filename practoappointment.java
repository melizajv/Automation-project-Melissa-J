package practopage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class practoappointment {
	WebDriver driver;
	 
	By treatment= By.xpath("//*[@id=\"container\"]/div[2]/div[1]/div[1]/div[3]/div[2]/a[1]");
	By doctor=By.xpath("//*[@id=\"container\"]/div[4]/div/div[1]/div/div[3]/div[1]/div/div[2]/div/div/div[2]/div[1]/button/div");
	By call=By.xpath("//*[@id=\"container\"]/div[4]/div/div[1]/div/div[3]/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div[2]/div/button");
	
	public practoappointment(WebDriver driver)
	{
		this.driver=driver;
	}




public void appointment()
{
driver.findElement(treatment).click();
driver.manage().window().maximize();
driver.findElement(doctor).click();
driver.findElement(call).click();
}
}

