package procedures_NewFramework.AYSmoke.Webcenter;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_SearchforApplicants_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Search for Applicant' page")
		public void WC_SearchforApplicants_Verify() throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Verify Test Data 'Search for Applicant' page");
			String[]  fpvdatarepo = datacontainer;
			String successmessage = fpvdatarepo[0];
			String sysmsgheading = fpvdatarepo[1];
			String systemmessage = fpvdatarepo[2];
			String formlable = fpvdatarepo[3];
			String formlablemessage = fpvdatarepo[4];
			String pagename = fpvdatarepo[5];
			String verifyui = fpvdatarepo[6];
			Reporter.log("Verify Test Data was retrieved for 'Search for Applicant' page");
			if (!successmessage.equals("")) {
				Reporter.log("Step 1 - Verify Message("+successmessage+") was displayed correctly");
				
			}
			if (!sysmsgheading.equals("")) {
				Reporter.log("Step 2 - Verify Message Heading ("+sysmsgheading+") was displayed correctly");
				verifyElementTextWebdriver(attributeName_xpath, SAV_FormHeading, sysmsgheading, "Error Message Heading");
			}
			if (!systemmessage.equals("")) {
				Reporter.log("Step 3 - Verify Message("+systemmessage+") was displayed correctly");
				verifyElementTextWebdriver(attributeName_xpath, SAV_FormMsg, systemmessage, "Error Message");
			}
			if (!formlable.equals("")&&!formlablemessage.equals("")) {
				Reporter.log("Step 4 - Verify Form Lable("+formlable+") and Verify Form Lable Message("+formlablemessage+") was displayed correctly");
				verifyElementTextWebdriver(attributeName_xpath, SAV_FormLabel+formlable+"']/following-sibling::td", formlablemessage, "Error Message");
			}
			if (!pagename.equals("")) {
				Reporter.log("Step 5 - Verify its navigate to ("+pagename+") page");
//				waitForElementPresentWebdriver(attributeName_xpath, SAV_PageName, pagename);
//				verifyElementTextWebdriver(attributeName_xpath, SAV_PageName, pagename, "Page Name for Search For Applicant");
				//waitForText(pagename, "Search Results");
				verifyTextPresent(pagename);
			}
			if (!verifyui.equals("")) {
//				Reporter.log("Step 1 - Verify UI was displayed correctly");
				verifyElementContainsTextWebdriver(attributeName_xpath, SAI_SysQuries, "Recommendations -DT", "Recommendation");
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}

