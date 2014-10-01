package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.PostMessage;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_PostMessage_Input extends CommonSeleniumActions implements OR{
	@Test(description="This Procedure is to perform some input in 'Post Message' page")
	public void WC_PostMessage_Input() throws Exception{
	try {
		writeDetails();
		Reporter.log("Proceed to retrieve Verify Test Data 'Batch Update' page");
		String[]  fpvdatarepo = datacontainer;
		String subject = fpvdatarepo[0];
		String displayuntil = fpvdatarepo[1];
		String message = fpvdatarepo[2];
		String submit = fpvdatarepo[3];
		String back = fpvdatarepo[4];
		Reporter.log("Verify Test Data was retrieved for 'Batch Update' page");
		if (!subject.equals("")) {
			Reporter.log("Step 1 - Type ("+subject+") was displayed correctly");
			sendKeys(attributeName_xpath, PM_Subject, subject);
			
		}
		if (!displayuntil.equals("")) {
			Reporter.log("Step 1 - Type ("+displayuntil+") was displayed correctly");
			String DisplayUntil = requiredDateAndFormat("dd/MM/yyyy", displayuntil);
			sendKeys(attributeName_xpath, PM_DispUntil, DisplayUntil);
			
		}
		if (!message.equals("")) {
			Reporter.log("Step 1 - Type ("+message+") was displayed correctly");
			sendKeys(attributeName_xpath, PM_Message, message);
			
		}
		
		if (!submit.equals("")) 
		{
			Reporter.log("Step 4 - Verify its navigate to ("+submit+") page");
			if(submit.equalsIgnoreCase("Submit"))
			{
				click(PM_Submit);
				waitForPageToLoad();
			}
		}
		if (!back.equals("")) 
		{
			Reporter.log("Step 4 - Verify its navigate to ("+back+") page");
			if(submit.equalsIgnoreCase("Back"))
			{
				click(PM_Back);
				waitForPageToLoad();
			}
		}
		
	} catch (Exception e) {
		writeFailure(e.getLocalizedMessage());
	}
	//endExecutionOrder(j);
//	Reporter.log("##########End of Execution Order ["+j+"]##########");
}


}
