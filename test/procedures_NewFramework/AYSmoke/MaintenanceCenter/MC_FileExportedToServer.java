package procedures_NewFramework.AYSmoke.MaintenanceCenter;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class MC_FileExportedToServer extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'FileZilla' page")
	public void MC_FileExportedToServer(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'FileZilla' Page");
			System.out.println("aaa");
			String[] testdata = datacontainer;
			String browserfilelocation = testdata[0];
			Reporter.log("Input Test Data was retrieved for 'FileZilla' Page");
//			writeFailure("Given Test Data["+yesno+"] either Incorrect or has not be Scripted ");
			if (!browserfilelocation.equals("")) {
				System.out.println("bbb");
				Reporter.log("Step 1 - Browse exe from location["+browserfilelocation+"]");
				Runtime.getRuntime().exec("C:/SeleniumScripts/AYQAAutomation/AutoIT/Filezilla/VerifyExportedtoServer.exe \""+browserfilelocation+"\"");
				
			}
} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}