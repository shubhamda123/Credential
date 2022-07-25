package CalenderHandling_16May;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "D:\\selenium jar and chrome exe file\\chrome exe for Selenium\\chromedriver.exe"
		 * ); WebDriver driver=new ChromeDriver();
		 * driver.get("http://demo.automationtesting.in/Datepicker.html");
		 * driver.manage().window().maximize();
		 * 
		 * driver.findElement(By.xpath("//*[@id=\"datepicker1\"]")).click();
		 * 
		 * while(!driver.findElement(By.
		 * cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] [class='ui-datepicker-month']"
		 * )).getText().contains("December")) { driver.findElement(By.
		 * cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] [class='ui-icon ui-icon-circle-triangle-e']"
		 * )).click(); }
		 * 
		 * List<WebElement> ls=
		 * driver.findElements(By.cssSelector("a[class='ui-state-default']")); int
		 * count= ls.size(); System.out.println(count);
		 * 
		 * for(int i=0; i<count; i++) { String
		 * s=driver.findElements(By.cssSelector("a[class='ui-state-default']")).get(i).
		 * getText();
		 * 
		 * if(s.equalsIgnoreCase("20")) {
		 * driver.findElements(By.cssSelector("a[class='ui-state-default']")).get(i).
		 * click(); }
		 * 
		 * }
		 * 
		 */
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int no=sc.nextInt();
		
		int n1=0, n2=1, sum=0;
		
		System.out.print(n1+" "+n2);
		for(int i=0;i<no;i++)
		{
			sum=n1+n2;
			System.out.print(" "+sum);
			n1=n2;
			n2=sum;
		}
		
		
		
	}
	
}
