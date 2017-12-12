package procedures_NewFramework.AYSmoke.Application_Classic;

import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

public class EventSearchAll_Verify extends CommonSeleniumActions implements	OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Search All Event' Page")
	public void EventSearchAll_Verify() throws Exception{
		try {
			writeDetails();
//			headerStatement("ApplicationStatus_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data for 'Search All Event' page");
			String[]  appstatusvdatarepo = datacontainer;
			String message = appstatusvdatarepo[0];
			String pagename = appstatusvdatarepo[1];
			Reporter.log("Verify Test Data was Present in the  'Search All Event' page");
			if (!message.equals("")) {
				Reporter.log("Step 1 - Verify Message present ("+message+") in the 'Search All Event' page");
				if (message.equalsIgnoreCase("There are no events to display.")) {
					verifyElementContainsTextWebdriver(attributeName_xpath, ESA_NoEventsMessage, message, "No Search Result Present Message");
				}else if (message.equalsIgnoreCase("The following events meet the criteria of your search")) {
					verifyElementContainsTextWebdriver(attributeName_xpath, ESA_Message, message, "Search Result Message");
				}
			}
			if (!pagename.equals("")) {
				
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
	

}


