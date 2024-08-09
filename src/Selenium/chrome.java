package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class chrome {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		
		String expected="Google";
		if(actualtitle.equals(expected))
		{
			System.out.println("Test pass");
		}
		else
		{
			System.out.println("Test fail");
		}
		driver.close();
		//diver.quit();

	}

}
