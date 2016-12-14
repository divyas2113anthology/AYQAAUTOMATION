package procedures_NewFramework.AYSmoke.Connect;

import org.testng.Reporter;
import org.testng.annotations.Test;
import or.OR;
import processor.CommonSeleniumActions;

public class CRM_Welcome_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Show Matching' page")
		public void CRM_Welcome_Verify() throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Verify Test Data 'Show Matching' page");
			String[]  fpvdatarepo = datacontainer;
			String pagename = fpvdatarepo[0];
			Reporter.log("Verify Test Data was retrieved for 'Show Matching' page");
			if (!pagename.equals("")) {
				Reporter.log("Step 1 - Verify its navigate to ("+pagename+") page");
				//waitForElementPresentWebdriver(attributeName_xpath, CNT_WelPageTitle, pagename);
				//verifyElementTextWebdriver(attributeName_xpath, CNT_WelPageTitle, pagename, pagename);
				waitForElementPresentWebdriver(attributeName_xpath, "//div[text()='Welcome!']", pagename);
				verifyElementTextWebdriver(attributeName_xpath, "//div[text()='Welcome!']", pagename, pagename);

				waitForElementPresentWebdriver(attributeName_xpath, "//a[contains(@href,'CRM')]", "CRM");
				clickWebdriver(attributeName_xpath, "//a[contains(@href,'CRM')]");

			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

}








