package com.cashkaro.pageLibrary.homePage;

import org.openqa.selenium.By;
import com.relevantcodes.extentreports.LogStatus;

import com.cashkaro.testbase.TestBase;

public class signInFrame extends TestBase{
	
	public void verifyLoginFromSignIn (String emailIDData,String passwordData,String expMessage ) throws Exception {
	//String BrowserRunType = Repository.getProperty("browser");

		String stepResult =  setText ("cashkaro.signInframe.emailTxt",emailIDData);
		fnCheckAndLogExtentResult(stepResult,"Enter email - " + emailIDData,"Email entered","Email not entered");
        stepResult = setTextAction("cashkaro.signInframe.passwordTxt",passwordData);
 		//stepResult =  setText ("cashkaro.signInframe.passwordTxt",passwordData);
		fnCheckAndLogExtentResult(stepResult,"Enter password - " + passwordData,"Password entered","Password not entered");
		stepResult = clickWebElement ("cashkaro.signInframe.SignInButton");
		fnCheckAndLogExtentResult(stepResult,"Click Sign IN button","Button clicked","Unable to click button");
//		/cashkaro.signInframe.loginMessage
		elemWait(getWebElement("cashkaro.signInframe.loginMessage"));
		String textValue = getText("cashkaro.signInframe.loginMessage");
		fnExtentCompareString (textValue,expMessage,test,"Validate message for invalid email - "+emailIDData,"Message appears correctly","Message not correct");
		System.out.println("message - " + textValue );
		
		
		clearText("cashkaro.signInframe.emailTxt");
		
	}
	
	public void closeSignInFrame() throws InterruptedException
	{
		switchDefault();
		String stepResult = clickWebElement ("cashkaro.signInframe.closeIcon");
		Thread.sleep(700);
		fnCheckAndLogExtentResult(stepResult,"Close SignIn frame","Frame closed","Unable to close frame");
	}
	
	public void verifyValidLoginFromSignIn (String emailIDData,String passwordData,String expMessage ) throws Exception {
		String stepResult =  setText ("cashkaro.signInframe.emailTxt",emailIDData);
		fnCheckAndLogExtentResult(stepResult,"Enter email - " + emailIDData,"Email entered","Email not entered");
		//stepResult =  setText("cashkaro.signInframe.passwordTxt",passwordData);
		stepResult =  setTextAction("cashkaro.signInframe.passwordTxt",passwordData);
		fnCheckAndLogExtentResult(stepResult,"Enter password - " + passwordData,"Password entered","Password not entered");
		stepResult = clickWebElement ("cashkaro.signInframe.SignInButton");
		fnCheckAndLogExtentResult(stepResult,"Click Sign IN button","Button clicked","Unable to click button");
		Thread.sleep(700);
		//switchDefault();
		elemWait(getWebElement("cashkaro.userHomePage.welcomeMessage"));
		String textValue = getText("cashkaro.userHomePage.welcomeMessage");
		fnExtentCompareString (textValue,expMessage,test,"Validate that the user's home page opens","User's home page opens","User's home page does not open");
		System.out.println("message - " + textValue );
		
	}
	
	
	
	
	
	
	
	
	

}
