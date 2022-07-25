package Css_direct_child_5May;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HTML_Direct_child {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\selenium jar and chrome exe file\\chrome exe for Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/index.html");
		driver.manage().window().maximize();
		
		//Direct-child
		driver.findElement(By.cssSelector("div.container>input#uid")).sendKeys("Shubham123456");
		driver.findElement(By.cssSelector("div.container input.pass")).sendKeys("123456");
	WebElement drop=driver.findElement(By.cssSelector("div.container>select#browser"));
		Select s=new Select(drop);
		s.selectByIndex(2);

		driver.findElement(By.cssSelector("div.container button#login")).click();
	  
		
		
		

	}

}
