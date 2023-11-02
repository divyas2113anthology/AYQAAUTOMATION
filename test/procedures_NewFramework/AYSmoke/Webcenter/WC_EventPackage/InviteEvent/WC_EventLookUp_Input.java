package procedures_NewFramework.AYSmoke.Webcenter.WC_EventPackage.InviteEvent;

import static procedures_NewFramework.AYSmoke.General.GL_LaunchBrowser.environment;
import or.OR;

import org.openqa.selenium.Keys;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSeleniumServlet.*;
import org.testng.Reporter;
import org.testng.annotations.Test;


import processor.CommonSeleniumActions;

import java.util.Iterator;
import java.util.Set;


public class WC_EventLookUp_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some Operation in 'Invite To Event' page")
	public void WC_EventLookUp_Input () throws Exception{
		try {
			writeDetails();
//			headerStatement("ApplicantWelcome_Input");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Input Test Data for 'Invite To Event' page");
			String[]  applicantwelidatarepo = datacontainer;
			String internalname = applicantwelidatarepo[0];
			String title = applicantwelidatarepo[1];
			String where = applicantwelidatarepo[2];
			String whendate = applicantwelidatarepo[3];
			String eventcategory = applicantwelidatarepo[4];
			String host = applicantwelidatarepo[5];
			String eventtype = applicantwelidatarepo[6];
			String eventgroups = applicantwelidatarepo[7];
			String searchclose = applicantwelidatarepo[8];
			Reporter.log("Input Test Data was retrieved for 'Invite To Event' page");
	//		selectMainWindow();
			waitForElementPresentWebdriver(attributeName_xpath, EL_CloseWindowBtn, "Close Window");
			if (!internalname.equals("")) {
				Reporter.log("Step 1 - Enter the Internal Name as ("+internalname+") Link");
				waitForElementPresentWebdriver(attributeName_name, EL_InternalName, internalname);
				sendKeys(attributeName_name, EL_InternalName, internalname);
			}
			if (!title.equals("")) {
				Reporter.log("Step 2 - Enter the Title as ("+title+")");
				if (title.equals("Event Title")) {
					String Title = Runtimedataread(title);
					sendKeys(attributeName_name, EL_Title, Title);
				}else{
				sendKeys(attributeName_name, EL_Title, title);
				}
			}
			if (!where.equals("")) {
				Reporter.log("Step 3 - Select the where as ("+where+") Button");
				selectByVisibleTextWebdriver(attributeName_name, EL_Where, where);
			}
			if (!whendate.equals("")) {
				Reporter.log("Step 4 - Enter the When Date as ("+whendate+") Link");
				environment = Runtimedataread("Instance");
				if (environment.equalsIgnoreCase("UKQA") || environment.equalsIgnoreCase("UKPR")) {
					String Whendate = requiredDateAndFormat("dd/MM/yyyy", whendate);
					sendKeys(attributeName_name, EL_When, Whendate);
				}else{
					String Whendate = requiredDateAndFormat("MM/dd/yyyy", whendate);
					sendKeys(attributeName_xpath, EL_When, Whendate);
				}
			}
			if (!eventcategory.equals("")) {
				Reporter.log("Step 5 - Select the Event Catagory as ("+eventcategory+") Button");
				selectByVisibleTextWebdriver(attributeName_name, EL_EventCatagory, eventcategory);
			}
			if (!host.equals("")) {
				Reporter.log("Step 6 - Select the Host as ("+host+") Button");
				selectByVisibleTextWebdriver(attributeName_name, EL_Host, host);
			}
			if (!eventtype.equals("")) {
				Reporter.log("Step 7 - Select the Event Type as ("+eventtype+") Button");
				selectByVisibleTextWebdriver(attributeName_name, EL_EventType, eventtype);
			}
			if (!eventgroups.equals("")) {
				Reporter.log("Step 8 - Select the Event Groups as ("+eventgroups+") Button");
				selectByVisibleTextWebdriver(attributeName_name, EL_EventGroups, eventgroups);
			}
			if (!searchclose.equals("")) {
				Reporter.log("Step 9 - Proceed to Click on ("+searchclose+") Button");
				if (searchclose.equalsIgnoreCase("Search")) {
					waitForElementPresentWebdriver(attributeName_xpath, EL_SearchBtn, searchclose);
					clickWebdriver(attributeName_xpath, EL_SearchBtn);
					waitForPageToLoadWebdriver();
					if (isElementPresentWebdriver(attributeName_xpath, EL_LinkToClick)) {
						waitForElementPresentWebdriver(attributeName_xpath, EL_LinkToClick, "Lookup Title");
						Set<String> mainWindow = driver.getWindowHandles();
						String parent = mainWindow.iterator().next();
						clickWebdriver(attributeName_xpath, EL_LinkToClick);
						driver.switchTo().window(parent);
						//selectMainWindowWebdriver();
					}
				}else if (searchclose.equalsIgnoreCase("Close Window")) {
					clickWebdriver(attributeName_xpath, EL_CloseWindowBtn);
					selectMainWindowWebdriver();
				}
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

}


