package procedures_NewFramework.AYSmoke.Webcenter.WC_EventPackage.EventModuleManageGroups;

import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;


import processor.CommonSeleniumActions;


public class WC_AddEditGroup_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some Operation in 'Add Edit Group' page")
	public void WC_AddEditGroup_Input () throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Add Edit Group' page");
			String[]  fpvdatarepo = datacontainer;
			String groupname = fpvdatarepo[0];
			String description = fpvdatarepo[1];
			String folder = fpvdatarepo[2];
			String linkcontains = fpvdatarepo[3];
			String savecancel = fpvdatarepo[4];
			Reporter.log("Verify Test Data was retrieved for 'Add/Edit Group' page");
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
				String environment = Runtimedataread("Instance").toLowerCase();
//				String getLinkHref = getAttribute(HC_LinkContians+linkcontains+"')]", "href");
//				Reporter.log("Step 16 - Get Link HREF Property(Entire URL) and Open in Same Window"+getLinkHref);
				if (environment.equals("USQA")) {
					String ScheduleURL = getTextWebdriver(attributeName_partiallinktext, linkcontains); 
					String[] ScheduleURLSplit = ScheduleURL.split("http://");
					get("http://uat"+ScheduleURLSplit);
				}else{				
				clickWebdriver(attributeName_xpath, "//a[contains(@href,'"+linkcontains+"')]");
				}
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

