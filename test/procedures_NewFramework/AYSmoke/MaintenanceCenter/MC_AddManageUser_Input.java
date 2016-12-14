package procedures_NewFramework.AYSmoke.MaintenanceCenter;


import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

public class MC_AddManageUser_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some input operation in 'Add Manage User' page")
	public void MC_AddManageUser_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Add Manage User' Page");
			String[] testdata = datacontainer;
			String showhideinstruction = testdata[0];
			String savecancel = testdata[1];
			String userid = testdata[2];
			String firstname = testdata[3];
			String lastname = testdata[4];
			String title = testdata[5];
			String emailaddress = testdata[6];
			String status = testdata[7];
			String arrow = testdata[8];
			String rolesassigned = testdata[9];
			String rolesnotassigned = testdata[10];
			String privilegesassigned = testdata[11];
			String checkprivilegesnotassigned = testdata[12];
			String privilegesname = testdata[13];
						
			Reporter.log("Input Test Data was retrieved for 'Add Manage User' Page");
			if (!userid.equals("")) {
				Reporter.log("Enter the user id as ["+userid+"]");
				sendKeys(attributeName_xpath, MS_userid, userid);
			}
			
			if (!firstname.equals("")) {
				Reporter.log("Enter the First Name as ["+firstname+"]");
				sendKeys(attributeName_xpath, MS_firstname, firstname);
			}
			
			if (!lastname.equals("")) {
				Reporter.log("Enter the Last Name as ["+lastname+"]");
				sendKeys(attributeName_xpath, MS_lastname, lastname);
			}

			if (!title.equals("")) {
				Reporter.log("Enter the Title as ["+title+"]");
				sendKeys(attributeName_xpath, MS_title, title);
			}
			if (!emailaddress.equals("")) {
				Reporter.log("Enter the Title as ["+emailaddress+"]");
				sendKeys(attributeName_xpath, MS_Email, emailaddress);
			}
						
			if(!checkprivilegesnotassigned.equals("")){
				Reporter.log("Check"+title);
				//clickWebdriver(attributeName_xpath, MS_CheckPrivilege+privilegesname+"']//preceding-sibling::input[@type='checkbox']");
				//clickWebdriver(attributeName_xpath, "//font[contains(.,'"+checkprivilegesnotassigned+"')]/input[contains(@name,'cbPrivID')]");
				clickWebdriver(attributeName_xpath,"//input[@name='cbPrivID1']");
			}	
		
			if(!savecancel.equals("")){
				Reporter.log("Click on the Button"+savecancel);
				clickWebdriver(attributeName_xpath, MS_savecancel+savecancel+"')]");
			}	
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
	}
