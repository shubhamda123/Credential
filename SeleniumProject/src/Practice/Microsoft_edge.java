package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Microsoft_edge {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.edge.driver", "D:\\Microsoft edge exe file\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);  // 2 sec hold screen
		
		
		
		
		
		
		
		
		//driver.close();
		
		
		
		
		
		
	}

}
