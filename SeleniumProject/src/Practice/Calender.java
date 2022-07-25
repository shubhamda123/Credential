package Practice;

import java.net.MulticastSocket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
	
         List<WebElement> ls=driver.findElements(By.tagName("a"));
		int hy=ls.size();
		System.out.println(hy);
		
	     WebElement	fd= driver.findElement(By.cssSelector("div[id='gf-BIG']"));
	     List<WebElement> fls=   fd.findElements(By.tagName("a"));
		int fhy =fls.size();
	      System.out.println(fhy);
	      
	 WebElement pfd=   driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul"));
	    List<WebElement> pfls = pfd.findElements(By.tagName("a"));
	    int phy=  pfls.size();
	    System.out.println(phy);
	    
	    
	    for(int i=1; i<phy; i++)
	    {
	       String clicklinl=  Keys.chord(Keys.CONTROL,Keys.ENTER);
	       
	       pfd.findElements(By.tagName("a")).get(i).sendKeys(clicklinl);
	       Thread.sleep(2000);
	    }
	    
	    
	     Set<String> keys= driver.getWindowHandles();
	    System.out.println(keys);
	    
	    ArrayList<String> al=new ArrayList<String>(keys);
	    
	   String singlek= al.get(1);
	   System.out.println(singlek);
	    
	   Iterator<String> itr=al.iterator();
	   while(itr.hasNext())
	   {
		   driver.switchTo().window(itr.next());
		   Thread.sleep(2000);
		   
		  String title= driver.getTitle();
		   System.out.println(title);
		   if(title.equalsIgnoreCase("REST API Tutorial"))
		   {
			   driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/ul/ul/li[1]/a")).click();
		   }
		   
	   }
	   
	   
	   
	   
	   
	   
	   
	   
		driver.close();

	}

}
