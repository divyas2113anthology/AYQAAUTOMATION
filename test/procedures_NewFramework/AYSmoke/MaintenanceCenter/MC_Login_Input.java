package procedures_NewFramework.AYSmoke.MaintenanceCenter;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;


public class MC_Login_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'Maintenance center Login' page")
	public void MC_Login_Input() throws Exception {
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Maintenance center Login' Page");
			String[] testdata = datacontainer;
			String userid = testdata[0];
			String password = testdata[1];
			String btnlogin = testdata[2];
			Reporter.log("Input Test Data was retrieved for 'Maintenance center Login' Page");
			if (!userid.equals("")) {
				Reporter.log("Step 1 - Enter userid as ["+userid+"]");
				type(MCL_UserID, userid);				
			}
			if (!password.equals("")) {
				Reporter.log("Step 2 - Enter password as ["+password+"]");
				String Password = Runtimedataread(password);
				type(MCL_Password, Password);				
			}
			if (!btnlogin.equals("")) {
				Reporter.log("Step 3 - Click the Login Button");
				if (btnlogin.equalsIgnoreCase("login")) {
					clickWebdriver(attributeName_xpath,MCL_Loginbutton);
					waitForPageToLoad();
				}
			}
			
		}catch(Exception e)	{
			writeFailure(e.getLocalizedMessage());	}
		}	
	}


