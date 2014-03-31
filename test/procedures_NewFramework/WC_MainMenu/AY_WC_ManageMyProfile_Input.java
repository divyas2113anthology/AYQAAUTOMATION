package procedures_NewFramework.WC_MainMenu;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class AY_WC_ManageMyProfile_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This procedure is used to perform some operations in 'Manage My Profile'")
	public void AY_WC_ManageMyProfile_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Manage My Profile' Page");
			String[] testdata = datacontainer;
			String userid = testdata[0];
			String firstname = testdata[1];
			String lastname = testdata[2];
			String title = testdata[3];
			String emailid =testdata[4];
			String savecancel = testdata[5];
			String crm = testdata[6];
			
			Reporter.log("Input Test Data was retrieved for 'Manage My Profile' Page");
			
			if (!lastname.equals("")) {
				Reporter.log("Step 3 - Edit Last Name as ["+lastname+"]");
				sendKeys(attributeName_xpath, WMMP_LastName, lastname);
				waitForPageToLoadWebdriver();
			}
			
			if (!savecancel.equals("")) {
				Reporter.log("Step 6 - Click on Save or Cancel");
				
				if (savecancel.equalsIgnoreCase("save")) {
					clickWebdriver(attributeName_xpath, WMMP_Save);
					waitForPageToLoadWebdriver();
				}else if (savecancel.equalsIgnoreCase("cancel")) {
					clickWebdriver(attributeName_xpath, WMMP_Cancel);
					waitForPageToLoadWebdriver();
				}
			}
			if (!crm.equals("")) {
				Reporter.log("Step 7 - Click on CRM to redirect to Connect Page");
				clickWebdriver(attributeName_xpath, WMMP_CRM);
				waitForPageToLoadWebdriver();
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}
}
