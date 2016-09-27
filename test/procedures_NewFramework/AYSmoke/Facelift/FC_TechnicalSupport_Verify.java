package procedures_NewFramework.AYSmoke.Facelift;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class FC_TechnicalSupport_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to Verify in 'Technical Support' page")
	public void FC_TechnicalSupport_Verify() throws Exception{
		try {
			writeDetails();
//			headerStatement("AVSLookUp_Input");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to verify Test Data for 'Technical Support' page");
			String[]  tecsupportdatarepo = datacontainer;
			String pagename = tecsupportdatarepo[0];
			Reporter.log("Verify Test Data was retrieved for 'Technical Support' page");
			if (!pagename.equals("")) {
				Reporter.log("Step 6 - Verify the '"+pagename+"' Page");
				waitForElementPresent(TS_PageName, "Technical Support Page");
				verifyElementTextWebdriver(attributeName_xpath,TS_PageName, pagename, "Page Name");
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

}

