package procedures_NewFramework.AYSmoke.Recommendations;

import org.testng.Reporter;
import org.testng.annotations.Test;
import or.OR;
import processor.CommonSeleniumActions;

public class REC_Welcome_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Welcome' page")
		public void REC_Welcome_Verify() throws Exception{
		try {
			writeDetails();
//			headerStatement("PersonalData_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data 'Welcome' page");
			String[]  testdata = datacontainer;
			String page = testdata[0];
			String sectionpresent = testdata[1];
			String sectionnotpresent = testdata[2];
			Reporter.log("Verify Test Data was retrieved for 'Welcome' page");
			if (!page.equals("")) {
				Reporter.log("Step 1 - Verify page title as("+page+") was displayed correctly");
				verifyElementContainsTextWebdriver(attributeName_xpath, CI_PageName, page, "Page Title");
			}
			if (!sectionpresent.equals("")) {
				Reporter.log("Step 2 - Verify the Presented section as ("+sectionpresent+")");
				waitForElementVisibleWebdriver(attributeName_partiallinktext, "Evaluations", sectionpresent);
				verifyElementContainsTextWebdriver(attributeName_partiallinktext, "Evaluations", sectionpresent, sectionpresent);
//				verifyElementVisibleContainsTextWebdriver(attributeName_xpath, CI_SectionMenu, sectionpresent, "Section Menu Link");
			}
			if (!sectionnotpresent.equals("")) {
				Reporter.log("Step 3 - Verify the Not Presented section as ("+sectionnotpresent+")");
				waitForElementNotPresentWebdriver(attributeName_partiallinktext, "Evaluations", sectionnotpresent);
				verifyElementNotPresentWebdriver(attributeName_partiallinktext, "Evaluations", sectionnotpresent);
//				verifyElementNotVisibleContainsTextWebdriver(attributeName_xpath, CI_SectionMenu, sectionnotpresent, "Section Menu Link");
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}


