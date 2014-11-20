package procedures_NewFramework.AYSmoke.MaintenanceCenter;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class MC_VerifyImportedtoServer extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'FileZilla' page")
	public void MC_VerifyImportedtoServer(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'FileZilla' Page");
			String[] testdata = datacontainer;
			String browserfilelocation = testdata[0];
					
			Reporter.log("Input Test Data was retrieved for 'FileZilla' Page");
//			writeFailure("Given Test Data["+yesno+"] either Incorrect or has not be Scripted ");
			if (!browserfilelocation.equals("")) {
				Reporter.log("Step 1 - Browse exe from location["+browserfilelocation+"]");
				Runtime.getRuntime().exec("C:/SeleniumScripts/AYQAAutomation/AutoIT/Filezilla/VerifyImportedtoServer.exe \""+browserfilelocation+"\"");

				
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}