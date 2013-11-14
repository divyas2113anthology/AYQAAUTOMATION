package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.Exports;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_AddExportTemplate_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'Add Export Template' page")
	public void WC_AddExportTemplate_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Add Export Template' Page");
			String[] testdata = datacontainer;
			String exportname = testdata[0];
			String description = testdata[1];
			String folder = testdata[2];
			String linedelimiter = testdata[3];
			String fileformat = testdata[4];
			String delimiter = testdata[5];
			String delimitertype = testdata[6];
			String quotedstring = testdata[7];
			String lock = testdata[8];
			String click = testdata[9];
			Reporter.log("Input Test Data was retrieved for 'Add Export Template' Page");
			Date date = new Date();  
			DateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
			String ExportName = exportname+dateFormat.format(date)+Calendar.getInstance().getTimeInMillis();	
			if (!exportname.equals("")) {
				Reporter.log("Step 1 - Enter the Import as ["+ExportName+"]");
				sendKeys(attributeName_name, "txtName", ExportName);
			}
			String Description = description+dateFormat.format(date)+Calendar.getInstance().getTimeInMillis();    
			if (!description.equals("")) {
				Reporter.log("Step 2 - Enter the Description as ["+Description+"]");
				sendKeys(attributeName_name, "txtDescription", Description);
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
			if (!quotedstring.equals("")) {
				Reporter.log("Step 8 - Choose the Important Update as ["+quotedstring+"]");
				if (quotedstring.contains("Check")) {
					checkWebdriver(attributeName_name, "chkUpdate");
				}else if (quotedstring.contains("Uncheck")) {
					checkWebdriver(attributeName_name, "chkUpdate");
				}
			}
			if (!lock.equals("")) {
				Reporter.log("Step 9 - Choose the Lock as ["+lock+"]");
				if (lock.contains("Check")) {
					checkWebdriver(attributeName_name, "cbxLock");
				}else if (lock.contains("Uncheck")) {
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
