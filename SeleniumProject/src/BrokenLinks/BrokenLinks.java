package BrokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\selenium jar and chrome exe file\\chrome exe for Selenium\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");	
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> ls= driver.findElements(By.tagName("a"));
		
		int links=ls.size();
		System.out.println("no of links: "+links);
		
		for(int i=0; i<links; i++)
		{
			//by using href attribute we can get url of required links
			WebElement element= ls.get(i);
			
			String url=element.getAttribute("href");
			//System.out.println(i+"="+url);
			
			URL link=new URL(url);
			//create a connection using url object 'link'
			HttpURLConnection httpConn=(HttpURLConnection) link.openConnection();
			
			//Thread.sleep(2000);
			//established connection
			httpConn.connect();
			
			int rescode=httpConn.getResponseCode();//return response if res code is above 400: broken link
			
			if(rescode>=400)
			{
				System.out.println(url+" - is broken link");
			}
			else
			{
				System.out.println(url+" - is valid link");
			}
			
		}
	
	}

}
