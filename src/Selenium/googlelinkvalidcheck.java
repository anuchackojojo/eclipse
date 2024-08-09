package Selenium;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlelinkvalidcheck {
	ChromeDriver driver;
	String baseurl="https://www.google.com/";
	@Before
	public void set()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void linkcount()
	{
		List<WebElement> li = driver.findElements(By.tagName("a"));
		
		for(WebElement s:li)
		{
			String link=s.getAttribute("href");
			verify(link);
		}
		
		
	}
	private void verify(String link)//method
	{
		try
		{
			URL ob=new URL(link);
			 HttpURLConnection con = (HttpURLConnection)ob.openConnection();
				
				con.connect();
				if(con.getResponseCode()==200)
				{
					System.out.println("valid----"+link);
				}
				else if(con.getResponseCode()==400)
				{
					System.out.println("broken link----"+link);
				}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
				
			
		


	


