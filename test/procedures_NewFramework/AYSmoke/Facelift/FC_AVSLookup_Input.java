package procedures_NewFramework.AYSmoke.Facelift;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class FC_AVSLookup_Input extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Operation in 'Address Lookup' page")
	public void FC_AVSLookup_Input() throws Exception{
		try {
		writeDetails();		
//		headerStatement("AddressLookup_Input");
//		startExecutionOrder(j);
//		writeParametersTable();
		Reporter.log("Proceed to retrieve Input Test Data for 'Address Lookup' page");
		String[]  addressidatarepo = datacontainer;
		String addrline1 = addressidatarepo[0];
		String addrline2 = addressidatarepo[1];
		String addrline3 = addressidatarepo[2];
		String addrcitytown = addressidatarepo[3];
		String addrstateprovince = addressidatarepo[4];
		String addrpostalcodezip = addressidatarepo[5];
		String addrcountry = addressidatarepo[6];
		String addrsubmit = addressidatarepo[7];
		Reporter.log("Input Test Data was retrieved for 'Address Lookup' page");
		
		if (!addrcountry.equals("")) {
			Reporter.log("Step 7 - Enter Country as ("+addrcountry+")");
			selectByVisibleTextWebdriver(attributeName_xpath, AL_Country, addrcountry);
//			select(AL_Country, addrcountry);
		}
		
		
		if (!addrcountry.equals("")) {
			Reporter.log("Step 7 - Enter Country as ("+addrcountry+")");
			selectByVisibleTextWebdriver(attributeName_xpath, AL_Country, addrcountry);
//			select(AL_Country, addrcountry);
		}
		
//		selenium.waitForCondition("selenium.isVisible(\"//input[@id='btnValidate']\")", "30000");
		if (!addrline1.equals("")) {
			Reporter.log("Step 1 - Enter Line 1 as ("+addrline1+")");
		//	selenium.focus(AL_Line1);
//			waitForElement(AL_Submit, addrline1);
//			waitForElementVisible(AL_Submit, addrline1);

//			selenium.getBodyText();
			waitForElementPresentWebdriver(attributeName_xpath, AL_Line1, addrline1);
			type(AL_Line1,addrline1);
		}
		if (!addrline2.equals("")) {
			Reporter.log("Step 2 - Enter Line 2 as ("+addrline2+")");
			type(AL_Line2,addrline2);
		}
		if (!addrline3.equals("")) {
			Reporter.log("Step 3 - Enter Line 3 as ("+addrline3+")");
			type(AL_Line3,addrline3);
		}
		if (!addrcitytown.equals("")) {
			Reporter.log("Step 4 - Enter City/Town as ("+addrcitytown+")");
			type(AL_Town, addrcitytown);			
		}
		if (!addrstateprovince.equals("")) {
			Reporter.log("Step 5 - Select State/Province as ("+addrstateprovince+")");
			select(AL_Province, addrstateprovince);
		}
		if (!addrpostalcodezip.equals("")) {
			Reporter.log("Step 6 - Enter Postal Code/Zip as ("+addrpostalcodezip+")");
			type(AL_PostalCode, addrpostalcodezip);
		}
		/*if (!addrcountry.equals("")) {
			Reporter.log("Step 7 - Enter Country as ("+addrcountry+")");
			select(AL_Country, addrcountry);
		}*/
		if (!addrsubmit.equals("")) {
			Reporter.log("Step 8 - Click on ("+addrsubmit+") Button");
			waitForElementPresentWebdriver(attributeName_xpath, AL_Submit, addrsubmit);
			clickWebdriver(attributeName_xpath, AL_Submit);
			writeConsole("Submit");
			waitForPageToLoadWebdriver();
			if (isElementPresentWebdriver(attributeName_xpath,AL_AddressLink)) {
				clickWebdriver(attributeName_xpath, AL_AddressLink);
			}
			waitForPageToLoadWebdriver();
			clickWebdriver(attributeName_xpath, AL_AddressLink);
		}
		selectMainWindowWebdriver();
		recentOpenedPopupSelectWebdriver("Select Previous Window");
		
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

}
