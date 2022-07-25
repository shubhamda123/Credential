package com.cjc.XML;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MercuryTours_login_DataProvider {
	
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
		driver.get("https://demo.guru99.com/test/newtours/");
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
	
	@Parameters({"user","pass"})
	@Test
	public void Test1(String un,String ps) throws InterruptedException
	{
		System.out.println("loginpage in Test");
		driver.findElement(By.name("userName")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(ps);
		driver.findElement(By.name("submit")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.name("userName")).clear();;
		driver.findElement(By.name("password")).clear();
	}
	
	@Parameters({"user1","pass1"})
	@Test
	public void Test2(String un,String ps) throws InterruptedException
	{
		System.out.println("loginpage in Test");
		driver.findElement(By.name("userName")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(ps);
		driver.findElement(By.name("submit")).click();
	
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
	
		//driver.close();
		driver.quit();
	}
	
//	@DataProvider
//	public Object[][] getData()
//	{
//		return new Object[][]
//				{
//				
//					new Object[] {"dwse","sdcsc"},
//					new Object[] {"ssss","dddd"}
//					
//				};
	}
 



