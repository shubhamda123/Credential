package Locator_28April;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locator28_April {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium jar and chrome exe file\\chrome exe for Selenium\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/HP/Desktop/index.html");
  // 1.username	                                                     
	    //driver.findElement(By.id("uid")).sendKeys("ShubhaM");
		//driver.findElement(By.name("uname")).sendKeys("SHUBHAM");
		driver.findElement(By.className("username")).sendKeys("dandekar");// we can find element using these three locators
		
	//2. password
		driver.findElement(By.id("pid")).sendKeys("123456");
	   //driver.findElement(By.name("pass")).sendKeys("shubham");
	  //driver.findElement(By.className("pass")).sendKeys("123456");
		
		
    //3.tagname-drop down box
		
		WebElement drop=driver.findElement(By.tagName("select"));
		
		Select s=new Select(drop);
		s.selectByIndex(2); // firefox   - index start from 0
		//s.selectByValue(null);
		//s.selectByVisibleText(null);
		

		driver.findElement(By.id("remem")).click();
		
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(2000);
	//4.linktext
		
		//driver.findElement(By.linkText("Password?")).click();
		
	//5. partiallinkText
		
		driver.findElement(By.partialLinkText("Pas")).click();
		
	
		//driver.close();
		
		
	}

}
