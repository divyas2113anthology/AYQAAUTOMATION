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
				if (userid.equals("WebcenterUserID")) {
					String UserID = Runtimedataread(userid);
					Reporter.log("Step 2 - Enter User ID as ["+UserID+"]");
					sendKeys(attributeName_cssselector, MCL_UserID, UserID);
				} else {
					Reporter.log("Step 2 - Enter User ID as ["+userid+"]");
					sendKeys(attributeName_cssselector, MCL_UserID, userid);
				}
			}			
			if (!password.equals("")) {
				if (password.equals("WebcenterPassword")) {
					String Password = Runtimedataread(password);
					Reporter.log("Step 3 - Enter Password as ["+Password+"]");
					sendKeys(attributeName_cssselector,MCL_Password, Password);
				} else {
					Reporter.log("Step 3 - Enter Password as ["+password+"]");
					sendKeys(attributeName_cssselector,MCL_Password, password);
				}
			}
			if (!btnlogin.equals("")) {
				Reporter.log("Step 3 - Click the Login Button");
				if (btnlogin.equalsIgnoreCase("login")) {
					clickWebdriver(attributeName_xpath,MCL_Loginbutton);
					waitForPageToLoadWebdriver();
				}
			}
			
		}catch(Exception e)	{
			writeFailure(e.getLocalizedMessage());	}
		}	
	}


