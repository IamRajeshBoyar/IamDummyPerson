package cucumberStepDefinationFile;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\cucumberFeatureFile", 
	glue={"cucumberStepDefinationFile","hooksPractice"}, 
	dryRun = false,
	plugin = {"html:target/webReports.html", "json:target/jsonReport.json", "junit:target/xmlReport.xml"},
	tags =  "@medical or @engineer"
		)
public class TestRunnerFile {

}
