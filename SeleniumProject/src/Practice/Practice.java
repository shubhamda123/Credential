package Practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Practice {

	public static void main(String[] args) throws InterruptedException{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Computers")).click();
		
		
		
		
		
		
		
		
		
	

   }
}
