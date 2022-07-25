package Screenshot_Frame_Alert_14May;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		//accept()
//		driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
//		driver.switchTo().alert().accept();
		
		//dismiss()
//		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
//		driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
//		Thread.sleep(2000);
//		driver.switchTo().alert().dismiss();
//		
		//getText() and sendkeys
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
		driver.switchTo().alert().sendKeys("Shubham dandekar");
		Thread.sleep(2000);
      String s=driver.switchTo().alert().getText();
      driver.switchTo().alert().accept();
		
		System.out.println(s);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
