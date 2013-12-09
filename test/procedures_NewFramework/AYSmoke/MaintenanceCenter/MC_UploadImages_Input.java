package procedures_NewFramework.AYSmoke.MaintenanceCenter;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class MC_UploadImages_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'Upload Images' page")
	public void MC_UploadImages_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Upload Images' Page");
			String[] testdata = datacontainer;
			String browse = testdata[0];
			String mainheader = testdata[1];
			String cornerimageclient = testdata[2];
			String cornerimagepackage = testdata[3];
			String selectapackage = testdata[4];
			String faceliftpackageheader = testdata[5];
			String faceliftselectapackage = testdata[6];
			String cornerimagerecommendation = testdata[7];
			String recommendationselectapackage = testdata[8];
			String selectimagecheckbox = testdata[9];
			String clickimage = testdata[10];
			String urlrefersource = testdata[11];
			String buttons = testdata[12];			
			Reporter.log("Input Test Data was retrieved for 'Upload Images' Page");
			if (!browse.equals("")) {
				Reporter.log("Step 1 - Browser a Document From location["+browse+"]");
				waitForElementPresentWebdriver(attributeName_name, "txtImage", "Upload Browser");
				sendKeysType(attributeName_name, "txtImage", browse);
			}
			if (!mainheader.equals("")) {
				Reporter.log("Step 2 - Select the Code lookup type as ["+mainheader+"]");
				
			}
			if (!cornerimageclient.equals("")) {
				
				
			}
			if (!cornerimagepackage.equals("")) {
				Reporter.log("Step 4 - Select the CheckBox as ["+cornerimagepackage+"] ");
				if (cornerimagepackage.contains("check")) {
					checkWebdriver(attributeName_xpath, UI_CornerImage);
				}else if (cornerimagepackage.contains("Uncheck")) {
					uncheckWebdriver(attributeName_xpath, UI_CornerImage);
				}				
			}
			if (!selectapackage.equals("")) {
				Reporter.log("Step 5 - Select the Package as ["+selectapackage+"] ");
				selectByVisibleTextWebdriver(attributeName_name, UI_Package, selectapackage);
			}
			if (!faceliftpackageheader.equals("")) {
				
				
			}
			if (!faceliftselectapackage.equals("")) {
				
				
			}
			if (!cornerimagerecommendation.equals("")) {
				
				
			}
			if (!recommendationselectapackage.equals("")) {
				
				
			}
			if (!selectimagecheckbox.equals("")) {
				Reporter.log("Step 10 - Select the CheckBox as ["+selectimagecheckbox+"] ");
				String[] Splitselectimagecheckbox = selectimagecheckbox.split("_");
				if (selectimagecheckbox.contains("check")) {
					checkWebdriver(attributeName_xpath, "//td[a[text()='"+Splitselectimagecheckbox[0]+"']]/preceding-sibling::td/input[@type='CheckBox']");
				}else if (selectimagecheckbox.contains("Uncheck")) {
					uncheckWebdriver(attributeName_xpath, "//td[a[text()='"+Splitselectimagecheckbox[0]+"']]/preceding-sibling::td/input[@type='CheckBox']");
				}
			}
			if (!clickimage.equals("")) {
				Reporter.log("Step 11 - Click on the ["+clickimage+"] link");
				clickWebdriver(attributeName_partiallinktext, clickimage);
				
			}
			if (!urlrefersource.equals("")) {
				
				
			}
			if (!buttons.equals("")) {
				Reporter.log("Step 12 - Click on the ["+buttons+"] Button");
				if (buttons.equalsIgnoreCase("Upload")) {
					waitForElementPresentWebdriver(attributeName_xpath, UI_UploadBtn, buttons);
					clickWebdriver(attributeName_xpath, UI_UploadBtn);				
					waitForPageToLoadWebdriver();
				}else if (buttons.equalsIgnoreCase("Delete")) {
					waitForElementPresentWebdriver(attributeName_xpath, SAE_DeleteButton, buttons);
					clickWebdriver(attributeName_xpath, SAE_DeleteButton);				
					waitForPageToLoadWebdriver();
				}else if (buttons.equalsIgnoreCase("Cancel")) {
					waitForElementPresentWebdriver(attributeName_xpath, SAE_CancelButton, buttons);
					clickWebdriver(attributeName_xpath, SAE_CancelButton);				
					waitForPageToLoadWebdriver();
				}
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}


