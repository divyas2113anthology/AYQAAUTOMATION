package procedures_NewFramework.AYSmoke.MaintenanceCenter;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class MC_RunPrintTasks_Verify extends CommonSeleniumActions implements OR{
	@Test(description="This Procedure is to perform some Operation in 'Run Print Task' page")
	public void MC_RunPrintTasks_Verify()throws Exception{
		try{
			Reporter.log("Proceed to verify sucessfully login to Maintenance center");
			String[] testdata = datacontainer;
			String message = testdata[0];
			String page = testdata[1];
			Reporter.log("Check login to Maintenance center");
			if (!message.equals("")) {
				Reporter.log("Step 1 - Verify message is ["+message+"]");
				waitForElementNotPresentWebdriver(attributeName_id, "processingImage", "AYSchedPrinting");
				verifyTextPresent(message);				
			}
			if (!page.equals("")) {
				Reporter.log("Step 2 - Verify Page Name As ["+page+"]");
				waitForElementPresentVerifyContainsTextWebdriver(attributeName_xpath, "//div[@id='AYInstructions']/following-sibling::font", page, "Page Name");			
			}
		
		}catch(Exception e){
			writeFailure(e.getLocalizedMessage());
		}
	}

}


