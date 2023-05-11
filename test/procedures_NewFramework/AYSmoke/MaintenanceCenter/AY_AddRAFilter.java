package procedures_NewFramework.AYSmoke.MaintenanceCenter;



import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class AY_AddRAFilter extends CommonSeleniumActions implements OR{
	@Test(description="This Procedure is to perform some Operation in 'Manage RA Accounts-Filter' page")
	public void AY_AddRAFilter(){
		try{
			Reporter.log("Proceed to retrieve Input Test Data for 'Manage RA Accounts-Filter' page");
			String[] testdata = datacontainer;
			String name = testdata[0];
			String description = testdata[1];
			String field = testdata[2];
			String operator = testdata[3];
			String value = testdata[4];
			String minusplusbutton = testdata[5];
			String savecancel = testdata[6];
			String validationmessage = testdata[7];
			String verifyvalue = testdata[8];
			
			
			if(!name.equals("")){
				Reporter.log("Enter the Filter Nmae as("+name+")");
				waitForElementPresentWebdriver(attributeName_xpath, ET_FilterName, name);
				sendKeys(attributeName_xpath, ET_FilterName, name);
				
			}
			if(!description.equals("")){
				Reporter.log("Enter the Description as("+description+")");
				sendKeys(attributeName_xpath, ET_Description, description);
				
			}
			if (!field.equals("")) {
				Reporter.log("Select ("+field+")");
				selectByVisibleTextWithSpaceWebdriver(attributeName_xpath, ET_FieldName, field);
				sleep(2);//Added by Rahul Mehta on 14th March 2019
			}
			if (!operator.equals("")) {
				Reporter.log("Select ("+operator+")");
				selectByVisibleTextWebdriver(attributeName_xpath, ET_Operator1, operator);
				sleep(2);//Added by Rahul Mehta on 14th March 2019
			}
			if (!value.equals("")) {
				Reporter.log("Select ("+value+")");
				String valuedata = Runtimedataread(value);
				waitForElementPresentWebdriver(attributeName_xpath, ET_Value, value);
				clickWebdriver(attributeName_xpath, ET_Value);
				waitForElementPresentWebdriver(attributeName_xpath, MCL_CheckValue+value+"']", value);
				//clickWebdriver(attributeName_xpath, MCL_CheckValue+value+"']");
				checkWebdriver(attributeName_xpath, MCL_CheckValue+value+"']");
				sleep(2);
				
			}
			if(!savecancel.equals("")){
				Reporter.log("Click on the Button"+savecancel);
				clickWebdriver(attributeName_xpath, ET_SaveCancel+savecancel+"')]");
				waitForPageToLoadWebdriver();
			}		
			
			if(!verifyvalue.equals("")){
				Reporter.log("Verify"+savecancel);
				if(verifyvalue.equalsIgnoreCase("TestingRAAccount")){
					String data = Runtimedataread(verifyvalue);
					waitForElementPresentWebdriver(attributeName_xpath, ET_Value1, verifyvalue);
					clickWebdriver(attributeName_xpath, ET_Value1);
					verifyElementContainsTextWebdriver(attributeName_xpath, MCL_VerifyValue+data+"')]", data, verifyvalue);
				}else {
					waitForElementPresentWebdriver(attributeName_xpath, ET_Value, verifyvalue);
					clickWebdriver(attributeName_xpath, ET_Value);
					verifyElementContainsTextWebdriver(attributeName_xpath, MCL_VerifyValue + verifyvalue + "')]", verifyvalue, verifyvalue);
				}


			}
			
		
		}catch(Exception e){
			writeFailure(e.getLocalizedMessage());
		}
	}

}
