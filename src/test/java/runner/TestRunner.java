package runner;


import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.core.runtime.ObjectFactoryServiceLoader;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\java\\features",
        glue = "stepDefinition"


)
public class TestRunner {



}
