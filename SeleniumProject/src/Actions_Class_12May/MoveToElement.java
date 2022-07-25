package Actions_Class_12May;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://mrbool.com/");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		//moveToElement()
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"headermenudesktop\"]/ul/li/a"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"headermenudesktop\"]/ul/li/ul/li[2]/a")).click();
		System.out.println("done");
		

		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
