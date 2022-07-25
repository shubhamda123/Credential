package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task {
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		String t1=driver.getTitle();
		System.out.println("title 1="+t1);
		
		//driver.navigate().refresh();
		
		driver.navigate().to("https://www.facebook.com/");
		String t2=driver.getTitle();
		System.out.println("title 2="+t2);
		
		driver.navigate().back();
		System.out.println("title3="+driver.getTitle());
		
		driver.navigate().to("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_19f32o2up6_e&adgrpid=64607481971&hvpone=&hvptwo=&hvadid=486454059767&hvpos=&hvnetw=g&hvrand=8056047432969474895&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=20462&hvtargid=kwd-297775402051&hydadcr=5650_2175716&gclid=EAIaIQobChMI2q_T3sC49wIVw8qWCh0GwQ1BEAAYASAAEgIr7PD_BwE");
		System.out.println("title4"+driver.getTitle());
		
		driver.navigate().back();
		System.out.println("title5="+driver.getTitle());
		
		
		
		
		
	}

}
