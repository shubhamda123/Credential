package Cookies;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/b/?_encoding=UTF8&node=20391471031&pf_rd_r=J3ZKB97G4CZBJD1TH3P2&pf_rd_p=4811f6f2-6ba1-4eb5-b27a-30d04e6efce4&pd_rd_r=251f87a8-e9d7-4346-9e8f-1cb415e3094f&pd_rd_w=r4Prz&pd_rd_wg=6I90E&ref_=pd_gw_unk");
		driver.manage().window().maximize();

	Set<Cookie>	cokie= driver.manage().getCookies();
		
	int c=cokie.size();
		System.out.println(c);
		
		for(Cookie co:cokie)
		{
			System.out.println("name="+co.getName());
			System.out.println(co.getDomain());
			System.out.println(co.getValue());
			System.out.println(co.getPath());
			System.out.println(co.getExpiry());
			System.out.println(co.isHttpOnly());
			System.out.println(co.isSecure());
			System.out.println("------------------");
		}
		
//     	Iterator<Cookie>itr=cokie.iterator();
//		while(itr.hasNext())
//		{
//		    Cookie c1=	itr.next();
//		    System.out.println(c1.getName());
//		    System.out.println(c1.getDomain());
//		    System.out.println(c1.getValue());
//		    System.out.println(c1.getPath());
//		    System.out.println(c1.getExpiry());
//		    System.out.println(c1.isHttpOnly());
//		    System.out.println(c1.isSecure());
//		    
//		    
//		}
		
		driver.manage().deleteCookieNamed("csm-hit");
		Set<Cookie> d = driver.manage().getCookies();
		int cookie = d.size();
		System.out.println("all cookie after delete=" + cookie);

		
	
	}

}
