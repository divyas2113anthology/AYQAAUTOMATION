package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.Exports;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_ManageExportTemplate_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'Manage Export Template' page")
	public void WC_ManageExportTemplate_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Manage Export Template' Page");
			String[] testdata = datacontainer;
			String checktemplatenamecheckbox = testdata[0];
			String clicktemplatename = testdata[1];
			String button = testdata[2];
			Reporter.log("Input Test Data was retrieved for 'Manage Export Template' Page");
//			writeFailure("Given Test Data["+yesno+"] either Incorrect or has not be Scripted ");
			waitForElementPresentWebdriver(attributeName_xpath, MCL_MoveToFolderBtn, "Move to folder Button");
			if (!checktemplatenamecheckbox.equals("")) {
				Reporter.log("Step 1 - Perform the operation to check the checkbox as ["+checktemplatenamecheckbox+"]");
				if (checktemplatenamecheckbox.equalsIgnoreCase("check")) {
					checkWebdriverCheckbox(attributeName_xpath, "//td[a[contains(text(),'"+checktemplatenamecheckbox+"')]]/preceding-sibling::td/input[@type='checkbox']");
				}else if (checktemplatenamecheckbox.equalsIgnoreCase("uncheck")) {
					uncheckWebdriverCheckbox(attributeName_xpath, "//td[a[contains(text(),'"+checktemplatenamecheckbox+"')]]/preceding-sibling::td/input[@type='checkbox']");
				}
			}			
			if (!clicktemplatename.equals("")) {
				Reporter.log("Step 2 - Click the Name of the Record as ["+clicktemplatename+"]");
				clickWebdriver(attributeName_xpath, "//a[contains(text(),'"+clicktemplatename+"')]");
			}
			if (!button.equals("")) {
				Reporter.log("Step 3 - Click button as ["+button+"]");
				if (button.equalsIgnoreCase("Add")) {
					clickWebdriver(attributeName_xpath, MSR_AddBtn);
					waitForPageToLoadWebdriver();
				}else if (button.equalsIgnoreCase("Delete")) {
					clickWebdriver(attributeName_xpath, SAE_DeleteButton);
					waitForPageToLoadWebdriver();
				}else if (button.equalsIgnoreCase("Copy")) {
					clickWebdriver(attributeName_name, "imageCopy");
					waitForPageToLoadWebdriver();
				}else if (button.equalsIgnoreCase("Move To Folder")) {
					clickWebdriver(attributeName_xpath, EA_MoveToFolder);
					waitForPageToLoadWebdriver();
				}
			}			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}



