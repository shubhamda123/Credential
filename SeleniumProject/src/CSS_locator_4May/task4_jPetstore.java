package CSS_locator_4May;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class task4_jPetstore {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\selenium jar and chrome exe file\\chrome exe for Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Shubhamdand");//tag,attribute
		driver.findElement(By.cssSelector("input[name^='pass']")).sendKeys("12345678");//password- prefix
		driver.findElement(By.cssSelector("input[name$='Password']")).sendKeys("12345678");//suffix
		driver.findElement(By.cssSelector("input[name*='ount']")).sendKeys("Shubham");//contain
		driver.findElement(By.cssSelector("input[name*='last']")).sendKeys("Dandekar");//contain
		driver.findElement(By.cssSelector("input[name^='account.e']")).sendKeys("sdandekar86@gmail.com");//prefix
		driver.findElement(By.cssSelector("input[name^='account.ph']")).sendKeys("9637191923");
		driver.findElement(By.cssSelector("input[name^='account.ad']")).sendKeys("Tadas Lay out");//address1
		driver.findElement(By.cssSelector("input[name$='ess2']")).sendKeys("Pipri meghe");//address2
		driver.findElement(By.cssSelector("input[name$='city']")).sendKeys("Wardha");//suffix
		driver.findElement(By.cssSelector("input[name$='state']")).sendKeys("Maharashtra");
		driver.findElement(By.cssSelector("input[name$='zip']")).sendKeys("442001");
		driver.findElement(By.cssSelector("input[name$='country']")).sendKeys("India");
		
	WebElement drop=driver.findElement(By.cssSelector("select[name$='languagePreference']"));
		Select s=new Select(drop);
		s.selectByIndex(0);
		
		WebElement drop1=driver.findElement(By.cssSelector("select[name$='CategoryId']"));
		Select s1=new Select(drop1);
		s1.selectByIndex(2);
		
		driver.findElement(By.cssSelector("input[name$='listOption']")).click();
		driver.findElement(By.cssSelector("input[name$='bannerOption']")).click();
     	driver.findElement(By.cssSelector("input[value='Save Account Information']")).click();
     	Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[href^='/actions/A']")).click();
		driver.findElement(By.cssSelector("input[name^='user']")).sendKeys("Shubhamdand");
		driver.findElement(By.cssSelector("input[name^='pass']")).sendKeys("12345678");
		driver.findElement(By.cssSelector("input[name^='sig']")).click();
		
	

	}

}
