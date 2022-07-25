package Sibling_xpath_2May;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Preceding_sibling {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/index.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//label[2]/preceding-sibling :: input")).sendKeys("shubham123");
		//   //br[2]/preceding-sibling :: input
		//   //br[3]/preceding-sibling :: input
		
		driver.findElement(By.xpath("//select/preceding-sibling :: input[@id='pid']")).sendKeys("dandekar123");
		// //label[3]/preceding-sibling :: input[@id='pid']
		
	WebElement drop=driver.findElement(By.xpath("//label[3]/preceding-sibling :: select"));
		Select s=new Select(drop);
		s.selectByIndex(2);
		
		driver.findElement(By.xpath("//label[3]/following-sibling :: button")).click();
		
		
		
		
		
		
		
	
		
	}

}
