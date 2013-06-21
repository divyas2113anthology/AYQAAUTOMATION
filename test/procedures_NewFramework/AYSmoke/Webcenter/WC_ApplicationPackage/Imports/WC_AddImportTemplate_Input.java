package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.Imports;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_AddImportTemplate_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'Add Import Template' page")
	public void WC_AddImportTemplate_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Add Import Template' Page");
			String[] testdata = datacontainer;
			String importname = testdata[0];
			String description = testdata[1];
			String folder = testdata[2];
			String linedelimiter = testdata[3];
			String fileformat = testdata[4];
			String delimiter = testdata[5];
			String delimitertype = testdata[6];
			String importanupdate = testdata[7];
			String lock = testdata[8];
			String click = testdata[9];
			Reporter.log("Input Test Data was retrieved for 'Add Import Template' Page");
//			writeFailure("Given Test Data["+yesno+"] either Incorrect or has not be Scripted ");
			if (!importname.equals("")) {
				Reporter.log("Step 1 - Enter the Import as ["+importname+"]");
				sendKeys(attributeName_name, "txtName", importname);
			}
			if (!description.equals("")) {
				Reporter.log("Step 2 - Enter the Description as ["+description+"]");
				sendKeys(attributeName_name, "txtDescription", description);
			}
			if (!folder.equals("")) {
				Reporter.log("Step 3 - Select the Folder Type as ["+folder+"]");
				selectByValueWebdriver(attributeName_name, "Group", folder);
			}
			if (!linedelimiter.equals("")) {
				Reporter.log("Step 4 - Select the Line Delimiter as ["+linedelimiter+"]");
				if (linedelimiter.equalsIgnoreCase("CRLF")) {
					clickWebdriver(attributeName_xpath, AIT_CRLF);
				}else if (linedelimiter.equalsIgnoreCase("LF")) {
					clickWebdriver(attributeName_xpath, AIT_LF);
				}
			}
			if (!fileformat.equals("")) {
				Reporter.log("Step 5 - Select the File Format as ["+fileformat+"]");
				selectByValueWebdriver(attributeName_name, "txtFormatTypeId", fileformat);
			}
			if (!delimiter.equals("")) {
				Reporter.log("Step 6 - Select the Delimiter as ["+delimiter+"]");
				selectByValueWebdriver(attributeName_name, "selDelimiter", delimiter);
			}
			if (!delimitertype.equals("")) {
				Reporter.log("Step 7 - Enter the value as ["+delimitertype+"]");
				String Delimitertype = delimitertype.replace(";", ",");
				sendKeys(attributeName_name, "txtDelimiter", Delimitertype);
			}
			if (!importanupdate.equals("")) {
				Reporter.log("Step 8 - Choose the Important Update as ["+importanupdate+"]");
				if (importanupdate.contains("Check")) {
					checkWebdriver(attributeName_name, "chkUpdate");
				}else if (importanupdate.contains("Uncheck")) {
					checkWebdriver(attributeName_name, "chkUpdate");
				}
			}
			if (!lock.equals("")) {
				Reporter.log("Step 9 - Choose the Lock as ["+lock+"]");
				if (importanupdate.contains("Check")) {
					checkWebdriver(attributeName_name, "cbxLock");
				}else if (importanupdate.contains("Uncheck")) {
					checkWebdriver(attributeName_name, "cbxLock");
				}
			}
			if (!click.equals("")) {
				Reporter.log("Step 10 - Click the Button as ["+click+"]");
				if (click.equals("Save")) {
					clickWebdriver(attributeName_xpath, QAE_SaveButton);
				} else if (click.equals("Cancel")) {
					clickWebdriver(attributeName_xpath, QAE_CancelButton);
				}
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}