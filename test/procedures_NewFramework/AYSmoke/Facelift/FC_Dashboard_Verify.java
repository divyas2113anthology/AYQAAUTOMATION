package procedures_NewFramework.AYSmoke.Facelift;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class FC_Dashboard_Verify extends CommonSeleniumActions implements OR {
	
	
	@Test(description="This Procedure is to perform some Verification in 'Dashboard' page")
	public void FC_Dashboard_Verify() throws Exception{
		try {
		writeDetails();
//		headerStatement("UpdateProfile_Verify");
//		startExecutionOrder(j);
//		writeParametersTable();
		Reporter.log("Proceed to retrieve Verify Test Data 'Dashboard' page");
		String[]  updateprovdatarepo = datacontainer;
		String verifyui = updateprovdatarepo[0];
		String page_title = updateprovdatarepo[1];
		String submittedapplication = updateprovdatarepo[2];
		Reporter.log("Verify Test Data was retrieved for 'Dashboard' page");
		if (!verifyui.equals("")) {
			
		}
		if (!page_title.equals("")) {
			Reporter.log("Step 2 - Verify Page Name as["+page_title+"]");
			//			waitForElement(DB_PageTitle, "My Applications");
			if(page_title.equalsIgnoreCase("My Application")){
				//				verifyElementText(DB_PageTitle, page_title, "My Applications");
				waitForElementPresentWebdriverWait(attributeName_cssselector, DB_PageTitle, page_title);
				verifyElementContainsTextWebdriver(attributeName_cssselector, DB_PageTitle, page_title, page_title);
			}
		}
		if (!submittedapplication.equals("")) {
			Reporter.log("Step 3 - Verify Submitted Application Status as["+submittedapplication+"]");
			verifyElementText(DB_SubmittedMsg, submittedapplication, "Application Submitted");
		}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
}

