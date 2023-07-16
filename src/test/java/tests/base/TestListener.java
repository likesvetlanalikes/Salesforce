package tests.base;

import com.github.dockerjava.api.model.ContainerMount;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.printf("Test testStarted: %s \n",result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.printf("Test success: %s \n",result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.printf("Test failure: %s \n",result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.printf("Test skipped: %s \n",result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.printf("Test Failed But Within Success Percentage: %s \n",result.getName());

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
