package Css_direct_child_5May;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HTML_nth_child {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium jar and chrome exe file\\chrome exe for Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/index.html");
		driver.manage().window().maximize();
		
		//nth child
		driver.findElement(By.cssSelector("div.container :nth-child(2)")).sendKeys("Shubhamda");// username
		driver.findElement(By.cssSelector("div.container :nth-child(6)")).sendKeys("123456789");//password
	WebElement drop=driver.findElement(By.cssSelector("div.container :nth-child(9)"));
		Select s=new Select(drop);
		s.selectByIndex(1);

		driver.findElement(By.cssSelector("div.container :nth-child(13)")).click();//login
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("span.password :nth-child(1)")).click();//forget pass- nth child
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
