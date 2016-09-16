package procedures_NewFramework.AYSmoke.MaintenanceCenter;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class MC_ClientSearch_Input extends CommonSeleniumActions implements OR{
	@Test(description="This Procedure is to perform some Operation in 'Client Search' page")
	public void MC_ClientSearch_Input(){
	try{
		Reporter.log("Proceed to enter client ID in manage client screen of Maintenance center");
		String[] testdata = datacontainer;
		String searchfor = testdata[0];
		String searchin = testdata[1];
		String button = testdata[2];
		Reporter.log("Check user entered client id and click search button in Maintenance center");
		if (!searchfor.equals("")) {
			Reporter.log("Step 1 - Input searching for as ["+searchfor+"]");
//			type(MCL_Searchfor, searchfor);	
			sendKeys(attributeName_name, "srchString", searchfor);
		}
		if (!searchin.equals("")) {
			Reporter.log("Step 2 - Select search in as ["+searchin+"]");
			select(MCL_SearchIn, searchin);	
			if (searchfor.equalsIgnoreCase("Client ID")) {
				clickWebdriver(attributeName_xpath, MCS_ClientID);
			}else if (searchfor.equalsIgnoreCase("Client Name")) {
				clickWebdriver(attributeName_xpath, MCS_ClientName);
			}
		}
		if (!button.equals("")) {
			if (button.equalsIgnoreCase("search")) {
//				click(MCL_Searchbutton);
				clickWebdriver(attributeName_xpath, MCL_Searchbutton);
				waitForPageToLoadWebdriver();
			}		
		}
	}catch(Exception e){
		writeFailure(e.getLocalizedMessage()); }
	}

}
