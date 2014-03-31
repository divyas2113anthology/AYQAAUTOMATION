package procedures_NewFramework.Connect_AY;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class Connect_Mainmenu_Manageusers_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This procedure is used to click on Main menu :: Manage Users page")
	public void Connect_Mainmenu_Manageusers_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Main menu :: Manage Users page");
			String[] testdata = datacontainer;
			String add = testdata[0];
			String lastname = testdata[1];
			String go = testdata[2];
			
			Reporter.log("Input Test Data was retrieved for 'Main menu :: Manage Users' Page");

			if (!add.equals("")) {
				Reporter.log("Step 2 - Click the link as ["+add+"]");
				clickWebdriver(attributeName_xpath, MML_Add);
				waitForPageToLoadWebdriver();
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}


}
