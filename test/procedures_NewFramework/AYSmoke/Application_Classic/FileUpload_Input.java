package procedures_NewFramework.AYSmoke.Application_Classic;

import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

public class FileUpload_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'File Upload ' page")
	public void FileUpload_Input(){
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
				System.out.println("aaa");
				waitForElementPresentWebdriver(attributeName_xpath, EA_UploadBrowser, "Upload Browser");
				attributeNameValue(attributeName_xpath, EA_UploadBrowser).sendKeys(browserfilelocation);
				
			}
			if (!buttons.equals("")) {
				Reporter.log("Step 2 - Click on 'Upload Document' Button");
				if (buttons.equalsIgnoreCase("Upload Document")) {
					waitForPageToLoadWebdriver();
//					waitForElementVisible(EA_UploadDoc, "Upload Document");
//					waitForElementVisibleWebdriver(attributeName_xpath, EA_UploadDoc, buttons);
					waitForElementPresentWebdriver(attributeName_xpath, EA_UploadDoc, buttons);
					clickWebdriver(attributeName_xpath, EA_UploadDoc);				
					//deselectPopUp();
					//selectMainWindowWebdriver();
					recentOpenedPopupSelectWebdriver("Window");
					//driver.switchTo().defaultContent();
					//waitForPageToLoadWebdriver();
				}else if (buttons.equalsIgnoreCase("Upload File")) {
//					waitForElementVisibleWebdriver(attributeName_xpath, EA_UploadDoc, buttons);
					waitForElementPresentWebdriver(attributeName_xpath, EA_UploadMedia, buttons);
//					waitForElementVisible(EA_UploadMedia, "Upload File");
					clickWebdriver(attributeName_xpath, EA_UploadMedia);				
					//deselectPopUp();
					//selectMainWindowWebdriver();
					recentOpenedPopupSelectWebdriver("Window");
				}
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}
