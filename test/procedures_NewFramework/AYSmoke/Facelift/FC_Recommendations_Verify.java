package procedures_NewFramework.AYSmoke.Facelift;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class FC_Recommendations_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Personal Data' page")
		public void FC_Recommendations_Verify() throws Exception{
		try {
			writeDetails();
//			headerStatement("PersonalData_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data 'Personal Data' page");
			String[]  fpvdatarepo = datacontainer;
			String successmessage = fpvdatarepo[0];
			String pagename = fpvdatarepo[1];
			String verifyui = fpvdatarepo[2];
			String VerifyQuestion = fpvdatarepo[3];
			String ClickQuestion = fpvdatarepo[4];

			Reporter.log("Verify Test Data was retrieved for 'Personal Data' page");
			if (!successmessage.equals("")) {
				Reporter.log("Step 1 - Verify Message("+successmessage+") was displayed correctly");
				verifyElementTextWebdriver(attributeName_xpath,PSD_SuccessMsg, "Your answers were saved successfully to the database.", "Sucesses Message");
			}
			if (!pagename.equals("")) {
				Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
				verifyElementTextWebdriver(attributeName_xpath,PSD_PageName, "Personal Data", "Page Name");
			}
			if (!verifyui.equals("")) {
				Reporter.log("Step 3 - Verify the expected ("+verifyui+") text present");
				verifyElementContainsTextWebdriver(attributeName_xpath, RC_Question+verifyui+"')]", verifyui, verifyui);
			}
			
			if(!VerifyQuestion.equals("")){
				if(VerifyQuestion.equals("Auto Question")){
					Reporter.log("Step 4 - Verify the ("+VerifyQuestion+") Question not present");
					verifyElementNotPresent("//a[text()='"+VerifyQuestion+"']",VerifyQuestion);
				}
				else if(VerifyQuestion.equals("DS-RSub-question not present")){
					Reporter.log("Step 4 - Verify the DS-RSub-question not present");
					verifyElementNotPresent("//a[text()='DS-RSub-question']","DS-RSub-question");
					}

				else if(VerifyQuestion.equals("RS-DSub-question not present")){
					Reporter.log("Step 4 - Verify the RS-DSub-question not present");
					verifyElementNotPresent("//a[text()='RS-DSub-question']","RS-DSub-question");
				}
				else if(VerifyQuestion.equals("RS-DSub-Required question not present")){
					Reporter.log("Step 4 - Verify the RS-DSub-Required question not present");
					verifyElementNotPresent("//a[text()='RS-DSub-Required question']","RS-DSub-Required question");
				}
					else {
					Reporter.log("Step 4 - Verify the ("+VerifyQuestion+") element present");
					verifyElementPresent("//a[text()='"+VerifyQuestion+"']",VerifyQuestion);
				}

			}

			if(!ClickQuestion.equals("")){
				Reporter.log("Step 4 - Click the ("+ClickQuestion+") Question");
				clickWebdriver(attributeName_xpath,FC_ClickQuestionLnk+ClickQuestion+"']");

			}
		
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}
