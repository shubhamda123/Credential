package CalenderHandling_16May;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2_RedBus {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();

		
		while(! driver.findElement(By.cssSelector("[class='rb-calendar'] [class='monthTitle']")).getText().contains("Dec"))
		{
			System.out.println("while loop");
			driver.findElement(By.cssSelector("[class='rb-calendar'] [class='next']")).click();
		}
		
	List<WebElement> ls= driver.findElements(By.cssSelector("td[class='we day']"));

	int count=ls.size();
		System.out.println(count);
		
		for (int i = 0; i < count; i++) 
		{
			System.out.println("for loop");
		String s=driver.findElements(By.cssSelector("td[class='we day']")).get(i).getText();
			
			if(s.equalsIgnoreCase("25"))
			{
				driver.findElements(By.cssSelector("td[class='we day']")).get(i).click();
			}
			
		}
		
		
		
		
	
	}

}
