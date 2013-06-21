package procedures_NewFramework.AYSmoke.Webcenter;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class QuestionInApplication_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Business Rules' page")
		public void QuestionInApplication_Verify() throws Exception{
		try {
			writeDetails();
//			headerStatement("PersonalData_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data 'Business Rules' page");
			String[]  fpvdatarepo = datacontainer;
			String questionname = fpvdatarepo[0];
			Reporter.log("Verify Test Data was retrieved for 'Business Rules' page");
			if (!questionname.equals("")) {
				Reporter.log("Step 2 - Verify its Question Name to ("+questionname+") Business Rules page");
				String questionnameqa = getElementIDbyLabel("Question11",QA_Question);
				verifyElementPresentWebdriver(attributeName_xpath, questionnameqa, questionname);
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}



