package procedures_NewFramework.AYSmoke.StudentFacingProcedures.Application;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class EventSearchAll_Input extends CommonSeleniumActions implements	OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Search All Event' page")
	public void EventSearchAll_Input() throws Exception{
		try {
			writeDetails();
//			headerStatement("ApplicationStatus_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("This Procedure is to perform some Operation in 'Search All Event' page");
			String[]  appstatusvdatarepo = datacontainer;
			String locationoftheevent = appstatusvdatarepo[0];
			String fromdate = appstatusvdatarepo[1];
			String todate = appstatusvdatarepo[2];
			String eventtype = appstatusvdatarepo[3];
			String eventstatus = appstatusvdatarepo[4];
			String search = appstatusvdatarepo[5];
			Reporter.log("Input Test Data was retrieved for 'Search All Event' page");
			if (!locationoftheevent.equals("")) {
				Reporter.log("Step 1 - Select the location of the event ("+locationoftheevent+") ");
				selectByVisibleTextWebdriver(attributeName_xpath, ESA_LocationOfEvent, locationoftheevent);
			}
			if (!fromdate.equals("")) {
				Reporter.log("Step 2 - Enter the from date ("+fromdate+") 'Search All Event' page");
				sendKeys(attributeName_xpath,ESA_FromDate, fromdate);
			}
			if (!todate.equals("")) {
				Reporter.log("Step 3 - Enter the to date ("+todate+")'Search All Event' page");
				sendKeys(attributeName_xpath,ESA_ToDate, fromdate);
			}
			if (!eventtype.equals("")) {
				Reporter.log("Step 4 - Select the event type ("+eventtype+")'Search All Event' page");
				selectByVisibleTextWebdriver(attributeName_xpath, ESA_EventType, locationoftheevent);
			}
			if (!eventstatus.equals("")) {
				Reporter.log("Step 5 - Click the event status ("+eventstatus+")'Search All Event' page");
				waitForElementPresentWebdriver(attributeName_xpath, ESA_PastAndFuture, eventstatus);
				if (eventstatus.equalsIgnoreCase("All events")) {
					clickWebdriver(attributeName_xpath, ESA_PastAndFuture);
				} else if (eventstatus.equalsIgnoreCase("All events in the future")) {
					clickWebdriver(attributeName_xpath, ESA_Future);
				} else if (eventstatus.equalsIgnoreCase("All events in the future with space available")) {
					clickWebdriver(attributeName_xpath, ESA_FutureWithSpace);
				}
			}
			if (!search.equals("")) {
				Reporter.log("Step 6 - Click the search button in the 'Search All Event' page");
				clickWebdriver(attributeName_xpath, ESA_SearchByEvent);
				waitForPageToLoadWebdriver();
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
	

}

