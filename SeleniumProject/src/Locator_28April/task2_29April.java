package Locator_28April;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task2_29April {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		
		System.out.println(driver.getTitle());
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.name("userName")).sendKeys("QQQQ");
		
		driver.findElement(By.name("password")).sendKeys("qqqq");
		
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		
	}

}
