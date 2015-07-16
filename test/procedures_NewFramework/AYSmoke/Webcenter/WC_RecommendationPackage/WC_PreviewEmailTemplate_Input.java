package procedures_NewFramework.AYSmoke.Webcenter.WC_RecommendationPackage;

import or.OR;

import org.openqa.selenium.remote.server.handler.SwitchToWindow;
import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_PreviewEmailTemplate_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some input operation in 'Preview Email Template' page")
	
	public void WC_PreviewEmailTemplate_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Preview Email Template'Page");
			String[] testdata = datacontainer;
			String previewemailtemplate = testdata[0];
			String comments = testdata[1];
			String link = testdata[2];
			String close = testdata[3];
				
			recentPopupSelectWebdriver("Preview");
			
			if(!previewemailtemplate.equals("")){
				Reporter.log("Verify("+previewemailtemplate+")is present");
				waitForElementPresentWebdriver(attributeName_xpath, RR_PreviewEmailTemplate, previewemailtemplate);
				verifyElementContainsTextWebdriver(attributeName_xpath, RR_PreviewEmailTemplate, previewemailtemplate, previewemailtemplate);
			}
			if(!comments.equals("")){
				Reporter.log("Verify("+comments+")is present");
				waitForElementPresentWebdriver(attributeName_xpath, RR_Comments, comments);
				verifyElementContainsTextWebdriver(attributeName_xpath, RR_Comments, comments, comments);
			}			
			if(!close.equals("")){
				Reporter.log("Click on the Button"+close);
				clickWebdriver(attributeName_xpath, RR_Close);
				selectMainWindowWebdriver();
			}
			
						
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}	
	
}
