package practiceStepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/praticeFeatureFile/Hooks.feature", glue={"practiceStepDefination"}, dryRun = false,plugin = { "pretty","html:report","com.cucumber.listener.ExtentCucumberFormatter:Report/extendReport.html"})
public class HooksRunner {

}
