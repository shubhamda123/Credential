package Xpath_29_april;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MercuryTours_Register_usingRelative {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");	
		driver.manage().window().maximize();
		
		WebElement fn=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input"));
		fn.sendKeys("Shubham");
		//first name-absolute
		
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Dandekar");//lastname-relative xpath
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9645686487");//phone no
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("sdandekar86@gmail.com");//emailid
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Tadas lay outt");//address
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Wardha");//city
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Maharashtra");//maharashtra
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("442001");//pincode
		WebElement drop= driver.findElement(By.xpath("//select[@name='country']"));//country
		Select s=new Select(drop);
		s.selectByVisibleText("INDIA");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Shubham123");//username
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");//password
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("123456");//conf password
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='submit']")).click();//sumbit
		
		
		
		
		
		

		
		
	}

}
