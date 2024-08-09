package Testingdemohw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class facebooksu {
	ChromeDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
	}
     @BeforeMethod
     public void test1()
     {
    	 driver.get("https://www.facebook.com/signup");
     }
     @Test
     public void test2()
     {
    	WebElement d = driver.findElement(By.xpath("//*[@id=\"day\"]"));
    	Select day=new Select(d);
    	day.selectByValue("19");
    	WebElement m = driver.findElement(By.xpath("//*[@id=\"month\"]"));
    	Select month=new Select(m);
    	month.selectByIndex(7);
    	WebElement y = driver.findElement(By.xpath("//*[@id=\"year\"]"));
    	Select year=new Select(y);
    	year.selectByVisibleText("1996");
     }
}
