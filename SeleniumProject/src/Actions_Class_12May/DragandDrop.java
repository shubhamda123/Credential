package Actions_Class_12May;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		driver.switchTo().frame(0);
		
	WebElement source=driver.findElement(By.cssSelector("div#draggable"));
	WebElement target=driver.findElement(By.cssSelector("div#droppable"));
	
	act.dragAndDrop(source, target).build().perform();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
