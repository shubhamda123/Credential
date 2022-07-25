package MultipleWindowHandling_17May;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlink_RahulShettyAcademy {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
	//all hyperlink	
	List<WebElement> ls=driver.findElements(By.tagName("a"));
		
	 int allhyperlink =ls.size();
	 System.out.println("all hyperlink="+allhyperlink);
	 
	//footer hyperlink
    WebElement fd= driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]"));
		
	 List<WebElement> ls1=  fd.findElements(By.tagName("a"));
		
	int fdh=ls1.size();
		System.out.println("footer hyperlink="+fdh);
		
		//particular footer element hyperlink
		WebElement pfe=driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul"));
		
		         List<WebElement> pfehl=  pfe.findElements(By.tagName("a"));
		          int pfehyperlink=  pfehl.size();
		System.out.println("particular footer element hyperlink="+pfehyperlink);
		
		driver.close();	

	}

}
