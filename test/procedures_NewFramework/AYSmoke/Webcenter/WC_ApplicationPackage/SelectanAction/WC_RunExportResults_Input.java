package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.SelectanAction;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_RunExportResults_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'Run Export Results' page")
	public void WC_RunExportResults_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Run Export Results' Page");
			String[] testdata = datacontainer;
			String downloadfilename = testdata[0];
			String linktoclick = testdata[1];
			Reporter.log("Input Test Data was retrieved for 'Run Export Results' Page");
//			writeFailure("Given Test Data["+yesno+"] either Incorrect or has not be Scripted ");
			if (!downloadfilename.equals("")) {
				Reporter.log("Step 1 - Proceed to Read Download Export File from Excel Sheet(C:/Selenium/InputTestdata.xls)");
				String GetExportFile = getText("//a[contains(@href, 'javascript:frmDownload.submit();')]");
//				String[] SplitExtensionGetExportFile = GetExportFile.split(".txt");
				Runtimedatawrite(GetExportFile, downloadfilename);
			}
			if (!linktoclick.equals("")) {
				Reporter.log("Step 2 - Proceed to Click the Export File Link");
				waitForElementPresentWebdriver(attributeName_xpath, "//a[contains(@href, 'javascript:frmDownload.submit();')]", "Export File Link");
				clickWebdriver(attributeName_xpath, "//a[contains(@href, 'javascript:frmDownload.submit();')]");
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}

