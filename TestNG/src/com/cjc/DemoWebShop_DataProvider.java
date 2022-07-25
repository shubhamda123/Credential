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

public class DemoWebShop_DataProvider {
	
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
		driver.get("http://demowebshop.tricentis.com/register");
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
	public void loginwithValidDetails(String fn,String ln,String eid, String p,String pc) throws InterruptedException
	{
		System.out.println("login demowebshop in Test");
		
		driver.findElement(By.cssSelector("input[id='gender-male']")).click();
		driver.findElement(By.cssSelector("input[id='FirstName']")).sendKeys(fn);
		driver.findElement(By.cssSelector("input[id='LastName']")).sendKeys(ln);
		driver.findElement(By.cssSelector("input[id='Email']")).sendKeys(eid);
		driver.findElement(By.cssSelector("input[id='Password']")).sendKeys(p);
		driver.findElement(By.cssSelector("input[id='ConfirmPassword']")).sendKeys(pc);
		driver.findElement(By.cssSelector("input[id='register-button']")).submit();
		Thread.sleep(3000);
     	driver.navigate().back();
		Thread.sleep(4000);
         
		driver.findElement(By.cssSelector("input[id='FirstName']")).clear();
		driver.findElement(By.cssSelector("input[id='LastName']")).clear();
		driver.findElement(By.cssSelector("input[id='Email']")).clear();
		driver.findElement(By.cssSelector("input[id='Password']")).clear();
		driver.findElement(By.cssSelector("input[id='ConfirmPassword']")).clear();
		Thread.sleep(2000);
	}
	
	
	@AfterMethod
	public void CaptureScreenShot() throws IOException
	{
		System.out.println("CaptureScreenShot in AfterMethod");
//		
//	 File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	 FileUtils.copyFileToDirectory(source, new File("D:\\mercury2"));		
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
					new Object[] {"Shubhu","dandekar", "shubham78901@gmail.com","Shubham123","Shubham123"},
					new Object[] {"Amol","lakde","amol789012!@gmail.com","amol@123","amol@123"},
					new Object[] {"bhushan","dorlikar","bhushan789012!@gmail.com","bhushan@123","bhushan@123"}
//					
				};
	}
	
	
}
