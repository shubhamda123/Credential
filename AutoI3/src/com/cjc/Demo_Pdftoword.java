package com.cjc;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Pdftoword {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://smallpdf.com/pdf-to-word");
		driver.manage().window().maximize();

	//	driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();// ilovepdf.com - choose file
	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[2]/button/div/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__cond-30\"]/div/div/div/div/div/div/form/label/div/div[2]/div/button[1]/span")).click();
		
		Thread.sleep(6000);
		Runtime.getRuntime().exec("D:\\AutoIT&editor\\Autoit_exe\\pdfconvert.exe");
		System.out.println("upload successfully");
		
		
		//driver.close();
		
	}

}
