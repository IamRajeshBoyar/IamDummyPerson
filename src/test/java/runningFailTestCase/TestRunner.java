package runningFailTestCase;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\cucumberProjectFeatureFile\\testFail.feature", glue = "runningFailTestCase",

plugin = {"rerun:target/re-runtest.txt"}
		
		
		)
public class TestRunner {

}
