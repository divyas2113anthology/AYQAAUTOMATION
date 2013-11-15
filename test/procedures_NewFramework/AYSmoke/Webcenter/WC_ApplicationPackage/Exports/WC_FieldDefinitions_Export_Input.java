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
				String [] SplitPackage = fieldquestion.split(";");
				for (int i = 0; i < SplitPackage.length; i++) {
					writeConsole("Tree Package : "+SplitPackage[i]);
					if (i== SplitPackage.length-1) {
						clickWebdriver(attributeName_linktext, SplitPackage[i]);
						waitForPageToLoad();
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
				String[] FieldName = fieldname.split("_");
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
					clickWebdriver(attributeName_name, FD_AddItem);
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
			if (!fieldnamelabel.equals("")) {
	
			}
			switchToDefaultContentWebdriver();
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
