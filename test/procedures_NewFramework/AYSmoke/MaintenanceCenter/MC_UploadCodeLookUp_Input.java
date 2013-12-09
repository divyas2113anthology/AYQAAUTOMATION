package procedures_NewFramework.AYSmoke.MaintenanceCenter;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class MC_UploadCodeLookUp_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'Upload Code LookUp' page")
	public void MC_UploadCodeLookUp_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Upload Code LookUp' Page");
			String[] testdata = datacontainer;
			String codelookuptype = testdata[0];
			String browserfilelocation = testdata[1];
			String includenumbersandletters = testdata[2];
			String includeleadingzeros = testdata[3];
			String totalnumberofcharacters = testdata[4];
			String officialceebvalidation = testdata[5];
			String buttons = testdata[6];			
			Reporter.log("Input Test Data was retrieved for 'Upload Code LookUp' Page");
			if (!codelookuptype.equals("")) {
				Reporter.log("Step 1 - Select the Code lookup type as ["+codelookuptype+"]");
				selectByVisibleTextWebdriver(attributeName_name, "codeLkupType", codelookuptype);
			}
			if (!browserfilelocation.equals("")) {
				Reporter.log("Step 2 - Browser a Document From location["+browserfilelocation+"]");
				waitForElementPresentWebdriver(attributeName_name, "filename", "Upload Browser");
				sendKeysType(attributeName_name, "filename", browserfilelocation);
			}
			if (!includenumbersandletters.equals("")) {
				Reporter.log("Step 3 - Select the include number sand letters["+includenumbersandletters+"]");
			}
			if (!includeleadingzeros.equals("")) {
				Reporter.log("Step 4 - Select the include leading zeros["+includeleadingzeros+"]");
			}
			if (!totalnumberofcharacters.equals("")) {
				Reporter.log("Step 5 - Select the total number of characters["+totalnumberofcharacters+"]");
			}
			if (!officialceebvalidation.equals("")) {
				Reporter.log("Step 6 - Select official ceeb validation["+officialceebvalidation+"]");
			}
			if (!buttons.equals("")) {
				Reporter.log("Step 7 - Click on the ["+buttons+"] Button");
				if (buttons.equalsIgnoreCase("Upload")) {
					waitForElementPresentWebdriver(attributeName_name, "Upload", buttons);
					clickWebdriver(attributeName_name, "Upload");				
					waitForPageToLoadWebdriver();
				}else if (buttons.equalsIgnoreCase("Validate Upload")) {
					waitForElementPresentWebdriver(attributeName_partiallinktext, buttons, buttons);
					clickWebdriver(attributeName_partiallinktext, buttons);				
					waitForPageToLoadWebdriver();
				}
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}

