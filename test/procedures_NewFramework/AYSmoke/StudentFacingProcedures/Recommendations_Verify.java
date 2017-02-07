package procedures_NewFramework.AYSmoke.StudentFacingProcedures;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class Recommendations_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Recommendations' page")
		public void Recommendations_Verify() throws Exception{
		try {
			writeDetails();
//			headerStatement("PersonalData_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			System.out.println("sdfsdffsd");
			Reporter.log("Proceed to retrieve Verify Test Data 'Recommendations' page");
			String[]  fpvdatarepo = datacontainer;
			String pagename = fpvdatarepo[0];
			String verifyui = fpvdatarepo[1];
			Reporter.log("Verify Test Data was retrieved for 'Recommendations' page");
			  
			if (!pagename.equals("")) {
				Reporter.log("Step 1 - Verify its navigate to ("+pagename+") page");
				System.out.println("aaaaaaa");
				verifyElementPresentWebdriver(attributeName_xpath, RC_RecProviderlist, pagename);
							
			}
			if (!verifyui.equals("")) {
				Reporter.log("Step 4 - Verify Message("+verifyui+") was displayed correctly");
				
				
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}
