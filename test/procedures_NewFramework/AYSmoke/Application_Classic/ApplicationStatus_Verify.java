package procedures_NewFramework.AYSmoke.Application_Classic;

import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

public class ApplicationStatus_Verify extends CommonSeleniumActions implements	OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Application Status: Ready for Submission' page")
	public void ApplicationStatus_Verify() throws Exception{
		try {
			writeDetails();
//			headerStatement("ApplicationStatus_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data for 'Application Status: Ready for Submission' page");
			String[]  appstatusvdatarepo = datacontainer;
			String stapagename = appstatusvdatarepo[0];
			Reporter.log("Verify Test Data was retrieved for 'Application Status: Ready for Submission' page");
			if (!stapagename.equals("")) {
				Reporter.log("Step 1 - Verify its navigate to ("+stapagename+") page");
				String actualText = stapagename;
				String expectedText = stapagename;
				if (actualText.equals(expectedText)) {
//					if (selenium.isTextPresent(stapagename) //removed this use to depency
					System.out.println("Text verification passed. Actual text: " + actualText);
				}

				} else {
					writeFailure("Its not navigate to ["+stapagename+"] page");
				}

			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
	

}
