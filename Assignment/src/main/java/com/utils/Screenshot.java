package com.utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.TestBase;

public class Screenshot extends TestBase {

	public void takeScreenShot(String testMethodName) {
		File screenShotFile=((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
		String screenShotDestination=System.getProperty("user.dir")+"/Screenshots/"+testMethodName+".jpg";
		File finalDestination=new File(screenShotDestination);
		try {
			FileUtils.copyFile(screenShotFile, finalDestination);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
