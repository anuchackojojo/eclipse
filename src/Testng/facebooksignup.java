package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class facebooksignup {
	ChromeDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.facebook.com/signup");
	}
	@Test
	public void test1()
	{
		WebElement li = driver.findElement(By.xpath("//*[@id=\"day\"]"));
		Select day = new Select(li);
		day.selectByValue("27");
		
	}
	@Test
	public void test2()
	{
		WebElement b = driver.findElement(By.xpath("//*[@id=\"month\"]"));
		Select month=new Select(b);
		month.selectByIndex(7);
	}
	@Test
	public void test3()
	{
		WebElement c = driver.findElement(By.xpath("//*[@id=\"year\"]"));
		Select year=new Select(c);
		year.selectByVisibleText("1996");
	}
	
	

}
