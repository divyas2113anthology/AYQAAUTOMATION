package procedures_NewFramework.AYSmoke.Webcenter;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_Login_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'Webcenter Login' page")
	public void WC_Login_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Webcenter Login' Page");
			String[] testdata = datacontainer;
			String clientid = testdata[0];
			String userid = testdata[1];
			String password = testdata[2];
			String needpasswordgo = testdata[3];
			Reporter.log("Input Test Data was retrieved for 'Webcenter Login' Page");
//			writeFailure("Given Test Data["+yesno+"] either Incorrect or has not be Scripted ");
			if (!clientid.equals("")) {
				Reporter.log("Step 1 - Enter Clients as ["+clientid+"]");
				type(WCL_ClientID, clientid);				
			}			
			if (!userid.equals("")) {
				Reporter.log("Step 2 - Enter User ID as ["+userid+"]");
				type(WCL_UserID, userid);
			}			
			if (!password.equals("")) {
				String Password = Runtimedataread(password);
				Reporter.log("Step 3 - Enter Password as ["+Password+"]");
				type(WCL_Password, Password);
			}			
			if (!needpasswordgo.equals("")) {
				Reporter.log("Step 4 - Click on ["+needpasswordgo+"] button or Link");
				if (needpasswordgo.equalsIgnoreCase("Need Password or Login Help?")) {
					click(WCL_NeedPasswordLogin);
					recentPopupSelect("Forgot Password Search");
				}else if (needpasswordgo.equalsIgnoreCase("GO")) {
					click(WCL_Go);
					waitForPageToLoad();
				}
				else {
					writeFailure("Given Test Data["+needpasswordgo+"] either Incorrect or has not be Scripted ");
				}

			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}
