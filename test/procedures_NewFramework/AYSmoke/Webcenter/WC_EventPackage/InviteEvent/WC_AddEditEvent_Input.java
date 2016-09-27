package procedures_NewFramework.AYSmoke.Webcenter.WC_EventPackage.InviteEvent;

import static procedures_NewFramework.AYSmoke.General.GL_LaunchBrowser.environment;

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
			String rsvpdate = testdata[16];
			String closeeventtext = testdata[17];
			String waitlistemail = testdata[18];
			String recurrencetype = testdata[19];
			String registerdeclineemail = testdata[20];
			String group = testdata[21];
			String editeventurlcontains = testdata[22];
			String button = testdata[23];
			Date date = new Date();  
			Reporter.log("Input Test Data was retrieved for 'Webcenter Add/Edit Event' Page");
			if (!classification.equals("")) {
				Reporter.log("Step 1 - Select the Classification as ["+classification+"]");
				clickWebdriver(attributeName_xpath, AEE_Classfication+classification+"']");
//				if (classification.equalsIgnoreCase("Event")) {
//					checkWebdriverCheckbox(attributeName_xpath, AEE_ClasEvent);
//				}else if (classification.equalsIgnoreCase("Interview")) {
//					checkWebdriverCheckbox(attributeName_xpath, AEE_ClasInterview);
//				}	
			}
			if (!internalname.equals("")) {
				Reporter.log("Step 2 - Enter the Internal Name as ["+internalname+"]");
				sendKeys(attributeName_xpath, AEE_IntName, internalname);
			}
			DateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
			String eventTitle = title+dateFormat.format(date)+Calendar.getInstance().getTimeInMillis();				
			if (!title.equals("")) {
				Reporter.log("Step 3 - Enter 'Event Title' as ("+eventTitle+")");
//				type(CA_FirstName, eventTitle);	
				sendKeys(attributeName_name, "txtTitle", eventTitle);
				if (!titlelabel.equals("")) {
					Reporter.log("Proceed to Write Event Title as ("+titlelabel+") in the Excel Sheet(C:/Seleniumscripts/lib/InputTestdata.xls)");
					Runtimedatawrite(eventTitle, titlelabel);
				}
			}
			if (!description.equals("")) {
				Reporter.log("Step 4 - Enter the Description as ["+description+"]");
				sendKeys(attributeName_xpath, AEE_Description, description);
			}
			if (!eventype.equals("")) {
				Reporter.log("Step 5 - Select the event type as ["+eventype+"]");
				selectByVisibleTextWebdriver(attributeName_xpath, AEE_EventType, eventype);
			}
			if (!category.equals("")) {
				Reporter.log("Step 6 - Select the category as ["+category+"]");
				selectByVisibleTextWebdriver(attributeName_xpath, AEE_Category, category);
			}
			if (!where.equals("")) {
				Reporter.log("Step 7 - Select the where as ["+where+"]");
				selectByVisibleTextWebdriver(attributeName_xpath, AEE_Where, where);
			}
			if (!location.equals("")) {
				Reporter.log("Step 8 - Enter the location as ["+location+"]");
				sendKeys(attributeName_xpath, AEE_Location, location);
			}
			if (!startdate.equals("")) {
				Reporter.log("Step 9 - Enter the start date as ["+startdate+"]");
				environment = Runtimedataread("Instance");
				if (environment.equalsIgnoreCase("UKQA") || environment.equalsIgnoreCase("UKPR")) {
					String Startdate = requiredDateAndFormat("dd/MM/yyyy", startdate);
					sendKeys(attributeName_xpath, AEE_StartDate, Startdate);
				}else{
				String Startdate = requiredDateAndFormat("MM/dd/yyyy", startdate);
				sendKeys(attributeName_xpath, AEE_StartDate, Startdate);
				}
			}
			if (!startdatehour.equals("")) {
				Reporter.log("Step 10 - Enter the end date hour as ["+startdatehour+"]");
				selectByVisibleTextWebdriver(attributeName_xpath, AEE_StartHour, startdatehour);
			}
			if (!startdateminute.equals("")) {
				Reporter.log("Step 11 - Enter the end date minute as ["+startdateminute+"]");
				selectByVisibleTextWebdriver(attributeName_xpath, AEE_StartMinute, startdateminute);
			}
			if (!enddate.equals("")) {
				Reporter.log("Step 12 - Enter the end date as ["+enddate+"]");
				environment = Runtimedataread("Instance");
				if (environment.equalsIgnoreCase("UKQA") || environment.equalsIgnoreCase("UKPR")) {
					String Enddate = requiredDateAndFormat("dd/MM/yyyy", enddate);
					sendKeys(attributeName_xpath, AEE_EndDate, Enddate);
				}else{
				String Enddate = requiredDateAndFormat("MM/dd/yyyy", enddate);
				sendKeys(attributeName_xpath, AEE_EndDate, Enddate);
				}
			}
			if (!enddatehour.equals("")) {
				Reporter.log("Step 13 - Enter the end date hour as ["+enddatehour+"]");
				selectByVisibleTextWebdriver(attributeName_xpath, AEE_EndHour, enddatehour);
			}
			if (!enddateminute.equals("")) {
				Reporter.log("Step 14 - Enter the end date minute as ["+enddateminute+"]");
				selectByVisibleTextWebdriver(attributeName_xpath, AEE_EndMinute, enddateminute);
			}
			if (!startacceptdate.equals("")) {
				Reporter.log("Step 15 - Enter the start accept date as ["+startacceptdate+"]");
				environment = Runtimedataread("Instance");
				if (environment.equalsIgnoreCase("UKQA") || environment.equalsIgnoreCase("UKPR")) {
					String Startacceptdate = requiredDateAndFormat("dd/MM/yyyy", startacceptdate);
					sendKeys(attributeName_xpath, AEE_StartAccDate, Startacceptdate);
				}else{
				String Startacceptdate = requiredDateAndFormat("MM/dd/yyyy", startacceptdate);
				sendKeys(attributeName_xpath, AEE_StartAccDate, Startacceptdate);
				}
			}
			if (!rsvpdate.equals("")) {
				Reporter.log("Step 16 - Enter the RSVP date as ["+rsvpdate+"]");
				environment = Runtimedataread("Instance");
				if (environment.equalsIgnoreCase("UKQA") || environment.equalsIgnoreCase("UKPR")) {
					String Rsvpdate = requiredDateAndFormat("dd/MM/yyyy", rsvpdate);
					sendKeys(attributeName_xpath, AEE_RSVPDate, Rsvpdate);
				}else{
				String Rsvpdate = requiredDateAndFormat("MM/dd/yyyy", rsvpdate);
				sendKeys(attributeName_xpath, AEE_RSVPDate, Rsvpdate);
				}
			}
			if (!closeeventtext.equals("")) {
				Reporter.log("Step 17 - Enter the close event text as ["+closeeventtext+"]");
				sendKeys(attributeName_xpath, AEE_CloseEventText, closeeventtext);
			}
			if (!waitlistemail.equals("")) {
				Reporter.log("Step 18 - Enter the waitlist email as ["+waitlistemail+"]");
				selectByVisibleTextWithSpaceWebdriver(attributeName_name,AEE_WaitlistEmail, "regexp:"+waitlistemail);
			}
			if (!recurrencetype.equals("")) {
				Reporter.log("Step 19 - Enter the Recurrent type as ["+recurrencetype+"]");
				selectByVisibleTextWebdriver(attributeName_xpath, AEE_RecurrenceType, recurrencetype);
			}
			if (!registerdeclineemail.equals("")) {
				Reporter.log("Step 20 - Enter the Registerm Decline Email as ["+registerdeclineemail+"]");
				selectByVisibleTextWithSpaceWebdriver(attributeName_name,AEE_RegDeclineEmail, "regexp:"+registerdeclineemail);
			}
			if (!group.equals("")) {
				Reporter.log("Step 21 - Enter the Group as ["+group+"]");
				selectByVisibleTextWithSpaceWebdriver(attributeName_name,AEE_Group, "regexp:"+group);
			}
			if (!editeventurlcontains.equals("")) {
				Reporter.log("Step 22 - Enter the Group as ["+editeventurlcontains+"]");
//				selectByValueWebdriver(attributeName_xpath, attributevalue, editeventurlcontains);
			}

			if (!button.equals("")) {
				Reporter.log("Step 23 - Click on Button ");
				if (button.equalsIgnoreCase("Save")) {
					clickWebdriver(attributeName_xpath, AEE_Save);
					waitForPageToLoadWebdriver();
				}else if (button.equalsIgnoreCase("publish to prod")) {
					waitForElementPresentWebdriverWait(attributeName_xpath, AEE_PubToProd, button);
					clickWebdriver(attributeName_xpath, AEE_PubToProd);
					waitForPageToLoadWebdriver();
				}else if (button.equalsIgnoreCase("Close Window")) {
					waitForElementPresentWebdriver(attributeName_xpath, AEE_CloseWindow, button);
//					clickWebdriver(attributeName_xpath, AEE_CloseWindow);
					selectMainWindowWebdriver();
				}
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}
}

