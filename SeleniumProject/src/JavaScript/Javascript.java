package JavaScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium jar and chrome exe file\\chrome exe for Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
        
		js.executeScript("scrollBy(0,350)");
		
	  WebElement cname=	driver.findElement(By.id("fromPlaceName"));
		cname.sendKeys("BENG");
		
	//	JavascriptExecutor js1=(JavascriptExecutor)driver;
	
		String jcityname="return document.getElementById(\"fromPlaceName\").value;";
	    String cityname=(String)js.executeScript(jcityname);
		System.out.println("cityname="+cityname);
		
		while(!cityname.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT"))
		{
			Thread.sleep(1000);
			cname.sendKeys(Keys.DOWN);
			 jcityname="return document.getElementById(\"fromPlaceName\").value;";
			 cityname=(String)js.executeScript(jcityname);
			System.out.println(cityname);
		}
		
			cname.sendKeys(Keys.ENTER);
		
	}

}
