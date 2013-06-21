package procedures_NewFramework.AYSmoke.Webcenter;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;
public class WC_AddUser_Input  extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some Operation on 'Add User' Page")
	public void WC_AddUser_Input(){
		try {
			writeDetails();
			Reporter.log("This procedure is used to input add new user");
			String[] testdata = datacontainer;
			String userid = testdata[0];
			String firstname = testdata[1];
			String lastname = testdata[2];
			String title = testdata[3];
			String emailaddress = testdata[4];
			String password = testdata[5];
			String confrmpassword = testdata[6];
			String changepassword = testdata[7];
			String excludepasswordfromnewaccountemail = testdata[8];
			String status = testdata[9];
			String locked = testdata[10];
			String rolesassigned = testdata[11];
			String rolesnotassigned = testdata[12];
			String privilagesassigned = testdata[13];
			String privilagesnotassigned = testdata[14];
			String statusreportschedule = testdata[15];
			String raaccountassigned = testdata[15];
			String button = testdata[16];
			
			Reporter.log("Input Test Data was retrieved for 'Webcenter add user' Page");
			if (!userid.equals("")) {
				Reporter.log("Enter User ID");
				type(WCL_userid, userid);			
			}
			if (!firstname.equals("")) {
				Reporter.log("Enter first name");
				type(WCL_firstname, firstname);			
			}
			if (!lastname.equals("")) {
				Reporter.log("Enter last name");
				type(WCL_lastname, lastname);			
			}
			if (!title.equals("")) {
				Reporter.log("Enter title");
				type(WCL_title, title);			
			}
			if (!emailaddress.equals("")) {
				Reporter.log("Enter email address");
				type(WCL_emailaddress, emailaddress);			
			}
			if (!password.equals("")) {
				Reporter.log("Enter password");
				type(WCL_password, password);	
			}
			if (!confrmpassword.equals("")) {
				Reporter.log("Enter confirm password");
				type(WCL_confrmpassword, confrmpassword);			
			}
			if (!changepassword.equals("")) {
				Reporter.log("Change password");
				type(WCL_changepassword, changepassword);			
			}
			if (!excludepasswordfromnewaccountemail.equals("")) {
				Reporter.log("Check/uncheck User must change passageword at next login");
				check(WCL_excludepasswordfromnewaccountemail);			
			}
			if (!status.equals("")) {
				Reporter.log("Select status");
				select(WCL_status, status);			
			}
			if (!locked.equals("")) {
				Reporter.log("Check/uncheck locked");
				check(WCL_locked);			
			}
			if (!rolesassigned.equals("")) {
				Reporter.log("Check/uncheck ");
				check(WCL_rolesassigned);			
			}
			if (!rolesnotassigned.equals("")) {
				Reporter.log("Check/uncheck ");
				type(WCL_rolesnotassigned, rolesnotassigned);			
			}
			if (!privilagesassigned.equals("")) {
				Reporter.log("Check/uncheck ");
				type(WCL_privilagesassigned, privilagesassigned);			
			}
			if (!privilagesnotassigned.equals("")) {
				Reporter.log("Check/uncheck ");
				type(WCL_privilagesnotassigned, privilagesnotassigned);			
			}
			if (!statusreportschedule.equals("")) {
				Reporter.log("select Radio button");
				type(WCL_statusreportschedule, statusreportschedule);			
			}
			if (!raaccountassigned.equals("")) {
				Reporter.log("Select RA account");
				select(WCL_raaccountassigned, raaccountassigned);			
			}
			if (!button.equals("")) {
				Reporter.log("Click on save or cancel Button");
				click(WCL_button);		
				waitForPageToLoad();
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}
}
