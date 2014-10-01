package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.UserQueries;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_AddInputCriteria_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some Operation in 'Add Input Criteria' page")
	public void WC_AddInputCriteria_Input () throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Add Input Criteria' page");
			String[]  applicantwelidatarepo = datacontainer;
			String backsaverun = applicantwelidatarepo[0];
			String appsubmitted = applicantwelidatarepo[1];
			String appinprogress = applicantwelidatarepo[2];
			String field = applicantwelidatarepo[3];
			String operator = applicantwelidatarepo[4];
			String value = applicantwelidatarepo[5];
			String groups = applicantwelidatarepo[6];
			
			Reporter.log("Input Test Data was retrieved for 'Add Input Criteria' page");
			if (!backsaverun.equals("")) {
				Reporter.log("Step 3 - Click button as ["+backsaverun+"]");
				if (backsaverun.equalsIgnoreCase("Back")) {
					clickWebdriver(attributeName_xpath, ASR_BackBtn);
					waitForPageToLoadWebdriver();
				}else if (backsaverun.equalsIgnoreCase("Save")) {
					clickWebdriver(attributeName_xpath, AS_SaveBtn);
					waitForPageToLoadWebdriver();
				}else if (backsaverun.equalsIgnoreCase("save and run")) {
					clickWebdriver(attributeName_name, MQ_SaveAndRun);
					waitForPageToLoadWebdriver();
				}else if (backsaverun.equalsIgnoreCase("run")) {
					clickWebdriver(attributeName_xpath, RPT_RunBtn);
					waitForPageToLoadWebdriver();
				}
			if (!appsubmitted.equals("")) {
				Reporter.log("Step 1 - Perform the operation to click ["+appsubmitted+"]");
				waitForElementPresentWebdriver(attributeName_xpath, MQ_AppSubmit, appsubmitted);
				clickWebdriver(attributeName_xpath, MQ_AppSubmit);
					waitForPageToLoadWebdriver();
				}
			}
			if (!appinprogress.equals("")) {
				Reporter.log("Step 2 - Perform the operation to click ["+appinprogress+"]");
				waitForElementPresentWebdriver(attributeName_xpath, MQ_AppInProgress, appinprogress);
				clickWebdriver(attributeName_xpath, MQ_AppInProgress);
					waitForPageToLoadWebdriver();
				}
			
			if (!field.equals("")) {
				Reporter.log("Step 2 - Select the field name as ["+field+"]");
//				select(MQ_FieldName, "regexp:"+fieldname);
				waitForElementPresentWebdriver(attributeName_xpath, MQ_FieldName, field);
				selectByVisibleTextWebdriver(attributeName_xpath, MQ_FieldName, "    --"+field);
				Thread.sleep(3000);
			}
			if (!operator.equals("")) {
				Reporter.log("Step 3 - Select the Operator as ["+operator+"]");
				selectByVisibleTextWebdriver(attributeName_xpath, MQ_Operator, operator);
				Thread.sleep(3000);
			}
			if (!value.equals("")) {
				Reporter.log("Step 4 - Enter the value as ["+value+"]");
				sendKeys(attributeName_xpath, MQ_Value, value);
			}
			if (!groups.equals("")) {
				Reporter.log("Step 4 - Enter the value as ["+groups+"]");
				
			}
						
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

}
