package procedures_NewFramework.AYSmoke.Prospect;

import java.util.Calendar;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class PRO_Submitted_Input extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Operation in 'Personal Information' page")	
	public void PRO_Submitted_Input() throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Personal Information' page");
			String[]  personalinfoidatarepo = datacontainer;
			String updateunsubscription = personalinfoidatarepo[0];
			Reporter.log("Input Test Data was retrieved for 'Personal Information' page");
			if (!updateunsubscription.equals("")) {
				Reporter.log("Input Test Data was retrieved for 'Personal Information' page");
				waitForElementPresentWebdriver(attributeName_partiallinktext, updateunsubscription, updateunsubscription);
				clickWebdriver(attributeName_partiallinktext, updateunsubscription);
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

}


