package procedures_NewFramework.AYSmoke.Connect;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class CRM_Login_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some operation in 'Connect Login' page")
	public void CRM_Login_Input () throws Exception{
		try {
		
		writeDetails();
		String[]  parameterValuesArray = datacontainer;
		Reporter.log("Proceed to retrieve Input Test Data for 'Connect Login' page");
		String username = parameterValuesArray[0];
		String password = parameterValuesArray[1];
		String login = parameterValuesArray[2];
		Reporter.log("Input Test Data was retrieved for 'Connect Login' page");
		if (!username.equals("")) {
			Reporter.log("Step 1 - Proceed to Read PIN from Excel Sheet(C:/Selenium/InputTestdata.xls)");
			String generateusername = Runtimedataread(username);
			Reporter.log("Step 2 - Proceed to Enter PIN as ("+generateusername+")");
			waitForElementPresentWebdriver(attributeName_id, CNT_Username, generateusername);
			sendKeys(attributeName_id, CNT_Username, generateusername);
		}
		if (!password.equals("")) {
			Reporter.log("Step 3 - Proceed to Read Password from Excel Sheet(C:/Selenium/InputTestdata.xls)");
			String generatepassword = Runtimedataread(password);
			Reporter.log("Step 4 - Proceed to Enter PIN as ("+generatepassword+")");		
			sendKeys(attributeName_id, CNT_Password, generatepassword);
		}
		if (!login.equals("")) {
			Reporter.log("Step 5 - Click on 'Login' Button");
			clickWebdriver(attributeName_id, CNT_LoginBtn);
			waitForPageToLoadWebdriver();
		}
		} catch (Exception e) {			
			writeFailure(e.getLocalizedMessage());
		}
	}

}


