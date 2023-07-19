package procedures_NewFramework.AYSmoke.Recommendations;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class REC_PreviewSubmit_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some operation in 'Preview and Submit' page")
	public void REC_PreviewSubmit_Input() throws Exception{
		try {
		
		writeDetails();
		String[]  testdata = datacontainer;
		Reporter.log("Proceed to retrieve Input Test Data for 'Preview and Submit' page");
		String previewrecommendation = testdata[0];
		String gobacksubmit = testdata[1];
		Reporter.log("Input Test Data was retrieved for 'Preview and Submit' page");
		if (!previewrecommendation.equals("")) {
			Reporter.log("Step 1 -Click the Preview Recommendation button");
			waitForElementPresentWebdriver(attributeName_xpath, PAS_PrevRecPdf, previewrecommendation);
			clickWebdriver(attributeName_xpath, PAS_PrevRecPdf);
			recentPopupSelectWebdriver("Recommmomdation");
		}
		if (!gobacksubmit.equals("")) {
			Reporter.log("Step 2 -Click the button as '"+gobacksubmit+"'");
			if (gobacksubmit.equalsIgnoreCase("Go Back")) {
				clickWebdriver(attributeName_xpath, CI_BackBtn);
				waitForPageToLoadWebdriver();
			}else if (gobacksubmit.equalsIgnoreCase("Submit")) {
				clickWebdriver(attributeName_xpath,"//*[@id=\"rec-nav\"]/ul/li[6]/a");
				waitForPageToLoadWebdriver();

				clickWebdriver(attributeName_xpath, "(//a[contains(text(),'Submit')])[2]"); //xpth change by saran kumar jun 2023
			}
		}
		} catch (Exception e) {			
			writeFailure(e.getLocalizedMessage());
		}
	}

}
