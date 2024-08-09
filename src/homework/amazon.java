package homework;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
	ChromeDriver driver;
	@Before
	public void set()
	{
		driver=new ChromeDriver();
		driver.get("www.amazon.in");
	}
	@Test
	public void test1()
	{
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles");
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"nav-cart-count-container\"]/span[2]")).click();
		
		
	

}
}