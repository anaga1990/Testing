package cucumber.test.managers;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/com/api/features", glue = { "com.api.glues" }, 
plugin = {"json:target/jsonReports/cucumber-resports.json"},
		monochrome = true)
public class TestRunner {

}
