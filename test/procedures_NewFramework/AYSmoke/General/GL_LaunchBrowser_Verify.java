package procedures_NewFramework.AYSmoke.General;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class GL_LaunchBrowser_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Application Home' page")
		public void GL_LaunchBrowser_Verify() throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Verify Test Data 'Application Home' page");
			String[]  fpvdatarepo = datacontainer;
			String message = fpvdatarepo[0];
			String pagename = fpvdatarepo[1];
			String verifyui = fpvdatarepo[2];
			Reporter.log("Verify Test Data was retrieved for 'Application Home' page");
			if (!message.equals("")) {
				Reporter.log("Step 1 - Verify Message("+message+") was displayed correctly");
				waitForElementPresentWebdriver(attributeName_xpath, Ad_FormHeading, message);
				verifyElementContainsTextWebdriver(attributeName_xpath, Ad_FormHeading, message, message);
			}
			if (!pagename.equals("")) {
				Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
				waitForElementPresentWebdriver(attributeName_xpath, Ad_PageName, pagename);
				verifyElementContainsTextWebdriver(attributeName_xpath, Ad_PageName, pagename, "Page Name for Package");
			}
			if (!verifyui.equals("")) {
				Reporter.log("Step 3 - Verify UI in present as ("+pagename+") Home page");
				if (verifyui.equalsIgnoreCase("Auto")) {
					String VerifyRAD = Runtimedataread(verifyui);
					waitForElementPresentWebdriver(attributeName_xpath, "//div[@id='ay-login-text']//h3", VerifyRAD);
					verifyElementContainsTextWebdriver(attributeName_xpath, "//div[@id='ay-login-text']//h3", VerifyRAD, VerifyRAD);
				}else if (verifyui.equalsIgnoreCase("Application System Requirements")) {
					waitForElementPresentWebdriver(attributeName_xpath, "//b[contains(text(),'"+verifyui+"')]", verifyui);
					verifyElementContainsTextWebdriver(attributeName_xpath, "//b[contains(text(),'"+verifyui+"')]", verifyui, verifyui);
				}			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}




