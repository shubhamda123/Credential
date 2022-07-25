package Assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

	
	
	@Test
	public void m1()
	{
		SoftAssert sa=new SoftAssert();
		System.out.println("1");
		sa.assertEquals(10, 10);
		System.out.println("2");
		sa.assertEquals(20, 20);
		System.out.println("3");
		sa.assertEquals(10, 40);
		System.out.println("4");
		sa.assertEquals("cjc", "cjc");
		System.out.println("5");
		sa.assertAll();
	
	}
	

	@Test
	public void m2()
	{System.out.println("-------------------");
		SoftAssert sa=new SoftAssert();
		System.out.println("1");
		sa.assertEquals(10, 10);
		System.out.println("2");
		sa.assertEquals(20, 20);
		System.out.println("3");
		sa.assertEquals(40, 40);
		System.out.println("4");
		sa.assertEquals("cjc", "cjc");
		System.out.println("5");
		sa.assertAll();

	}
	
	
	
	
	
	
	
	
	
	
	
}
