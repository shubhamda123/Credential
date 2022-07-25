package WebTable_19May;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_HTML_rows_column {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/table.html");
		driver.manage().window().maximize();

		
		 List<WebElement> rows= driver.findElements(By.xpath("/html/body/table/tbody/tr"));
			int rsize=rows.size();
			System.out.println("no. of rows " + rsize);
			
			 List<WebElement> column= driver.findElements(By.xpath("/html/body/table/tbody/tr[1]/td"));
				int ccol=column.size();
				System.out.println("no. of column " + ccol);
				
			for(int i=1;i<=rsize;i++)
			{
				for(int j=1;j<=ccol;j++)
				{
					String data=driver.findElement(By.xpath("/html/body/table/tbody/tr[" + i + "]/td[" + j + "]")).getText();
				     System.out.print(data + "   ");
				}
				System.out.println();
			}
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
