package com.cashkaro.pageLibrary.joinFreeNowPage;

//import com.cashkaro.testScripts.File;
import com.cashkaro.testbase.TestBase;
import com.relevantcodes.extentreports.LogStatus;

public class joinFreeMainPage extends TestBase {
	
	public void clickJoinWithFaceBook() throws Exception
	{   

				
		
		Thread.sleep(500);
		
		//stepResult = setText ("cashkaro.joinNowPage.joinWithFBFirstName",emailData);
		elemWait(getWebElement("cashkaro.joinNowPage.joinWithFBButton"));
		String stepResult = clickWebElement ("cashkaro.joinNowPage.joinWithFBButton");
		fnCheckAndLogExtentResult(stepResult,"Verify Join free page opens,click the Join with Facebook button","Page opens and Clicked on Join with FB button","Unable to click on Join with FB button");
	
	}
	
	public void fillDataFaceBook(String emailData,String password,String errorMessage  ) throws Exception
	{   
		///String emailData = "sdd";
		//String password = "sdd";
		//String errorMessage = "Incorrect email address or phone number";
		
		Thread.sleep(200);
		switchToPopUpFrame();
		String stepResult = setText ("cashkaro.joinNowPage.faceBookPopUp.eMailTxt",emailData);
		fnCheckAndLogExtentResult(stepResult,"Enter email in email text field.Enter value - " + emailData,"Email entered","Unable to enter Email");

		stepResult = setText ("cashkaro.joinNowPage.faceBookPopUp.passwordTxt",emailData);
		fnCheckAndLogExtentResult(stepResult,"Enter password in password text field.Enter value - " + password,"Passwrod entered","Unable to enter password");
		
		
		stepResult = clickWebElement ("cashkaro.joinNowPage.faceBookPopUp.SubmitButton");
		fnCheckAndLogExtentResult(stepResult,"Click Submit button","Button clicked on","Unable to click on button");
		
		Thread.sleep(100);
		elemWait(getWebElement("cashkaro.joinNowPage.faceBookPopUp.loginErrorMessage"));
		String textValue = getText("cashkaro.joinNowPage.faceBookPopUp.loginErrorMessage");
		System.out.println ("value is " + textValue );
		fnExtentCompareString (textValue,errorMessage,test,"Validate message for invalid Facebook account - "+emailData,"Message appears correctly","Message not correct");
		
	}
	
	
	public void validateFBCreateNewAndForgotLinks()
	{
		String stepResult = clickWebElement ("cashkaro.joinNowPage.faceBookPopUp.createNewAccount");
		fnCheckAndLogExtentResult(stepResult,"Click Create New Account button","Button clicked on","Unable to click on button");
		
		stepResult = switchToPopUpBrowserIndex (2);
		fnExtentCompareString (stepResult,"Sign up for Facebook | Facebook",test,"Validate the create new account Facebook page opens","Page opens correctly","Page does not open");
//kjkSign up for Facebook | Facebook
//		kjkForgotten Password | Can't Log In | Facebook
		switchToPopUpBrowserIndex (1);
		stepResult = clickWebElement ("cashkaro.joinNowPage.faceBookPopUp.forgottenAccount");
		stepResult = switchToPopUpBrowserIndex (3);
		fnExtentCompareString (stepResult,"Forgotten Password | Can't Log In | Facebook",test,"Validate the forgot account Facebook page opens","Page opens correctly","Page does not open");
		
		
		
		//closeUpBrowserIndex(3);
		//fnCheckAndLogExtentResult(stepResult,"Close Forgot account browser","Browser closed","Unable to close browser");
		
		//closeUpBrowserIndex(2);
		//fnCheckAndLogExtentResult(stepResult,"Close Create account browser","Browser closed","Unable to close browser");

		//closeUpBrowserIndex(1);
		//fnCheckAndLogExtentResult(stepResult,"Close Account with FB popup ","Browser closed","Unable to close browser");

		
		
	}
	
	public void validateJoinFree(String fullName,String eMail,String ePwd) throws Exception
	{
		
				
		Thread.sleep(500);
		String stepResult = setText ("cashkaro.joinNowPage.joinFreeFullNameTxt",fullName);
		fnCheckAndLogExtentResult(stepResult,"Enter full name.Enter value - " + fullName,"Full Name entered","Unable to enter Full Name");
		
		stepResult = setText ("cashkaro.joinNowPage.joinFreeEmailTxt",eMail);
		fnCheckAndLogExtentResult(stepResult,"Enter email.Enter value - " + eMail,"Email entered","Unable to enter Email");
		
		stepResult = setText ("cashkaro.joinNowPage.joinFreeConfirmEmailTxt",eMail);
		fnCheckAndLogExtentResult(stepResult,"ReEnter email.Enter value - " + eMail,"Email reentered","Unable to enter Email");
		
		//stepResult = setText ("cashkaro.joinNowPage.joinChoosePwdTxt",ePwd);
		setTextAction("cashkaro.joinNowPage.joinChoosePwdTxt",ePwd);
		fnCheckAndLogExtentResult(stepResult,"Enter password.Enter value - " + ePwd,"Password entered","Unable to enter password");
		
		String capcha = fnSaveScreenShotByPoint();
		if (capcha.equals("False"))
		{
			fnCheckAndLogExtentResult(stepResult,"Enter capcha.CAPTHA IMAGE NOT FOUND IN CAPTCHA VALIDATION IMAGE SECTION " + capcha,"capcha image not found","capcha image not found");
		}
		else
		{
		stepResult = setText ("cashkaro.joinNowPage.joinCapchaTxt",capcha);
		fnCheckAndLogExtentResult(stepResult,"Enter capcha.Enter value - " + capcha,"capcha entered","Unable to enter capcha");
				if (fullName.contains("VALID"))
				{
					stepResult = clickWebElement ("cashkaro.joinNowPage.joinFreeNowButton");
					fnCheckAndLogExtentResult(stepResult,"Click Join Free Now button","Button clicked","Unable to click button");
					Thread.sleep(700);
					//switchDefault();
					elemWait(getWebElement("cashkaro.userHomePage.welcomeMessage"));
					String textValue = getText("cashkaro.userHomePage.welcomeMessage");
					fnExtentCompareString (textValue,"Hello VALID,",test,"Validate that the user's home page opens","User's home page opens","User's home page does not open");
					return;
				}
		}
		
		stepResult = clickWebElement ("cashkaro.joinNowPage.joinFreeNowButton");
		fnCheckAndLogExtentResult(stepResult,"Click Join Free Now button","Button clicked","Unable to click button");

	
		stepResult = getValue("cashkaro.joinNowPage.joinFreeFullNameTxt");
		fnExtentCompareString (stepResult,fullName,test,"Validate the name entry","Data set correctly","Data not set correctly");
		String stepResultEmail = getValue("cashkaro.joinNowPage.joinFreeEmailTxt");
		String stepResultEmailRe = getValue("cashkaro.joinNowPage.joinFreeConfirmEmailTxt");
		if (fullName.contains("Existing"))
		{
			fnExtentCompareString (stepResultEmail,"Present email.",test,"Validate the email  entry for existing data","User present message appears correctly","Message not correct");
			fnExtentCompareString (stepResultEmailRe,"Present email.",test,"Validate the email reentry for existing data","User present message appears correctly","Message not correct");
		}
		else if (eMail.contains("@"))
		{
			fnExtentCompareString (stepResultEmail,eMail,test,"Validate the email  entry","Data set correctly","Data not set correctly");
			fnExtentCompareString (stepResultEmailRe,eMail,test,"Validate the email reentry","Data set correctly","Data not set correctly");
		}
		else 
		{		
				fnExtentCompareString (stepResultEmail,"Please enter a valid email.",test,"Validate the email  entry message for Invalid email","Invalid email message appears correctly","Message not correct");
				fnExtentCompareString (stepResultEmailRe,"Please enter a valid email.",test,"Validate the email  rentry message for Invalid email","Invalid email message appears correctly","Message not correct");
		}
		
		
		clearText ("cashkaro.joinNowPage.joinFreeFullNameTxt");
		clearText ("cashkaro.joinNowPage.joinFreeEmailTxt");
		clearText ("cashkaro.joinNowPage.joinFreeConfirmEmailTxt");
		clearText ("cashkaro.joinNowPage.joinChoosePwdTxt");
		clearText ("cashkaro.joinNowPage.joinCapchaTxt");
		
	}

}





