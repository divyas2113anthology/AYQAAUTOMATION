package procedures_NewFramework.AYSmoke.Webcenter.WC_EventPackage.EventModuleManageGroups;

import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;


import processor.CommonSeleniumActions;


public class WC_ManageGroups_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some Operation in 'Manage Groups' page")
	public void WC_ManageGroups_Input () throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Manage Groups' page");
			String[]  applicantwelidatarepo = datacontainer;
			String groupnamecheck = applicantwelidatarepo[0];
			String groupnameclick = applicantwelidatarepo[1];
			String adddeletemove = applicantwelidatarepo[2];
			Reporter.log("Input Test Data was retrieved for 'Manage Groups' page");
			if (!groupnamecheck.equals("")) {
				Reporter.log("Step 1 - Perform the operation to check the checkbox as ["+groupnamecheck+"]");
				if (groupnamecheck.contains("check")) {
					String[] CheckGroupName = groupnamecheck.split(";");
					checkWebdriver(attributeName_xpath, "//td[a[contains(text(),'"+CheckGroupName[0]+"')]]/preceding-sibling::td/input[@type='checkbox']");
				}else if (groupnamecheck.contains("uncheck")) {
					String[] UnCheckGroupName = groupnamecheck.split(";");
					uncheckWebdriver(attributeName_xpath, "//td[a[contains(text(),'"+UnCheckGroupName[0]+"')]]/preceding-sibling::td/input[@type='checkbox']");
				}
			}
			if (!groupnameclick.equals("")) {
				Reporter.log("Step 2 - Click the Name of the Record as ["+groupnameclick+"]");
				clickWebdriver(attributeName_linktext, groupnameclick);
				waitForPageToLoadWebdriver();
			}
			if (!adddeletemove.equals("")) {
				Reporter.log("Step 3 - Click button as ["+adddeletemove+"]");
				if (adddeletemove.equalsIgnoreCase("Add")) {
					clickWebdriver(attributeName_xpath, MSR_AddBtn);
					waitForPageToLoadWebdriver();
				}else if (adddeletemove.equalsIgnoreCase("Delete")) {
					clickWebdriver(attributeName_xpath, ASR_BackBtn);
					waitForPageToLoadWebdriver();
				}else if (adddeletemove.equalsIgnoreCase("move to folder")) {
					clickWebdriver(attributeName_xpath, EA_MoveToFolder);
					recentPopupSelectWebdriver("Select Folder");
				}
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
}
