package Xpath_29_april;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Relative_using_msedge {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "D:\\Microsoft edge exe file\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("sdandekar861@gmail.com");
		driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).click();
		
		
		
		

	}

}
