package WebTable_19May;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricBuzz_2ndInnings_24May {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
		driver.manage().window().maximize();
		
	 WebElement in2=driver.findElement(By.xpath("//div[@id='innings_2']/child :: div[1]"));
	   List<WebElement> details2= in2.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']"));
	  int count= details2.size();
      System.out.println("no of rows in2="+count);
		
      
      int sum=0;
	  for (int i = 0; i < count-3; i++) 
	{
		String value= in2.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(3)")).get(i).getText();
		//OR  //div[@class='cb-col cb-col-100 cb-scrd-itms']/child :: div[@class='cb-col cb-col-8 text-right text-bold']
		int runv=  Integer.parseInt(value);
		sum=sum+runv;
	}
		System.out.println("run="+sum);
      
      
   WebElement Erun= in2.findElement(By.cssSelector("div[class='cb-col cb-col-8 text-bold cb-text-black text-right']"));
           String exrun=  Erun.getText();
           int extrarun=Integer.parseInt(exrun);
             
           int totalrun=sum+extrarun;
           System.out.println("total run="+totalrun);
      
      //ball
      int ball=0;
      for(int i=0; i<count-3; i++)
      {
    	String value=in2.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(4)")).get(i).getText();
    	  int b=Integer.parseInt(value);
    	  ball=ball+b;
      }
      
      System.out.println("ball="+ball);
      
      //fours
      int fours=0;
      for(int i=0; i<count-3; i++)
      {
    	String value=in2.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(5)")).get(i).getText();
    	  int f=Integer.parseInt(value);
    	  fours=fours+f;
      }
      
      
      System.out.println("fours="+fours);
      
     //sixes
     
      int sixes=0;
      for(int i=0; i<count-3; i++)
      {
    	String value=in2.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(6)")).get(i).getText();
    	  int f=Integer.parseInt(value);
    	  sixes=sixes+f;
      }
      
      
      System.out.println("sixes="+sixes);
      
      
      
      
      
      
      
	//	driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
