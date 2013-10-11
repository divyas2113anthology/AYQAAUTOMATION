package procedures_NewFramework.AYSmoke.Connect;

import org.testng.Reporter;
import org.testng.annotations.Test;
import or.OR;
import processor.CommonSeleniumActions;

public class CRM_SearchContactsResults_Verify extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some Verification in 'Contact Search Results' page")
		public void CRM_SearchContactsResults_Verify() throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Verify Test Data 'Show Matching' page");
			String[]  fpvdatarepo = datacontainer;
			String verifyloginpin = fpvdatarepo[0];
			String verifyfirstname = fpvdatarepo[1];
			String verifyemail = fpvdatarepo[2];
			Reporter.log("Verify Test Data was retrieved for 'Show Matching' page");
			if (!verifyloginpin.equals("")) {
				String VerifyPIN = Runtimedataread(verifyloginpin);
				Reporter.log("Step 1 - Verify PIN was displayed("+VerifyPIN+")correctly");
				verifyTabelRowvalueswithcolumnNamesusingxpathWebdriver(attributeName_xpath, "//table[@class='simplegrid-data-content']", "Login", VerifyPIN);
			}
			if (!verifyfirstname.equals("")) {
				String VerifyFirstName = Runtimedataread(verifyfirstname);
				Reporter.log("Step 2 - Verify First Name was displayed("+VerifyFirstName+")correctly");
				verifyTabelRowvalueswithcolumnNamesusingxpathWebdriver(attributeName_xpath, "//table[@class='simplegrid-data-content']", "First Name", VerifyFirstName);
			}
			if (!verifyemail.equals("")) {
				String VerifyEmail = Runtimedataread(verifyemail);
				Reporter.log("Step 3 - Verify Email was displayed("+VerifyEmail+")correctly");
				verifyTabelRowvalueswithcolumnNamesusingxpathWebdriver(attributeName_xpath, "//table[@class='simplegrid-data-content']", "E-mail", VerifyEmail);
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

}