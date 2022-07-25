package com.cjc.automation.webapp.testcases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.cjc.automation.webapp.utility.ReadConfig;

public class BaseClass {

	ReadConfig read = new ReadConfig();
	String url = read.getBaseUrl();
	String browser = read.getBrowser();
	
	public static WebDriver driver;
	static Logger log;
	
	@BeforeClass
	public void setup() throws Exception
	{
		//launch browser
		log=Logger.getLogger(BaseClass.class.getName());
		log.info("*******launch browser******");
		if (browser.equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "D:\\java practical eclips\\Maven_FrameworkDDF_PrachiGupta\\src\\test\\resources\\driver\\chromedriver.exe");
			driver = new ChromeDriver();	
		} 
		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "\\");
			driver = new FirefoxDriver();
			
		}
		// Check if parameter passed as 'Edge'
		else if (browser.equalsIgnoreCase("Edge")) 
		{
			System.setProperty("webdriver.edge.driver", "D:\\java practical eclips\\Maven_FrameworkDDF_PrachiGupta\\src\\test\\resources\\driver\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		else
		{
			throw new Exception("Browser is not correct");
		}
		
		driver.manage().window().maximize();
		//implicit wait of 10 secs
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//for logging
		
		
//		//open url
//		driver.get(url);
		
	}

	@AfterClass
	public void tearDown()
	{
//		driver.close();
//		driver.quit();
	}

}
