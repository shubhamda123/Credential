package CSS_locator_4May;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task2_fbLogin {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "D:\\selenium jar and chrome exe file\\chrome exe for Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input#email")).sendKeys("shubhu456");//email- tag and id
		driver.findElement(By.cssSelector("input[type^='pass']")).sendKeys("123466789");//password-prefix
		driver.findElement(By.cssSelector("button[name$='in']")).click();//login-suffix
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
