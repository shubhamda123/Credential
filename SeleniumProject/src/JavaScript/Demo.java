package JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\selenium jar and chrome exe file\\chrome exe for Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
        
		js.executeScript("scrollBy(0,350)");
		
	  WebElement cname=	driver.findElement(By.id("fromPlaceName"));
		cname.sendKeys("BENG");
		
		String value=	cname.getAttribute("value");
		System.out.println("value="+value);
		
		
		
		while(!value.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT"))
		{
			Thread.sleep(1000);
			cname.sendKeys(Keys.DOWN);
			
			 value=	cname.getAttribute("value");
			System.out.println("value="+value);
			
		}
		
		cname.sendKeys(Keys.ENTER);
		
	}

		
	}


