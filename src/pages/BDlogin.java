package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BDlogin {
	WebDriver driver;
	By dbemail=By.name("email");
	By dbpassword=By.id("password");
	By login=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[4]/div/button");
	
	
	public BDlogin(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues(String email,String password)
	{
	driver.findElement(dbemail).sendKeys(email);
	driver.findElement(dbpassword).sendKeys(password);
	}
	public void login()
	{
		driver.findElement(login).click();
	}
	}
	


