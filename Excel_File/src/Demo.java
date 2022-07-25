import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo {

	public static void main(String[] args) throws IOException {

      FileInputStream fis=new FileInputStream("D:\\Demo.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=wb.getSheet("Sheet1");
		
		XSSFRow row=sheet.getRow(1);
		 
		XSSFCell col=row.getCell(0);
		System.out.println(col.getStringCellValue());
		String usern=col.getStringCellValue();
		System.out.println("Username= "+usern);
		
		XSSFCell col1=row.getCell(1);
		String pass=col1.getStringCellValue();
		System.out.println("password="+pass);
		
		 int rowno= sheet.getLastRowNum();
		  System.out.println(rowno);
		  int rowcount=rowno+1;
		  System.out.println("rowcount="+rowcount);
		  
		 
		  for(int i=0;i<2;i++)
		  {
			 XSSFRow row11=sheet.getRow(i);
			  
			  for (int j = 0; j <11 ; j++) 
			  {
				  XSSFCell col11=row11.getCell(j);
				  String value=col11.getStringCellValue();
				  System.out.print(value+" ");
		     }
		    System.out.println();
		  }
		  
		  //write data
		  sheet.getRow(0).createCell(10).setCellValue("status");
		  sheet.getRow(1).createCell(10).setCellValue("pass");
//		  sheet.getRow(2).createCell(2).setCellValue("fail");
//		  sheet.getRow(3).createCell(2).setCellValue("pass");

		  FileOutputStream fos=new FileOutputStream("D:\\Demo.xlsx");
		  
		  wb.write(fos);
		  
	}

}
