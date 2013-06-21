package procedures_NewFramework.AYSmoke.Webcenter;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_Section_AddEdit_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'Section Add/Edit Input' page")
	public void WC_Section_AddEdit_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Section Add/Edit Input' Page");
			String[] testdata = datacontainer;
			String sectionname = testdata[0];
			String sectiondesc = testdata[1];
			String sectionlabel = testdata[2];
			String sectionorder = testdata[3];
			String updateaftersubmission = testdata[4];
			String savecanceleditdelete = testdata[5];
			Reporter.log("Input Test Data was retrieved for 'Section Add/Edit Input' Page");
//			writeFailure("Given Test Data["+yesno+"] either Incorrect or has not be Scripted ");
			if (!sectionname.equals("")) {
				Reporter.log("Step 1 - Enter the name as ["+sectionname+"]");
				sendKeys(attributeName_xpath, SAE_Name, sectionname);
			}
			if (!sectiondesc.equals("")) {
				Reporter.log("Step 2 - Enter the Description as ["+sectiondesc+"]");
				sendKeys(attributeName_xpath, SAE_Description, sectiondesc);
			}
			if (!sectionlabel.equals("")) {
				Reporter.log("Step 3 - Enter the Label as ["+sectionlabel+"]");
				sendKeys(attributeName_xpath, SAE_Label, sectionlabel);
			}
			if (!sectionorder.equals("")) {
				Reporter.log("Step 4 - Select the Order as ["+sectionorder+"]");
				selectByValueWebdriver(attributeName_xpath, SAE_Order, sectionorder);
			}
			if (!updateaftersubmission.equals("")) {
				Reporter.log("Step 5 - Select the Update After Submission as ["+updateaftersubmission+"]");
				if (updateaftersubmission.equalsIgnoreCase("Check")) {
					checkWebdriverCheckbox(attributeName_xpath, SAE_AfterSubmission);
				} else if (updateaftersubmission.equalsIgnoreCase("UnCheck")) {
					uncheckWebdriverCheckbox(attributeName_xpath, SAE_AfterSubmission);
				} 
			}
			if (!savecanceleditdelete.equals("")) {
				Reporter.log("Step 6 - Click the Button as ["+savecanceleditdelete+"]");
				if (savecanceleditdelete.equals("Save")) {
					clickWebdriver(attributeName_xpath, SAE_SaveButton);
				}else if (savecanceleditdelete.equals("Delete")) {
					clickWebdriver(attributeName_xpath, SAE_DeleteButton);
				}else if (savecanceleditdelete.equals("Edit")) {
					clickWebdriver(attributeName_xpath, SAE_EditButton);
				}else if (savecanceleditdelete.equals("Cancel")) {
					clickWebdriver(attributeName_xpath, SAE_CancelButton);
				}
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}
