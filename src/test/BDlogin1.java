package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.BDlogin;


public class BDlogin1 {
	WebDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://blazedemo.com/login");
	}
	@Test
	public void testlogin()
	{
		BDlogin ob=new BDlogin(driver);
		ob.setvalues("abc@gmail.com", "abc123");
		ob.login();
		
	
	}

}
