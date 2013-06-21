package procedures_NewFramework.AYSmoke.Facelift;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class FC_ApplicantWelcome_Verify extends CommonSeleniumActions implements OR {
	
	
	@Test(description="This Procedure is to perform some Verification in 'Welcome' page")
	public void FC_ApplicantWelcome_Verify() throws Exception{
		try {
		writeDetails();
//		headerStatement("UpdateProfile_Verify");
//		startExecutionOrder(j);
//		writeParametersTable();
		Reporter.log("Proceed to retrieve Verify Test Data 'Welcome' page");
		String[]  updateprovdatarepo = datacontainer;
		String verifyui = updateprovdatarepo[0];
		String page_title = updateprovdatarepo[1];
		Reporter.log("Verify Test Data was retrieved for 'Welcome' page");
		if (!verifyui.equals("")) {
			
		}
		if (!page_title.equals("")) {
			Reporter.log("Step 2 - Verify Page Name as["+page_title+"]");
			verifyElementContainsText(AW_PageTitle, page_title, "Welcome");	
		}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
}


