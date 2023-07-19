package procedures_NewFramework.AYSmoke.Webcenter.WC_EventPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

import java.util.Set;

public class WC_AddEditEventRegistration_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Add/Edit Event Registration' page")
		public void WC_AddEditEventRegistration_Verify() throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Verify Test Data 'Add/Edit Event Registration' page");
			String[]  fpvdatarepo = datacontainer;
			String successmessage = fpvdatarepo[0];
			String closewindow = fpvdatarepo[1];
			Set<String> mainWindow = driver.getWindowHandles();
			String parent = mainWindow.iterator().next();
			Reporter.log("Verify Test Data was retrieved for 'Add/Edit Event Registration' page");
			if (!successmessage.equals("")) {
				Reporter.log("Step 1 - Verify Message("+successmessage+") was displayed correctly");
				waitForPageToLoadWebdriver();
				//verifyTextPresent(successmessage);
				verifyTextContains(successmessage,successmessage,"//*[@id=\"tableInfo\"]/tbody/tr/td/font[1]");
			}
			if (!closewindow.equals("")) {
				Reporter.log("Step 2 - Proceed to close the window");
				/*closeWindowWebdriver();
				selectMainWindowWebdriver();*/
				//recentPopupCloseWebdriver();
				closeWindowWebdriver();
			}
		//	driver.switchTo().window(parent);// removed for this tc 23863 by saran kumar
			//selectMainWindowWebdriver();
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

}




