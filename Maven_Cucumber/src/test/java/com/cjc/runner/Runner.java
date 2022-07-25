package com.cjc.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

    @RunWith(Cucumber.class)
	@CucumberOptions(features = {"src//test//resources//Features"}, glue = {"com.cjc.step"},tags= "@abc or @abc1" ,
	monochrome=true,
	plugin = {"pretty","html:target/index.html"})
	public class Runner {
    	

    }
