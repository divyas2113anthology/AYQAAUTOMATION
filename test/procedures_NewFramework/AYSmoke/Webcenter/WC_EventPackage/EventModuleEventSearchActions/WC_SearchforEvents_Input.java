package procedures_NewFramework.AYSmoke.Webcenter.WC_EventPackage.EventModuleEventSearchActions;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_SearchforEvents_Input extends CommonSeleniumActions implements OR {

	@Test(description="This Procedure is used to perform some operation in 'Search For Events' page")
	public void WC_SearchforEvents_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Search For Events' Page");
			String[] testdata = datacontainer;
			String searcheventdatequery = testdata[0];
			String internalname = testdata[1];
			String title = testdata[2];
			String where = testdata[3];
			String eventcategory = testdata[4];
			String host = testdata[5];
			String operation_to_perform = testdata[6];
			String eventstatus = testdata[7];
			String eventtype = testdata[8];
			String submit = testdata[9];
			Reporter.log("Input Test Data was retrieved for 'Search For Events' Page");
			//			writeFailure("Given Test Data["+yesno+"] either Incorrect or has not be Scripted ");
			if (!searcheventdatequery.equals("")) {
				Reporter.log("Step 1 - Click the Radio button with respect the Submit button as ["+searcheventdatequery+"]");
				clickWebdriver(attributeName_xpath, "//td[font[text()='"+searcheventdatequery+SFE_SearchByRadio);
				clickWebdriver(attributeName_xpath, "//td[font[text()='"+searcheventdatequery+SFE_SearchBySubmit);
			}			
			if (!internalname.equals("")) {
				Reporter.log("Step 13 - Enter the Internal Name as ["+internalname+"]");
				sendKeys(attributeName_xpath, SFE_InternalName, internalname);
			}
			if (!title.equals("")) {
				Reporter.log("Step 14 - Enter the title as ["+title+"]");
				sendKeys(attributeName_xpath, SFE_Title, title);
			}
			if (!where.equals("")) {
				Reporter.log("Step 4 - Select a 'where' as ["+where+"]");
				selectByValueWebdriver(attributeName_xpath, SFE_Where, where);
			}			
			if (!eventcategory.equals("")) {
				Reporter.log("Step 5 - Select a event category as ["+eventcategory+"]");
				selectByValueWebdriver(attributeName_xpath, SFE_EventCategory, eventcategory);				
			}
			if (!host.equals("")) {
				Reporter.log("Step 6 - Select a host as ["+host+"]");
				selectByValueWebdriver(attributeName_xpath, SFE_Host, host);
			}
			if (!operation_to_perform.equals("") && !eventstatus.equals("")) {
				Reporter.log("Step 7 - Select the Event status as ["+eventstatus+"]");
				String [] splitstatus = eventstatus.split(";");
				for (int i = 0; i < splitstatus.length; i++) {
					if (eventstatus.equalsIgnoreCase(splitstatus[i])) {
						if (operation_to_perform.equalsIgnoreCase("Check")) {
							checkWebdriverCheckbox(attributeName_xpath, "//font[text()='"+eventstatus+"'"+SFE_Status);
						}else if (operation_to_perform.equalsIgnoreCase("Uncheck")) {
							uncheckWebdriverCheckbox(attributeName_xpath, "//font[text()='"+eventstatus+"'"+SFE_Status);
						}
					}
				}

				if (!eventtype.equals("")) {
					Reporter.log("Step 8 - Select the event type as ["+eventtype+"]");
					selectByValueWebdriver(attributeName_xpath, SFE_EventType, eventtype);
				}
				if (!submit.equals("")) {
					Reporter.log("Step 9 - Click the submit button");
					clickWebdriver(attributeName_xpath, SAI_SubmitBtnBottom);
				}
			}


		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
}