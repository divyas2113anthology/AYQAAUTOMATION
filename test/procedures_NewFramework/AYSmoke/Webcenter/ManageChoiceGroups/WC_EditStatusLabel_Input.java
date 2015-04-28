package procedures_NewFramework.AYSmoke.Webcenter.ManageChoiceGroups;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_EditStatusLabel_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'Manage Queries' page")
	
	public void WC_EditStatusLabel_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Manage User Queries'Page");
			String[] testdata = datacontainer;
			String groupname = testdata[0];
			String groupdescription = testdata[1];
			String statuscategory = testdata[2];
			String label = testdata[3];
			String active=testdata[4];
			String delete=testdata[5];
			String savecanceladdrow=testdata[6];
			String addrow=testdata[7];
			
			if (!groupdescription.equals("")) {
				Reporter.log("Enter Group Description");
				sendKeys(attributeName_xpath, MCG_groupdescription, groupdescription);	
			}
			if (!addrow.equals("")) {
				Reporter.log("Create a new row");
				clickWebdriver(attributeName_xpath, MCG_AddRow);
			}
			if (!statuscategory.equals("")) {
				Reporter.log("Select ("+statuscategory+")from Status Category");
				selectByVisibleTextWebdriver(attributeName_xpath, MCG_StatusCategory, statuscategory);
				//selectByValueWebdriver(attributeName_xpath, MCG_StatusCategory, "4");
			}
			
			if (!label.equals("")) {
				Reporter.log("Enter Label");
				sendKeys(attributeName_xpath, MCG_label, label);	
			}
			if(!savecanceladdrow.equals("")){
				Reporter.log("Click on the Button"+savecanceladdrow);
				clickWebdriver(attributeName_xpath, AID_save_button);
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}
			
			
}
