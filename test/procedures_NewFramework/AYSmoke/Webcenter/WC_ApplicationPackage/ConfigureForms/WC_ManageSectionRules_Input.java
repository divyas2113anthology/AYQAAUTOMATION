package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.ConfigureForms;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;
import or.OR;

public class WC_ManageSectionRules_Input extends CommonSeleniumActions implements OR{
	@Test(description="This Procedure is to perform input operation in Manage Section Rules page")
	public void WC_ManageSectionRules_Input () {
		// TODO Auto-generated constructor stub
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Manage Section Rules' Page");
			String[] testdata = datacontainer;
			String Button_addprintdelete = testdata[0];
			String Checkbox = testdata[1];
			String Linkname = testdata[2];
			String showhide = testdata[3];
			//switchToFrameNameIdWebdriver("frmContent");

			if (!Checkbox.equals("")) {
				switchToFrameNameIdWebdriver("frmContent");
				sleep(50);

				//waitForElementPresentWebdriver(attributeName_xpath,SR_RuleName + Checkbox  + SR_CheckBox, Checkbox);

				clickWebdriver(attributeName_xpath, "(//input[@name='Chk_RuleID'])[1]");

				//clickWebdriver(attributeName_xpath, SR_RuleName + Checkbox + SR_CheckBox);





//switchToDefaultContentWebdriver();


			}
			if(!Linkname.equals(""))
			{

			}
			if(!showhide.equals("")) {
			}

			if(!Button_addprintdelete.equals(""))
			{switchToFrameNameIdWebdriver("frmContent");

				/*waitForElementPresentWebdriver(attributeName_xpath, MCG_Package+Button_addprintdelete+"']", Button_addprintdelete);
				clickWebdriver(attributeName_xpath, MCG_Package+Button_addprintdelete+"']");*/
				if (Button_addprintdelete.equalsIgnoreCase("Add")) {
					waitForElementPresentWebdriver(attributeName_xpath, MSR_AddBtn, Button_addprintdelete);
					clickWebdriver(attributeName_xpath, MSR_AddBtn);

					sleep(2); //Added by Rahul Mehta on 8th Feb,2019
				}else if (Button_addprintdelete.equalsIgnoreCase("Back")) {
					clickWebdriver(attributeName_xpath, MSR_BackBtn);

						switchToDefaultContentWebdriver();
				}else if (Button_addprintdelete.equalsIgnoreCase("Delete")) {

					clickWebdriver(attributeName_xpath, MSR_DeleteBtn);
					String RuleDeleteAlertMsg = alertMessage();
					Reporter.log("Delete Rule Alert Message : "+RuleDeleteAlertMsg);
					alertAccept();
					waitForPageToLoadWebdriver();
				}


			}
			if(!Linkname.equals(""))
			{

			}
			if(!showhide.equals("")) {
			}

		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}
