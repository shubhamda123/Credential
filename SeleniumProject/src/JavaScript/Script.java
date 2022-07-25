package JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\selenium jar and chrome exe file\\chrome exe for Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Thread.sleep(2000);
		driver.get("http://www.uitestpractice.com/Students/Index");
	//	Thread.sleep(2000);
		driver.manage().window().maximize();
			
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
	//1.type text
		js.executeScript("document.getElementById(\"Search_Data\").value='Mahendra';");
		
	//2.getAttribute
//		String jname="return document.getElementById(\"Search_Data\").value;";
//		String name=(String)js.executeScript(jname);
//		System.out.println(name);
		//Thread.sleep(2000);
	//3. click on button
//		WebElement element=driver.findElement(By.cssSelector("input[value='Find']"));
//		js.executeScript("arguments[0].click();", element);
//		
//		Thread.sleep(2000);
	//4. refresh
		//js.executeScript("history.go(0)");
	
		
	//5. get domain	name
		String domain=js.executeScript("return document.domain;").toString();
		System.out.println("Domain: "+domain);
	
	//6. draw border around element
		WebElement element1=driver.findElement(By.cssSelector("input[value='Find']"));
		js.executeScript("arguments[0].style.border='3px solid red';", element1);
	
	//7. getTitle
		String title=js.executeScript("return document.title;").toString();
		System.out.println("title: "+title);
		
	//8. getUrl
		String url=js.executeScript("return document.URL;").toString();
		System.out.println("URL: "+url);
		
	//9 zoom webpage
	//	js.executeScript("document.body.style.zoom='50%';");
		
	//10 get heigh and width of webpage	
	String height=js.executeScript("return window.innerHeight;").toString();
	String width=js.executeScript("return window.innerWidth;").toString();
		System.out.println("height: "+height);
		System.out.println("width: "+width);
		
	//11 scroll vertically 	
		js.executeScript("window.scrollBy(0,document.body.scrollHeight);");//upto end page
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight);"); // page up
		
		
	//12. alert
	//	js.executeScript("alert('alert is created.');");
		 
	//13. To navigate
		js.executeScript("window.location='https://www.facebook.com/';");
		
		System.out.println("success");
		
	   
	      }
}

