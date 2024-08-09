package Selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolutexpath {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div[2]/div/form/input")).sendKeys("abc");
	}

}
