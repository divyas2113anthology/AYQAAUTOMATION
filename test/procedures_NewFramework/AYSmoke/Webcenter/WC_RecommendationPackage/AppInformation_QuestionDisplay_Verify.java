package procedures_NewFramework.AYSmoke.Webcenter.WC_RecommendationPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class AppInformation_QuestionDisplay_Verify extends CommonSeleniumActions implements OR  {
	
@Test(description="Verifying AppInformation_QuestionDisplay Inputs from webcenter recommendation packahe-configureform-application display")
	
public void AppInformation_QuestionDisplay_Verify() throws Exception{
	try {

		String [] testdata=datacontainer;
		String message=testdata[0];
		String Pagename=testdata[1];
		String verifyUI=testdata[2];
		String treepackage= testdata[3];
		String linktoclick = testdata[4];
		Reporter.log("Input Test Data was retrieved for 'Application Information' Page");
		switchToFrameNameIdWebdriver("frmTreeMenu");
		verifyElementPresentWebdriver(attributeName_xpath, "//a[text()='Logout']", "Logout");
		if(!treepackage.equals("")){
			String [] SplitPackage = treepackage.split(";");
			for (int i = 0; i < SplitPackage.length; i++) 
			{
				writeConsole("Tree Package : "+SplitPackage[i]);
				if (i== SplitPackage.length-1) {
					clickWebdriver(attributeName_linktext, SplitPackage[i]);
					waitForPageToLoadWebdriver();
				}else{
					System.out.println(SplitPackage[i]);
					waitForElementPresentWebdriver(attributeName_xpath, AID_RecPlus, "Tree");
					clickWebdriver(attributeName_xpath, AID_RecPlus);
					waitForPageToLoadWebdriver();
				}
			}
		}
		switchToDefaultContentWebdriver();
		switchToFrameNameIdWebdriver("frmContent");
		if (!message.equals("")){
			
			waitForElementPresentWebdriver(attributeName_xpath,AID_message,message);
			verifyElementContainsTextWebdriver(attributeName_xpath,AID_message,message, message);		

		}
		
		if (!Pagename.equals("")){
			
			verifyElementPresentWebdriver(attributeName_xpath, AID_pagename, Pagename);
			String pagename = getTextWebdriver(attributeName_xpath, AID_pagename);						
			verifyElementContainsTextWebdriver(attributeName_xpath,AID_pagename,pagename, pagename);			
			
		}
		switchToDefaultContentWebdriver();
		if (!verifyUI.equals("")){

			//sendKeys(attributeName_xpath, AID_message);		

		}
		switchToFrameNameIdWebdriver("frmTreeMenu");
		if (!linktoclick.equals("")){
			
			clickWebdriver(attributeName_xpath, ER_linktoclick+linktoclick+"')]");		

		}
		switchToDefaultContentWebdriver();
	}catch (Exception e) {
		writeFailure(e.getLocalizedMessage());
	}
	
}

}



	