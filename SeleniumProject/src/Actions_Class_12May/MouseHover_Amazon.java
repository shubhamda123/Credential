package Actions_Class_12May;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover_Amazon {

	public static void main(String[] args) {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		Actions a=new Actions(driver);
	
//		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"))).build().perform();
//		
//		driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span")).click();
		
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span"))).build().perform();
		
		driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span/span[2]/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"icp-language-settings\"]/div[9]/div/label/i")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
