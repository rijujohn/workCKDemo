package com.cashkaro.testScripts;

import org.testng.annotations.Test;

import com.cashkaro.extent.ExtentManager;
import com.cashkaro.pageLibrary.homePage.forgotPasswordFrame;
import com.cashkaro.pageLibrary.homePage.homePage;
import com.cashkaro.testbase.TestBase;
import com.relevantcodes.extentreports.ExtentReports;

public class validateHomePageItems extends TestBase {
	
	homePage HomePage = new homePage();
	forgotPasswordFrame ForgotPasswordFrame = new forgotPasswordFrame();
	//Riju
	ExtentReports rep = ExtentManager.getInstances();

	
	@Test(priority = 1)
	public void openHomePage() throws Exception
	{
		init();
		HomePage.validateTheFrameItems();
		
	}
	

}
