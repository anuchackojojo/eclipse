package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Draganddrop {
	ChromeDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void main()
	{
		driver.get("https://demoqa.com/droppable");
	}
	@Test
	public void test1()
	{
		driver.manage().window().maximize();
		WebElement drag = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement drop = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions act=new Actions(driver);
	    act.dragAndDrop(drag, drop);
		act.perform();
		
		String actaltext=drop.getText();
		if(actaltext.equals("Dropped!"))
		{
			System.out.println("dropped");
		}
		else
		{
			System.out.println("not expected");
		}
	
		
		
	}

}
