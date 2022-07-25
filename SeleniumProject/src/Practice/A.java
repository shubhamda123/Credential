package Practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php\r\n");
			
		driver.manage().window().maximize();
	
	    driver.findElement(By.name("firstname")).sendKeys("Shubham");
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Dandekar");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("sdandekar861@gmail.com");
		
		WebDriverWait w=new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='reg_email_confirmation__']"))).sendKeys("sdandekar861@gmail.com");
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("Shubham@123");
		
	WebElement drop=	driver.findElement(By.cssSelector("select[id='day']"));
		Select s=new Select(drop);
		s.selectByVisibleText("20");
		
		WebElement drop1=	driver.findElement(By.cssSelector("select[id='month']"));
		Select s1=new Select(drop1);
		s1.selectByVisibleText("May");
		
		
		WebElement drop2=	driver.findElement(By.cssSelector("select[id='year']"));
		Select s2=new Select(drop2);
		s2.selectByVisibleText("1997");
		
		//driver.findElement(By.xpath("//label[@for='u_0_7_ND']/following-sibling :: input")).click();
		driver.findElement(By.cssSelector("input[value='2']")).click();
		
		driver.findElement(By.cssSelector("button[name='websubmit']")).click();
		System.out.println("done");
		
		driver.navigate().to("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("shubham@gmail.com");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("789456");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("D:\\facebook1.jpeg"));
		
		System.out.println("screenshot done");
		
		
		
		
   }
}
