package com.cjc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class MercuryTours {

	public static void main(String[] args) throws FindFailed, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium jar and chrome exe file\\chrome exe for Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");	
		driver.manage().window().maximize();
		
		Screen sc=new Screen();
		
		Pattern user=new Pattern("D:\\sikuli images\\ss\\username.PNG");
		Pattern pass=new Pattern("D:\\sikuli images\\ss\\password.PNG");
		Pattern log=new Pattern("D:\\sikuli images\\ss\\login.PNG");
		
		
		sc.type(user,"QQQQ");
		sc.type(pass,"qqqq");
		
		sc.click(log);
		
		
	}

}
