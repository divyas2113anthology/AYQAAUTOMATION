package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.BusinessRules;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_EditBusinessRule_Input extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some input operation in 'Configure Business Rules' page")
		public void WC_EditBusinessRule_Input() throws Exception{
		try {
			writeDetails();
//			headerStatement("PersonalData_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data 'Configure Business Rules' page");
			String[]  fpvdatarepo = datacontainer;
			
			String rulename = fpvdatarepo[0];
			String ruledesc = fpvdatarepo[1];
			String folder = fpvdatarepo[2];
			String usertype = fpvdatarepo[3];
			String action = fpvdatarepo[4];
			String appliestosection = fpvdatarepo[5];
			String appliestoquestion = fpvdatarepo[6];
			String eventtype = fpvdatarepo[7];
			String targetform = fpvdatarepo[8];
			String targetsection = fpvdatarepo[9];
			String targetquestion = fpvdatarepo[10];
			String targetvalue = fpvdatarepo[11];
			String targetdocument = fpvdatarepo[12];
			String targetstatus = fpvdatarepo[13];
			String targettestscore = fpvdatarepo[14];
			String targetgroup = fpvdatarepo[15];
			String targeturl = fpvdatarepo[16];
			String targetemailtemplate = fpvdatarepo[17];
			String savecancel = fpvdatarepo[18];
			String verifygreystatus = fpvdatarepo[19];
			String verifystatus = fpvdatarepo[20];
			String filtername = fpvdatarepo[21];
			Reporter.log("Verify Test Data was retrieved for 'Configure Business Rules' page");
			if (!rulename.equals("")) {
				Reporter.log("Step 1 - Type Rule Name as ("+rulename+")");
				//type(rulename, value);
				sendKeys(attributeName_xpath, BR_Name, rulename);
				
			}
			if (!ruledesc.equals("")) {
				Reporter.log("Step 2 - Type Rule Description as ("+ruledesc+")");
				sendKeys(attributeName_xpath, BR_Desc, ruledesc);			
			}
			
			
			if (!folder.equals("")) {
				//Reporter.log("Step 2 - Verify UI having the Message("+verifyui+")");
				
			}
			if (!usertype.equals("")) {
				Reporter.log("Step 4 - Select User type as("+usertype+")");
					select(BR_UserType, usertype);
			}
			if (!action.equals("")) {
				Reporter.log("Step 5 - Select action as : ("+action+")");
				select(BR_Action, action);				
			}
			if (!appliestosection.equals("")) {
				Reporter.log("Step 6 - Select applies to section as : ("+appliestosection+")");
				select(BR_AppliesToSection, appliestosection);					
			}
			if (!appliestoquestion.equals("")) {
				Reporter.log("Step 7 - Select applies to question as : ("+appliestoquestion+")");
				select(BR_AppliesToQuestion, appliestoquestion);					
			}
			if (!eventtype.equals("")) {
				Reporter.log("Step 8- Select Event type as : ("+eventtype+")");
				select(BR_EventType, eventtype);					
			}
			if (!targetform.equals("")) {
				Reporter.log("Step 9 - Select Target form as : ("+targetform+")");
				select(BR_TargetForm, targetform);				
			}
			if (!targetsection.equals("")) {
				Reporter.log("Step 10 - Select Target selection as : ("+targetsection+")");
				select(BR_TargetSection, targetsection);			
			}
			if (!targetquestion.equals("")) {
				Reporter.log("Step 11 - Select Target question as : ("+targetquestion+")");
				select(BR_TargetQuestion, targetquestion);					
			}
			if (!targetvalue.equals("")) {
				Reporter.log("Step 12 - Select Target value as : ("+targetvalue+")");
				//select(BR_TargetValue, targetvalue);
				sendKeys(attributeName_xpath,BR_TargetValue, targetvalue);
			}
			if (!targetdocument.equals("")) {
				Reporter.log("Step 13 - Select Target document as : ("+targetdocument+")");
				select(BR_TargetDocument, targetdocument);				
			}
			if (!targetstatus.equals("")) {
				Reporter.log("Step 14 - Select Target Status as : ("+targetstatus+")");
				waitForElementPresentWebdriver(attributeName_xpath, BR_TargetStatus, targetstatus);
				selectByVisibleTextWebdriver(attributeName_xpath, BR_TargetStatus, targetstatus);
				//select(BR_TargetStatus, targetstatus);			
			}
			if (!targettestscore.equals("")) {
				Reporter.log("Step 15 - Select Target test score as : ("+targettestscore+")");
				select(BR_TargetTestScore, targettestscore);					
			}
			if (!targetgroup.equals("")) {
				Reporter.log("Step 16 - Select Target group as : ("+targetgroup+")");
				waitForElementPresentWebdriver(attributeName_xpath, BR_TargetGroup, targetgroup);
				selectByVisibleTextWithSpaceWebdriver(attributeName_xpath, BR_TargetGroup, targetgroup);
			}
			if (!targeturl.equals("")) {
				Reporter.log("Step 17 - Type target URL as : ("+targeturl+")");
				//select(BR_TargetUrl, targeturl);
				sendKeys(attributeName_xpath,BR_TargetUrl, targeturl);
			}
			if (!targetemailtemplate.equals("")) {
				Reporter.log("Step 18 - Select Target Email Template : ("+targetemailtemplate+")");
				select(BR_TargetEmail, targetemailtemplate);				
			}
			if (!savecancel.equals("")) {
				Reporter.log("Step - Clicking on : ("+savecancel+")");
				if(savecancel.equalsIgnoreCase("save")){
					waitForElementPresentWebdriver(attributeName_xpath,BR_Buttons+savecancel+"')]", savecancel);
					clickWebdriver(attributeName_xpath,BR_Buttons+savecancel+"')]");
				}
				else if(savecancel.equalsIgnoreCase("plusfilter")){
					clickWebdriver(attributeName_xpath, BR_PlusFilter);
					waitForPageToLoadWebdriver();
				}
				else if(savecancel.equalsIgnoreCase("cancel")){
					waitForElementPresentWebdriver(attributeName_xpath, BR_Buttons+savecancel+"')]", "Cancel");
					clickWebdriver(attributeName_xpath, BR_Buttons+savecancel+"')]");
					waitForPageToLoadWebdriver();
				}
					
					
			}
			
			if (!verifygreystatus.equals("")) {
					waitForElementPresentWebdriver(attributeName_xpath, BR_StatusGrey, verifygreystatus);
					verifyElementPresentWebdriver(attributeName_xpath, BR_StatusGrey, verifygreystatus);
					//verifyDropDownContainsOptionsWebdriver(attributeName_xpath, BR_StatusGrey+verifygreystatus+"')]", verifygreystatus, verifygreystatus);
					//verifyElementContainsTextWebdriver(attributeName_xpath, BR_StatusGrey+verifygreystatus+"')]", verifygreystatus, verifygreystatus);
				}
			
			if (!verifystatus.equals("")) {
				Reporter.log("Verify the status is present or not");
				clickWebdriver(attributeName_xpath, BR_TargetStatus);
				verifyElementNotPresentWebdriver(attributeName_xpath, BR_VerifyStatus+verifystatus+"')]", verifystatus);
				//verifyElementNotPresentWebdriver(attributeName_xpath, BR_VerifyStatus+verifystatus+"')]", verifystatus);
				//verifyDropDownContainsOptionsWebdriver(attributeName_xpath, BR_VerifyStatus+verifystatus+"'))]", verifystatus, verifystatus);
				
				}
			if (!filtername.equals("")) {
				Reporter.log("Click on the Filter Name");
				clickWebdriver(attributeName_xpath, BR_FilterName+filtername+"')]");
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}
