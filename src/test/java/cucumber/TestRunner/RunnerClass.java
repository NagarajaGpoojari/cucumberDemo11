package cucumber.TestRunner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(features="FeatureFiles",
					glue="cucumber.StepDefinitions",
					dryRun = false,
					monochrome = true,
					plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/extendreport.html"})
	public class RunnerClass {

	}



