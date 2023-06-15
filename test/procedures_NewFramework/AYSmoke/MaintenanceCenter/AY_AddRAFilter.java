package procedures_NewFramework.AYSmoke.MaintenanceCenter;



import or.OR;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AY_AddRAFilter extends CommonSeleniumActions implements OR{
	@Test(description="This Procedure is to perform some Operation in 'Manage RA Accounts-Filter' page")
	public void AY_AddRAFilter(){
		try{
			Reporter.log("Proceed to retrieve Input Test Data for 'Manage RA Accounts-Filter' page");
			String[] testdata = datacontainer;
			String name = testdata[0];
			String description = testdata[1];
			String field = testdata[2];
			String operator = testdata[3];
			String value = testdata[4];
			String minusplusbutton = testdata[5];
			String savecancel = testdata[6];
			String validationmessage = testdata[7];
			String verifyvalue = testdata[8];
			String delete = testdata[9];
			
			
			if(!name.equals("")){
//				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMMdd_yymms");
//
//				LocalDateTime now = LocalDateTime.now();
//				System.out.println(dtf.format(now));
//				getTextWebdriver(attributeName_xpath,dtf.format(now));
//				WebElement text = driver.findElementByXPath(dtf.format(now));
//				String Name =text.getText();


				Reporter.log("Enter the Filter Nmae as("+name+")");
				waitForElementPresentWebdriver(attributeName_xpath, ET_FilterName, name);
				sendKeys(attributeName_xpath, ET_FilterName, name);
				
			}
			if(!description.equals("")){
				Reporter.log("Enter the Description as("+description+")");
				sendKeys(attributeName_xpath, ET_Description, description);
				
			}
			if (!field.equals("")) {
				Reporter.log("Select ("+field+")");
				clickWebdriver(attributeName_xpath,"//button[contains(@title,'Please Select')]"); //Add by saran kumar jun 2023
				sendKeys(attributeName_xpath,"//input[@placeholder='Search']",field);
				clickWebdriver(attributeName_xpath,"//label[contains(text(),'"+field+"')]");
			//	selectByVisibleTextWithSpaceWebdriver(attributeName_xpath, "//select[@class='FormFields']", field);
				sleep(2);//Added by Rahul Mehta on 14th March 2019
			}
			if (!operator.equals("")) {
				Reporter.log("Select ("+operator+")");


				selectByVisibleTextWebdriver(attributeName_xpath, "//select[@name='G1-row0_txtOperator0']", operator);
				sleep(2);//Added by Rahul Mehta on 14th March 2019


			}
			if (!value.equals("")) {
				Reporter.log("Select ("+value+")");
				String valuedata = Runtimedataread(value);
				waitForElementPresentWebdriver(attributeName_xpath, "(//button[@class='multiselect dropdown-toggle btn btn-default'])[2]", value);
				clickWebdriver(attributeName_xpath, "(//button[@class='multiselect dropdown-toggle btn btn-default'])[2]");
				waitForElementPresentWebdriver(attributeName_xpath, "//label[contains(text(),'"+valuedata+"')]", valuedata);
				//clickWebdriver(attributeName_xpath, MCL_CheckValue+value+"']");
				checkWebdriver(attributeName_xpath, "//label[contains(text(),'"+valuedata+"')]");
				clickWebdriver(attributeName_xpath,"//label[contains(text(),'"+valuedata+"')]");
				sleep(2);
				
			}
			if(!savecancel.equals("")){
				Reporter.log("Click on the Button"+savecancel);
				clickWebdriver(attributeName_xpath, ET_SaveCancel+savecancel+"')]");
				waitForPageToLoadWebdriver();
			}		
			
			if(!verifyvalue.equals("")){
				Reporter.log("Verify"+savecancel);
				String valuedata = Runtimedataread(value);
				if(verifyvalue.equalsIgnoreCase("TestingRAAccount")){
					String data = Runtimedataread(verifyvalue);
					waitForElementPresentWebdriver(attributeName_xpath, ET_Value1, valuedata);
					clickWebdriver(attributeName_xpath, ET_Value1);
					verifyElementContainsTextWebdriver(attributeName_xpath, MCL_VerifyValue+data+"')]", data, data);
				}else {
					waitForElementPresentWebdriver(attributeName_xpath, ET_Value, valuedata);
					clickWebdriver(attributeName_xpath, ET_Value);
					verifyElementContainsTextWebdriver(attributeName_xpath, MCL_VerifyValue + valuedata + "')]", verifyvalue, verifyvalue);
				}


			}

			if(!delete.equals("")){
				clickWebdriver(attributeName_xpath,"(//a[contains(text(),'"+delete+"')]/ancestor::td/preceding-sibling::td/input[@type='checkbox'])[1]");
				clickWebdriver(attributeName_xpath,"(//img[@alt='delete'])[1]");
alertAccept();
			}
			
		
		}catch(Exception e){
			writeFailure(e.getLocalizedMessage());
		}
	}

}
