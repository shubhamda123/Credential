package CSS_locator_4May;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1_MercuryTours_login {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium jar and chrome exe file\\chrome exe for Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input[name='userName']")).sendKeys("QQQQ");//username-tag,attrib,value
		driver.findElement(By.cssSelector("input[name^='pass']")).sendKeys("qqqq");// password-prefix
		driver.findElement(By.cssSelector("input[name$='mit']")).click(); // submit button- suffix
		
		Thread.sleep(2000);
		//Registration
		driver.findElement(By.cssSelector("a[href='register.php']")).click();
		//driver.findElement(By.cssSelector(""))
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
