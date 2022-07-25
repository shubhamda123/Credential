package com.cjc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class DempParallel {
	
	@Test
	public void m1()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium jar and chrome exe file\\chrome exe for Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("chrome thread="+Thread.currentThread().getId());
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void m2()
	{
		System.setProperty("webdriver.edge.driver", "D:\\selenium jar and chrome exe file\\chrome exe for Selenium\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		System.out.println("edge thread="+Thread.currentThread().getId());
		driver.get("https://www.facebook.com/");
	}
	
	
	
	
	

}
