package procedures_NewFramework.AYSmoke.Connect;

import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

public class CRM_NewContactCommunication_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some Operation in 'Search for Contacts' page")
	public void CRM_NewContactCommunication_Input() throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Search for Contacts' page");
			String[]  testdata = datacontainer;
			/*String firstname = testdata[0];
			String button = testdata[1];
			String editfirstname = testdata[2];
			Reporter.log("Input Test Data was retrieved for 'Search for Contacts' page");
			if (!firstname.equals("")) {
				String FirstName = Runtimedataread(firstname);
				Reporter.log("Step 1 - Enter the First Name as ("+FirstName+") ");
				waitForElementPresentWebdriver(attributeName_id, CNT_SearchFrstName, FirstName);
				sendKeys(attributeName_id, CNT_SearchFrstName, FirstName);
			}
			if (!button.equals("")) {
				Reporter.log("Step 2 - Proceed to Click on ("+button+") Link");
				waitForElementPresentWebdriver(attributeName_id, CNT_SearchTopBtn, button);
				clickWebdriver(attributeName_id, CNT_SearchTopBtn);
				waitForPageToLoadWebdriver();
			}
			if (!editfirstname.equals("")) {
				String EditFirstName = Runtimedataread(editfirstname);
				Reporter.log("Step 3 - Proceed to Click on Edit ("+EditFirstName+") Link");
				clickWebdriver(attributeName_xpath, "//td[text()='"+EditFirstName+"']/preceding-sibling::td/a[text()='Edit']");
				waitForPageToLoadWebdriver();
			}*/
			String commtype = testdata[0];
			String otherlogentry_select = testdata[1];
			String clickmanage = testdata[2];
			String name = testdata[3];
			String description = testdata[4];
			String communicationdetails = testdata[5];
			String specficdateandtime = testdata[6];
			String content = testdata[7];
			String button_to_click = testdata[8];
			if(!commtype.equals("")){
				Reporter.log("Step 1 - Select Communication type as "+commtype);
			}
			if(!otherlogentry_select.equals("")){
				Reporter.log("Step 2 - Select Log enter as "+otherlogentry_select);
				waitForElementPresentWebdriverWait(attributeName_xpath, BR_CommType, otherlogentry_select);
				selectByVisibleTextWebdriver(attributeName_xpath, BR_CommType, otherlogentry_select);
			}
			if(!clickmanage.equals("")){
				Reporter.log("Step 3 - Clicking on "+clickmanage);
				waitForElementPresentWebdriverWait(attributeName_xpath, BR_CommType, otherlogentry_select);
				selectByVisibleTextWebdriver(attributeName_xpath, BR_CommType, otherlogentry_select);
			}
			if(!name.equals("")){
				Reporter.log("Step 3 - Enter Name as "+name);
				waitForElementPresentWebdriverWait(attributeName_xpath, BR_CommName, name);
				sendKeys(attributeName_xpath, BR_CommName, name);
			}
			if(!description.equals("")){
				Reporter.log("Step 4 - Enter the description as"+description);
				waitForElementPresentWebdriverWait(attributeName_xpath, BR_CommType, otherlogentry_select);
				selectByVisibleTextWebdriver(attributeName_xpath, BR_CommType, otherlogentry_select);
			}
			if(!communicationdetails.equals("")){
				Reporter.log("Step 5 - Select communication details "+communicationdetails);
				
			}
			if(!specficdateandtime.equals("")){
				Reporter.log("Step 6 - Select Specific Date/Time "+specficdateandtime);
				
			}
			if(!content.equals("")){
				Reporter.log("Step 7 - Enter the content as "+content);
				waitForElementPresentWebdriverWait(attributeName_xpath, BR_CommContent, content);
				sendKeys(attributeName_xpath, BR_CommContent, content);
			}
			if(!button_to_click.equals("")){
				Reporter.log("Step 8 - Clicking on "+button_to_click);
				waitForElementPresentWebdriverWait(attributeName_xpath, BR_SaveCancel+button_to_click+"')]", button_to_click);
				clickWebdriver(attributeName_xpath, BR_SaveCancel+button_to_click+"')]");
				waitForPageToLoadWebdriver();
				}

		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
}



