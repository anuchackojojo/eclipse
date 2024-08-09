package Selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
	}
	@Test
	public void test()
	{
           driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("news");
         //  driver.findElement(By.xpath("//*[@id=\"button\"]/yt-icon-badge-shape/div/div/yt-icon/span/div")).click();
         //  driver.findElement(By.xpath("//*[@id=\"text\"]")).click();
          // driver.findElement(By.xpath("//*[@id=\"guide-icon\"]/span/div")).click();
	}

}
