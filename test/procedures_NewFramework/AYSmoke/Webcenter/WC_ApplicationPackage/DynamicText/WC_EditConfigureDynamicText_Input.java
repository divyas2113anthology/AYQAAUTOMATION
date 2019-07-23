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
			String conditionalmessagecheck = applicantwelidatarepo[3];
			String adddeletefilter = applicantwelidatarepo[4];
			String buttonstoclick = applicantwelidatarepo[5];
			String conditionalmessagename = applicantwelidatarepo[6];
			Reporter.log("Input Test Data was retrieved for 'Configure Dynamic Text' page");
			
			if (!adddeletefilter.equals("")) {
				Reporter.log("Perform the operation to click["+adddeletefilter+"]");
				if(adddeletefilter.equalsIgnoreCase("minusfilter"))//Added by Rahul Mehta on 9th April,2019
				{sleep(2);
					clickWebdriver(attributeName_xpath,"//a[text()='"+conditionalmessagecheck+"']/preceding-sibling::input");
					sleep(2);
					clickWebdriver(attributeName_xpath, CDT_Filter+adddeletefilter+"')]");
					sleep(2);
					waitForPageToLoadWebdriver();
				}else {
					clickWebdriver(attributeName_xpath, CDT_Filter + adddeletefilter + "')]");
				}
			}

			if (!conditionalmessagename.equals("")) {
				Reporter.log("Perform the operation to click["+conditionalmessagename+"]");
				waitForElementPresentWebdriver(attributeName_xpath, CDT_FilterName+conditionalmessagename+"')]",conditionalmessagename);
				clickWebdriver(attributeName_xpath, CDT_FilterName+conditionalmessagename+"')]");
			}
			if (!buttonstoclick.equals("")) {
				Reporter.log("Perform the operation to click["+buttonstoclick+"]");
				waitForElementPresentWebdriver(attributeName_xpath, ET_SaveCancel+buttonstoclick+"')]",buttonstoclick);
				clickWebdriver(attributeName_xpath, ET_SaveCancel+buttonstoclick+"')]");
				waitForPageToLoadWebdriver();
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
}
