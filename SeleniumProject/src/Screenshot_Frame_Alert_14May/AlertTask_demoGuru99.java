package Screenshot_Frame_Alert_14May;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTask_demoGuru99 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php ");
		driver.manage().window().maximize();

		driver.findElement(By.name("cusid")).sendKeys("abcdef");
		driver.findElement(By.cssSelector("input[name='submit']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
//		Thread.sleep(2000);
//		driver.switchTo().alert().accept();
		
		System.out.println("done");
		
		
		driver.close();
		

	}

}
