package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.WC_ApplicantSummary;



import static procedures_NewFramework.AYSmoke.General.GL_LaunchBrowser.environment;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.thoughtworks.selenium.webdriven.commands.WindowMaximize;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_ManageTestScore_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some input operation in 'Manage Test Score ' page")
	public void WC_ManageTestScore_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Manage Test Score' Page");
			String[] testdata = datacontainer;
			String testtypecheck = testdata[0];
			String testtypename = testdata[1];
			String adddeleteclosewindow = testdata[2];


			Reporter.log("Input Test Data was retrieved for 'Manage Test Score' Page");
			//recentPopupSelect_without_window_nameWebdriver();
			recentPopupSelectWebdriver("TestScore"); //Added by Rahul Mehta on 25th March,2019


			if (!testtypecheck.equals(""))//Added by Rahul Mehta on 25th March,2019
			{
				if(isElementPresent(attributeName_xpath,"//a[contains(text(),'ACT')]")) {
					clickWebdriver(attributeName_xpath, "//a[contains(text(),'" + testtypecheck + "')]/preceding-sibling::input[@type='checkbox']");
				}
				sleep(1);
			}


			if(!adddeleteclosewindow.equals("")){ //Modified by Rahul Mehta on 26th March,2019
				Reporter.log("Click on the button");
				waitForPageToLoadWebdriver();
				if(adddeleteclosewindow.equalsIgnoreCase("Close Window"))
				{
					clickWebdriver(attributeName_xpath,CloseWindow);
					sleep(5);
					driver.switchTo().window(AppSummaryWindowName);
				}
				if(adddeleteclosewindow.equalsIgnoreCase("Add"))
				{
					clickWebdriver(attributeName_xpath,ManageTestScore_Add);
				}
				if(adddeleteclosewindow.equalsIgnoreCase("delete"))
				{
					clickWebdriver(attributeName_xpath,ManageTestScore_Delete);
					alertAccept();
				}
				sleep(2);

			}

		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}
