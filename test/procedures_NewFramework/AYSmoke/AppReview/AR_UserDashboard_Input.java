package procedures_NewFramework.AYSmoke.AppReview;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class AR_UserDashboard_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'AppReview Home' page")
	public void AR_UserDashboard_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'AppReview Home' Page");
			String[] testdata = datacontainer;
			String logout = testdata[0];
			String mainmenu = testdata[1];
			String submenu = testdata[2];
			String viewcreatebundleapplicant = testdata[3];
						
			if (!logout.equals("")) {
				Reporter.log("Step 1 - Clicking on ["+logout+"]");
				clickWebdriver(attributeName_xpath, AR_SuperuserLogin);
				waitForElementPresentWebdriver(attributeName_xpath, AR_Logoff, logout);
				clickWebdriver(attributeName_xpath, AR_Logoff);
				waitForPageToLoadWebdriver();
			}
			if (!mainmenu.equals("")) {
				Reporter.log("Step 2 - Click on ["+mainmenu+"]");
				clickWebdriver(attributeName_xpath, AR_MainSubmenu+mainmenu+"')]");
			}
			if (!submenu.equals("")) {
				Reporter.log("Step 3 - Click on ["+submenu+"]");
				clickWebdriver(attributeName_xpath, AR_MainSubmenu+submenu+"')]");
			}
			if (!viewcreatebundleapplicant.equals("")) {
				Reporter.log("Step 4 - Clicking on ["+viewcreatebundleapplicant+"]");
				driver.navigate().refresh();
				clickWebdriver(attributeName_xpath, AR_MainSubmenu+viewcreatebundleapplicant+"')]");
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}