package Selenium;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://google.com");
	}
	@Test
	public void test()
	{
	List<WebElement> li = driver.findElements(By.tagName("a"));
	System.out.println("link count"+li.size());
	
	for(WebElement s:li)
	{
		String link=s.getAttribute("href");
		String text=s.getText();
		System.out.println(link+"------"+text);
		
		
	}
	}

}
