package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_ConfigureDynamicText_Input extends CommonSeleniumActions implements OR {

	@Test(description="This Procedure is used to perform some operation in 'Configure Dynamic Text' page")
	public void WC_ConfigureDynamicText_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Configure Dynamic Text' Page");
			String[] testdata = datacontainer;
			String displayformattype = testdata[0];
			String dynamictext = testdata[1];
			String button = testdata[2];
			Reporter.log("Input Test Data was retrieved for 'Configure Dynamic Text' Page");
			waitForElementPresentWebdriver(attributeName_name, CDT_HtmlEditorBtn, "HTML Edit Button");
			if (!displayformattype.equals("")) {
				Reporter.log("Step 1 - Select formate type as ["+displayformattype+"]");
				if (displayformattype.equalsIgnoreCase("Text")) {
					clickWebdriver(attributeName_id, CDT_TextRadio);
				}else if (displayformattype.equalsIgnoreCase("HTML")) {
					clickWebdriver(attributeName_id, CDT_HtmlRadio);
				}
			}	
			if (!dynamictext.equals("")) {
				Reporter.log("Step 2 - Enter the Dynamic Text as ["+dynamictext+"]");
				sendKeys(attributeName_name, CDT_TextArea, dynamictext);
			}
			if (!button.equals("")) {
				Reporter.log("Step 3 - Click the button as ["+button+"]");
				if (button.equalsIgnoreCase("Back")) {
					clickWebdriver(attributeName_xpath, ASR_BackBtn);
					waitForPageToLoadWebdriver();
				}else if (button.equalsIgnoreCase("Edit with HTML Editor")) {
					clickWebdriver(attributeName_name, CDT_HtmlEditorBtn);
					recentPopupSelectWebdriver("HTML Editor");
				}else if (button.equalsIgnoreCase("Save")) {
					clickWebdriver(attributeName_xpath, AS_SaveBtn);
//					waitForPageToLoadWebdriver();
				}else if (button.equalsIgnoreCase("Undo")) {
					clickWebdriver(attributeName_xpath, CDT_UndoBtn);
				}else if (button.equalsIgnoreCase("Preview")) {
					clickWebdriver(attributeName_xpath, CDT_PreviewBtn);
					recentPopupSelectWebdriver("Dynamic Text/Instruction Preview");
					
				}
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}

	}

}


