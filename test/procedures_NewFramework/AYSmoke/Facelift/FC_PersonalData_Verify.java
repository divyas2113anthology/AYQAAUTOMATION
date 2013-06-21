package procedures_NewFramework.AYSmoke.Facelift;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class FC_PersonalData_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Personal Data' page")
		public void FC_PersonalData_Verify() throws Exception{
		try {
			writeDetails();
//			headerStatement("PersonalData_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data 'Personal Data' page");
			String[]  fpvdatarepo = datacontainer;
			String verifyui = fpvdatarepo[0];
			String pagename = fpvdatarepo[1];
			String successmessage = fpvdatarepo[2];
			String errormessage = fpvdatarepo[3];
			Reporter.log("Verify Test Data was retrieved for 'Personal Data' page");
			if (!verifyui.equals("")) {
//				Reporter.log("Step 1 - Verify UI was displayed correctly");
			}
			if (!pagename.equals("")) {
				Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
				verifyElementText(PSD_PageName, pagename, "Page Name");
			}
			if (!successmessage.equals("")) {
				Reporter.log("Step 3 - Verify Message("+successmessage+") was displayed correctly");
				verifyElementText(PSD_SuccessMsg, successmessage, "Sucesses Message");
			}
			if (!errormessage.equals("")) {
				Reporter.log("Step 3 - Verify Success Message:("+errormessage+") was displayed correctl");
//				String errormessage1 = errormessage.replace(";", "\n");
//				verifyElementText(PSD_ErrorMsg, errormessage1, "System Message:");
				// The application would display more than one error message in mutlitple lines separated by two lines between them
                // Below is an example of a 'multi-line error message':
               
                // Created Source Code is required. Provide a value.                       
                // Notes Type is required. Provide a value.
                      
                // If we pass a 'line-separated' value for the appropriate parameter, the 'framework' would cause the second line
                // of the error message to erroneously be read another line of input in the appropriate '.csv' file.  This would
                // stop the test case from being executed. 
                // To prevent this failure, we would separate multiple lines by ';' while passing to the appropriate parameter.
                // The parameter for the above error message would be passed as:
                // Created Source Code is required. Provide a value.;Notes Type is required. Provide a value.
                // The 'verifyMessages' function would check whether or not, each of the lines is present in the actual
                // 'Multi-line' error message by splitting the 'Expected Error Message' by ';'
                // It will also check whether the number of lines of the error message is same in both the expected and the
                // actual                               
                String elementLocator = PSD_ErrorMsg;
                String elementName = "System Message: Error Message";
                String expectedText = errormessage;
                String LineSeparator = "\n"; //multiple lines would be separated by two lines
					//verifyMultiLineMessage(elementLocator, elementName, expectedText, LineSeparator);
                String actualText = selenium.getText(elementLocator).replaceAll("\\n\\r","");
                Reporter.log("Actual text found:");
                Reporter.log(actualText);
                Reporter.log("Expected text:");
                Reporter.log(expectedText);
                if (actualText.equals(expectedText)){
                	Reporter.log("Expected text matches actual text");
                } else {
                	Reporter.log("Expected text does not match actual text");
                }
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}
