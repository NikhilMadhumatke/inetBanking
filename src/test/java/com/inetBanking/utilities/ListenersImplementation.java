package com.inetBanking.utilities;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.inetBanking.testCases.BaseClass;



public class ListenersImplementation implements ITestListener {
	
	public void onTestFailure(ITestResult result) {
		String data=result.getMethod().getMethodName();
		
		EventFiringWebDriver edriver=new EventFiringWebDriver(BaseClass.sDriver);
		File src=edriver.getScreenshotAs(OutputType.FILE);
		
		try {
			File des =new File("./Screenshots/"+data+".png");
			FileUtils.copyFile(src, des);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}
