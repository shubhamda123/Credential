package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://javascript.info/mouse-drag-and-drop");
	driver.manage().window().maximize();
	
	driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/main/div[1]/article/div[2]/div[2]/iframe")));
	
	Actions act=new Actions(driver);
WebElement s1=	driver.findElement(By.xpath("//*[@id=\"ball\"]"));
	Thread.sleep(2000);
	act.dragAndDropBy(s1, 517, 100).build().perform();
	
	driver.switchTo().defaultContent();
	
	driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/main/div[1]/article/div[2]/div[4]/iframe")));
	WebElement s2=	driver.findElement(By.xpath("//*[@id=\"ball\"]"));
	Thread.sleep(3000);
	act.dragAndDropBy(s2, 300, 100).build().perform();
	
	driver.switchTo().defaultContent();
	
	act.moveToElement(driver.findElement(By.xpath("/html/body/div[2]"))).build().perform();
	
	
	}
	
	
}
