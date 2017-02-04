package com.cashkaro.testScripts;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cashkaro.excelReader.ExcelDataConfig;
import com.cashkaro.extent.ExtentManager;
import com.cashkaro.pageLibrary.homePage.homePage;
import com.cashkaro.pageLibrary.homePage.signInFrame;
import com.cashkaro.pageLibrary.joinFreeNowPage.joinFreeMainPage;
import com.cashkaro.testbase.TestBase;
import com.relevantcodes.extentreports.ExtentReports;


public class testJoinFree extends TestBase {

	
		homePage HomePage = new homePage();
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
			test = rep.startTest("Test4JoinFree_Step1_NavigateJoinFree");
			HomePage.clickJoinFreeButton();
			rep.endTest(test);
			rep.flush();
		}
		
		

		
				
		@Test(priority = 3,dependsOnMethods={"openJoinFreePage"},dataProvider = "joinFreeTestData")
		public void testTheLogin(String NameData,String emailData,String passwordData) throws Exception
		{ //  if (!emailData.contains("VALID"))
		  //  { 
			
			test = rep.startTest("Test4JoinFree_Step2_ValidateLoginCombinations");
			JoinFreeMainPage.validateJoinFree(NameData, emailData, passwordData);
			rep.endTest(test);
			rep.flush();
		   // /}
		}
			

		


		@Test(priority = 4,dependsOnMethods={"openHomePage"}) 
		public void tearDown()
		{
		  closeBrowser();
		   
		}
		
		
		
		@ DataProvider(name = "joinFreeTestData")
		public Object [][] passLoginData() throws Exception
		{   ExcelDataConfig excelObj = new ExcelDataConfig(System.getProperty("user.dir") + "//src//test//java//com//cashkaro//testData//JoinFreeTest.xlsx"); 
		    int rows = excelObj.getRowCount(0);
	        System.out.println("rowe -- " + rows );
		    Object [][] data = new Object [5][3];
		    for (int i= 0 ; i<= rows;i++ )  
	        {
	        	data[i][0] = excelObj.getData(0, i, 0);
	        	data[i][1] = excelObj.getData(0, i, 1);
	        	data[i][2] = excelObj.getData(0, i, 2);
	        }
			
			return data;
		}
		
}
