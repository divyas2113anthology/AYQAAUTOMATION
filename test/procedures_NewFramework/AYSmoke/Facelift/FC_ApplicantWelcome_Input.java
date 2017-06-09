package procedures_NewFramework.AYSmoke.Facelift;

import or.OR;
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
				if (link_to_click.equalsIgnoreCase("Logout")) {
					clickWebdriver(attributeName_xpath,"//a/li[text()='Log Out']");
					waitForPageToLoadWebdriver();

				}
				if (link_to_click.equalsIgnoreCase("Personal Data")) {
					clickWebdriver(attributeName_xpath,AW_personalDataLnk);
					waitForPageToLoadWebdriver();
					//					waitForConditionisElementPresent(PSD_PageName1, "90000");
				}else if (link_to_click.equalsIgnoreCase("Family")) {
					clickWebdriver(attributeName_xpath,AW_FamilyBtn);
//					waitForConditionisElementPresent(PSD_PageName1, "90000");
				}else if (link_to_click.equalsIgnoreCase("Automation Section")) {
					clickWebdriver(attributeName_xpath, AW_AutomationSectionLnk);
					waitForPageToLoadWebdriver();
				}else if (link_to_click.equalsIgnoreCase("Business Rules")) {
					clickWebdriver(attributeName_xpath,AW_BussRulesBtn);
					waitForPageToLoadWebdriver();
				}else if (link_to_click.equalsIgnoreCase("Payment Processing")) {
					clickWebdriver(attributeName_xpath,AW_PaymentProBtn);
				}else if (link_to_click.equalsIgnoreCase("Personal Information")) {
					clickWebdriver(attributeName_xpath,AW_PerInfoBtn);
					waitForPageToLoadWebdriver();
				}else if (link_to_click.equalsIgnoreCase("Essay and Attachment")) {
//					waitForConditionisElementPresent(AW_EssayAttBtn, "5000");
					clickWebdriver(attributeName_xpath,AW_EssayAttBtn);
					waitForPageToLoadWebdriver();
//					waitForElement(PSD_PageName1, "Essay And Attachment Page");
//					waitForConditionisElementPresent(PSD_PageName1, "5000");
				}else if (link_to_click.equalsIgnoreCase("Education Background")) {
					clickWebdriver(attributeName_xpath,AW_EduBackBtn);
					waitForPageToLoadWebdriver();
				}else if (link_to_click.equalsIgnoreCase("Recommendations-DT")) {
//					sendKeyStroke(attributeName_xpath, AW_RecommendationBtn, Keys.SPACE);
//					sendKeys(attributeName_xpath, AW_RecommendationBtn, " ");
//					clickWebdriver(attributeName_xpath, AW_RecommendationBtn);
					clickWebdriverWithCoordinates(attributeName_xpath, AW_RecommendationBtn);
					waitForPageToLoadWebdriver();
				}else if (link_to_click.equalsIgnoreCase("Downloadable Forms")) {
					clickWebdriver(attributeName_xpath,AW_DownFormBtn);

				}else if (link_to_click.equalsIgnoreCase("Check Your Application")) {
					clickWebdriver(attributeName_xpath,AW_CheckAppBtn);
				}else if (link_to_click.equalsIgnoreCase("Application Instructions")) {
					clickWebdriver(attributeName_xpath,AW_AppInstructionBtn);
				}
				else if (link_to_click.equalsIgnoreCase("RegularSection")) {
					clickWebdriver(attributeName_xpath,AW_AppRegularSection);
				}
				else if (link_to_click.equalsIgnoreCase("dynamicsection"))
				{
					clickWebdriver(attributeName_xpath,AW_SectionClickByDynamicFont+link_to_click+"']");
				}
			}
			if (!conformation.equals("")) {
				Reporter.log("Step 2 - Proceed to Click on Conformation ("+conformation+")");
				if (conformation.equalsIgnoreCase("Check")) {
//					check(AW_ConformationCheck);
					clickWebdriver(attributeName_cssselector, AW_ConformationCheck);
				} else if (conformation.equalsIgnoreCase("Uncheck")) {
					uncheckWebdriver(attributeName_cssselector,AW_ConformationCheck);
				}
			}
			if (!reviewappfee.equals("")) {
				Reporter.log("Step 3 - Proceed to Click on Review Application Fee ("+reviewappfee+")");
				if (reviewappfee.equalsIgnoreCase("Domestic")) {
					clickWebdriver(attributeName_xpath,AW_DomesticRadio);
				}else if (reviewappfee.equalsIgnoreCase("International")) {
					clickWebdriver(attributeName_xpath,AW_InternationalRadio);
				}
			}
			if (!selectpaymethod.equals("")) {
				Reporter.log("Step 4 - Proceed to Click on Select Method ("+selectpaymethod+")");
					if (selectpaymethod.equalsIgnoreCase("Check")) {
						clickWebdriver(attributeName_xpath,AW_CheckRadio);
					}else if (selectpaymethod.equalsIgnoreCase("Fee Waiver")) {
						clickWebdriver(attributeName_xpath,AW_FeeWaiverRadio);
					}else if (selectpaymethod.equalsIgnoreCase("Credit Card")) {
						clickWebdriver(attributeName_xpath,AW_CreditCardRadio);
					}
			}

			if (!button_to_click.equals("")) {
				Reporter.log("Step 5 - Proceed to Click on ("+button_to_click+") Button");
					if (button_to_click.equalsIgnoreCase("Start Application")) {
						clickWebdriver(attributeName_cssselector,AW_StartAppBtn);
					}else if (button_to_click.equalsIgnoreCase("Messages")) {
						clickWebdriver(attributeName_xpath,AW_AppInstBtn);
					}else if (button_to_click.equalsIgnoreCase("Profile")) {
						clickWebdriver(attributeName_xpath,AW_SubAppBtn);
					}else if (button_to_click.equalsIgnoreCase("Continue")) {
						clickWebdriver(attributeName_cssselector,AW_ContinueBtn);
						waitForPageToLoadWebdriver();
					}else if (button_to_click.equalsIgnoreCase("Pay and Continue")) {
//						clickchooseokgetconfirmationpagepload(AW_PayContinueBtn);
						clickWebdriver(attributeName_xpath, AW_PayContinueBtn);
					    alertAccept();
						waitForPageToLoadWebdriver();
						waitForPageToLoadWebdriver();

					}else if (button_to_click.equalsIgnoreCase("Preview Application in PDF Format")) {
						waitForElementPresentWebdriver(attributeName_xpath,AW_PrintPreviewBtn, "Pdf Button");
						clickWebdriver(attributeName_xpath,AW_PrintPreviewBtn);
//						SelectPrintWindow("PrintApplication");
						recentPopupSelectWebdriver("Print Pdf");
//						waitForUniqueNameWindow();
					}
					else if (button_to_click.equalsIgnoreCase("Preview Application")) {
						waitForElementPresentWebdriver(attributeName_xpath,AW_PrintPreviewPdfBtn, "Pdf Button");
						clickWebdriver(attributeName_xpath,AW_PrintPreviewPdfBtn);
//						SelectPrintWindow("PrintApplication");
						recentPopupSelectWebdriver("Print Pdf");
//						waitForUniqueNameWindow();
					}
				}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

}
