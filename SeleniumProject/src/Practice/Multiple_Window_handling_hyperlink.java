package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Window_handling_hyperlink {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		
	List<WebElement> ls=	driver.findElements(By.tagName("a"));
	int hy=ls.size();
	System.out.println(hy);

		WebElement uhy= driver.findElement(By.cssSelector("div[class='_37M3Pb']"));
	List<WebElement> ls1=	uhy.findElements(By.tagName("a"));
	int uh=	ls1.size();
	  System.out.println(uh);
		
		
		
		
		
		
		
		
		
		
		
		
}
}
