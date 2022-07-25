package CSS_locator_4May;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllCss_locator {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium jar and chrome exe file\\chrome exe for Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/index.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input#uid")).sendKeys("Shubham");// tag and id
		driver.findElement(By.cssSelector("input.pass")).sendKeys("123456");//tag and className
		
		WebElement drop=driver.findElement(By.cssSelector("select[id='browser']"));// tag,attribute and value
		Select s=new Select(drop);
		s.selectByValue("ie");
		
		driver.findElement(By.cssSelector("input.rem[id='remem']")).click(); // tag,classname,attribute and value
		driver.findElement(By.cssSelector("button.login[type='submit']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[href='forgetpass']")).click();
		
		
		
		
		
		
		
		
		
		
	}

}
