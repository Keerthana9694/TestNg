package org.example;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

    @Override
    public void onTestSuccess(ITestResult result) {
       System.out.println("passed from listerner");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("failed from listerner" + " " + result.getName());
    }
}
