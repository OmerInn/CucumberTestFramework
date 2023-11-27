package Runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/pages"},
        glue = {"stepDefinitions"},
        dryRun = false
)

public class GeneralTestsRunner extends AbstractTestNGCucumberTests {
}
