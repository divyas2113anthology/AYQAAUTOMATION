package procedures_NewFramework.AYSmoke.Recommendations;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class Rec_Facelift_ForgotPwd_Home_Input extends CommonSeleniumActions implements OR
{
	@Test(description="This Procedure is to perform some operation in 'Create/Reset Password' in Recommendation Facelift page")
	public void Rec_Facelift_ForgotPwd_Home_Input() throws Exception
	{
		try {
		
		writeDetails();
		String[]  testdata = datacontainer;
		String paccode = testdata[0];
		String emailid = testdata[1];
		String app_lst_name = testdata[2];
		String search = testdata[3];
		
		if (!paccode.equals("")) {
			Reporter.log("Step 1 - Proceed to Read PAC from Excel Sheet(C:/Selenium/InputTestdata.xls)");
			String generatepin;
			if (paccode.equalsIgnoreCase("Recommender Personal Access Code")) {
				generatepin = Runtimedataread(paccode);				
			} else {
				generatepin = paccode;					
			}
			Reporter.log("Proceed to Enter PAC as ("+generatepin+")");
			sendKeys(attributeName_xpath, RF_Forgot_PAC, generatepin);	
			waitForPageToLoadWebdriver();
		}
		if (!emailid.equals("")){
			Reporter.log("Step 2 - Enter the Email id as ["+emailid+"]");
			sendKeys(attributeName_xpath, RF_Forgot_Email, emailid);
			waitForPageToLoadWebdriver();
		}
		if (!app_lst_name.equals("")){
			Reporter.log("Step 3 - Enter the Applicant Last Name as ["+app_lst_name+"]");
			sendKeys(attributeName_xpath, RF_Forgot_Lname, app_lst_name);
			waitForPageToLoadWebdriver();
		}
		if (!search.equals("")){
			Reporter.log("Step 4 - Click on Search");
			clickWebdriver(attributeName_xpath, RF_Forgot_Search);
			waitForPageToLoadWebdriver();
		}
		
		
		}catch (Exception e) {			
			writeFailure(e.getLocalizedMessage());
		}

		}	

}
