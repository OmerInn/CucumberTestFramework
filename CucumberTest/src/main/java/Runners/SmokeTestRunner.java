package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        features = {"src/test/java/pages"},
        glue = {"stepDefinitions"},
        dryRun = false,
        tags = "@SmokeTest"
)
public class SmokeTestRunner extends AbstractTestNGCucumberTests {
}