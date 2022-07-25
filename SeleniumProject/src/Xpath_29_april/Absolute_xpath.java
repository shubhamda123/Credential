package Xpath_29_april;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Absolute_xpath {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/HP/Desktop/index.html");
	 //1.absolute xpath
		
		driver.findElement(By.xpath("/html/body/form/div[1]/input[1]")).sendKeys("Shubhamdd");
		
	    driver.findElement(By.xpath("/html/body/form/div[1]/input[2]")).sendKeys("123456");
		
		WebElement drop=driver.findElement(By.xpath("//html//body//form//div[1]//select"));	
		
		Select s=new Select(drop);
	  //   s.selectByIndex(2);
           s.selectByVisibleText("Firefox");

		
	
	}

}
