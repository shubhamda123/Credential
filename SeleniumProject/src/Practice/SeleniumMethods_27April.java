package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethods_27April {


	public static void main(String[] args) {
	
		System.out.println("hello world");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");//1
		
		
		String title=driver.getTitle();     //2
		System.out.println("title of page="+title);
		
		String url=driver.getCurrentUrl();  //3
		System.out.println("page url="+url);
		
		String pagesource=driver.getPageSource();//4
		System.out.println("page source= "+pagesource);
		
		driver.manage().window().maximize();//5
		
		driver.navigate().to("https://www.javatpoint.com/");//6
		
		String title1=driver.getTitle();
		System.out.println(title1);
		
		driver.navigate().back();
	    driver.navigate().forward();
		
		
	      // driver.close();//7;
	       driver.quit();
		
	}

}
