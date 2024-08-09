package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome2 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
		String actualcontent=driver.getPageSource();
			String expected="Gmail";
			if(actualcontent.contains(expected))
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
