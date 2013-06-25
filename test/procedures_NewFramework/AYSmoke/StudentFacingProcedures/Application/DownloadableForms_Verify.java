package procedures_NewFramework.AYSmoke.StudentFacingProcedures.Application;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class DownloadableForms_Verify extends CommonSeleniumActions implements	OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Downloaded Form'")
	public void DownloadableForms_Verify() throws Exception{
		try {
			writeDetails();
//			headerStatement("ApplicationStatus_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data for 'Downloaded Form' page");
			String[]  appstatusvdatarepo = datacontainer;
			String downloadableformcontains = appstatusvdatarepo[0];
			String filepath = appstatusvdatarepo[1];
			Reporter.log("Verify Test Data was retrieved for 'Downloaded Form' page");
			if (!downloadableformcontains.equals("")) {
//				Reporter.log("Step 1 - Verify downloaded file contains ("+downloadableformcontains+") in the location of ("+filepath+")");
//				VerifyDownloadedtxtFileExist(filepath);
			}
			if (!filepath.equals("")) {
				Reporter.log("Step 2 - Verify downloaded file contains ("+downloadableformcontains+") in the location of ("+filepath+")");
				waitForFile(filepath); // this will hold the script to complete the File Download
				verifyFile(filepath);
//				VerifyDownloadedtxtFileExist(filepath);
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
	

}

