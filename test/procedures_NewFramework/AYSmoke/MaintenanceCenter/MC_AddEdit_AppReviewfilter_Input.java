package procedures_NewFramework.AYSmoke.MaintenanceCenter;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class MC_AddEdit_AppReviewfilter_Input extends CommonSeleniumActions implements OR{
	@Test(description="This Procedure is used to perform some operation in 'AppReviewfilter' page")
	public void MC_AddEdit_AppReviewfilter_Input() {
		// TODO Auto-generated constructor stub
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Search For Applicants' Page");
			String[] testdata = datacontainer;
			String Row = testdata[0];
			String Filtername = testdata[1];
			String Description = testdata[2];
			String Field = testdata[3];
			String Operator = testdata[4];
			String Value = testdata[5];
			String AddRemoverow = testdata[6];
		    String SaveDeleteCancel = testdata[7];
			if (!Filtername.equals("")) {
				Reporter.log("Send Filtername");
				waitForElementPresentWebdriver(attributeName_xpath, MC_ARF_Filtername, Filtername);
				sendKeys(attributeName_xpath, MC_ARF_Filtername, Filtername);
			}
			if (!Filtername.equals("")) {
				Reporter.log("Send Description");
				waitForElementPresentWebdriver(attributeName_xpath, MC_ARF_Description, Description);
				sendKeys(attributeName_xpath, MC_ARF_Description, Description);
				
			}
			if (!Field.equals("")) {
				Reporter.log("Select Feild");
				waitForElementPresentWebdriver(attributeName_xpath, MC_ARF_Field1+Row+MC_ARF_Field2, Field);
				selectByVisibleTextWebdriver(attributeName_xpath, MC_ARF_Field1+Row+MC_ARF_Field2, Field);
				
			}
			if (!Operator.equals("")) {
				Reporter.log("Select Operator");
				waitForElementPresentWebdriver(attributeName_xpath, MC_ARF_Operator1+Row+MC_ARF_Operator2, Operator);
				selectByVisibleTextWebdriver(attributeName_xpath, MC_ARF_Operator1+Row+MC_ARF_Operator2, Operator);
				
			}
			if (!Value.equals("")) {
				Reporter.log("Select Value");
				waitForElementPresentWebdriver(attributeName_xpath, MC_ARF_Value1+Row+MC_ARF_Value2, Value);
				clickWebdriver(attributeName_xpath,MC_ARF_Value1+Row+MC_ARF_Value2);
				waitForElementPresentWebdriver(attributeName_xpath, MC_ARF_SelectByValue1+Row+MC_ARF_SelectByValue2, Value);
				selectByVisibleTextWebdriver(attributeName_xpath, MC_ARF_SelectByValue1+Row+MC_ARF_SelectByValue2, Value);
				
			}
			if (!AddRemoverow.equals("")) {
				Reporter.log("Click Addrow");
				waitForElementPresentWebdriver(attributeName_xpath, MC_ARF_Description, AddRemoverow);
				clickWebdriver(attributeName_xpath, MCG_Package+AddRemoverow+"')]");
				
			}
			if (!SaveDeleteCancel.equals("")) {
				Reporter.log("Click SaveDeleteCancel");
				waitForElementPresentWebdriver(attributeName_xpath, MC_ARF_Description, SaveDeleteCancel);
				clickWebdriver(attributeName_xpath, MCG_Package+SaveDeleteCancel+"')]");
				
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}
