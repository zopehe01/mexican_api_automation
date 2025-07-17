package com.mexican.api.listeners;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {


    private static final Logger logger = LogManager.getLogger(TestListener.class);


    public void onTestStart(ITestResult result) {
        logger.info(result.getMethod().getMethodName() + "Test started!!!");
    }

    public void onTestSuccess(ITestResult result) {
        logger.info(result.getMethod().getMethodName() +" Test Passed");
    }

    public void onTestFailure(ITestResult result) {
        logger.error(result.getMethod().getMethodName(), result.getThrowable()+ " Test Failed ");
    } 

    public void onTestSkipped(ITestResult result) {
        logger.info(result.getMethod().getMethodName(), result.getThrowable()+ " Test Skipped ");
    }

    public void onFinish(ITestContext context) {
        logger.info("Test Suite Finished!!!");
  }
}
