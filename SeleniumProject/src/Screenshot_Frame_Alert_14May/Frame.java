package Screenshot_Frame_Alert_14May;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\selenium jar and chrome exe file\\chrome exe for Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/ ");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement source=driver.findElement(By.cssSelector("div#draggable"));
	    WebElement target=driver.findElement(By.cssSelector("div#droppable"));
	    
	    Actions act=new Actions(driver);
	    
	    act.dragAndDrop(source, target).build().perform();
	    
	    driver.switchTo().defaultContent();
	    
	    driver.findElement(By.xpath("//*[@id=\"menu-top\"]/li[8]/a")).click();


		
		
		
		
	
	}

}
