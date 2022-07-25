package Wait_9may;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicite_wait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");	
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Akash");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("lakde");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("akash@gmail.com");
		
		WebDriverWait w=new WebDriverWait(driver, 10);
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='reg_email_confirmation__']"))).sendKeys("akash@gmail.com");

		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Akash@123");
 	WebElement drop=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select s=new Select(drop);
		s.selectByValue("15");
	
		WebElement drop1=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select s1=new Select(drop1);
		s1.selectByValue("3");
	
		WebElement drop2=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select s2=new Select(drop2);
		s2.selectByValue("1996");
		
		driver.findElement(By.xpath("//input[@name='sex']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
