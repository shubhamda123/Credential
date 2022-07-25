package DataDrivenExcel_Concept;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven {

	@Test(dataProvider = "logindata")
	public void loginDWS(String username,String password) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium jar and chrome exe file\\chrome exe for Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(username);
		
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(password);
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		
	String userN=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).getText();
	Assert.assertEquals(username, userN);
	System.out.println(username+" is verified");
	driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
	Thread.sleep(2000);
	//driver.quit();
	
	}
	

	@DataProvider(name="logindata")
	public String[][] getData() throws IOException
	{
		String filename="D:\\java practical eclips\\Excel_File\\src\\DataDrivenExcel_Concept\\DataDrivenFramework.xlsx";
		
		int ttlRow=	ReadExcelData.rowCount(filename, "Sheet1");
		int ttlCol= ReadExcelData.colCount(filename, "Sheet1");
		
		String data[][]=new String[ttlRow-1][ttlCol];

		for(int i=1;i<ttlRow;i++)//rows =1,2
		{
			for(int j=0;j<ttlCol;j++)//col=0, 1,2
			{

				data[i-1][j]=ReadExcelData.cellValue(filename,"Sheet1", i,j);
			}

		}
		return data;
		
		
	}
	
	
	
}
