package procedures_NewFramework.Connect_AY;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class Connect_MainMenu_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This procedure is used to click on Main menu list item in Connect")
	public void Connect_MainMenu_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Main menu list item");
			String[] testdata = datacontainer;
			String mainmenu = testdata[0];
			String selectsystem = testdata[1];
			String configureclient = testdata[2];
			String manageuser = testdata[3];
			String manageroles = testdata[4];
			String systemactivity = testdata[5];
			String networkstatus = testdata[6];
			
			Reporter.log("Input Test Data was retrieved for 'Manage Users' Page");

			if (!manageuser.equals("")) {
				Reporter.log("Step 2 - Click the link as ["+manageuser+"]");
				clickWebdriver(attributeName_xpath, MML_ManageUsers);
				waitForPageToLoadWebdriver();
			}
			
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}


}
