package procedures_NewFramework.AYSmoke.Application_Classic;

import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

public class SectionRule_Input extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Operations in 'Virginia' page")
		public void SectionRule_Input() throws Exception{
		try {
			writeDetails();
//			headerStatement("PersonalData_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data 'Virginia' page");
			String[]  virgdatarepo = datacontainer;
			String doyoulive = virgdatarepo[0];
			String button_to_click = virgdatarepo[1];
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
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}

