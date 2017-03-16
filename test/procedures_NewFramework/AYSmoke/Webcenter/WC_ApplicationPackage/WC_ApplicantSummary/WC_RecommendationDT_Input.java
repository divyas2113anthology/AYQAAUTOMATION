package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.WC_ApplicantSummary;


import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

import java.util.Iterator;
import java.util.Set;

public class WC_RecommendationDT_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some input operation in 'Recommendation DT' page")
	
	public void WC_RecommendationDT_Input(){
		
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Recommendation DT'Page");
			System.out.println("Recommendation procedure");
			String[] testdata = datacontainer;
			String editprofile = testdata[0];
			String online = testdata[1];
			String email = testdata[2];
			String status = testdata[3];
			String verifystatus = testdata[4];
			String closewindow = testdata[5];
			String SwitchWebcenterWindow = testdata[6];

			//recentPopupSelectWebdriver("Recommendation");
			recentPopupSelect_without_window_nameWebdriver();
			
			 RecommendationDTwindow = driver.getWindowHandle();
			if (!online.equals("")) {
				Reporter.log("Verify the Text ["+online+"]");
				waitForElementPresentWebdriver(attributeName_xpath, RD_Online, online);
				verifyElementContainsTextWebdriver(attributeName_xpath, RD_Online,online,online);
			}
			if(!verifystatus.equals("")){
				waitForPageToLoadWebdriver();
				System.out.println("Verification");
				Reporter.log("Verify("+verifystatus+")is present");
				waitForElementPresentWebdriver(attributeName_xpath, RD_VerifyStatus+verifystatus+"')]", verifystatus);
				verifyElementContainsTextWebdriver(attributeName_xpath, RD_VerifyStatus+verifystatus+"')]", verifystatus, verifystatus);
				
			}
			if(!status.equals("")){
				Reporter.log("Click on the Status"+status);
				waitForElementPresentWebdriver(attributeName_xpath, RD_VerifyStatus+status+"')]", status);
				clickWebdriver(attributeName_xpath, RD_VerifyStatus+status+"')]");
			}
			if(!closewindow.equals("")){

				Reporter.log("Click on the Button"+closewindow);
				//clickWebdriver(attributeName_xpath, RD_CloseWindow);
				System.out.println("Old Window");

				//recentPopupClose();
				switchToOldWindow();
				Thread.sleep(5000);
			}
			if (!SwitchWebcenterWindow.equals("")){
				System.out.println("Switching to Web center window");
				switchToSecondPopupWindow();
			}
			//driver.switchTo().window(AppSummaryWindowName);
			
			} catch (Exception e) {
				writeFailure(e.getLocalizedMessage());
			}
	}	
}
