package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.SelectanAction;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_RunReport_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'Run Report' page")
	public void WC_RunReport_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Run Report' Page");
			String[] testdata = datacontainer;
			String selectfolder = testdata[0];
			String selectreport = testdata[1];
			String selectaformat = testdata[2];
			String button = testdata[3];
			Reporter.log("Input Test Data was retrieved for 'Run Report' Page");
			if (!selectfolder.equals("")) {
				Reporter.log("Click the exact name of the Folder ["+selectfolder+"]");
				waitForElementPresentWebdriver(attributeName_xpath, "//td[text()='"+selectfolder+"']/preceding-sibling::td/a[img[@name='Groupsys_img']]", selectfolder);
				clickWebdriver(attributeName_xpath, "//td[text()='"+selectfolder+"']/preceding-sibling::td/a[img[@name='Groupsys_img']]");
			}
			
			if (!selectreport.equals("")) {
				Reporter.log("Click the exact name of the report ["+selectreport+"]");
				waitForElementPresentWebdriver(attributeName_xpath, "//td[text()='"+selectreport+"']/preceding-sibling::td/input[@type='radio']", selectreport);
				clickWebdriver(attributeName_xpath, "//td[text()='"+selectreport+"']/preceding-sibling::td/input[@type='radio']");
			}
			
			if (!selectaformat.equals("")) {
				Reporter.log("Select the format as ["+selectaformat+"]");
				if (selectaformat.equalsIgnoreCase("Adobe PDF")) {
					clickWebdriver(attributeName_xpath, RR_PdfFormate);
				} else if (selectaformat.equalsIgnoreCase("MS Excel")) {
					clickWebdriver(attributeName_xpath, RR_ExcelFormate);
				} else if (selectaformat.equalsIgnoreCase("MS Word")) {
					clickWebdriver(attributeName_xpath, RR_WordFormate);
				} else if (selectaformat.equalsIgnoreCase("HTML")) {
					clickWebdriver(attributeName_xpath, RR_HtmlFormate);
				} 
			}
			
			if (!button.equals("")) {
				Reporter.log("Click the button as ["+button+"]");
				if (button.equalsIgnoreCase("Run")) {
					clickWebdriver(attributeName_xpath, RPT_RunBtn);
					waitForPageToLoadWebdriver();
				} else if (button.equalsIgnoreCase("Back")) {
					clickWebdriver(attributeName_xpath, IE_BackBtn);
					waitForPageToLoadWebdriver();
				} else if (button.equalsIgnoreCase("Clear")) {
					clickWebdriver(attributeName_xpath, RR_ClearBtn);
				}
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}


