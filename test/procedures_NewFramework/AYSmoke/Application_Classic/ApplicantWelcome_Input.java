package procedures_NewFramework.AYSmoke.Application_Classic;

import or.OR;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

public class ApplicantWelcome_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some Operation in 'Applicant Welcome' page")
	public void ApplicantWelcome_Input() throws Exception{
		try {
			writeDetails();
//			headerStatement("ApplicantWelcome_Input");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Input Test Data for 'Applicant Welcome' page");
			String[]  applicantwelidatarepo = datacontainer;
			String logout = applicantwelidatarepo[0];
			String updatetechsupport = applicantwelidatarepo[1];
			String applicantsection = applicantwelidatarepo[2];
			String helpfulhints = applicantwelidatarepo[3];
			String print = applicantwelidatarepo[4];
			String applicationhome = applicantwelidatarepo[5];
			String resend = applicantwelidatarepo[6];

			Reporter.log("Input Test Data was retrieved for 'Applicant Welcome' page");

			if (!logout.equals("")) {
				Reporter.log("Step 1 - Proceed to Click on ("+logout+") Link");
				if(logout.equalsIgnoreCase("Dashboard")){
					clickWebdriver(attributeName_xpath,"//li/i[@class='icon-home icon-white']");
					waitForPageToLoadWebdriver();
				}else {
					clickWebdriver(attributeName_xpath, Logoutmain + logout + "']");
					waitForPageToLoadWebdriver();
				}
			}
			if (!updatetechsupport.equals("")) {
				Reporter.log("Step 2 - Proceed to Click on ("+updatetechsupport+") Button");
				if (updatetechsupport.equalsIgnoreCase("Home")) {
					waitForElementPresentWebdriver(attributeName_xpath,AW_Home, updatetechsupport);
					clickWebdriver(attributeName_xpath, AW_Home);
					waitForPageToLoadWebdriver();
				}else if (updatetechsupport.equalsIgnoreCase("Technical Support")) {
					waitForElementPresentWebdriver(attributeName_xpath, AW_TecSupp, updatetechsupport);
					clickWebdriver(attributeName_xpath, AW_TecSupp);
					//recentPopupSelectWebdriver("Technical Support");
					//alertAccept();
				}else if (updatetechsupport.equalsIgnoreCase("Update your Profile")) {
//					sendKeyStroke(attributeName_xpath, UpdateProfileBtn, Keys.SPACE);
//					sendKeyStroke(attributeName_xpath, "xpath=(//img[@alt='Update your Profile' and contains(@src,'update_profile_o.gif')])[1]", Keys.SPACE);
					waitForElementPresentWebdriver(attributeName_xpath, AW_Profile, updatetechsupport);
					clickWebdriver(attributeName_xpath, AW_Profile);
					//recentPopupSelectWebdriver("Update Profile");
					waitForPageToLoadWebdriver();
				}else if (updatetechsupport.equalsIgnoreCase("Submit")) {
					waitForElementPresentWebdriver(attributeName_xpath, AW_Submit, updatetechsupport);
					clickWebdriver(attributeName_xpath,AW_Submit);
					waitForPageToLoadWebdriver();
				}
			}
			if (!applicantsection.equals("")) {
				Reporter.log("Step 3 - Proceed to Click on Applicant Section ("+applicantsection+") Link");
				waitForPageToLoadWebdriver();
				switchToDefaultContentWebdriver();
				waitForElementPresentWebdriverWait(attributeName_xpath, Section+applicantsection+"')]", applicantsection);
				clickWebdriver(attributeName_xpath, Section+applicantsection+"')]");
				//click(Section+applicantsection+"')]");
				waitForPageToLoadWebdriver();
			}
			if (!helpfulhints.equals("")) {
				Reporter.log("Step 4 - Proceed to Click on ("+helpfulhints+") in the 'Helpful Hints' Section");
				clickWebdriver(attributeName_xpath,"//li[contains(@id,'helpfulHints')]/a");
				Thread.sleep(5000);
				clickWebdriver(attributeName_xpath,"//li/a[contains(text(),'"+helpfulhints+"')]");
				Thread.sleep(5000);
				//driver.findElement(By.xpath("//div[@class='modal-header']/h3")).getText();
			}
			if (!print.equals("")) {
				Reporter.log("Step 5 - Proceed to Click on ("+print+") Button");
				if (print.equalsIgnoreCase("print")) {
					clickWebdriver(attributeName_xpath,PrintBtn+print+"']");
					recentPopupSelect("Print");
				}			
			}
			if (!applicationhome.equals("")) {
				Reporter.log("Step 6 - Proceed to Click on ("+applicationhome+") Link");
				if (applicationhome.equalsIgnoreCase("Application Home")) {
					clickWebdriver(attributeName_xpath,updatelink+applicationhome+"']");
					waitForPageToLoadWebdriver();
				}else if (applicationhome.equalsIgnoreCase("Technical Support")) {
					clickWebdriver(attributeName_xpath,updatelink+applicationhome+"']");
					recentPopupSelect("Technical Support");
				}else if (applicationhome.equalsIgnoreCase("Update Profile")) {
					clickWebdriver(attributeName_xpath,updatelink+applicationhome+"']");
					recentPopupSelect("Update Profile");
				}else if (applicationhome.equalsIgnoreCase("Logout")) {
					clickWebdriver(attributeName_xpath,updatelink+applicationhome+"']");
					waitForPageToLoadWebdriver();
				}
			}
			if (!resend.equals("")) {
				Reporter.log("Step 6 - Proceed to Click on ("+logout+") Link");
				clickWebdriver(attributeName_xpath, RC_Resend);
				waitForPageToLoadWebdriver();
				try{
					alertAccept();
				}catch(Exception e){
					System.out.println("No Alert");
				}
			}
		
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

}
