package child_Parent_xpath_may_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_WebShop_using_ChildParent {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class='gender'][1]/child :: input")).click();
	//	driver.findElement(By.xpath("//div[@class='page-body']/div[2]/div[2]/div[2]/child :: input")).sendKeys("Shubham");
		driver.findElement(By.xpath("//div[@class='inputs'][2]/child :: input")).sendKeys("Shubham");
		driver.findElement(By.xpath("//div[@class='inputs']/child :: input[@id='LastName']")).sendKeys("Dandekar");
		driver.findElement(By.xpath("//div[@class='inputs'][4]/child :: input")).sendKeys("sdandekar861@gmail.com");
		driver.findElement(By.xpath("//div[@class='inputs']/child :: input[@id='Password']")).sendKeys("Shubham@123");
		driver.findElement(By.xpath("//div[@class='inputs']/child :: input[@id='ConfirmPassword']")).sendKeys("Shubham@123");
		driver.findElement(By.xpath("//div[@class='buttons']/child :: input[@id='register-button']")).click();
		//   //form/div/div[2]/div[4]/child :: input----submit button
		//login-  sdandekar861-  Shubham@123	
		
		Thread.sleep(3000);		
		driver.findElement(By.xpath("//li[2]/child :: a[@class='ico-login']")).click();
		driver.findElement(By.xpath("//div[@class='inputs'][1]/child :: input")).sendKeys("sdandekar861@gmail.com");
		driver.findElement(By.xpath("//div[@class='inputs'][2]/child :: input")).sendKeys("Shubham@123");
		driver.findElement(By.xpath("//div[@class='buttons']/child :: input[@value='Log in']")).click();
		
		//add to cart
		driver.findElement(By.xpath("//li[@class='inactive'][1]/child :: a")).click();
	  //driver.findElement(By.xpath("//div[@class='product-grid']/div[1]/div/div[2]/div[3]/div[2]/child :: input")).click();
		driver.findElement(By.xpath(" //input[@value='Add to cart']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(" //div[@class='product-grid']/div[3]/div/div[2]/div[3]/div[2]/child :: input")).click();
		Thread.sleep(2000);
		
	//shopping caart-driver.findElement(By.xpath("//span[@class='cart-label']")).click();
		//driver.findElement(By.className("cart-label")).click();
		driver.findElement(By.linkText("Shopping cart")).click();
		
		driver.findElement(By.xpath("//div[@class='terms-of-service']/child :: input")).click();
		driver.findElement(By.xpath("//div[@class='checkout-buttons']/child :: button")).click();
		Thread.sleep(2000);
	WebElement drop=driver.findElement(By.xpath("//option[@value='41']/parent :: select"));
		Select s=new Select(drop);
		s.selectByVisibleText("India");
		
		
		
		
		
		
		
		
	}

}
