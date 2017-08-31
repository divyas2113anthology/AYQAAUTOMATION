package procedures_NewFramework.Connect_AY;

import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

public class Connect_EditUserProfile_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This procedure is used to verify the 'Edit User Profile' page matches with Application")
	public void Connect_EditUserProfile_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Edit User Profile' Page");
			String[] testdata = datacontainer;
			String firstname = testdata[0];
			String lastname = testdata[1];
			String emailid = testdata[2];
			String pass = testdata[3];
			String confirmpass = testdata[4];
			String savecancel = testdata[5];
			String application = testdata[6];
			
			
			Reporter.log("Input Test Data was retrieved for 'Edit User Profile' Page");

			if (!lastname.equals("")) {
								
				Reporter.log("Step 1 - Enter Last Name as ["+lastname+"]");
				sendKeys(attributeName_xpath, CEUPI_Lastname, lastname);
				waitForPageToLoadWebdriver();
				
			}
			if (!pass.equals("")) {

				Reporter.log("Step 2 - Enter New password as ["+lastname+"]");
				sendKeys(attributeName_xpath,CEUP_NewPass,pass);


			}
			if (!confirmpass.equals("")) {

				Reporter.log("Step 3 - Enter the confirm password as ["+lastname+"]");
				sendKeys(attributeName_xpath,CEUP_ConfirmPass,confirmpass);


			}


			if (!savecancel.equals("")) {
				
					Reporter.log("Step 4 - Click on Save or Cancel");
				
				if (savecancel.equalsIgnoreCase("save")) {
					clickWebdriver(attributeName_xpath, CEUP_Save);
					waitForPageToLoadWebdriver();
				}else if (savecancel.equalsIgnoreCase("cancel")) {
					clickWebdriver(attributeName_xpath, CEUP_Cancel);
					waitForPageToLoadWebdriver();
				}
				
			}
			if (!application.equals("")) {
				Reporter.log("Step 3 - Click on Application to redirect to Applicant Page");
				clickWebdriver(attributeName_xpath, CEUP_Application);
				waitForPageToLoadWebdriver();
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}
