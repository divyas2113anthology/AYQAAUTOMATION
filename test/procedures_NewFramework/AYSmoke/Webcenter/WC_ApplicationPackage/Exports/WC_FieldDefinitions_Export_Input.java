package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.Exports;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
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
//						waitForPageToLoad();
//					}else{
//						PackageSelectionFieldDefinition(SplitPackage[i], "1");
//					}
//				}
				
				for (int i = 0; i < SplitPackage.length; i++) {
					writeConsole("Tree Package : "+SplitPackage[i]);
					if(i==0){
						Reporter.log("Proceed to Click on Plus Buton With its respective Package Name");   //b[a[font[text()='Applicant Detail']]]
						selenium.waitForCondition("selenium.isElementPresent(\"xpath=(//b[font[text()='"+SplitPackage[i]+"']]/preceding-sibling::a[img[contains(@src,'plus')]][1])\")", "60000");
						String seconclickName = selenium.getAttribute("xpath=(//b[font[text()='"+SplitPackage[i]+"']]/preceding-sibling::a[img[contains(@src,'plus')]][1])/@onclick");
						writeConsole("Onclick Value for Section "+seconclickName);
						String[] secNamespl =seconclickName.split("\\(");
						String[] secnodespl = secNamespl[1].split("\\)");
						String secnode = secnodespl[0];
						writeConsole("Node Value for Section "+secnode);
						String nodePlus = selenium.getAttribute("//a[contains(@onclick,'toggle("+secnode+")')]/@onmouseover");
						writeConsole("Plus OuterHTML Value "+nodePlus);
						if (nodePlus.contains("Click to expand")) {
						clickWebdriver(attributeName_xpath, "//a[contains(@onclick,'toggle("+secnode+")')]");
						}
					}
					else if (i== SplitPackage.length-1) {
						System.out.println("Verification");
						clickWebdriver(attributeName_linktext, SplitPackage[i]);
						wait(3000);
						
						switchToFrameNameIdWebdriver("frameActions");
						clickWebdriver(attributeName_xpath, FD_AddItem);
						switchToDefaultContentWebdriver();
						
						//waitForPageToLoad();
					}else{
						PackageSelectionFieldDefinition(SplitPackage[i], "1");
					}
				}
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
					clickWebdriver(attributeName_xpath, FD_AddItem);
				}else if (itemaction.equalsIgnoreCase("Insert Item")) {
					clickWebdriver(attributeName_name, FD_InsertItem);
				}else if (itemaction.equalsIgnoreCase("Remove Item")) {
					clickWebdriver(attributeName_name, FD_RemoveItem);
				}
				
			}
			if (!fieldnameposition.equals("")) {
				Reporter.log("Click the field name position as ["+fieldnameposition+"]");
				if (itemaction.equalsIgnoreCase("Move Down")) {
					clickWebdriver(attributeName_name, FD_MoveDown);
				}else if (itemaction.equalsIgnoreCase("Move Up")) {
					clickWebdriver(attributeName_name, FD_MoveUp);
				}else if (itemaction.equalsIgnoreCase("Remove All")) {
					clickWebdriver(attributeName_name, FD_RemoveAll);
				}else if (itemaction.equalsIgnoreCase("Show Code")) {
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
