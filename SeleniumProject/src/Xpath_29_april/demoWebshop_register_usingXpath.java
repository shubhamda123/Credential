package Xpath_29_april;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoWebshop_register_usingXpath {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		
	//chose gender	using absolute,relative,dynamic xpath
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[1]/div[1]/input")).click();
		driver.findElement(By.xpath("//input[@name='Gender']")).click();
		driver.findElement(By.xpath("//div[@class='gender'][1]/child :: input")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		;
	}

}
