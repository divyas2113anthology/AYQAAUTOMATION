package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.WC_ApplicantSummary;

import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

public class WC_OtherSupportingDoc_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some input operation in 'Supporting Documents' page")
	public void WC_OtherSupportingDoc_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Supporting Documents' Page");
			String[] testdata = datacontainer;
			String supdocumentname = testdata[0];
			String status = testdata[1];
			String receiveddate = testdata[2];
			String comments = testdata[3];
			String saveclosewindow = testdata[4];
			
			recentPopupSelect_without_window_nameWebdriver();	
			
			Reporter.log("Input Test Data was retrieved for 'Supporting Documents' Page");
			if(!supdocumentname.equals("")){
				Reporter.log("Verify("+supdocumentname+")is present");
				waitForElementPresentWebdriver(attributeName_xpath, AS_SupportingDocumentName, supdocumentname);
				selectByVisibleTextWebdriver(attributeName_xpath, AS_SupportingDocumentName, supdocumentname);
				//verifyElementContainsTextWebdriver(attributeName_xpath, AS_SupportingDocumentStatus, status, status);
			}
			if(!status.equals("")){
				Reporter.log("Verify("+status+")is present");
				waitForElementPresentWebdriver(attributeName_xpath, AS_SupportingDocumentStatus, status);
				selectByVisibleTextWebdriver(attributeName_xpath, AS_SupportingDocumentStatus, status);
				//verifyElementContainsTextWebdriver(attributeName_xpath, AS_SupportingDocumentStatus, status, status);
			}
			if(!saveclosewindow.equals("")){
				Reporter.log("Click on the Button"+saveclosewindow);
				clickWebdriver(attributeName_xpath, AS_SupportingDocCloseWindow+saveclosewindow+"')]");
				waitForPageToLoadWebdriver();
				//recentPopupCloseWebdriver();
				switchToOldWindow();

			}	
			//switchToDefaultContentWebdriver();
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}
