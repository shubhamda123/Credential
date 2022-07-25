package com.org.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoStepDef {
	
	public static WebDriver driver;
	@Given("User navigate to DemoWebShop")
	public void OpenBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
	}

	@When("User click on male gender radio button")
	public void gender() 
	{
	  driver.findElement(By.xpath("//*[@id=\"gender-male\"]")).click();
	}

	@And("^User enter firstname is \"(.*)\"$")
	public void firstname(String fn) 
	{
		 driver.findElement(By.name("FirstName")).sendKeys(fn);
	}

	@And("User enter lastname is \"(.*)\"$")
	public void lastname(String ln) 
	{
		 driver.findElement(By.name("LastName")).sendKeys(ln);
	}

	@And("User enter email is {string}")
	public void email(String em)
	{
		 driver.findElement(By.name("Email")).sendKeys(em);
	}

	@And("User enter password is {string}")
	public void password(String ps)
	{
		 driver.findElement(By.name("Password")).sendKeys(ps);
	}

	@And("User enter confirm password is {string}")
	public void confirm_password(String cps)
	{
		 driver.findElement(By.name("ConfirmPassword")).sendKeys(cps);
	}

	@And("click on register button")
	public void click_on_register_button() 
	{
		 driver.findElement(By.name("register-button")).click();
	}

	@Then("registered successfully")
	public void registered_successfully()
	{
		System.out.println("registered successfully");
	}

	@Given("User navigate to Demo webshop login page {string}")
	public void demowebshop_loginpage(String navigateUrl)
	{
	   driver.navigate().to(navigateUrl);
	}

	@When("User enter the email {string}")
	public void user_enter_the_email(String email)
	{
	    driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(email);
	}

	@And("User enter password {string}")
	public void user_enter_password(String pass) 
	{
		 driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(pass);
	}

	@And("Click on login  button")
	public void click_on_login_button() 
	{
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
	}

	@Then("Login successfully")
	public void login_successfully()
	{
		System.out.println("Login successfully");
	}

	@Given("User have to click on Apparel&Shoes")
	public void click_on_apparel_shoes() 
	{
	  driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[4]/a")).click();
	}

	@When("User click on add to cart item")
	public void addtoCartItem() throws InterruptedException 
	{
	  driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[2]/div/div[2]/div[3]/div[2]/input")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-28\"]")).click();
	  driver.navigate().back();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[3]/div/div[2]/div[3]/div[2]/input")).click();	  
	}

	@And("User click on shopping cart option")
	public void shopping_cart_option() throws InterruptedException 
	{
		Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
	}
	@Then ("user click on logout hyperlink")
	public void logout()
	{
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
	}
	
}
