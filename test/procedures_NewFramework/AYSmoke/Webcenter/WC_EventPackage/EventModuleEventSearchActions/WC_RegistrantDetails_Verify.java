package procedures_NewFramework.AYSmoke.Webcenter.WC_EventPackage.EventModuleEventSearchActions;

import org.testng.Reporter;
import org.testng.annotations.Test;
import or.OR;
import processor.CommonSeleniumActions;

public class WC_RegistrantDetails_Verify extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some Verification in 'Registrant Details' page")
		public void WC_RegistrantDetails_Verify() throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Verify Test Data 'Registrant Details' page");
			String[]  fpvdatarepo = datacontainer;
			String verifyui = fpvdatarepo[0];
			String verifypagename = fpvdatarepo[1];
			Reporter.log("Verify Test Data was retrieved for 'Registrant Details' page");
			recentOpenedPopupSelectWebdriver("Registrant");
			if (!verifyui.equals("")) {
				
			}
			if (!verifypagename.equals("")) {
				Reporter.log("Step 2 - Verify its navigate to ("+verifypagename+") page");
				verifyElementContainsTextWebdriver(attributeName_xpath, SAV_PageName, verifypagename, "Page Name for Search For Applicant");
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

}
