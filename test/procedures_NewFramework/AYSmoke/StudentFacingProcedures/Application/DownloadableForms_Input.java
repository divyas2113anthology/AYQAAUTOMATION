package procedures_NewFramework.AYSmoke.StudentFacingProcedures.Application;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class DownloadableForms_Input extends CommonSeleniumActions implements OR {


	@Test(description="This Procedure is to perform some Operation in 'Downloadable Forms' page")
	public void DownloadableForms_Input() throws Exception{
		try {
		writeDetails();		
//		headerStatement("AddressLookup_Input");
//		startExecutionOrder(j);
//		writeParametersTable();
		Reporter.log("Proceed to retrieve Input Test Data for 'Downloadable Forms' page");
		String[]  downloadabledatarepo = datacontainer;
		String formname = downloadabledatarepo[0];
		Reporter.log("Input Test Data was retrieved for 'Downloadable Forms' page");
		if (!formname.equals("")) {
			Reporter.log("Step 1 - Downloadable Form name as ("+formname+")");
			Runtime.getRuntime().exec("T:\\WebProducts\\QA\\SeleniumScripts\\AY\\AutoIT\\Firefox\\Application\\DownloadForm.exe");
			click(DF_FormName+formname+"')]");

		}
		
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

}

