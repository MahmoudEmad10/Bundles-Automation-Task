package TestRunner;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.After;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.openqa.selenium.WebDriver;

@RunWith(Cucumber.class)
@CucumberOptions (
        features = {"src/test/resources/features"},
        glue = {"StepDefinitions"}
)
public class TestRunner {

}
