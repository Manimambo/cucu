package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.base.Base_class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature\\catchcucu.feature", 
glue = "com.stepdefi", plugin = "pretty")
public class Runner extends Base_class {

	public static WebDriver driver;

	@BeforeClass
	public static void stepUp() {
		driver = browser_Launch("chrome");

	}

	@AfterClass
	public static void tearDown() {
		driver.quit();
	}

}
