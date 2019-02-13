package procedures_NewFramework.AYSmoke.Application_Classic;

import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

public class Mainpage_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Main' page")
		public void Mainpage_Verify() throws Exception{
		try {
			writeDetails();
//			headerStatement("PersonalData_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data 'Main' page");
			String[]  testdata = datacontainer;
			String pagename = testdata[0];
			String message = testdata[1];
			String applicationfee = testdata[2];
			String transcripts = testdata[3];
			String printVoucher = testdata[4];
			
			Reporter.log("Verify Test Data was retrieved for 'Main' page");
			if (!pagename.equals("")) {
				Reporter.log("Step 1 - Verify its navigate to ("+pagename+") page");
				waitForElementPresentWebdriver(attributeName_xpath,MN_PageTitle, pagename);
				verifyElementTextWebdriver(attributeName_xpath,MN_PageTitle, pagename, "Page Name");
			}
			if (!message.equals("")) {//Modified by Rahul mehta on 13th feb 2019
				if(message.equalsIgnoreCase("Your application has been successfully submitted.")) {

					verifyElementPresentWebdriver(attributeName_xpath, "//b[contains(text(), '"+message+"' )]", "Success Message");
				}else {
					verifyElementPresentWebdriver(attributeName_xpath, paymentVoucher, "Payment Voucher");
				} //Modified by Rahul mehta on 13th feb 2019
				waitForPageToLoadWebdriver();
			}

			if(printVoucher.equalsIgnoreCase("Print Voucher")){
				verifyElementPresentWebdriver(attributeName_xpath, printVoucherButton, "Print Voucher");
				waitForPageToLoadWebdriver();
			}
			if (!applicationfee.equals("")) {
				Reporter.log("Verify the element with text ("+applicationfee+")");
				waitForElementPresentWebdriver(attributeName_xpath, AS_VerifyApplicationFee, applicationfee);
				verifyElementContainsTextWebdriver(attributeName_xpath, AS_VerifyApplicationFee, applicationfee, applicationfee);
			}
			if (!transcripts.equals("")) {
				Reporter.log("Verify the element with text ("+transcripts+")");
				waitForElementPresentWebdriver(attributeName_xpath, AS_VerifyTranscripts, transcripts);
				verifyElementContainsTextWebdriver(attributeName_xpath, AS_VerifyTranscripts, transcripts, transcripts);
			}

		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

}



