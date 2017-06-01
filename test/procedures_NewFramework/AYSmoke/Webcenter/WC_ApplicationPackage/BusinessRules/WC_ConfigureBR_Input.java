package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.BusinessRules;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_ConfigureBR_Input extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some input operation in 'Configure Business Rules' page")
		public void WC_ConfigureBR_Input() throws Exception{
		try {
			writeDetails();
//			headerStatement("PersonalData_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data 'Configure Business Rules' page");
			String[]  fpvdatarepo = datacontainer;
			String add = fpvdatarepo[0];
			String delete = fpvdatarepo[1];
			String copy = fpvdatarepo[2];
			String movetofolder = fpvdatarepo[3];
			String rulename = fpvdatarepo[4];
			String Checkbox = fpvdatarepo[5];
			//String Linkname = fpvdatarepo[6];

			Reporter.log("Verify Test Data was retrieved for 'Configure Business Rules' page");

			if(!Checkbox.equals(""))
			{
				waitForElementPresentWebdriver(attributeName_xpath, SR_RuleName+"')]]"+SR_CheckBox, Checkbox);
				clickWebdriver(attributeName_xpath, SR_RuleName+Checkbox+"')]]"+SR_CheckBox);
			}


			if (!add.equals("")) {
				Reporter.log("Click on the add button");
				clickWebdriver(attributeName_xpath, BR_Save);

				Thread.sleep(10000);
				
			}
			if (!delete.equals("")) {
				Reporter.log("Proceed to click the delete button ");
				clickWebdriver(attributeName_xpath, MSR_DeleteBtn);
				String RuleDeleteAlertMsg = alertMessage();
				Reporter.log("Delete Rule Alert Message : "+RuleDeleteAlertMsg);
				alertAccept();
				waitForPageToLoadWebdriver();
			}
			
			
			if (!copy.equals("")) {
				//Reporter.log("Step 2 - Verify UI having the Message("+verifyui+")");
					
			}
			if (!movetofolder.equals("")) {
				//Reporter.log("Step 2 - Verify UI having the Message("+verifyui+")");
					
			}
			if (!rulename.equals("")) {
				Reporter.log("Step - Clicking on the rule name : ("+rulename+")");
				clickWebdriver(attributeName_xpath, BR_RuleName+rulename+"')]");
					
			}
			
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}