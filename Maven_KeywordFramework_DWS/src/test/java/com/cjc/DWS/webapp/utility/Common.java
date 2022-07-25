package com.cjc.DWS.webapp.utility;

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
	public static Properties pro;
	public static FileInputStream fis;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell col;
	
	
	public static FileInputStream proload() throws FileNotFoundException
	{
		pro=new Properties();
		fis=new FileInputStream("D:\\java practical eclips\\Maven_KeywordFramework\\src\\test\\resources\\parameter.properties");
		return fis;
	}
	
	public static String excel_Firstname() throws IOException
	{
		fis=new FileInputStream("D:\\java practical eclips\\Maven_KeywordFramework\\src\\test\\resources\\RegisterData.xlsx");
	   wb=new XSSFWorkbook(fis);   // excel file
		 sheet=wb.getSheetAt(0);
		row=sheet.getRow(1);
		 col=row.getCell(0);
		
		String Firstname=col.getStringCellValue();
		return Firstname;
	}
	
	public static String excel_Lastname() throws IOException
	{
		col=row.getCell(1);
		String Lastname=col.getStringCellValue();
		return Lastname;
	}
	
	
	public static String excel_email() throws IOException
	{
		col=row.getCell(2);
		String email=col.getStringCellValue();
		return email;
	}
	
	public static String excel_password() throws IOException
	{
		col=row.getCell(3);
		String password=col.getStringCellValue();
		return password;
	}
	
	public static String excel_Confpassword() throws IOException
	{
		col=row.getCell(4);
		String Confpassword=col.getStringCellValue();
		return Confpassword;
	}
	
	
	
	

}
