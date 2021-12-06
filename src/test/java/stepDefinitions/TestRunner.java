package stepDefinitions;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pageObjectModel.SeleniumBase1;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/", glue = {"stepDefinitions"}, dryRun = false, monochrome = true, plugin = {"pretty","html:target/cucumber"})
public class TestRunner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
		driver = SeleniumBase1.browserLaunch();
		
		
	}

}
