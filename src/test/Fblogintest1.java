package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Fblogin;

public class Fblogintest1 {
      WebDriver driver;
      @BeforeTest
      public void setup()
      {
    	  driver=new ChromeDriver();
      }
      @BeforeMethod
      public void url()
      {
    	  driver.get("https://www.facebook.com/");
      }
      @Test
      public void testlogin()
      {
    	  Fblogin ob=new Fblogin(driver);
    	  ob.setvalues("abc@gmail.com","abc");
    	  ob.login();
      }
}
