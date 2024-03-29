package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.Exports;

import or.OR;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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
				String Message[] = message.split(" ");
				waitForElementPresentWebdriverWait(attributeName_xpath, QAE_Message, Message[0]);
				verifyElementContainsTextWebdriver(attributeName_xpath, QAE_Message, Message[0], message);
			}
			if (!pagename.equals("")) {
				Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
				Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
				String []PageName = pagename.split(" ");
				verifyElementContainsTextWebdriver(attributeName_xpath, PA_PageName+PageName[0].replace(" ","")+"')]", PageName[0], "Page Name for Package");
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

