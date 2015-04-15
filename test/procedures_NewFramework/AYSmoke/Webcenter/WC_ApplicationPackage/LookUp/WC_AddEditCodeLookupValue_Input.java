package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.LookUp;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_AddEditCodeLookupValue_Input extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some input in 'Add/Edit Code Lookup' page")
		public void WC_AddEditCodeLookupValue_Input() throws Exception{
		try {
			writeDetails();

			Reporter.log("Proceed to retrieve input Test Data 'Add/Edit Code Lookup' page");
			String[]  fpvdatarepo = datacontainer;
			String code = fpvdatarepo[0];
			String name = fpvdatarepo[1];
			String address1 = fpvdatarepo[2];
			String city = fpvdatarepo[3];
			String state = fpvdatarepo[4];
			String country = fpvdatarepo[5];
			String addresslist = fpvdatarepo[6];
			String backsearch = fpvdatarepo[7];
			
			Reporter.log("Verify Test Data was retrieved for 'Add/Edit Code Lookup' page");
			if (!code.equals("")) {
				Reporter.log("Step 1 - Enter the value as ("+code+")");
				sendKeys(attributeName_xpath, CL_Code, code);
			}
			if (!name.equals("")) {
				Reporter.log("Step 2 - Enter the value as ("+name+")");
				sendKeys(attributeName_xpath, CL_Name, name);
			}
			if (!address1.equals("")) {
				Reporter.log("Step 3 - Enter the value as ("+address1+")");
				sendKeys(attributeName_xpath, CL_Address1, address1);
			}
			if (!city.equals("")) {
				Reporter.log("Step 4 - Enter the value as ("+city+")");
				sendKeys(attributeName_xpath, CL_City, city);
			}
			if (!state.equals("")) {
				Reporter.log("Step 5 - Enter the value as ("+state+")");
				String newstate = getTextWebdriver(attributeName_xpath, CL_State);
				System.out.println(newstate);
				if(newstate.equals("IL")){
					clear(attributeName_xpath, CL_State);
					sendKeys(attributeName_xpath, CL_State, "VI");
				}else if(newstate.equals("VI"))
				{
					clear(attributeName_xpath, CL_State);
					sendKeys(attributeName_xpath, CL_State, "IL");	
				}
				
			}
			if (!country.equals("")) {
				Reporter.log("Step 6 - Enter the value as ("+country+")");
				sendKeys(attributeName_xpath, CL_Country, country);
			}
			if (!addresslist.equals("")) {
				Reporter.log("Step 7 - Clicking on ("+addresslist+")");
				waitForElementPresentWebdriver(attributeName_xpath,CL_AddressList,addresslist);
				clickWebdriver(attributeName_xpath, CL_AddressList);
				//doubleClickWebdriver(attributeName_xpath, CL_AddressList);
			}
			if (!backsearch.equals("")) {
				Reporter.log("Step 8 - Clicking on ("+backsearch+")");
				clickWebdriver(attributeName_xpath, CL_BackSearch+backsearch+"')]");
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}
