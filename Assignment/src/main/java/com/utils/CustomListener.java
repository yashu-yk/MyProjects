package com.utils;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.base.TestBase;
import com.relevantcodes.extentreports.LogStatus;

public class CustomListener extends TestBase implements ITestListener{
	
	
	public void onTestFailure(ITestResult result){
		
		System.out.println("Test Failed");
		try {
		new Screenshot().takeScreenShot(result.getMethod().getMethodName());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
