package Css_direct_child_5May;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HTML_nth_of_type {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium jar and chrome exe file\\chrome exe for Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/index.html");
		driver.manage().window().maximize();
		
		
		//nth of-type
				driver.findElement(By.cssSelector("div.container input:nth-of-type(1)")).sendKeys("Shubham123789");
				Thread.sleep(2000);
			    driver.findElement(By.cssSelector("div.container input:nth-of-type(2)")).sendKeys("123456");
			    Thread.sleep(2000);
			  WebElement drop=  driver.findElement(By.cssSelector("div.container select:nth-of-type(1)"));
			  Select s=new Select(drop);
			  s.selectByIndex(2);
			  Thread.sleep(2000);
			  driver.findElement(By.cssSelector("label input:nth-of-type(1)")).click();//remember checkbox
			  Thread.sleep(2000);
			  driver.findElement(By.cssSelector("div.imgcontainer button:nth-of-type(1)")).click();//cancel
			  Thread.sleep(2000);
			  driver.findElement(By.cssSelector("div.container button:nth-of-type(1)")).click();//login
			  Thread.sleep(2000);
		
		
	}

}
