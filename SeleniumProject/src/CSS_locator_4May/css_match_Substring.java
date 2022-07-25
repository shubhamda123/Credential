package CSS_locator_4May;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css_match_Substring {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium jar and chrome exe file\\chrome exe for Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/index.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input[id^='ui']")).sendKeys("Shubham123");//username
		driver.findElement(By.cssSelector("input[name$='ss']")).sendKeys("123456");//password
		driver.findElement(By.cssSelector("button[class*='og']")).click();
		

	}

}
