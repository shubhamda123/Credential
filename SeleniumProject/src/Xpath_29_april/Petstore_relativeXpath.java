package Xpath_29_april;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Petstore_relativeXpath {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");	
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("shubham123");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@name='repeatedPassword']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@name='account.firstName']")).sendKeys("Shubham");
		driver.findElement(By.xpath("//input[@name='account.lastName']")).sendKeys("Dandekar");
		driver.findElement(By.xpath("//input[@name='account.email']")).sendKeys("sdandekar86@gmail.com");
		driver.findElement(By.xpath("//input[@name='account.phone']")).sendKeys("9635456512");
	    driver.findElement(By.xpath("//input[@name='account.address1']")).sendKeys("Tadas lAy");
	    driver.findElement(By.xpath("//input[@name='account.address2']")).sendKeys("pipri meghe");
		driver.findElement(By.xpath("//input[@name='account.city']")).sendKeys("Wardha");
     	driver.findElement(By.xpath("//input[@name='account.state']")).sendKeys("Maharashtra");
     	driver.findElement(By.xpath("//input[@name='account.zip']")).sendKeys("442001");
     	driver.findElement(By.xpath("//input[@name='account.country']")).sendKeys("India");
     WebElement drop=driver.findElement(By.xpath("//select[@name='account.languagePreference']"));
     	Select s=new Select(drop);
     	s.selectByIndex(1);
     	
 	  WebElement drop1=driver.findElement(By.xpath("//select[@name='account.favouriteCategoryId']"));
       	Select s1=new Select(drop1);
       	s1.selectByIndex(2);
       	
       	driver.findElement(By.xpath("//input[@name='account.listOption']")).click();
       	driver.findElement(By.xpath("//input[@name='account.bannerOption']")).click();
       	driver.findElement(By.xpath("//input[@name='newAccount']")).click();
       	
		
	}

}
