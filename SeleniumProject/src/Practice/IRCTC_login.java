package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTC_login {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class='text-center col-xs-12']/button")).click();
		driver.findElement(By.xpath("//div[@class='row col-sm-12 h_head1']//child :: a")).click();
		
		
		
		
		
		
		
		
		
		
		
	}
}
