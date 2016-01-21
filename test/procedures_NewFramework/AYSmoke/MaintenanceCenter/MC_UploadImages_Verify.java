package procedures_NewFramework.AYSmoke.MaintenanceCenter;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class MC_UploadImages_Verify extends CommonSeleniumActions implements OR{
	@Test(description="This Procedure is to perform some Operation in 'Upload Images' page")
	public void MC_UploadImages_Verify()throws Exception{
		try{
			Reporter.log("Proceed to verify in 'Upload Images' page");
			String[] testdata = datacontainer;
			String message = testdata[0];
			String page = testdata[1];
			String verifyui = testdata[2];
			Reporter.log("Verify the navigation to 'Upload Images' page");
			if (!message.equals("")) {
				Reporter.log("Step 1 - Verify message is ["+message+"]");
//				waitForElementPresentWebdriver(attributeName_id, "divAyConfirmation", message);
//				verifyElementContainsTextWebdriver(attributeName_id, "divAyConfirmation", message, message);
				
				waitForText(message, message);
				verifyTextPresent(message);
				
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
