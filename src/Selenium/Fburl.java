package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Fburl {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//title test
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		
		
		String expected="Facebook – log in or sign up";
		if(actualtitle.equals(expected))
		{
			System.out.println("test pass");
		}
		else
		{
			System.out.println("test fail");
		}
		//content test
		String src=driver.getPageSource();
		if(src.contains("sign up"))
		{
			System.out.println("test pass");
		}
		else
		{
			System.out.println("test fail");
		}
		driver.close();
        
	}

}
