package Xpath_29_april;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_path {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
   //1.facebook	
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("shubhamd@gmail.com");//username
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1234578");//password
		driver.findElement(By.xpath("//button[@name='login']")).click();//login
	//	driver.findElement(By.xpath("//div[@aria-label='Your profile']")).click(); /click on profile
	
		// OR
		driver.findElement(By.xpath("//div[1]/child :: input")).sendKeys("shubhamdandekar@gmail.com");
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys("Shubhamdandekar01");
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
	
		

	
		
		
		
		
		
		
		
	}

}
