package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class B {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
		driver.manage().window().maximize();
		
		WebElement in1=	driver.findElement(By.xpath("//div[@id='innings_1']/child :: div[1]"));

		List<WebElement> indetails=in1.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']"));
		int count=indetails.size();
			System.out.println(count);
			
		
		 int sum=0;
		  for (int i = 0; i < count-2; i++) 
		{
			String value= in1.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-itms']/child :: div[@class='cb-col cb-col-8 text-right text-bold']")).get(i).getText();
			int runv=  Integer.parseInt(value);
			sum=sum+runv;
		}
			System.out.println(sum);
			
		
		
		
		
	}

}
