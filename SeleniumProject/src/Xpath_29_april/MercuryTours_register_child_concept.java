package Xpath_29_april;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MercuryTours_register_child_concept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");	
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("REGISTER")).click();
		//driver.findElement(By.xpath("//a[@href='register.php']")).click();
		
	//	driver.findElement(By.xpath("//form//table//tbody//tr[2]//td[2]/child :: input[@name='firstName']")).sendKeys("Shubhu");
		driver.findElement(By.xpath("//form//table//tbody//tr[2]//td[2]/child :: input")).sendKeys("Shubhu");
		
		driver.findElement(By.xpath("//form//table//tbody//tr[3]//td[2]/child :: input")).sendKeys("Dandekar");
		//driver.findElement(By.xpath("//td[2]/child :: input[@name='lastName']")).sendKeys("Dandekar");
		
		driver.findElement(By.xpath("//td[2]/child :: input[@name='phone']")).sendKeys("9637191923");
		driver.findElement(By.xpath("//td[2]/child :: input[@id='userName']")).sendKeys("sdandekar36@gmail.com");
		driver.findElement(By.xpath("//td[2]/child :: input[@name='address1']")).sendKeys("Tadas Lay out");
		driver.findElement(By.xpath("//td[2]/child :: input[@name='city']")).sendKeys("Wardha");
		driver.findElement(By.xpath("//td[2]/child :: input[@name='state']")).sendKeys("Maharashtra");
		driver.findElement(By.xpath("//td[2]/child :: input[@name='postalCode']")).sendKeys("442001");
		
    //WebElement drop=driver.findElement(By.xpath("//form//table//tbody//tr[11]//td[2]/child :: select[@name='country']"));
	//WebElement drop1=driver.findElement(By.xpath("//form//table//tbody//tr[11]//td[2]/child :: select"));
    	WebElement drop2=driver.findElement(By.xpath("//option[108]/parent :: select"));
		
		Select s=new Select(drop2);
		s.selectByValue("INDIA");
		
		driver.findElement(By.xpath("//td[2]/child :: input[@id='email']")).sendKeys("shubhu123");
		driver.findElement(By.xpath("//td[2]/child :: input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//td[2]/child :: input[@name='confirmPassword']")).sendKeys("123456");
		driver.findElement(By.xpath("//td/child :: input[@name='submit']")).click();
		
		
		
		
	}

}
