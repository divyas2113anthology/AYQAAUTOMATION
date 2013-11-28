package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.ManageQueries;

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
			String datatree = applicantwelidatarepo[0];
			String fieldname = applicantwelidatarepo[1];
			String operator = applicantwelidatarepo[2];
			String value = applicantwelidatarepo[3];
			String button = applicantwelidatarepo[4];
			Reporter.log("Input Test Data was retrieved for 'Add Input Criteria' page");
			if (!datatree.equals("")) {
				Reporter.log("Step 1 - Perform the operation to click the tree as ["+datatree+"]");
				if (datatree.contains("Tree")) {
					clickWebdriver(attributeName_xpath, "//font[b/a[text()='"+datatree+"']]/preceding-sibling::img[contains(@src,'closed')]");
				}else{
					waitForElementPresentWebdriver(attributeName_linktext, datatree, datatree);
					clickWebdriver(attributeName_linktext, datatree);
					waitForPageToLoadWebdriver();
				}
			}
			if (!fieldname.equals("")) {
				Reporter.log("Step 2 - Select the field name as ["+fieldname+"]");
//				select(MQ_FieldName, "regexp:"+fieldname);
				selectByVisibleTextWebdriver(attributeName_xpath, MQ_FieldName, "    --"+fieldname);
			}
			if (!operator.equals("")) {
				Reporter.log("Step 3 - Select the Operator as ["+operator+"]");
				selectByVisibleTextWebdriver(attributeName_xpath, MQ_Operator, operator);
			}
			if (!value.equals("")) {
				Reporter.log("Step 4 - Enter the value as ["+value+"]");
				sendKeys(attributeName_xpath, MQ_Value, value);
			}
			if (!button.equals("")) {
				Reporter.log("Step 3 - Click button as ["+button+"]");
				if (button.equalsIgnoreCase("Back")) {
					clickWebdriver(attributeName_xpath, ASR_BackBtn);
					waitForPageToLoadWebdriver();
				}else if (button.equalsIgnoreCase("Save")) {
					clickWebdriver(attributeName_xpath, AS_SaveBtn);
					waitForPageToLoadWebdriver();
				}else if (button.equalsIgnoreCase("save and run")) {
					clickWebdriver(attributeName_name, MQ_SaveAndRun);
					waitForPageToLoadWebdriver();
				}else if (button.equalsIgnoreCase("run")) {
					clickWebdriver(attributeName_xpath, RPT_RunBtn);
					waitForPageToLoadWebdriver();
				}
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
}

