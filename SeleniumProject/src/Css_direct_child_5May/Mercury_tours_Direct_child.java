package Css_direct_child_5May;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mercury_tours_Direct_child {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium jar and chrome exe file\\chrome exe for Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("td>input[name='firstName']")).sendKeys("Shubham");//firstname
		driver.findElement(By.cssSelector("td>input[name='lastName']")).sendKeys("Dandekar");//lastname
		driver.findElement(By.cssSelector("td>input[name='phone']")).sendKeys("9637191923");//phone no
		driver.findElement(By.cssSelector("td>input[name='userName']")).sendKeys("sdandekar86@gmail.com");
		driver.findElement(By.cssSelector("td>input[name='address1']")).sendKeys("Tadas Lay Out");//address
		driver.findElement(By.cssSelector("td>input[name='city']")).sendKeys("Wardha");//city
		driver.findElement(By.cssSelector("td>input[name='state']")).sendKeys("Maharashtra");//state
		driver.findElement(By.cssSelector("td>input[name='postalCode']")).sendKeys("442001");//pincode
	WebElement drop=driver.findElement(By.cssSelector("td>select[name='country']"));//Country
		Select s=new Select(drop);
		s.selectByVisibleText("INDIA");
		
		driver.findElement(By.cssSelector("td>input[name='email']")).sendKeys("Shubham123");//username
		driver.findElement(By.cssSelector("td>input[name='password']")).sendKeys("123456");//password
		driver.findElement(By.cssSelector("td>input[name='confirmPassword']")).sendKeys("123456");//confPassword
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("td>input[name='submit']")).click();//submit button
		
		//sign-in
		driver.navigate().to("https://demo.guru99.com/test/newtours/login.php");
		//driver.findElement(By.cssSelector("font>a[href='login.php']")).click();//sign-in
		driver.findElement(By.cssSelector("td>input[name^='user']")).sendKeys("Shubham123");//username-prefix
		driver.findElement(By.cssSelector("td>input[name^='pass']")).sendKeys("123456");//password
		driver.findElement(By.cssSelector("td>input[name^='sub']")).click();//submit
		

	}

}
