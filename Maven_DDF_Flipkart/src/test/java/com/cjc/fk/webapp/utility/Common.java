package com.cjc.fk.webapp.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class Common {
	
	public static WebDriver driver;
	public static FileInputStream fis;
	public static Properties pro;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell col;
	
	public static FileInputStream proload() throws IOException
	{
		pro=new Properties();
		fis=new FileInputStream("D:\\java practical eclips\\Maven_DDF_Flipkart\\src\\test\\resources\\FlipkartData.properties");
		return fis;// properties file 
	}
	
	public static String excel_Username() throws IOException
	{
		fis=new FileInputStream("D:\\java practical eclips\\Maven_DDF_Flipkart\\src\\test\\resources\\Flipkart.xlsx");
	   wb=new XSSFWorkbook(fis);   // excel file
		 sheet=wb.getSheetAt(0);
	
		 row=sheet.getRow(1);
		 col=row.getCell(0);
		
		String username=col.getStringCellValue();
		return username;
	
	}
	
	public static String excel_Password() throws IOException
	{
//		fis1=new FileInputStream("D:\\Maven_Data_driver_framework_flipkart\\Flipkart.xlsx");
//	   wb=new XSSFWorkbook(fis1);
//		 sheet=wb.getSheetAt(0);
//		row=sheet.getRow(1);
		 
		col=row.getCell(1);
		String password=col.getStringCellValue();
		return password;
	
	}
	
	
	

}
