package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.Exports;

import or.OR;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

public class WC_FieldDefinitions_Export_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'Field Definition Export' page")
	public void WC_FieldDefinitions_Export_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Field Definition Export' Page");
			String[] testdata = datacontainer;
			String fieldquestion = testdata[0];
			String fieldname = testdata[1];
			String itemaction = testdata[2];
			String fieldnameposition = testdata[3];
			String fieldnamelabel = testdata[4];
			String saveback = testdata[5];
			Reporter.log("Input Test Data was retrieved for 'Field Definition Export' Page");
			waitForElementPresentWebdriver(attributeName_name, FD_SaveBtn, saveback);
			switchToDefaultContentWebdriver();
			switchToFrameNameIdWebdriver("frameQuestionsTree");
			if (!fieldquestion.equals("")) {
				Reporter.log("Select the field question as ["+fieldquestion+"]");
				System.out.println(fieldquestion);
				String [] SplitPackage = fieldquestion.split(";");
//				for (int i = 0; i < SplitPackage.length; i++) {
//					writeConsole("Tree Package : "+SplitPackage[i]);
//					if (i== SplitPackage.length-1) {
//						System.out.println("Verification");
//						clickWebdriver(attributeName_linktext, SplitPackage[i]);
//						waitForPageToLoadWebdriver();
//					}else{
//						PackageSelectionFieldDefinition(SplitPackage[i], "1");
//					}
//				}
				waitForElementPresentWebdriverWait(attributeName_xpath, "//b[font[text()='"+SplitPackage[0]+"']]/preceding-sibling::a[img[contains(@src,'plus')]][1]", SplitPackage[0]);
				clickWebdriver(attributeName_xpath, "//b[font[text()='"+SplitPackage[0]+"']]/preceding-sibling::a[img[contains(@src,'plus')]][1]");
				for (int i = 1; i < SplitPackage.length; i++) {
					writeConsole("Tree Package : "+SplitPackage[i]);
					if(i==1){
						Reporter.log("Proceed to Click on Plus Buton With its respective Package Name");   //b[a[font[text()='Applicant Detail']]]
						//selenium.waitForCondition("selenium.isElementPresent(\"xpath=(//b[a[font[text()='"+SplitPackage[i]+"']]]/preceding-sibling::a[img[contains(@src,'plus')]][1])\")", "60000");
						waitForElementPresentWebdriverWait(attributeName_xpath,"//b[a[font[text()='"+SplitPackage[i]+"']]]/preceding-sibling::a[img[contains(@src,'plus')]][1]","value");
						// /String seconclickName = selenium.getAttribute("xpath=(//b[a[font[text()='"+SplitPackage[i]+"']]]/preceding-sibling::a[img[contains(@src,'plus')]][1])/@onclick");
						WebElement SeconclickName = driver.findElement(By.xpath("//font[text()='"+SplitPackage[i]+"']/../../preceding-sibling::a[@onclick][1]"));
						String seconclickName = SeconclickName.getAttribute("onclick");
						writeConsole("Onclick Value for Section "+seconclickName);
						String[] secNamespl =seconclickName.split("\\(");
						String[] secnodespl = secNamespl[1].split("\\)");
						String secnode = secnodespl[0];
						writeConsole("Node Value for Section "+secnode);
						//String nodePlus = selenium.getAttribute("//a[contains(@onclick,'toggle("+secnode+")')]/@onmouseover");
						WebElement NodePlus = driver.findElement(By.xpath("//a[contains(@onclick,'toggle("+secnode+")')]"));
						String nodePlus = NodePlus.getAttribute("onmouseover");
						writeConsole("Plus OuterHTML Value "+nodePlus);
						if (nodePlus.contains("Click to expand")) {
						clickWebdriver(attributeName_xpath, "//a[contains(@onclick,'toggle("+secnode+")')]");
						}
					}
					else if (i== SplitPackage.length-1) {
						System.out.println("Verification");
						clickWebdriver(attributeName_linktext, SplitPackage[i]);
						switchToDefaultContentWebdriver();
						
						switchToFrameNameIdWebdriver("frameActions");
						clickWebdriver(attributeName_xpath, FD_AddItem);
						switchToDefaultContentWebdriver();
						
						//waitForPageToLoadWebdriver();
					}else{
						PackageSelectionFieldDefinition(SplitPackage[i], "1");
					}
				}

				switchToFrameNameIdWebdriver("frameQuestionsTree");
				ClosePackageSelection();

			}
			switchToDefaultContentWebdriver();
			switchToFrameNameIdWebdriver("frameIntfFieldDef");
			if (!fieldname.equals("")) {
				Reporter.log("Select the field Name as ["+fieldname+"]");
				String[] FieldName = fieldname.split(";");
				if (fieldname.contains("Check")) {
					checkWebdriver(attributeName_xpath, "//font[text()='"+FieldName[0]+"']/preceding-sibling::input[@type='checkbox']");
				}else if (fieldname.contains("Uncheck")) {
					checkWebdriver(attributeName_xpath, "//font[text()='"+FieldName[0]+"']/preceding-sibling::input[@type='checkbox']");
				}
			}
			switchToDefaultContentWebdriver();
			switchToFrameNameIdWebdriver("frameActions");
			if (!itemaction.equals("")) {
				
				Reporter.log("Click the item action as ["+itemaction+"]");
				if (itemaction.equalsIgnoreCase("Add Item")) {
					waitForElementPresentWebdriver(attributeName_xpath, FD_AddItem, itemaction);
					clickWebdriverWithCoordinates(attributeName_xpath, FD_AddItem);
					switchToDefaultContentWebdriver();
				}else if (itemaction.equalsIgnoreCase("Insert Item")) {
					clickWebdriver(attributeName_name, FD_InsertItem);

				}else if (itemaction.equalsIgnoreCase("Remove Item")) {
					clickWebdriver(attributeName_name, FD_RemoveItem);

				}
				
			}
			if (!fieldnameposition.equals("")) {
				Reporter.log("Click the field name position as ["+fieldnameposition+"]");
				if (fieldnameposition.equalsIgnoreCase("Move Down")) {
					clickWebdriver(attributeName_name, FD_MoveDown);
				}else if (fieldnameposition.equalsIgnoreCase("Move Up")) {
					clickWebdriver(attributeName_name, FD_MoveUp);
				}else if (fieldnameposition.equalsIgnoreCase("Remove All")) {
					clickWebdriver(attributeName_xpath, AIT_RemoveAll);
					Thread.sleep(5000);
				}else if (fieldnameposition.equalsIgnoreCase("Show Code")) {
					clickWebdriver(attributeName_name, FD_ShowCode);
				}
			}
			switchToDefaultContentWebdriver();
			if (!fieldnamelabel.equals("")) {
	
			}
			
			if (!saveback.equals("")) {
				Reporter.log("Click the button as ["+saveback+"]");
				if (saveback.equalsIgnoreCase("Save")) {
					clickWebdriver(attributeName_name, FD_SaveBtn);
					Thread.sleep(5000);
					waitForPageToLoadWebdriver();
				}else if (saveback.equalsIgnoreCase("Back")) {
					clickWebdriver(attributeName_name, FD_BackBtn);
					waitForPageToLoadWebdriver();
				}
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}
