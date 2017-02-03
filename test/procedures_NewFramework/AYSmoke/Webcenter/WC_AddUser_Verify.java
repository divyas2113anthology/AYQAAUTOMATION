package procedures_NewFramework.AYSmoke.Webcenter;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_AddUser_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Add Users' page")
		public void WC_AddUser_Verify() throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Verify Test Data 'Add Users' page");
			String[]  fpvdatarepo = datacontainer;
			String message = fpvdatarepo[0];
			String pagename = fpvdatarepo[1];
			String verifyui = fpvdatarepo[2];
			Reporter.log("Verify Test Data was retrieved for 'Add Users' page");
			if (!message.equals("")) {
				Reporter.log("Step 1 - Verify Message("+message+") was displayed correctly");
				waitForElementPresentWebdriver(attributeName_xpath, QAE_Message, "Display Added User Message");
//				verifyElementPresentWebdriver(attributeName_xpath, QAE_Message, "Display Added User Message");
				//String Text=selenium.getText(QAE_Message);
				String Text = driver.findElement(By.xpath(QAE_Message)).getText();
				writeConsole(Text);
//				String[] part = Text.split("(?<=\\D)(?=\\d)");
//				System.out.println(part[0]);
//				String QA_Message= part[0];
				writeConsole("Malik");
				//writeConsole(QA_Message);
				//verifyElementTextWebdriver(attributeName_xpath,QA_Message, message,message);
				verifyElementContainsTextWebdriver(attributeName_xpath,QAE_Message, message,message);
				//verifyElementTextWebdriver(attributeName_xpath,QA_Message, message+" was successfully Added", message);
			}
			if (!pagename.equals("")) {
				Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
				waitForElementPresentWebdriver(attributeName_xpath, BP_PageName, pagename);
				verifyElementContainsTextWebdriver(attributeName_xpath, BP_PageName, pagename, "Page Name for Manage Users");
			}
			if (!verifyui.equals("")) {
//				Reporter.log("Step 1 - Verify UI was displayed correctly");
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}

