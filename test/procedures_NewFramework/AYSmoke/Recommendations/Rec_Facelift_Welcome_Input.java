package procedures_NewFramework.AYSmoke.Recommendations;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class Rec_Facelift_Welcome_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some operation in Recommendation Facelift page")
	public void Rec_Facelift_Welcome_Input() throws Exception{
		try {
		
		writeDetails();
		String[]  testdata = datacontainer;
		String logoutoverview = testdata[0];
		String sectioninfo = testdata[1];
		
		if (!logoutoverview.equals("")) {
			Reporter.log("Step 1 - Click the link as ["+logoutoverview+"]");
			clickWebdriver(attributeName_partiallinktext, logoutoverview);
			waitForPageToLoadWebdriver();
		}
		if (!sectioninfo.equals("")) {
			Reporter.log("Step 2 - Click on the link ["+sectioninfo+"]");
			writeConsole("I am here");
			clickWebdriver(attributeName_partiallinktext, sectioninfo);
			waitForPageToLoadWebdriver();
		}
		
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}
}
