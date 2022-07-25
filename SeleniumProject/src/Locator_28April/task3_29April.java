package Locator_28April;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task3_29April {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/register");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Shubham");
		driver.findElement(By.name("LastName")).sendKeys("Dandekar");
		driver.findElement(By.id("Email")).sendKeys("sdandekar456@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("123456");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("Shubham@123");
		driver.findElement(By.id("register-button")).click();
		
        Thread.sleep(2000);
		
		driver.close();
		
		
	}

}
