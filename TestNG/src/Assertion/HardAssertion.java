package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;


public class HardAssertion {
	
	@Test
	public void m1()
	{
		System.out.println("1");
		Assert.assertEquals(10, 10);
		System.out.println("2");
		Assert.assertEquals("cjc", "cjc");
		System.out.println("3");
		Assert.assertEquals(20, 20);
		System.out.println("4");
		Assert.assertEquals(10, 40);
		System.out.println("5");
		Assert.assertEquals(10, 10);
		System.out.println("6");
		
	}
	
	@Test
	public void m2()
	{
		System.out.println("7");
		Assert.assertEquals(10, 10);
		System.out.println("8");
		Assert.assertEquals("cjc", "cjc");
		System.out.println("9");
		Assert.assertEquals(20, 20);
		System.out.println("10");
		Assert.assertEquals(40, 40);
		System.out.println("11");
		Assert.assertEquals(10, 10);
		System.out.println("12");
		
	}
	
	
	
	
	
	
	
	
	
	

}
