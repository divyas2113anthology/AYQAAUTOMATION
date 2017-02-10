package procedures_NewFramework.AYSmoke.Webcenter;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_Question_AddEdit_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'Question Add/Edit Input' page")
	public void WC_Question_AddEdit_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Question Add/Edit Input' Page");
			String[] testdata = datacontainer;
			String name = testdata[0];
			String label = testdata[1];
			String fieldtype = testdata[2];
			String fieldlenght = testdata[3];
			String fieldformat = testdata[4];
			String questiongroup = testdata[5];
			String questionbefore = testdata[6];
			String order = testdata[7];
			String questioncategory = testdata[8];
			String assigntranscriptstatus = testdata[9];
			String required = testdata[10];
			String usagesavedeletecancel = testdata[11];

			Reporter.log("Input Test Data was retrieved for 'Question Add/Edit Input' Page");
//			writeFailure("Given Test Data["+yesno+"] either Incorrect or has not be Scripted ");
			switchToFrameNameIdWebdriver("frmContent");

			if (!name.equals("")) {
				Reporter.log("Step 1 - Enter the name as ["+name+"]");
				sendKeys(attributeName_xpath, QAE_Name, name);
			}
			if (!label.equals("")) {
				Reporter.log("Step 2 - Enter the label as ["+label+"]");
				sendKeys(attributeName_xpath, QAE_Label, label);
			}
			if (!fieldtype.equals("")) {
				Reporter.log("Step 3 - Select the Field Type as ["+fieldtype+"]");
				selectByValueWebdriver(attributeName_xpath, QAE_FieldType, fieldtype);
			}
			if (!fieldlenght.equals("")) {
				Reporter.log("Step 4 - Enter the Field Length as ["+fieldlenght+"]");
				sendKeys(attributeName_xpath, QAE_FieldLength, fieldlenght);
			}
			if (!fieldformat.equals("")) {
				Reporter.log("Step 5 - Select the Field Format as ["+fieldformat+"]");
				selectByValueWebdriver(attributeName_xpath, QAE_FieldFormat, fieldformat);
			}
			if (!questiongroup.equals("")) {
				Reporter.log("Step 6 - Select the Question Group as ["+questiongroup+"]");
				selectByValueWebdriver(attributeName_xpath, QAE_QuestionGroup, questiongroup);
			}
			if (!questionbefore.equals("")) {
				Reporter.log("Step 7 - Select the Question Before as ["+questionbefore+"]");
				selectByValueWebdriver(attributeName_xpath, QAE_QuestionBefor, questionbefore);
			}
			if (!order.equals("")) {
				Reporter.log("Step 8 - Enter the order as ["+order+"]");
				sendKeys(attributeName_xpath, QAE_Order, order);
			}
			if (!questioncategory.equals("")) {
				Reporter.log("Step 9 - Select the Question Category as ["+questioncategory+"]");
				//selectByValueWebdriver(attributeName_xpath, QAE_QuestionCategory, questioncategory);
				selectByVisibleTextWebdriver(attributeName_xpath, QAE_QuestionCategory, questioncategory);
			}
			if(!required.equals("")){
				Reporter.log("Step 4 - Check the check box for Required");
				if(required.equalsIgnoreCase("Yes") || required.equalsIgnoreCase("Check")) {
					String trueOrFlase = new String(String.valueOf(isAttribtuePresent(attributeName_xpath, QAE_Required, "checked")));
					if (trueOrFlase.equalsIgnoreCase("flase")) {
						waitForElementPresentWebdriverWait(attributeName_xpath, QAE_Required, required);
						clickWebdriver(attributeName_xpath, QAE_Required);
					}
				}
				if(required.equalsIgnoreCase("No") || required.equalsIgnoreCase("Uncheck")){
					if(isAttribtuePresent(attributeName_xpath, QAE_Required,"checked")){
						waitForElementPresentWebdriverWait(attributeName_xpath, QAE_Required, required);
						clickWebdriver(attributeName_xpath, QAE_Required);
					}
				}
			}
			if (!usagesavedeletecancel.equals("")) {
				Reporter.log("Step 10 - Click the Button as ["+usagesavedeletecancel+"]");
				if (usagesavedeletecancel.equalsIgnoreCase("Usage")) {
					waitForElementPresentWebdriver(attributeName_xpath, QAE_UsageButton,"Usage");
					clickWebdriver(attributeName_xpath, QAE_UsageButton);
					waitForPageToLoadWebdriver();
				} else
				if (usagesavedeletecancel.equalsIgnoreCase("Save")) {
					clickWebdriver(attributeName_xpath, QAE_SaveButton);
					waitForPageToLoadWebdriver();
				} else if (usagesavedeletecancel.equalsIgnoreCase("Cancel")) {
					clickWebdriver(attributeName_xpath, QAE_CancelButton);
					waitForPageToLoadWebdriver();
				}
			}
			switchToDefaultContentWebdriver();
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}




