package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.CreateLabelAndLetter;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_CreateLabels_Inputs extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'Create Label' page")
	public void WC_CreateLabels_Inputs(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Create Label' Page");
			String[] testdata = datacontainer;
			String avery = testdata[0];
			String sort = testdata[1];
			String startprinting = testdata[2];
			String actionshistory = testdata[3];
			String actionhistorytext = testdata[4];
			String addtolabel = testdata[5];
			String addchoicegroupcode = testdata[6];
			String groupbyselectedfield = testdata[7];
			String button = testdata[8];
			Reporter.log("Input Test Data was retrieved for 'Create Label' Page");
			if (!avery.equals("")) {
				Reporter.log("Step 1 - Click the Avery as ["+avery+"]");
				waitForElementPresentWebdriver(attributeName_xpath, "//td[font[contains(text(),'"+avery+"')]]/preceding-sibling::td/font/input[@type='radio']", avery);
				clickWebdriver(attributeName_xpath, "//td[font[contains(text(),'"+avery+"')]]/preceding-sibling::td/font/input[@type='radio']");
			}
			if (!sort.equals("")) {
				Reporter.log("Step 2 - Select the label sort as ["+sort+"]");
				waitForElementPresentWebdriver(attributeName_xpath, "//td[contains(text(),'"+sort+"')]/preceding-sibling::td/font/input[@type='radio']", sort);
				clickWebdriver(attributeName_xpath, "//td[contains(text(),'"+sort+"')]/preceding-sibling::td/font/input[@type='radio']");
			}
			if (!startprinting.equals("")) {
				Reporter.log("Step 3 - Start printing selected as ["+startprinting+"]");
				selectByValueWebdriver(attributeName_name, "Blank", startprinting);
			}
			if (!actionshistory.equals("")) {
				Reporter.log("Step 4 - Select the Action History as ["+actionshistory+"]");
				if (actionshistory.contains("Check")) {
					checkWebdriver(attributeName_name, "RecordAction");
				}else if (actionshistory.contains("Uncheck")) {
					checkWebdriver(attributeName_name, "RecordAction");
				}
			}
			if (!actionhistorytext.equals("")) {
				Reporter.log("Step 5 - Enter the Action History text as ["+actionhistorytext+"]");
				sendKeys(attributeName_name, "ActionLabel", actionhistorytext);
			}
			if (!addtolabel.equals("")) {
				Reporter.log("Step 6 - Select the Add to label as ["+addtolabel+"]");
				String [] SplitPackage = addtolabel.split(";");
				for (int i = 0; i < SplitPackage.length; i++) {
					writeConsole("Tree Package : "+SplitPackage[i]);
					if (i== SplitPackage.length-1) {
						clickWebdriver(attributeName_linktext, SplitPackage[i]);
						waitForPageToLoadWebdriver();
					}else{
						PackageSelection(SplitPackage[i], "1");
					}
				}
				ClosePackageSelection();
			}
			if (!addchoicegroupcode.equals("")) {
				Reporter.log("Step 7 - Select the add choice group as ["+addchoicegroupcode+"]");
				if (groupbyselectedfield.contains("Check")) {
					checkWebdriver(attributeName_name, "AddChoiceGroupCode");
				}else if (groupbyselectedfield.contains("Uncheck")) {
					checkWebdriver(attributeName_name, "AddChoiceGroupCode");
				}
			}
			if (!groupbyselectedfield.equals("")) {
				Reporter.log("Step 8 - Select the Group by selected field as ["+groupbyselectedfield+"]");
				if (groupbyselectedfield.contains("Check")) {
					checkWebdriver(attributeName_name, "AddGroupBy");
				}else if (groupbyselectedfield.contains("Uncheck")) {
					checkWebdriver(attributeName_name, "AddGroupBy");
				}
			} 
			if (!button.equals("")) {
				Reporter.log("Step 9 - Click the Button as ["+button+"]");
				if (button.equalsIgnoreCase("Print")) {
					clickWebdriver(attributeName_xpath, CL_PrintBtn);
					waitForPageToLoadWebdriver();
				} else if (button.equalsIgnoreCase("Back")) {
					clickWebdriver(attributeName_xpath, ASR_BackBtn);
					waitForPageToLoadWebdriver();
				}
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}
