package Locator_28April;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class task4 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("sdandekar");
		driver.findElement(By.name("password")).sendKeys("Shubham@123");
		driver.findElement(By.name("repeatedPassword")).sendKeys("Shubham@123");
		driver.findElement(By.name("account.firstName")).sendKeys("Shubham");
		driver.findElement(By.name("account.lastName")).sendKeys("Dandekar");
		driver.findElement(By.name("account.email")).sendKeys("sdandekar861@gmail.com");
		driver.findElement(By.name("account.phone")).sendKeys("9637191923");
		driver.findElement(By.name("account.address1")).sendKeys("Raghuji nagar");
		driver.findElement(By.name("account.address2")).sendKeys("Tadas Lay Out");
		driver.findElement(By.name("account.city")).sendKeys("Wardha");
		driver.findElement(By.name("account.state")).sendKeys("Maharashtra");
		driver.findElement(By.name("account.zip")).sendKeys("442001");
		driver.findElement(By.name("account.country")).sendKeys("India");
		
		WebElement drop=driver.findElement(By.name("account.languagePreference"));
		Select s=new Select(drop);
		s.selectByIndex(0);
		
		WebElement drop1=driver.findElement(By.name("account.favouriteCategoryId"));
		Select s1=new Select(drop1);
		s1.selectByIndex(3);
		
		driver.findElement(By.name("account.listOption")).click();
		driver.findElement(By.name("account.bannerOption")).click();
		driver.findElement(By.name("newAccount")).click();
		Thread.sleep(2000);
		//driver.close();
		
	}

}
