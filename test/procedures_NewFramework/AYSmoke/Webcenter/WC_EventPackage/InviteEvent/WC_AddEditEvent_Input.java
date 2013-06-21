package procedures_NewFramework.AYSmoke.Webcenter.WC_EventPackage.InviteEvent;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;
public class WC_AddEditEvent_Input  extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some Operation on 'Add/Edit Event' Page")
	public void WC_AddEditEvent_Input(){
		try {
			writeDetails();
			Reporter.log("This procedure is used to input Add/Edit new Event");
			String[] testdata = datacontainer;
			String classification = testdata[0];
			String internalname = testdata[1];
			String title = testdata[2];
			String titlelabel = testdata[3];
			String description = testdata[4];
			String eventype = testdata[5];
			String category = testdata[6];
			String where = testdata[7];
			String location = testdata[8];
			String startdate = testdata[9];
			String startdatehour = testdata[10];
			String startdateminute = testdata[11];
			String enddate = testdata[12];
			String enddatehour = testdata[13];
			String enddateminute = testdata[14];
			String startacceptdate = testdata[15];
			String rsvpdate = testdata[15];
			String closeeventtext = testdata[16];
			String waitlistemail = testdata[17];
			String recurrencetype = testdata[18];
			String registerdeclineemail = testdata[19];
			String group = testdata[20];
			String editeventurlcontains = testdata[21];
			String button = testdata[22];
			Reporter.log("Input Test Data was retrieved for 'Webcenter Add/Edit Event' Page");
			if (!classification.equals("")) {
				Reporter.log("Step 1 - Select the Classification as ["+classification+"]");
				if (classification.equalsIgnoreCase("Event")) {
					checkWebdriverCheckbox(attributeName_xpath, AEE_ClasEvent);
				}else if (classification.equalsIgnoreCase("Interview")) {
					checkWebdriverCheckbox(attributeName_xpath, AEE_ClasInterview);
				}	
			}
			if (!internalname.equals("")) {
				Reporter.log("Step 2 - Enter the Internal Name as ["+internalname+"]");
				sendKeys(attributeName_xpath, AEE_IntName, internalname);
			}
			Date date = new Date();  
			DateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
			String eventTitle = title+dateFormat.format(date)+Calendar.getInstance().getTimeInMillis();				
			if (!title.equals("")) {
				Reporter.log("Step 1 - Enter 'Event Title' as ("+eventTitle+")");
				type(CA_FirstName, eventTitle);	
				if (!titlelabel.equals("")) {
					Reporter.log("Proceed to Write Event Title as ("+titlelabel+") in the Excel Sheet(C:/Selenium/InputTestdata.xls)");
					Runtimedatawrite(eventTitle, titlelabel);
				}
			}
			if (!description.equals("")) {
				Reporter.log("Step 5 - Enter the Description as ["+description+"]");
				sendKeys(attributeName_xpath, AEE_Description, description);
			}
			if (!eventype.equals("")) {
				Reporter.log("Step 6 - Select the event type as ["+eventype+"]");
				selectByValueWebdriver(attributeName_xpath, AEE_EventType, eventype);
			}
			if (!category.equals("")) {
				Reporter.log("Step 7 - Select the category as ["+category+"]");
				selectByValueWebdriver(attributeName_xpath, AEE_Category, category);
			}
			if (!where.equals("")) {
				Reporter.log("Select the where as ["+where+"]");
				selectByValueWebdriver(attributeName_xpath, AEE_Where, where);
			}
			if (!location.equals("")) {
				Reporter.log("Step 8 - Enter the location as ["+location+"]");
				sendKeys(attributeName_xpath, AEE_Location, location);
			}
			if (!startdate.equals("")) {
				Reporter.log("Step 9 - Enter the start date as ["+startdate+"]");
				sendKeys(attributeName_xpath, AEE_StartDate, startdate);
			}
			if (!startdatehour.equals("")) {
				Reporter.log("Step 10 - Enter the end date hour as ["+startdatehour+"]");
				selectByValueWebdriver(attributeName_xpath, AEE_StartHour, startdatehour);
			}
			if (!startdateminute.equals("")) {
				Reporter.log("Step 11 - Enter the end date minute as ["+startdateminute+"]");
				selectByValueWebdriver(attributeName_xpath, AEE_StartMinute, startdateminute);
			}
			if (!enddate.equals("")) {
				Reporter.log("Step 12 - Enter the end date as ["+enddate+"]");
				sendKeys(attributeName_xpath, AEE_EndDate, enddate);
			}
			if (!enddatehour.equals("")) {
				Reporter.log("Step 13 - Enter the end date hour as ["+enddatehour+"]");
				selectByValueWebdriver(attributeName_xpath, AEE_EndHour, enddatehour);
			}
			if (!enddateminute.equals("")) {
				Reporter.log("Step 14 - Enter the end date minute as ["+enddateminute+"]");
				selectByValueWebdriver(attributeName_xpath, AEE_EndMinute, enddateminute);
			}
			if (!startacceptdate.equals("")) {
				Reporter.log("Step 15 - Enter the start accept date as ["+startacceptdate+"]");
				sendKeys(attributeName_xpath, AEE_StartAccDate, startacceptdate);
			}
			if (!rsvpdate.equals("")) {
				Reporter.log("Step 16 - Enter the RSVP date as ["+rsvpdate+"]");
				sendKeys(attributeName_xpath, AEE_RSVPDate, rsvpdate);
			}
			if (!closeeventtext.equals("")) {
				Reporter.log("Step 17 - Enter the close event text as ["+closeeventtext+"]");
				sendKeys(attributeName_xpath, AEE_CloseEventText, closeeventtext);
			}
			if (!waitlistemail.equals("")) {
				Reporter.log("Step 18 - Enter the waitlist email as ["+waitlistemail+"]");
				selectByValueWebdriver(attributeName_xpath, AEE_WaitlistEmail, waitlistemail);
			}
			if (!recurrencetype.equals("")) {
				Reporter.log("Step 19 - Enter the Recurrent type as ["+recurrencetype+"]");
				selectByValueWebdriver(attributeName_xpath, AEE_RecurrenceType, recurrencetype);
			}
			if (!registerdeclineemail.equals("")) {
				Reporter.log("Step 20 - Enter the Registerm Decline Email as ["+registerdeclineemail+"]");
				selectByValueWebdriver(attributeName_xpath, AEE_RegDeclineEmail, registerdeclineemail);
			}
			if (!group.equals("")) {
				Reporter.log("Step 21 - Enter the Group as ["+group+"]");
				selectByValueWebdriver(attributeName_xpath, AEE_Group, group);
			}
			if (!editeventurlcontains.equals("")) {
				Reporter.log("Step 22 - Enter the Group as ["+editeventurlcontains+"]");
//				selectByValueWebdriver(attributeName_xpath, attributevalue, editeventurlcontains);
			}

			if (!button.equals("")) {
				Reporter.log("Step 23 - Click on Button ");
				if (button.equalsIgnoreCase("Save")) {
					clickWebdriver(attributeName_xpath, AEE_Save);
					waitForPageToLoad();
				}else if (button.equalsIgnoreCase("publish to prod")) {
					clickWebdriver(attributeName_xpath, AEE_PubToProd);
				}else if (button.equalsIgnoreCase("Close Window")) {
					clickWebdriver(attributeName_xpath, AEE_CloseWindow);
					selectMainWindowWebdriver();
				}
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}
}

