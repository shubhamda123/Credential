package WebTable_19May;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CrickBuzz_1stInnings_24May {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
		driver.manage().window().maximize();
		
	WebElement in1=	driver.findElement(By.xpath("//div[@id='innings_1']/child :: div[1]"));

	List<WebElement> indetails=in1.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']"));
	int count=indetails.size();
		System.out.println(count);
		
   //total run count
	  int sum=0;
	  for (int i = 0; i < count-2; i++) 
	{
		String value= in1.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(3)")).get(i).getText();
		//OR  //div[@class='cb-col cb-col-100 cb-scrd-itms']/child :: div[@class='cb-col cb-col-8 text-right text-bold']
		int runv=  Integer.parseInt(value);
		sum=sum+runv;
	}
		System.out.println("run="+sum);
		
		//extra run
		
	String erun=in1.findElement(By.cssSelector("div[class='cb-col cb-col-8 text-bold cb-text-black text-right']")).getText();
		
		int extrarun=Integer.parseInt(erun);
		int totalrun=sum+extrarun;
		System.out.println("total run="+totalrun);
		
	// verify totalrun=matchrun
		
	String mrun=	in1.findElement(By.cssSelector("div[class='cb-col cb-col-8 text-bold text-black text-right']")).getText();
	int matchruns=Integer.parseInt(mrun);
	
	System.out.println("match run="+matchruns);//124
		
		if(totalrun==matchruns)
		{
			System.out.println("runs match");
		}
		else
		{
			System.out.println("runs not match");
		}
		
		
	// ball
		
		int ball=0;
		for(int i=0;i< count-2;i++)
		{
			String value =   in1.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(4)")).get(i).getText();
			int b=Integer.parseInt(value);
			ball=ball+b;
		}
		
		System.out.println("Balls="+ball);
		
		
		//fours
		
		int fours=0;
		for(int i=0;i< count-2;i++)
		{
			String value =   in1.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(5)")).get(i).getText();
			int b=Integer.parseInt(value);
			fours=fours+b;
		}
		
		System.out.println("fours="+fours);
		
		
		//sixes
		int six=0;
		for(int i=0;i< count-2;i++)
		{
			String value =   in1.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(6)")).get(i).getText();
			int s=Integer.parseInt(value);
			six=six+s;
		}
		
		System.out.println("six="+six);
		
		System.out.println("-------bowler---------");
		
		
	// bowler details  first find path
		
	WebElement bowler=	driver.findElement(By.xpath("//div[@id='innings_1']/child :: div[4]"));
	List<WebElement> lsb=bowler.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms ']"));
		
	int count2=	 lsb.size();
	System.out.println("no of bowlers="+count2);//6
		
	
		int bover=0;
		for(int i=0; i<count2; i++)
		{
		  String value=bowler.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms '] :nth-child(2)")).get(i).getText();
		  int bo=Integer.parseInt(value);  
		  bover=bover+bo; 
		}
		
		System.out.println("bowler overs="+bover);
		
		
		int overballs=bover*6;
		//verify balls
		
		if(ball==overballs)
		{
			System.out.println("over match");
		}
		else
		{
			System.out.println("over not match");
		}
		
		
		driver.close();
		
		
		
		
		

	}

}
