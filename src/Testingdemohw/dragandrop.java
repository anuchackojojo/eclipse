package Testingdemohw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class dragandrop {
ChromeDriver driver;
@BeforeTest
public void set()
{
	driver=new ChromeDriver();
}
@BeforeTest
public void urlloading()
{
	driver.get("https://demoqa.com/droppable");
}
@Test
public void test()
{
	WebElement drag = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
	WebElement drop = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
	Actions act=new Actions(driver);
	act.dragAndDrop(drag, drop);
	act.build().perform();
	String text=drag.getText();
	if(text.equals("Dropped!"))
	{
		System.out.println("dropped");
	}
	else
	{
		System.out.println("not expected");
	}
	
}
}
