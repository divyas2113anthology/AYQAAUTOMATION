package procedures_NewFramework.AYSmoke.MaintenanceCenter;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class MC_ScheduleImportExports_Verify  extends CommonSeleniumActions implements OR{
	@Test(description="This Procedure is to perform some Operation in 'Schedule Import/Export' page")
	public void MC_ScheduleImportExports_Verify(){
		try{
			Reporter.log("Proceed to verify navigate to 'Schedule Import/Export' page");
			String[] testdata = datacontainer;
			String getjobname = testdata[0];
			String message = testdata[1];
			String page = testdata[2];
			String jobname = testdata[3];
			Reporter.log("Check navigate to 'Schedule Import/Export' page");
			if (!getjobname.equals("")) {
				waitForElementPresentWebdriver(attributeName_xpath, "//div[@id='divAyConfirmation']/font", message);
				String GetName = getTextWebdriver(attributeName_xpath, "//div[@id='divAyConfirmation']/font");
				String[] GetNameSplit = GetName.split("was");
				String GetNameTrim = GetNameSplit[0].trim();
				writeConsole("Get Job Name As: "+GetNameTrim);
				Runtimedatawrite(GetNameTrim, getjobname);
			}
			if (!message.equals("")) {
				if (message.contains("was")) {
					waitForElementPresentWebdriver(attributeName_xpath, "//div[@id='divAyConfirmation']/font", message);
					String[] SplitMsg = message.split(":");
					String Msg = Runtimedataread(SplitMsg[0]);
					verifyTextPresent(Msg+SplitMsg[1]);
				}else if (message.contains("Deleted")) {
					alertAccept();
					
					verifyTextPresent(message);
				}
			}
			if (!page.equals("")) {
				Reporter.log("Step 1 - Verify page is ["+page+"]");
				verifyTextPresent(page);				
			}
			if (!jobname.equals("")) {
				
			}
		}catch(Exception e){
			writeFailure(e.getLocalizedMessage()); }
	}
}

