package DataDrivenExcel_Concept;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DataRead_Write {
	
	@Test
	public void method() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium jar and chrome exe file\\chrome exe for Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		FileInputStream fis=new FileInputStream("D:\\java practical eclips\\Excel_File\\src\\DataDrivenExcel_Concept\\DataDrivenFramework.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Sheet1");
	
		int ttlrow=sheet.getLastRowNum();
		int ttlCell=sheet.getRow(0).getLastCellNum();
		
		System.out.println(ttlrow);
		System.out.println(ttlCell);
		
		for(int i=1; i<=ttlrow; i++)
		{
			XSSFCell col= sheet.getRow(i).getCell(0);
		  String email=	col.getStringCellValue();
		  
		  driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(email);
		  XSSFCell col1= sheet.getRow(i).getCell(1);
		  String pass=col1.getStringCellValue();
		  driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(pass);
		  driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		  
		  String username= driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).getText();
		  System.out.println(username);
		  
		//  Assert.assertEquals(username, email);
		  
		  if(username.equalsIgnoreCase(email))
		  {
			  FileOutputStream fos=new FileOutputStream("D:\\\\java practical eclips\\\\Excel_File\\\\src\\\\DataDrivenExcel_Concept\\\\DataDrivenFramework.xlsx");
			  sheet.getRow(i).createCell(2).setCellValue("pass");
			  wb.write(fos);
		  }
		  else if(username!=email)
		  {
			  FileOutputStream fos=new FileOutputStream("D:\\\\java practical eclips\\\\Excel_File\\\\src\\\\DataDrivenExcel_Concept\\\\DataDrivenFramework.xlsx");
			  sheet.getRow(i).createCell(2).setCellValue("fail");
			  wb.write(fos);
		  }
		  
		  driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		  driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		  
		
		  
		  
		}
			
		}
		
	}
	
	

