package CalenderHandling_16May;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\selenium jar and chrome exe file\\chrome exe for Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		//driver.switchTo().frame(0);
		
	WebElement pfd=	driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul"));
		
		List<WebElement> ls=	pfd.findElements(By.tagName("a"));
		int hyp=ls.size();
		System.out.println(hyp);
		
		
		for(int i=1; i<hyp; i++)
		{
			String click=	Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			pfd.findElements(By.tagName("a")).get(i).sendKeys(click);
			
		}
		
	Set<String> key=driver.getWindowHandles();
		
		System.out.println(key);
		
		List<String> al=new ArrayList<>(key);
		System.out.println(al.get(1));
		
		Iterator<String> itr=al.iterator();
		while(itr.hasNext())
		{
			driver.switchTo().window(itr.next());
			String title=driver.getTitle();
			System.out.println(title);
		}
		
		
		
		
		

}
}