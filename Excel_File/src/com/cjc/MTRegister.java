package com.cjc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

public class MTRegister {
	
	 WebDriver driver;
		
		@BeforeSuite
		public void openBrowser()
		{
			System.out.println("open browser in beforeSuite");
			System.setProperty("webdriver.chrome.driver", "D:\\selenium jar and chrome exe file\\chrome exe for Selenium\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		@BeforeTest
		public void openUrl()
		{
			System.out.println("open url in beforeTest");
			driver.get("https://demo.guru99.com/test/newtours/register.php");
			
		}
		
		@BeforeClass
		public void maximize()
		{
			System.out.println("maximize in beforeClass");
			driver.manage().window().maximize();
		}
		
		@BeforeMethod
		public void pageload()
		{
			System.out.println("pageload in beforeMethod");
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		}
		
		@Test
		public void Register() throws IOException, InterruptedException
		{
			FileInputStream fis=new FileInputStream("D:\\Demo.xlsx");
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheet=wb.getSheet("Sheet1");
			XSSFRow row=sheet.getRow(1);
			XSSFCell col0=row.getCell(0);
			String fn=col0.getStringCellValue();
			System.out.println(fn);
			driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys(fn);
			
			XSSFCell col1=row.getCell(1);
			String ln=col1.getStringCellValue();
			System.out.println(ln);
			driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys(ln);
			
			XSSFCell col2=row.getCell(2);
			String ph=col2.getStringCellValue();
			System.out.println(ph);
			driver.findElement(By.cssSelector("input[name='phone']")).sendKeys(ph);
			
			XSSFCell col3=row.getCell(3);
			String email=col3.getStringCellValue();
			System.out.println(email);
			driver.findElement(By.cssSelector("input[name='userName']")).sendKeys(email);
			
			XSSFCell col4=row.getCell(4);
			String ad=col4.getStringCellValue();
			System.out.println(ad);
			driver.findElement(By.cssSelector("input[name='address1']")).sendKeys(ad);
			
			XSSFCell col5=row.getCell(5);
			String city=col5.getStringCellValue();
			System.out.println(city);
			Thread.sleep(4000);
			driver.findElement(By.name("city")).sendKeys(city);
			
			XSSFCell col6=row.getCell(6);
			String state=col6.getStringCellValue();
			System.out.println(state);
			Thread.sleep(4000);
			driver.findElement(By.cssSelector("input[name='state']")).sendKeys(state);
			
			XSSFCell col7=row.getCell(7);
			String pin=col7.getStringCellValue();
			System.out.println(pin);
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[name='postalCode']")).sendKeys(pin);
			
			XSSFCell col8=row.getCell(8);
			String country=col8.getStringCellValue();
			System.out.println(country);
		driver.findElement(By.cssSelector("select[name='country']")).sendKeys(country);;
//		   Select s=new Select(drop);
//		   s.selectByVisibleText("INDIA");
			
			XSSFCell col9=row.getCell(9);
			String un=col9.getStringCellValue();
			System.out.println(un);
			driver.findElement(By.cssSelector("input[name='email']")).sendKeys(un);
			
			XSSFCell col10=row.getCell(10);
			String pass=col10.getStringCellValue();
			System.out.println(pass);
			driver.findElement(By.cssSelector("input[name='password']")).sendKeys(pass);
			

			XSSFCell col11=row.getCell(11);
			String cpass=col11.getStringCellValue();
			System.out.println(cpass);
			driver.findElement(By.cssSelector("input[name='confirmPassword']")).sendKeys(cpass);
			
			XSSFCell col12=row.getCell(12);
			System.out.println("Status="+col12.getStringCellValue());
			driver.findElement(By.cssSelector("input[name='submit']")).click();

		}
		
		
		@AfterMethod
		public void screenshot() throws IOException
		{
			System.out.println("screeenshot in afterMethod");
			File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFileToDirectory(source, new File("D:\\TestNgMercuryToursRegister"));
		}
		
		
		@AfterClass
		public void deletecookies()
		{
			System.out.println("deletecookies in AfterClass");
		}
		
		@AfterTest
		public void closeDb()
		{
			System.out.println("close database in AfterTest");
		}
		

		@AfterSuite
		public void closedriver() throws InterruptedException
		{
			System.out.println("close webdriver in Aftersuite");
			Thread.sleep(2000);
			driver.close();
		}
		

}
