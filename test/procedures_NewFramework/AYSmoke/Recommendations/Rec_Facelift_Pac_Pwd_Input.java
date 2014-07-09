package procedures_NewFramework.AYSmoke.Recommendations;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class Rec_Facelift_Pac_Pwd_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some operation in Recommendation Facelift Login page")
	public void Rec_Facelift_Pac_Pwd_Input() throws Exception{
		try {
		
		writeDetails();
		String[]  testdata = datacontainer;
		String pac = testdata[0];
		String password = testdata[1];
		String submit = testdata[2];
		String forgetpwd = testdata[3];
		
		if (!pac.equals("")) {
			Reporter.log("Step 1 - Enter the PAC as ["+pac+"]");
			String PAC = Runtimedataread(pac);	
			sendKeys(attributeName_xpath, RF_PAC, PAC);
			//type(RF_PAC, pac);
			waitForPageToLoadWebdriver();
		}
		if (!password.equals("")){
			Reporter.log("Step 2 - Enter the Password as ["+password+"]");
			sendKeys(attributeName_xpath, RF_Rec_Password, password);
			waitForPageToLoadWebdriver();
		}
		if (!submit.equals("")){
			Reporter.log("Step 3 - Click on Submit");
			clickWebdriver(attributeName_xpath, RF_Rec_Submit);
			waitForPageToLoadWebdriver();
		}
		if (!forgetpwd.equals("")){
			Reporter.log("Step 4 - Click on Create/Reset");
			writeConsole("I am here");
			clickWebdriver(attributeName_xpath, RF_Forgot_Pwd);
			waitForPageToLoadWebdriver();
		}
		
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}
