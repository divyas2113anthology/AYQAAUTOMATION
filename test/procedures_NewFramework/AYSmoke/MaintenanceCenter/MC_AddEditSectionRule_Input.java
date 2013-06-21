package procedures_NewFramework.AYSmoke.MaintenanceCenter;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class MC_AddEditSectionRule_Input extends CommonSeleniumActions implements OR{
	@Test(description="This Procedure is to perform some Operation in 'Add/Edit Section Rule' page")
	public void MC_AddEditSectionRule_Input(){
	try{
		Reporter.log("Proceed to click on package name in quick view screen of Maintenance center");
		String[] testdata = datacontainer;
		String name = testdata[0];
		String description = testdata[1];
		String section = testdata[2];
		String field = testdata[3];
		String operator = testdata[4];
		String value = testdata[5];
		String button = testdata[6];
		Reporter.log("Check user clicked on application package in Maintenance center");
		if (!name.equals("")) {
			Reporter.log("Step 1 - Enter the Section Name as ["+name+"]");
			sendKeys(attributeName_xpath, ESR_Name, name);
		}
		if (!description.equals("")) {
			Reporter.log("Step 2 - Enter the Section Description as ["+description+"]");
			sendKeys(attributeName_xpath, ESR_Description, description);
		}
		if (!section.equals("")) {
			Reporter.log("Step 3 - Select the Section as ["+section+"]");
			selectByValueWebdriver(attributeName_xpath, ESR_Section, section);
		}
		if (!field.equals("")) {
			Reporter.log("Step 4 - Select the field as ["+field+"]");
			selectByValueWebdriver(attributeName_xpath, ESR_Field, field);
		}
		if (!operator.equals("")) {
			Reporter.log("Step 5  - Select the operator as ["+operator+"]");
			selectByValueWebdriver(attributeName_xpath, ESR_Operator, operator);
		}
		if (!value.equals("")) {
			Reporter.log("Step 6 - Select the value as ["+value+"]");
			selectByValueWebdriver(attributeName_xpath, ESR_ValueSelect, value);
		}
		if (!button.equals("")) {
			Reporter.log("Step 7 - Click the name of the button as ["+button+"]");
			if (button.equals("Save")) {
				clickWebdriver(attributeName_xpath, ESR_Save);
			}else if (button.equals("Cancel")) {
				clickWebdriver(attributeName_xpath, ESR_Cancel);
			}
		}
		
	}catch(Exception e){
		writeFailure(e.getLocalizedMessage());}
	}
}

