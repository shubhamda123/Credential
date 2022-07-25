package com.cjc;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.seleniumhq.jetty9.util.thread.ThreadClassLoaderScope;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HTML_Page {
	
public WebDriver driver;
	
	@BeforeSuite
	public void openBrowser()
	{
		System.out.println("OPen browser in BeforeSuiteee");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@BeforeTest
	public void openUrl()
	{
		System.out.println("OPen Url in BeforeTest");
		driver.get("file:///C:/Users/HP/Desktop/index.html");
	}
	
	@BeforeClass
	public void maximizePage()
	{
		System.out.println("maximize webpage in BeforeClass");
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void pageLoadtimeOut()
	{
		System.out.println("pageload in BeforeMethod");
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
	}
	
	@Test(dataProvider="getData")
	public void loginwithValidDetails(String un,String ps) throws InterruptedException
	{
		System.out.println("login index.html in Test");
		driver.findElement(By.name("uname")).sendKeys(un);
		driver.findElement(By.name("pass")).sendKeys(ps);
	WebElement drop	=driver.findElement(By.cssSelector("select[id='browser']"));
		Select s=new Select(drop);
		s.selectByIndex(2);
		
		driver.findElement(By.id("remem")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("login")).submit();
		
		driver.navigate().back();
		Thread.sleep(4000);
		
		driver.findElement(By.name("uname")).clear();
		driver.findElement(By.name("pass")).clear();
		
	}
	
	
	
	@AfterMethod
	public void CaptureScreenShot() throws IOException
	{
		System.out.println("CaptureScreenShot in AfterMethod");
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFileToDirectory(source, new File("D:\\mercury"));		
	}
	
	@AfterClass
	public void deleteCookies()
	{
		System.out.println("delete cookies in after class");
	}
	
	@AfterTest
	public void dataBaseClose()
	{
		System.out.println("Database close in after Test");
	}
	
	@AfterSuite
	public void browserClose()
	{
		System.out.println("Browser close in after afterSuite");
		driver.close();
	}
	
	@DataProvider
	public Object[][] getData()
	{
		return new Object[][]
				{
					new Object[] {"QQQQ","qqqq"},
					new Object[] {"dwse","sdcsc"},
					new Object[] {"AAAA","aaaa"}
					
				};
	}
	
	
	

}
