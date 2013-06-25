package procedures_NewFramework.AYSmoke.Webcenter.WC_EventPackage;

import org.openqa.selenium.remote.server.handler.AcceptAlert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_HTML_Edit_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'Edit HTML' page")
	public void WC_HTML_Edit_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Edit HTML' Page");
			String[] testdata = datacontainer;
			String propertiessaveprive = testdata[0];
			String build = testdata[1];
			String publishproddev = testdata[2];
			Reporter.log("Input Test Data was retrieved for 'Edit HTML' Page");
//			writeFailure("Given Test Data["+yesno+"] either Incorrect or has not be Scripted ");
			switchToFrameNameIdWebdriver("frmContent");
			if (!propertiessaveprive.equals("")) {
				Reporter.log("Step 1 - Click the Button as ["+propertiessaveprive+"]");
				if (propertiessaveprive.equalsIgnoreCase("Properties")) {
					clickWebdriver(attributeName_xpath, HTML_Properties);
					
				} else if (propertiessaveprive.equalsIgnoreCase("Save")) {
					clickWebdriver(attributeName_xpath, HTML_Save);
					
				} else if (propertiessaveprive.equalsIgnoreCase("Preview Webcenter")) {
					clickWebdriver(attributeName_xpath, HTML_PreviewWebcenter);
					
				} else if (propertiessaveprive.equalsIgnoreCase("")) {
					clickWebdriver(attributeName_xpath, HTML_Preview);
				}
							
			}			
			if (!build.equals("")) {
				Reporter.log("Step 2 - Click the Build Button");
				if (build.equalsIgnoreCase("Build")) {
					clickWebdriver(attributeName_xpath, HTML_Build);
				}
			}			
			if (!publishproddev.equals("")) {
				Reporter.log("Step 3 - Click the Button as ["+publishproddev+"]");
				if (publishproddev.equalsIgnoreCase("Publish To Prod")) {
					clickWebdriver(attributeName_xpath, HTML_PublishToProd);
//					switchToDefaultContentWebdriver();
					alertAccept();
					waitForPageToLoad();
				} else if (publishproddev.equalsIgnoreCase("Publish To Dev")) {
					clickWebdriver(attributeName_xpath, HTML_PublishToDev);
					waitForPageToLoad();
				}
			}		
			switchToDefaultContentWebdriver();
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}

