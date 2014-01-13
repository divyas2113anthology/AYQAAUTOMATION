package procedures_NewFramework.AYSmoke.Connect;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class CRM_CommunicationLog_Verify extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some Verification in 'Communication Log' page")
		public void CRM_CommunicationLog_Verify() throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Verify Test Data 'Communication Log' page");
			String[]  fpvdatarepo = datacontainer;
			String name = fpvdatarepo[0];
			String log = fpvdatarepo[1];
			String type = fpvdatarepo[2];
			String subtype = fpvdatarepo[3];
			String description = fpvdatarepo[4];
			String commplan = fpvdatarepo[5];
			String dateandtime = fpvdatarepo[6];
			String who = fpvdatarepo[7];
			Reporter.log("Verify Test Data was retrieved for 'Communication Log' page");
			if (!name.equals("")) {
				Reporter.log("Step 1 - Verify Comm log name as ("+name+")");
				verifyAllUserTableCellValuePresentInColumn(name, "Name");
			}
			if (!log.equals("")) {
				Reporter.log("Step 2 - Verify Comm log as ("+log+")");
				verifyAllUserTableCellValuePresentInColumn(name, "Log");
			}
			if (!type.equals("")) {
				Reporter.log("Step 3 - Verify Comm log type as ("+type+")");
				verifyAllUserTableCellValuePresentInColumn(type, "Type");
			}
			if (!subtype.equals("")) {
				Reporter.log("Step 4 - Verify Comm log sub type as ("+subtype+")");
				verifyAllUserTableCellValuePresentInColumn(subtype, "Sub-Type");
			}
			if (!description.equals("")) {
				Reporter.log("Step 5 - Verify Comm log description as ("+description+")");
				verifyAllUserTableCellValuePresentInColumn(description, "Description");
			}
			if (!commplan.equals("")) {
				Reporter.log("Step 6 - Verify Comm log Comm plan as ("+commplan+")");
				verifyAllUserTableCellValuePresentInColumn(commplan, "Comm Plan");
			}
			if (!dateandtime.equals("")) {
				Reporter.log("Step 7 - Verify Comm log date and time as ("+dateandtime+")");
				verifyAllUserTableCellValuePresentInColumn(dateandtime, "Date and Time");
			}
			if (!who.equals("")) {
				Reporter.log("Step 8 - Verify Comm log who as ("+who+")");
				verifyAllUserTableCellValuePresentInColumn(who, "Who");
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

}

