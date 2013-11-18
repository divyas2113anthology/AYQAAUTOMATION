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
			String raaccountassigned = testdata[16];
			String button = testdata[17];
			
			Reporter.log("Input Test Data was retrieved for 'Webcenter add user' Page");
			if (!userid.equals("")) {
				Reporter.log("Enter User ID");
				waitForElementPresentWebdriver(attributeName_cssselector, WCL_userid, userid);
				sendKeys(attributeName_cssselector, WCL_userid, userid);			
			}
			if (!firstname.equals("")) {
				Reporter.log("Enter first name");
				sendKeys(attributeName_cssselector, WCL_firstname, firstname);			
			}
			if (!lastname.equals("")) {
				Reporter.log("Enter last name");
				sendKeys(attributeName_cssselector, WCL_lastname, lastname);			
			}
			if (!title.equals("")) {
				Reporter.log("Enter title");
				sendKeys(attributeName_cssselector, WCL_title, title);			
			}
			if (!emailaddress.equals("")) {
				Reporter.log("Enter email address");
				sendKeys(attributeName_cssselector, WCL_emailaddress, emailaddress);			
			}
			if (!password.equals("")) {
				Reporter.log("Enter password");
				sendKeys(attributeName_cssselector, WCL_password, password);	
			}
			if (!confrmpassword.equals("")) {
				Reporter.log("Enter confirm password");
				sendKeys(attributeName_cssselector, WCL_confrmpassword, confrmpassword);			
			}
			if (!changepassword.equals("")) {
				Reporter.log("Change password");
				sendKeys(attributeName_cssselector, WCL_changepassword, changepassword);			
			}
			if (!excludepasswordfromnewaccountemail.equals("")) {
				Reporter.log("Check/uncheck User must change passageword at next login");
				check(WCL_excludepasswordfromnewaccountemail);			
			}
			if (!status.equals("")) {
				Reporter.log("Select status");
				selectByVisibleTextWebdriver(attributeName_name, WCL_status, status);			
			}
			if (!locked.equals("")) {
				Reporter.log("Check/uncheck locked");
				if (locked.contains("Check")) {
					checkWebdriver(attributeName_name, WCL_locked);
				}else if (locked.contains("Uncheck")) {
					uncheckWebdriver(attributeName_name, WCL_locked);
				}
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
				Reporter.log("Click on save or cancel Button as ["+button+"]");
				if (button.equalsIgnoreCase("Save")) {
					clickWebdriver(attributeName_xpath, WCL_Savebutton);		
					waitForPageToLoadWebdriver();
				}else if (button.equalsIgnoreCase("Cancel")) {
					clickWebdriver(attributeName_xpath, WCL_Cancelbutton);		
					waitForPageToLoadWebdriver();
				}
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}
}
