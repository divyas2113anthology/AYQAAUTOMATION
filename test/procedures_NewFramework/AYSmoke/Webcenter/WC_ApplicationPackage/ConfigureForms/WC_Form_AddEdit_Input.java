package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.ConfigureForms;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_Form_AddEdit_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'Configure Form' page")
	public void WC_Form_AddEdit_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Configure Form' Page");
			String[] testdata = datacontainer;
			String name = testdata[0];
			String description = testdata[1];
			String label = testdata[2];
			String required = testdata[3];
			String order = testdata[4];
			String savedeletecancel = testdata[5];
			switchToFrameNameIdWebdriver("frmContent");
			if (!name.equals("")) {
				Reporter.log("Step 1 - Form Name as ["+name+"]");
				
			}

			if(!description.equals("")){
				Reporter.log("Step 2 - Enter the description as ["+description+"]");
				waitForElementPresentWebdriverWait(attributeName_xpath, SR_description, description);
				sendKeys(attributeName_xpath, SR_description, description);
			}
			if(!label.equals("")){
				Reporter.log("Step 3 - Enter the label as ["+label+"]");
				waitForElementPresentWebdriverWait(attributeName_xpath, CSC_Label, label);
				sendKeys(attributeName_xpath, CSC_Label, label);
			}
			if(!required.equals("")){
				Reporter.log("Step 4 - Check the check box for Required");
				if(required.equalsIgnoreCase("Yes")) {
					if (isAttribtuePresent(attributeName_xpath, QAE_Required, "unchecked")) {
						waitForElementPresentWebdriverWait(attributeName_xpath, QAE_Required, required);
						clickWebdriver(attributeName_xpath, QAE_Required);
					}
				}


				if(required.equalsIgnoreCase("No")){
					 if(isAttribtuePresent(attributeName_xpath, QAE_Required,"checked")){
						waitForElementPresentWebdriverWait(attributeName_xpath, QAE_Required, required);
						clickWebdriver(attributeName_xpath, QAE_Required);
					}
				}
			}
			if(!order.equals("")){
				Reporter.log("Step 5 - Enter the order number");//CSC_Order
				waitForElementPresentWebdriverWait(attributeName_xpath, CSC_Order, order);
				sendKeys(attributeName_xpath, CSC_Order, order);		
			}
			if(!savedeletecancel.equals("")){
				Reporter.log("Step 6 - Clicking on the buttons");
				waitForElementPresentWebdriverWait(attributeName_xpath, CSC_Save, savedeletecancel);
				clickWebdriver(attributeName_xpath, CSC_Save);	
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}
