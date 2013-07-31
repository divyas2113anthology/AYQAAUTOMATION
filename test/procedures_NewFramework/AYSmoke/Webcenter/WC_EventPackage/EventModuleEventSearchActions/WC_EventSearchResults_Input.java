package procedures_NewFramework.AYSmoke.Webcenter.WC_EventPackage.EventModuleEventSearchActions;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_EventSearchResults_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'Event search results' page")
	public void WC_EventSearchResults_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Event search results' Page");
			String[] testdata = datacontainer;
			String performOperation = testdata[0];
			String eventtitlecheck = testdata[1];
			String eventtitleclick = testdata[2];
			String selectanaction = testdata[3];
			String apply = testdata[4];
			String searchbackgo = testdata[5];
			Reporter.log("Input Test Data was retrieved for 'Event search results' Page");
//			writeFailure("Given Test Data["+yesno+"] either Incorrect or has not be Scripted ");
			if (!performOperation.equals("") && !eventtitlecheck.equals("")) {
				Reporter.log("Step 1 - Perform the operation to check the checkbox as ["+eventtitlecheck+"]");
				String [] splitevent = eventtitlecheck.split(";");
				for (int i = 0; i < splitevent.length; i++) {
					if (performOperation.equalsIgnoreCase("check")) {
						checkWebdriverCheckbox(attributeName_xpath, "//td[a[text()='"+splitevent[i]+ASR_CheckBox);
					}else if (performOperation.equalsIgnoreCase("uncheck")) {
						uncheckWebdriverCheckbox(attributeName_xpath, "//td[a[text()='"+splitevent[i]+ASR_CheckBox);
					}
				}
			}			
			if (!eventtitleclick.equals("")) {
				Reporter.log("Step 2 - Click the Name of the Record as ["+eventtitleclick+"]");
				if (eventtitleclick.equals("Event Title")) {
					String Eventtitleclick = Runtimedataread(eventtitleclick);
					clickWebdriver(attributeName_partiallinktext, Eventtitleclick);
					recentPopupSelectWebdriver("EventRecurrence");
				}else{
				clickWebdriver(attributeName_partiallinktext, eventtitleclick);
				recentPopupSelectWebdriver("EventRecurrence");
				}
			}
			if (!selectanaction.equals("")) {
				Reporter.log("Step 4 - Select an action as ["+selectanaction+"]");
				selectByValueWebdriver(attributeName_xpath, EVR_SelectAnAction, selectanaction);
			}			
			if (!apply.equals("")) {
				Reporter.log("Step 5 - Select the Radio button as ["+apply+"]");
				if (apply.equalsIgnoreCase("Apply to Selected")) {
					clickWebdriver(attributeName_xpath, ASR_ApplySelected);
				}else if (apply.equalsIgnoreCase("Apply to All")) {
					clickWebdriver(attributeName_xpath, ASR_ApplyAll);
				}
			}
			if (!searchbackgo.equals("")) {
				Reporter.log("Step 7 - Click button as ["+searchbackgo+"]");
				if (searchbackgo.equalsIgnoreCase("New Search")) {
					clickWebdriver(attributeName_xpath, ASR_NewSearchbtn);
				}else if (searchbackgo.equalsIgnoreCase("Back")) {
					clickWebdriver(attributeName_xpath, ASR_BackBtn);
				}else if (searchbackgo.equalsIgnoreCase("Go")) {
					clickWebdriver(attributeName_xpath, ASR_GoBtn);
				}
			}			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}


