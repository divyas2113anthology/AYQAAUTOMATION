package procedures_NewFramework.AYSmoke.StudentFacingProcedures;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

import java.util.Iterator;

public class AVSLookUp_Input extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Operation in 'LookUp' page")
	public void AVSLookUp_Input() throws Exception{
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
				waitForElementPresentWebdriver(attributeName_xpath, nameID, avsname);
				sendKeys(attributeName_xpath,nameID, avsname);
			}
			if (!avsaddressline1.equals("")) {
				Reporter.log("Step 2 - Enter Address Line 1 as ("+avsaddressline1+")");
				String addrlineID = getElementIDbyLabel("Address Line 1:",EL_AddressLine1);
				sendKeys(attributeName_xpath,addrlineID, avsaddressline1);
			}
			if (!avscity.equals("")) {
				Reporter.log("Step 3 - Enter City as ("+avscity+")");
				String cityID = getElementIDbyLabel("City:",EL_City);
				sendKeys(attributeName_xpath,cityID, avscity);
			}
			if (!avsstate.equals("")) {
				Reporter.log("Step 4 - Enter State as ("+avsstate+")");
				String stateID = getElementIDbyLabel("State:",EL_State);
				sendKeys(attributeName_xpath,stateID, avsstate);
			}
			if (!avscountry.equals("")) {
				Reporter.log("Step 5 - Enter Country as ("+avscountry+")");
				String countryID = getElementIDbyLabel("Country:",EL_Country);
				sendKeys(attributeName_xpath,countryID, avscountry);
			}
			if (!avssearch.equals("")) {
				Reporter.log("Step 6 - Click on ("+avssearch+") Button");
				if (avssearch.equalsIgnoreCase("search")) {
					Iterator<String> popwindow = driver.getWindowHandles().iterator();
					Thread.sleep(5000);
					clickWebdriver(attributeName_xpath,EL_searchclose+avssearch+"']");
					//clickWebdriver(attributeName_xpath,"//*[@alt='"+avssearch+"']");
					Reporter.log(" Click on ("+avsname+") Link");
					clickWebdriver(attributeName_xpath,EL_hslink+avsname+"')]");
					String parentWindow = popwindow.next();
					driver.switchTo().window(parentWindow);
					//selectMainWindowWebdriver();
				}else if (avssearch.equalsIgnoreCase("close window")) {
					clickWebdriver(attributeName_xpath,EL_searchclose+avssearch+"']");
					Thread.sleep(500);
					selectMainWindowWebdriver();
				}
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

}
