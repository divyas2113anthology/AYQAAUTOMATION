package procedures_NewFramework.AYSmoke.Recommendations;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class REC_ChangePassword_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some operation in 'Change Password' page")
	public void REC_ChangePassword_Input() throws Exception{
		try {
		
		writeDetails();
		String[]  parameterValuesArray = datacontainer;
		Reporter.log("Proceed to retrieve Input Test Data for 'Change Password' page");
		String currentpassword = parameterValuesArray[0];
		String newpassword = parameterValuesArray[1];
		String confirmpassword = parameterValuesArray[2];
		String conpasswordlabel = parameterValuesArray[3];
		String update_goback = parameterValuesArray[4];
		Reporter.log("Input Test Data was retrieved for 'Change Password' page");
		if (!currentpassword.equals("")) {
			Reporter.log("Step 1 - Enter the Current Password as '"+currentpassword+"'");
			String generatechangepass;
			if (currentpassword.equalsIgnoreCase("ApplicationPassword")) {
				generatechangepass = Runtimedataread(currentpassword);				
			}else if (currentpassword.equalsIgnoreCase("ApplicationChangePassword")) {
				generatechangepass = Runtimedataread(currentpassword);				
			} else if (currentpassword.equalsIgnoreCase("Recommender Password")) {
				generatechangepass = Runtimedataread(currentpassword);				
			} else {
				generatechangepass = currentpassword;					
			}
			Reporter.log("Proceed to Enter Current Password as ("+currentpassword+")");
			sendKeys(attributeName_xpath, CP_CurrentPass, generatechangepass);
//			String CurrentPassword = Runtimedataread(currentpassword);
//			sendKeys(attributeName_xpath, CP_CurrentPass, CurrentPassword);			
		}
		if (!newpassword.equals("")) {
			Reporter.log("Step 2 - Enter the Current Password as '"+newpassword+"'");
			String NewPassword = Runtimedataread(newpassword);
			sendKeys(attributeName_xpath, CP_NewPass, NewPassword);
		}
		if (!confirmpassword.equals("")) {
			Reporter.log("Step 3 - Enter the Current Password as '"+newpassword+"'");
			String ConfirmPassword = Runtimedataread(confirmpassword);
			sendKeys(attributeName_xpath, CP_ConfirmPass, ConfirmPassword);
//			if (!conpasswordlabel.equalsIgnoreCase("")) {
//				Reporter.log("Proceed to Write Confirm Password as ("+confirmpassword+") in the Excel Sheet(C:/Selenium/InputTestdata.xls)");
//				if (!isElementPresent("//td[@class='BasePageFont']/font")) {
//					Runtimedatawrite(confirmpassword,conpasswordlabel);			
//				}
//			}
		}
		if (!update_goback.equals("")) {
			Reporter.log("Step 4 - Click the Button as '"+update_goback+"' ");
			if (update_goback.equalsIgnoreCase("Go Back")) {
				clickWebdriver(attributeName_xpath, CP_Goback);
				waitForPageToLoadWebdriver();
			}else if (update_goback.equalsIgnoreCase("Update")) {
				clickWebdriver(attributeName_xpath, CP_Update);
			}
		}
		} catch (Exception e) {			
			writeFailure(e.getLocalizedMessage());
		}
	}

}

