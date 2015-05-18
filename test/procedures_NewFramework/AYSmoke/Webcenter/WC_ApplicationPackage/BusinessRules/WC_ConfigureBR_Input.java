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
			Reporter.log("Verify Test Data was retrieved for 'Configure Business Rules' page");
			
			if (!add.equals("")) {
				Reporter.log("Click on the add button");
				clickWebdriver(attributeName_xpath, BR_Save);
				
			}
			if (!delete.equals("")) {
				//Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
				
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