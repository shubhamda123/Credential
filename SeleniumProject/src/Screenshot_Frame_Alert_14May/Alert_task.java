package Screenshot_Frame_Alert_14May;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_task {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"alertButton\"]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
//		driver.findElement(By.xpath("//*[@id=\"timerAlertButton\"]")).click();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.switchTo().alert().accept();
//		
		
		driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		
		driver.findElement(By.xpath("//*[@id=\"promtButton\"]")).click();
		driver.switchTo().alert().sendKeys("Shubham");
		Thread.sleep(2000);
	String s=	driver.switchTo().alert().getText();
	driver.switchTo().alert().accept();
		System.out.println(s);
		
		
		
		

		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
