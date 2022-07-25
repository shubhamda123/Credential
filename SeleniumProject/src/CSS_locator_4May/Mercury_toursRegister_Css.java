package CSS_locator_4May;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mercury_toursRegister_Css {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");	
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input[name^='first']")).sendKeys("SHUBHAM");
		driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys("Dandekar");
		driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("8978451235");
		driver.findElement(By.cssSelector("input[name='userName']")).sendKeys("sdandekar89@gmail.com");
		driver.findElement(By.cssSelector("input[name='address1']")).sendKeys("Tadas lay out");
		driver.findElement(By.cssSelector("input[name='city']")).sendKeys("Wardha");
		driver.findElement(By.cssSelector("input[name='state']")).sendKeys("Maharashtra");
		driver.findElement(By.cssSelector("input[name='postalCode']")).sendKeys("442001");
	WebElement drop=driver.findElement(By.cssSelector("select[name='country']"));
	   Select s=new Select(drop);
	   s.selectByVisibleText("INDIA");
		
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("shubham123");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("123456");
		driver.findElement(By.cssSelector("input[name='confirmPassword']")).sendKeys("123456");
		driver.findElement(By.cssSelector("input[name='submit']")).click();

		
		
		
		

		

	}

}
