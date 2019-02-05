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
			String internalname = testdata[0];
			String title = testdata[1];
			String where = testdata[2];
			String eventcategory = testdata[3];
			String host = testdata[4];
			String operation_to_perform = testdata[5];
			String eventstatus = testdata[6];
			String eventtype = testdata[7];
			String searcheventdatequery = testdata[8];
			String submit = testdata[9];
			String userqueries = testdata[10];//Added by Rahul Mehta
			Reporter.log("Input Test Data was retrieved for 'Search For Events' Page");
			if (!internalname.equals("")) {
				Reporter.log("Step 1 - Enter the Internal Name as ["+internalname+"]");
				sendKeys(attributeName_xpath, SFE_InternalName, internalname);
			}
			if (!title.equals("")) {
				Reporter.log("Step 2 - Enter the title as ["+title+"]");
				String Title = Runtimedataread(title);
				sendKeys(attributeName_xpath, SFE_Title, Title);
			}
			if (!where.equals("")) {
				Reporter.log("Step 3 - Select a 'where' as ["+where+"]");
				selectByValueWebdriver(attributeName_xpath, SFE_Where, where);
			}			
			if (!eventcategory.equals("")) {
				Reporter.log("Step 4 - Select a event category as ["+eventcategory+"]");
				selectByValueWebdriver(attributeName_xpath, SFE_EventCategory, eventcategory);				
			}
			if (!host.equals("")) {
				Reporter.log("Step 5 - Select a host as ["+host+"]");
				selectByValueWebdriver(attributeName_xpath, SFE_Host, host);
			}
			if (!operation_to_perform.equals("") && !eventstatus.equals("")) {
				Reporter.log("Step 6 - Select the Event status as ["+eventstatus+"]");
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
			}

			if (!eventtype.equals("")) {
				Reporter.log("Step 7 - Select the event type as ["+eventtype+"]");
				selectByValueWebdriver(attributeName_xpath, SFE_EventType, eventtype);
			}
			if (!searcheventdatequery.equals("")) {
				Reporter.log("Step 8 - Click the Radio button with respect the Submit button as ["+searcheventdatequery+"]");
				clickWebdriver(attributeName_xpath, "//td[font[text()='"+searcheventdatequery+SFE_SearchByRadio);
				clickWebdriver(attributeName_xpath, "//td[font[text()='"+searcheventdatequery+SFE_SearchBySubmit);
				waitForPageToLoadWebdriver();
			}			
			if (!submit.equals("")) {
				Reporter.log("Step 9 - Click the submit button");
				clickWebdriver(attributeName_xpath, SAI_SubmitBtnBottom);
			}
			//Added By Rahul Mehta --start
			if (!userqueries.equals("")) {
				Reporter.log("Step 10 - Select the user quries as ["+userqueries+"]");
				if(isElementPresentWebdriver(attributeName_xpath, SAI_UserQuries))
				{
					clickWebdriver(attributeName_xpath, SAI_UserQuries);
					waitForPageToLoadWebdriver();
					clickWebdriver(attributeName_xpath, MQ_Queryselect+userqueries+"')]");
				} 	
				}
			//Added by Rahul Mehta --end
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
}