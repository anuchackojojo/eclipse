package Testng;


import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Amazonasmt {
	ChromeDriver driver;
	
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://amazon.in");
	}

	@Test
	public void test()
	
	{
		
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobilephone",Keys.ENTER);
		String expected="Amazon.in : mobilephone";
		String actual=driver.getTitle();
		Assert.assertEquals(expected, actual);
	
		String parentwindow=driver.getWindowHandle();
		System.out.println("parent window title"+driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
	
		Set<String> allwindowhandles = driver.getWindowHandles();
	    for(String handle:allwindowhandles)
        {
		System.out.println(handle);
		if(!handle.equalsIgnoreCase(parentwindow))
		{
			driver.switchTo().window(handle);
	  driver.findElement(By.xpath("/html/body/div[2]/div/div[5]/div[3]/div[1]/div[4]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[38]/div[1]/span/span/span/input")).click();
	 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")));
	driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).click();
	
		
		
		
	}

        }
	}
}

