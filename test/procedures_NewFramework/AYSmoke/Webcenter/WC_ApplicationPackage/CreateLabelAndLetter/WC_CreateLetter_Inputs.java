package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.CreateLabelAndLetter;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_CreateLetter_Inputs extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'Create Letter' page")
	public void WC_CreateLetter_Inputs(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Create Letter' Page");
			String[] testdata = datacontainer;
			String useemailtemplate = testdata[0];
			String selectemailtemplate = testdata[1];
			String donotcreateletter = testdata[2];
			String usedecisionletter = testdata[3];
			String selectadecisionletter = testdata[4];
			String onlineoffline = testdata[5];
			String printthedecisionletter = testdata[6];
			String useofflineversion = testdata[7];
			String recordactionhistory = testdata[8];
			String recordactionhistorytext = testdata[9];
			String button = testdata[10];
			Reporter.log("Input Test Data was retrieved for 'Create Letter' Page");
			if (!useemailtemplate.equals("")) {
				Reporter.log("Step 1 - Click Use Email Template as ["+useemailtemplate+"]");
				waitForElementPresentWebdriver(attributeName_xpath, "//font[contains(text(),'"+useemailtemplate+"')]/preceding-sibling::input[@type='radio']", useemailtemplate);
				clickWebdriver(attributeName_xpath, "//font[contains(text(),'"+useemailtemplate+"')]/preceding-sibling::input[@type='radio']");
			}
			if (!selectemailtemplate.equals("")) {
				Reporter.log("Step 2 - Select the Email Template as ["+selectemailtemplate+"]");
//				selectByVisibleTextWithSpaceWebdriver(attributeName_name, "TemplateList", selectemailtemplate);
				select("TemplateList", "regexp:"+selectemailtemplate);
			}
			if (!donotcreateletter.equals("")) {
				Reporter.log("Step 3 - Select Do Not create letter as ["+donotcreateletter+"]");
				if (donotcreateletter.contains("Check")) {
					checkWebdriver(attributeName_name, "ExcludeEmailed");
				}else if (donotcreateletter.contains("Uncheck")) {
					uncheckWebdriver(attributeName_name, "ExcludeEmailed");
				}
			}
			if (!usedecisionletter.equals("")) {
				Reporter.log("Step 4 - Select the Used Decision letter as ["+usedecisionletter+"]");
				waitForElementPresentWebdriver(attributeName_xpath, "//font[contains(text(),'"+usedecisionletter+"')]/preceding-sibling::input[@type='radio']", usedecisionletter);
				clickWebdriver(attributeName_xpath, "//font[contains(text(),'"+usedecisionletter+"')]/preceding-sibling::input[@type='radio']");
			}
			if (!selectadecisionletter.equals("")) {
				Reporter.log("Step 5 - Enter the Action History text as ["+selectadecisionletter+"]");
//				selectByVisibleTextWithSpaceWebdriver(attributeName_name, "DecisionLetter", selectadecisionletter);
				select("name=DecisionLetter", "regexp:"+selectadecisionletter);
			}
			if (!onlineoffline.equals("")) {
				Reporter.log("Step 6 - Select the Add to label as ["+onlineoffline+"]");
				clickWebdriver(attributeName_xpath, "//input[@value='"+onlineoffline+"']");
			}
			if (!printthedecisionletter.equals("")) {
				Reporter.log("Step 7 - Select the print decision letter as ["+printthedecisionletter+"]");
				if (printthedecisionletter.contains("Check")) {
					checkWebdriver(attributeName_name, "UseAssignedDecLtr");
				}else if (printthedecisionletter.contains("Uncheck")) {
					checkWebdriver(attributeName_name, "UseAssignedDecLtr");
				}
			}
			if (!useofflineversion.equals("")) {
				Reporter.log("Step 8 - Select the use offline version as ["+useofflineversion+"]");
				if (useofflineversion.contains("Check")) {
					checkWebdriver(attributeName_name, "UseAssignedOffline");
				}else if (useofflineversion.contains("Uncheck")) {
					checkWebdriver(attributeName_name, "UseAssignedOffline");
				}
			} 
			if (!recordactionhistory.equals("")) {
				Reporter.log("Step 9 - Select the Record action history as ["+recordactionhistory+"]");
				if (recordactionhistory.contains("Check")) {
					checkWebdriver(attributeName_name, "RecordAction");
				}else if (recordactionhistory.contains("Uncheck")) {
					checkWebdriver(attributeName_name, "RecordAction");
				}
			}
			if (!recordactionhistorytext.equals("")) {
				Reporter.log("Step 10 - Enter the Record action history as ["+recordactionhistory+"]");
				sendKeys(attributeName_name, "ActionLabel", recordactionhistorytext);
			}
			if (!button.equals("")) {
				Reporter.log("Step 11 - Click the Button as ["+button+"]");
				if (button.equalsIgnoreCase("Create")) {
					clickWebdriver(attributeName_xpath, CL_CreateBtn);
					waitForPageToLoadWebdriver();
				} else if (button.equalsIgnoreCase("Back")) {
					clickWebdriver(attributeName_xpath, ASR_BackBtn);
					waitForPageToLoadWebdriver();
				} else if (button.equalsIgnoreCase("View")) {
					clickWebdriver(attributeName_xpath, CL_ViewBtn);
					waitForPageToLoadWebdriver();
				}
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}

