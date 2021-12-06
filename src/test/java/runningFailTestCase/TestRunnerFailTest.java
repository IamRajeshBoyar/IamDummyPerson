package runningFailTestCase;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="@target/re-runtest.txt", glue="runningFailTestCase")
public class TestRunnerFailTest {

}
