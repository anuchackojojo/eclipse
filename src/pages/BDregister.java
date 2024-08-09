package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BDregister {
	WebDriver driver;
	By BDname=By.name("name");
	By BDcompany=By.name("company");
	By BDemail=By.id("email");
	By BDpassword=By.id("password");
	By BDCpassword=By.id("password-confirm");
	By register=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button");
	
	public BDregister(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setvalues(String name,String company,String email,String password,String cpassword)
	{
		driver.findElement(BDname).sendKeys(name);
		driver.findElement(BDcompany).sendKeys(company);
		driver.findElement(BDemail).sendKeys(email);
		driver.findElement(BDpassword).sendKeys(password);
		driver.findElement(BDCpassword).sendKeys(cpassword);
	}
	
	public void register()
	{
		driver.findElement(register).click();
	}
	

}
