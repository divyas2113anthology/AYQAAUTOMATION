package procedures_NewFramework.AYSmoke.Facelift;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class FC_TermOfUse_Verify extends CommonSeleniumActions implements OR {
	
	
	@Test(description="This Procedure is to perform some Verification in 'Update Profile' page")
	public void FC_TermOfUse_Verify() throws Exception{
		try {
		writeDetails();
//		headerStatement("UpdateProfile_Verify");
//		startExecutionOrder(j);
//		writeParametersTable();
		Reporter.log("Proceed to retrieve Verify Test Data 'Update Profile' page");
		String[]  updateprovdatarepo = datacontainer;
		String verifyui = updateprovdatarepo[0];
		String page_title = updateprovdatarepo[1];
		Reporter.log("Verify Test Data was retrieved for 'Update Profile' page");
		if (!verifyui.equals("")) {
			
		}
		if (!page_title.equals("")) {
			Reporter.log("Step 2 - Verify Page Name as["+page_title+"]");
//			if (page_title.equalsIgnoreCase("Terms of Use")) {
//				verifyElementText(TOU_pageTitle, page_title, "Terms of Use");	
//			}
			if (isElementPresentWebdriver(attributeName_xpath,TOU_pageTitle)) {
				Reporter.log("Its navigate to ["+page_title+"]age");
			} else {
				writeFailure("Its not navigate to ["+page_title+"] page");
			}

		}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}


}
