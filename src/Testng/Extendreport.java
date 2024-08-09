package Testng;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputFilter.Status;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class Extendreport {


	private static final String Theme = null;
	WebDriver driver;
	String baseurl="https://www.facebook.com";
	ExtentSparkReporter reporter;
	ExtentTest test;
	ExtentReports extent;

		@BeforeTest
		public void beftest()
		{
			//reporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/reports/myreport.html");
			reporter=new ExtentSparkReporter("./Reporter12/myreport1.html");
			reporter.config().setDocumentTitle("Automationreport");
			reporter.config().setReportName("functional test");
			reporter.config().setTheme(Theme.DARK);
			extent=new ExtentReports();
			extent.attachReporter(reporter);
			extent.setSystemInfo("hostname", "localhost");
			extent.setSystemInfo("os", "windows10");
			extent.setSystemInfo("testername", "abc");
			extent.setSystemInfo("Browser Name", "chrome");
			driver=new ChromeDriver();	
		}
		@BeforeMethod
		public void setup() {
			driver.get(baseurl);

		}
		@Test
		public void fbtitleverification() throws IOException
		{
			Test=extent.createTest("Fbtitleverification");
			String Exp="facebook";
			String actual=driver.getTitle();
			Assert.assertEquals(Exp, actual);
			System.out.println("hello");
		}
		@Test
		public void fbbuttontest() throws IOException
		{
			test=extent.createTest("Fbbuttontest");
			String buttontext=driver.findElement(By.name("login")).getText();
			Assert.assertEquals(buttontext, "register");
		}
		@Test
		public void fblogotest() throws IOException
		{
			test=extent.createTest("Fblogotest");
			boolean b=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img")).isDisplayed();
			Assert.assertTrue(b);

		}
		@AfterTest
		public void teardown()
		{
			extent.flush();
		}
				@AfterMethod
				public void browserclose(ITestResult result) throws IOException
				{
			if(result.getStatus()==ITestResult.FAILURE)
			{
				test.log(Status.FAIL, "test case failed is"+result.getName());
				test.log(Status.FAIL, "test case failed is"+result.getThrowable());
				String screenshotpath=Extepgm.screenshotMethod(driver,result.getName());
				test.addScreenCaptureFromPath(screenshotpath);
			}else if(result.getStatus()==ITestResult.SKIP)
			{
				test.log(Status.SKIP, "test case skipped is"+result.getName());
			}
			else if(result.getStatus()==ITestResult.SUCCESS)
			{
				test.log(Status.PASS, "test case Passed is"+result.getName());
			}
			 
		}
		public static String screenshotMethod(WebDriver driver,String screenshotname) throws IOException
		{
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String destination="./Screenshot/"+screenshotname +".png";
			//File finaldestination=new File(destination);
			//FileHandler.copy(src, finaldestination);
			FileHandler.copy(src, new File(destination));
			return destination;
		}




	}



