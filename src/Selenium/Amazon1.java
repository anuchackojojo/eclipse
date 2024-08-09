package Selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon1 {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("http://www.amazon.in");
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("mobiles",Keys.ENTER);
		driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("@123");
		driver.findElement(By.xpath("//span[@id='continue']")).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[4]")).click();
		driver.findElement(By.id("nav-hamburger-menu")).click();
	
		
		
		
}
}
