package by.epam.testautomation.calc.listener;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("on Test Failure" + iTestResult.getName());
    }
}
