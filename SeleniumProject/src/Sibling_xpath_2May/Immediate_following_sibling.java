package Sibling_xpath_2May;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Immediate_following_sibling {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/index.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//label[1]/following-sibling :: *[1]")).sendKeys("kanch");
		driver.findElement(By.xpath("//input[1]/following-sibling :: *[4]")).sendKeys("963719");
		
	WebElement drop=driver.findElement(By.xpath("//label[2]/following-sibling :: *[4]"));
		Select s=new Select(drop);
		s.selectByIndex(1);
		
	driver.findElement(By.xpath("//select/following-sibling :: *[4]")).click();
	
	
		
		
		
		
		
	
	}

}
