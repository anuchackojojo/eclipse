package Selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
    @Test
    public void test()
    {
    	driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[3]/td[3]/input")).sendKeys("anu");
        driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[7]/td[3]/input[1]")).sendKeys("abcd@rediff");
        driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[7]/td[3]/input[2]")).click();
        driver.findElement(By.xpath("//input[@id='newpasswd']")).sendKeys("1234");
        driver.findElement(By.xpath("//input[@id='newpasswd1']")).sendKeys("1234");
        driver.findElement(By.xpath("//div[@id='div_altemail']/table/tbody/tr/td[3]/input")).sendKeys("rediff@123");
        driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[1]/td[1]")).click();
        driver.findElement(By.xpath("/html/body")).sendKeys("02");
        driver.findElement(By.xpath("//input[@id='mobno']")).sendKeys("9123456789");
      //  driver.findElement(By.xpath("//*[(contains@name,'DOB_Day6263b0c4')]")).sendKeys("2") ;      
        }
}
