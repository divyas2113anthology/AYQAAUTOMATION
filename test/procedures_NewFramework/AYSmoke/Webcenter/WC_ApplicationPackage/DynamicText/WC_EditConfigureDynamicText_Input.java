package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.DynamicText;


import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;


import processor.CommonSeleniumActions;


public class WC_EditConfigureDynamicText_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some Operation in 'Edit Configure Dynamic Text' page")
	public void WC_EditConfigureDynamicText_Input () throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Edit Configure Dynamic Text' page");
			String[]  applicantwelidatarepo = datacontainer;
			String displayformattype = applicantwelidatarepo[0];
			String dynamictext = applicantwelidatarepo[1];
			String applicationsections = applicantwelidatarepo[2];
			String conditionalmessage = applicantwelidatarepo[3];
			String adddeletefilter = applicantwelidatarepo[4];
			String buttonstoclick = applicantwelidatarepo[4];
			String conditionalmessagename = applicantwelidatarepo[5];
			Reporter.log("Input Test Data was retrieved for 'Configure Dynamic Text' page");
			
			if (!adddeletefilter.equals("")) {
				Reporter.log("Perform the operation to click["+adddeletefilter+"]");
				clickWebdriver(attributeName_xpath, CDT_Filter+adddeletefilter+"')]");
			}

			if (!conditionalmessagename.equals("")) {
				Reporter.log("Perform the operation to click["+conditionalmessagename+"]");
				clickWebdriver(attributeName_xpath, CDT_FilterName+conditionalmessagename+"')]");
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
}
