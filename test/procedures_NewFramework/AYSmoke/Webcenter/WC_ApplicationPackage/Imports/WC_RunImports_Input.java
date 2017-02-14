package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.Imports;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_RunImports_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'Run Imports' page")
	public void WC_RunImports_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Run Imports' Page");
			String[] testdata = datacontainer;
			String clickradioagainstname = testdata[0];
			String choosefile = testdata[1];
			String columnheader = testdata[2];
			String rule = testdata[3];
			String unsubmittedstatus = testdata[4];
			String actionhistory = testdata[5];
			String actionhistorytext = testdata[6];
			String click = testdata[7];
			
			Reporter.log("Input Test Data was retrieved for 'Run Imports' Page");
//			writeFailure("Given Test Data["+yesno+"] either Incorrect or has not be Scripted ");
			if (!clickradioagainstname.equals("")) {
				Reporter.log("Step 1 - Perform the operation to click the Radio Button as ["+clickradioagainstname+"]");
//				waitForElementPresentWebdriver(attributeName_xpath, "//td[contains(text(),'"+clickradioagainstname+"')]]/preceding-sibling::td/input[@type='radio']", clickradioagainstname);
//				clickWebdriver(attributeName_xpath, "//td[contains(text(),'"+clickradioagainstname+"')]]/preceding-sibling::td/input[@type='radio']");
				waitForElementPresentWebdriver(attributeName_xpath, "//td[text()='"+clickradioagainstname+"']/parent::tr/td/input", clickradioagainstname);
				clickWebdriver(attributeName_xpath, "//td[text()='"+clickradioagainstname+"']/parent::tr/td/input");



			}


			if (!choosefile.equals("")) {
				Reporter.log("Step 2 - Click the Name of the Record as ["+choosefile+"]");
				waitForElementPresentWebdriverWait(attributeName_name, "attfile", choosefile);
				//clickWebdriver(attributeName_name, "attfile");
				Thread.sleep(5000);
				waitForPageToLoadWebdriver();
				Thread.sleep(1000);
				if(choosefile.contains("ImportForSmokeTest")){
					driver.findElement(By.name("attfile")).sendKeys(choosefile);
					//C:\SeleniumScripts\AYQAAutomation\SourceFile\Webcenter\ImportFile
				}
				else
				 {
					driver.findElement(By.name("attfile")).sendKeys("C:/SeleniumScripts/AYQAAutomation/SourceFile/Application/UploadDocument/ImportForSmokeTest.txt");
				}
				//Runtime.getRuntime().exec("C:/SeleniumScripts/AYQAAutomation/AutoIT/Firefox/Webcenter/ImportFileFF.exe");
				waitForPageToLoadWebdriver();
				Thread.sleep(8000);

				//clickWebdriver(attributeName_name, "attfile");
//				Runtime.getRuntime().exec("C:\\SeleniumScripts\\AYQAAutomation\\AutoIT\\Firefox\\Webcenterr\\ImportFileFF.exe");
				//Removed wait time
			}
				if (!columnheader.equals("")) {
				Reporter.log("Step 3 - Select the column header as ["+columnheader+"]");
				if (columnheader.contains("check")) {
					checkWebdriverCheckbox(attributeName_name, "IncludeHeader");
				}else if (columnheader.contains("uncheck")) {
					uncheckWebdriverCheckbox(attributeName_name, "IncludeHeader");
				}

			}
			if (!rule.equals("")) {
				Reporter.log("Step 4 - Select an Rule as ["+rule+"]");
				clickWebdriver(attributeName_xpath, RR_Rules+rule+"']");
			}			
			if (!unsubmittedstatus.equals("")) {
				Reporter.log("Step 5 - Select the Column Header as ["+unsubmittedstatus+"]");
				if (columnheader.contains("check")) {
					checkWebdriverCheckbox(attributeName_name, "blnUnSubmit");
				}else if (columnheader.contains("uncheck")) {
					uncheckWebdriverCheckbox(attributeName_name, "blnUnSubmit");
				}
			}
			if (!actionhistory.equals("")) {
				Reporter.log("Step 6 - Select the Action History as ["+actionhistory+"]");
				if (actionhistory.contains("check")) {
					checkWebdriverCheckbox(attributeName_name, "blnUnSubmit");
				}else if (actionhistory.contains("uncheck")) {
					uncheckWebdriverCheckbox(attributeName_name, "blnUnSubmit");
				}
			}
			if (!actionhistorytext.equals("")) {
				
				Reporter.log("Step 7 - Enter the Action History as ["+actionhistorytext+"]");
				sendKeys(attributeName_name, "ActionHistoryText", actionhistorytext);
			}
			
			if (!click.equals("")) {
				Reporter.log("Step 8 - Click button as ["+click+"]");
				
				/*waitForElementPresentWebdriverWait(attributeName_name, "Transferx", click);
				clickWebdriver(attributeName_name, "Transferx");*/
				waitForElementPresentWebdriverWait(attributeName_xpath, RPT_RunBtn, click);
				waitForPageToLoadWebdriver();
				waitForPageToLoadWebdriver();
				clickWebdriver(attributeName_xpath, RPT_RunBtn);
				waitForPageToLoadWebdriver();
				Thread.sleep(8000);

			}			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}


