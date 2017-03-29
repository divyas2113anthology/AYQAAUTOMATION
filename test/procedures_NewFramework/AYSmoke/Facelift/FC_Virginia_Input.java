package procedures_NewFramework.AYSmoke.Facelift;

import org.testng.Reporter;
import org.testng.annotations.Test;
import or.OR;
import processor.CommonSeleniumActions;

public class FC_Virginia_Input extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Operations in 'Virginia' page")
		public void FC_Virginia_Input() throws Exception{
		try {
			writeDetails();
//			headerStatement("PersonalData_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data 'Virginia' page");
			String[]  virgdatarepo = datacontainer;
			String doyoulive = virgdatarepo[0];
			String button_to_click = virgdatarepo[1];
			String pisubmitappbtn = virgdatarepo[2];
			Reporter.log("Verify Test Data was retrieved for 'Virginia' page");
			if (!doyoulive.equals("")) {
				Reporter.log("Perform the operation to click Do you live there radio button 'Virginia' page");
				if (doyoulive.equalsIgnoreCase("Yes")) {
					Reporter.log("Step 1 - Perform the Operation of student do you live 'Yes'");
//					String DoYouLiveY = getElementIDbyLabel("Do you live in there", AW_DoYouLiveYes);
					waitForElementPresentWebdriver(attributeName_xpath,AW_DoYouLiveYes, "Do You Live radio Button");
					clickWebdriver(attributeName_xpath,AW_DoYouLiveYes);
				}else if (doyoulive.equalsIgnoreCase("No")) {
					Reporter.log("Step 1 - Perform the Operation of student do you live 'No'");
//					String DoYouLiveN = getElementIDbyLabel("Do you live in there", AW_DoYouLiveNo);
					waitForElementPresentWebdriver(attributeName_xpath,AW_DoYouLiveNo, "Do You Live radio Button");
					clickWebdriver(attributeName_xpath,AW_DoYouLiveNo);
				}
			}
			if (!button_to_click.equals("")) {
				Reporter.log("Step 2 - Click on ("+button_to_click+")Button");
				if(button_to_click.equalsIgnoreCase("Save")){
					clickWebdriver(attributeName_xpath,PII_Save);
					waitForPageToLoadWebdriver();
				}else if (button_to_click.equalsIgnoreCase("Save & Continue")) {
					clickWebdriver(attributeName_xpath,PII_SaveContinue);
					waitForPageToLoadWebdriver();
				}else if (button_to_click.equalsIgnoreCase("Reset")) {
					clickWebdriver(attributeName_xpath,PII_Reset);
				}
			}
			if (!pisubmitappbtn.equals("")) {
				Reporter.log("Step 3 - Click on ("+pisubmitappbtn+")Button");
				if (pisubmitappbtn.equalsIgnoreCase("Submit Applicant")) {
					clickWebdriver(attributeName_xpath, AW_SubAppBtn);
					waitForPageToLoadWebdriver();
				}
				else if (pisubmitappbtn.equalsIgnoreCase("Applicant submission for enrollment")){
					clickWebdriver(attributeName_xpath, AW_SubmitBtn);
					waitForPageToLoadWebdriver();

				}
			}

			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}

