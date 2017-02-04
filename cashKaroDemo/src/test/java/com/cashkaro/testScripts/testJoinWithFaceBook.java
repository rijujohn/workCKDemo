package com.cashkaro.testScripts;

import org.testng.annotations.Test;

import com.cashkaro.extent.ExtentManager;
import com.cashkaro.pageLibrary.homePage.homePage;
import com.cashkaro.pageLibrary.homePage.signInFrame;
import com.cashkaro.pageLibrary.joinFreeNowPage.joinFreeMainPage;
import com.cashkaro.testbase.TestBase;
import com.relevantcodes.extentreports.ExtentReports;
import com.cashkaro.pageLibrary.homePage.forgotPasswordFrame;






public class testJoinWithFaceBook extends TestBase {
	
	
	homePage HomePage = new homePage();
	signInFrame SignInFrame = new signInFrame();
	joinFreeMainPage JoinFreeMainPage = new joinFreeMainPage();
	ExtentReports rep = ExtentManager.getInstances();
	


	@Test(priority = 1)
	public void openHomePage() throws Exception
	{
		init();
	}

	@Test(priority = 2,dependsOnMethods={"openHomePage"})
	public void openJoinFreePage() throws Exception
	{   
		test = rep.startTest("Test3JoinFreeFaceBook_Step1_NavigateJoinFree");
		HomePage.clickJoinFreeButton();
		rep.endTest(test);
		rep.flush();
	}
	
	@Test(priority = 3,dependsOnMethods={"openJoinFreePage"})
	public void openJoinFB() throws Exception
	{   
		test = rep.startTest("Test3JoinFreeFaceBook_Step2_NavigateJoinWithFB");
		JoinFreeMainPage.clickJoinWithFaceBook();
		rep.endTest(test);
		rep.flush();
	}

	@Test(priority = 4,dependsOnMethods={"openJoinFB"})
	public void validateFBLinks() throws Exception
	{   
		test = rep.startTest("Test3JoinFreeFaceBook_Step3_FillData");
		JoinFreeMainPage.fillDataFaceBook("test", "123", "Incorrect email address or phone number");
		JoinFreeMainPage.validateFBCreateNewAndForgotLinks();
		rep.endTest(test);
		rep.flush();
	}
	
	@Test(priority = 5,dependsOnMethods={"openJoinFB"})
	public void tearDown()
	{
	closeBrowser();
	   
	}
}
