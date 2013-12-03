package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_AddConfigureDownloadableForms_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'Add Configure Downloadable Forms' page")
	public void WC_AddConfigureDownloadableForms_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Add Configure Downloadable Forms' Page");
			String[] testdata = datacontainer;
			String formname = testdata[0];
			String description = testdata[1];
			String formorder = testdata[2];
			String urltoformfile = testdata[3];
			String formfiletoupload = testdata[4];
			String printpdf = testdata[5];
			String button = testdata[6];
			Reporter.log("Input Test Data was retrieved for 'Add Configure Downloadable Forms' Page");
			Date date = new Date();  
			DateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
			String FormName = formname+dateFormat.format(date)+Calendar.getInstance().getTimeInMillis();
			if (!formname.equals("")) {
				Reporter.log("Step 1 - Enter the Form Name as ["+formname+"]");
				waitForElementPresentWebdriver(attributeName_name, CDF_FormName, formname);
				sendKeys(attributeName_name, CDF_FormName, FormName);
				Runtimedatawrite(FormName, "Form Name");
			}	
			if (!description.equals("")) {
				Reporter.log("Step 2 - Enter the description as ["+description+"]");
				sendKeys(attributeName_name, CDF_Description, description);
			}
			if (!formorder.equals("")) {
				Reporter.log("Step 3 - Enter the formorder as ["+formorder+"]");
				sendKeys(attributeName_name, CDF_FormOrder, formorder);
			}
			if (!urltoformfile.equals("")) {
				Reporter.log("Step 4 - Enter the url to form file as ["+urltoformfile+"]");
				sendKeys(attributeName_name, CDF_UrlToFormFile, urltoformfile);
			}
			if (!formfiletoupload.equals("")) {
				Reporter.log("Step 5 - Enter the form file to upload as ["+formfiletoupload+"]");
//				clickWebdriver(attributeName_name, CDF_FormFileToUpload);
				sendKeysType(attributeName_name, CDF_FormFileToUpload, formfiletoupload);
//				Runtime.getRuntime().exec("C:/SeleniumScripts/AYQAAutomation/AutoIT/Firefox/Webcenter/ImportFileFF.exe");
//				Thread.sleep(3000);
			}
			if (!printpdf.equals("")) {
				Reporter.log("Step 6 - Select the print pdf as ["+printpdf+"]");
				if (printpdf.contains("check")) {
					checkWebdriverCheckbox(attributeName_name, CDF_PrintPdf);
				}else if (printpdf.contains("uncheck")) {
					uncheckWebdriverCheckbox(attributeName_name, CDF_PrintPdf);
				}

			}
			if (!button.equals("")) {
				Reporter.log("Step 7 - Click button as ["+button+"]");
				if (button.equalsIgnoreCase("Save")) {
					waitForElementPresentWebdriver(attributeName_xpath, WCL_Savebutton, button);
					clickWebdriver(attributeName_xpath, WCL_Savebutton);
					waitForPageToLoadWebdriver();
				}else if (button.equalsIgnoreCase("Back")) {
					clickWebdriver(attributeName_xpath, ASR_BackBtn);
					waitForPageToLoadWebdriver();
				}
			}			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}