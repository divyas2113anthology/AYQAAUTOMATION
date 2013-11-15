package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.Exports;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_AddExportTemplate_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Add Export Template' page")
		public void WC_AddExportTemplate_Verify() throws Exception{
		try {
			writeDetails();
//			headerStatement("PersonalData_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data 'Add Export Template' page");
			String[]  fpvdatarepo = datacontainer;
			String message = fpvdatarepo[0];
			String pagename = fpvdatarepo[1];
			String verifyui = fpvdatarepo[2];
			Reporter.log("Verify Test Data was retrieved for 'Add Export Template' page");
			Date date = new Date();  
			DateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
			if (!message.equals("")) {
//				String[] Message = message.split(" ");
//				String SplitMessage = message+Calendar.getInstance().getTimeInMillis();
				String ExportName = message+dateFormat.format(date)+Calendar.getInstance().getTimeInMillis();	
				Reporter.log("Step 1 - Verify Message("+message+") was displayed correctly");
				waitForText(ExportName+"was successfully Added. Please proceed to add the Field Definitions", "Not Present");
				waitForElementPresentWebdriver(attributeName_xpath, QAE_Message, message);
				verifyElementContainsTextWebdriver(attributeName_xpath, QAE_Message, ExportName+"was successfully Added. Please proceed to add the Field Definitions", message);
				verifyTextPresent(ExportName+"was successfully Added. Please proceed to add the Field Definitions");
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

