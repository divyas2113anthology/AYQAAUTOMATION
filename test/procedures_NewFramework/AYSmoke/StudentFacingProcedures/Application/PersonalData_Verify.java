package procedures_NewFramework.AYSmoke.StudentFacingProcedures.Application;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class PersonalData_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Personal Data' page")
		public void PersonalData_Verify() throws Exception{
		try {
			writeDetails();
//			headerStatement("PersonalData_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data 'Personal Data' page");
			String[]  fpvdatarepo = datacontainer;
			String successmessage = fpvdatarepo[0];
			String errormessage = fpvdatarepo[1];
			String pagename = fpvdatarepo[2];
			String verifyui = fpvdatarepo[3];
			Reporter.log("Verify Test Data was retrieved for 'Personal Data' page");
			if (!successmessage.equals("")) {
				Reporter.log("Step 1 - Verify Message("+successmessage+") was displayed correctly");
				Thread.sleep(12000);
				if (successmessage.equals("Congratulations")) {
					verifyElementPresentWebdriver(attributeName_xpath, BU_BR_Submit, successmessage);
				}
				else if (selenium.isTextPresent(successmessage)) {
					Reporter.log("Message("+successmessage+") was displayed correctly");
				} else {
					writeFailure("Message("+successmessage+") was not displayed correctly");
				}
			}
			
			if (!errormessage.equals("")) {
				Reporter.log("Step 3 - Verify Success Message:("+errormessage+") was displayed correctl");
				String[] errormessage1 = errormessage.split(";");
				waitForElementPresentWebdriver(attributeName_xpath, PD_ErrorMsg, errormessage);
				for (int i = 0; i < errormessage1.length; i++) {
					verifyElementContainsTextWebdriver(attributeName_xpath, PD_ErrorMsg, errormessage1[i], "System Message:");
				}
//				String errormessage1 = errormessage.replace(";", "\n");
//				verifyElementPresentWebdriver(attributeName_xpath, PD_ErrorMsg, errormessage1);
/*				if (errormessage.contains(";")) {
//				String errormessage1 = errormessage.replace(";", "\n");
				errormessage = errormessage.replace(";", "\n");
				System.out.println("Verify Message : "+errormessage);
				}
					verifyElementText(PD_ErrorMsg, errormessage, "System Message:");*/
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
//                String elementLocator = PD_ErrorMsg;
//                String elementName = "System Message: Error Message";
//                String expectedText = errormessage;
//                String LineSeparator = "\n\n"; //multiple lines would be separated by two lines
//					verifyMultiLineMessage(elementLocator, elementName, expectedText, LineSeparator);
				}
			if (!pagename.equals("")) {
				Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
				if (selenium.isTextPresent(pagename)) {
					Reporter.log("Its navigate to 'Update Profile' page");
				} else {
					writeFailure("Its not navigate to 'Update Profile' page");
				}			
			}
			if (!verifyui.equals("")) {
				Reporter.log("Step 3 - Verify Message("+verifyui+") was displayed correctly");
				if(verifyui.equals("Virginia"))
					verifyElementPresentWebdriver(attributeName_xpath, BU_PD_State, verifyui);
				else if(verifyui.equals("Business Rules"))
					verifyElementPresentWebdriver(attributeName_xpath, BU_PD_BRules, verifyui);
				else if(verifyui.equals("09/23/2014")){
					Date date = new Date();  
					DateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
					String sysdate = dateFormat.format(date);
					System.out.println(sysdate);
					verifyElementPresentWebdriver(attributeName_xpath, BU_PD_DOB, sysdate);
					}
				else if(verifyui.equals("F"))
						verifyElementPresentWebdriver(attributeName_xpath, BU_PD_DOB, verifyui);
				else
					verifyElementPresentWebdriver(attributeName_xpath, BU_PD_AD_SportsInterest, verifyui);
				
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}
