package com.cjc.DWS.webapp.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.cjc.DWS.webapp.pages.Page1_Register;
import com.cjc.DWS.webapp.pages.Page2_Login;
import com.cjc.DWS.webapp.pages.Page3_Addtocart;
import com.cjc.DWS.webapp.pages.Page4_BillingAddress;
import com.cjc.DWS.webapp.pages.Page5_Payment;
import com.cjc.DWS.webapp.utility.Common;

public class DWSTest {
	
	static Logger log=Logger.getLogger(DWSTest.class.getName());

	@BeforeSuite
	public void openBrowser() throws Exception
	{	
		log.info("OPen browser in BeforeSuiteee");
		FileInputStream fis=Common.proload();
		Common.pro.load(fis);
		String bro = Common.pro.getProperty("browser");
		if (bro.equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "D:\\java practical eclips\\Maven_KeywordFramework_DWS\\src\\test\\resources\\driver\\chromedriver.exe");
			Common.driver = new ChromeDriver();	
		} 
		else if (bro.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\java practical eclips\\Maven_KeywordFramework_DWS\\src\\test\\resources\\driver\\geckodriver.exe");
			Common.driver = new FirefoxDriver();
			
		}
		// Check if parameter passed as 'Edge'
		else if (bro.equalsIgnoreCase("Edge")) 
		{
			System.setProperty("webdriver.edge.driver", "D:\\java practical eclips\\Maven_KeywordFramework_DWS\\src\\test\\resources\\driver\\msedgedriver.exe");
			Common.driver = new EdgeDriver();
		}
		else
		{
			
			throw new Exception("Browser is not correct");
		}
		Common.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
	public void registerTest() throws IOException, InterruptedException
	{
		Thread.sleep(2000);
		Page1_Register page1=PageFactory.initElements(Common.driver, Page1_Register.class);
		page1.registerCheck();
	}
	
	@Test(priority = 2)
	public void loginTest() throws IOException
	{
		FileInputStream fis=Common.proload();
		Common.pro.load(fis);
		Common.driver.navigate().to(Common.pro.getProperty("loginUrl"));
		
		Page2_Login page2=PageFactory.initElements(Common.driver, Page2_Login.class);
		page2.loginCheck();
	}
	
	@Test(priority = 3)
	public void addcartTest()
	{
		Page3_Addtocart page3=PageFactory.initElements(Common.driver, Page3_Addtocart.class);
		try 
		{
			page3.addtocartCheck();
		}
		catch (InterruptedException e) 
		{			
			e.printStackTrace();
		}
	}
	
	@Test(priority = 4)
	public void billingTest() throws IOException
	{
		Page4_BillingAddress page4=PageFactory.initElements(Common.driver, Page4_BillingAddress.class);
		page4.billingCheck();
	}
	
	@Test(priority = 5)
	public void paymentTest() throws IOException, InterruptedException
	{
		Page5_Payment page5=PageFactory.initElements(Common.driver, Page5_Payment.class);
		page5.paymentcheck();
	}
	
	@AfterMethod
	public void CaptureScreenShot() throws IOException
	{
		log.info("CaptureScreenShot in AfterMethod");
	
	 File source=((TakesScreenshot)Common.driver).getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFileToDirectory(source, new File("D:\\java practical eclips\\Maven_KeywordFramework_DWS\\src\\test\\resources\\screenshot"));		
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
}
