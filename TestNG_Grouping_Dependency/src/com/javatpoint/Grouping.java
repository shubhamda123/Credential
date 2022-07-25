package com.javatpoint;
import org.testng.annotations.Test;

public class Grouping {

	@Test(groups = "IT Department")
	public void java()
	{
		System.out.println("java developer");
	}
	
	@Test(groups = "IT Department")
	public void dotnet()
	{
		System.out.println("dotnet developer");
	}
	
	@Test(groups = "IT Department")
	public void tester()
	{
		System.out.println("tester");
	}

	@Test(groups="HR department")
	public void hr()
	{
		System.out.println("HR");
	}
	@Test(groups="Manufacture department")
	public void Manufacture()
	{
		System.out.println("Manufacture");
	}




}
