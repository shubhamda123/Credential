package Screenshot_Frame_Alert_14May;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frane_basketBall {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://javascript.info/mouse-drag-and-drop");
		driver.manage().window().maximize();
		
		WebElement frame=driver.findElement(By.className("code-tabs__result"));
		 Actions a=new Actions(driver);
		driver.switchTo().frame(frame);
		
	WebElement source=driver.findElement(By.cssSelector("img#ball"));
		
	WebElement target=driver.findElement(By.cssSelector("img#gate"));	
	
   
		a.dragAndDrop(source, target).build().perform();
		
		System.out.println("done");
		
		
	
		
		

	}

}
