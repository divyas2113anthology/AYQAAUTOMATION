package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.Imports;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_ManageImportTemplate_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'Manage Import Template' page")
	public void WC_ManageImportTemplate_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Manage Import Template' Page");
			String[] testdata = datacontainer;
			String checktemplatenamecheckbox = testdata[0];
			String clicktemplatename = testdata[1];
			String button = testdata[2];
			String template=testdata[3];//Added by Rahul Mehta on 26th March,2019
			Reporter.log("Input Test Data was retrieved for 'Manage Import Template' Page");
//			writeFailure("Given Test Data["+yesno+"] either Incorrect or has not be Scripted ");
			//waitForElementPresentWebdriver(attributeName_xpath, MCL_NewSearchbutton, "New Search Button");
			if (!checktemplatenamecheckbox.equals("")) {
				sleep(3);//Added by Rahul Mehta on 26th March,2019
				Reporter.log("Step 1 - Perform the operation to check the checkbox as ["+checktemplatenamecheckbox+"]");
				if (checktemplatenamecheckbox.equalsIgnoreCase("check")) {//Modified by Rahul Mehta on 26th March,2019
					if(!template.equals("")) {
						clickWebdriver(attributeName_xpath, "//td[a[contains(text(),'" +template+ "')]]/preceding-sibling::td/input[@type='checkbox']");
						sleep(2);
					}
				}else if (checktemplatenamecheckbox.equalsIgnoreCase("uncheck")) {
					uncheckWebdriverCheckbox(attributeName_xpath, "//td[a[contains(text(),'"+checktemplatenamecheckbox+"')]]/preceding-sibling::td/input[@type='checkbox']");
				}
			}			
			if (!clicktemplatename.equals("")) {
				Reporter.log("Step 2 - Click the Name of the Record as ["+clicktemplatename+"]");
				waitForElementPresentWebdriver(attributeName_xpath, "//a[contains(text(),'"+clicktemplatename+"')]", clicktemplatename);
				clickWebdriver(attributeName_xpath, "//a[contains(text(),'"+clicktemplatename+"')]");
			}
			if (!button.equals("")) {
				Reporter.log("Step 3 - Click button as ["+button+"]");
				if (button.equalsIgnoreCase("Add")) {
					//Thread.sleep(5000);
					//driver.navigate().refresh();
					//Thread.sleep(2000);
					waitForElementPresentWebdriverWait(attributeName_xpath, MSR_AddBtn, button);
					//driver.findElement(By.xpath("//form//table//tr[@class='FormHeading'][2]//a[contains(@href,'AddSubSectionRule')]")).click();
					clickWebdriver(attributeName_xpath, MSR_AddBtn);
				}else if (button.equalsIgnoreCase("Delete")) {
					clickWebdriver(attributeName_xpath, SAE_DeleteButton);
					sleep(2);
					alertAccept();//Modified by Rahul Mehta on 26th March,2019
					sleep(3);
				}else if (button.equalsIgnoreCase("Copy")) {
					clickWebdriver(attributeName_name, "imageCopy");
				}else if (button.equalsIgnoreCase("Move To Folder")) {
					clickWebdriver(attributeName_xpath, EA_MoveToFolder);
				}
			}			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}


