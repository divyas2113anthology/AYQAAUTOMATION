package procedures_NewFramework.AYSmoke.AppReview;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class AR_UserLogin_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'AppReview Login' page")
	public void AR_UserLogin_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'AppReview Login' Page");
			String[] testdata = datacontainer;
			String school = testdata[0];
			String username = testdata[1];
			String password = testdata[2];
			String login = testdata[3];
			String forgotadmin = testdata[4];
			
			if (!school.equals("")) {
				Reporter.log("Step 1 - Enter School name as ["+school+"]");
				sendKeys(attributeName_xpath, AR_School, school);
			}
			if (!username.equals("")) {
				Reporter.log("Step 2 - Enter User name as ["+username+"]");
				sendKeys(attributeName_xpath, AR_Username, username);
			}
			if (!password.equals("")) {
				Reporter.log("Step 3 - Enter Password as ["+password+"]");
				sendKeys(attributeName_xpath, AR_Password, password);
			}
			if (!login.equals("")) {
				Reporter.log("Step 4 - Clicking on Login as ["+login+"]");
				clickWebdriver(attributeName_xpath, AR_Login);
			}
			if (!forgotadmin.equals("")) {
				Reporter.log("Step 5 - Clicking on Forgot Username/Password as ["+forgotadmin+"]");
				if(forgotadmin.equals("Username"))
					clickWebdriver(attributeName_xpath, AR_ForgotUsername);
				else
					clickWebdriver(attributeName_xpath, AR_ForgotPassword);
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}

