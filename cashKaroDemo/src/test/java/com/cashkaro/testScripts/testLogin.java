package com.cashkaro.testScripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cashkaro.excelReader.ExcelDataConfig;
import com.cashkaro.extent.ExtentManager;
import com.cashkaro.pageLibrary.homePage.homePage;
import com.cashkaro.pageLibrary.homePage.signInFrame;
import com.cashkaro.testbase.TestBase;
import com.relevantcodes.extentreports.ExtentReports;



public class testLogin extends TestBase {
	
	homePage HomePage = new homePage();
	signInFrame SignInFrame = new signInFrame();
	ExtentReports rep = ExtentManager.getInstances();


	@Test(priority = 1)
	public void openHomePage() throws Exception
	{
		init();
	}

	@Test(priority = 2,dependsOnMethods={"openHomePage"})
	public void openSignInPage() throws Exception
	{   
		test = rep.startTest("Test2UserLogin_Step1_OpenSignInPage");
		
		
		HomePage.clickSignINButton();
		rep.endTest(test);
		rep.flush();
	}
	
	@Test(priority = 3,dependsOnMethods={"openSignInPage"},dataProvider = "loginTestData")
	public void testTheLogin(String emailData,String passwordData,String loginMessage) throws Exception
	{   if (!emailData.contains("VALID"))
	    { 
		test = rep.startTest("Test2UserLogin_Step2_VerifyLogin");
		SignInFrame.verifyLoginFromSignIn(emailData, passwordData,loginMessage);
		
		rep.endTest(test);
		rep.flush();
	    }
	}
		
	@Test(priority = 4,dependsOnMethods={"openSignInPage"})
	public void closeSignINFrame() throws Exception
	{   
		test = rep.startTest("Test2UserLogin_Step3_CloseSignInFrame");
		SignInFrame.closeSignInFrame();
		rep.endTest(test);
    	rep.flush();
	}
	
	@Test(priority = 5,dependsOnMethods={"openHomePage"},dataProvider = "loginTestData")
	public void validSignINFrame(String emailData,String passwordData,String loginMessage) throws Exception
	{   
	    if (emailData.contains("VALID"))
	    {
		String emailDataMain = emailData.replaceAll("VALID", "");
		test = rep.startTest("Test2UserLogin_Step4_ValidLogin");
		HomePage.clickSignINButton();
		SignInFrame.verifyValidLoginFromSignIn(emailDataMain, passwordData, loginMessage);
		rep.endTest(test);
    	rep.flush();
	    }
	}

	@Test(priority = 6,dependsOnMethods={"openHomePage"}) 
	public void tearDown()
	{
	   closeBrowser();
	   
	}
	
	
	
	@ DataProvider(name = "loginTestData")
	public Object [][] passLoginData() throws Exception
	{   ExcelDataConfig excelObj = new ExcelDataConfig(System.getProperty("user.dir") + "//src//test//java//com//cashkaro//testData//LoginTest.xlsx"); 
	    int rows = excelObj.getRowCount(0);
        System.out.println("rowe -- " + rows );
	    Object [][] data = new Object [3][3];
	    for (int i= 0 ; i<= rows;i++ )  
        {
        	data[i][0] = excelObj.getData(0, i, 0);
        	data[i][1] = excelObj.getData(0, i, 1);
        	data[i][2] = excelObj.getData(0, i, 2);
        }
		
		return data;
	}
	

	

}

