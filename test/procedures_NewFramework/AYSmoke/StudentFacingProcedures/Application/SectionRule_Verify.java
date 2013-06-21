package procedures_NewFramework.AYSmoke.StudentFacingProcedures.Application;

import org.testng.Reporter;
import org.testng.annotations.Test;
import or.OR;
import processor.CommonSeleniumActions;

public class SectionRule_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Virginia' page")
		public void SectionRule_Verify() throws Exception{
		try {
			writeDetails();
//			headerStatement("PersonalData_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data 'Virginia' page");
			String[]  fpvdatarepo = datacontainer;
			String section_present = fpvdatarepo[0];
			String section_not_present = fpvdatarepo[1];
			Reporter.log("Verify Test Data was retrieved for 'Virginia' page");
			if (!section_present.equals("")) {
				Reporter.log("Step 1 - Verify section present as["+section_present+"]");
				if (section_present.equalsIgnoreCase("Fairfax")) {
					verifyElementPresent(SRI_Fa1rfaxLnk, "Page with Title["+section_present+"]");
				}else if (section_present.equalsIgnoreCase("Sports")) {
					verifyElementPresent(SRI_SportsLnk, "Page with Title["+section_present+"]");
				}
			}
			if (!section_not_present.equals("")) {
				Reporter.log("Step 2 - Verify section not present as["+section_not_present+"]");
				if (section_not_present.equalsIgnoreCase("Fairfax")) {
					verifyElementNotPresent(SRI_Fa1rfaxLnk, "Page with Title["+section_not_present+"]");
				}else if (section_present.equalsIgnoreCase("Sports")) {
					verifyElementNotPresent(SRI_SportsLnk, "Page with Title["+section_not_present+"]");
				}
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}

