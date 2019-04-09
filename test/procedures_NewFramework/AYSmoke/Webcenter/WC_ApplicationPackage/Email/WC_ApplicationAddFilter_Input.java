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
			String sectionvalue = testdata[5];
			String adddeleterow = testdata[6];
			String verifyvalue = testdata[7];
			String savecancel = testdata[8];
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
				waitForPageToLoadWebdriver();
				Reporter.log("Select ("+field+")");
				//--start--Rahul Mehta
				clickWebdriver(attributeName_xpath,"//button[contains(@title,'Please Select')]");
				sendKeys(attributeName_xpath,"//input[@placeholder='Search']",field);
				clickWebdriver(attributeName_xpath,"//label[contains(text(),'"+field+"')]");
				//selectByVisibleTextWithSpaceWebdriver(attributeName_xpath, ET_FieldName, field);
				//selectByVisibleTextWebdriver(attributeName_xpath, ET_FieldName, field);
				//--end--Rahul Mehta
			}
			if (!operator.equals("")) {
				Reporter.log("Select ("+operator+")");
				if(isElementPresentWebdriver(attributeName_xpath,ET_Operator1)) //Modified by Rahul Mehta on 9th March,2019
				{
					selectByVisibleTextWebdriver(attributeName_xpath, ET_Operator1, operator);

				}else{
					selectByVisibleTextWebdriver(attributeName_xpath, ET_Operator, operator);
				}
			}
			
			if (!value.equals("")) {
				Reporter.log("Select ("+value+")");
				//waitForElementPresentWebdriver(attributeName_xpath, ET_Value, value);
				//clickWebdriver(attributeName_xpath, ET_Value);
				//waitForElementPresentWebdriver(attributeName_xpath, MCL_CheckValue+value+"']", value);
				//checkWebdriver(attributeName_xpath, MCL_CheckValue+value+"']");
				//checkWebdriver(attributeName_xpath, "//span[text()='TestApplicationPayment1502434069449']");
				//clickWebdriver(attributeName_xpath, MQ_MulitSelectClose);
				Reporter.log("Select (" + value + ")");
				try{
					String status = Runtimedataread(value);
					//Added by Rahul Mehta on 14th March 2019 --start
					if(isElementPresent(attributeName_xpath,ET_Value1))
					{
						waitForElementPresentWebdriver(attributeName_xpath, ET_Value1, status);
						clickWebdriver(attributeName_xpath, ET_Value1);
						waitForElementPresentWebdriver(attributeName_xpath, "//label[contains(text(),'"+status+"')]/input[@type='checkbox']", status);
						checkWebdriver(attributeName_xpath, "//label[contains(text(),'"+status+"')]/input[@type='checkbox']");
						sleep(2);
						clickWebdriver(attributeName_xpath, MQ_MulitSelectClose1);
						sleep(2);

					}
					else{
						waitForElementPresentWebdriver(attributeName_xpath, ET_Value, status);
						clickWebdriver(attributeName_xpath, ET_Value);
						waitForElementPresentWebdriver(attributeName_xpath, MCL_CheckValue + status + "']", status);
						checkWebdriver(attributeName_xpath, MCL_CheckValue + status + "']");
						clickWebdriver(attributeName_xpath, MQ_MulitSelectClose);
					}
					//Added by Rahul Mehta on 14th March 2019-end
				}catch(Exception e){
					waitForElementPresentWebdriver(attributeName_xpath, ET_Value, value);
					clickWebdriver(attributeName_xpath, ET_Value);
					waitForElementPresentWebdriver(attributeName_xpath, MCL_CheckValue + value + "']", value);
					checkWebdriver(attributeName_xpath, MCL_CheckValue + value + "']");
					clickWebdriver(attributeName_xpath, MQ_MulitSelectClose);
				}
				/*if(value.equalsIgnoreCase("TestingEnrollmentStatus")){
					String status = Runtimedataread(value);
					waitForElementPresentWebdriver(attributeName_xpath, ET_Value, status);
					clickWebdriver(attributeName_xpath, ET_Value);
					waitForElementPresentWebdriver(attributeName_xpath, MCL_CheckValue + status + "']", status);
					checkWebdriver(attributeName_xpath, MCL_CheckValue + status + "']");
					clickWebdriver(attributeName_xpath, MQ_MulitSelectClose);
				}else {
					waitForElementPresentWebdriver(attributeName_xpath, ET_Value, value);
					clickWebdriver(attributeName_xpath, ET_Value);
					waitForElementPresentWebdriver(attributeName_xpath, MCL_CheckValue + value + "']", value);
					checkWebdriver(attributeName_xpath, MCL_CheckValue + value + "']");
					clickWebdriver(attributeName_xpath, MQ_MulitSelectClose);
				}*/
			}
			if (!sectionvalue.equals("")) {
				Reporter.log("Select (" + sectionvalue + ")");
				//selectByValueWebdriver(attributeName_xpath, ESR_ValueSelect, value);
				sendKeys(attributeName_xpath, ESR_ValueText, sectionvalue);
			}
			if(!verifyvalue.equals("")){
				if(verifyvalue.equalsIgnoreCase("TestingEnrollmentStatus")) {
					String status = Runtimedataread(verifyvalue);
					Reporter.log("Verify" + verifyvalue);
					waitForElementPresentWebdriver(attributeName_xpath, ET_Value, status);
					clickWebdriver(attributeName_xpath, ET_Value);
					verifyElementContainsTextWebdriver(attributeName_xpath, MCL_VerifyValue + status + "')]", status, verifyvalue);
				}else if(isElementPresent(attributeName_xpath,ET_Value1))//Added by Rahul Mehta on 14th March 2019 --start
				{
					String status = Runtimedataread(verifyvalue);
					Reporter.log("Verify" + verifyvalue);
					waitForElementPresentWebdriver(attributeName_xpath, ET_Value1, status);
					//clickWebdriver(attributeName_xpath, ET_Value1);
					verifyElementContainsTextWebdriver(attributeName_xpath, MCL_VerifyValue + status + "')]", status, verifyvalue);
				//Added by Rahul Mehta on 14th March 2019 --end
				}else {
					String verifyValue ;
					try{
						verifyValue = Runtimedataread(verifyvalue);
					}catch(Exception e){
						verifyValue= verifyvalue ;
					}
					Reporter.log("Verify" + verifyvalue);
					waitForElementPresentWebdriver(attributeName_xpath, ET_Value, verifyValue);
					clickWebdriver(attributeName_xpath, ET_Value);
					verifyElementContainsTextWebdriver(attributeName_xpath, MCL_VerifyValue + verifyValue + "')]", verifyValue, verifyValue);
				}
			}
			if (!savecancel.equals("")) {
				Reporter.log("Clicking on : ("+savecancel+")");
				if(savecancel.equalsIgnoreCase("add")){
					waitForElementPresentWebdriver(attributeName_xpath,BR_Add, savecancel);
					clickWebdriver(attributeName_xpath,BR_Add);
					sleep(2);//Added by Rahul Mehta on 14th March 2019
				}
				else if(savecancel.equalsIgnoreCase("save")){
					waitForElementPresentWebdriver(attributeName_xpath,BR_Add,savecancel);
					clickWebdriver(attributeName_xpath, BR_Add);
					sleep(5);//Added by Rahul Mehta on 14th March 2019
				}
				else if(savecancel.equalsIgnoreCase("cancel")){
					clickWebdriver(attributeName_xpath,"//img[contains(@src,'"+savecancel+"')]");//Added by Rahul Mehta on 9th April, 2019
					sleep(2);//Added by Rahul Mehta on 14th March 2019
					waitForPageToLoadWebdriver();
				}
								
			}sleep(10);  //Added by Rahul Mehta on 08 feb,2019
				
			} catch (Exception e) {
				writeFailure(e.getLocalizedMessage());
			}
	}	
}

