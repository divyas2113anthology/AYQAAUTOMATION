package procedures_NewFramework.AYSmoke.Webcenter.WC_EventPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_ManageUsers_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'Manage Users' page")
	public void WC_ManageUsers_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Manage Users' Page");
			String[] testdata = datacontainer;
			String status = testdata[0];
			String checkusername = testdata[1];
			String clickname = testdata[2];
			String selectdeselect = testdata[3];
			String selectanaction = testdata[4];
			String apply = testdata[5];
			String sort = testdata[6];
			String click = testdata[7];
			Reporter.log("Input Test Data was retrieved for 'Manage Users' Page");
			if (!status.equals("")) {
				Reporter.log("Step 1 - Select the view by status ["+status+"]");
				waitForElementPresentWebdriver(attributeName_id, "active", status);
				clickWebdriver(attributeName_id, "active");
			}
			
			if (!checkusername.equals("")) {
				Reporter.log("Step 2 - Perform the operation to check the checkbox as ["+checkusername+"]");
				if (checkusername.contains("check")) {
					String[] SplitFirstLastName = checkusername.split("_");
					waitForElementPresentWebdriver(attributeName_xpath, "//td[a[contains(text(),'"+SplitFirstLastName[0]+"')]]/preceding-sibling::td/font/input[@type='checkbox']", checkusername);
					checkWebdriver(attributeName_xpath, "//td[a[contains(text(),'"+SplitFirstLastName[0]+"')]]/preceding-sibling::td/font/input[@type='checkbox']");
				}else if (checkusername.contains("uncheck")) {
					String[] SplitFirstLastName = checkusername.split("_");
					uncheckWebdriver(attributeName_xpath, "//td[a[contains(text(),'"+SplitFirstLastName[0]+"')]]/preceding-sibling::td/font/input[@type='checkbox']");
				}else if (checkusername.equalsIgnoreCase("All")) {
					waitForElementPresentWebdriver(attributeName_id, "checkAll", checkusername);
					clickWebdriver(attributeName_id, "checkAll");
				}
			}			
			if (!clickname.equals("")) {
				Reporter.log("Step 3 - Click the Name of the Record as ["+clickname+"]");
				String ClickFrstLstName = clickname.replace(";", ",");
				String[] SplitFirstLastName = ClickFrstLstName.split(",");
				int SizeOfSplitFirstLastName = SplitFirstLastName.length;
				writeConsole("Size: "+SizeOfSplitFirstLastName);
				if (SizeOfSplitFirstLastName == 1) {
					if (clickname.equalsIgnoreCase("Applicant First Name")) {
						String ReadClickName = Runtimedataread(clickname);
						clickWebdriver(attributeName_xpath, "//a[contains(text(),'"+ReadClickName+"')]");
						waitForPageToLoadWebdriver();
					}else if (clickname.equalsIgnoreCase("FaceliftAppFirstName")) {
						String ReadClickName = Runtimedataread(clickname);
						clickWebdriver(attributeName_xpath, "//a[contains(text(),'"+ReadClickName+"')]");
						waitForPageToLoadWebdriver();
					}else{
					clickWebdriver(attributeName_xpath, "//a[contains(text(),'"+clickname+"')]");
					waitForPageToLoadWebdriver();
					}
				}else{
				clickWebdriver(attributeName_xpath, "//a[contains(text(),'"+SplitFirstLastName[0]+"') and contains(text(),'"+SplitFirstLastName[1]+"')]");
				waitForPageToLoadWebdriver();
				}
			}
			if (!selectdeselect.equals("")) {
				Reporter.log("Step 4 - Select an action as ["+selectanaction+"]");
				
			}
			if (!selectanaction.equals("")) {
				Reporter.log("Step 5 - Select an action as ["+selectanaction+"]");
				selectByVisibleTextWebdriver(attributeName_xpath, MU_SelectAnAction, selectanaction);
//				selectByValueWebdriver(attributeName_xpath, EVR_SelectAnAction, selectanaction);
			}			
			if (!apply.equals("")) {
				Reporter.log("Step 6 - Select the Radio button as ["+apply+"]");
				if (apply.equalsIgnoreCase("Apply to Selected")) {
					clickWebdriver(attributeName_xpath, ASR_ApplySelected);
				}else if (apply.equalsIgnoreCase("Apply to All")) {
					clickWebdriver(attributeName_xpath, ASR_ApplyAll);
				}
			}
			if (!sort.equals("")) {
				Reporter.log("Step 7 - Select the Radio button as ["+sort+"]");
			}
			if (!click.equals("")) {
				Reporter.log("Step 8 - Click button as ["+click+"]");
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


