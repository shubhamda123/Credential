package WebTable_19May;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Html {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/table.html");
		driver.manage().window().maximize();

		//no. of rows in html page
	    List<WebElement> lsrows =driver.findElements(By.tagName("tr"));		
	            int   totalrows=lsrows.size();
		System.out.println("totalrows="+totalrows);
		
		for(WebElement rows:lsrows)
		{
			System.out.println("rows="+rows.getText());
		}
		
	// no of column by first row
      WebElement th= driver.findElement(By.xpath("/html/body/table/tbody/tr[1]"));
		List<WebElement> column=th.findElements(By.tagName("td"));
		     int totalcolumn= column.size();
		System.out.println("totalcolumn="+totalcolumn);
		

		// for 6 rows
		WebElement data6= driver.findElement(By.xpath("/html/body/table/tbody/tr[7]"));
		System.out.println(data6.getText());
		
		 // or
		
		System.out.println("---------------------");
		List<WebElement> ls6= driver.findElements(By.xpath("/html/body/table/tbody/tr[7]"));
		for(WebElement d6:ls6)
		{
			System.out.println(d6.getText());
		}
		
		driver.close();
		
	}

}
