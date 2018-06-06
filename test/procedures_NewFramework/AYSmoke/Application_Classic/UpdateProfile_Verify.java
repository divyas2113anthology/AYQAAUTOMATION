package procedures_NewFramework.AYSmoke.Application_Classic;

import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

public class UpdateProfile_Verify extends CommonSeleniumActions implements OR {
	
	
	@Test(description="This Procedure is to perform some Verification in 'Update Profile' page")
	public void UpdateProfile_Verify() throws Exception{
		try {
		writeDetails();
//		headerStatement("UpdateProfile_Verify");
//		startExecutionOrder(j);
//		writeParametersTable();
		Reporter.log("Proceed to retrieve Verify Test Data 'Update Profile' page");
		String[]  updateprovdatarepo = datacontainer;
		String successmessage = updateprovdatarepo[0];
		String pagename = updateprovdatarepo[1];
		String verifyui = updateprovdatarepo[2];
		String closeWindow = updateprovdatarepo[3];
		Reporter.log("Verify Test Data was retrieved for 'Update Profile' page");
		if (!successmessage.equals("")) {
			Reporter.log("Step 1 - Verify Message("+successmessage+") was displayed correctly");
			waitForElementPresentWebdriverWait(attributeName_xpath, RC_Question1+successmessage+"')]", successmessage);
			verifyElementContainsTextWebdriver(attributeName_xpath, RC_Question1+successmessage+"')]", successmessage, successmessage);
		}
		if (!pagename.equals("")) {
			Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
			if (selenium.isTextPresent(pagename)) {
				Reporter.log("Its navigate to 'Update Profile' page");
			} else {
				writeFailure("Its not navigate to 'Update Profile' page");
			}			
		}
		if (!verifyui.equals("")) {
			
		}
		if(!closeWindow.equals("")){
			Reporter.log("Close the Window");
			clickWebdriver(attributeName_xpath,"//button[@class='close']");
		}
		
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}


}