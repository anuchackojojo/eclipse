package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.BDregister;

public class BDregister1 {
	WebDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://blazedemo.com/register");
	}
	@Test
	public void testregister()
	{
		BDregister ob=new BDregister(driver);
		ob.setvalues("abc", "luminar", "abc@gmail.com", "abc123", "abc123");
		ob.register();
	}

}
