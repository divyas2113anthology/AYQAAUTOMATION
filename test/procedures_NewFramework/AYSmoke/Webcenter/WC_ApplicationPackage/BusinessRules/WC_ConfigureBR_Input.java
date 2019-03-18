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
			String Checkbox = fpvdatarepo[1];
			String delete = fpvdatarepo[2];
			String movetofolder = fpvdatarepo[3];
			String copy = fpvdatarepo[4];
			String rulename = fpvdatarepo[5];
			String description=fpvdatarepo[6];//Added by Rahul Mehta on 14th March 2019 to chech BR Description also

			//String Linkname = fpvdatarepo[6];

			Reporter.log("Verify Test Data was retrieved for 'Configure Business Rules' page");

			if (!add.equals("")) {
				Reporter.log("Click on the add button");
				clickWebdriver(attributeName_xpath, BR_Save);

				Thread.sleep(10000);
				
			}
			if(!Checkbox.equals(""))
			{

				waitForElementPresentWebdriver(attributeName_xpath, SR_RuleName+Checkbox+"')]]"+SR_BRCheckBox, Checkbox);
				clickWebdriver(attributeName_xpath, SR_RuleName+Checkbox+"')]]"+SR_BRCheckBox);
				sleep(1);
			}
			if (!delete.equals("")) {
				Reporter.log("Proceed to click the delete button ");
				clickWebdriver(attributeName_xpath, MSR_DeleteBtn1);
				String RuleDeleteAlertMsg = alertMessage();
				Reporter.log("Delete Rule Alert Message : "+RuleDeleteAlertMsg);
				sleep(1);
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
				//Added by Rahul Mehta on 14th March,2019 to check name with description --start
				if(!description.equals(""))
				{
					clickWebdriver(attributeName_xpath,"//td[contains(text(), '"+description+"')]/preceding-sibling::td[1]/a[contains(text(),'"+rulename+"')]");
					Reporter.log("Step - Clicking on the rule name : ("+description+")");

				}
				else {
					clickWebdriver(attributeName_xpath, BR_RuleName + rulename + "')]");
					//Added by Rahul Mehta on 14th March,2019 to check name with description --end

				}
			}

			
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}