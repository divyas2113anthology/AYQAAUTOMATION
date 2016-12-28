package procedures_NewFramework.AYSmoke.StudentFacingProcedures.Application;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class Mainpage_Input extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Operation in 'Applicant Main' page")
	public void Mainpage_Input() throws Exception{
		try {
			writeDetails();
//			headerStatement("Mainpage_Input");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Input Test Data for 'Applicant Main' page");
			String[]  mainidatarepo = datacontainer;
			String packagename = mainidatarepo[0];
			String eventpackagename = mainidatarepo[1];	
			String enrollment = mainidatarepo[2];
			String link_to_click = mainidatarepo[3];
			Reporter.log("Input Test Data was retrieved for 'Applicant Main' page");
			if (!packagename.equals("")) {
				Reporter.log("Click on ("+packagename+") Package");
				writeConsole("I am in package level");
//				waitForElementPresent(Applpackage+packagename+"']", packagename);
				if(isDisplayedWebdriver(attributeName_xpath,"//div/h3[contains(text(),'"+packagename+"')]/../a")){
					clickWebdriver(attributeName_xpath,"//h3[text()='"+packagename+"']/parent::div/a");
					//clickWebdriver(attributeName_xpath,".//*[@id='appList']/li[1]/div/a");
					//driver.findElement(By.xpath("//h3[text()='"+packagename+"']/parent::div/a[text()=' View Application']")).click();
					//ul[@id='appList']//li//div/h3[contains(text(),'Application for QA Automation')]/../a
				}
				/*if(isDisplayedWebdriver(attributeName_xpath,"//ul/li/div/h3[contains(text(),'"+packagename+"')]/../../ul//h4[contains(text(),'Application Status: No')]")){
				 clickWebdriver(attributeName_xpath,"//ul/li/div/h3[contains(text(),'"+packagename+"')]/../a");
				}*/
				else{
				 clickWebdriver(attributeName_xpath, Applpackage+packagename+"')]");
				}
// waitForPageToLoadWebdriver();
			}
			if (!eventpackagename.equals("")) {
				Reporter.log("Click on ("+eventpackagename+") Event Package");
				
				if (eventpackagename.equalsIgnoreCase("Search")) {
					clickWebdriver(attributeName_linktext, eventpackagename);
//					click(eventpackage+eventpackagename+"']");
					waitForPageToLoadWebdriver();
				}else if (eventpackagename.equalsIgnoreCase("List All")) {
					clickWebdriver(attributeName_linktext, eventpackagename);
//					click(eventpackage+eventpackagename+"']");
					waitForPageToLoadWebdriver();
				}else if (eventpackagename.equalsIgnoreCase("View mine")) {
					clickWebdriver(attributeName_linktext, eventpackagename);
//					click(eventpackage+eventpackagename+"']");
					recentPopupSelectWebdriver("View mine");				
				}
			}
			if (!enrollment.equals("")) {
				Reporter.log("Click on ("+enrollment+") Link");
//				click(enrollpackage+enrollment+"']");
//				recentPopupSelect("Enrollment");	
				waitForElementPresentWebdriver(attributeName_xpath, enrollpackage+enrollment+"']", enrollment);
				clickWebdriver(attributeName_xpath, enrollpackage+enrollment+"']");
				waitForPageToLoadWebdriver();
				recentPopupSelectWebdriver("Enrollment");
				
			}
			if (!link_to_click.equalsIgnoreCase("")) {
				
				if (link_to_click.equalsIgnoreCase("Logout")) {
					Reporter.log("Step 1 - Proceed to Click on ("+link_to_click+") Link");
					clickWebdriver(attributeName_xpath,Logoutmain+link_to_click+"']");
					waitForPageToLoadWebdriver();
				}
				else
				{
					Reporter.log("Step 1 - Proceed to Click on ("+link_to_click+") Link");
					writeConsole("I am in Link text");
					clickWebdriver(attributeName_xpath, MN_BaseTableFont);
					waitForPageToLoadWebdriver();
				}
				
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
	

}
