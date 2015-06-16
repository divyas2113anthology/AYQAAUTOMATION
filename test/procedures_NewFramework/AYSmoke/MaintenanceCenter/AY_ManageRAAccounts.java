package procedures_NewFramework.AYSmoke.MaintenanceCenter;


import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class AY_ManageRAAccounts extends CommonSeleniumActions implements OR{
	@Test(description="This Procedure is to perform some Operation in 'Manage RA Accounts' page")
	public void AY_ManageRAAccounts(){
		try{
			Reporter.log("Proceed to retrieve Input Test Data for 'Manage RA Accounts'");
			String[] testdata = datacontainer;
			String clickname = testdata[0];
			String checkboxagainstname = testdata[1];
			String addprintdelete = testdata[2];
			Reporter.log("Check user click on Manage client link in Maintenance center");
			
			if (!clickname.equals("")) {
				Reporter.log("Click on ["+clickname+"]");
				waitForElementPresentWebdriver(attributeName_xpath, MCL_ClickRAName+clickname+"')]", clickname);
				clickWebdriver(attributeName_xpath, MCL_ClickRAName+clickname+"')]");
			}
			if (!addprintdelete.equals("")) {
				Reporter.log("Click on ["+addprintdelete+"]");
				clickWebdriver(attributeName_xpath, MCL_addprintdelete+addprintdelete+"')]");
				waitForPageToLoadWebdriver();
				}
//				
			
		
		}catch(Exception e){
			writeFailure(e.getLocalizedMessage());
		}
	}

}
