package procedures_NewFramework.AYSmoke.Facelift;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class FC_Application2Welcome_Verify extends CommonSeleniumActions implements OR {
	
	
	@Test(description="This Procedure is to perform some Verification in 'Dashboard' page")
	public void FC_Application2Welcome_Verify() throws Exception{
		try {
		writeDetails();
//		headerStatement("UpdateProfile_Verify");
//		startExecutionOrder(j);
//		writeParametersTable();
		Reporter.log("Proceed to retrieve Verify Test Data 'Update Profile' page");
		String[]  updateprovdatarepo = datacontainer;
		String verifyui = updateprovdatarepo[0];
		String page_title = updateprovdatarepo[1];
		String section_present = updateprovdatarepo[2];
		String section_not_present = updateprovdatarepo[3];

		Reporter.log("Verify Test Data was retrieved for 'Update Profile' page");
		if (!verifyui.equals("")) {
			
		}
		if (!page_title.equals("")) {
			Reporter.log("Step 2 - Verify Page Name as["+page_title+"]");
			verifyElementContainsTextWebdriver(attributeName_xpath,AW_PageTitle, page_title, "Page Name");
		}
		if (!section_present.equals("")) {
			Reporter.log("Step 3 - Verify section present as["+section_present+"]");
			if (section_present.equalsIgnoreCase("Fairfax")) {
				verifyElementPresent(AW_Fa1rfaxLnk, "Page with Title["+section_present+"]");
			}else if (section_present.equalsIgnoreCase("Sports")) {
				verifyElementPresent(AW_SportsLnk, "Page with Title["+section_present+"]");
			}
		}
		if (!section_not_present.equals("")) {
			Reporter.log("Step 4 - Verify section not present as["+section_not_present+"]");
			if (section_not_present.equalsIgnoreCase("Fairfax")) {
				verifyElementNotPresent(AW_Fa1rfaxLnk, "Page with Title["+section_not_present+"]");
			}else if (section_not_present.equalsIgnoreCase("Sports")) {
				verifyElementNotPresent(AW_SportsLnk, "Page with Title["+section_not_present+"]");
			}
		}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
}


