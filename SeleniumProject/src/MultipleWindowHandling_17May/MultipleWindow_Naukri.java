package MultipleWindowHandling_17May;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow_Naukri {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();

	WebElement pfd= driver.findElement(By.xpath("//*[@id=\"Footer\"]/div[1]/div/div/div[2]"));
        List<WebElement> pfdls=  pfd.findElements(By.tagName("a"));        
               int pfdhy=   pfdls.size();
            System.out.println(pfdhy);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		for (int i = 0; i < pfdhy; i++)
		{
		     String clicklink=Keys.chord(Keys.CONTROL,Keys.ENTER);
		     pfd.findElements(By.tagName("a")).get(i).sendKeys(clicklink);  
			Thread.sleep(2000);
		}
		
		
		 Set<String> keys= driver.getWindowHandles();
		System.out.println(keys);
		
		ArrayList<String> al=new ArrayList<String>(keys);
	    String singlekey=al.get(1);
		System.out.println(singlekey);
		
		Iterator<String> itr=al.iterator();
		while(itr.hasNext())
		{
		  driver.switchTo().window(itr.next());
			Thread.sleep(2000);
			
			String title= driver.getTitle();
			System.out.println(title);
			
			if(title.equalsIgnoreCase("Info Edge (India) Limited"))
			{
				driver.findElement(By.xpath("/html/body/div[9]/div[1]/div[1]/div/div[2]/a")).click();
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
