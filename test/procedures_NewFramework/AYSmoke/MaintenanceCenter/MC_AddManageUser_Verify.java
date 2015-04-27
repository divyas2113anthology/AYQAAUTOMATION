package procedures_NewFramework.AYSmoke.MaintenanceCenter;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class MC_AddManageUser_Verify extends CommonSeleniumActions implements OR{
	
	@Test(description="This Procedure is to perform some Verification in 'Manage User' page")
	
	public void MC_AddManageUser_Verify() throws Exception{
	try {
		writeDetails();
		Reporter.log("Proceed to retrieve Verify Test Data 'Manage User' page");
		String[]  fpvdatarepo = datacontainer;
		String message = fpvdatarepo[0];
		Reporter.log("Verify Test Data was retrieved for 'Manage User' page");
		
		if (!message.equals("")) {
			Reporter.log("Verify the message"+message+") is displayed");
			waitForElementPresentWebdriver(attributeName_xpath, MS_ConfirmationText, message);
			verifyElementPresentWebdriver(attributeName_xpath, MS_ConfirmationText, message);	}
		
	} catch (Exception e) {
		writeFailure(e.getLocalizedMessage());
	}

	}
}
