package Selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitpgm {
	ChromeDriver driver;
	@Before
	public void setup()
	{
	driver=new ChromeDriver();
	driver.get("http://www.google.com");
	}
	@Test
	public void test()
	{
		String src=driver.getTitle();
		System.out.println(src);
		String expect="Google";
		if(src.equals(expect))
		{
			System.out.println("Test pass");
		}
		else
		{
			System.out.println("Test fail");
		}
	}
	
		@Test
		public void test1()
		{
			String src=driver.getPageSource();
			String expect="Gmail";
			if(src.contains(expect))
		{
				System.out.println("Test pass");
		}
			else
			{
				System.out.println("Test fail");
		}
		}
			@After
			public void close()
			{
				driver.close();
			}
			
	}

		

