package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;
import or.OR;
import processor.CommonSeleniumActions;

public class WC_SendEmail_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Send Email' page")
		public void WC_SendEmail_Verify() throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Verify Test Data 'Send Email' page");
			String[]  fpvdatarepo = datacontainer;
			String successmessage = fpvdatarepo[0];
			String pagename = fpvdatarepo[1];
			
			/*String host = "outlook.office365.com";// change accordingly
		    String mailStoreType = "pop3";
		    String username = "emtqaaccount@hobsons.com";// change accordingly
		    String password = "Hobsons22!";// change accordingly
*/
		      
			Reporter.log("Verify Test Data was retrieved for 'Send Email' page");
			if (!successmessage.equals("")) {
				Reporter.log("Step 1 - Verify Message("+successmessage+") was displayed correctly");
				waitForElementPresentWebdriver(attributeName_xpath, QAE_Message, successmessage);
				verifyElementContainsTextWebdriver(attributeName_xpath, QAE_Message, successmessage, successmessage);
				
			}
			if (!pagename.equals("")) {
				Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
			waitForElementPresentWebdriverWait(attributeName_xpath, QAE_PageName, pagename);
			verifyElementContainsTextWebdriver(attributeName_xpath, QAE_PageName, pagename, pagename);
			}
			
			//CheckingMails.check(host, mailStoreType, username, password);
			//Process p = Runtime.getRuntime().exec("javac CheckingMails.java");
			//Process p1 = Runtime.getRuntime().exec("CheckingMails.java");
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}
	
}



