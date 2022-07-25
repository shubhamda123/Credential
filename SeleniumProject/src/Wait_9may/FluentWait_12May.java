package Wait_9may;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWait_12May {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\selenium jar and chrome exe file\\chrome exe for Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html");	
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"post-body-5280210221385817166\"]/div[1]/button")).click();
		
		Wait<WebDriver> w=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);

				WebElement element=w.until(new Function<WebDriver, WebElement>()
						{
						
			@Override
			public WebElement apply(WebDriver wd) {
								
		WebElement msg=wd.findElement(By.xpath("//*[@id=\"demo\"]"));
								
				System.out.println("Fluent Wait");
				String message=msg.getText();
				System.out.println("Message is"+ message );
								
				if(message.equalsIgnoreCase("Software Testing Material - DEMO PAGE"))
					{
					return msg;
					}
					else
					{
					return null;
					}
						
	        }
					
		});


		
		
		
	

	}

}
