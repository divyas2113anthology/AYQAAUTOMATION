package procedures_NewFramework.AYSmoke.Webcenter.WC_EnrollmentPackage.EnrModuleEnrollApplicantSearchActions;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_SearchforEnrollmentApplicants_Verify extends CommonSeleniumActions implements OR{
	@Test(description="This Procedure is to perform some Verification in 'Search for Enrollment' page")
	public void WC_SearchforEnrollmentApplicants_Verify() throws Exception{
	try {
		writeDetails();
		Reporter.log("Proceed to retrieve Verify Test Data 'Search for Enrollment' page");
		String[]  fpvdatarepo = datacontainer;
		String message = fpvdatarepo[0];
		String pagename = fpvdatarepo[1];
		String verifyui = fpvdatarepo[2];
		Reporter.log("Verify Test Data was retrieved for 'Search for Enrollment' page");
		if (!message.equals("")) {
			Reporter.log("Step 1 - Verify Message("+message+") was displayed correctly");
			waitForElementPresentWebdriver(attributeName_xpath, Ad_PageName, message);
			verifyElementContainsTextWebdriver(attributeName_xpath, Ad_PageName, message, message);
			
		}
		if (!pagename.equals("")) {
			Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
			if(pagename.contains("Enrollments-DT")){
				waitForElementPresentWebdriverWait(attributeName_xpath,"//table//td/font", pagename);
				verifyElementContainsTextWebdriver(attributeName_xpath,"//table//td/font", pagename, pagename);
			}
			else{
			waitForElementPresentWebdriverWait(attributeName_xpath, ASR_Pagename, pagename);
		   	verifyElementContainsTextWebdriver(attributeName_xpath, ASR_Pagename, pagename, pagename);
			}
		}
		if (!verifyui.equals("")) {
			
		}
	} catch (Exception e) {
		writeFailure(e.getLocalizedMessage());
	}
	//endExecutionOrder(j);
//	Reporter.log("##########End of Execution Order ["+j+"]##########");
	}
}