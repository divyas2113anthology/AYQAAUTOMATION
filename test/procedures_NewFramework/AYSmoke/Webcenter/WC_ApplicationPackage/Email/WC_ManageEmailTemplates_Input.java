package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.Email;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_ManageEmailTemplates_Input extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some input operation in 'Manage Email Template' page")
		public void WC_ManageEmailTemplates_Input() throws Exception{
		try {
			writeDetails();
//			headerStatement("PersonalData_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data 'Manage Email Template' page");
			String[]  fpvdatarepo = datacontainer;
			String add_delete_folder = fpvdatarepo[0];
			String link_click = fpvdatarepo[1];
			String template_name = fpvdatarepo[2];
			
			Reporter.log("Verify Test Data was retrieved for ''Manage Email Template' page");
			
			if (!link_click.equals("")) {
				//Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
				waitForElementPresentWebdriver(attributeName_xpath, Applpackage+link_click+"')]", link_click);
				clickWebdriver(attributeName_xpath, Applpackage+link_click+"')]");
			}
			if (!add_delete_folder.equals("")) {
				//Reporter.log("Step 1 - Verify Message("+message+") was displayed correctly");
				if(add_delete_folder.equals("add")) {
				waitForElementPresentWebdriver(attributeName_xpath, WC_AddDelMoveToFolder+add_delete_folder+"')]", add_delete_folder);
				clickWebdriver(attributeName_xpath, WC_AddDelMoveToFolder+add_delete_folder+"')]");
				}
				else
				{
					waitForElementPresentWebdriver(attributeName_xpath, AMET_CheckboxTemplate, "TestMail");
					clickWebdriver(attributeName_xpath, AMET_CheckboxTemplate+template_name+"']]/preceding-sibling::td/input");
					clickWebdriver(attributeName_xpath, WC_AddDelMoveToFolder+add_delete_folder+"')]");
				}
			}
			
			
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}