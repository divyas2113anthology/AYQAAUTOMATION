package procedures_NewFramework.AYSmoke.WebExeAutomation;

import java.io.IOException;






import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class AYTestDataTransferWS_Export extends CommonSeleniumActions implements OR {
	
	@Test(description ="This Procedure is used to perform some operation in 'AYTestDataTransferWS_Export' ")
	public void AYTestDataTransferWS_Export() throws IOException{
		try{
		writeDetails();
		Reporter.log("Proceed to retrieve Input Test Data for 'AYTestDataTransferWS_Export' ");
		String[] testdata = datacontainer;
		String browserfilelocation = testdata[0];
		Reporter.log("Input Test Data was retrieved for 'AYTestDataTransferWS_Export'");
		if(!browserfilelocation.equals(""))
		{
			Reporter.log("Step 1 - Browse exe from location["+browserfilelocation+"]");
			
			Runtime.getRuntime().exec("C:/SeleniumScripts/AYQAAutomation/AutoIT/Filezilla/AYTestDataTransferExport.exe \""+browserfilelocation+"\"");
			
		}
		}
		catch(Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

}
