package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cricbuzz {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/46611/ban-vs-sl-1st-test-sri-lanka-tour-of-bangladesh-2022");
		driver.manage().window().maximize();

     	WebElement in1=	driver.findElement(By.xpath("//div[@id='innings_1']/child :: div[1]"));
		
	    List<WebElement> lsrows=  in1.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']"));
	    int rows=lsrows.size();
		System.out.println("first innings rows="+rows);
		
		// palyer run count
		int run=0;
		for(int i=0; i<rows-2; i++)
		{
		  String value=in1.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(3)")).get(i).getText();
		  int r=Integer.parseInt(value);
		  run=run+r;
		}
		
		System.out.println("run="+run);
		
		String trun= in1.findElement(By.cssSelector("div[class='cb-col cb-col-8 text-bold cb-text-black text-right']")).getText();
		int totalrun=Integer.parseInt(trun);
		
		int totalruns=totalrun+run;
		System.out.println("total runs="+totalruns);
		
		
		//balls
		
		int balls=0;
		for(int i=0; i<rows-2; i++)
		{
		  String value=in1.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(4)")).get(i).getText();
		  int b=Integer.parseInt(value);
		  balls=balls+b;
		}
		System.out.println("balls="+balls);
		
		//fours
		int fours=0;
		for(int i=0; i<rows-2; i++)
		{
		  String value=in1.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(5)")).get(i).getText();
		  int b=Integer.parseInt(value);
		  fours=fours+b;
		}
		System.out.println("fours="+fours);
		
	//sixes
		int sixes=0;
		for(int i=0; i<rows-2; i++)
		{
		  String value=in1.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(6)")).get(i).getText();
		  int b=Integer.parseInt(value);
		  sixes=sixes+b;
		}
		System.out.println("sixes="+sixes);
		
		
		
// BOWLER details
		
	WebElement bowler=	driver.findElement(By.xpath("//div[@id='innings_1']/child :: div[4]"));
		List<WebElement> lsb= bowler.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms ']"));
	int bowlist=lsb.size();
		System.out.println("bowler rows="+bowlist);
	
		//bowler overs	
		int overs=0;
		for(int i=0; i<bowlist;i++)
		{
		 String value= bowler.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms '] :nth-child(2)")).get(i).getText();
		  int o=Integer.parseInt(value);
		  overs=overs+o;
		}
		
		
		System.out.println("bowler overs="+overs);
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
