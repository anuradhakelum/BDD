package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
        features = "src/test/java/feature/test.feature",
        glue = {"stepDefinitions"}
)
public class Runner extends AbstractTestNGCucumberTests {

}
