package com.org;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
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
import org.testng.annotations.Test;



public class DemoWebShop_Register {
	
	static Logger log=Logger.getLogger(DemoWebShop_Register.class.getName());
	
	WebDriver driver;
	
	 @BeforeSuite
	  public void openBrowser() 
	  {
		 log.info("this chrome browser Before suite");
		 System.setProperty("webdriver.chrome.driver","D:\\selenium jar and chrome exe file\\chrome exe for Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
	  }
	 
	 @BeforeTest
	  public void enterUrl() 
	  {
		 log.info("Before Test");
		  driver.get("http://demowebshop.tricentis.com/register");
		  
	  }
	
	 @BeforeClass
	  public void maximizeBrowser() 
	  {
		 log.info("Before class");
		  driver.manage().window().maximize();
	  }
	 
	 @BeforeMethod
	  public void getAllCookies() 
	  {
		 log.info("Before method");

		 Set<Cookie> cookies=driver.manage().getCookies();
		  int co=cookies.size();
		  log.info("no of cookies="+co);
	  }
	 
@Test
public void f() throws InterruptedException 
{
	 driver.findElement(By.id("gender-male")).click();
	  driver.findElement(By.id("FirstName")).sendKeys("pravin");
	  driver.findElement(By.xpath("//*[@id='LastName']")).sendKeys("jadhav");
	  driver.findElement(By.cssSelector("#Email")).sendKeys("fjewfhwee@gmail.com");
	  driver.findElement(By.xpath("//*[@id='Password']")).sendKeys("ytresdf");
	  driver.findElement(By.xpath("//*[@id='ConfirmPassword']")).sendKeys("ytresdf");
	  driver.findElement(By.id("register-button")).click();
      log.error("register successfully");
}

@AfterMethod
public void captureScreen() throws IOException 
{
	  File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
	FileUtils.copyFileToDirectory(src, new File("D:\\demo"));
}

@AfterClass
public void deleteCookies() 
{
	  log.info("Delete cookies");

}

@AfterTest
public void dbClose() 
{
	  log.info("data base close");

}

@AfterSuite
public void afterSuite() 
{
     log.info("After suite");
	  driver.close();
}


	

}
