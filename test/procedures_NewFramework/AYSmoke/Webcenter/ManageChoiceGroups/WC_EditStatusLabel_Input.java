package procedures_NewFramework.AYSmoke.Webcenter.ManageChoiceGroups;

import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

import java.util.Calendar;

public class WC_EditStatusLabel_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'Manage Choice Groups' page")
	
	public void WC_EditStatusLabel_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Manage Choice Groups");
			String[] testdata = datacontainer;
			String groupname = testdata[0];
			String groupdescription = testdata[1];
			String statuscategory = testdata[2];
			String labelName = testdata[3];
			String label = testdata[4];
			String active=testdata[5];
			String delete=testdata[6];
			String savecanceladdrow=testdata[7];
			String addrow=testdata[8];
			switchToDefaultContentWebdriver();
			switchToFrameNameIdWebdriver("frmContent");
			
			if (!groupdescription.equals("")) {
				Reporter.log("Enter Group Description");
				sendKeys(attributeName_xpath, MCG_groupdescription, groupdescription);	
			}
			
			if (!addrow.equals("")) {
				Reporter.log("Create a new row");
				waitForElementPresentWebdriver(attributeName_xpath, MCG_AddRow, "Plus");
				clickWebdriver(attributeName_xpath, MCG_AddRow);
				
			}
			if (!statuscategory.equals("")) {
				Reporter.log("Select ("+statuscategory+")from Status Category");
				String RowNumber = getTextWebdriver(attributeName_xpath, MCG_RowValue);
				System.out.println("RowNumber is "+RowNumber);
				selectByVisibleTextWebdriver(attributeName_xpath, MCG_StatusCategory+RowNumber+"')]", statuscategory);
				//selectByValueWebdriver(attributeName_xpath, MCG_StatusCategory, "4");
			}
			
			if (!labelName.equals("")) {
				Reporter.log("Enter Label");
				String Label = labelName+Calendar.getInstance().getTimeInMillis();
				sendKeys(attributeName_xpath,MCG_label,Label);
				Runtimedatawrite(Label, label);
				}
			
			if(!active.equals("")){		
				String Active = Runtimedataread(active);
				waitForElementPresentWebdriver(attributeName_xpath, MCG_Active+Active+"']]/following-sibling::td[input[@type='checkbox']]", Active);
				clickWebdriver(attributeName_xpath, MCG_Active+Active+"']]/following-sibling::td[input[@type='checkbox']]");	
				//td[input[@value='TestingSupport']]/following-sibling::td[input[@type='checkbox']]
			}
			
			if(!delete.equals("")){			
				String Delete = Runtimedataread(delete);
				waitForElementPresentWebdriver(attributeName_xpath, MCG_DeleteCheck+Delete+"']]/following-sibling::td[input[@name='chkDelete']]", Delete);
				clickWebdriver(attributeName_xpath, MCG_DeleteCheck+Delete+"']]/following-sibling::td[input[@name='chkDelete']]");	
				//td[input[@value='TestingSupport']]/following-sibling::td[input[@name='chkDelete']]
			}

			if (!savecanceladdrow.equals("")) {
				Reporter.log("Check the Name of the Button as ["+savecanceladdrow+"]");
				if (savecanceladdrow.equalsIgnoreCase("save")) {
					waitForElementPresentWebdriver(attributeName_xpath, AID_save_button, "Save");
					clickWebdriver(attributeName_xpath, AID_save_button);
					waitForPageToLoadWebdriver();
					}
			}
		     switchToDefaultContentWebdriver();
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}
			
			
}
