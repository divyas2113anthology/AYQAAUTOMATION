package procedures_NewFramework.AYSmoke.Facelift;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class FC_CEEBLookUp_Input extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Operation in 'LookUp' page")
	public void FC_CEEBLookUp_Input() throws Exception{
		try {
			writeDetails();
//			headerStatement("AVSLookUp_Input");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Input Test Data for 'LookUp' page");
			String[]  lookupidatarepo = datacontainer;
			String avsname = lookupidatarepo[0];
			String avsaddressline1 = lookupidatarepo[1];
			String avscity = lookupidatarepo[2];
			String avsstate = lookupidatarepo[3];
			String avscountry = lookupidatarepo[4];
			String avssearch = lookupidatarepo[5];
			Reporter.log("Input Test Data was retrieved for 'LookUp' page");
			if (!avsname.equals("")) {
				Reporter.log("Step 1 - Enter Name as ("+avsname+")");
				String nameID = getElementIDbyLabel("Name:",EL_Name);	
				waitForElementPresent(nameID, "Look Up Page 'Name' Element");
				type(nameID, avsname);
			}
			if (!avsaddressline1.equals("")) {
				Reporter.log("Step 2 - Enter Address Line 1 as ("+avsaddressline1+")");
				String addrlineID = getElementIDbyLabel("Address Line 1:",EL_AddressLine1);				
				type(addrlineID, avsaddressline1);
			}
			if (!avscity.equals("")) {
				Reporter.log("Step 3 - Enter City as ("+avscity+")");
				String cityID = getElementIDbyLabel("City:",EL_City);				
				type(cityID, avscity);
			}
			if (!avsstate.equals("")) {
				Reporter.log("Step 4 - Enter State as ("+avsstate+")");
				String stateID = getElementIDbyLabel("State:",EL_State);				
				type(stateID, avsstate);
			}
			if (!avscountry.equals("")) {
				Reporter.log("Step 5 - Enter Country as ("+avscountry+")");
				String countryID = getElementIDbyLabel("Country:",EL_Country);				
				type(countryID, avscountry);
			}
			if (!avssearch.equals("")) {
				Reporter.log("Step 6 - Click on ("+avssearch+") Button");
				if (avssearch.equalsIgnoreCase("search")) {
//					click(EL_searchclose+avssearch+"']");
					clickWebdriver(attributeName_xpath,CB_Search);
//					waitForPageToLoad();
					Reporter.log(" Click on ("+avsname+") Link");
					clickWebdriver(attributeName_xpath,EL_hslink+avsname+"')]");
//					selectMainWindow();
				}else if (avssearch.equalsIgnoreCase("close window")) {
					click(EL_searchclose+avssearch+"']");
//					selectMainWindow();
				}
			}
			selectMainWindowWebdriver();
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

}
