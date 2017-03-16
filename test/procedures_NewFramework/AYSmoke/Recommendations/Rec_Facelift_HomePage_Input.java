package procedures_NewFramework.AYSmoke.Recommendations;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class Rec_Facelift_HomePage_Input extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some operation in 'Recommendation Home' page")
		public void Rec_Facelift_HomePage_Input() throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve operation in 'Recommendation Home' page");
			String[]  testdata = datacontainer;
			String tech_Profile_Logout = testdata[0];
			String start_Rec = testdata[1];
			
			if (!tech_Profile_Logout.equals("")) {
				Reporter.log("Step 1 - Click the link as ["+tech_Profile_Logout+"]");
				clickWebdriver(attributeName_partiallinktext, tech_Profile_Logout);
				waitForPageToLoadWebdriver();
			}
			if(start_Rec.equals("next")) {
				Reporter.log("Step 2 - Click on the button [" + start_Rec + "]");

				waitForElementPresentWebdriver(attributeName_xpath, RF_BtnNext + start_Rec + "']", start_Rec);
				clickWebdriver(attributeName_xpath, RF_BtnNext + start_Rec + "']");
				waitForPageToLoadWebdriver();
				}
			else{
					Reporter.log("Step 2 - Click on the link [" + start_Rec + "]");
					clickWebdriver(attributeName_xpath, RF_Start_Rec);
					waitForPageToLoadWebdriver();
					try {
						alertAccept();
					} catch (Exception e) {
						System.out.println("No Alert");
					}
				}
		}catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}
}
