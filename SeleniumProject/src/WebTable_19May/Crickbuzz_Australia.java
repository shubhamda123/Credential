package WebTable_19May;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Crickbuzz_Australia {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/17400/ind-vs-aus-2nd-test-australia-test-tour-of-india-2017\r\n");
		driver.manage().window().maximize();
		
		WebElement prun1=driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[3]/div[3]"));
		System.out.println("1st Player : "+prun1.getText());
		
		WebElement prun2=driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[4]/div[3]"));
		System.out.println("2nd Player : "+prun2.getText());
		
		WebElement prun3=driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[5]/div[3]"));
		System.out.println("3rd Player : "+prun3.getText());
		
		WebElement prun4=driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[6]/div[3]"));
		System.out.println("4th Player : "+prun4.getText());
		
		WebElement prun5=driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[7]/div[3]"));
		System.out.println("5th Player : "+prun5.getText());
		
		WebElement prun6=driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[8]/div[3]"));
		System.out.println("6th Player : "+prun6.getText());
		
		WebElement prun7=driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[9]/div[3]"));
		System.out.println("7th Player : "+prun7.getText());
		
		WebElement prun8=driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[10]/div[3]"));
		System.out.println("8th Player : "+prun8.getText());
		
		WebElement prun9=driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[11]/div[3]"));
		System.out.println("9th Player : "+prun9.getText());
		
		WebElement prun10=driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[12]/div[3]"));
		System.out.println("10th Player : "+prun10.getText());
		
		WebElement prun11=driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[13]/div[3]"));
		System.out.println("11th Player : "+prun11.getText());
		
		WebElement prun12=driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[14]/div[2]"));//run
		WebElement prun13=driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[14]/div[3]"));//in brackets
		System.out.println("extras : "+prun12.getText()+prun13.getText());
		
		WebElement prun14=driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[15]/div[2]"));
		WebElement prun15=driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[14]/div[3]"));
		System.out.println("total : "+prun14.getText()+prun15.getText());
		
		
		
		//WebElement prun=driver.findElement(By.xpath(""));
		//driver.close();
	}
		
		
		
		
		
		
		
}
