package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.WC_ApplicantSummary;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_ViewComments_Input extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some input in 'Applicant Summary' page")
		public void WC_ViewComments_Input() throws Exception{
		try {
			Reporter.log("Proceed to retrieve Verify Test Data 'Applicant Summary' page");
			String[]  fpvdatarepo = datacontainer;
			String button = fpvdatarepo[0];
			String Checkbox = fpvdatarepo[1];
			String ClickLinkName = fpvdatarepo[2];
			String Comments = fpvdatarepo[3];
			String ConfidentialCheckbox = fpvdatarepo[4];
			String saveback = fpvdatarepo[5];
			Reporter.log("Verify Test Data was retrieved for 'Applicant Summary' page");
			if (!Checkbox.equals("")) {
				waitForElementPresentWebdriverWait(attributeName_xpath, AS_ViewCommentCheck+Checkbox+AS_ViewCommentCheck1, button);
				clickWebdriver(attributeName_xpath, AS_ViewCommentCheck+Checkbox+AS_ViewCommentCheck1);
			}
			if (!ClickLinkName.equals("")) {
				waitForElementPresentWebdriverWait(attributeName_xpath, AS_ViewCommentCheck+ClickLinkName, ClickLinkName);
				clickWebdriver(attributeName_xpath,  AS_ViewCommentCheck+ClickLinkName);
			}
			if (!Comments.equals("")) {
				waitForElementPresentWebdriverWait(attributeName_xpath, AS_ViewAddComment, Comments);
				sendKeys(attributeName_xpath, AS_ViewAddComment, Comments);

			}
			if (!ConfidentialCheckbox.equals("")) {
	
			}
			if (!saveback.equals("")) {
	
			}
			if (!button.equals("")) {
				waitForElementPresentWebdriverWait(attributeName_xpath, BR_Buttons+button+"')]", button);
				clickWebdriver(attributeName_xpath, BR_Buttons+button+"')]");

			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}
