package Selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("http://www.amazon.in/");
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[4]")).click();
	}

}
