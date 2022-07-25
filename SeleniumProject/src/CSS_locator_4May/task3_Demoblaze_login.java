package CSS_locator_4May;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task3_Demoblaze_login {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium jar and chrome exe file\\chrome exe for Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("a#signin2")).click();
		driver.findElement(By.cssSelector("input[id^='sign']")).sendKeys("shubham1234");//user-prefix
		driver.findElement(By.cssSelector("input#sign-password")).sendKeys("123456");// password-tag and id
		driver.findElement(By.cssSelector("button[onclick='register()']")).click();//tag,attri,value
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
