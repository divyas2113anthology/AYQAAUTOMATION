package procedures_NewFramework.Connect_AY;

import or.OR;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class Connect_ManageUsers_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Connect_UserLogin' page")
		public void Connect_ManageUsers_Verify() throws Exception{
		try {
			
			Reporter.log("Proceed to retrieve Verify Test Data 'Connect Manage Users' page");
			String[]  testdata = datacontainer;
			String username =testdata[0];
			String firstname =testdata[1];
			String lastname =testdata[2];
			String email =testdata[3];
			String uname =testdata[4];
			
			Reporter.log("Verify Test Data was retrieved for 'Connect Manage User' page");
			if (!username.equals("")) {
				Reporter.log("Step 1 - Verify the User name ["+username+"]");
				//waitForElementPresentVerifyText(uname, username, uname);
				waitForPageToLoadWebdriver();
				waitForElementPresentWebdriver(attributeName_xpath,MML_UNameVerify , username);
				String username_verify= driver.findElement(By.xpath("//table[@id='userSearchResultsTable']/tbody/tr[1]/td[2]")).getText();
				verifyElementContainsTextWebdriver(attributeName_xpath,MML_UNameVerify , username, username_verify);
				//waitForElementVisibleVerifyContainsTextWebdriver(attributeName_xpath,MML_UNameVerify , username, uname);
				//verifyElementPresentWebdriver(attributeName_xpath, MML_UNameVerify, str1);
				//waitForElementPresentWebdriver(attributeName_xpath, CEUP_Lastname, lastnamepresent);
							
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	
	}

}
