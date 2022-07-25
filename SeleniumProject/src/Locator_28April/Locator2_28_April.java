package Locator_28April;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locator2_28_April {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/HP/Desktop/index.html");
		
		driver.findElement(By.id("uid")).sendKeys("ShubhamD");
		
		driver.findElement(By.name("pass")).sendKeys("123456");
		
		WebElement drop=driver.findElement(By.tagName("select"));
		
		Select s=new Select(drop);
		s.selectByIndex(2);
		
		driver.findElement(By.id("remem")).click();
		
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Password?")).click();
	//	driver.findElement(By.pa)	driver.close();

	}

}
