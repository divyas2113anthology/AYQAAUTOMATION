package procedures_NewFramework.AYSmoke.Facelift;

import or.OR;

import org.openqa.selenium.Keys;
import org.openqa.selenium.internal.seleniumemulation.Uncheck;
import org.testng.Reporter;
import org.testng.annotations.Test;


import processor.CommonSeleniumActions;


public class FC_ApplicantWelcome_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some Operation in 'Applicant Welcome' page")
	public void FC_ApplicantWelcome_Input () throws Exception{
		try {
			writeDetails();
//			headerStatement("ApplicantWelcome_Input");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Input Test Data for 'Applicant Welcome' page");
			String[]  applicantwelidatarepo = datacontainer;
			String link_to_click = applicantwelidatarepo[0];
			String conformation = applicantwelidatarepo[1];
			String reviewappfee = applicantwelidatarepo[2];
			String selectpaymethod = applicantwelidatarepo[3];
			String button_to_click = applicantwelidatarepo[4];
			Reporter.log("Input Test Data was retrieved for 'Applicant Welcome' page");
	//		selectMainWindow();
			if (!link_to_click.equals("")) {
				Reporter.log("Step 1 - Proceed to Click on ("+link_to_click+") Link");
				if (link_to_click.equalsIgnoreCase("Personal Data")) {
					click(AW_personalDataLnk);
					waitForPageToLoad();
//					waitForConditionisElementPresent(PSD_PageName1, "90000");
				}else if (link_to_click.equalsIgnoreCase("Family")) {
					click(AW_FamilyBtn);
//					waitForConditionisElementPresent(PSD_PageName1, "90000");
				}else if (link_to_click.equalsIgnoreCase("Business Rules")) {
					click(AW_BussRulesBtn);
					waitForPageToLoad();
				}else if (link_to_click.equalsIgnoreCase("Payment Processing")) {
					click(AW_PaymentProBtn);
				}else if (link_to_click.equalsIgnoreCase("Personal Information")) {
					click(AW_PerInfoBtn);
					waitForPageToLoad();
				}else if (link_to_click.equalsIgnoreCase("Essay and Attachment")) {
//					waitForConditionisElementPresent(AW_EssayAttBtn, "5000");
					click(AW_EssayAttBtn);
					waitForPageToLoad();
//					waitForElement(PSD_PageName1, "Essay And Attachment Page");
//					waitForConditionisElementPresent(PSD_PageName1, "5000");
				}else if (link_to_click.equalsIgnoreCase("Education Background")) {
					click(AW_EduBackBtn);
					waitForPageToLoad();
				}else if (link_to_click.equalsIgnoreCase("Recommendations")) {
//					sendKeyStroke(attributeName_xpath, AW_RecommendationBtn, Keys.SPACE);
//					sendKeys(attributeName_xpath, AW_RecommendationBtn, " ");
//					clickWebdriver(attributeName_xpath, AW_RecommendationBtn);
					clickWebdriverWithCoordinates(attributeName_xpath, AW_RecommendationBtn);
					waitForPageToLoad();
				}else if (link_to_click.equalsIgnoreCase("Downloadable Forms")) {
					click(AW_DownFormBtn);
				}else if (link_to_click.equalsIgnoreCase("Check Your Application")) {
					click(AW_CheckAppBtn);
				}else if (link_to_click.equalsIgnoreCase("Application Instructions")) {
					click(AW_AppInstructionBtn);
				}
			}
			if (!conformation.equals("")) {
				Reporter.log("Step 2 - Proceed to Click on Conformation ("+conformation+")");
				if (conformation.equalsIgnoreCase("Check")) {
//					check(AW_ConformationCheck);
					clickWebdriver(attributeName_cssselector, AW_ConformationCheck);
				} else if (conformation.equalsIgnoreCase("Uncheck")) {
					uncheck(AW_ConformationCheck);
				}
			}
			if (!reviewappfee.equals("")) {
				Reporter.log("Step 3 - Proceed to Click on Review Application Fee ("+reviewappfee+")");
				if (reviewappfee.equalsIgnoreCase("Domestic")) {
					click(AW_DomesticRadio);
				}else if (reviewappfee.equalsIgnoreCase("International")) {
					click(AW_InternationalRadio);
				}
			}
			if (!selectpaymethod.equals("")) {
				Reporter.log("Step 4 - Proceed to Click on Select Method ("+selectpaymethod+")");
				if (selectpaymethod.equalsIgnoreCase("Check")) {
					click(AW_CheckRadio);
				}else if (selectpaymethod.equalsIgnoreCase("Fee Waiver")) {
					click(AW_FeeWaiverRadio);
				}else if (selectpaymethod.equalsIgnoreCase("Credit Card")) {
					click(AW_CreditCardRadio);
				}
			}

			if (!button_to_click.equals("")) {
				Reporter.log("Step 5 - Proceed to Click on ("+button_to_click+") Button");
				if (button_to_click.equalsIgnoreCase("Start Application")) {
					click(AW_StartAppBtn);
				}else if (button_to_click.equalsIgnoreCase("Messages")) {
					click(AW_AppInstBtn);
				}else if (button_to_click.equalsIgnoreCase("Profile")) {
					click(AW_SubAppBtn);
				}else if (button_to_click.equalsIgnoreCase("Continue")) {
					click(AW_ContinueBtn);
					waitForPageToLoad();
				}else if (button_to_click.equalsIgnoreCase("Pay and Continue")) {
//					clickchooseokgetconfirmationpagepload(AW_PayContinueBtn);
					clickWebdriver(attributeName_xpath, AW_PayContinueBtn);
//					alertAccept();
					waitForPageToLoad();
				}else if (button_to_click.equalsIgnoreCase("Preview Application in PDF Format")) {
					waitForElementPresent(AW_PrintPreviewBtn, "Pdf Button");
					clickWebdriver(attributeName_xpath,AW_PrintPreviewBtn);
//					SelectPrintWindow("PrintApplication");
					recentPopupSelectWebdriver("Print Pdf");
//					waitForUniqueNameWindow();
				}
				else if (button_to_click.equalsIgnoreCase("Preview Application")) {
					waitForElementPresent(AW_PrintPreviewPdfBtn, "Pdf Button");
					clickWebdriver(attributeName_xpath,AW_PrintPreviewPdfBtn);
//					SelectPrintWindow("PrintApplication");
					recentPopupSelectWebdriver("Print Pdf");
//					waitForUniqueNameWindow();
				}
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

}
