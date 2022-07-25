package Assertion;

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
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Hard_Soft_Assertion {
	
public WebDriver driver;
	
	@BeforeSuite
	public void openBrowser()
	{
		System.out.println("OPen browser in BeforeSuite");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");
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
	
	@Test
	public void loginwithValidDetails()
	{
	   String url=driver.getCurrentUrl();
		Assert.assertEquals(url, "https://demo.guru99.com/test/newtours/");
//	   SoftAssert sa=new SoftAssert();
//	   sa.assertEquals(url, "https://demo.guru99.com/test/");

		System.out.println("loginpage in Test"); 
		
	WebElement username=driver.findElement(By.name("userName"));
	Assert.assertTrue(username.isDisplayed());	
	       username.sendKeys("QQQQ");
	       
	WebElement password=driver.findElement(By.name("password"));
	Assert.assertTrue(password.isDisplayed());
	 password.sendKeys("qqqq");
	 
		String title=driver.getTitle();
	    Assert.assertEquals(title, "Welcome: Mercury Tours");
	    
		driver.findElement(By.name("submit")).click();

	driver.navigate().back();
	driver.findElement(By.name("userName")).clear();
		//   sa.assertAll();
	
	}
	
	@Test
	public void loginwithValidDetails1()
	{
	   String url=driver.getCurrentUrl();
	   SoftAssert sa=new SoftAssert();
	   sa.assertEquals(url, "https://demo.guru99.com/test/newtours/");

		System.out.println("loginpage in Test"); 
		
	WebElement username=driver.findElement(By.name("userName"));
	sa.assertTrue(username.isDisplayed());	
	       username.sendKeys("QQQQ");
	   String user= username.getAttribute("value");
	   System.out.println("username="+user);
	   sa.assertEquals(user, "AAAA");
	   
	WebElement password=driver.findElement(By.name("password"));
	sa.assertTrue(password.isDisplayed());
	 password.sendKeys("qqqq");
	   String pass= password.getAttribute("value");
	   System.out.println("password="+pass);
	 sa.assertEquals(pass, "aaaa");
	   
		String title=driver.getTitle();
	    sa.assertEquals(title, "Welcome: Mercury Tours");
	    
		driver.findElement(By.name("submit")).click();

	driver.navigate().back();
	driver.findElement(By.name("userName")).clear();
		   sa.assertAll();
	
	}
	
	@Test
	public void loginwithValidDetails2()
	{
	   String url=driver.getCurrentUrl();
	   SoftAssert sa=new SoftAssert();
	   sa.assertEquals(url, "https://demo.guru99.com/test/newtours/");

		System.out.println("loginpage in Test"); 
		
	WebElement username=driver.findElement(By.name("userName"));
	sa.assertTrue(username.isDisplayed());	
	       username.sendKeys("AAAA");
	   String user= username.getAttribute("value");
	   System.out.println("username="+user);
	   sa.assertEquals(user, "SSSS");
	   
	WebElement password=driver.findElement(By.name("password"));
	sa.assertTrue(password.isDisplayed());
	 password.sendKeys("aaaa");
	   String pass= password.getAttribute("value");
	   System.out.println("password="+pass);
	 sa.assertEquals(pass, "ssss");
	   
		String title=driver.getTitle();
	    sa.assertEquals(title, "Welcome: Mercury Tours");
	    
		driver.findElement(By.name("submit")).click();

	driver.navigate().back();
	driver.findElement(By.name("userName")).clear();
		   sa.assertAll();
	
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
	
	
}
