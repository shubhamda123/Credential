package com.cjc.step;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {
	
	@Before
	public void befores()
	{
		System.out.println("Before Scenario");
	}

	@After
	public void afters()
	{
		System.out.println("After Scenario");
	}

	
	
}
