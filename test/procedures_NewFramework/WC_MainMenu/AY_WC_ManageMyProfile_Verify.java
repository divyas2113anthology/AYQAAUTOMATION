package procedures_NewFramework.WC_MainMenu;

import or.OR;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class AY_WC_ManageMyProfile_Verify extends CommonSeleniumActions implements OR {
	
	@Test(description="This procedure is used to perform some operations in 'Manage My Profile'")
	public void AY_WC_ManageMyProfile_Verify(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Manage My Profile' Page");
			String[] testdata = datacontainer;
			String useridpresent = testdata[0];
			String firstnamepresent = testdata[1];
			String lastnamepresent = testdata[2];
			String emailidpresent = testdata[3];
			String defaultproductcheck = testdata[4];
			String text_app,text_crm;
			Reporter.log("Input Test Data was retrieved for 'Manage My Profile' Page");
			
			if (!lastnamepresent.equals("")) {
				Reporter.log("Step 1 - Verify Last Name matches with Connect");
				verifyElementPresentWebdriver(attributeName_xpath, WMMP_LastName, lastnamepresent);
				
			}
			
			
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}
