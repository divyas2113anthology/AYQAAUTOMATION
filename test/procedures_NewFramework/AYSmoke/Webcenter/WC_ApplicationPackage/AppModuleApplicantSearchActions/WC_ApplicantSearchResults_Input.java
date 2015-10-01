package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.AppModuleApplicantSearchActions;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_ApplicantSearchResults_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'Application search results' page")
	public void WC_ApplicantSearchResults_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Application search results' Page");
			String[] testdata = datacontainer;
			String checkagainstname = testdata[0];
			String clickname = testdata[1];
			String clickpdf = testdata[2];
			String selectanaction = testdata[3];
			String radio_button_click = testdata[4];
			String click = testdata[5];
			Reporter.log("Input Test Data was retrieved for 'Application search results' Page");
//			writeFailure("Given Test Data["+yesno+"] either Incorrect or has not be Scripted ");
//			waitForElementPresentWebdriver(attributeName_xpath, MCL_NewSearchbutton, "New Search Button");
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
				writeConsole(clickname);
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
					}else if (clickname.equalsIgnoreCase("OLIVE")) {
						String ReadClickName = Runtimedataread(clickname);
						clickWebdriver(attributeName_xpath, "//a[contains(text(),'"+ReadClickName+"')]");
						recentPopupSelectWebdriver("Application Summary");
					}else{
					clickWebdriver(attributeName_xpath, "//a[contains(text(),'"+clickname+"')]");
					int WindowCount = getWindowHandles();
					//recentMultiplePopupSelectWebdriver("Application Summary", WindowCount);
					recentPopupSelectWebdriver("Application Summary");
					}
				}else{
				clickWebdriver(attributeName_xpath, "//a[contains(text(),'"+SplitFirstLastName[0]+"') and contains(text(),'"+SplitFirstLastName[1]+"')]");
				recentPopupSelectWebdriver("Application Summary");
				}
			}
			if (!clickpdf.equals("")) {
				Reporter.log("Step 3 - Click the name of the pdf as ["+clickpdf+"]");
				String ClickPDF = clickpdf.replace(";", ",");
				String[] SplitFirstLastName = ClickPDF.split(",");
				clickWebdriver(attributeName_xpath, "//td[a[contains(text(),'"+SplitFirstLastName[0]+"') and contains(text(),'"+SplitFirstLastName[1]+"')]]/following-sibling::td/a/img[@alt='Print Application']");
				recentPopupSelectWebdriver("Application Summary");
			}
			if (!selectanaction.equals("")) {
				Reporter.log("Step 4 - Select an action as ["+selectanaction+"]");
				selectByVisibleTextWebdriver(attributeName_xpath, ASR_SelectanAction, selectanaction);
			}			
			if (!radio_button_click.equals("")) {
				Reporter.log("Step 5 - Select the Radio button as ["+radio_button_click+"]");
				if (radio_button_click.equalsIgnoreCase("Apply to Selected")) {
					clickWebdriver(attributeName_xpath, ASR_ApplySelected);
				}else if (radio_button_click.equalsIgnoreCase("Apply to All")) {
					clickWebdriver(attributeName_xpath, ASR_ApplyAll);
				}else if (radio_button_click.equalsIgnoreCase("Ascending")) {
					clickWebdriver(attributeName_xpath, ASR_Ascending);
				}else if (radio_button_click.equalsIgnoreCase("Descending")) {
					clickWebdriver(attributeName_xpath, ASR_Descending);
				}
			}
			if (!click.equals("")) {
				Reporter.log("Step 6 - Click button as ["+click+"]");
			
				if (click.equalsIgnoreCase("New Search")) {
					waitForElementPresentWebdriver(attributeName_xpath, ASR_NewSearchbtn,"NewSearch");
					clickWebdriver(attributeName_xpath, ASR_NewSearchbtn);
					System.out.println("aaaa");
				}else if (click.equalsIgnoreCase("Back")) {
					clickWebdriver(attributeName_xpath, ASR_BackBtn);
				}else if (click.equalsIgnoreCase("Go")) {
					clickWebdriver(attributeName_xpath, ASR_GoBtn);
//					Actions action = new Actions(driver);
//					action.sendKeys(Keys.RETURN);
//					action.perform();
					//Removed sleep time
					try {
				        Alert alert = driver.switchTo().alert();
				        String AlertText = alert.getText();
				        System.out.println(AlertText);
				        alert.accept();
				    } catch (Exception e) {
				        System.out.println("no alert");
				    }
					waitForPageToLoad();
					
					//driver.switchTo().alert().accept();
				}
				
			}			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}

