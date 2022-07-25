package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\selenium jar and chrome exe file\\chrome exe for Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/index.html");
		//driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement un=driver.findElement(By.cssSelector("label[for^='una']"));
		String s=un.getText();
		System.out.println(s);
		
//		WebElement un1=driver.findElement(By.xpath("//label[3]"));
//		System.out.println(un1.getText());
		
//	  WebElement un=	driver.findElement(By.cssSelector("input#email"));
//		//un.sendKeys("ShubhamDandekar");
//		
//	  String s=	un.getAttribute("value");
//      System.out.println(s);
//		
//		Thread.sleep(2000);
//	//	un.clear();
//		
//		//
//	//	un.submit();
//		System.out.println(un.isDisplayed());                        		
//		
		
		WebElement un1=driver.findElement(By.cssSelector("#remem"));
		
		//un1.click();
		System.out.println(un1.isSelected());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
