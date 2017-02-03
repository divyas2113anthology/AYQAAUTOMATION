package procedures_NewFramework.AYSmoke.Connect;

import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

public class CRM_SearchContacts_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some Operation in 'Search for Contacts' page")
	public void CRM_SearchContacts_Input() throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Search for Contacts' page");
			String[]  testdata = datacontainer;
			String firstname = testdata[0];
			String button = testdata[1];
			String editfirstname = testdata[2];
			Reporter.log("Input Test Data was retrieved for 'Search for Contacts' page");
			if (!firstname.equals("")) {
				try {
					String FirstName = Runtimedataread(firstname);
					Reporter.log("Step 1 - Enter the First Name as ("+FirstName+") ");
					waitForElementPresentWebdriver(attributeName_id, CNT_SearchFrstName, FirstName);
					sendKeys(attributeName_id, CNT_SearchFrstName, FirstName);
				}catch(Exception e){
					Reporter.log("Step 1 - Enter the First Name as ("+firstname+") ");
					waitForElementPresentWebdriver(attributeName_id, CNT_SearchFrstName, firstname);
					sendKeys(attributeName_id, CNT_SearchFrstName, firstname);
				}

			}
			if (!button.equals("")) {
				Reporter.log("Step 2 - Proceed to Click on ("+button+") Link");
				waitForElementPresentWebdriverWait(attributeName_id, CNT_SearchTopBtn, button);
				clickWebdriver(attributeName_id, CNT_SearchTopBtn);
				
			}
			if (!editfirstname.equals("")) {
				String EditFirstName = Runtimedataread(editfirstname);
				Reporter.log("Step 3 - Proceed to Click on Edit ("+EditFirstName+") Link");
				waitForElementPresentWebdriverWait(attributeName_xpath, "//td[text()='"+EditFirstName+"']/preceding-sibling::td/a[text()='Edit']", EditFirstName);
				clickWebdriver(attributeName_xpath, "//td[text()='"+EditFirstName+"']/preceding-sibling::td/a[text()='Edit']");
				waitForPageToLoadWebdriver();
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
}


