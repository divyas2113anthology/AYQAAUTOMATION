package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.ManageQueries;

import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;


public class WC_AddInputCriteria_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some Operation in 'Add Input Criteria' page")
	public void WC_AddInputCriteria_Input () throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Add Input Criteria' page");
			String[] applicantwelidatarepo = datacontainer;
			String applicationstatus = applicantwelidatarepo[0];
			String fieldname = applicantwelidatarepo[1];
			String operator = applicantwelidatarepo[2];
			String value = applicantwelidatarepo[3];
			String verifyvalue = applicantwelidatarepo[4];
			String adddeleterow = applicantwelidatarepo[5];
			String groups = applicantwelidatarepo[6];
			String groupvalue = applicantwelidatarepo[7];
			String actionhistory = applicantwelidatarepo[8];
			String buttonstoclick = applicantwelidatarepo[9];
			Reporter.log("Input Test Data was retrieved for 'Add Input Criteria' page");
//			if (!datatree.equals("")) {
//				Reporter.log("Step 1 - Perform the operation to click the tree as ["+datatree+"]");
//				if (datatree.contains("Tree")) {
//					clickWebdriver(attributeName_xpath, "//font[b/a[text()='"+datatree+"']]/preceding-sibling::img[contains(@src,'closed')]");
//				}else{
//					waitForElementPresentWebdriver(attributeName_linktext, datatree, datatree);
//					clickWebdriver(attributeName_linktext, datatree);
//					waitForPageToLoadWebdriver();
//				}
//			}
			if (!fieldname.equals("")) {
				Reporter.log("Select the field name as ["+fieldname+"]");
//				select(MQ_FieldName, "regexp:"+fieldname);
//				if(add.equalsIgnoreCase("Add"))
//				{
//					waitForElementPresentWebdriver(attributeName_xpath, "//select[@name='txtField1' and @class='FormFields']", fieldname);
//					selectByVisibleTextWebdriver(attributeName_xpath, "//select[@name='txtField0' and @class='FormFields']", "    --"+fieldname);
//				}
//				else{
				//clickWebdriver(attributeName_xpath, MQ_FieldName);
				waitForElementPresentWebdriver(attributeName_xpath, MQ_FieldName, fieldname);
				//clickWebdriver(attributeName_xpath, "//select[@name='txtField0']//option[contains(text(),'Payment Status')]");
				//selectByVisibleTextWithSpaceWebdriver(attributename, attributevalue, text);
				selectByVisibleTextWithSpaceWebdriver(attributeName_xpath, MQ_FieldName, fieldname);				
				waitForPageToLoadWebdriver();
//				Select sel = new Select(driver.findElement(By.xpath("//select[@name='txtField0']")));
//				sel.selectByVisibleText("--Payment Status");
				
//				WebElement element = driver.findElement(By.xpath("//select[@name='txtField0']//option[contains(text(),'Payment Status')]"));
//				JavascriptExecutor executor = (JavascriptExecutor)driver;
//				executor.executeScript("arguments[0].click();", element);	
				//}
			}
			if (!operator.equals("")) {
				Reporter.log("Step 3 - Select the Operator as ["+operator+"]");
				selectByVisibleTextWithSpaceWebdriver(attributeName_xpath, MQ_Operator, operator);
				waitForPageToLoadWebdriver();
			}
			if (!value.equals("")) {

				if (value.equalsIgnoreCase("List")) {
					clickWebdriver(attributeName_xpath, MQ_MultiSelectOpen);
					Thread.sleep(8000);
					System.out.println("Select the value");
					waitForElementPresentWebdriver(attributeName_xpath, MQ_MultiSelectPaymentStatus, "Value");
					Thread.sleep(8000);
					clickWebdriver(attributeName_xpath, MQ_MultiSelectPaymentStatus);
					Thread.sleep(8000);
					clickWebdriver(attributeName_xpath, MQ_MulitSelectClose);
					Thread.sleep(8000);
				}
				else if(value.equalsIgnoreCase("ManageQueries")){
					clickWebdriver(attributeName_xpath, MQ_MultiSelectOpen);
					System.out.println("Select the value");
					String managequery = Runtimedataread("ManageQueries");
					waitForElementPresentWebdriver(attributeName_xpath, MQ1_MultiSelectPaymentStatus+managequery+"']", "Value");
					clickWebdriver(attributeName_xpath, MQ1_MultiSelectPaymentStatus+managequery+"']");
					clickWebdriver(attributeName_xpath, MQ_MulitSelectClose);
				}
				else{
					//sendKeys(attributeName_xpath, MQ_Value, value);
					clickWebdriver(attributeName_xpath," //button [contains(@class,'multiselect ui-widget')]");
					mouseOverWebdriver(attributeName_xpath,"//input[@title='"+value+"']");
					clickWebdriver(attributeName_xpath,"//input[@title='"+value+"']");
				}
			}
//			if (!fieldname.equals("")) {
//				Reporter.log("Verify the value ["+fieldname+"]");
//				waitForElementPresentWebdriver(attributeName_xpath, MQ_MultiSelectPaymentStatus, fieldname);
//				verifyDropDownContainsOptionsWebdriver(attributeName_xpath, MQ_MultiSelectPaymentStatus, fieldname, fieldname);
//			}
			if (!buttonstoclick.equals("")) {
				Reporter.log("Step 3 - Click button as ["+buttonstoclick+"]");
				if (buttonstoclick.equalsIgnoreCase("Back")) {
					clickWebdriver(attributeName_xpath, ASR_BackBtn);
					waitForPageToLoadWebdriver();
				}else if (buttonstoclick.equalsIgnoreCase("Save")) {
					clickWebdriver(attributeName_xpath, AS_SaveBtn);
					waitForPageToLoadWebdriver();
				}else if (buttonstoclick.equalsIgnoreCase("save and run")) {
					clickWebdriver(attributeName_name, MQ_SaveAndRun);
					waitForPageToLoadWebdriver();
				}else if (buttonstoclick.equalsIgnoreCase("run")) {
					waitForElementPresentWebdriverWait(attributeName_xpath, RPT_RunBtn,buttonstoclick);
					clickWebdriver(attributeName_xpath, RPT_RunBtn);
					waitForPageToLoadWebdriver();
				}
				
			}
			if (!adddeleterow.equals("")) {
				Reporter.log("Step 5 - Click on Add Row");
				//sendKeys(attributeName_xpath, MQ_Value, value);
				waitForElementPresentWebdriver(attributeName_xpath, MQ_AddRow, adddeleterow);
				clickWebdriver(attributeName_xpath, MQ_AddRow);
				
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
}

