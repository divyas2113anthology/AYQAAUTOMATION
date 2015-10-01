package procedures_NewFramework.AYSmoke.Webcenter.WC_EventPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_ExportWebcenterUsers_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'Export Webcenter User' page")
	public void WC_ExportWebcenterUsers_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Export Webcenter User' Page");
			String[] testdata = datacontainer;
			String button_to_click = testdata[0];
			Reporter.log("Input Test Data was retrieved for 'Export Webcenter User' Page");
//			writeFailure("Given Test Data["+yesno+"] either Incorrect or has not be Scripted ");
			if (!button_to_click.equals("")) {
				Reporter.log("Step 1 - Click on ["+button_to_click+"] button or Link");
				waitForElementPresentWebdriver(attributeName_xpath, WC_ViewBtn, button_to_click);
				clickWebdriver(attributeName_xpath, WC_ViewBtn);
				waitForPageToLoadWebdriver();
				String browser = Runtimedataread("Browser");
				if (browser.equalsIgnoreCase("Firefox")) {
					Runtime.getRuntime().exec("C:/SeleniumScripts/AYQAAutomation/AutoIT/DownloadFileIEandFF/SampleFileDownload.exe");
				}else if (browser.equalsIgnoreCase("InternetExplorer")) {
					Runtime.getRuntime().exec("C:/SeleniumScripts/AYQAAutomation/AutoIT/DownloadFileIEandFF/IEFileDownloaded.exe");
				}
				waitForPageToLoadWebdriver();
				//C:\SeleniumScripts\DownloadedFileLocation
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}

