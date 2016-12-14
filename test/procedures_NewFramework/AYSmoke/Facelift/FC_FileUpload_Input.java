package procedures_NewFramework.AYSmoke.Facelift;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class FC_FileUpload_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'File Upload ' page")
	public void FC_FileUpload_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'File Upload' Page");
			String[] testdata = datacontainer;
			String browserfilelocation = testdata[0];
			String buttons = testdata[1];			
			Reporter.log("Input Test Data was retrieved for 'File Upload' Page");
//			writeFailure("Given Test Data["+yesno+"] either Incorrect or has not be Scripted ");
			if (!browserfilelocation.equals("")) {
				Reporter.log("Step 1 - Browser a Document From location["+browserfilelocation+"]");
//				Runtime.getRuntime().exec("T:/WebProducts/QA/SeleniumScripts/AY/AutoIT/Application/UploadFile.exe \""+browserfilelocation+"\"");
//				click(EA_UploadBrowser);
//				sendKeys(attributeName_xpath, EA_UploadBrowser, browserfilelocation);
//				attributeNameValue(attributeName_xpath, EA_UploadBrowser).sendKeys(browserfilelocation);
				waitForElementPresentWebdriverWait(attributeName_xpath, EA_UploadBrowser, "Upload Browser");
				sendKeysType(attributeName_xpath, EA_UploadBrowser, browserfilelocation);
			}
			if (!buttons.equals("")) {
				Reporter.log("Step 2 - Click on 'Upload Document' Button");
				if (buttons.equalsIgnoreCase("Upload Document")) {
					waitForElementVisibleWebdriver(attributeName_xpath, EA_UploadDoc, buttons);
//					waitForElementVisible(EA_UploadDoc, buttons);
					clickWebdriver(attributeName_xpath, EA_UploadDoc);
					//switchToOldWindow();
					//deselectPopUp();
					//selectMainWindowWebdriver();
					//waitForPageToLoadWebdriver();
					Thread.sleep(10000);

				}else if (buttons.equalsIgnoreCase("Upload File")) {
					waitForElementVisibleWebdriver(attributeName_xpath, EA_UploadMedia, buttons);
//					waitForElementVisible(EA_UploadMedia, buttons);
					clickWebdriver(attributeName_xpath, EA_UploadMedia);				
					//deselectPopUp();
					//selectMainWindowWebdriver();
					waitForPageToLoadWebdriver();
				}
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}
