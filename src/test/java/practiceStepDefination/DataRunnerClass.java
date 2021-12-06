package practiceStepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/praticeFeatureFile/DataTable.feature"}, glue = {"practiceStepDefination"})
public class DataRunnerClass {
	
	

}
