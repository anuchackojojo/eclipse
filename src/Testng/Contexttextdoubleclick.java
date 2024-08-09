package Testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Contexttextdoubleclick {
	ChromeDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void setup()
	{
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	}
    @Test
    public void test()
    {
    	Actions act=new Actions(driver);
    	WebElement right = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));//rightclick cheyyumbol inspect vannillengil contextclick() use cheyyanam
    	act.contextClick(right).perform();
    	driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span")).click();
    	Alert a=driver.switchTo().alert();//alert vannal
    	System.out.println(a.getText());
    	a.accept();
    	
    	 WebElement doubleclick = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
    	 act.doubleClick(doubleclick).perform();
    	 Alert b=driver.switchTo().alert();//alert vannal
    	 System.out.println(b.getText());
    	 b.accept();
    }
}
