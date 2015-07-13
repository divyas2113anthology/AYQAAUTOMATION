package procedures_NewFramework.AYSmoke.Webcenter;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_PrintApplications_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'Print Application' page")
	public void WC_PrintApplications_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Print Application' Page");
			String[] testdata = datacontainer;
			String actionhistory = testdata[0];
			String description = testdata[1];
			String printeddate = testdata[2];
			String duplexprinting = testdata[3];
			String executepdfrule = testdata[4];
			String excludeuploaddocument = testdata[5];
			String includesubmittedrecommendations = testdata[6];
			String button = testdata[7];
			Reporter.log("Input Test Data was retrieved for 'Print Application' Page");
//			writeFailure("Given Test Data["+yesno+"] either Incorrect or has not be Scripted ");
			if (!actionhistory.equals("")) {
				Reporter.log("Step 1 - Perform the operation to check the checkbox as ["+actionhistory+"]");
				if (actionhistory.equalsIgnoreCase("Check")) {
					checkWebdriverCheckbox(attributeName_xpath, PA_ActionHistory);
				}else if (actionhistory.equalsIgnoreCase("UnCheck")) {
					checkWebdriverCheckbox(attributeName_xpath, PA_ActionHistory);
				}
			}
			if (!description.equals("")) {
				Reporter.log("Step 2 - Enter the description as ["+description+"]");
				sendKeys(attributeName_cssselector, PA_Description, description);
			}
			if (!printeddate.equals("")) {
				Reporter.log("Step 3 - Perform the operation to check the checkbox as ["+printeddate+"]");
				if (printeddate.equalsIgnoreCase("Check")) {
					checkWebdriverCheckbox(attributeName_xpath, PA_PrintDate);
				}else if (printeddate.equalsIgnoreCase("UnCheck")) {
					checkWebdriverCheckbox(attributeName_xpath, PA_PrintDate);
				}
			}
			if (!duplexprinting.equals("")) {
				Reporter.log("Step 4 - Perform the operation to check the checkbox as ["+duplexprinting+"]");
				if (duplexprinting.equalsIgnoreCase("Check")) {
					checkWebdriverCheckbox(attributeName_xpath, PA_DuplexPrinting);
				}else if (duplexprinting.equalsIgnoreCase("UnCheck")) {
					checkWebdriverCheckbox(attributeName_xpath, PA_DuplexPrinting);
				}
			}
			if (!executepdfrule.equals("")) {
				Reporter.log("Step 5 - Perform the operation to check the checkbox as ["+executepdfrule+"]");
				if (executepdfrule.equalsIgnoreCase("Check")) {
					checkWebdriverCheckbox(attributeName_xpath, PA_ExecutePDFRules);
				}else if (executepdfrule.equalsIgnoreCase("UnCheck")) {
					checkWebdriverCheckbox(attributeName_xpath, PA_ExecutePDFRules);
				}
			}
			if (!excludeuploaddocument.equals("")) {
				Reporter.log("Step 6 - Perform the operation to check the checkbox as ["+excludeuploaddocument+"]");
				if (excludeuploaddocument.equalsIgnoreCase("Check")) {
					checkWebdriverCheckbox(attributeName_xpath, PA_UncheckExclude);
				}else if (excludeuploaddocument.equalsIgnoreCase("UnCheck")) {
					checkWebdriverCheckbox(attributeName_xpath, PA_UncheckExclude);
				}
			}
			if (!includesubmittedrecommendations.equals("")) {
				Reporter.log("Step 7 - Perform the operation to check the checkbox as ["+includesubmittedrecommendations+"]");
				if (includesubmittedrecommendations.equalsIgnoreCase("Check")) {
					waitForElementPresentWebdriver(attributeName_xpath, PA_IncludeRecomendation, includesubmittedrecommendations);
					checkWebdriverCheckbox(attributeName_xpath, PA_IncludeRecomendation);
				}else if (includesubmittedrecommendations.equalsIgnoreCase("UnCheck")) {
					checkWebdriverCheckbox(attributeName_xpath, PA_IncludeRecomendation);
				}
			}
			if (!button.equals("")) {
				Reporter.log("Step 8 - Click the button as ["+button+"]");
				if (button.equalsIgnoreCase("Print")) {
					clickWebdriver(attributeName_xpath, PA_PrintBtn);
					recentPopupCloseWebdriver();
					waitForElementPresentWebdriver(attributeName_xpath, QAE_Message, "Successfully Genearated PDFs.");
//					waitForElementNotPresentWebdriver(attributeName_xpath, QAE_Message, "Successfully printed applications.");
//					recentPopupSelect("Application.pdf");
//					recentPopupSelectWebdriver("PrintingApplication");
				}else if (button.equalsIgnoreCase("Generate PDF")) {
					clickWebdriver(attributeName_xpath, PA_PrintBtn);
					waitForPageToLoad();
				}else if (button.equalsIgnoreCase("Back")) {
					clickWebdriver(attributeName_xpath, PA_BackBtn);
				}
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}


