import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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
import org.testng.annotations.Test;


public class MercuryTours_Excel {
	
	static Logger log=Logger.getLogger(MercuryTours_Excel.class.getName());
	public WebDriver driver;
	
	FileInputStream fis;
	
	
	@BeforeSuite
	public void openBrowser()
	{
		log.info("OPen browser in BeforeSuite");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@BeforeTest
	public void openUrl() throws IOException
	{
		log.info("OPen Url in BeforeTest");
	 fis=new FileInputStream("D:\\MT.xlsx");
	 XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=wb.getSheet("Sheet1");
		
		XSSFRow row=sheet.getRow(1);
		 
		XSSFCell col=row.getCell(2);
		String usern=col.getStringCellValue();
		driver.get(usern);
		
	
	
	}
	
	@BeforeClass
	public void maximizePage()
	{
		log.info("maximize webpage in BeforeClass");
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void pageLoadtimeOut()
	{
		log.info("pageload in BeforeMethod");
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
	}
	
	@Test(priority=1)
	public void loginwithValidDetails() throws IOException
	{
		log.info("loginpage in Test");
		 fis=new FileInputStream("D:\\MT.xlsx");
		 XSSFWorkbook wb=new XSSFWorkbook(fis);
			
			XSSFSheet sheet=wb.getSheet("Sheet1");
	//username	
			XSSFRow row=sheet.getRow(1);
			XSSFCell col=row.getCell(0);
			String usern=col.getStringCellValue();
			log.info("Username="+usern);
		driver.findElement(By.name("userName")).sendKeys(usern);
	//password	
	//	XSSFRow row1=sheet.getRow(1);
		XSSFCell col1=row.getCell(1);
		String pass=col1.getStringCellValue();
		log.info("Password="+pass);
		driver.findElement(By.name("password")).sendKeys(pass);
		
		driver.findElement(By.name("submit")).click();
		driver.navigate().back();
		driver.findElement(By.name("userName")).clear();
	}
	
	@Test(priority=2)
	public void loginwithValidDetails1() throws IOException
	{
		log.info("loginpage in Test");
		
		
		driver.findElement(By.name("userName")).sendKeys("QQQQ");
		driver.findElement(By.name("password")).sendKeys("qqqq");
		driver.findElement(By.name("submit")).click();
	}
	
	
	@AfterMethod
	public void CaptureScreenShot() throws IOException
	{
		log.info("CaptureScreenShot in AfterMethod");
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFileToDirectory(source, new File("D:\\mercury"));		
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
		driver.close();
	}
	
	
	

}
