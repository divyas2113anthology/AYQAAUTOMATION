package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.ConfigureForms;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;
import or.OR;

public class WC_ManageSectionRules_Input extends CommonSeleniumActions implements OR{
	@Test(description="This Procedure is to perform input operation in Manage Section Rules page")
	public void WC_ManageSectionRules_Input() {
		// TODO Auto-generated constructor stub
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Manage Section Rules' Page");
			String[] testdata = datacontainer;
			String Button_addprintdelete = testdata[0];
			String Checkbox = testdata[1];
			String Linkname = testdata[2];
			String showhide = testdata[3];
			if(!Button_addprintdelete.equals(""))
			{
				waitForElementPresentWebdriver(attributeName_xpath, MCG_Package+Button_addprintdelete+"']", Button_addprintdelete);
				clickWebdriver(attributeName_xpath, MCG_Package+Button_addprintdelete+"']");
			}
			if(!Checkbox.equals(""))
			{
				waitForElementPresentWebdriver(attributeName_xpath, SR_RuleName+"')]]"+SR_CheckBox, Checkbox);
				clickWebdriver(attributeName_xpath, SR_RuleName+"')]]"+SR_CheckBox);
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}
