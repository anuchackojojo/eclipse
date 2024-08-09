package Testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class datadrivenhw {
	ChromeDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.saucedemo.com/v1/");
	}
	@Test
	public void main() throws Exception
	{
		File f=new File("D://data2.xlsx");//path of excel sheet
		FileInputStream f1=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(f1);
		XSSFSheet xs=wb.getSheet("Sheet1");
		System.out.println(xs.getLastRowNum());
		
		for(int i=1;i<xs.getLastRowNum();i++)
		{
			String username=xs.getRow(i).getCell(0).getStringCellValue();
			System.out.println("username"+username);
			String password=xs.getRow(i).getCell(1).getStringCellValue();
			System.out.println("password"+password);
		}
		
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("username");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
		
		String actualurl=driver.getCurrentUrl();
		System.out.println(actualurl);
		String expurl="https://www.saucedemo.com/v1/";
		if(expurl.equals(actualurl))
		{
			System.out.println("login sucssesful");
		}
		else
		{
			System.out.println("login failed");
		}
		
		}
		
	}


