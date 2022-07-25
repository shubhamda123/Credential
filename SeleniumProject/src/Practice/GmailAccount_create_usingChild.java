package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GmailAccount_create_usingChild {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?hl=en&continue=https%3A%2F%2Fmail.google.com&service=mail&ec=GAlAFw&flowName=GlifWebSignIn&flowEntry=AddSession");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@jsname='WjL7X']/div/button/div[1]/following-sibling :: *[3]")).click();
		driver.findElement(By.xpath("//span[@class='VfPpkd-StrnGf-rymPhb-pZXsl']/following-sibling :: *")).click();
		
		driver.findElement(By.xpath("//div[@class='Xb9hP'][1]/child :: input")).sendKeys("Shubham");
		
		//driver.findElement(By.xpath("//div[@class='SdBahf DbQnIe ia6RDd']/div[1]/div[2]/div/div[1]/div/div[1]/child :: input")).sendKeys("Dandekar");
		driver.findElement(By.xpath("//div[@class='Xb9hP']/child :: input[@id='lastName']")).sendKeys("Dandekar");
		driver.findElement(By.xpath("//div[@class='Xb9hP']/child :: input[@id='username']")).sendKeys("sdandekar861@gmail.com");
		driver.findElement(By.xpath("//div[@class='Xb9hP']/child :: input[@name='Passwd']")).sendKeys("123456");
		
		
		
		
		
		
		
		
		
		
		
	}

}
