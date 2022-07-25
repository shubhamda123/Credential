package com.cjc.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
	
	public static WebDriver driver;
	@Given("^User navigate to MTsite$")
	public void openBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
	}
	
	@When("^user login by using username \"(.*)\"$")
	public void enterUserName(String us) 
	{
		driver.findElement(By.name("userName")).sendKeys(us);
	}
	
	@And("^Pass by given password field \"(.*)\"$")
	public void enterPassName(String ps) {
		driver.findElement(By.name("password")).sendKeys(ps);
	}
	
	@And("^Click on submit button$")
	public void clickSubmit() 
	{
		driver.findElement(By.name("submit")).click();
	}
	
	@Then("^Login success$")
	public void loginsuccess() 
	{
		System.out.println("Login success");
		//driver.close();
	}
	
	@Given("After login succes")
	public void after_login_succes()
	{
		System.out.println("After login succes");
	}

	@When("click on flight hyperlink")
	public void flighthyperlink()
	{
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/a")).click();										
	}
	
	@Then("close the browser")
	public void closeBrowser()
	{
		System.out.println("after click on flight close the broser");
		driver.close();
	}

}
