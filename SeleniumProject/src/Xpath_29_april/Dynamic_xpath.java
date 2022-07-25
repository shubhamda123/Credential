package Xpath_29_april;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dynamic_xpath {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/HP/Desktop/index.html");	
		driver.manage().window().maximize();
	
		driver.findElement(By.xpath("//div[1]/child :: input")).sendKeys("Shubham@123");
		
		driver.findElement(By.xpath("//div[1]/child :: input")).sendKeys("123456");
		
	//	driver.findElement(By.xpath("//div[1]/child :: button")).click();
		
	WebElement	drop=driver.findElement(By.xpath("//option[1]/parent :: select"));
		Select s=new Select(drop);
		s.selectByIndex(2);
		
		driver.findElement(By.xpath("//span/child :: a")).click();
		
		

		
		
	}

}
