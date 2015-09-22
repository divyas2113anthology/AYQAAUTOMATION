package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.ConfigureSearchColumn;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_SearchResultConfig_Input extends CommonSeleniumActions implements OR{

	@Test(description="This Procedure is to perform some input operation in 'SearchResultConfig' page")
	public void WC_SearchResultConfig_Input() throws Exception{
	try {
		writeDetails();
		Reporter.log("Proceed to retrieve Verify Test Data 'SearchResultConfig' page");
		String[]  fpvdatarepo = datacontainer;
		String field = fpvdatarepo[0];
		String label = fpvdatarepo[1];
		String order = fpvdatarepo[2];
		String showafterdefault = fpvdatarepo[3];
		String delete = fpvdatarepo[4];
		String addrow = fpvdatarepo[5];
		String save = fpvdatarepo[6];
		Reporter.log("Verify Test Data was retrieved for 'SearchResultConfig' page");
		if (!field.equals("")) {
			Reporter.log("Step 1 - Select values as ("+field+")");
			waitForElementPresentWebdriver(attributeName_xpath, CSC_Field, field);
			selectByVisibleTextWithSpaceWebdriver(attributeName_xpath, CSC_Field, field);
		}
		if (!label.equals("")) {
			Reporter.log("Step 2 - Enter the label as ("+label+")");
			/*waitForElementPresentWebdriver(attributeName_xpath, CSC_Field, field);
			selectByVisibleTextWithSpaceWebdriver(attributeName_xpath, CSC_Field, field);*/
		}
		if (!order.equals("")) {
			Reporter.log("Step 3 - Enter the order as ("+label+")");
			waitForElementPresentWebdriver(attributeName_xpath, CSC_Order, order);
			sendKeys(attributeName_xpath, CSC_Order, order);
		}
		if (!showafterdefault.equals("")) {
			Reporter.log("Step 4 - Check the checkbox ("+showafterdefault+")");
			waitForElementPresentWebdriver(attributeName_xpath, CSC_ShowAfterDefault, showafterdefault);
			clickWebdriver(attributeName_xpath, CSC_ShowAfterDefault);
		}
		if (!delete.equals("")) {
			Reporter.log("Step 5 - Check the checkbox ("+delete+")");
			waitForElementPresentWebdriver(attributeName_xpath, CSC_Delete, delete);
			clickWebdriver(attributeName_xpath, CSC_Delete);
		}
		if (!addrow.equals("")) {
			Reporter.log("Step 6 - Check the checkbox ("+addrow+")");
			waitForElementPresentWebdriver(attributeName_xpath, CSC_AddRow, addrow);
			clickWebdriver(attributeName_xpath, CSC_AddRow);
		}
		if (!save.equals("")) {
			Reporter.log("Step 7 - Check the checkbox ("+delete+")");
			waitForElementPresentWebdriver(attributeName_xpath, CSC_Save, delete);
			clickWebdriver(attributeName_xpath, CSC_Save);
		}
		
	} catch (Exception e) {
		writeFailure(e.getLocalizedMessage());
	}
	//endExecutionOrder(j);
//	Reporter.log("##########End of Execution Order ["+j+"]##########");
}


}
