package WebTable_19May;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Crickbuzz_SP {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
		
	    driver.manage().window().maximize();
	  /*  WebElement in1=driver.findElement(By.xpath("//div[@id='innings_1']/child :: div[1]"));
		String s1=in1.getText();
		System.out.println(s1);*/
	
		List<WebElement> pname = driver.findElements(By.xpath("//div[@class='cb-col cb-col-27 ']"));
		int pcount=pname.size();
		System.out.println("Total player "+ pcount);
		  for(int i=1;i<=11;i++)
		  {
			 String names= driver.findElements(By.xpath("//div[@class='cb-col cb-col-27']")).get(i).getText();
                   
			  System.out.println(names);
		
		  }
			List<WebElement> prun = driver.findElements(By.xpath("//div[@class='cb-col cb-col-8 text-right text-bold']"));
			
			 for(int i=1;i<=11;i++)
			  {
					 String runs= driver.findElements(By.xpath("//div[@class='cb-col cb-col-8 text-right text-bold']")).get(i).getText();
	                   
				  System.out.println(runs);
			
			  }
			
			System.out.println("***************************");
		WebElement ply1nm=driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[3]/div[1]"));
		WebElement ply1=driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[3]/div[3]"));
		WebElement plyy1=driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[3]/div[4]"));
		System.out.println("name  " + ply1nm.getText() + " run " + ply1.getText() + " ball " + plyy1.getText());
		
		
		WebElement ply2nm=driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[4]/div[1]"));
		WebElement ply2=driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[4]/div[3]"));
		WebElement plyy2=driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[4]/div[4]"));
		System.out.println("name  " + ply2nm.getText() + " run " + ply2.getText() + " ball " + plyy2.getText());
		
		WebElement ply3nm=driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[5]/div[1]"));
		WebElement ply3=driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[5]/div[3]"));
		WebElement plyy3=driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[5]/div[4]"));
		System.out.println("name  " + ply3nm.getText() + " run " + ply3.getText() + " ball " + plyy3.getText());
		
		WebElement ply4nm=driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[6]/div[1]"));
		WebElement ply4=driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[6]/div[3]"));
		WebElement plyy4=driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[6]/div[4]"));
		System.out.println("name  " + ply4nm.getText() + " run " + ply4.getText() + " ball " + plyy4.getText());
		
		WebElement ply5nm=driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[7]/div[1]"));
		WebElement ply5=driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[7]/div[3]"));
		WebElement plyy5=driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[7]/div[4]"));
		System.out.println("name  " + ply5nm.getText() + " run " + ply5.getText() + " ball " + plyy5.getText());
		
		WebElement ply6nm=driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[8]/div[1]"));
		WebElement ply6=driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[8]/div[3]"));
		WebElement plyy6=driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[8]/div[4]"));
		System.out.println("name  " + ply6nm.getText() + " run " + ply6.getText() + " ball " + plyy6.getText());
		
		WebElement ply7nm=driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[9]/div[1]"));
		WebElement ply7=driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[9]/div[3]"));
		WebElement plyy7=driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[9]/div[4]"));
		System.out.println("name  " + ply7nm.getText() + " run " + ply7.getText() + " ball " + plyy7.getText());
		
		WebElement ply8nm=driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[10]/div[1]"));
		WebElement ply8=driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[10]/div[3]"));
		WebElement plyy8=driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[10]/div[4]"));
		System.out.println("name  " + ply8nm.getText() + " run " + ply8.getText() + " ball " + plyy8.getText());
		
		WebElement ply9nm=driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[11]/div[1]"));
		WebElement ply9=driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[11]/div[3]"));
		WebElement plyy9=driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[11]/div[4]"));
		System.out.println("name  " + ply9nm.getText() + " run " + ply9.getText() + " ball " + plyy9.getText());
		
		WebElement ply10nm=driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[12]/div[1]"));
		WebElement ply10=driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[12]/div[3]"));
		WebElement plyy10=driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[12]/div[4]"));
		System.out.println("name  " + ply10nm.getText() + " run " + ply10.getText() + " ball " + plyy10.getText());
		
		WebElement ply11nm=driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[13]/div[1]"));
		WebElement ply11=driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[13]/div[3]"));
		WebElement plyy11=driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[13]/div[4]"));
		System.out.println("name  " + ply11nm.getText() + " run " + ply11.getText() + " ball " + plyy11.getText());
			
			
			
			
			
			
			
	}
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


