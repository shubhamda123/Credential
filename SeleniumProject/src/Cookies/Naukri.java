package Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();

		Set<Cookie> cookies = driver.manage().getCookies();

		int csize = cookies.size();
		System.out.println(csize);
		
		 for(Cookie a :cookies) {
			  
			  System.out.println("cookie details");
			  System.out.println("name="+a.getName());
			  System.out.println("domain="+a.getDomain());
			  System.out.println("class="+a.getClass());
			  System.out.println("value="+a.getValue());
			  System.out.println("path="+a.getPath());
			  System.out.println("expiry="+a.getExpiry());
			  System.out.println("ishttponly"+a.isHttpOnly());
			  System.out.println("secure"+a.isSecure());
			  
			  System.out.println("--------------"); 
			  
		 }
		
		 
		driver.manage().deleteCookieNamed("_gcl_au");
		Set<Cookie> d = driver.manage().getCookies();
		int cookie = d.size();
		System.out.println("all cookie after delete=" + cookie);

		
	}

}
