package procedures_NewFramework.AYSmoke.Webcenter;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_Welcome_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Welcome' page")
		public void WC_Welcome_Verify() throws Exception{
		try {
			writeDetails();
//			headerStatement("PersonalData_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data 'Welcome' page");
			String[]  fpvdatarepo = datacontainer;
			String pagename = fpvdatarepo[0];
			String message = fpvdatarepo[1];
			Reporter.log("Verify Test Data was retrieved for 'Welcome' page");
			if (!pagename.equals("")) {
				Reporter.log("Step 1 - Verify its navigate to ("+pagename+") page");
				if (pagename.contains("Product Suggestions")) {
					waitForElementPresentWebdriver(attributeName_xpath, "//div[@id='masthead']/div[@class='logo']", pagename);
					verifyPageTitleWebdriver(attributeName_xpath, "//div[@id='masthead']/div[@class='logo']", "title", pagename);
//					waitForText(pagename, "Product Suggestion Not Present");
//					verifyTextPresent(pagename);
				}else if (pagename.equalsIgnoreCase("Hobsons")) {
					waitForElementPresentWebdriver(attributeName_xpath, PS_HobsonsLogo, pagename);
					verifyElementPresentWebdriver(attributeName_xpath, PS_HobsonsLogo, pagename);
				}else{
					waitForText(pagename, "Page Name");
					verifyTextPresent(pagename);
				}
			}
			if (!message.equals("")) {
				Reporter.log("Step 1 - Verify message as ("+message+") page");
				/*waitForElementPresentWebdriver(attributeName_xpath, PS_HobsonsAuthMessage, pagename);
				verifyElementPresentWebdriver(attributeName_xpath, PS_HobsonsAuthMessage, pagename);*/
				if(message.equals("Welcome!")){
					waitForElementPresentWebdriverWait(attributeName_xpath, WC_ErrorMsg+message+"')]", message);
					verifyElementPresentWebdriver(attributeName_xpath, WC_ErrorMsg+message+"')]", message);
				}
				else{
				waitForElementPresentWebdriverWait(attributeName_xpath, WC_ManageInfo+message+"')]", message);
				verifyElementPresentWebdriver(attributeName_xpath, WC_ManageInfo+message+"')]", message);
				}
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}


