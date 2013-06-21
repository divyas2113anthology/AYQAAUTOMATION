package procedures_NewFramework.AYSmoke.Facelift;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class FC_Login_Verify extends CommonSeleniumActions implements OR {
	
	
	@Test(description="This Procedure is to perform some Verification in 'Applyyourself Login' page")
	public void FC_Login_Verify () throws Exception{
		try {
		writeDetails();
		Reporter.log("Proceed to retrieve Verify Test Data 'Applyyourself Login' page");
		String[]  updateprovdatarepo = datacontainer;
//		String  verifyui = updateprovdatarepo[0];
		String 	LogoutMessageToVerify = updateprovdatarepo[0];
		String 	should_verify_tab =  updateprovdatarepo[1];
		String  tab_status = updateprovdatarepo[2];
		String  tab_name = updateprovdatarepo[3];
		/*		Reporter.log("Verify Test Data was retrieved for 'Applyyourself Login' page");
		if (!verifyui.equals("")) {
			
		}
		 */		
		Reporter.log("Verify Test Data was retrieved for 'Applyyourself Login' page");
		if (! LogoutMessageToVerify.equals("")){
			Reporter.log("Verify Successfully Logout Message in the 'Login Login' page");
			if (LogoutMessageToVerify.equalsIgnoreCase("Sucessfully Logout")) {
				waitForElementPresentWebdriver(attributeName_cssselector, LV_LogoutMsg, LogoutMessageToVerify);
				verifyElementTextWebdriver(attributeName_cssselector, LV_LogoutMsg, LogoutMessageToVerify, "Logout Message");
//				verifyText(LV_LogoutMsg, "Logout", "Sucessfully Logout");
			}
		}
		if (!should_verify_tab.equals("")) {
			
		}
		if (!tab_status.equals("")) {
			
		}
		if (!tab_name.equals("")) {
			
		}
		
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}


}
