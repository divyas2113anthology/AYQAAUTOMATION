package procedures_NewFramework.AYSmoke.WebExeAutomation;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class AYTestDataTransferWS_Import extends CommonSeleniumActions implements OR {

	@Test(description ="This Procedure is used to perform some operation in 'AYTestDataTransferWS_Import' ")
	public void AYTestDataTransferWS_Import() throws IOException{
		try{
		writeDetails();
		Reporter.log("Proceed to retrieve Input Test Data for 'AYTestDataTransferWS_Import' ");
		String[] testdata = datacontainer;
		String browserfilelocation = testdata[0];
		Reporter.log("Input Test Data was retrieved for 'AYTestDataTransferWS_Import'");
		if(!browserfilelocation.equals(""))
		{
			Reporter.log("Step 1 - Browse exe from location["+browserfilelocation+"]");
			
			Runtime.getRuntime().exec("C:/SeleniumScripts/AYQAAutomation/AutoIT/Filezilla/AYTestDataTransferImport.exe \""+browserfilelocation+"\"");
			
		}
		}
		catch(Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
}
