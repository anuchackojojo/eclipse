package Selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class fblogin {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void test()
	{
		driver.findElement(By.id("email")).sendKeys("abc123");
		driver.findElement(By.id("pass")).sendKeys("abc");
		//driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("//*[contains(@id,'u_0_5')]")).click();
		

	}
}
