package procedures_NewFramework.AYSmoke.Facelift;

import org.testng.Reporter;
import org.testng.annotations.Test;
import or.OR;
import processor.CommonSeleniumActions;

public class FC_Virginia_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Virginia' page")
		public void FC_Virginia_Verify() throws Exception{
		try {
			writeDetails();
//			headerStatement("PersonalData_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data 'Virginia' page");
			String[]  fpvdatarepo = datacontainer;
			String successmessage = fpvdatarepo[0];
			String pagename = fpvdatarepo[1];
			String verifyui = fpvdatarepo[2];
			Reporter.log("Verify Test Data was retrieved for 'Virginia' page");
			if (!successmessage.equals("")) {
				Reporter.log("Step 1 - Verify Message("+successmessage+") was displayed correctly");
				verifyElementTextWebdriver(attributeName_xpath,PSD_SuccessMsg, successmessage, "Sucesses Message");
			}
			if (!pagename.equals("")) {
				Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
				verifyElementTextWebdriver(attributeName_xpath,PSD_PageName, pagename, "Page Name");
			}
			if (!verifyui.equals("")) {
			
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}

