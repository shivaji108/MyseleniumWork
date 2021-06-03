package com.selenium.listener;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{
	
	public void onTestStart(ITestResult result) {	
		System.out.println("Test Started : " + result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Got Successful : " + result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test Got Failed : " + result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Got Skipped : " + result.getName());
		
	}

	
	

}
