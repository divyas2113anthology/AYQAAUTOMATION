package procedures_NewFramework.Connect_AY;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class Connect_AdminDashBoard_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This procedure is used to click on Total Users, Total Groups & Total Roles")
	public void Connect_AdminDashBoard_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for Total Users, Total Groups & Total Roles");
			String[] testdata = datacontainer;
			String totalusers = testdata[0];
			String totalgroups = testdata[1];
			String totaltotalroles = testdata[2];
			
			Reporter.log("Input Test Data was retrieved for 'Total Users, Total Groups & Total Roles' Page");
			if (!totalusers.equals("")) {
				Reporter.log("Step 1 - Click the link as ["+totalusers+"]");
				clickWebdriver(attributeName_xpath, MML_TotalUsers);
				waitForPageToLoadWebdriver();
			}

		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}
}
