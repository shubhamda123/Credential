package Wait_9may;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;

public class Implicit_Wait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");	
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	
	
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys("sfsafsfs@gmail.com");
		
		
		driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
		driver.findElement(By.name("id_gender")).click();	
		driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]")).sendKeys("Shubham");
		driver.findElement(By.cssSelector("#customer_lastname")).sendKeys("Dandekar");
		//driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sdandekar@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("123456");
	WebElement drop=driver.findElement(By.xpath("//*[@id=\"days\"]"));
		Select s=new Select(drop);
		s.selectByValue("15");
		
		WebElement drop1=driver.findElement(By.xpath("//*[@id=\"months\"]"));
		Select s1=new Select(drop1);
		s1.selectByValue("3");
		
		WebElement drop2=driver.findElement(By.xpath("//select[@name='years']"));
		Select s2=new Select(drop2);
		s2.selectByValue("1996");
	
		//driver.findElement(By.xpath("//*[@id=\"address1\"]").s
//		driver.findElement(By.xpath(""))
//		driver.findElement(By.xpath(""))
//		driver.findElement(By.xpath(""))



				
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
