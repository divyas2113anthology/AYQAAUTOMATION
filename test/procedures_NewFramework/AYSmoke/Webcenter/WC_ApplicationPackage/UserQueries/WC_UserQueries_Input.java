package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.UserQueries;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_UserQueries_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'Manage Queries' page")
	public void WC_UserQueries_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Manage User Queries'Page");
			String[] testdata = datacontainer;
			String add = testdata[0];
			String delete = testdata[1];
			String movetofolder = testdata[2];
			String queryselection = testdata[3];
			String querycheckbox=testdata[4];
			if (!add.equals("")) {
				clickWebdriver(attributeName_xpath, MQ_Add);
				waitForPageToLoadWebdriver();
				clickWebdriver(attributeName_linktext, "Applicant Detail");
			}
			if(!delete.equals(""))
			{
				waitForElementPresentWebdriverWait(attributeName_xpath, MQ_QueryCheck+delete+MQ_QueryCheckbox, queryselection);
				clickWebdriver(attributeName_xpath, MQ_QueryCheck+delete+MQ_QueryCheckbox);
				clickWebdriver(attributeName_xpath, MQ_Delete);
				alertAccept();
				waitForPageToLoadWebdriver();
			}
			if (!queryselection.equals("")) {
				Reporter.log("Click on the Query"+queryselection);
				waitForElementPresentWebdriver(attributeName_xpath, MQ_Queryselect+queryselection+"')]", queryselection);    //TestforUserQueries')]"
				clickWebdriver(attributeName_xpath, MQ_Queryselect+queryselection+"')]");
			}
			if(!querycheckbox.equals("")){
				clickWebdriver(attributeName_xpath, MQ_QueryCheck);
				clickWebdriver(attributeName_xpath, MQ_Delete);
				
			}
			
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}
			
			
}
