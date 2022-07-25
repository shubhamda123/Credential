package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_mercuryTours {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		
	//	driver.findElement(By.xpath("//td[@width='112'][1]/child :: input[@name='userName']")).sendKeys("shubhu12346");
		driver.findElement(By.xpath("//table[@style='margin:5px;']/tbody[1]/tr[2]/td[2]/child :: input")).sendKeys("shubhudddd");
		driver.findElement(By.xpath("//table[@style='margin:5px;']/tbody[1]/tr[3]/td[2]/child :: input")).sendKeys("1234657");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
