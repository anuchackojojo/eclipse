package Testng;



import java.io.File;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rishiherindia {
	
	WebDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://rishiherbalindia.linker.store/");
	}
	@Test
	public void test1() throws Exception 
	{
		
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/a")).click();
		//register
		/*driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[1]/input")).sendKeys("anuchacko2021@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[2]/input")).sendKeys("Acfggadcdf12");
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[3]/label/input")).click();
        driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/button")).click();
        
        //Login
       
		driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/div[1]/input")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/form/div[1]/input")).sendKeys("anuchacko2021@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/div[2]/input")).sendKeys("Acfggadcdf12");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/form/button[1]")).click();*/
		
		
		//search
		driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("Herbal Agro Growth Booster",Keys.ENTER);
		//click cart
		driver.findElement(By.xpath("//*[@id=\"cart-btn-toggle\"]/i")).click();
		//click herbal agro growth booster
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/a/img")).click();
		
		//herbal agro growth booster add to wishlist
		driver.findElement(By.xpath("//*[@id=\"prod_cont\"]/div/div[4]/button[1]")).click();
		// click skin
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[4]/a")).click();
		//click aloe faireness cream
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/a/img")).click();
		//aloe fairness cream add to wishlist
		driver.findElement(By.xpath("//*[@id=\"prod_cont\"]/div/div[4]/button[1]")).click();
		//click all
		driver.findElement(By.xpath("//*[@id=\"column-left\"]/div[1]/div[2]/ul/li[1]/a")).click();
		//click health
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[2]/a")).click();
		//click safty
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[3]/a")).click();
		//scroll
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		driver.findElement(By.xpath("/html/body/div/footer/div[1]/div/div[2]/div[2]/div/ul/li[2]/a")).click();
		//screenshot
		WebElement wb=driver.findElement(By.xpath("/html/body/div/footer/div[1]/div/div[2]/div[4]/div/ul/li[1]/a"));
		File screenshot=wb.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenshot, new File("./screen//new.png"));
		//responsecode
		URL ob=new URL("https://rishiherbalindia.linker.store/");
		HttpURLConnection con=(HttpURLConnection)ob.openConnection();
		con.connect();
		if(con.getResponseCode()==200)
		{
			System.out.println("valid url");
		}
		else
		{
			System.out.println("invalid url");
		}
		
	}

}
