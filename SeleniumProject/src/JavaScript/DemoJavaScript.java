package JavaScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoJavaScript {

	public static void main(String[] args) throws InterruptedException  {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
        
		js.executeScript("scrollBy(0,350)");
		
	  WebElement cname=	driver.findElement(By.id("fromPlaceName"));
		cname.sendKeys("BENG");
	
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		
		String jcityname="return document.getElementById(\"fromPlaceName\").value;";
	    String cityname=(String)js1.executeScript(jcityname);
		System.out.println(cityname);
		
		while(!cityname.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT"))
		{
			Thread.sleep(1000);
			cname.sendKeys(Keys.DOWN);
			 jcityname="return document.getElementById(\"fromPlaceName\").value;";
			 cityname=(String)js1.executeScript(jcityname);
			System.out.println(cityname);
		}
		
	 driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ENTER);
	 
	 //toPlace
	 
	  WebElement cname1=   driver.findElement(By.id("toPlaceName"));
	   cname1.sendKeys("att");
	 
	 
	   JavascriptExecutor js2=(JavascriptExecutor)driver;
		
		String jcityname1="return document.getElementById(\"toPlaceName\").value;";
	    String cityname1=(String)js2.executeScript(jcityname1);
		System.out.println(cityname1);
		
		while(!cityname1.equalsIgnoreCase("ATTIBELE KA BORDER"))
		{
			Thread.sleep(1000);
			cname1.sendKeys(Keys.DOWN);
			 jcityname1="return document.getElementById(\"toPlaceName\").value;";
			 cityname1=(String)js2.executeScript(jcityname1);
			System.out.println(cityname1);
		}
		
	 driver.findElement(By.id("toPlaceName")).sendKeys(Keys.ENTER);
	 
	 // date-of departure
	 
	   driver.findElement(By.id("txtJourneyDate")).click();
	   while(! driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] [class='ui-datepicker-month']")).getText().contains("May"))
		{
			System.out.println("while loop");
			driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] [class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
	   
	   List<WebElement> ls= driver.findElements(By.cssSelector("td[data-handler='selectDay']"));

		int count=ls.size();
			System.out.println(count);
			
			for (int i = 0; i < count; i++) 
			{
				System.out.println("for loop");
			String s=driver.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).getText();
				
				if(s.equalsIgnoreCase("20"))
				{
					driver.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).click();
					break;
				}
				
			}
	 
	 System.out.println("--------------------------------------");
	 //date of return
			
			  driver.findElement(By.id("txtReturnJourneyDate")).click();
			   while(! driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] [class='ui-datepicker-month']")).getText().contains("June"))
				{
					System.out.println("while loop");
					driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] [class='ui-icon ui-icon-circle-triangle-e']")).click();
				}
			   
			   List<WebElement> ls1= driver.findElements(By.cssSelector("td[data-handler='selectDay']"));

				int count1=ls1.size();
					System.out.println(count1);
					
					for (int i = 0; i < count1; i++) 
					{
						System.out.println("for loop");
					String s1=driver.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).getText();
						
						if(s1.equalsIgnoreCase("10"))
						{
							driver.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).click();
						}
						
					}
			 
	 
	 
	 
	 
		
	}

}
