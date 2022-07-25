package Locator_28April;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1_29April {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("sdandekar67@gmail.com");
		
		driver.findElement(By.name("pass")).sendKeys("123456");
		
		driver.findElement(By.name("login")).click();
        Thread.sleep(5000);
		
		driver.close();
	


	}

}
