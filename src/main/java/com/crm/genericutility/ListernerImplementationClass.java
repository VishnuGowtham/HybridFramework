package com.crm.genericutility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListernerImplementationClass implements ITestListener {

	ExtentTest test;
	ExtentReports report;

	@Override
	public void onTestStart(ITestResult result) {
		// Step 3: create a Test method during the test execution starts
		test = report.createTest(result.getMethod().getMethodName());

	}

	@Override
	public void onTestSuccess(ITestResult result) {

		// Step4: log the pass method
		test.log(Status.PASS, result.getMethod().getMethodName());

	}

	@Override
	public void onTestFailure(ITestResult result) {
		// Step 6: log fail method , take screenshot, attach the screenshot to extent
		// report, add exception log
		
		String methodName = result.getMethod().getMethodName();
		test.log(Status.FAIL, methodName);
		test.log(Status.FAIL, result.getThrowable());
		String path = null;

		try {
			
			path = new WebDriverUtility()
				              .takeScreenshot(BaseClass.sDriver, methodName);
			
		} catch (Throwable e) {
			
			e.printStackTrace();
		}

		test.addScreenCaptureFromPath(path);
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// Step 5 : log the skip method(test case name and exception logs)
		String methodName = result.getMethod().getMethodName();
		test.log(Status.SKIP, methodName);
		test.log(Status.SKIP, result.getThrowable());

	}

	@Override
	public void onStart(ITestContext context) {
		// Step 1: Extent report configuration
		ExtentSparkReporter htmlReporter = new ExtentSparkReporter(
				"./extentReport" + new JavaUtility().getSystemDateAndTime());

		htmlReporter.config().setDocumentTitle("Comcast automation execution report");
		htmlReporter.config().setReportName("Regression execution report");
		htmlReporter.config().setTheme(Theme.STANDARD);

		// Step 2: Attach the physical report and do the system configuration
		report = new ExtentReports();
		report.attachReporter(htmlReporter);
		report.setSystemInfo("OS", "Windows 10");
		report.setSystemInfo("Environment", "Testing environment");
		report.setSystemInfo("URL", "http://localhost:8888");
		report.setSystemInfo("Reporter Name", "VishnuGowtham");

	}

	@Override
	public void onFinish(ITestContext context) {
		
		report.flush();

	}

}
