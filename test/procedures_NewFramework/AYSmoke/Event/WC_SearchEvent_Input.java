package procedures_NewFramework.AYSmoke.Event;

import or.OR;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_SearchEvent_Input extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Application Home' page")
		public void WC_SearchEvent_Input() throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Data 'Search for Events' page");
			String[]  fpvdatarepo = datacontainer;
			String internal = fpvdatarepo[0];
			String title = fpvdatarepo[1];
			String where = fpvdatarepo[2];
			String category = fpvdatarepo[3];
			String host = fpvdatarepo[4];
			String status = fpvdatarepo[5];
			String etype = fpvdatarepo[6];
			String specific_date = fpvdatarepo[7];
			String date_range_from = fpvdatarepo[8];
			String date_range_to = fpvdatarepo[9];
			String clear = fpvdatarepo[10];
			String query = fpvdatarepo[11];
			String calender = fpvdatarepo[12];
			String group = fpvdatarepo[13];
			String submit = fpvdatarepo[14];
			
			if (!internal.equals("")) {
				Reporter.log("Internal name"+internal);
				waitForElementPresentWebdriver(attributeName_xpath, SFE_InternalName, internal);
				sendKeys(attributeName_xpath, SFE_InternalName, internal);
			}
			if (!title.equals("")) {
				Reporter.log("Title as"+title);
				waitForElementPresentWebdriver(attributeName_xpath, SFE_Title, title);
				sendKeys(attributeName_xpath, SFE_Title, title);
			}
			if (!where.equals("")) {
				Reporter.log("Where as"+where);
				waitForElementPresentWebdriver(attributeName_xpath, SFE_Where, where);
				selectByVisibleTextWebdriver(attributeName_xpath, SFE_Where, where);
			}
			if (!category.equals("")) {
				Reporter.log("Event category as"+category);
				waitForElementPresentWebdriver(attributeName_xpath, SFE_EventCategory, category);
				selectByVisibleTextWebdriver(attributeName_xpath, SFE_EventCategory, category);	
			}
			if (!host.equals("")) {
				Reporter.log("Host as ["+host+"]");
				waitForElementPresentWebdriver(attributeName_xpath, SFE_Host, host);
				selectByVisibleTextWebdriver(attributeName_xpath, SFE_Host, host);
			}
			if (!status.equals("")) {
				
			}
			if (!etype.equals("")) {
				Reporter.log("Event type as ["+etype+"]");
				waitForElementPresentWebdriver(attributeName_xpath, SFE_EventType, etype);
				selectByVisibleTextWebdriver(attributeName_xpath, SFE_EventType, etype);
			}
			if (!specific_date.equals("")) {
				Reporter.log("Specific Date as"+specific_date);		
				waitForElementPresentWebdriver(attributeName_xpath, SFE_SpecificDate, specific_date);
				sendKeys(attributeName_xpath, SFE_SpecificDate, specific_date);
			}
			if (!date_range_from.equals("")) {
				Reporter.log("Date Range From"+date_range_from);
				waitForElementPresentWebdriver(attributeName_xpath, SFE_DateRangeFrom, date_range_from);
				sendKeys(attributeName_xpath, SFE_DateRangeFrom, date_range_from);
			}
			if (!date_range_to.equals("")) {
				Reporter.log("Date Range To"+date_range_to);
				waitForElementPresentWebdriver(attributeName_xpath, SFE_DateRangeTo, date_range_to);
				sendKeys(attributeName_xpath, SFE_DateRangeTo, date_range_to);
			}
			if (!clear.equals("")) {
				Reporter.log("Date Range To"+date_range_to);
				waitForElementPresentWebdriver(attributeName_xpath, SFE_Clear, clear);
				//sendKeys(attributeName_xpath, SFE_Clear, clear);
				clickWebdriver(attributeName_xpath, SFE_Clear);
			}
			if (!query.equals("")) {
				Reporter.log("Query value as"+query);
				waitForElementPresentWebdriver(attributeName_xpath, SAI_UserQuries, query);
				selectByVisibleTextWithSpaceWebdriver(attributeName_xpath, SAI_UserQuries, query);
			}
			if (!calender.equals("")) {
				Reporter.log("Calender value as"+calender);
				String Checkmonthyear = calender.replace(";", ",");
				String[] Splitdays = Checkmonthyear.split(",");
				System.out.println(Splitdays[0]);
				System.out.println(Splitdays[1]);
				System.out.println(Splitdays[2]);
//				selectByVisibleTextWithSpaceWebdriver(attributeName_xpath, SFE_CalMonth , Splitdays[0]);
//				
//				selectByVisibleTextWebdriver(attributeName_xpath,  SFE_CalYear, Splitdays[1]);
//				
//				sendKeys(attributeName_xpath, SFE_CalDay, Splitdays[2]);
				//new Select(driver.findElement(By.xpath(""))).selectByVisibleText(Splitdays[0]);;
				new Select (driver.findElement(By.xpath("//select[contains(@name,'intMonthSelector')]"))).selectByVisibleText(Splitdays[0]);
				
				waitForElementPresentWebdriver(attributeName_xpath, "//select[contains(@name,'intMonthSelector')]", "Search"); //change for sleep
				new Select (driver.findElement(By.xpath("//select[contains(@name,'intYearSelector')]"))).selectByVisibleText(Splitdays[1]);
				waitForElementPresentWebdriver(attributeName_xpath, SFE_CalDay+Splitdays[2]+"']", "Search"); //change for sleep
				clickWebdriver(attributeName_xpath, SFE_CalDay+Splitdays[2]+"']");
				

			}
			if (!group.equals("")) {
				
			}
			if (!submit.equals("")) {
				Reporter.log("Click the submit button");
				clickWebdriver(attributeName_xpath, SAI_SubmitBtnBottom);
				
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}


