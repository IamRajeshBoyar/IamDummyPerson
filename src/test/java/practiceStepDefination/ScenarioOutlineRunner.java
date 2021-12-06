package practiceStepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/praticeFeatureFile/ScenarioOutline.feature", glue = {"practiceStepDefination"}, dryRun = false)
public class ScenarioOutlineRunner {

}
