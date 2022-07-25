package com.cjc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

public class Practice {
	
	public WebDriver driver;
	
 
   @Test(dataProvider = "data")
   public void testmethod(String username,String password) {
	
	System.out.println("OPen browser in BeforeSuiteee");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com/login");

	driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(username);
	driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(password);
	driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
	String title=driver.getTitle();
	Assert.assertEquals(title, "Demo Web Shop");
	System.out.println("title is verified");
	driver.quit();
   }
	@DataProvider(name="data")
	public Object[][] getData()
	{
		return new Object[][]
				{
					new Object[] {"shu123456@gmail.com","shubham123"},
					new Object[] {"shubham@gmail.com","123456"},
					new Object[] {"shubhu@gmail.com","456789"}				
				};
	} 
}
