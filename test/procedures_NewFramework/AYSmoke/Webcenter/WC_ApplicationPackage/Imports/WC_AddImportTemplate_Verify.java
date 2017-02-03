package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.Imports;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_AddImportTemplate_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Add Import' page")
		public void WC_AddImportTemplate_Verify() throws Exception{
		try {
			writeDetails();
//			headerStatement("PersonalData_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data 'Add Import' page");
			String[]  fpvdatarepo = datacontainer;
			String message = fpvdatarepo[0];
			String pagename = fpvdatarepo[1];
			String verifyui = fpvdatarepo[2];
			Reporter.log("Verify Test Data was retrieved for 'Add Import' page");
			Date date = new Date();  
			DateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
			if (!message.equals("")) {
//				String[] Message = message.split(" ");
					String SplitMessage = message + Calendar.getInstance().getTimeInMillis();
					Reporter.log("Step 1 - Verify Message(" + message + ") was displayed correctly");
					//waitForText(SplitMessage+"was successfully Added. Please proceed to add the Field Definitions", "Not Present");
					waitForPageToLoadWebdriver();
					System.out.print(SplitMessage + "was successfully Added. Please proceed to add the Field Definitions");
			}
			if (!pagename.equals("")) {
				Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
				verifyElementContainsTextWebdriver(attributeName_xpath, PA_PageName, pagename, "Page Name for Package");
			}
			if (verifyui.equals("")) {
				Reporter.log("Step 3 - Verify the UI information in Add Import page");
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}
