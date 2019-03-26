package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.Imports;

import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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
			Date date = new Date();  
			DateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
			String ImportName = importname+dateFormat.format(date)+Calendar.getInstance().getTimeInMillis();	
			if (!importname.equals("")) {
				Reporter.log("Step 1 - Enter the Import as ["+ImportName+"]");
				if(importname.equals("TestImport"))
					sendKeys(attributeName_name, "txtName", importname);
				else
					sendKeys(attributeName_name, "txtName", ImportName);
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
				//selectByValueWebdriver(attributeName_name, "txtFormatTypeId", fileformat);
				selectByVisibleTextWebdriver(attributeName_name, "txtFormatTypeId", fileformat);
			}
			if (!delimiter.equals("")) {
				Reporter.log("Step 6 - Select the Delimiter as ["+delimiter+"]");
				//selectByValueWebdriver(attributeName_name, "selDelimiter", delimiter);
				selectByVisibleTextWebdriver(attributeName_name, "selDelimiter", delimiter);
			}
			if (!delimitertype.equals("")) {
				Reporter.log("Step 7 - Enter the value as ["+delimitertype+"]");
				if(delimitertype.equals("comma")){
					//String Delimitertype = delimitertype.replace(";" , ",");
					String Delimitertype = delimitertype.replace(delimitertype, ",");
					System.out.println("aaa"+Delimitertype);
					sendKeys(attributeName_name, "txtDelimiter", Delimitertype);
				}
				else
				{
					String Delimitertype = delimitertype.replace(";" , ",");
					sendKeys(attributeName_name, "txtDelimiter", Delimitertype);
				}
				//Removed wait time
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
				if (click.equalsIgnoreCase("Save")) {
					waitForElementPresentWebdriver(attributeName_xpath, QAE_SaveButton, click);
					clickWebdriver(attributeName_xpath, QAE_SaveButton);
					sleep(3);
					waitForPageToLoadWebdriver();//Modifieb by Rahul Mehta on 26th March,2019
				} else if (click.equals("Cancel")) {
					clickWebdriver(attributeName_xpath, QAE_CancelButton);
				}else if (click.equalsIgnoreCase("Field Definitions")) {

					clickWebdriver(attributeName_xpath, AE_FieldDefBtn);
					waitForPageToLoadWebdriver();
					//switchToFrameNameIdWebdriver("//iframe[@name='frameActions']");
					switchToFrameIndexWebdriver(1);
					clickWebdriver(attributeName_xpath,"//img[@name='BtnRemoveAll']");
					switchToDefaultContentWebdriver();
					waitForPageToLoadWebdriver();
				}
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}