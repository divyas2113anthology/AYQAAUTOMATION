package procedures_NewFramework.AYSmoke.MaintenanceCenter;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class MC_UploadCodeLookUp_Verify extends CommonSeleniumActions implements OR{
	@Test(description="This Procedure is to perform some Operation in 'Upload Code LookUp' page")
	public void MC_UploadCodeLookUp_Verify()throws Exception{
		try{
			Reporter.log("Proceed to verify in 'Upload Code LookUp' page");
			String[] testdata = datacontainer;
			String message = testdata[0];
			String page = testdata[1];
			String verifyui = testdata[2];
			Reporter.log("Verify the navigation to 'Upload Code LookUp' page");
			if (!message.equals("")) {
				Reporter.log("Step 1 - Verify message is ["+message+"]");
				waitForElementPresentWebdriver(attributeName_xpath, IR_MessageContent, message);
				verifyElementContainsTextWebdriver(attributeName_xpath, IR_MessageContent, message, message);
			}
			if (!page.equals("")) {
				Reporter.log("Step 2 - Verify Page Name As ["+page+"]");
				waitForElementPresentVerifyContainsTextWebdriver(attributeName_xpath, "//div[@id='AYInstructions']/following-sibling::font", page, "Page Name");			
			}
			if (!verifyui.equals("")) {
				
			}
		
		}catch(Exception e){
			writeFailure(e.getLocalizedMessage());
		}
	}

}