package procedures_NewFramework.AYSmoke.Recommendations;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class REC_Login_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some operation in 'Recommendation Login' page")
	public void REC_Login_Input() throws Exception{
		try {
		
		writeDetails();
		String[]  parameterValuesArray = datacontainer;
		Reporter.log("Proceed to retrieve Input Test Data for 'Recommendation Login' page");
		String pac = parameterValuesArray[0];
		String password = parameterValuesArray[1];
		String login = parameterValuesArray[2];
		String forgotpacpassword = parameterValuesArray[3];
		Reporter.log("Input Test Data was retrieved for 'Recommendation Login' page");
		if (!pac.equals("")) {
			Reporter.log("Step 1 - Proceed to Read PAC from Excel Sheet(C:/Selenium/InputTestdata.xls)");
			String generatepin;
			if (pac.equalsIgnoreCase("Recommender Personal Access Code")) {
				generatepin = Runtimedataread(pac);				
			} else {
				generatepin = pac;					
			}
			Reporter.log("Proceed to Enter PAC as ("+generatepin+")");
			sendKeys(attributeName_xpath, RL_PerAccessCode, generatepin);	
//			String generatepin = Runtimedataread(pac);
//			Reporter.log("Proceed to Enter PIN as ("+pac+")");
//			sendKeys(attributeName_xpath, RL_PerAccessCode, generatepin);			
		}
		if (!password.equals("")) {
			Reporter.log("Step 2 - Proceed to Read Password from Excel Sheet(C:/Selenium/InputTestdata.xls)");
			String generatepassword;
			if (password.equalsIgnoreCase("ApplicationPassword")) {
				generatepassword = Runtimedataread(password);				
			}else if (password.equalsIgnoreCase("ApplicationChangePassword")) {
				generatepassword = Runtimedataread(password);				
			} else {
				generatepassword = password;					
			}
			Reporter.log("Proceed to Enter Password as ("+generatepassword+")");		
			sendKeys(attributeName_xpath, RL_Password, generatepassword);
		}
		if (!login.equals("")) {
			Reporter.log("Step 3 - Click on 'Login' Button");
			clickWebdriver(attributeName_xpath, RL_LoginBtn);
		}
		if (!forgotpacpassword.equals("")) {
			Reporter.log("Step 4 - Click on 'Forgot your PIN or Password?' Button");
			clickWebdriver(attributeName_partiallinktext, "Forgot your access code and/or password?");	
			recentPopupSelectWebdriver("Forgot/Reset Password");
		}
		} catch (Exception e) {			
			writeFailure(e.getLocalizedMessage());
		}
	}

}

