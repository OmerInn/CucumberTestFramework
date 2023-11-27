package Runners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
    @Override
    public void onStart(ITestContext context) {
        System.out.println("TestNG süreci başladı. Test sayısı: " + context.getAllTestMethods().length);
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("TestNG süreci tamamlandı.");
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test başladı: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test başarılı: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test başarısız: " + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test atlandı: " + result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("Belirli bir başarı yüzdesi içinde başarısız olan test: " + result.getName());
    }
}
