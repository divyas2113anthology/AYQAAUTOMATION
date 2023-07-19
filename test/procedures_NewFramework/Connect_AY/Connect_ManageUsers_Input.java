package procedures_NewFramework.Connect_AY;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class Connect_ManageUsers_Input  extends CommonSeleniumActions implements OR {
	
	@Test(description="This procedure is used to search Manage User from CRM")
	public void Connect_ManageUsers_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for Manage User from CRM");
			String[] testdata = datacontainer;
			String username = testdata[0];
			String firstname = testdata[1];
			String lastname = testdata[2];
			String email = testdata[3];
			String activestatus = testdata[4];
			String lockedstatus = testdata[5];
			String usertype = testdata[6];
			String searchclear = testdata[7];
			
			Reporter.log("Input Test Data was retrieved for 'Manage User from CRM' Page");

			if (!username.equals("")) {
				String VerifyuserName = Runtimedataread(username);
				Reporter.log("Step 1 - Enter the User name to Search as ["+VerifyuserName+"]");
				sendKeys(attributeName_xpath, "(//input[@type='text'])[3]", VerifyuserName);
				waitForPageToLoadWebdriver();
			}
			if (!searchclear.equals("")) {
				if(searchclear.equalsIgnoreCase("Search"))
				{
						Reporter.log("Step 2 - Click on ["+searchclear+"]");
						clickWebdriver(attributeName_xpath, "(//button[@type='button'])[6]");
						mouseOverWebdriver(attributeName_xpath,"(//li[@class='p-column-filter-row-item ng-tns-c50-0 ng-star-inserted'])[1]");
						clickWebdriver(attributeName_xpath,"(//li[@class='p-column-filter-row-item ng-tns-c50-0 ng-star-inserted'])[1]");
					Thread.sleep(10000);
						waitForPageToLoadWebdriver();
				}
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}
