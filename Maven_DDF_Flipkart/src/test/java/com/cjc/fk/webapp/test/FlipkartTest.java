package com.cjc.fk.webapp.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
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

import com.cjc.fk.webapp.pages.LoginPage;
import com.cjc.fk.webapp.pages.SerachProduct;
import com.cjc.fk.webapp.utility.Common;

public class FlipkartTest {
	
	static Logger log=Logger.getLogger(FlipkartTest.class.getName());
	//Properties pro=new Properties();
	
	@BeforeSuite
	public void openBrowser() throws IOException
	{	
		
		log.info("OPen browser in BeforeSuiteee");
		System.setProperty("webdriver.chrome.driver","D:\\java practical eclips\\Maven_DDF_Flipkart\\src\\test\\resources\\driver\\chromedriver.exe");
		Common.driver=new ChromeDriver();
	}
	
	@BeforeTest
	public void openUrl() throws IOException
	{
		FileInputStream fis=Common.proload();
		Common.pro.load(fis);
		log.info("OPen Url in BeforeTest");
		Common.driver.get(Common.pro.getProperty("url"));
		
	}
	
	@BeforeClass
	public void maximizePage()
	{
		Common.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		Common.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		log.info("maximize webpage in BeforeClass");
		Common.driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void cookies()
	{
		log.info("This is Before method Annottion");

		Set<Cookie> cookies=Common.driver.manage().getCookies();
		for (Cookie cookie : cookies) 
		{
			log.info(cookie.getName());
		}
	}
	
	@Test(priority=1)
	public void loginTest() throws IOException, InterruptedException
	{
		 Thread.sleep(2000);
		 LoginPage lp=PageFactory.initElements(Common.driver, LoginPage.class);
		 lp.login();
	}
	
	@Test(priority=2,dataProvider = "getData")
	public void searchProd(String product1) throws InterruptedException
	{
		SerachProduct sp=PageFactory.initElements(Common.driver, SerachProduct.class);
		sp.searchCheck(product1);
	}
	
	
	@AfterMethod
	public void CaptureScreenShot() throws IOException
	{
		log.info("CaptureScreenShot in AfterMethod");
	
	 File source=((TakesScreenshot)Common.driver).getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFileToDirectory(source, new File("D:\\java practical eclips\\Maven_DDF_Flipkart\\src\\test\\resources\\Screenshot"));		
	}
	
	@AfterClass
	public void deleteCookies()
	{
		log.info("delete cookies in after class");
	}
	
	@AfterTest
	public void dataBaseClose()
	{
		log.info("Database close in after Test");
	}
	
	@AfterSuite
	public void browserClose()
	{
		log.info("Browser close in after afterSuite");
	//	Common.driver.close();
		Common.driver.quit();
	}
	
	@DataProvider
	public Object[][] getData()
	{
		return new Object[][]
				{
					new Object[] {"pendrive"},
					new Object[] {"mi mobiles"}
						
				};
	}


}
