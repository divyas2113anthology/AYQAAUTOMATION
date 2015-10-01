package procedures_NewFramework.AYSmoke.Connect;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class CRM_SearchContactsResults_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some input operation in 'Contact Search Results' page")
		public void CRM_SearchContactsResults_Input() throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Verify Test Data 'Show Matching' page");
			String[]  fpvdatarepo = datacontainer;
			String button_click = fpvdatarepo[0];
			String checkbox_check = fpvdatarepo[1];
			
			Reporter.log("Perform some input operation in 'Contact Search Results' page");
			if (!checkbox_check.equals("")) {
				Reporter.log("Step 1 - Checkbox Index/All("+checkbox_check+")");
				if(checkbox_check.equalsIgnoreCase("All"))
					clickWebdriver(attributeName_xpath, "//input[@id='navigatorSelectAll']");
				else 
					clickWebdriver(attributeName_xpath, "//input[contains(@id,'"+checkbox_check+"')]");
								
			}
			if (!button_click.equals("")) {
				Reporter.log("Step 2 - Clicking on ("+button_click+")");
				if(button_click.equalsIgnoreCase("Delete")){
					clickWebdriver(attributeName_xpath, "//input[@value='"+button_click+"']");
					//recentPopupSelect_without_window_nameWebdriver();
					waitForElementPresentWebdriver(attributeName_xpath, "//button[contains(@class,'ui-button')]/span[contains(text(),'Yes')]", "Delete");
					clickWebdriver(attributeName_xpath, "//div[span[text()='Delete Confirmation']]/following-sibling::div[@class='ui-dialog-buttonpane ui-widget-content ui-helper-clearfix']//button/span[text()='Yes']");
//					if(isElementPresentWebdriver(attributeName_xpath, "//button[contains(@class,'ui-button')]/span[contains(text(),'Yes')]")){
//						if(isEnabledWebdriver(attributeName_xpath, "//button[contains(@class,'ui-button')]/span[contains(text(),'Yes')]")) {
//							clickWebdriver(attributeName_xpath, "//button[contains(@class,'ui-button')]/span[contains(text(),'Yes')]");
//						}
//					}
				}
				else
				{
					waitForElementPresentWebdriver(attributeName_xpath, "//input[@value='"+button_click+"']", button_click);
					clickWebdriver(attributeName_xpath, "//input[@value='"+button_click+"']");	
				}
								
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

}