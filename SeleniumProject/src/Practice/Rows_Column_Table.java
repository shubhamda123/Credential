package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rows_Column_Table {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/table.html");
		driver.manage().window().maximize();
		
		List<WebElement> lsr=driver.findElements(By.tagName("tr"));
		        int rows=lsr.size();
		System.out.println(rows);
		
		    WebElement  c=   driver.findElement(By.xpath("/html/body/table/tbody/tr[2]"));
		         List<WebElement> lsc=   c.findElements(By.tagName("td"));
		       int column=lsc.size();
		System.out.println(column);
		
		
		
		   for(int i=1; i<=rows; i++)
		   {
			   for(int j=1; j<=column; j++)
			   {
				String data=driver.findElement(By.xpath("/html/body/table/tbody/tr[" + i + "]/td[" + j + "]")).getText();
				   System.out.print(data + "   ");
				   
			   }
				   
				   
				   System.out.println();   
		   }
		

		driver.close();
		
		
		
		
		
		
		
	}

}
