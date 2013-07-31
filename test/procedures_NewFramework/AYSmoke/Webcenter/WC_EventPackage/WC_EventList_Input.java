package procedures_NewFramework.AYSmoke.Webcenter.WC_EventPackage;

import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;


import processor.CommonSeleniumActions;


public class WC_EventList_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some Operation in 'Event List' page")
	public void WC_EventList_Input () throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Event List' page");
			String[]  fpvdatarepo = datacontainer;
			String groupname = fpvdatarepo[0];
			String description = fpvdatarepo[1];
			String folder = fpvdatarepo[2];
			String linkcontains = fpvdatarepo[3];
			String savecancel = fpvdatarepo[4];
			Reporter.log("Proceed to Test Data was retrieved for 'Event List' page");
			if (!groupname.equals("")) {
				Reporter.log("Step 1 - Enter the Group Name as ("+groupname+")");
				sendKeys(attributeName_name, AEG_GroupName, groupname);
			}
			if (!description.equals("")) {
				Reporter.log("Step 2 - Enter the Description as ("+description+")");
				sendKeys(attributeName_name, AEG_Description, description);
			}
			if (!folder.equals("")) {
				Reporter.log("Step 3 - Select the Folder as ("+folder+")");
				selectByVisibleTextWebdriver(attributeName_name, AEG_Folder, folder);
			}
			if (!linkcontains.equals("")) {
				Reporter.log("Step 4 - Click Group URL Link");
				clickWebdriver(attributeName_xpath, "//a[contains(@href,'"+linkcontains+"')]");
			}
			if (!savecancel.equals("")) {
				Reporter.log("Step 5 - Click button as ["+savecancel+"]");
				if (savecancel.equalsIgnoreCase("save")) {
					clickWebdriver(attributeName_xpath, AS_SaveBtn);
					waitForPageToLoadWebdriver();
				}else if (savecancel.equalsIgnoreCase("cancel")) {
					clickWebdriver(attributeName_xpath, ASR_BackBtn);
					waitForPageToLoadWebdriver();
				}
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
}


