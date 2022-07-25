package Actions_Class_12May;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		WebElement doubleclick= driver.findElement(By.cssSelector("button[ondblclick='myFunction()']"));
		WebElement rightclick= driver.findElement(By.cssSelector("span[class='context-menu-one btn btn-neutral']"));
		Actions a=new Actions(driver);
		
	//	a.contextClick(rightclick).build().perform(); // rightclick
		//Thread.sleep(2000);
		a.doubleClick(doubleclick).build().perform();  // double click

		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
