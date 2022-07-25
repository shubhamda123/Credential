package Sibling_xpath_2May;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Following_sibling {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/index.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//label[1]/following-sibling :: input")).sendKeys("SHUBHAM");
		driver.findElement(By.xpath("//input[1]/following-sibling :: input")).sendKeys("56789");
		driver.findElement(By.xpath("//label[3]/following-sibling :: button")).click();
		////select/following-sibling :: button
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
