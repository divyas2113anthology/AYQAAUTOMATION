package procedures_NewFramework.Connect_AY;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class Connect_User_Login_Page_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This procedure is used to perform some operation on 'Connect Login' Page")
	public void Connect_User_Login_Page_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Connect Login' Page");
			String[] testdata = datacontainer;
			String username = testdata[0];
			String password = testdata[1];
			String login = testdata[2];
			String reset_pwd = testdata[3];
			
			Reporter.log("Input Test Data was retrieved for 'Connect Login' Page");
			if (!username.equals("")) {
				Reporter.log("Step 1 - Enter User Name as ["+username+"]");
				sendKeys(attributeName_xpath, CULP_UserName, username);
				waitForPageToLoadWebdriver();
			}
			if (!password.equals("")) {
				Reporter.log("Step 2 - Enter Password as ["+password+"]");
				sendKeys(attributeName_xpath, CULP_PassWord, password);
				waitForPageToLoadWebdriver();
			}
			if (!login.equals("")) {
				Reporter.log("Step 3 - Click on Login");
				clickWebdriver(attributeName_xpath, CULP_Login);
				waitForPageToLoadWebdriver();
			}
			if (!reset_pwd.equals("")) {
				Reporter.log("Step 4 - Click on Reset Password");
				writeConsole("Reset pwd");
				clickWebdriver(attributeName_xpath, CULP_Reset_Pwd);
				waitForPageToLoadWebdriver();
			}
			
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}
