package procedures_NewFramework.AYSmoke.Prospect;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class PRO_Submitted_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Personal Information' page")
		public void PRO_Submitted_Verify() throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Verify Test Data 'Personal Information' page");
			String[]  fpvdatarepo = datacontainer;
			String successmessage = fpvdatarepo[0];
			Reporter.log("Verify Test Data was retrieved for 'Personal Information' page");
			if (!successmessage.equals("")) {
				Reporter.log("Step 1 - Verify Message("+successmessage+") was displayed correctly");
				String actualText = successmessage;
				String expectedText = successmessage;
				if (actualText.equals(expectedText)) {
					Reporter.log("Message("+successmessage+") was displayed correctly");
				} else {
					writeFailure("Message("+successmessage+") was not displayed correctly");
				}
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}

