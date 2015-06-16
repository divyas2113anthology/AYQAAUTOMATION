package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.Email;


import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_ApplicationAddFilter_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some input operation in 'Application-Add Filter' page")
	
	public void WC_ApplicationAddFilter_Input(){
		
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Application-Add Filter'Page");
			String[] testdata = datacontainer;
			String filtername = testdata[0];
			String description = testdata[1];
			String field = testdata[2];
			String operator = testdata[3];
			String value = testdata[4];
			String adddeleterow = testdata[5];
			String verifyvalue = testdata[6];
			String savecancel = testdata[7];
			//recentPopupSelect_without_window_nameWebdriver();
			if(!filtername.equals("")){
				Reporter.log("Enter the Filter Nmae as("+filtername+")");
				sendKeys(attributeName_xpath, ET_FilterName, filtername);
				
			}
			if(!description.equals("")){
				Reporter.log("Enter the Description as("+description+")");
				sendKeys(attributeName_xpath, ET_Description, description);
				
			}
			if (!field.equals("")) {
				Reporter.log("Select ("+field+")");
				selectByVisibleTextWithSpaceWebdriver(attributeName_xpath, ET_FieldName, field);
				//selectByVisibleTextWebdriver(attributeName_xpath, ET_FieldName, field);
			}
			if (!operator.equals("")) {
				Reporter.log("Select ("+operator+")");
				selectByVisibleTextWebdriver(attributeName_xpath, ET_Operator, operator);
			}
			
			if (!value.equals("")) {
				Reporter.log("Select ("+value+")");
				waitForElementPresentWebdriver(attributeName_xpath, ET_Value, value);
				clickWebdriver(attributeName_xpath, ET_Value);
				waitForElementPresentWebdriver(attributeName_xpath, MCL_CheckValue+value+"']", value);
				checkWebdriver(attributeName_xpath, MCL_CheckValue+value+"']");
				clickWebdriver(attributeName_xpath, MQ_MulitSelectClose);
			}
			if(!verifyvalue.equals("")){
				Reporter.log("Verify"+verifyvalue);
				waitForElementPresentWebdriver(attributeName_xpath, ET_Value, verifyvalue);
				clickWebdriver(attributeName_xpath, ET_Value);
				verifyElementContainsTextWebdriver(attributeName_xpath, MCL_VerifyValue+verifyvalue+"')]", verifyvalue, verifyvalue);
			}	
			if (!savecancel.equals("")) {
				Reporter.log("Clicking on : ("+savecancel+")");
				if(savecancel.equalsIgnoreCase("add")){
					waitForElementPresentWebdriver(attributeName_xpath,BR_Add, savecancel);
					clickWebdriver(attributeName_xpath,BR_Add);
				}
				else if(savecancel.equalsIgnoreCase("save")){
					clickWebdriver(attributeName_xpath, BR_Save);
				}
				else if(savecancel.equalsIgnoreCase("cancel")){
					clickWebdriver(attributeName_xpath, BR_Cancel);
				}
								
			}
				
			} catch (Exception e) {
				writeFailure(e.getLocalizedMessage());
			}
	}	
}

