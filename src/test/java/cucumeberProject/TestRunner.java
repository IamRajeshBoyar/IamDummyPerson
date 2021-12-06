package cucumeberProject;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = {"src\\test\\java\\cucumberProjectFeatureFile\\cucumber.feature"}, glue={"CucumeberProject","hooks"},
		plugin= {"html:report/htmlReport",
				
				"rerun:target/failtest.txt"
				
		},
		tags ="@taggedHooks"
		
		)
public class TestRunner {
	
	

}
