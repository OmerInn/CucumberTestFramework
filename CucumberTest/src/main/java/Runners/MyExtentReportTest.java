package Runners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@CucumberOptions(
        features = {"src/test/java/pages"},
        glue = {"stepDefinitions"},
        dryRun = false
)
public class MyExtentReportTest extends AbstractTestNGCucumberTests {

    private ExtentReports extentReports;
    private ExtentTest extentTest;

    @BeforeMethod
    public void setup() {
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent-report.html");
        extentReports = new ExtentReports();
        extentReports.attachReporter(htmlReporter);
    }

    @Test
    public void myTest() {
        extentTest = extentReports.createTest("My Test", "This test is for demonstration purposes.");
        extentTest.log(Status.INFO, "Test is starting...");

        extentTest.log(Status.INFO, "This is a simulated error.");
    }

    @AfterMethod
    public void tearDown() {
        extentReports.flush();
    }
}

