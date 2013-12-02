package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_ConfigureDownloadableForms_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'Configure Downloadable Forms' page")
	public void WC_ConfigureDownloadableForms_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Configure Downloadable Forms' Page");
			String[] testdata = datacontainer;
			String checkagainstname = testdata[0];
			String clickname = testdata[1];
			String click = testdata[2];
			Reporter.log("Input Test Data was retrieved for 'Configure Downloadable Forms' Page");
			if (!checkagainstname.equals("")) {
				Reporter.log("Step 1 - Perform the operation to check the checkbox as ["+checkagainstname+"]");
				if (checkagainstname.contains("check")) {
					String CheckFrstLstName = checkagainstname.replace(";", ",");
					String[] SplitFirstLastName = CheckFrstLstName.split(",");
					waitForElementPresentWebdriver(attributeName_xpath, "//td[a[contains(text(),'"+SplitFirstLastName[0]+"') and contains(text(),'"+SplitFirstLastName[1]+"')]]/preceding-sibling::td/input[@type='checkbox']", CheckFrstLstName);
					checkWebdriver(attributeName_xpath, "//td[a[contains(text(),'"+SplitFirstLastName[0]+"') and contains(text(),'"+SplitFirstLastName[1]+"')]]/preceding-sibling::td/input[@type='checkbox']");
				}else if (checkagainstname.contains("uncheck")) {
					String CheckFrstLstName = checkagainstname.replace(";", ",");
					String[] SplitFirstLastName = CheckFrstLstName.split(",");
					uncheckWebdriver(attributeName_xpath, "//td[a[contains(text(),'"+SplitFirstLastName[0]+"') and contains(text(),'"+SplitFirstLastName[1]+"')]]/preceding-sibling::td/input[@type='checkbox']");
				}else if (checkagainstname.equalsIgnoreCase("All")) {
					waitForElementPresentWebdriver(attributeName_xpath, "//img[contains(@src,'check_box')]", checkagainstname);
					clickWebdriver(attributeName_xpath, "//img[contains(@src,'check_box')]");
				}else if (checkagainstname.equalsIgnoreCase("emtqaaccount@hobsons.com")) {
					waitForElementPresentWebdriver(attributeName_xpath, "//td[a[contains(text(),'"+checkagainstname+"')]]/preceding-sibling::td/input[@type='checkbox']", checkagainstname);
					checkWebdriver(attributeName_xpath, "//td[a[contains(text(),'"+checkagainstname+"')]]/preceding-sibling::td/input[@type='checkbox']");
				}
			}			
			if (!clickname.equals("")) {
				Reporter.log("Step 2 - Click the Name of the Record as ["+clickname+"]");
				String ClickFrstLstName = clickname.replace(";", ",");
				String[] SplitFirstLastName = ClickFrstLstName.split(",");
				int SizeOfSplitFirstLastName = SplitFirstLastName.length;
				writeConsole("Size: "+SizeOfSplitFirstLastName);
				if (SizeOfSplitFirstLastName == 1) {
					if (clickname.equalsIgnoreCase("Applicant First Name")) {
						String ReadClickName = Runtimedataread(clickname);
						clickWebdriver(attributeName_xpath, "//a[contains(text(),'"+ReadClickName+"')]");
						recentPopupSelectWebdriver("Application Summary");
					}else if (clickname.equalsIgnoreCase("FaceliftAppFirstName")) {
						String ReadClickName = Runtimedataread(clickname);
//						sendKeyStroke(attributeName_xpath, "//a[contains(text(),'"+ReadClickName+"')]", Keys.SPACE);
						clickWebdriver(attributeName_xpath, "//a[contains(text(),'"+ReadClickName+"')]");
						recentPopupSelectWebdriver("Application Summary");
					}else{
					clickWebdriver(attributeName_xpath, "//a[contains(text(),'"+clickname+"')]");
					recentPopupSelectWebdriver("Application Summary");
					}
				}else{
				clickWebdriver(attributeName_xpath, "//a[contains(text(),'"+SplitFirstLastName[0]+"') and contains(text(),'"+SplitFirstLastName[1]+"')]");
				recentPopupSelectWebdriver("Application Summary");
				}
			}
			if (!click.equals("")) {
				Reporter.log("Step 6 - Click button as ["+click+"]");
				if (click.equalsIgnoreCase("New Search")) {
					clickWebdriver(attributeName_xpath, ASR_NewSearchbtn);
				}else if (click.equalsIgnoreCase("Back")) {
					clickWebdriver(attributeName_xpath, ASR_BackBtn);
				}else if (click.equalsIgnoreCase("Go")) {
					clickWebdriver(attributeName_xpath, ASR_GoBtn);
					waitForPageToLoad();
				}
			}			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}


