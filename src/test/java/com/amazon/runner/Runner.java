package com.amazon.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.amazon.baseclass.BaseClass1;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\amazon\\feature", glue = "com\\amazon\\stepdefinition")


public class Runner {

	public static WebDriver driver;
	
	@BeforeClass
	
	public static void set() {

		driver = BaseClass1.getBrowser("chrome");

	}
	

	
	
	
	
	
	
}
