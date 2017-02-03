package procedures_NewFramework.AYSmoke.Connect;

import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

public class CRM_Welcome_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some Operation in 'Welcome' page")
	public void CRM_Welcome_Input() throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Welcome' page");
			String[]  testdata = datacontainer;
			String tab_to_click = testdata[0];
			Reporter.log("Input Test Data was retrieved for 'Welcome' page");
			if (!tab_to_click.equals("")) {
				Reporter.log("Step 1 - Proceed to Click on ("+tab_to_click+") Link");
				if(tab_to_click.equals("CRM")) {
					waitForElementPresentWebdriver(attributeName_xpath, "//a[contains(@title,'" + tab_to_click + "')]", tab_to_click);
					clickWebdriver(attributeName_xpath, "//a[contains(@title,'" + tab_to_click + "')]");
					waitForPageToLoadWebdriver();
				}
				else if(tab_to_click.equalsIgnoreCase("contacts") || tab_to_click.equals("Application") ){
					waitForPageToLoadWebdriver();
					waitForElementPresentWebdriver(attributeName_xpath, "//div[contains(@id,'tabs')]//a[text()='" + tab_to_click + "']", tab_to_click);
					clickWebdriver(attributeName_xpath, "//div[contains(@id,'tabs')]//a[text()='" + tab_to_click + "']");
					waitForPageToLoadWebdriver();

				}
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
}
