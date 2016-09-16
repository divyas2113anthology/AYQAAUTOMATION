package procedures_NewFramework.AYSmoke.MaintenanceCenter;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class MC_ScheduleImportExports_Input extends CommonSeleniumActions implements OR{
	@Test(description="This Procedure is to perform some Operation in 'Schedule Imports/Exports' page")
	public void MC_ScheduleImportExports_Input(){
	try{
		Reporter.log("Proceed to click on package name in quick view screen of Maintenance center");
		String[] testdata = datacontainer;
		String jobnamecheck = testdata[0];
		String jobnameclick = testdata[1];
		String addexpimpdelete = testdata[2];
		Reporter.log("Check user clicked on application package in Maintenance center");
		if (!jobnamecheck.equals("")) {
			String NameCheck = Runtimedataread(jobnamecheck);
			Reporter.log("Step 1 - Check the  Name as ["+NameCheck+"]");
			waitForElementPresentWebdriver(attributeName_xpath, "//td[a[contains(text(),'"+NameCheck+"')]]/preceding-sibling::td/input[@type='checkbox']", "Schedule Export checkbox");
			checkWebdriver(attributeName_xpath, "//td[a[contains(text(),'"+NameCheck+"')]]/preceding-sibling::td/input[@type='checkbox']");
		}
		if (!jobnameclick.equals("")) {
			String NameClick = Runtimedataread(jobnameclick);
			Reporter.log("Step 2 - Click the Name as ["+NameClick+"]");
			clickWebdriver(attributeName_xpath, "//a[contains(text(),'"+NameClick+"')]");
		}
		if (!addexpimpdelete.equals("")) {
			Reporter.log("Step 3 - Click the name of the button as ["+addexpimpdelete+"]");
			if (addexpimpdelete.equalsIgnoreCase("add import sched")) {
				clickWebdriver(attributeName_xpath, SIE_AddImpSched);
				waitForPageToLoadWebdriver();
			}else if (addexpimpdelete.equalsIgnoreCase("add export sched")) {
				clickWebdriver(attributeName_xpath, SIE_AddExpSched);
				waitForPageToLoadWebdriver();
			}else if (addexpimpdelete.equalsIgnoreCase("Delete")) {
				clickWebdriver(attributeName_xpath, SIE_DeleteBtn);
				//alertAccept();
				
			}
		}
		
	}catch(Exception e){
		writeFailure(e.getLocalizedMessage());}
	}
}
