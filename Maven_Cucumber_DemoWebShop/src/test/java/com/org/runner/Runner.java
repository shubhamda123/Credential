package com.org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src//test//resources//Features"}, glue = {"com.org.step"},
tags = "@Register or @Login or @AddToCart", 
monochrome = true,
plugin = {"pretty","html:target/index.html"}) //report
public class Runner {
	

}
