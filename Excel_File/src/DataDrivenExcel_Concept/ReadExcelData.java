package DataDrivenExcel_Concept;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static FileInputStream fis;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	public static int rowCount(String filename,String sheetname) throws IOException
	{
		fis=new FileInputStream(filename);
		wb=new XSSFWorkbook(fis);
		sheet=wb.getSheet(sheetname);
	    int ttlRow=sheet.getLastRowNum()+1;	 
	    return ttlRow;
	}
	
	public static int colCount(String filename,String sheetname) throws IOException
	{
		fis=new FileInputStream(filename);
		wb=new XSSFWorkbook(fis);
		sheet=wb.getSheet(sheetname);
	    int ttlCol=sheet.getRow(0).getLastCellNum();
	    return ttlCol;
	}
	
	public static String cellValue(String filename,String sheetname,int rowno,int cellno) throws IOException 
	{
		fis=new FileInputStream(filename);
		wb=new XSSFWorkbook(fis);
		sheet=wb.getSheet(sheetname);
		cell=sheet.getRow(rowno).getCell(cellno);
		String cellva=cell.getStringCellValue();
		wb.close();
		return cellva;

	}
	
	
	
	
	
	
	
	
}
