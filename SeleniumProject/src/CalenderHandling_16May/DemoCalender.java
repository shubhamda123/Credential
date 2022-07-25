package CalenderHandling_16May;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoCalender {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();

		while(! driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] [class='ui-datepicker-month']")).getText().contains("October"))
		{
			System.out.println("In while loop");
			driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] [class='ui-icon ui-icon-circle-triangle-e']")).click();
			
		}
		
	List<WebElement> ls= driver.findElements(By.cssSelector("td[data-handler='selectDay']"));
		
	int count=ls.size();
     System.out.println(count);
     
		for (int i = 0; i < count; i++) 
		{
			System.out.println("for loop");
			String svalue=driver.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).getText();
			
			if(svalue.equalsIgnoreCase("15"))
			{
				driver.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).click();
			}
			
		}
	
		
		//driver.close();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
