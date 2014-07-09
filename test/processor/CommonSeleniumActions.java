package processor;

import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.SimpleFormatter;
import java.lang.IllegalArgumentException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import or.OR;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.internal.seleniumemulation.GetAttribute;
import org.openqa.selenium.internal.seleniumemulation.GetXpathCount;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.openqa.selenium.internal.Locatable;


public class CommonSeleniumActions extends Processor implements OR {	



	public void open(String url){
		writeConsole("Open ["+url+"]");
		selenium.open(url);
	}

	//	public void click(String locator){
	//		selenium.click(locator);
	//	}

	public void click(String locator) throws Exception{
		try {
			writeConsole("click["+locator+"]");
			selenium.click(locator);	
		} catch (Exception e) {
			writeConsole("click["+locator+"]");
			Thread.sleep(500);
			selenium.click(locator);
		}
	}

	public void type(String locator,String value){
		writeConsole("type["+locator+", "+value+"]");
		selenium.type(locator, value);
	}

	public void doubleClick(String locator){
		writeConsole("doubleClick["+locator+"]");
		selenium.doubleClick(locator);
	}

	public void dragAndDrop(String locator,String movementsString){
		writeConsole("dragAndDrop["+locator+", "+movementsString+"]");
		selenium.dragAndDrop(locator, movementsString);
	}
	public void dragAndDropToObject(String locatorOfObjectToBeDragged,String locatorOfDragDestinationObject){
		writeConsole("dragAndDropToObject["+locatorOfObjectToBeDragged+", "+locatorOfDragDestinationObject+"]");
		selenium.dragAndDropToObject(locatorOfObjectToBeDragged, locatorOfDragDestinationObject);
	}

	public void selectWindow(String windowName) {
		writeConsole("selectWindow["+windowName+"]");
		selenium.selectWindow(windowName);
	}

	public void selectMainWindow() {
		Reporter.log("Proceed to Select Main Window");
		writeConsole("selectWindow[null]");
		selenium.selectWindow(null);
	}

	public String getText(String locator){
		writeConsole("getText["+locator+"]");
		String actualText  = selenium.getText(locator);
		writeConsole("ActualText ["+actualText+"]");
		return actualText;
	}	

	public String getValue(String locator){
		writeConsole("getValue["+locator+"]");		
		String actualValue  = selenium.getValue(locator);
		writeConsole("ActualValue["+actualValue+"]");
		return actualValue;
	}

	public void select(String selectLocator,String optionLocator){
		writeConsole("select["+selectLocator+", "+optionLocator+"]");	
		selenium.select(selectLocator,optionLocator);
	}

	public void waitForPageToLoad(){
		writeConsole("waitForPageToLoad["+STANDARD_PAGE_LOAD_WAIT_TIME+"]");	
		selenium.waitForPageToLoad(STANDARD_PAGE_LOAD_WAIT_TIME);
	}

	protected void focus(String locator){
		writeConsole("focus["+locator+"]");
		selenium.focus(locator);
	}
	protected void highlight(String locator) {
		writeConsole("highlight["+locator+"]");
		selenium.highlight(locator);
	}

	public void check(String locator){
		writeConsole("check["+locator+"]");
		selenium.check(locator);
	}

	public void uncheck(String locator){
		writeConsole("uncheck["+locator+"]");
		selenium.uncheck(locator);
	}

	public void chooseCancelOnNextConfirmation(){
		writeConsole("chooseCancelOnNextConfirmation");
		selenium.chooseCancelOnNextConfirmation();
	}

	public void chooseOkOnNextConfirmation(){
		writeConsole("chooseOkOnNextConfirmation");
		selenium.chooseOkOnNextConfirmation();
	}

	public void typeKeys(String locator,String value){
		writeConsole("typeKeys["+locator+", "+value+"]");
		selenium.typeKeys(locator, value);
	}

	public void clickAt(String locator,String coordString){
		writeConsole("clickAt["+locator+", "+coordString+"]");
		selenium.clickAt(locator, coordString);
	}

	public void fireEvent(String locator, String eventName){
		writeConsole("fireEvent["+locator+", "+eventName+"]");
		selenium.fireEvent(locator, eventName);
	}

	public void close() {
		writeConsole("Window Close");
		selenium.close();
	}
	public void keyPressNative(String keycode) {
		writeConsole("keyPressNative["+keycode+"]");
		selenium.keyPressNative(keycode);
	}
	public String[] getSelectOptions(String selectLocator) {	
		writeConsole("getSelectOptions["+selectLocator+"]");
		String[] getselectoptions = selenium.getSelectOptions(selectLocator);
		writeConsole("Actual getSelectOptions["+getselectoptions+"]");
		return getselectoptions;
	}

	public String getSelectedLabel(String selectLocator) {
		writeConsole("getSelectedLabel["+selectLocator+"]");
		String getselectedlabel = selenium.getSelectedLabel(selectLocator);
		writeConsole("Actual getSelectedLabel["+getselectedlabel+"]");
		return getselectedlabel;
	}
	//the numerical position of the cursor in the field; position should be 0 to move the position to the beginning of the field. You can also set the cursor to -1 to move it to the end of the field.
	public void setCursorPosition(String locator, String position) {
		writeConsole("setCursorPosition["+locator+", "+position+"]");
		selenium.setCursorPosition(locator, position);
	}

	public String getLocation() {		
		String getlocation = selenium.getLocation();
		writeConsole("getLocation["+getlocation+"]");
		return getlocation;
	}



	//	public void verifyTextPresent(String myString) {
	//		Assert.assertTrue(selenium.isTextPresent(myString), "Expected text '" + myString + "' was not found");
	//	}
	//
	//	public void verifyTextNotPresent(String myString) {
	//		Assert.assertFalse(selenium.isTextPresent(myString), "Unexpected text '" + myString + "' was found");
	//	}
	//
	//	public void verifyElementPresent(String elementLocator) {
	//		Assert.assertTrue(selenium.isElementPresent(elementLocator), "Expected element '" + elementLocator + "' was not found");     
	//	}
	//
	//	public void verifyElementNotPresent(String elementLocator) {
	//		Assert.assertFalse(selenium.isElementPresent(elementLocator), "Unexpected element '" + elementLocator + "' was found");
	//	}
	//
	//	public void selectDefaultWindowAndWait() {
	//		selenium.selectWindow("");
	//		selenium.waitForPageToLoad(STANDARD_PAGE_LOAD_WAIT_TIME);
	//	}
	//	
	//	public void buttonDisabled(String locator){
	//		if(selenium.isElementPresent(locator))
	//		{
	//			System.out.println("Button is disabled");
	//		}
	//		else
	//		{
	//			System.out.println("Button is enabled");
	//		}
	//	}
	//
	//	
	//
	//	public void performAssertEqual(String actual,String expected){
	//		Assert.assertEquals(actual,expected);
	//	}

	public void mouseOver(String locater) throws Exception{
		writeConsole("mouseOver["+locater+"]");
		selenium.mouseOver(locater);    	
	}	

	public void waitForElementPresent(String elementor,String elementname) throws Exception{
		for (int second = 0;;second ++) {
			try {// try catch block is used handle 'Permission Denied Error' when waiting for element
				if (second>=120) {
					writeFailure("Element["+elementname+"] was not found after waiting for 2 Minute");
				}
				if (isElementPresent(elementor)) {
					break;
				}
			} catch (Exception e) {

			}
			Thread.sleep(1000);		
		}

	}

	public void waitForElementNotPresent(String elementor,String elementname)throws Exception{
		for (int second = 0;;second ++) {
			try {// try catch block is used handle 'Permission Denied Error' when waiting for element
				if (second>=120) {
					writeFailure("Element["+elementname+"] was found after waiting for 2 Minute");
				}
				if (!isElementPresent(elementor)) {
					break;
				}
			} catch (Exception e) {

			}
			Thread.sleep(1000);			
		}
	}
	public void waitForElementVisible(String elementLocater, String elementname)throws Exception{
		for (int second = 0;;second ++) {
			try {// try catch block is used handle 'Permission Denied Error' when waiting for element
				if (second>=120) {
					writeFailure("Element["+elementname+"] was not found after waiting for 2 Minute");
				}
				if (isVisible(elementLocater)) {
					break;
				}
			} catch (Exception e) {
				writeConsole("Element["+elementLocater+"] Not Found");
			}
			Thread.sleep(1000);			
		}		
	}

	public void waitForElementNotVisible(String elementLocater, String elementname)throws Exception{
		for (int second = 0;;second ++) {
			try {// try catch block is used handle 'Permission Denied Error' when waiting for element
				if (second>=60) {
					writeFailure("Element["+elementname+"] was found after waiting for 1 Minute");
				}
				if (!isVisible(elementLocater)) {
					break;
				}
			} catch (Exception e) {

			}
			Thread.sleep(1000);			
		}
	}

	public boolean isChecked(String checkboxLocator) {
		writeConsole("isChecked["+checkboxLocator+"]");
		boolean ischecked = selenium.isChecked(checkboxLocator);
		writeConsole("Actual isChecked["+ischecked+"]");
		return ischecked;
	}



	//	public void verifyAttribute(String elementLocator, String attributeType, String expectedAttributeValue) {
	//		Assert.assertEquals(selenium.getAttribute(elementLocator + "@" + attributeType), expectedAttributeValue,
	//				"The attribute of type '" + attributeType + "' at element '" + elementLocator + "' did not equal expected value '"
	//				+ expectedAttributeValue + "'");
	//	}


	public void waitForPopUp(){
		writeConsole("waitForPopUp[galeChildWindow, 90000]");
		selenium.waitForPopUp("galeChildWindow","90000");
	}

	public void goBack(){
		writeConsole("goBack");
		selenium.goBack();
	}

	public void waitForText(String pattern, String message)throws Exception{
		for (int second = 0;; second++) {
			writeConsole("waitForTextPresent : "+message+"");
			if (second >= 60) writeFailure(message+" Timeout after 1 minute..");
			try { if (selenium.isTextPresent(pattern)) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}
	}
	public void waitForTextNotPresent(String pattern, String message)throws Exception{
		for (int second = 0;; second++) {
			if (second >= 60) writeFailure(message+" Timeout after 1 minute..");
			try { if (!selenium.isTextPresent(pattern)) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}
	}

	//	=================================22-06-2012

	public boolean isElementPresent(String locator) throws Exception{
		try {
			writeConsole("isElementPresent["+locator+"]");
			boolean iselementpresent = selenium.isElementPresent(locator);
			writeConsole("Actual isElementPresent["+iselementpresent+"]");
			return iselementpresent;			
		} catch (Exception e) {
			Thread.sleep(1000);
			boolean iselementpresent = selenium.isElementPresent(locator);
			writeConsole("Actual isElementPresent["+iselementpresent+"]");
			return iselementpresent;			
		}

	}

	public boolean isTextPresent(String pattern){
		writeConsole("isTextPresent["+pattern+"]");
		boolean istextpresent = selenium.isTextPresent(pattern);
		writeConsole("Actual isTextPresent["+istextpresent+"]");
		return istextpresent;
	}

	public boolean isVisible(String locator){
		writeConsole("isVisible["+locator+"]");
		boolean isvisible = selenium.isVisible(locator);		
		writeConsole("Actual isvisible ["+isvisible+"]");
		return isvisible;
	}

	public boolean isEditable(String locator){
		writeConsole("isEditable["+locator+"]");
		boolean iseditable = selenium.isEditable(locator);
		writeConsole("Actual isEditable ["+iseditable+"]");
		return iseditable;
	}
	public Integer getXpathCount(String xpath){
		writeConsole("getXpathCount["+xpath+"]");
		int getxpathcount = selenium.getXpathCount(xpath).intValue();
		writeConsole("Actaul getXpathCount["+getxpathcount+"]");
		return getxpathcount;
	}
	public Integer getCssCount(String css){
		css = css.replace("css=", "");
		writeConsole("getCssCount["+css+"]");
		int getcsscount = selenium.getCssCount(css).intValue();
		writeConsole("Actaul getCssCount["+getcsscount+"]");
		return getcsscount;
	}

	public String getTitle(){
		String gettitle = selenium.getTitle();
		writeConsole("Actaul getTitle["+gettitle+"]");
		return gettitle;
	}

	public String getTable(String tablename,int row,int column){
		writeConsole("gettable["+tablename+"."+row+"."+column+"]");
		String gettable = selenium.getTable(tablename+"."+row+"."+column);
		writeConsole("Actual getTable["+gettable+"]");
		return gettable;
	}


	//==========================================================================================================================User Defined Functions	


	//This Function is used to Write Run Time Test data in the Excel Sheet(C:\Selenium\InputTestdata.xls) which is used by required Procedure.
	// This Function has two parameter 
	// Testdata - which  gets the Test data Value from Application and used by another procedure
	// Testdatalabel - which gets Test Data Label from QC(parameter) and used to label the Test Data in the Excel for easy to read.	

	public void Runtimedatawrite(String Testdata,String Testdatalabel) throws IOException, BiffException, RowsExceededException, WriteException{		
		Reporter.log("Proceed to Write Run time Data in Excel Sheet in the location 'C:/Selenium/InputTestdata.xls'");
		String filename = "C:/Selenium/InputTestdata.xls";
		Workbook existworkbook = Workbook.getWorkbook(new File(filename));
		WritableWorkbook workbook = Workbook.createWorkbook(new File(filename),existworkbook);
		WritableSheet sheet = workbook.getSheet("InputTestdata");		 
		try {
			//			 System.out.println("Read and Write");
			Cell tableStart=sheet.findCell(Testdatalabel);	
			//			 System.out.println("Table Value"+tableStart);
			int  readrow,readcol;
			readcol=tableStart.getColumn();
			readrow=tableStart.getRow();        
			Label Datalabel;
			Datalabel = new Label(readcol,readrow+1,Testdata);
			sheet.addCell(Datalabel);
			workbook.write();
			workbook.close();
		} catch (Exception e) {		
			//			System.out.println("Read and Write if not exist");
			int usedCol = sheet.getColumns();			 
			int usedrow = sheet.getRows();
			int runrow = usedrow-1;
//			System.out.println(" usedCol "+usedCol);
//			System.out.println(" usedrow "+usedrow );
//			System.out.println(" runrow "+runrow );
			Label Datalabel;
			Datalabel = new Label(usedCol,runrow-1,Testdatalabel);
			sheet.addCell(Datalabel);
			Label data;
			data = new Label(usedCol,runrow,Testdata);
			sheet.addCell(data);
			workbook.write();
			workbook.close();  
		}	    
	}


	// This function is used to Read Run Time Test Data From Excel Sheet(C:/Selenium/InputTestdata.xls) 
	// This function has one parameter 
	// datalabel - which gets the Test data Label from QC(parameter) and used to read Test Data from the Excel then used by required Procedures.	

	public static String Runtimedataread(String datalabel) throws Exception{
		Reporter.log("Proceed to Read Run time Data from Excel Sheet in the location (C:/Selenium/InputTestdata.xls)");
		String filename = "C:/Selenium/InputTestdata.xls";
		Workbook workbook = Workbook.getWorkbook(new File(filename));
		//Sheet sheet = workbook.getSheet("RunTimeData");	
		Sheet sheet = workbook.getSheet("InputTestdata");
		Cell tableStart=sheet.findCell(datalabel);
		int  Row,Col;
		Row=tableStart.getRow();
		Col=tableStart.getColumn();			 
		String Rundata = sheet.getCell(Col, Row+1).getContents().trim();			
		workbook.close();
		return Rundata;

	}

	// This Function is used to Select Recently Opened Window or Popup.
	public void recentPopupSelect(String windowname) throws Exception {
		Reporter.log("Proceed to select the ("+windowname+") popup");						
		String[] windowsOpen = selenium.getAllWindowNames();
		writeConsole("getAllWindowNames["+windowsOpen+"]");
		int wintotal = windowsOpen.length-1;
		//			System.out.println("Window lenght -->"+wintotal);
		//			for (int i = 0; i <= wintotal; i++) {
		//			System.out.println("Window for Loop -->"+windowsOpen[i]);
		//			}
		//			System.out.println("Window-->"+windowsOpen[wintotal]);
		if (wintotal>0) {			
			Reporter.log("Waiting for popup...");	
			writeConsole("waitForPopUp["+windowsOpen[wintotal]+", "+STANDARD_PAGE_LOAD_WAIT_TIME+"]");
			selenium.waitForPopUp(windowsOpen[wintotal], STANDARD_PAGE_LOAD_WAIT_TIME);
			Reporter.log("Popup Window is selected....");
			writeConsole("selectWindow[name="+windowsOpen[wintotal]+"]");
			selenium.selectWindow("name="+windowsOpen[wintotal]);	
		}else {
			writeFailure("("+windowname+") popup was Not Opened");
		}
	}

	// This Function is used to Select Recently Opened Window or Popup.
	public void recentPopupClose() throws Exception {
		Reporter.log("Proceed to Close All Opened Pop Ups");						
		String[] windowsOpen = selenium.getAllWindowNames();
		int wintotal = windowsOpen.length-1;
		//			System.out.println("Window lenght -->"+wintotal);
		//			for (int i = 0; i <= wintotal; i++) {
		//			System.out.println("Window for Loop -->"+windowsOpen[i]);
		//			}
		//			System.out.println("Window-->"+windowsOpen[wintotal]);
		if (wintotal>0) {			
			for (int i = wintotal; i>0; i--) {				
				selectWindow("name="+windowsOpen[i]);
				close();				
				selectMainWindow();
			}
		}
	}
	
	//	 This Method is used to get the ID of the Element by using its label where ID is Generated during Run-time(Dynamic ID) 
	//	and also get respective element from Property File and replace the element ID(Static ID) in Property file with Dynamic ID. 
	public String getElementIDbyLabel(String Label,String OR) throws Exception {
		//		System.out.println("Proceed to Get the Element ID by Its Label ");
		String FinaleleId = null;
		//		String eleText = selenium.getText("//label[contains]");
		//		String elementID = selenium.getAttribute("//label[text()=\""+Label+"\"]/@htmlfor"); // Getting Dynamic ID
		String elementID = selenium.getAttribute("//label[text()=\""+Label+"\"]/@for"); // Getting Dynamic ID
		//		String elementID = selenium.getAttribute("//label[text()='"+Label+"']/@for"); // Getting Dynamic ID
		//		System.out.println("First ID "+elementID);		
		String[] OrSplit = OR.split("'");
		//		System.out.println("First part 0 "+OrSplit[0]);
		//		System.out.println("First part 1 "+OrSplit[1]);
		//		System.out.println("First part 2 "+OrSplit[2]);
		FinaleleId = OrSplit[0]+"'"+elementID ; // replacing Element Static ID With Dynamic ID
		for (int i = 2; i < OrSplit.length; i++) {
			//			System.out.println("Array value  "+OrSplit[i]);
			FinaleleId = FinaleleId+"'"+OrSplit[i];	
			//			System.out.println("Total Element for loop  "+FinaleleId);
		}
		//		System.out.println("Total Element   "+FinaleleId);
		return FinaleleId;
	}

	//	 This Method is used to get the ID of the Element by using its label where ID is Generated during Run-time(Dynamic ID) 
	//	and also get respective element from Property File and replace the element ID(Static ID) in Property file with Dynamic ID. 
	public String getElementIDbyLabelContains(String LabelContains,String OR) throws Exception {
		//		System.out.println("Proceed to Get the Element ID by Its Label ");
		String FinaleleId = null;
		//		String eleText = selenium.getText("//label[contains]");
		//		String elementID = selenium.getAttribute("//label[text()=\""+Label+"\"]/@htmlfor"); // Getting Dynamic ID
		writeConsole("getAttribute[//label[contains(text(),\""+LabelContains+"\")]/@for]");
		String elementID = selenium.getAttribute("//label[contains(text(),\""+LabelContains+"\")]/@for"); // Getting Dynamic ID
		//		String elementID = selenium.getAttribute("//label[text()='"+Label+"']/@for"); // Getting Dynamic ID
		//		System.out.println("First ID "+elementID);		
		String[] OrSplit = OR.split("'");
		//		System.out.println("First part 0 "+OrSplit[0]);
		//		System.out.println("First part 1 "+OrSplit[1]);
		//		System.out.println("First part 2 "+OrSplit[2]);
		FinaleleId = OrSplit[0]+"'"+elementID ; // replacing Element Static ID With Dynamic ID
		for (int i = 2; i < OrSplit.length; i++) {
			//			System.out.println("Array value  "+OrSplit[i]);
			FinaleleId = FinaleleId+"'"+OrSplit[i];	
			//			System.out.println("Total Element for loop  "+FinaleleId);
		}
		//		System.out.println("Total Element   "+FinaleleId);
		return FinaleleId;
	}

	//	This Method is used to wait till object is Present
	public void waitForConditionisElementPresent(String OR,String wait){
		try {
			//			selenium.waitForCondition("selenium.isElementPresent("+OR+")", wait);
			writeConsole("waitForCondition[selenium.isElementPresent["+OR+"], "+wait+"]");
			selenium.waitForCondition("selenium.isElementPresent(\""+OR+"\")", wait);
		} catch (Exception e) {
			writeFailure("Element["+OR+"] was not Found after waiting for ("+wait+") Second'");
		}

	}

	//	This Method is used to wait till object is Present
	public void waitForConditionisElementNotPresent(String OR,String wait){
		try {
			//			selenium.waitForCondition("selenium.isElementPresent("+OR+")", wait);
			writeConsole("waitForCondition[!selenium.isElementPresent["+OR+"], "+wait+"]");
			selenium.waitForCondition("!selenium.isElementPresent(\""+OR+"\")", wait);
		} catch (Exception e) {
			writeFailure("Element["+OR+"] was not Found after waiting for ("+wait+") Second'");
		}

	}

	//	This Method is used to wait till object is Present
	public void waitForConditionisVisible(String OR,String elementname,String wait){
		try {
			//			selenium.waitForCondition("selenium.isElementPresent("+OR+")", wait);
			writeConsole("waitForCondition[selenium.isVisible["+OR+"], "+wait+"]");
			selenium.waitForCondition("selenium.isVisible(\""+OR+"\")", wait);			
		} catch (Exception e) {
			writeFailure("Element["+OR+"] was not Found after waiting for ("+wait+") Second'");
		}

	}


	//	This Method is used to Click 'Ok' Button in the Confirmation Pop up
	public void clickchooseokgetconfirmationpagepload(String OR) throws Exception {
		Reporter.log("Proceed to Click 'OK' button in Confirmation Popup");
		selenium.chooseOkOnNextConfirmation();
		click(OR);
		String confirmation = selenium.getConfirmation();
		Reporter.log("["+confirmation+"] Confirmation Pop up has been handled");
		waitForPageToLoad();	
	}


	public void verifyElementText(String element,String expectedtext,String elementname) throws Exception{
		Reporter.log("Verify Element("+elementname+") with Text("+expectedtext+")");
		if (isElementPresent(element)) {
			String actualtext = getText(element);
			System.out.println("Actual Text: "+actualtext);
			System.out.println("Expected Text: "+expectedtext);
			if (expectedtext.equals(actualtext.trim())) {
				//				if (expectedtext.equals(actualtext)) {
				Reporter.log("Element["+elementname+"] with ["+actualtext+"]Text was displayed correctly ");
				writeConsole("Element["+elementname+"] with ["+actualtext+"]Text was displayed correctly ");
			} else {
				writeFailure("Element["+elementname+"] with Actuals Text - ["+actualtext+"]Text did not match Expected Text - ["+expectedtext+"]");
			}

		} else {
			writeFailure("Element ["+elementname+" ] was Not Present");
		}
	}
	public void verifyText(String expectedtext,String actualtext, String elementname) throws Exception{
		Reporter.log("Verify Element("+elementname+") with Text("+expectedtext+")");
		if (actualtext.equals(expectedtext.trim())) {
			//				if (expectedtext.equals(actualtext)) {
			Reporter.log("Element["+elementname+"] with ["+actualtext+"]Text was displayed correctly ");
		} else {
			writeFailure("Element["+elementname+"] with Actuals Text - ["+actualtext+"]Text did not match Expected Text - ["+expectedtext+"]");
		}

	}
	public void verifyTextContains(String expectedtext,String actualtext, String elementname) throws Exception{
		Reporter.log("Verify Element("+elementname+") with Text("+expectedtext+")");
		if (actualtext.contains(expectedtext.trim())) {
			//				if (expectedtext.equals(actualtext)) {
			Reporter.log("Element["+elementname+"] Contains with Text ["+actualtext+"] was displayed correctly ");
		} else {
			writeFailure("Element["+elementname+"] Contains with Actuals Text - ["+actualtext+"] did not match Expected Text - ["+expectedtext+"]");
		}

	}

	public void verifyElementPresent(String element,String elementname) throws Exception{
		Reporter.log("Proceed to verify Element("+elementname+") was displayed correctly");
		if (isElementPresent(element)) {				
			Reporter.log("Element("+elementname+") was displayed correctly");
		} else {
			writeFailure("Element ["+elementname+" ] was Not displayed");
		}
	}

	public void verifyElementNotPresent(String element,String elementname) throws Exception{
		Reporter.log("Proceed to verify Element("+elementname+") was Not displayed correctly");
		if (!isElementPresent(element)) {				
			Reporter.log("Element("+elementname+") was Not displayed");
		} else {
			writeFailure("Element ["+elementname+" ] was displayed correctly");
		}
	}

	// This Method is used to wait for Three element
	public void waitForThreeElementPresent(String elementone,String elementonename,String elementtwo,String elementtwoname,String elementthree,String elementthreename) throws Exception{
		for (int second = 0;; second++) {
			// try catch block is used handle 'Permission Denied Error' when waiting for element
			try {											
				if (isElementPresent(elementone)) {
					break;					
				} else if(isElementPresent(elementtwo)){
					break;
				}else if (isElementPresent(elementthree)){
					break;
				}			
				if (second>=60) {
					writeFailure("Elements["+elementonename+" and "+elementtwoname+" and "+elementthreename+"] was Not Found after waiting for 1 Minute");
				}
			} catch (Exception e) {

			}
			Thread.sleep(1000);
		}	

	}

	// This Method is used to wait for Two element
	public void waitForTwoElementPresent(String elementone,String elementonename,String elementtwo,String elementtwoname) throws Exception{
		for (int second = 0;; second++) {
			// try catch block is used handle 'Permission Denied Error' when waiting for element
			try {											
				if (isElementPresent(elementone)) {
					break;					
				} else if(isElementPresent(elementtwo)){
					break;
				}			
				if (second>=60) {
					//					if (second>=10) {
					writeFailure("Elements["+elementonename+" and "+elementtwoname+"] was Not Found after waiting for 1 Minute");
				}
			} catch (Exception e) {

			}
			Thread.sleep(1000);
		}	

	}

	public void waitForTwoElementVisible(String elementone,String elementonename,String elementtwo,String elementtwoname) throws Exception{
		for (int second = 0;; second++) {
			// try catch block is used handle 'Permission Denied Error' when waiting for element
			try {											
				if (isVisible(elementone)) {
					break;					
				} else if(isVisible(elementtwo)){
					break;
				}			
				if (second>=60) {
					writeFailure("Elements["+elementonename+" and "+elementtwoname+"] was Not Found after waiting for 1 Minute");
				}
			} catch (Exception e) {

			}
			Thread.sleep(1000);
		}	

	}

	public void waitForThreeElementVisible(String elementone,String elementonename,String elementtwo,String elementtwoname,String elementthree,String elementthreename) throws Exception{
		for (int second = 0;; second++) {
			// try catch block is used handle 'Permission Denied Error' when waiting for element
			try {											
				if (isVisible(elementone)) {
					break;					
				} else if(isVisible(elementtwo)){
					break;
				}else if (isVisible(elementthree)){
					break;
				}			
				if (second>=60) {
					writeFailure("Elements["+elementonename+" and "+elementtwoname+" and "+elementthreename+"] was Not Visible after waiting for 1 Minute");
				}
			} catch (Exception e) {

			}
			Thread.sleep(1000);
		}	

	}

	// This Method is used to wait for two element
	public void waitForTwoElementNotPresent(String elementone,String elementonename,String elementtwo,String elementtwoname) throws Exception{
		for (int second = 0;; second++) {
			try {
				if (!isElementPresent(elementone)) {
					break;					
				} else if(!isElementPresent(elementtwo)){
					break;
				}				
				if (second>=60) {
					writeFailure("Elements["+elementonename+" and "+elementtwoname+"] was Not Found after waiting for 1 Minute");
				}
			} catch (Exception e) {

			}
			Thread.sleep(1000);
		}	

	}

	public void waitForErrorLogin(String elementone,String elementtwo,String elementthree) throws Exception{		
		for (int second = 0;; second++) {
			try {
				if (isElementPresent("//span[@class='help-inline field-validation-error']")){
					break;					
				} else if (isElementPresent("//div[@class='validation-summary-errors alert alert-error']")){
					break;
				} else if (isElementPresent("//a[text()='Log Off']")){
					break;
				}				
				if (second>=60) {
					writeFailure("1 Minute");
				}
			} catch (Exception e) {

			}			
			Thread.sleep(1000);
		}	

	}

	public void verifyElementValue(String element,String expectedvalue,String elementname) throws Exception{
		Reporter.log("Verify Element("+elementname+") with Value("+expectedvalue+")");
		if (isElementPresent(element)) {
			String actualvalue = getValue(element);
			if (expectedvalue.equals(actualvalue)) {
				Reporter.log("Element["+elementname+"] with ["+actualvalue+"]Value was displayed correctly ");
			} else {
				writeFailure("Element["+elementname+"] with Actuals Value - ["+actualvalue+"]did not match Expected Value - ["+expectedvalue+"]");
			}

		} else {
			writeFailure("Element ["+elementname+" ] was Not Present");
		}
	}

	public void verifyElementChecked(String element,String elementname) throws Exception{
		Reporter.log("Verify Element("+elementname+") is Checked");
		if (isElementPresent(element)) {			
			if (isChecked(element) == true) {
				Reporter.log("Element["+elementname+"] was Checked Correctly");
			} else {
				writeFailure("Element["+elementname+"] was Not Checked Correctly");
			}

		} else {
			writeFailure("Element ["+elementname+" ] was Not Present");
		}
	}

	public void verifyElementNotChecked(String element,String elementname) throws Exception{
		Reporter.log("Verify Element("+elementname+") is Not Checked");
		if (isElementPresent(element)) {			
			if (isChecked(element) == false) {
				Reporter.log("Element["+elementname+"] was Not Checked Correctly");
			} else {
				writeFailure("Element["+elementname+"] was Checked Correctly");
			}

		} else {
			writeFailure("Element ["+elementname+" ] was Not Present");
		}
	}

	public void verifyElementEnabled(String element,String elementname) throws Exception{
		Reporter.log("Verify Element("+elementname+") is Editable");
		if (isElementPresent(element)) {			
			if (isEditable(element) == true) {
				Reporter.log("Element["+elementname+"] was Editable Correctly");
			} else {
				writeFailure("Element["+elementname+"] was Not Editable Correctly");
			}

		} else {
			writeFailure("Element ["+elementname+" ] was Not Present");
		}
	}

	public void verifyElementDisabled(String element,String elementname) throws Exception{
		Reporter.log("Verify Element("+elementname+") is Disabled");
		if (isElementPresent(element)) {			
			if (!isEditable(element) == true) {
				Reporter.log("Element["+elementname+"] was Disabled Correctly");
			} else {
				writeFailure("Element["+elementname+"] was Not Disabled Correctly");
			}

		} else {
			writeFailure("Element ["+elementname+" ] was Not Present");
		}
	}
	//	This Method is used to Create 'back to detail' Link at end of the Summary
	public static void backtodetails(){
		Reporter.log("<p><a href=\"#Detail\">back to details</a></p>");
		Reporter.log("<hr noshade=\"noshade\"/> ");

	}

	//		This Method is used to Generate 'RED' color Message in Reporter Output Section if Fail 
	//		This Method also is used to Fail the Procedure
	public static void writeFailure(String failmessage){
		writeConsole("ERROR: "+failmessage);
		Reporter.log("<b><font size='3' color='Red'><strong>"+failmessage+"</strong></font></b>");
		Assert.fail(failmessage);
	}

	public void writeDetails(){
		// this is used write Procedure Name
		Reporter.log("<tr><td><b><font size='4' color='Green'><a id=\"m"+golbalProcedureOrder+"\"\">Procedure Name - "+procedurename+"</a></font></b></td></tr>");

		// this is used write Execution Order			
		Reporter.log("<b><font size='3' color='Green'>Procedure No. - "+golbalProcedureOrder+"</font></b>");

		// Below Code is used write parameter Table

		String paramtername = "<table border=\"3\" cellspacing=\"0\"<tr>";
		for (int i = 0; i < parameternames.length; i++) {
			paramtername = paramtername+"<td><b><font size='4' align=\"left\" color='Black'><Strong>"+ parameternames[i] +"</Strong></font></b></td>";
		}

		String paramtervalue = "<tr>";
		for (int i = 0; i < datacontainer.length; i++) {
			paramtervalue = paramtervalue+"<td><b><font size='4' align=\"left\" color='Black'>" + datacontainer[i] + "</font></b></td>";
		}		
		Reporter.log(paramtername);
		Reporter.log(paramtervalue);
		Reporter.log("</table>");

	}

	public static void writeConsole(String message){
		System.out.println("INFO: "+message);			
	}



	//	 	This Method is used to concat value with current date and Time in Millisecond		
	public String concatDateMilliSecond(String value){
		Date date = new Date();
		DateFormat dateformat = new SimpleDateFormat();
		String valuedatemillisec = value+dateformat.format(date)+Calendar.getInstance().getTimeInMillis();
		return valuedatemillisec;
	}

	//		This Method is used to concat value with current Time in Millisecond		
	public String concatMilliSecond(String value){
		String valuemillisec = value+Calendar.getInstance().getTimeInMillis();
		return valuemillisec;
	}

	//		public void verifyElementVisible(String element,String elementname){
	//			Reporter.log("Proceed to verify Element("+elementname+") was displayed correctly");
	//			if (isVisible(element)) {				
	//				Reporter.log("Element("+elementname+") was displayed correctly");
	//			} else {
	//				writeFailure("Element ["+elementname+"] was Not displayed");
	//			}
	//		}


	//		Note: 'isElementPresent'- it will check to element if not present it will go to else part and failure statement.
	//		'isVisible' - if element is not present it will throw exeception(Xpath Not Found) and not go else part and failure statement.  
	public void verifyElementVisible(String element,String elementname) throws Exception{
		Reporter.log("Proceed to verify Element("+elementname+") was displayed correctly");
		if(isElementPresent(element)){
			if (isVisible(element)) {				
				Reporter.log("Element("+elementname+") was displayed correctly");
			} else {
				writeFailure("Element ["+elementname+"] was Not Visible");
			}
		} else {
			writeFailure("Element ["+elementname+"] was Not Displayed");
		}	
	}

	public void verifyElementNotVisible(String element,String elementname) throws Exception{
		Reporter.log("Proceed to verify Element("+elementname+") is Not Visisbled");
		if(isElementPresent(element)){
			if (!isVisible(element)) {				
				Reporter.log("Element("+elementname+") was Not Visisbled");
			} else {
				writeFailure("Element ["+elementname+"] was Visibled");
			}
		} else {
			writeFailure("Element ["+elementname+"] was Not Displayed");
		}	
	}

	//		This Method is used to Verify table Cell Value with respective to Coulumn Name and another Row Cell Data
	public void verifyCellValuewithColumnName(String cellvalue,String columnname,String expectedcellvalue){
		Reporter.log("Proceed to Verify Table Row Data["+expectedcellvalue+"] with respective to  Column Name ["+columnname+"] and  Row Data["+cellvalue+"] ");
		String actualcellvalue = getText("//tr[td[text()='"+cellvalue+"']]/td[count(ancestor::table/thead/tr/th[contains(text(),'"+columnname+"')]/preceding-sibling::th)+1]");
		if (actualcellvalue.equals(expectedcellvalue)) {
			Reporter.log("Table Row Data["+expectedcellvalue+"] with respective to  Column Name ["+columnname+"] and  Row Data["+cellvalue+"] was displayed Correctly");
		} else {
			writeFailure("Table Row Data["+expectedcellvalue+"] with respective to  Column Name ["+columnname+"] and  Row Data["+cellvalue+"] was Not displayed Correctly");
		}			
	}

	public void verifyAllUserTableCellValuePresentInColumn(String expectedcellvalue,String columnname) throws Exception{
		Reporter.log("Proceed to Verify All User Table Row Data["+expectedcellvalue+"] is Present in the Column Name ["+columnname+"]");
		if (isElementPresent("//tr[td/div[text()='"+expectedcellvalue+"']]")) {	
			String actualcellvalue = getText("//tr[td/div[text()='"+expectedcellvalue+"']]/td[count(ancestor::table/thead/tr/th[contains(text(),'"+columnname+"')]/preceding-sibling::th)+1]");
			if (actualcellvalue.equals(expectedcellvalue)) {
				Reporter.log("All User Table Row Data["+expectedcellvalue+"] with respective to  Column Name ["+columnname+"] was displayed Correctly");
			} 
			else {
				writeFailure("All User Table Row Data["+expectedcellvalue+"] with respective to  Column Name ["+columnname+"] was Not displayed Correctly");
			}
		}else {
			writeFailure("All User Table Row Data["+expectedcellvalue+"] with respective to  Column Name ["+columnname+"] was Not displayed Correctly");
		}			
	}
	public void verifyAllUserTableCellValuePresentInConnectContactEditLogColumn(String expectedcellvalue,String columnname) throws Exception{
		Reporter.log("Proceed to Verify All User Table Row Data["+expectedcellvalue+"] is Present in the Column Name ["+columnname+"]");
		if (isElementPresent("//tr[td[text()='"+expectedcellvalue+"']]")) {	
			String actualcellvalue = getText("//tr[td[text()='"+expectedcellvalue+"']]/td[count(ancestor::table/thead/tr/th[contains(text(),'"+columnname+"')]/preceding-sibling::th)+1]");
			if (actualcellvalue.equals(expectedcellvalue)) {
				Reporter.log("All User Table Row Data["+expectedcellvalue+"] with respective to  Column Name ["+columnname+"] was displayed Correctly");
			} 
			else {
				writeFailure("All User Table Row Data["+expectedcellvalue+"] with respective to  Column Name ["+columnname+"] was Not displayed Correctly");
			}
		}else {
			writeFailure("All User Table Row Data["+expectedcellvalue+"] with respective to  Column Name ["+columnname+"] was Not displayed Correctly");
		}			
	}

	public void verifyAllUserTableCellValueNotPresentInColumn(String expectedcellvalue,String columnname) throws Exception{
		Reporter.log("Proceed to Verify All User Table Row Data["+expectedcellvalue+"] is Not Present in the Column Name ["+columnname+"]");
		if (isElementPresent("//tr[td/div[text()='"+expectedcellvalue+"']]")) {			
			String actualcellvalue = getText("//tr[td/div[text()='"+expectedcellvalue+"']]/td[count(ancestor::table/thead/tr/th[contains(text(),'"+columnname+"')]/preceding-sibling::th)+1]");
			if (!actualcellvalue.equals(expectedcellvalue)) {
				Reporter.log("All User Table Row Data["+expectedcellvalue+"] with respective to  Column Name ["+columnname+"] was Not displayed Correctly");
			} 
			else {
				writeFailure("All User Table Row Data["+expectedcellvalue+"] with respective to  Column Name ["+columnname+"] was displayed Correctly");
			}
		}else {
			writeFailure("All User Table Row Data["+expectedcellvalue+"] with respective to  Column Name ["+columnname+"] was displayed Correctly");
		}			
	}

	public void verifyIsTextPresent(String text){
		Reporter.log("Proceed to Verify Text["+text+"] was displaying Correctly");
		if (isTextPresent(text)) {
			Reporter.log("Text["+text+"] was displayed Correctly");
		} else {
			writeFailure("Text["+text+"] was Not displayed Correctly");
		}
	}

	public String getAttribute(String element,String attribute){
		writeConsole("getAttribute["+element+"/@"+attribute+"]");
		String attributevalue = selenium.getAttribute(element+"/@"+attribute);
		writeConsole(" Actual getAttribute["+attributevalue+"]");
		return attributevalue;
	}
	public String getAttributeusingcss(String element,String attribute){
		writeConsole("getAttribute["+element+"@"+attribute+"]");
		String attributevalue = selenium.getAttribute(element+"@"+attribute);
		writeConsole(" Actual getAttribute["+attributevalue+"]");
		return attributevalue;
	}
	public void openAndWait(String url){
		writeConsole("open["+url+"]");
		selenium.open(url);
		waitForPageToLoad();
	}

	public void verifyElementContainsText(String element,String expectedtext,String elementname) throws Exception{
		Reporter.log("Verify Element("+elementname+") Contains Text("+expectedtext+")");
		if (isElementPresent(element)) {
			String actualtext = getText(element);
			if (actualtext.contains(expectedtext)) {
				Reporter.log("Element["+elementname+"] Contains ["+expectedtext+"]Text was displayed correctly ");
			} else {
				writeFailure("Element["+elementname+"] Contains Actuals Text - ["+actualtext+"]Text did not match Expected Text - ["+expectedtext+"]");
			}

		} else {
			writeFailure("Element ["+elementname+" ] was Not Present");
		}
	}

	public void verifyElementVisibleContainsText(String element,String expectedtext,String elementname) throws Exception{
		Reporter.log("Verify Element("+elementname+") Contains Text("+expectedtext+")");
		if (isVisible(element)) {
			String actualtext = getText(element);
			if (actualtext.contains(expectedtext)) {
				Reporter.log("Element["+elementname+"] Contains ["+expectedtext+"]Text was displayed correctly ");
			} else {
				writeFailure("Element["+elementname+"] Contains Actuals Text - ["+actualtext+"]Text did not match Expected Text - ["+expectedtext+"]");
			}

		} else {
			writeFailure("Element ["+elementname+" ] was Not Visible");
		}
	}

	public void verifyElementVisibleText(String element,String expectedtext,String elementname) throws Exception{
		Reporter.log("Verify Element("+elementname+") Contains Text("+expectedtext+")");
		if (isVisible(element)) {
			String actualtext = getText(element);
			if (actualtext.equals(expectedtext)) {
				Reporter.log("Element["+elementname+"] with its ["+expectedtext+"]Text was displayed correctly ");
			} else {
				writeFailure("Element["+elementname+"] with its Actuals Text - ["+actualtext+"]Text did not match Expected Text - ["+expectedtext+"]");
			}

		} else {
			writeFailure("Element ["+elementname+" ] was Not Visible");
		}
	}

	//		public void verifyElementVisibleContainsText(String element,String expectedtext,String elementname) throws Exception{
	//			Reporter.log("Verify Element("+elementname+") Contains Text("+expectedtext+")");
	//			if (isVisible(element)) {
	//				String actualtext = getText(element);
	//				if (actualtext.contains(expectedtext)) {
	//					Reporter.log("Element["+elementname+"] contains ["+expectedtext+"]Text was displayed correctly ");
	//				} else {
	//					writeFailure("Element["+elementname+"] contains Actuals Text - ["+actualtext+"]Text did not match Expected Text - ["+expectedtext+"]");
	//				}
	//				
	//			} else {
	//				writeFailure("Element ["+elementname+" ] was Not Visible");
	//			}
	//		}

	public void waitForElementVisibleVerifyText(String element,String expectedtext,String elementname)throws Exception{
		Reporter.log("Verify Element("+elementname+") is Visible and  its Text("+expectedtext+")");
		for (int second = 0;;second ++) {
			try {// try catch block is used handle 'Permission Denied Error' when waiting for element
				if (second>=120) {
					writeFailure("Element["+elementname+"] was not Visible");
				}
				if (isVisible(element)) {
					String actualtext = getText(element);
					if (actualtext.equals(expectedtext)) {
						Reporter.log("Element["+elementname+"] with its ["+expectedtext+"]Text was Visibled correctly ");
						break;
					} else {
						writeFailure("Element["+elementname+"] with its Actuals Text - ["+actualtext+"] did not match Expected Text - ["+expectedtext+"]");
					}					

				}
			} catch (Exception e) {

			}
			//				Thread.sleep(1000);			
		}		
	}


	public String waitForElementVisibleGetText(String element,String elementname)throws Exception{
		Reporter.log("Verify Element("+elementname+") is Visible and Get Element Text");
		String actualtext;			
		for (int second = 0;;second++) {
			try {// try catch block is used handle 'Permission Denied Error' when waiting for element
				if (second>=120) {
					writeFailure("Element["+elementname+"] was not Present");
				}
				if (isElementPresent(element)) {
					if (isVisible(element)) {
						actualtext = getText(element);
						return actualtext;						
					}
				}
			} catch (Exception e) {

			}

		}



	}


	public void waitForElementPresentVerifyText(String element,String expectedtext,String elementname)throws Exception{
		Reporter.log("Verify Element("+elementname+") is Present and  its Text("+expectedtext+")");
		for (int second = 0;;second ++) {
			try {// try catch block is used handle 'Permission Denied Error' when waiting for element
				if (second>=120) {
					writeFailure("Element["+elementname+"] was not Present");
				}
				if (isElementPresent(element)) {
					String actualtext = getText(element);
					if (actualtext.equals(expectedtext)) {
						Reporter.log("Element["+elementname+"] with its ["+expectedtext+"]Text was Present correctly ");
						break;
					} else {
						writeFailure("Element["+elementname+"] with its Actuals Text - ["+actualtext+"] did not match Expected Text - ["+expectedtext+"]");
					}					

				}
			} catch (Exception e) {

			}
			Thread.sleep(500);			
		}		
	}


	public void waitVerifyForElementNotPresent(String element,String elementname)throws Exception{
		Reporter.log("Wait and verify Element("+elementname+") was Not displayed correctly");
		for (int second = 0;;second ++) {
			try {// try catch block is used handle 'Permission Denied Error' when waiting for element
				if (second>=120) {
					writeFailure("Element["+elementname+"] was displayed after waiting for 2 Minute");
				}
				if (!isElementPresent(element)) {
					Reporter.log("Element("+elementname+") was Not displayed");
					break;
				}
			} catch (Exception e) {

			}
			Thread.sleep(1000);			
		}
	}

	public void waitVerifyForElementPresent(String element,String elementname)throws Exception{
		Reporter.log("Wait and verify Element("+elementname+") was displayed correctly");
		for (int second = 0;;second ++) {
			try {// try catch block is used handle 'Permission Denied Error' when waiting for element
				if (second>=120) {
					writeFailure("Element["+elementname+"] was Not displayed after waiting for 2 Minute");
				}
				if (isElementPresent(element)) {
					Reporter.log("Element("+elementname+") was displayed correctly");
					break;
				}
			} catch (Exception e) {

			}
			Thread.sleep(1000);			
		}



	}

	public void waitForElementVisibleVerifyTextContains(String element,String expectedtext,String elementname)throws Exception{
		Reporter.log("Verify Element("+elementname+") is Visible and  its Contain Text("+expectedtext+")");
		for (int second = 0;;second ++) {
			try {// try catch block is used handle 'Permission Denied Error' when waiting for element

				if (isVisible(element)) {
					String actualtext = getText(element);
					if (actualtext.contains(expectedtext)) {
						Reporter.log("Element["+elementname+"] Contains ["+expectedtext+"]Text was Visibled correctly ");
						break;
					} else {
						writeFailure("Element["+elementname+"] Contains Actuals Text - ["+actualtext+"] did not match Expected Text - ["+expectedtext+"]");
					}					

				}
				if (second>=120) {
					writeFailure("Element["+elementname+"] was not Visible");
				}
			} catch (Exception e) {

			}
			Thread.sleep(500);			
		}		
	}

	public void waitForElementVisibleVerifyTextContainsMessage(String element,String expectedtext,String elementname)throws Exception{
		Reporter.log("Verify Element("+elementname+") is Visible and  its Contain Text("+expectedtext+")");
		for (int second = 0;;second ++) {
			try {// try catch block is used handle 'Permission Denied Error' when waiting for element

				if (isVisible(element)) {
					//						int csscount = getCssCount(element);
					//						writeConsole("Message Count "+csscount);
					String actualtext = getText(element);
					if (actualtext.contains(expectedtext)) {
						Reporter.log("Element["+elementname+"] Contains ["+expectedtext+"]Text was Visibled correctly ");
						break;
					} else {
						writeFailure("Element["+elementname+"] Contains Actuals Text - ["+actualtext+"] did not match Expected Text - ["+expectedtext+"]");
					}					

				}
				if (second>=120) {
					writeFailure("Element["+elementname+"] was not Visible");
				}
			} catch (Exception e) {

			}

		}		
	}
	public void waitforElementVisibleandNotVisible(String elementone,String elementonename,String elementtwo,String elementtwoname)throws Exception{
		Reporter.log("Wait for Element["+elementonename+"] visible and Wait for Element["+elementtwoname+"] Not Visible");
		for (int second = 0;;second ++) {
			try {// try catch block is used handle 'Permission Denied Error' when waiting for element
				if (second>=120) {
					writeFailure("Element["+elementonename+"] visible and Element["+elementtwoname+"] Not Visible was Not Occuring");
				}
				if (isVisible(elementone)) {
					//						Reporter.log("Element("+elementname+") was displayed correctly");
					break;
				}else if (!isVisible(elementtwo)) {
					break;
				}
			} catch (Exception e) {

			}
			Thread.sleep(500);			
		}



	}

	public void verifyElementWithTitle(String element,String expectedtitle,String elementname) throws Exception{
		Reporter.log("Verify Element("+elementname+") With Title Text("+expectedtitle+")");
		if (isElementPresent(element)) {
			String actualtile = getAttribute(element, "title");
			if (expectedtitle.equals(actualtile)) {
				Reporter.log("Element["+elementname+"] With Title Text["+actualtile+"] was displayed correctly ");
			} else {
				writeFailure("Element["+elementname+"] With Actuals Title Text - ["+actualtile+"]Text did not match Expected Title Text - ["+expectedtitle+"]");
			}

		} else {
			writeFailure("Element ["+elementname+" ] was Not Present");
		}
	}

	public void verifyPageTitle(String expectedpagetitle) throws Exception{
		Reporter.log("Verify Page Title as ["+expectedpagetitle+"]");
		String actualpagetile = getTitle();
		if (actualpagetile.equals(expectedpagetitle)) {
			Reporter.log("Page with Title["+actualpagetile+"] was displayed Correctly");
		} else {
			writeFailure("Page With Actual Title - ["+actualpagetile+"] did not Match Expected Title - ["+expectedpagetitle+"]");
		}
	}


	//		This Method is Used number of columns and number of Values

	public void verifyAllUserTableCellValuesPresentInColumns(String columnnames,String expectedcellvalues) throws Exception{
		String[] expCellValuesArray = expectedcellvalues.split(";");
		String[] columnNamesArray = columnnames.split(";");			
		for (int i = 0; i < columnNamesArray.length; i++) {
			Reporter.log("Proceed to Verify All User Table Row Data["+expCellValuesArray[i]+"] is Present in the Column Name ["+columnNamesArray[i]+"]");
			if (isElementPresent("//tr[td/div[text()='"+expCellValuesArray[i]+"']]")) {	
				String actualcellvalue = getText("//tr[td/div[text()='"+expCellValuesArray[0]+"']]/td[count(ancestor::table/thead/tr/th[contains(text(),'"+columnNamesArray[i]+"')]/preceding-sibling::th)+1]");
				if (actualcellvalue.equals(expCellValuesArray[i])) {
					Reporter.log("All User Table Row Data["+expCellValuesArray[i]+"] with respective to  Column Name ["+columnNamesArray[i]+"] was displayed Correctly");
				} 
				else {
					writeFailure("All User Table Row Data["+expCellValuesArray[i]+"] with respective to  Column Name ["+columnNamesArray[i]+"] was Not displayed Correctly");
				}
			}else {
				writeFailure("All User Table Row Data["+expCellValuesArray[i]+"] with respective to  Column Name ["+columnNamesArray[i]+"] was Not displayed Correctly");
			}	
		}


	}


	public String requiredDateAndFormat(String dateFormat,String date) throws ParseException{ // MM/dd/yyyy - 9/10/2012
		String returndate = null;
		DateFormat dateformat = new SimpleDateFormat(dateFormat);
		Calendar calendar = Calendar.getInstance();			
		if (date.equals("Today")) {
			returndate = dateformat.format(calendar.getTime()).toString();	
		}else if (date.contains("Today+")) {
			//				String datePlus = date.replace("+", ";");
			String[] dateSplit = date.split("\\+");
			int plusDayCount =  Integer.parseInt(dateSplit[1]);
			calendar.add(Calendar.DATE,plusDayCount);				
			returndate = dateformat.format(calendar.getTime()).toString();
			System.out.print("Date Formate"+returndate);
		}else if (date.contains("Today-")) {
			//				String dateMinus = date.replace("-", ";");
			String[] dateSplit = date.split("\\-");
			int minusDayCount =  Integer.parseInt("-"+dateSplit[1]);
			calendar.add(Calendar.DATE,minusDayCount);
			returndate = dateformat.format(calendar.getTime()).toString();
		}else if (date.contains("Month+")) {
			//				String datePlus = date.replace("+", ";");
			String[] monthSplit = date.split("\\+");
			int plusMonthCount =  Integer.parseInt(monthSplit[1]);
			calendar.add(Calendar.MONTH,plusMonthCount);				
			returndate = dateformat.format(calendar.getTime()).toString();
			System.out.print("Month Plus Format"+returndate);
		}else if (date.contains("Month-")) {
			//				String dateMinus = date.replace("-", ";");
			String[] monthSplit = date.split("\\-");
			int minusmonthCount =  Integer.parseInt("-"+monthSplit[1]);
			calendar.add(Calendar.MONTH,minusmonthCount);
			returndate = dateformat.format(calendar.getTime()).toString();
			System.out.print("Month Minus Format"+returndate);
		}else {
			if (dateFormat.equals("dd/MM/yyyy")) { // this conversion is to Work on UK Instance
				String[] datasplit = date.split("/");					
				returndate = datasplit[1]+"/"+datasplit[0]+"/"+datasplit[2];
			}else if (dateFormat.equals("MM/dd/yyyy")) {// this conversion is to Work on US Instance
				returndate = date;
			}

			//				Date dateconvert = new SimpleDateFormat("MM/dd/yyyy").parse(date);
			//				SimpleDateFormat simple = new SimpleDateFormat("dd/MM/yyyy");
			//				returndate = simple.format(dateconvert);
			//				returndate = dateformat.format(dateconvert).toString();
		}			
		return returndate;
	}

	//		This Procedure is used to get row based on row value repective to column Names

	public String getrownumberbasedonrowvaluecloumnname(String tablename,String ColumnNames,String Rowvalues){
		String rownumber = null;
		String[] ColumnNamesArray = ColumnNames.split(";");  ///expected colmn names in a array from qc
		String[] RowvaluesArray = Rowvalues.split(";"); //////expected record values
		ArrayList<Integer> columnnumber = new ArrayList<Integer>();
		int columncount = getXpathCount(tablename+"/thead/tr/th");			
		for (int i = 0; i < ColumnNamesArray.length; i++) {		
			String column = "NotFound";
			for (int j = 0; j < columncount; j++) {	
				//					writeConsole("getTable["+tablename+".0."+j+"]");
				//					String currentcoulmnName = selenium.getTable(tablename+".0."+j);
				String currentcoulmnName = getTable(tablename,0,j);
				//					writeConsole("Actual getTable["+currentcoulmnName+"]");
				if (currentcoulmnName.equals(ColumnNamesArray[i])) {
					columnnumber.add(j);
					column = "Found";
					break;
				}
			}			
			if (column.equals("NotFound")) {					
				writeFailure("Column Name["+ColumnNamesArray[i]+"] was Not Found in the Table");
			}
		}				
		//				int columncounter = 0;
		String data = "NotFound";
		int k;
		int rowcount = getXpathCount(tablename+"/tbody/tr");
		for (k = 1; k <= rowcount; k++) {					
			for (int x = 0; x < columnnumber.size(); x++) {
				//							String currentrowvalue = selenium.getTable(tablename+"."+k+"."+columnnumber.get(x));
				String currentrowvalue = getTable(tablename,k,columnnumber.get(x));
				if (currentrowvalue.equals(RowvaluesArray[x])) {
					data = "Found";

				}else {
					data = "NotFound";
					break; // moving to next row
				}
			}
			if (data.equals("Found")) {
				break;
			}
		}
		if (data.equals("NotFound")) {
			writeFailure("Row Values["+Rowvalues+"] was Not Found in the Table ");
		}
		if (data.equals("Found")) {
			rownumber = String.valueOf(k);
		}






		return rownumber;
	}

	public String getrownumberbasedonrowvaluecloumnnameusingcss(String tablename,String ColumnNames,String Rowvalues) throws Exception{
		String rownumber = null;
		String[] ColumnNamesArray = ColumnNames.split(";");  ///expected colmn names in a array from qc
		String[] RowvaluesArray = Rowvalues.split(";"); //////expected record values
		ArrayList<Integer> columnnumber = new ArrayList<Integer>();
		waitForElementPresent(tablename+">thead>tr>th", "Table First Column");
		waitForElementVisible(tablename+">thead>tr>th", "Table First Column");
		int columncount = getCssCount(tablename+">thead>tr>th");	
		for (int i = 0; i < ColumnNamesArray.length; i++) {		
			String column = "NotFound";
			for (int j = 0; j < columncount; j++) {					
				//					String currentcoulmnName = selenium.getTable(tablename+".0."+j);

				String currentcoulmnName = getTable(tablename,0,j);
				if (currentcoulmnName.equals(ColumnNamesArray[i])) {
					columnnumber.add(j);
					column = "Found";
					break;
				}
			}			
			if (column.equals("NotFound")) {					
				writeFailure("Column Name["+ColumnNamesArray[i]+"] was Not Found in the Table");
			}
		}				
		//				int columncounter = 0;
		String data = "NotFound";
		int k;
		int rowcount = getCssCount(tablename+">tbody>tr");
		for (k = 1; k <= rowcount; k++) {					
			for (int x = 0; x < columnnumber.size(); x++) {
				//							String currentrowvalue = selenium.getTable(tablename+"."+k+"."+columnnumber.get(x));
				String currentrowvalue = getTable(tablename,k,columnnumber.get(x));
				if (currentrowvalue.equals(RowvaluesArray[x])) {
					data = "Found";

				}else {
					data = "NotFound";
					break; // moving to next row
				}
			}
			if (data.equals("Found")) {
				break;
			}
		}
		if (data.equals("NotFound")) {
			writeFailure("Row Values["+Rowvalues+"] was Not Found in the Table ");
		}
		if (data.equals("Found")) {
			rownumber = String.valueOf(k);
		}






		return rownumber;
	}

	//		This Procedure is used to Verify row value repective to column Names in the Table

	public void verifyrowvalueswithcolumnNames(String tablename,String ColumnNames,String Rowvalues) throws Exception{			
		String[] ColumnNamesArray = ColumnNames.split(";");  ///expected colmn names in a array from qc
		String[] RowvaluesArray = Rowvalues.split(";"); //////expected record values
		ArrayList<Integer> columnnumber = new ArrayList<Integer>();
		waitForElementVisible(tablename+"/thead/tr/th", "Table First Column");
		int columncount = getXpathCount(tablename+"/thead/tr/th");			
		for (int i = 0; i < ColumnNamesArray.length; i++) {		
			String column = "NotFound";
			for (int j = 0; j < columncount; j++) {					
				//					String currentcoulmnName = selenium.getTable(tablename+".0."+j);
				String currentcoulmnName = getTable(tablename,0,j);
				if (currentcoulmnName.equals(ColumnNamesArray[i])) {
					columnnumber.add(j);
					column = "Found";
					break;
				}
			}			
			if (column.equals("NotFound")) {					
				writeFailure("Column Name["+ColumnNamesArray[i]+"] was Not Found in the Table");
			}
		}		
		String data = "NotFound";
		int k;
		int rowcount = getXpathCount(tablename+"/tbody/tr");
		for (k = 1; k <= rowcount; k++) {					
			for (int x = 0; x < columnnumber.size(); x++) {
				//					String currentrowvalue = selenium.getTable(tablename+"."+k+"."+columnnumber.get(x));
				String currentrowvalue = getTable(tablename,k,columnnumber.get(x));
				if (currentrowvalue.equals(RowvaluesArray[x])) {
					data = "Found";								
				}else {
					data = "NotFound";
					break; // moving to next row
				}
			}	
			if (data.equals("Found")) {
				break;
			}
		}
		if (data.equals("NotFound")) {
			writeFailure("Row Values["+Rowvalues+"] respect with Column["+ColumnNames+"] was Not Found in the Table ");
		}
		if (data.equals("Found")) {
			Reporter.log("Row Values["+Rowvalues+"] respect with Column["+ColumnNames+"] was Found in the Table ");
		}		
	}

	//		This Procedure is used to Verify row value is not present repective to column Names in the Table

	public void verifyNorowvalueswithcolumnNames(String tablename,String ColumnNames,String Rowvalues) throws Exception{			
		String[] ColumnNamesArray = ColumnNames.split(";");  ///expected colmn names in a array from qc
		String[] RowvaluesArray = Rowvalues.split(";"); //////expected record values
		ArrayList<Integer> columnnumber = new ArrayList<Integer>();
		waitForElementVisible(tablename+">thead/tr/th", "Table First Column");
		int columncount = getXpathCount(tablename+"/thead/tr/th");			
		for (int i = 0; i < ColumnNamesArray.length; i++) {		
			String column = "NotFound";
			for (int j = 0; j < columncount; j++) {					
				//					String currentcoulmnName = selenium.getTable(tablename+".0."+j);
				String currentcoulmnName = getTable(tablename,0,j);
				if (currentcoulmnName.equals(ColumnNamesArray[i])) {
					columnnumber.add(j);
					column = "Found";
					break;
				}
			}			
			if (column.equals("NotFound")) {					
				writeFailure("Column Name["+ColumnNamesArray[i]+"] was Not Found in the Table");
			}
		}		
		String data = "Found";
		int k;
		int rowcount = getXpathCount(tablename+"/tbody/tr");
		for (k = 1; k <= rowcount; k++) {					
			for (int x = 0; x < columnnumber.size(); x++) {
				//					String currentrowvalue = selenium.getTable(tablename+"."+k+"."+columnnumber.get(x));
				String currentrowvalue = getTable(tablename,k,columnnumber.get(x));
				if (!currentrowvalue.equals(RowvaluesArray[x])) {
					data = "Found";						
				}else {
					data = "NotFound";
					break; // moving to next row
				}
			}
			if (data.equals("Found")) {
				break;
			}
		}
		if (data.equals("Found")) {
			writeFailure("Row Values["+Rowvalues+"] respect with Column["+ColumnNames+"] was Found in the Table ");				
		}
		if (data.equals("NotFound")) {
			Reporter.log("Row Values["+Rowvalues+"] respect with Column["+ColumnNames+"] was Not Found in the Table ");
		}

	}

	public void verifycheckrownumberbasedonrowvaluecloumnnameusingcss(String tablename,String ColumnNames,String Rowvalues,String check) throws Exception{
		//			String rownumber = null;
		String[] ColumnNamesArray = ColumnNames.split(";");  ///expected colmn names in a array from qc
		String[] RowvaluesArray = Rowvalues.split(";"); //////expected record values
		ArrayList<Integer> columnnumber = new ArrayList<Integer>();
		waitForElementVisible(tablename+">thead>tr>th", "Table First Column");
		int columncount = getCssCount(tablename+">thead>tr>th");			
		for (int i = 0; i < ColumnNamesArray.length; i++) {		
			String column = "NotFound";
			for (int j = 0; j < columncount; j++) {					
				//					String currentcoulmnName = selenium.getTable(tablename+".0."+j);
				String currentcoulmnName = getTable(tablename,0,j);
				if (currentcoulmnName.equals(ColumnNamesArray[i])) {
					columnnumber.add(j);
					column = "Found";
					break;
				}
			}			
			if (column.equals("NotFound")) {					
				writeFailure("Column Name["+ColumnNamesArray[i]+"] was Not Found in the Table");
			}
		}				
		//				int columncounter = 0;
		String data = "NotFound";
		int k;
		int rowcount = getCssCount(tablename+">tbody>tr");
		for (k = 1; k <= rowcount; k++) {					
			for (int x = 0; x < columnnumber.size(); x++) {
				//							String currentrowvalue = selenium.getTable(tablename+"."+k+"."+columnnumber.get(x));
				String currentrowvalue = getTable(tablename,k,columnnumber.get(x));
				if (currentrowvalue.equals(RowvaluesArray[x])) {
					data = "Found";

				}else {
					data = "NotFound";
					break; // moving to next row
				}
			}
			if (data.equals("Found")) {
				break;
			}
		}
		if (data.equals("NotFound")) {
			writeFailure("Row Values["+Rowvalues+"] was Not Found in the Table ");
		}
		if (data.equals("Found")) {
			//					rownumber = String.valueOf(k);
			if (check.equalsIgnoreCase("Check")) {
				verifyElementChecked(tablename+">tbody>tr:nth-child("+k+")>td>input[type='checkbox']", "Row Values["+Rowvalues+"] respect with Column["+ColumnNames+"]");
			}else if (check.equalsIgnoreCase("Uncheck")) {
				verifyElementNotChecked(tablename+">tbody>tr:nth-child("+k+")>td>input[type='checkbox']", "Row Values["+Rowvalues+"] respect with Column["+ColumnNames+"]");
			}

		}






		//			return rownumber;
	}

	//		This Procedure is used to collect the table row value respective to Column Name and Store in array list
	public ArrayList<String> getrowvaluebasedoncloumnnameusingcss(String tablename,String ColumnNames) throws Exception{
		String column = "NotFound";
		int columnnumber;
		ArrayList<String> rowvalue = new ArrayList<String>();
		waitForElementVisible(tablename+">thead>tr>th:nth-child(2)", "Table Second Column");
		int columncount = getCssCount(tablename+">thead>tr>th");
		for (columnnumber= 0; columnnumber < columncount; columnnumber++) {					

			//				String currentcoulmnName = selenium.getTable(tablename+".0."+columnnumber);
			String currentcoulmnName = getTable(tablename,0,columnnumber);
			if (currentcoulmnName.equals(ColumnNames)) {
				column = "Found";
				break;					
			}
		}
		if (column.equals("NotFound")) {					
			writeFailure("Column Name["+ColumnNames+"] was Not Found in the Table");
		}

		int rowcount = getCssCount(tablename+">tbody>tr");
		for (int j = 1; j <= rowcount; j++) {
			//					String currentrowvalue = selenium.getTable(tablename+"."+j+"."+columnnumber);
			String currentrowvalue = getTable(tablename,j,columnnumber);
			rowvalue.add(currentrowvalue);						
		}


		return rowvalue;
	}
	// This method is used to Verify Expected array[contains before sort Table row value respective to column Name] with actual array[contains After sort[Ascending or Descending] Table row value respective to column Name] 
	public void veriftytableascendingdescendingorderbasedoncloumnnameusingcss(String tablenameor,String ColumnNames,ArrayList<String> expectedrowvalue,String arrayorder,String tablename) throws Exception{
		String column = "NotFound";
		int columnnumber;
		String actualrowvaluestring = "";
		String expectedrowvaluestring = "";
		ArrayList<String> actualrowvalue = new ArrayList<String>();			
		waitForElementVisible(tablenameor+">thead>tr>th", "Table First Column");
		int columncount = getCssCount(tablenameor+">thead>tr>th");
		for (columnnumber= 0; columnnumber < columncount; columnnumber++) {				
			//				String currentcoulmnName = selenium.getTable(tablenameor+".0."+columnnumber);
			String currentcoulmnName = getTable(tablenameor,0,columnnumber);
			if (currentcoulmnName.equals(ColumnNames)) {
				column = "Found";
				break;					
			}
		}
		if (column.equals("NotFound")) {					
			writeFailure("Column Name["+ColumnNames+"] was Not Found in the Table");
		}

		int rowcount = getCssCount(tablenameor+">tbody>tr");
		for (int j = 1; j <= rowcount; j++) {
			//					String currentrowvalue = selenium.getTable(tablenameor+"."+j+"."+columnnumber);
			String currentrowvalue = getTable(tablenameor,j,columnnumber);
			actualrowvalue.add(currentrowvalue);					
			actualrowvaluestring = actualrowvaluestring+currentrowvalue+";";
		}


		//		
		//			for (int k = 0;k<expectedrowvalue.size();k++) {
		//				expectedrowvaluestring = expectedrowvaluestring+expectedrowvalue.get(k)+";";
		//			}

		if (arrayorder.equalsIgnoreCase("Ascending")) {
			Collections.sort(expectedrowvalue);
			for (int k = 0;k<expectedrowvalue.size();k++) {
				expectedrowvaluestring = expectedrowvaluestring+expectedrowvalue.get(k)+";";
			}
			if (actualrowvalue.equals(expectedrowvalue)) {					
				Reporter.log("Table["+tablename+"] was sorted in Ascending Order["+actualrowvaluestring+"]");
			} else {
				writeFailure("Table["+tablename+"] was Not sorted in Ascending Order - Actual Order ["+actualrowvaluestring+"] did not match with Expected Order["+expectedrowvaluestring+"]");
			}

		}else if (arrayorder.equalsIgnoreCase("Descending")) {				
			Collections.sort(expectedrowvalue, Collections.reverseOrder());
			for (int k = 0;k<expectedrowvalue.size();k++) {
				expectedrowvaluestring = expectedrowvaluestring+expectedrowvalue.get(k)+";";
			}
			if (actualrowvalue.equals(expectedrowvalue)) {					
				Reporter.log("Table["+tablename+"] was sorted in Descending Order["+actualrowvaluestring+"]");
			} else {
				writeFailure("Table["+tablename+"] was Not sorted in Descending Order - Actual Order ["+actualrowvaluestring+"] did not match with Expected Order["+expectedrowvaluestring+"]");
			}

		}
	}

	public void verifytablerowcountusingcss(String tablenelement,String rowcount,String tablename){
		Reporter.log("Verify Table["+tablename+"] with Record["+rowcount+"] is displayed");
		int tablerowcount = getCssCount(tablenelement+">tbody>tr");
		if (tablerowcount == Integer.parseInt(rowcount)) {
			Reporter.log("Table ["+tablename+"] with Record["+tablerowcount +"] was displayed");
		} else {
			writeFailure("Table ["+tablename+"] with Actual Record["+tablerowcount +"] did not match with Expected Record["+rowcount+"]");
		}			
	}

	public void verifypagenavigated(String elementor,String expectedpage){
		Reporter.log("Verify its Navigated to Page Number["+expectedpage+"]");
		String actualactivepage = getText(elementor);			
		if (actualactivepage.equals(expectedpage)) {
			Reporter.log("Its Navigated to page Number["+actualactivepage+"]");
		} else {
			writeFailure("Its Navigated to Actual page Number["+actualactivepage+"] did not match with Expected Page Number["+expectedpage+"]");
		}			
	}

	//		public void pagenumberenabled(String pageelement,String pagenumber,String pagetopbottom) throws Exception {
	//			Reporter.log("Verify Pagination at ["+pagetopbottom+"] is Enabled or Selected with Page Number["+pagenumber+"]");
	//			if (isElementPresent(pageelement)) {
	//				Reporter.log("Pagination at ["+pagetopbottom+"] was Enabled or Selected with Page Number["+pagenumber+"]");
	//			} else {
	//				writeFailure("Pagination at ["+pagetopbottom+"] was Not Enabled or Selected with Page Number["+pagenumber+"]");
	//			}
	//			
	//		}

	//		 This Original Function without Null Verification

	//		public void verifyrowvalueswithcolumnNamesusingCSS(String tablename,String ColumnNames,String Rowvalues){			
	//			String[] ColumnNamesArray = ColumnNames.split(";");  ///expected colmn names in a array from qc
	//			String[] RowvaluesArray = Rowvalues.split(";"); //////expected record values
	//			ArrayList<Integer> columnnumber = new ArrayList<Integer>();
	//			int columncount = getCssCount(tablename+">thead>tr>th");			
	//			for (int i = 0; i < ColumnNamesArray.length; i++) {		
	//				String column = "NotFound";
	//				for (int j = 0; j < columncount; j++) {					
	//					String currentcoulmnName = selenium.getTable(tablename+".0."+j);
	//					if (currentcoulmnName.equals(ColumnNamesArray[i])) {
	//						columnnumber.add(j);
	//						column = "Found";
	//						break;
	//					}
	//				}			
	//				if (column.equals("NotFound")) {					
	//					writeFailure("Column Name["+ColumnNamesArray[i]+"] was Not Found in the Table");
	//				}
	//			}		
	//			String data = "NotFound";
	//			int k;
	//			int rowcount = getCssCount(tablename+">tbody>tr");
	//			for (k = 1; k <= rowcount; k++) {					
	//				for (int x = 0; x < columnnumber.size(); x++) {
	//					String currentrowvalue = selenium.getTable(tablename+"."+k+"."+columnnumber.get(x));
	//					if (currentrowvalue.equals(RowvaluesArray[x])) {
	//						data = "Found";								
	//					}else {
	//						data = "NotFound";
	//						break; // moving to next row
	//					}
	//				}	
	//				if (data.equals("Found")) {
	//					break;
	//				}
	//			}
	//			if (data.equals("NotFound")) {
	//				writeFailure("Row Values["+Rowvalues+"] respect with Column["+ColumnNames+"] was Not Found in the Table ");
	//			}
	//			if (data.equals("Found")) {
	//				Reporter.log("Row Values["+Rowvalues+"] respect with Column["+ColumnNames+"] was Found in the Table ");
	//			}		
	//		}

	public void verifyrowvalueswithcolumnNamesusingCSS(String tablename,String ColumnNames,String Rowvalues) throws Exception{			
		String[] ColumnNamesArray = ColumnNames.split(";");  ///expected colmn names in a array from qc
		String[] RowvaluesArray = Rowvalues.split(";"); //////expected record values
		ArrayList<Integer> columnnumber = new ArrayList<Integer>();
		waitForElementVisible(tablename+">thead>tr>th", "Table First Column");
		int columncount = getCssCount(tablename+">thead>tr>th");			
		for (int i = 0; i < ColumnNamesArray.length; i++) {		
			String column = "NotFound";
			for (int j = 0; j < columncount; j++) {					
				//					String currentcoulmnName = selenium.getTable(tablename+".0."+j);
				String currentcoulmnName = getTable(tablename,0,j);
				if (currentcoulmnName.equals(ColumnNamesArray[i])) {
					columnnumber.add(j);
					column = "Found";
					break;
				}
			}			
			if (column.equals("NotFound")) {					
				writeFailure("Column Name["+ColumnNamesArray[i]+"] was Not Found in the Table");
			}
		}		
		String data = "NotFound";

		int k;
		int rowcount = getCssCount(tablename+">tbody>tr");
		for (k = 1; k <= rowcount; k++) {					
			for (int x = 0; x < columnnumber.size(); x++) {
				//					String currentrowvalue = selenium.getTable(tablename+"."+k+"."+columnnumber.get(x));
				String currentrowvalue = getTable(tablename,k,columnnumber.get(x));
				if (RowvaluesArray[x].equalsIgnoreCase("Null")) { // Below code used to verify value is empty and make parameter value  'Null' to ""
					RowvaluesArray[x] = " ";
				}
				if (currentrowvalue.equals(RowvaluesArray[x])) {
					data = "Found";								
				}else {
					data = "NotFound";
					break; // moving to next row
				}
			}	
			if (data.equals("Found")) {
				break;
			}
		}
		if (data.equals("NotFound")) {
			writeFailure("Row Values["+Rowvalues+"] respect with Column["+ColumnNames+"] was Not Found in the Table ");
		}
		if (data.equals("Found")) {
			Reporter.log("Row Values["+Rowvalues+"] respect with Column["+ColumnNames+"] was Found in the Table ");
		}		
	}

	//		This Procedure is used to Verify row value is not present repective to column Names in the Table

	public void verifyNorowvalueswithcolumnNamesusingCSS(String tablename,String ColumnNames,String Rowvalues) throws Exception{			
		String[] ColumnNamesArray = ColumnNames.split(";");  ///expected colmn names in a array from qc
		String[] RowvaluesArray = Rowvalues.split(";"); //////expected record values
		ArrayList<Integer> columnnumber = new ArrayList<Integer>();
		waitForElementVisible(tablename+">thead>tr>th", "Table First Column");
		int columncount = getCssCount(tablename+">thead>tr>th");			
		for (int i = 0; i < ColumnNamesArray.length; i++) {		
			String column = "NotFound";
			for (int j = 0; j < columncount; j++) {					
				//					String currentcoulmnName = selenium.getTable(tablename+".0."+j);
				String currentcoulmnName = getTable(tablename,0,j);
				if (currentcoulmnName.equals(ColumnNamesArray[i])) {
					columnnumber.add(j);
					column = "Found";
					break;
				}
			}			
			if (column.equals("NotFound")) {					
				writeFailure("Column Name["+ColumnNamesArray[i]+"] was Not Found in the Table");
			}
		}		
		String data = "Found";
		int k;
		int rowcount = getCssCount(tablename+">tbody>tr");
		for (k = 1; k <= rowcount; k++) {					
			for (int x = 0; x < columnnumber.size(); x++) {
				//					String currentrowvalue = selenium.getTable(tablename+"."+k+"."+columnnumber.get(x));
				String currentrowvalue = getTable(tablename,k,columnnumber.get(x));
				if (RowvaluesArray[x].equalsIgnoreCase("Null")) { // Below code used to verify value is empty and make parameter value  'Null' to ""
					RowvaluesArray[x] = " ";
				}
				if (currentrowvalue.equals(RowvaluesArray[x])) {
					data = "Found";					
				}else {
					data = "NotFound";
					break; // moving to next row				
				}
			}
			if (data.equals("Found")) {
				break;
			}
		}
		if (data.equals("Found")) {
			writeFailure("Row Values["+Rowvalues+"] respect with Column["+ColumnNames+"] was Found in the Table ");				
		}
		if (data.equals("NotFound")) {
			Reporter.log("Row Values["+Rowvalues+"] respect with Column["+ColumnNames+"] was Not Found in the Table ");
		}

	}

	public void verifycolumnNamesSortedInOrderusingCSS(String tablename,String ColumnNames,int StartColumnPosition) throws Exception{			
		String[] ColumnNamesArray = ColumnNames.split(";");  ///expected colmn names in a array from qc			
		waitForElementVisible(tablename+">thead>tr>th", "Table First Column");
		//			int columncount = getCssCount(tablename+">thead>tr>th");			
		for (int i = 0; i < ColumnNamesArray.length; i++) {
			int columnOrder = i+StartColumnPosition-1; //  i - for Loop - StartColumnPosition - Parameter - '-1' for Table Start Column with 1 instead of '0'
			//				String currentcoulmnName = selenium.getTable(tablename+".0."+columnOrder);
			String currentcoulmnName = getTable(tablename,0,columnOrder);
			if (currentcoulmnName.equals(ColumnNamesArray[i])) {
				Reporter.log("Column Name["+ColumnNamesArray[i]+"] with Order["+(i+1)+"] was displayed correctly in the Table");
			} else {
				writeFailure("Column Name["+ColumnNamesArray[i]+"]  with Order["+(i+1)+"] was Not displayed in the Table");
			}
		}

	}

	//		 This Method is used to get row count of the respective element and getting 
	//		Text then Matching with expected Text.
	//		Provide absolute CSS of the Element and using its Index to Match.
	//		This Procedure is Used find Element Row Number using its Text // NO Table Structure		
	public String getrownumberbasedonrowvalueusingcss(String element,String rowvalue) throws Exception{	
		int i;
		String rowcount = "NotFound";
		int elementcount = getCssCount(element).intValue();
		for (i = 0; i < elementcount; i++) {
			String actualrowvalue = getText(element+":eq("+i+")");
			if (actualrowvalue.equals(rowvalue)) {
				i = i+1;
				rowcount = "Found";
				break;
			}
		}	
		if (rowcount.equals("NotFound")) {
			writeFailure("Row Value["+rowvalue+"] was Not Found");				
		}
		return String.valueOf(i);
	}

	public void typeusingkeyboard(String locator,String value){
		//			Reporter.log("Step 2 - Enter Label as ["+label+"]");
		String valueSplit = value.substring(0, value.length()-1);
		focus(locator);			
		type(locator, valueSplit);	
		int valueassic = value.toUpperCase().charAt(value.length()-1); // used to convert uppercase because Upper Case Letter ASSIC Code equal to Selenium ASCII			
		selenium.keyDownNative(String.valueOf(valueassic));
	}

	public void showItemPerPage(String elementor,String elementoptions) throws Exception{
		String options = "NotFound";
		String[] ShowItemsOptionsArray = getSelectOptions(elementor);
		for (int i = 0; i < ShowItemsOptionsArray.length; i++) {
			if (elementoptions.equals(ShowItemsOptionsArray[i])) {
				if (i > 0) {
					select(elementor, ShowItemsOptionsArray[i-1]);
					focus(elementor);
					keyPressNative(String.valueOf(KeyEvent.VK_DOWN));
					Thread.sleep(1000);
					options = "Found";
					break;
				}

			}
		}
		if (options.equals("NotFound")) {
			writeFailure("Options["+elementoptions+"] was Not Found");
		}
	}

	public void verifySelectContainsOptions(String elementor,String elementoptions,String elementname){
		Reporter.log("Verify ["+elementname+"] Select has Option["+elementoptions+"]");
		String[] elementoptionsarray = elementoptions.split(";");
		for (int i = 0; i < elementoptionsarray.length; i++) {			
			String options = "NotFound";
			String[] OptionsArray = getSelectOptions(elementor);
			for (int j = 0; j < OptionsArray.length; j++) {
				if (elementoptionsarray[i].equals(OptionsArray[j])) {
					Reporter.log("["+elementname+"] Select has option["+elementoptionsarray[i]+"]");
					options = "Found";
					break;
				}
			}
			if (options.equals("NotFound")) {
				writeFailure("["+elementname+"] Select has Actual Options["+OptionsArray+"] did not match with Expected option["+elementoptionsarray[i]+"]");
			}
		}
	}

	// This method is used to Type on Visible Element i.e WebPage having number of element(Visible and Invisible) having same property so we using
	// element Index to type on Visble element.
	public void typeOnVisibleElement(String locator,String value,String elementname){
		int elementcount = getCssCount(locator);
		String element = "Notvisible"; 
		for(int i=0; i<elementcount;i++){
			if (isVisible(locator+":eq("+i+")")) {
				selenium.type(locator+":eq("+i+")", value);
				element= "Visible";
			}
		}
		if (element.equals("Notvisible")) {
			writeFailure("Element["+elementname+"] was Not Visible to Type");
		}

	}		
	// This Method is used to Click on Visible Element i.e WebPage having number of element(Visible or Invisible) having same property so we using
	// Element Index to Click on Visble element.
	public void clickOnVisibleElement(String locator,String elementname){
		int elementcount = getCssCount(locator);
		String element = "Notvisible";
		for(int i=0; i<elementcount;i++) {
			if (isVisible(locator+":eq("+i+")")) {
				selenium.click(locator+":eq("+i+")");
				element= "Visible";
			}		
		}
		if (element.equals("Notvisible")) {
			writeFailure("Element["+elementname+"] was Not Visible to Click");
		}
	}

	// This Method is Used to get the Index of the Element of the  Visible Element i.e WebPage having number of element(Visible or Invisible) having same property so we getting
	// and returning Element with its Index.

	public String getVisibleElement(String locator,String elementname){
		String elementindex = null;
		int elementcount = getCssCount(locator);
		String element = "Notvisible";
		for(int i=0; i<elementcount;i++) {
			if (isVisible(locator+":eq("+i+")")) {
				elementindex = locator+":eq("+i+")";
				element= "Visible";
				break;
			}		
		}
		if (element.equals("Notvisible")) {
			writeFailure("Element["+elementname+"] was Not Visible");
		}
		return elementindex;
	}

	public void SelectPrintWindow(String PrintWindow) throws Exception {
		Reporter.log("Proceed to Select Print("+PrintWindow+") Window");			
		String BrowName = Runtimedataread("Browser");
		if (BrowName.equalsIgnoreCase("Internet Explore")) {	
			selenium.selectWindow(PrintWindow);
			try {
				selenium.windowFocus();
			} catch (Exception e) {
				Thread.sleep(3000);
				selenium.windowFocus();
			}
		} else if (BrowName.equalsIgnoreCase("Firefox"))  {
			selenium.waitForPopUp(PrintWindow, "120000");
			selenium.selectWindow(PrintWindow);
		}
		else if (BrowName.equalsIgnoreCase("Googlechrome"))  {
			selenium.waitForPopUp(PrintWindow, "120000");
			selenium.selectWindow(PrintWindow);
		}


	}

	public void waitForUniqueNameWindow() throws Exception{
		String popupID =selenium.getEval("{var windowId; for(var x in selenium.browserbot.openedWindows ) {windowId=x;} }"); //javascript to get last opened window
		selenium.waitForPopUp(popupID, "90000");
		selenium.selectWindow(popupID);
	}

	public void deselectPopUp() {
		selenium.deselectPopUp();
	}

	public void verifyTextPresent(String myString) {
		Reporter.log("Verify Text["+myString+"] is Present");
		writeConsole("Verify Text["+myString+"] is Present");
		if (selenium.isTextPresent(myString)) {
			Reporter.log("Text["+myString+"] was Present");
			writeConsole("Text["+myString+"] was Present");
		} else {
			writeFailure("Text["+myString+"] was Not Present");
		}
	}

	public void VerifyPDFOpen(String PDFName,int wait) throws Exception {
		Reporter.log("Proceed to Verify PDF is Opend without Error ");
		String BrowName = Runtimedataread("Browser");
		String exceptionMsg = null;
		String[] Pdfwindows = new String[0];
		if (BrowName.equalsIgnoreCase("Internet Explore")) {				
			Pdfwindows = selenium.getAllWindowNames();
			int wintotal = Pdfwindows.length-1;
			System.out.println("Window-->" + Pdfwindows[wintotal]);
			selenium.selectWindow("name=" + Pdfwindows[wintotal]);
			Reporter.log("Popup Window is selected....");
			Thread.sleep(wait);
			try {
				exceptionMsg = selenium.getBodyText();
			} catch (Exception e) {			
				System.out.println("Fail1"+e.getMessage());
				exceptionMsg = e.getMessage();
			}
			if (exceptionMsg.equals("ERROR: Current window or frame is closed!") && Pdfwindows[wintotal].equals(PDFName)) {
				Reporter.log("PDF file was displayed Properly");
			} else {
				Assert.fail("PDF File was not displayed");
			}
		} else if (BrowName.equalsIgnoreCase("Firefox"))  {
			selenium.waitForPopUp(PDFName, "120000");
			selenium.selectWindow("name="+PDFName);
			Reporter.log("Popup Window is selected....");
			try {
				exceptionMsg = selenium.getBodyText();
			} catch (Exception e) {			
				System.out.println("Fail1"+e.getMessage());
				exceptionMsg = e.getMessage();
			}
			if (exceptionMsg.equals("")) {
				Reporter.log("PDF file was displayed Properly");
			} else {
				Assert.fail("PDF File was not displayed");
			}
		} else if (BrowName.equalsIgnoreCase("Googlechrome")||BrowName.equalsIgnoreCase("Safari"))  {
			selenium.waitForPopUp(PDFName, "120000");
			selenium.selectWindow("name="+PDFName);
			Reporter.log("Popup Window is selected....");
			try {
				exceptionMsg = selenium.getBodyText();
			} catch (Exception e) {			
				System.out.println("Fail1"+e.getMessage());
				exceptionMsg = e.getMessage();
			}
			if (exceptionMsg.equals("")) {
				Reporter.log("PDF file was displayed Properly");
			} else {
				Assert.fail("PDF File was not displayed");
			}
		} 
	}
	public void verifyMultiLineMessage(String elementLocator, String elementName, String expectedText, String LineSeparator)
	{
		Reporter.log("Start of the 'verifyMultiLineMessage' function...");
		if (selenium.isElementPresent(elementLocator)){       

			// Various details (like expected multi-lines messages, actual multi-lines messages etc.) are written in 'Bold'
			// in the 'Report' via. the 'writeMessageInBold' function.  This arrangment is to prevent the details from being
			// written again and again during comparison of each individual line.            
			writeMessageInBold("'" + elementName + "' field"); 
			// This is for giving some empty line spaces in the report
			Reporter.log("");
			Reporter.log("");
			Reporter.log("");
			Reporter.log("");


			// If the expected error message text is
			// Created Source Code is required;Notes Type is required
			// , the following would be True:
			// Number of lines of error message - 2
			// First line - Created Source Code is required
			// Second line - Notes Type is required
			writeMessageInBold("Expected Message(s)...");
			String [] expectedMessagesArray = expectedText.split(";");
			int numberOfExpectedMessages = expectedMessagesArray.length;
			writeMessageInBold("Number Of Messages - '" + numberOfExpectedMessages + "'");
			writeMessageInBold("The message(s) is(are)...");
			int expectedMessagesIndex = numberOfExpectedMessages - 1; //this is for using 'numberOfExpectedMessages' as an array index
			for (int i=0; i<=expectedMessagesIndex; i++) {
				writeMessageInBold(expectedMessagesArray[i]);
			}

			// This is for giving some empty line spaces between 'Expected Text' notification and 'Actual Text' notificaiton
			Reporter.log("");
			Reporter.log("");
			Reporter.log("");
			Reporter.log("");

			// If the actual error message text is
			// Created Source Code is required
			// Last Name is required
			// Notes Type is required
			// , the following would be True:
			// Number of lines of error message - 3
			// First line - Created Source Code is required
			// Second line - Last Name is required
			// Third line - Notes Type is required                
			String actualText = selenium.getText(elementLocator);
			writeMessageInBold("Actual Message(s)...");

			if (LineSeparator.equals(" ")) {

				// Feb. 11th 2013 - Vaidy
				// In the 'New Organization' page, 'Selenium' would read multiple lines of error messages with a 'space'
				// between each of the lines.  For example, the following error message displayed in multiple lines,

				// Name is required. Provide a value.
				// Code is required. Provide a value.

				// would be read by 'Selenium' as 'Name is required. Provide a value. Code is required. Provide a value.'

				// Each of the error messages would be contained in an element with '<li>' tag

				// So, instead of splitting the text displayed in the application by a 'space' [which would not be correct
				// because there would be a space between each of the words in the 'actual text'], we are finding the
				// number of actual error messages by getting the number of 'li' elements present within the 'error
				// message' element [which is represented by the string, 'elementLocator']

				int numberOfActualMessages = getXpathCount(elementLocator + "//li");

				writeMessageInBold("Number Of Messages - '" + numberOfActualMessages + "'");
				writeMessageInBold("The message(s) is(are)...");
				int i;
				String individualLiElement;
				for (i=1; i<=numberOfActualMessages; i++) {
					// individual 'li' element would be represented as follows:
					// xpath=("//div[@class='validation-summary-errors'//li)[1]
					// xpath=("//div[@class='validation-summary-errors'//li)[2]
					// etc.
					individualLiElement = "xpath=(" + elementLocator + "//li)[" + i + "]";
					writeMessageInBold(getText(individualLiElement));
				}

				// In the above case, the number of expected error messages is '2' but the number of actual error messages is '3'
				// This mismatch is intimated separately (if not for this condition, the mismatch might go unnoticed if both
				// the lines of the expected error message are present in the actual error message
				if (numberOfActualMessages != numberOfExpectedMessages) {
					writeFailure("Expected number of messages  - '" + numberOfExpectedMessages + "'.  Actual Number of messages - '" + numberOfActualMessages + "'");
				}
			}else {
				String [] actualMessagesArray = actualText.split(LineSeparator); //LineSeparator would either be "\n" or "\n\n"
				int numberOfActualMessages = actualMessagesArray.length;
				writeMessageInBold("Number Of Messages - '" + numberOfActualMessages + "'");
				writeMessageInBold("The message(s) is(are)...");
				int actualMessagesIndex = numberOfActualMessages - 1; //this is for using 'numberOfActualMessages' as an array index
				int i;
				for (i=0; i<=actualMessagesIndex; i++) {
					writeMessageInBold(actualMessagesArray[i]);
				}
				// In the above case, the number of expected error messages is '2' but the number of actual error messages is '3'
				// This mismatch is intimated separately (if not for this condition, the mismatch might go unnoticed if both
				// the lines of the expected error message are present in the actual error message
				if (numberOfActualMessages != numberOfExpectedMessages) {
					writeFailure("Expected number of messages  - '" + numberOfExpectedMessages + "'.  Actual Number of messages - '" + numberOfActualMessages + "'");
				}
			}

			// Verifying the presence of individual message in the actual error message
			String expectedMessage;                        
			for (int i=0; i<=expectedMessagesIndex; i++) {
				expectedMessage = expectedMessagesArray[i];
				if (actualText.contains(expectedMessage)){
					Reporter.log("Line, '" + expectedMessage + "' - present");
				}else{
					writeFailure("Line - '" + expectedMessage+ "' not present");
				}            
			}                   
		}else{
			writeFailure("'" + elementName + "' -  Was not displayed");
		}
		Reporter.log("End of the 'verifyMessages' function");
	}
	//				public int getXpathCount(String locator)
	//				 {
	//					return selenium.getXpathCount(locator).intValue();
	//				 }

	// This function can be used to write a message in 'Bold' in the report
	// The reason for writting in 'Bold' might be to prevent the message from being written again and again in the report
	public void writeMessageInBold(String message){
		Reporter.log("<b><font size='3'><strong>" + message + "</strong></font></b>");
	}
	//Example 1:
	//String paramDateString = "Today"
	//String paramDateFormat = "M/d/yyyy" // 9/27/2012
	//String returnDate = returnFormattedDate(paramDateString, paramDateFormat)

	//Example 2:
	//String paramDateString = "Today"
	//String paramDateFormat = "dd MMM yyyy" //10 May 2012
	//String returnDate = returnFormattedDate(paramDateString, paramDateFormat)
	/*public String returnFormattedDate(String paramDateString, String paramDateFormat)
			  	{
			  		Reporter.log("Start of the 'returnFormattedDate' function...");
			  		String returnDate="";
			  		paramDateString = paramDateString.toLowerCase();
			  		Reporter.log("paramDateString - '" + paramDateString + "'");
			  		if (paramDateString.contains("today")) {
			  			int offsetDays;
			  			if (paramDateString.contains("+")) {	
			  				Reporter.log("Date String contains '+'");
			  				// 'Java' throws an error when a string is attempted to be split using '+' 
			  				// The error is 'Dangling meta character '+' near index 0 + ^'
			  				// So, we are replacing '+' with ';' and  then splitting by ';' to get the 'offsetDays'
			  				paramDateString = paramDateString.replace("+", ";");
			  				String [] dateStringArray = paramDateString.split(";");
			  				offsetDays = Integer.parseInt(dateStringArray[1]);
			  			}else if (paramDateString.contains("-")) {
			  				Reporter.log("Date String contains '-'");
			  				String [] dateStringArray = paramDateString.split("-");
			  				offsetDays = Integer.parseInt(dateStringArray[1]);
			  				// if the tester had given "today - 2", it means that '2' days should be reduced from the current date
			  				// In order to reduce "2" days, "-2" should be passed to the the '.add' function
			  				// To convert "2" to "-2", we are subracting the "2" from "100" and then subracting "100" from the 
			  				// difference between "100" and "2", which is "98"
			  				// int difference = 100 - 2 
			  				// offsetDays = 98 - 100
			  				// which would make 'offsetDays' as '-2'					
			  				int difference = 100 - offsetDays;
			  				offsetDays = difference - 100;
			  			}else { // DateString is 'today'
			  				offsetDays = 0;				
			  			}
			  			Reporter.log("offsetDays - '" + offsetDays + "'");			
			  			Calendar calendar = Calendar.getInstance();
			  			calendar.add(Calendar.DATE, offsetDays);
			  		    Date date = calendar.getTime();
			  		    Reporter.log("date - '" + date + "'");
			  		    Format formatter = new SimpleDateFormat(paramDateFormat);
			  		    Reporter.log("formatter - '" + formatter + "'");
			  		    returnDate = formatter.format(date).toString();
			  		    Reporter.log("returnDate " + returnDate);
			  		}else {
			  			writeFailure("Fail - 'returnFormattedDate' function - The option, '" + paramDateString + "' not coded for");
			  		}
			  		Reporter.log("End of the 'returnFormattedDate' function...");
			  		return returnDate;
			  	}*/
	public String requiredHourAndMinute (String dateFormat,String date) throws ParseException{ // MM/dd/yyyy - 9/10/2012
		String returndate = null;
		DateFormat dateformat = new SimpleDateFormat(dateFormat);
		Calendar calendar = Calendar.getInstance();			
		if (date.contains("Current Hour") || date.contains("Current Minute")) {
			returndate = dateformat.format(calendar.getTime()).toString();		    
			System.out.println("Time:" + returndate + "'");
		}	
		return returndate;
	}
	//#*****************************End of Section*************#//


	//		******************************Start of Selenium Webdriver*******************************************************			

	//*************************************************************************************
	//
	//App Name      : App Review
	//Created by    : Hari
	//Created On    : 03/08/2013
	//Last Modified :
	//

	//#*********************************************************************************** #
	//
	//				public enum webdriverattribute {
	//				
	//				CLASSNAME,CSSSELECTOR,ID,LINKTEXT,NAME,PARTIALLINKTEXT,TAGNAME,XPATH
	//			}

	public WebElement attributeNameValue(String attributename,String attributevalue) {
		WebElement webelement = null;
		if (attributename == null) {
			writeFailure("Attribute Name is Empty or Null");
		}

		//				This Below Condition will Modify OR to Work on Webdriver and also works with Selenium RC
		if (attributevalue.contains("css=")) {
			attributevalue = attributevalue.replace("css=", "");
			if (attributevalue.contains("contains")) {
				webelement = (WebElement) ((JavascriptExecutor)driver).executeScript("return $(\""+ attributevalue +"\")[0]");
				if (webelement == null) {
					writeFailure("Attribute Value is Not Found");
				}
				return webelement;

			}

		}else if (attributevalue.contains("xpath=")) {
			attributevalue = attributevalue.replace("xpath=", "");
		}
		switch(attributename) {
		case "classname":
			webelement = driver.findElement(By.className(attributevalue));
			break;
		case "cssselector":
			webelement = driver.findElement(By.cssSelector(attributevalue));
			break;
		case "id":
			webelement = driver.findElement(By.id(attributevalue));
			break;
		case "linktext":
			webelement = driver.findElement(By.linkText(attributevalue));
			break;
		case "name":
			webelement = driver.findElement(By.name(attributevalue));
			break;
		case "partiallinktext":
			webelement = driver.findElement(By.partialLinkText(attributevalue));
			break;
		case "tagname":
			webelement = driver.findElement(By.tagName(attributevalue));
			break;
		case "xpath":
			webelement = driver.findElement(By.xpath(attributevalue));
			break;			
		default:
			writeFailure("Invalid Attribute Name : "+attributename);
			break;

		}
		//				writeConsole("["+webelement+"]");
		return webelement;

	}

	public List<WebElement> attributeNameValues(String attributename,String attributevalue) {
		List<WebElement> webelement = null;
		if (attributename == null) {
			writeFailure("Attribute Name is Empty or Null");
		}
		//				This Below Condition will Modify OR to Work on Webdriver and also works with Selenium RC
		if (attributevalue.contains("css=")) {
			attributevalue = attributevalue.replace("css=", "");
			if (attributevalue.contains("contains")) {
				webelement = (List<WebElement>) ((JavascriptExecutor)driver).executeScript("return $(\""+ attributevalue +"\").get()");
				if (webelement.size() == 0) {
					writeFailure("Attribute Value is Not Found");
				}
				return webelement;

			}

		}else if (attributevalue.contains("xpath=")) {
			attributevalue = attributevalue.replace("xpath=", "");
		}

		switch(attributename) {
		case "classname":
			webelement = driver.findElements(By.className(attributevalue));
			break;
		case "cssselector":
			webelement = driver.findElements(By.cssSelector(attributevalue));
			break;
		case "id":
			webelement = driver.findElements(By.id(attributevalue));
			break;
		case "linktext":
			webelement = driver.findElements(By.linkText(attributevalue));
			break;
		case "name":
			webelement = driver.findElements(By.name(attributevalue));
			break;
		case "partiallinktext":
			webelement = driver.findElements(By.partialLinkText(attributevalue));
			break;
		case "tagname":
			webelement = driver.findElements(By.tagName(attributevalue));
			break;
		case "xpath":
			webelement = driver.findElements(By.xpath(attributevalue));
			break;			
		default:
			writeFailure("Invalid Attribute Name : "+attributename);
			break;

		}
		//				writeConsole("["+webelement+"]");
		return webelement;

	}

	public By byattributeNameValue(String byattributename,String byattributevalue) {
		By by = null;	

		if (byattributename == null) {
			writeFailure("Attribute Name is Empty or Null");
		}

		//				This Below Condition will Modify OR to Work on Webdriver and also works with Selenium RC
		if (byattributevalue.contains("css=")) {
			byattributevalue = byattributevalue.replace("css=", "");
			if (byattributevalue.contains("contains")) {
				by = (By) ((JavascriptExecutor)driver).executeScript("return $(\""+ byattributevalue +"\")[0]");
				if (by == null) {
					writeFailure("Attribute Value is Not Found");
				}
				return by;		
			}

		}else if (byattributevalue.contains("xpath=")) {
			byattributevalue = byattributevalue.replace("xpath=", "");
		}

		switch(byattributename) {
		case "classname":
			by = By.className(byattributevalue);
			break;
		case "cssselector":
			by = By.cssSelector(byattributevalue);
			break;
		case "id":
			by = By.id(byattributevalue);
			break;
		case "linktext":
			by = By.linkText(byattributevalue);
			break;
		case "name":
			by = By.name(byattributevalue);
			break;
		case "partiallinktext":
			by = By.partialLinkText(byattributevalue);
			break;
		case "tagname":
			by = By.tagName(byattributevalue);
			break;
		case "xpath":
			by = By.xpath(byattributevalue);
			break;			
		default:
			writeFailure("Invalid Attribute Name : "+byattributename);
			break;

		}					
		//				writeConsole("["+by+"]");
		return by;
	}
	public void get(String url){
		writeConsole("get["+url+"]");
		driver.get(url);
	}

	public void clickWebdriver(String attributename,String attributevalue){
		writeConsole("Webdriver click["+attributename+", "+attributevalue+"]");
		attributeNameValue(attributename, attributevalue).click();
	}

	public void clickWebdriverWithCoordinates(String attributename,String attributevalue){
		writeConsole("Webdriver click["+attributename+", "+attributevalue+"]");
		Locatable hoverItem = (Locatable) attributeNameValue(attributename, attributevalue);
		int y = hoverItem.getCoordinates().onPage().getX();
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,"+y+");");
		attributeNameValue(attributename, attributevalue).click();
	}
	
	public void mouseOverWebdriver(String attributename,String attributevalue){
		writeConsole("Webdriver mouseOver["+attributename+", "+attributevalue+"]");
		Actions actions = new Actions(driver);	
		actions.moveToElement(attributeNameValue(attributename, attributevalue)).build().perform();
	}

	public void sendKeys(String attributename,String attributevalue,String value){
		writeConsole("Webdriver Clear and sendKeys["+attributename+", "+attributevalue+", "+value+"]");
		WebElement clearsendkeys = attributeNameValue(attributename, attributevalue);
		clearsendkeys.clear();
		clearsendkeys.sendKeys(value);
	}

	public void sendKeyStroke(String attributename,String attributevalue,Keys keystroke){
		writeConsole("Webdriver sendKeys and Keyboard operation ["+attributename+", "+attributevalue+", "+keystroke+"]");
		WebElement sendkeystroke = attributeNameValue(attributename, attributevalue);
		sendkeystroke.sendKeys(keystroke);					
	}

	public void sendKeysType(String attributename,String attributevalue,String value){
		writeConsole("Webdriver sendKeys["+attributename+", "+attributevalue+", "+value+"]");
		WebElement sendkeys = attributeNameValue(attributename, attributevalue);
		sendkeys.sendKeys(value);
	}

	public void submit(String attributename,String attributevalue){
		writeConsole("Webdriver submit["+attributename+", "+attributevalue+"]");
		attributeNameValue(attributename, attributevalue).submit();
	}

	public String getAttributeWebdriver(String attributename,String attributevalue,String elementattributename){
		writeConsole("Webdriver getAttribute["+attributename+", "+attributevalue+", "+elementattributename+"]");
		String getattribute =  attributeNameValue(attributename, attributevalue).getAttribute(elementattributename); 
		writeConsole("Webdriver Actual getAttribute["+getattribute+"]");
		return getattribute;
	}
	//				If this element is a text entry element, this will clear the value. Has no effect on other elements. Text entry elements are INPUT and TEXTAREA elements. 
	public void clear(String attributename,String attributevalue){
		writeConsole("Webdriver clear["+attributename+", "+attributevalue+"]");
		attributeNameValue(attributename, attributevalue).clear();
	}

	public String getValueWebdriver(String attributename,String attributevalue){
		writeConsole("Webdriver getValue["+attributename+", "+attributevalue+"]");
		String getValue = attributeNameValue(attributename, attributevalue).getAttribute("value");
		writeConsole("Webdriver Actual getValue["+getValue+"]");
		return getValue;
	}

	public String getTextWebdriver(String attributename,String attributevalue){
		writeConsole("Webdriver getText["+attributename+", "+attributevalue+"]");
		String gettext = attributeNameValue(attributename, attributevalue).getText().trim();
		writeConsole("Webdriver getText["+gettext+"]");
		return gettext;
	}

	public void selectByVisibleTextWebdriver(String attributename,String attributevalue,String text){	
		writeConsole("Webdriver selectByVisibleText["+attributename+", "+attributevalue+", "+text+"]");
		Select select = new Select(attributeNameValue(attributename, attributevalue));
		select.selectByVisibleText(text);


	}
	public void selectByValueWebdriver(String attributename,String attributevalue,String value){
		writeConsole("Webdriver selectByValue["+attributename+", "+attributevalue+", "+value+"]");
		Select select = new Select(attributeNameValue(attributename, attributevalue));
		select.selectByValue(value);		
	}

	public void selectByIndexWebdriver(String attributename,String attributevalue,int index){	
		writeConsole("Webdriver selectByIndex["+attributename+", "+attributevalue+", "+index+"]");
		Select select = new Select(attributeNameValue(attributename, attributevalue));
		select.selectByIndex(index);		
	}
	public void selectByVisibleTextWithSpaceWebdriver(String attributename,String attributevalue,String text){	
		writeConsole("Webdriver selectByVisibleTextWithSpace["+attributename+", "+attributevalue+", "+text+"]");
		WebElement select = attributeNameValue(attributename, attributevalue);
		List<WebElement> options = select.findElements(By.tagName("option"));
		for (WebElement option : options) {
			if(text.equals(option.getText()))
				option.click();  
		}
	}
	public void selectByVisibleTextWithTrimSpaceWebdriver(String attributename,String attributevalue,String text){	
		writeConsole("Webdriver selectByVisibleTextWithTrimSpaceWebdriver["+attributename+", "+attributevalue+", "+text+"]");
		try {
			WebElement select = attributeNameValue(attributename, attributevalue);
			List<WebElement> options = select.findElements(By.tagName("option"));
			for (WebElement option : options) {
				if(text.equals(option.getText().trim()))
					writeConsole("Option Value : "+option);
				option.click();  
			}

		} catch (Exception e) {
			//							writeConsole("Exception: "+e);
		}
	}
	public void actionsClickWebdriver(String attributename,String attributevalue){	
		writeConsole("Webdriver Action Click["+attributename+", "+attributevalue+"]");
		Actions actions = new Actions(driver);	
		actions.moveToElement(attributeNameValue(attributename, attributevalue)).click().build().perform();
	}

	public void doubleClickWebdriver(String attributename,String attributevalue){	
		writeConsole("Webdriver Double Click["+attributename+", "+attributevalue+"]");
		Actions actions = new Actions(driver);
		actions.doubleClick(attributeNameValue(attributename, attributevalue)).perform();				
	}

	public void dragAndDropWebdriver(String sourceattributename,String sourceattributevalue,String targetattributename,String targetattributevalue){
		writeConsole("Webdriver dragAndDrop Source - ["+sourceattributename+", "+sourceattributevalue+"] and Target - ["+targetattributename+", "+targetattributevalue+"]");
		WebElement source = attributeNameValue(sourceattributename, sourceattributevalue);
		WebElement target = attributeNameValue(targetattributename, targetattributevalue);	
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, target).perform();				
	}

	public void contextClickWebdriver(String attributename,String attributevalue){	
		writeConsole("Webdriver contextClick["+attributename+", "+attributevalue+"]");
		Actions actions = new Actions(driver);
		actions.contextClick(attributeNameValue(attributename, attributevalue));				
	}

	public void checkWebdriver(String attributename,String attributevalue){	
		writeConsole("Webdriver check["+attributename+", "+attributevalue+"]");
		WebElement check = attributeNameValue(attributename, attributevalue);
		check.click();
		if (!check.isSelected()) {
			check.click();
		}			
	}

	public void uncheckWebdriver(String attributename,String attributevalue){	
		writeConsole("Webdriver uncheck["+attributename+", "+attributevalue+"]");
		WebElement uncheck = attributeNameValue(attributename, attributevalue);
		uncheck.click();
		if (uncheck.isSelected()) {
			uncheck.click();
		}			
	}

	public void radioWebdriver(String attributename,String attributevalue){
		writeConsole("Webdriver radio Click["+attributename+", "+attributevalue+"]");
		WebElement radio = attributeNameValue(attributename, attributevalue);		
		radio.click();
		if (!radio.isSelected()) {
			radio.click();
		}			
	}

	public void alertAccept(){		
		writeConsole("Webdriver Alert accept");
		Alert alert = driver.switchTo().alert();		
		alert.accept();
	}

	public void alertDismiss(){		
		writeConsole("Webdriver Alert dismiss");
		Alert alert = driver.switchTo().alert();
		alert.dismiss();

	}
	public String alertMessage(){		
		writeConsole("Webdriver Alert Message");
		Alert alert = driver.switchTo().alert();		
		String AlertMessage = alert.getText();
		return AlertMessage;
	}

	public void selectMainWindowWebdriver(){	
		writeConsole("Webdriver Main Window["+mainwindow+"]");
		driver.switchTo().window(mainwindow);
	}

	// This Function is used to Wait till Window or Popup opens.
	public void waitForPopupWebdriver() throws Exception {
		writeConsole("Webdriver Wait for Popup Window");
		for (int second = 0;; second++) {
			if (second > 60) {
				writeFailure("Popup was not Opened after waiting for 60 Second");
			}
			try {
				Set<String> popwindow = driver.getWindowHandles();
				int popupcount = popwindow.size();
				if (popupcount > 1) {
					break;
				}
			} catch (Exception e) {

			}
			Thread.sleep(1000);

		}
	}

	// This Function is used to Wait till Window or Popup opens.
	public void waitForMultiplePopupWebdriver(int currentpopupcount) throws Exception {
		writeConsole("Webdriver Wait for Popup Window");
		for (int second = 0;; second++) {
			if (second > 60) {
				writeFailure("Popup was not Opened after waiting for 60 Second");
			}
			try {
				Set<String> popwindow = driver.getWindowHandles();
				int popupcount = popwindow.size();
				writeConsole("Webdriver popupcount : "+popupcount );
				if (popupcount > currentpopupcount) {
					break;
				}
			} catch (Exception e) {

			}
			Thread.sleep(1000);

		}
	}

	public int getWindowHandles(){     
		int popupcount; 
		popupcount= driver.getWindowHandles().size();
		writeConsole("Pop up Window count ["+popupcount+"]");
		return popupcount;
	}


	// This Function is used to Select Recently Opened Window or Popup.
	public void recentMultiplePopupSelectWebdriver(String windowname,int currentpopupcount) throws Exception {
		//			     int windownull = 0;
		//			     int currentpopupcount = driver.getWindowHandles().size();
		//			     mainwindow = driver.getWindowHandle();
		writeConsole("Webdriver Main Window["+mainwindow+"]");
		//			     writeConsole("Count Webdriver Main Window["+currentpopupcount+"]");
		//			     Set<String> popwindow = driver.getWindowHandles();
		//			     Iterator<String> it = popwindow.iterator();
		//			     waitForPopupWebdriver();
		//			     if (currentpopupcount < 1) {
		//			      waitForPopupWebdriver(currentpopupcount);
		//			     }     
		waitForMultiplePopupWebdriver(currentpopupcount);
		//			     Thread.sleep(5000);
		Iterator<String> popwindow = driver.getWindowHandles().iterator();
		while (popwindow.hasNext()) {
			String window = popwindow.next();
			if (!mainwindow.equals(window)) {
				writeConsole("Webdriver Switch To Window["+window+"]");
				Thread.sleep(5000);
				driver.switchTo().window(window);
			}
		}
	}

	// This Function is used to Select Recently Opened Window or Popup.
	public void recentPopupSelectWebdriver(String windowname) throws Exception {
		//					 int windownull = 0;
		//String currentwindow = driver.getWindowHandle();
		writeConsole("Webdriver Main Window["+mainwindow+"]");
		//					writeConsole("Webdriver Current Window["+currentwindow+"]");					
		//					 Set<String> popwindow = driver.getWindowHandles();
		//					 Iterator<String> it = popwindow.iterator();
		waitForPopupWebdriver();
		Iterator<String> popwindow = driver.getWindowHandles().iterator();
		//String windiwscoun[] = selenium.getAllWindowTitles(); 
		//writeConsole("Webdriver Switch To Window["+windiwscoun+"]");
		while (popwindow.hasNext()) {
			String window = popwindow.next();
			if (!mainwindow.equals(window)) {
				writeConsole("Webdriver Switch To Window["+window+"]");
//				Thread.sleep(6000);
				driver.switchTo().window(window);
//				Thread.sleep(3000);
			}
		}
	}

	// This Function is used to Select Recently Opened Window or Popup.
	public void recentOpenedPopupSelectWebdriver(String windowname) throws Exception {
		//					 int windownull = 0;
		//					String currentwindow = driver.getWindowHandle();
		writeConsole("Webdriver Main Window["+mainwindow+"]");
		//					writeConsole("Webdriver Current Window["+currentwindow+"]");					
		//					 Set<String> popwindow = driver.getWindowHandles();
		//					 Iterator<String> it = popwindow.iterator();
		Iterator<String> popwindow = driver.getWindowHandles().iterator();
		while (popwindow.hasNext()) {
			String window = popwindow.next();
			if (!mainwindow.equals(window)) {
				writeConsole("Webdriver Switch To Window["+window+"]");
				driver.switchTo().window(window);
			}
		}
	}
	// This Function is used to Select Recently Opened Window or Popup.
	public void recentPopupCloseWebdriver() throws Exception {
		Reporter.log("Proceed to Close All Opened Pop Ups");	

		//					 String mainwindow = driver.getWindowHandle();
		driver.switchTo().window(mainwindow);
		writeConsole("Webdriver Main Window["+mainwindow+"]");
		//					 Set<String> popwindow = driver.getWindowHandles();	
		//					 Iterator<String> it = popwindow.iterator();
		Iterator<String> popwindow = driver.getWindowHandles().iterator();	
		while (popwindow.hasNext()) {
			String window = popwindow.next();
			//					 writeConsole("Webdriver Switch To Window["+window+"]");
			//					 driver.switchTo().window(window);
			if (!mainwindow.equals(window)) {
				writeConsole("Webdriver Switch To Window["+window+"]");
				driver.switchTo().window(window);	
				closeWindowWebdriver();	
				driver.switchTo().window(mainwindow);	
			}


		}

	}

	//				// This Function is used to Select Recently Opened Window or Popup.
	//				public void recentPopupSelectWebdriver(String windowname) throws Exception {
	//					mainwindow = driver.getWindowHandle();
	//					writeConsole("Webdriver Main Window["+mainwindow+"]");
	////					Set<String> popwindow = driver.getWindowHandles();
	////					Iterator<String> it = popwindow.iterator();
	//					waitForPopupWebdriver();
	//					Iterator<String> popwindow = driver.getWindowHandles().iterator();
	//					while (popwindow.hasNext()) {
	//						String window = popwindow.next();
	//						writeConsole("Webdriver Switch To Window["+window+"]");
	//						driver.switchTo().window(window);
	//						
	//					}
	////					writeConsole("Window Size : "+popwindow.size());
	////					for(String window : popwindow){
	////						writeConsole("Webdriver  Switch To Window["+window+"]");
	////						driver.switchTo().window(window);
	////					}
	//				}
	//				
	//				// This Function is used to Select Recently Opened Window or Popup.
	//				 public void recentPopupCloseWebdriver() throws Exception {
	//						Reporter.log("Proceed to Close All Opened Pop Ups");	
	//						int close = 0;
	//						String mainwindow = driver.getWindowHandle();
	//						writeConsole("Webdriver Main Window["+mainwindow+"]");
	////						Set<String> popwindow = driver.getWindowHandles();						
	////						Iterator<String> it = popwindow.iterator();
	//						Iterator<String> popwindow = driver.getWindowHandles().iterator();						
	//						while (popwindow.hasNext()) {
	//							String window = popwindow.next();
	//							writeConsole("Webdriver Switch To Window["+window+"]");
	//							driver.switchTo().window(window);
	//							if (close != 0 ) {
	//								close++;
	//								closeWindowWebdriver();								
	//							}							
	//							driver.switchTo().window(mainwindow);
	//							
	//						}
	//
	//					}

	public void closeWindowWebdriver() throws Exception {
		writeConsole("Webdriver Close");
		driver.close();
	}


	public void switchToDefaultContentWebdriver(){	
		writeConsole("Webdriver Switch To Default Content ");
		driver.switchTo().defaultContent();
	}				


	public void switchToFrameIndexWebdriver(int frameindex) throws Exception {
		writeConsole("Webdriver Switch To Frame Index["+frameindex+"]");
		driver.switchTo().frame(frameindex);
	}

	public void switchToFrameNameIdWebdriver(String framenameid) throws Exception {
		writeConsole("Webdriver Switch To Frame Name or ID ["+framenameid+"]");
		driver.switchTo().frame(framenameid);
	}

	public void switchToFrameByWebelementWebdriver(String attributename,String attributevalue) throws Exception {
		writeConsole("Webdriver Switch To Frame ["+attributename+","+attributevalue+"]");
		driver.switchTo().frame(attributeNameValue(attributename, attributevalue));
	}

	public List<WebElement> getOptionsWebdriver(String attributename,String attributevalue){
		writeConsole("Webdriver getOptions["+attributename+", "+attributevalue+"]");
		Select select = new Select(attributeNameValue(attributename, attributevalue));					
		return select.getOptions();		

	}

	public List<String> getOptionsTextWebdriver(String attributename,String attributevalue){
		writeConsole("Webdriver getOptions["+attributename+", "+attributevalue+"]");
		List<String> optiontextarray = new ArrayList<String>();
		Select select = new Select(attributeNameValue(attributename, attributevalue));					
		List<WebElement> getOptions =  select.getOptions();
		for (int i = 0; i < getOptions.size(); i++) {
			String optiontext = getOptions.get(i).getText();
			optiontextarray.add(optiontext);
		}
		return optiontextarray;

	}

	public WebElement getFirstSelectedOption(String attributename,String attributevalue){		
		Select select = new Select(attributeNameValue(attributename, attributevalue));
		return select.getFirstSelectedOption();		
	}

	public List<WebElement> getAllSelectedOptions(String attributename,String attributevalue){		
		Select select = new Select(attributeNameValue(attributename, attributevalue));
		return select.getAllSelectedOptions();		
	}

	public String getCurrentUrl() {		
		String getcurrenturl = driver.getCurrentUrl();
		writeConsole("Webdriver getCurrentUrl["+getcurrenturl+"]");
		return getcurrenturl;
	}

	public String getPageSource() {	
		String getpagesource = driver.getPageSource();
		writeConsole("Webdriver getPageSource["+getpagesource+"]");
		return getpagesource;
	}

	public String getTitleWebdriver() {	
		String gettitle = driver.getTitle();
		writeConsole("Webdriver getTitle["+gettitle+"]");
		return gettitle;
	}

	public WebElement elementsearch(String attributename,String attributevalue){
		WebElement element = attributeNameValue(attributename, attributevalue);
		writeConsole("Webdriver elementsearch["+element+"]");
		return element;

	}


	public void waitForElementPresentWebdriver(String attributename,String attributevalue,String elementname) throws Exception{
		for (int second = 0;; second++) {

			// try catch block is used handle 'Permission Denied Error' when waiting for element
			try {
				writeConsole("Webdriver Elements Present["+attributename+", "+attributevalue+"]");
				WebElement elementone = attributeNameValue(attributename, attributevalue);
				writeConsole("Webdriver Element Present");
				break;
			} catch (Exception e) {				
				writeConsole("Webdriver Element Not Present");
			}

			if (second>=60) {
				writeFailure("Elements["+attributename+"] was Not Found after waiting for 1 Minute");
			}
			Thread.sleep(1000);
		}

	}

	public void waitForElementNotPresentWebdriver(String attributename,String attributevalue,String elementname) throws Exception{
		for (int second = 0;; second++) {

			// try catch block is used handle 'Permission Denied Error' when waiting for element
			try {
				writeConsole("Webdriver Elements Not Present["+attributename+", "+attributevalue+"]");
				WebElement elementone = attributeNameValue(attributename, attributevalue);	
				writeConsole("Webdriver Element Present");
			} catch (Exception e) {	
				writeConsole("Webdriver Element Not Present");
				break;
			}

			if (second>=60) {
				writeFailure("Elements["+attributename+"] was Found after waiting for 1 Minute");
			}
			Thread.sleep(1000);
		}

	}


	public void waitForElementVisibleWebdriver(String attributename,String attributevalue,String elementname) throws InterruptedException{
		for (int second = 0;; second++) {

			// try catch block is used handle 'Permission Denied Error' when waiting for element
			try {
				writeConsole("Webdriver Elements Visible["+attributename+", "+attributevalue+"]");
				WebElement elementone = attributeNameValue(attributename, attributevalue);
				if (elementone.isDisplayed()) {
					writeConsole("Webdriver Element Visible");
					break;
				}else {
					writeConsole("Webdriver Element Not Visible");
				}
			} catch (Exception e) {				
				writeConsole("Webdriver Element Not Present");
			}

			if (second>=60) {
				writeFailure("Elements["+attributename+"] was Not Visible after waiting for 1 Minute");
			}
			Thread.sleep(1000);
		}
	}


	public void waitForElementNotVisibleWebdriver(String attributename,String attributevalue,String elementname) throws InterruptedException{
		for (int second = 0;; second++) {

			// try catch block is used handle 'Permission Denied Error' when waiting for element
			try {
				writeConsole("Webdriver Elements Not Visible["+attributename+", "+attributevalue+"]");
				WebElement elementone = attributeNameValue(attributename, attributevalue);
				if (!elementone.isDisplayed()) {
					writeConsole("Webdriver Element Not Visible");
					break;
				}else {
					writeConsole("Webdriver Element Visible");
				}
			} catch (Exception e) {				
				writeConsole("Webdriver Element Not Present");
			}

			if (second>=60) {
				writeFailure("Elements["+attributename+"] was Visible after waiting for 1 Minute");
			}
			Thread.sleep(1000);
		}
	}

	public void waitForElementPresentWebdriverWait(String byattributename,String byattributevalue,String elementname){
		try {
			writeConsole("Webdriver Wait for presenceOfElementLocated["+byattributename+", "+byattributevalue+"]");
			WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
			wait.until(ExpectedConditions.presenceOfElementLocated(byattributeNameValue(byattributename, byattributevalue)));	
		} catch (Exception e) {
			writeFailure("Element ["+elementname+" ] was Not Present");
		}

	}

	public void waitForElementNotPresentVisibleWebdriverWait(String byattributename,String byattributevalue,String elementname){
		try {
			writeConsole("Webdriver Wait for invisibilityOfElementLocated["+byattributename+", "+byattributevalue+"]");
			WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(byattributeNameValue(byattributename, byattributevalue)));
		} catch (Exception e) {
			writeFailure("Element ["+elementname+" ] was Visible");
		}
	}


	public void waitForElementVisibleWebdriverWait(String byattributename,String byattributevalue,String elementname){
		try {
			writeConsole("Webdriver Wait for visibilityOfElementLocated["+byattributename+", "+byattributevalue+"]");
			WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
			wait.until(ExpectedConditions.visibilityOfElementLocated(byattributeNameValue(byattributename, byattributevalue)));
		} catch (Exception e) {
			writeFailure("Element ["+elementname+" ] was Not Visible");
		}
	}
	//
	//				public void waitForElementPresent(String attributename,String attributevalue,String elementname) throws Exception{
	//					for (int second = 0;;second ++) {
	//						try {// try catch block is used handle 'Permission Denied Error' when waiting for element
	//							if (second>=120) {
	////								writeFailure("Element["+elementname+"] was not found after waiting for 2 Minute");
	//							}
	//							if (elementsearch(attributename, attributevalue).get == true) {
	//								break;
	//							}
	//						} catch (Exception e) {
	//
	//						}
	//						Thread.sleep(1000);		
	//					}
	//
	//				}


	public void verifyElementPresentWebdriver(String attributename,String attributevalue,String elementname) throws Exception{
		Reporter.log("Proceed to verify Element("+elementname+") is Present correctly");
		writeConsole("Element Present["+attributename+", "+attributevalue+"]");
		try {						
			attributeNameValue(attributename, attributevalue);
			writeConsole("Webdriver Element Present");
			Reporter.log("Element("+elementname+") was Present correctly");						
		} catch (Exception e) {
			writeConsole("Webdriver Element Not Present");
			writeFailure("Element ["+elementname+" ] was Not Present");						
		}
	}

	public void verifyElementNotPresentWebdriver(String attributename,String attributevalue,String elementname) throws Exception{
		Reporter.log("Proceed to verify Element("+elementname+") is Not Present correctly");
		writeConsole("Element Not Present["+attributename+", "+attributevalue+"]");
		try {						
			attributeNameValue(attributename, attributevalue);
			writeConsole("Webdriver Element Present");
			writeFailure("Element ["+elementname+" ] was Present");
		} catch (NoSuchElementException e) {	
			writeConsole("Webdriver Element Not Present");
			Reporter.log("Element("+elementname+") was Not Present");			
		}
	}	


	public boolean isDisplayedWebdriver(String attributename,String attributevalue){
		writeConsole("Element Visible["+attributename+", "+attributevalue+"]");
		boolean isdisplayed = attributeNameValue(attributename, attributevalue).isDisplayed();		
		writeConsole("Actual isDisplayed ["+isdisplayed+"]");
		return isdisplayed;
	}

	public boolean isEnabledWebdriver(String attributename,String attributevalue){
		writeConsole("Element Enabled["+attributename+", "+attributevalue+"]");
		boolean isenabled = attributeNameValue(attributename, attributevalue).isEnabled();		
		writeConsole("Actual isEnabled ["+isenabled+"]");
		return isenabled;
	}

	public boolean isSelectedWebdriver(String attributename,String attributevalue){
		writeConsole("Element isSelected["+attributename+", "+attributevalue+"]");
		boolean isselected = attributeNameValue(attributename, attributevalue).isSelected();		
		writeConsole("Actual isSelected ["+isselected+"]");
		return isselected;
	}

	public void verifySelectContainsOptionsWebdriver(String attributename, String attributevalue,String elementoptions,String elementname){
		Reporter.log("Verify ["+elementname+"] Select or Drop down has Option["+elementoptions+"]");
		String[] elementoptionsarray = elementoptions.split(";");
		for (int i = 0; i < elementoptionsarray.length; i++) {
			String actualoptionstring = "";
			String options = "NotFound";
			String actualtext;
			List<WebElement> getOptions =  getOptionsWebdriver(attributename, attributevalue);
			for (int j = 0; j < getOptions.size(); j++) {
				actualtext = getOptions.get(j).getText();
				actualoptionstring = actualoptionstring+actualtext;
				if (actualtext.equals(elementoptionsarray[i])) {
					Reporter.log("["+elementname+"] Select or Drop down has Option["+elementoptions+"]");
					options = "Found";
					break;
				}
			}
			if (options.equals("NotFound")) {
				writeFailure("Element Select["+elementname+"] with Actual Options["+actualoptionstring+"] did not match with Expected Option["+elementoptionsarray[i]+"]");

			}
		}      
	}
	

	public void verifyDropDownContainsOptionsWebdriver(String attributename, String attributevalue,String elementoptions,String elementname){
		Reporter.log("Verify ["+elementname+"] Drop down has Option["+elementoptions+"]");
		String[] elementoptionsarray = elementoptions.split(";");
		for (int i = 0; i < elementoptionsarray.length; i++) {
			String actualoptionstring = "";
			String options = "NotFound";
			String actualtext;
			List<WebElement> getOptions = attributeNameValues(attributename,attributevalue);			
			for (WebElement element : getOptions) {
				actualtext = element.getText();
				actualoptionstring = actualoptionstring+actualtext;
				if (actualtext.equals(elementoptionsarray[i])) {
					Reporter.log("["+elementname+"] Drop down has Option["+elementoptions+"]");
					options = "Found";
					break;
				}
			}
			if (options.equals("NotFound")) {
				writeFailure("Element Drop Down["+elementname+"] with Actual Options["+actualoptionstring+"] did not match with Expected Option["+elementoptionsarray[i]+"]");

			}
		}      
	}

	public void verifyElementVisibleWebdriver(String attributename,String attributevalue,String elementname) throws Exception{
		Reporter.log("Proceed to verify Element("+elementname+") is Visible correctly");
		writeConsole("Element Visible["+attributename+", "+attributevalue+"]");
		if (attributeNameValue(attributename, attributevalue).isDisplayed()) {	
			writeConsole("Webdriver Element Visible");
			Reporter.log("Element("+elementname+") was Visible correctly");
		} else {
			writeConsole("Webdriver Element Not Visible");
			writeFailure("Element ["+elementname+"] was Not Visible");
		}
	}

	public void verifyElementNotVisibleWebdriver(String attributename,String attributevalue,String elementname) throws Exception{
		Reporter.log("Proceed to verify Element("+elementname+") is Not Visible correctly");
		writeConsole("Element Not Visible["+attributename+", "+attributevalue+"]");
		if (!attributeNameValue(attributename, attributevalue).isDisplayed()) {		
			writeConsole("Webdriver Element Not Visible");
			Reporter.log("Element("+elementname+") was Not Visible");
		} else {
			writeConsole("Webdriver Element Visible");
			writeFailure("Element ["+elementname+"] was Visible");
		}
	}

	public void verifyElementCheckedWebdriver(String attributename,String attributevalue,String elementname) throws Exception{
		Reporter.log("Verify Element("+elementname+") is Checked");
		writeConsole("Element Checked["+attributename+", "+attributevalue+"]");
		if (attributeNameValue(attributename, attributevalue).isSelected()) {				
			Reporter.log("Element["+elementname+"] was Checked Correctly");
		} else {
			writeFailure("Element["+elementname+"] was Not Checked");
		}

	}

	public void verifyElementNotCheckedWebdriver(String attributename,String attributevalue,String elementname) throws Exception{
		Reporter.log("Verify Element("+elementname+") is Not Checked");
		writeConsole("Element Not Checked["+attributename+", "+attributevalue+"]");
		if (!attributeNameValue(attributename, attributevalue).isSelected()) {				
			Reporter.log("Element["+elementname+"] was Not Checked");
		} else {
			writeFailure("Element["+elementname+"] was Checked");
		}
	}

	public void verifyElementEnabledWebdriver(String attributename,String attributevalue,String elementname) throws Exception{
		Reporter.log("Verify Element("+elementname+") is Enabled");
		writeConsole("Element Enabled["+attributename+", "+attributevalue+"]");
		if (attributeNameValue(attributename, attributevalue).isEnabled()) {				
			Reporter.log("Element["+elementname+"] was Enabled Correctly");
		} else {
			writeFailure("Element["+elementname+"] was Not Enabled");
		}
	}

	public void verifyElementDisabledWebdriver(String attributename,String attributevalue,String elementname) throws Exception{
		Reporter.log("Verify Element("+elementname+") is Disabled");
		writeConsole("Element Disabled["+attributename+", "+attributevalue+"]");
		if (!attributeNameValue(attributename, attributevalue).isEnabled()) {				
			Reporter.log("Element["+elementname+"] was Disabled Correctly");
		} else {
			writeFailure("Element["+elementname+"] was Not Disabled");
		}
	}

	public void verifyElementTextWebdriver(String attributename,String attributevalue,String expectedtext,String elementname) throws Exception{
		Reporter.log("Verify Element("+elementname+") with Text("+expectedtext+")");
		writeConsole("Element ["+attributename+", "+attributevalue+"]");
		try {
			WebElement element = attributeNameValue(attributename, attributevalue);
			String actualtext = element.getText().trim();
			writeConsole("Element Actual getText["+actualtext+"]");
			if (expectedtext.equals(actualtext)) {
				Reporter.log("Element["+elementname+"] with ["+actualtext+"]Text was displayed correctly ");
			} else {
				writeFailure("Element["+elementname+"] with Actuals Text - ["+actualtext+"]Text did not match Expected Text - ["+expectedtext+"]");
			}			
		} catch (Exception e) {
			writeFailure("Element ["+elementname+" ] was Not Present");
		}
	}

	public void verifyElementContainsTextWebdriver(String attributename,String attributevalue,String expectedtext,String elementname) throws Exception{
		Reporter.log("Verify Element("+elementname+") Contains Text("+expectedtext+")");
		writeConsole("Element["+attributename+", "+attributevalue+"]");
		try {
			WebElement element = attributeNameValue(attributename, attributevalue);
			String actualtext = element.getText().trim();
			writeConsole("Element Actual getText["+actualtext+"]");
			if (actualtext.contains(expectedtext)) {
				Reporter.log("Element["+elementname+"] Contains ["+expectedtext+"]Text was displayed correctly ");
			} else {
				writeFailure("Element["+elementname+"] Contains Actuals Text - ["+actualtext+"]Text did not match Expected Text - ["+expectedtext+"]");
			}			
		} catch (Exception e) {
			writeFailure("Element ["+elementname+" ] was Not Present");
		}
	}

	public void verifyElementVisibleTextWebdriver(String attributename,String attributevalue,String expectedtext,String elementname) throws Exception{
		Reporter.log("Verify Element("+elementname+") with Text("+expectedtext+")");
		writeConsole("Element Displayed["+attributename+", "+attributevalue+"]");
		WebElement element = attributeNameValue(attributename, attributevalue);
		if (element.isDisplayed()) {	
			String actualtext = element.getText().trim();
			writeConsole("Element Actual getText["+actualtext+"]");
			if (expectedtext.equals(actualtext)) {
				Reporter.log("Element["+elementname+"] with ["+actualtext+"]Text was Visible correctly ");
			} else {
				writeFailure("Element["+elementname+"] with Actuals Text - ["+actualtext+"]Text did not match Expected Text - ["+expectedtext+"]");
			}
		} else {
			writeFailure("Element ["+elementname+"] was Not Visible");
		}
	}

	public void verifyElementVisibleContainsTextWebdriver(String attributename,String attributevalue,String expectedtext,String elementname) throws Exception{
		Reporter.log("Verify Element("+elementname+") Contains Text("+expectedtext+")");
		writeConsole("Element Displayed["+attributename+", "+attributevalue+"]");
		WebElement element = attributeNameValue(attributename, attributevalue);
		if (element.isDisplayed()) {	
			String actualtext = element.getText().trim();
			writeConsole("Element Actual getText["+actualtext+"]");
			if (actualtext.contains(expectedtext)) {
				Reporter.log("Element["+elementname+"] Contains ["+expectedtext+"]Text was displayed correctly ");
			} else {
				writeFailure("Element["+elementname+"] Contains Actuals Text - ["+actualtext+"]Text did not match Expected Text - ["+expectedtext+"]");
			}
		} else {
			writeFailure("Element ["+elementname+"] was Not Visible");
		}
	}
	public void verifyElementNotVisibleContainsTextWebdriver(String attributename,String attributevalue,String expectedtext,String elementname) throws Exception{
		Reporter.log("Verify Element("+elementname+") Contains Text("+expectedtext+")");
		writeConsole("Element Displayed["+attributename+", "+attributevalue+"]");
		WebElement element = attributeNameValue(attributename, attributevalue);
		if (!element.isDisplayed()) {	
			String actualtext = element.getText().trim();
			writeConsole("Element Actual getText["+actualtext+"]");
			if (actualtext.contains(expectedtext)) {
				Reporter.log("Element["+elementname+"] Contains ["+expectedtext+"]Text was displayed correctly ");
			} else {
				writeFailure("Element["+elementname+"] Contains Actuals Text - ["+actualtext+"]Text did not match Expected Text - ["+expectedtext+"]");
			}
		} else {
			writeFailure("Element ["+elementname+"] was Not Visible");
		}
	}

	public void waitForElementPresentVerifyTextWebdriver(String attributename,String attributevalue,String expectedtext,String elementname) throws Exception{
		Reporter.log("Wait for Element("+elementname+") Present and Verify with Text("+expectedtext+")");
		for (int second = 0;; second++) {
			if (second >= 120) {
				writeFailure("Element ["+elementname+" ] was Not Present after waiting for 2 minute");
			}
			try {// try catch block is used handle 'Permission Denied Error' when waiting for element
				writeConsole("Element["+attributename+", "+attributevalue+"]");
				WebElement element = attributeNameValue(attributename, attributevalue);							
				String actualtext = element.getText().trim();
				writeConsole("Element Actual getText["+actualtext+"]");
				if (expectedtext.equals(actualtext)) {
					Reporter.log("Element["+elementname+"] with ["+actualtext+"]Text was displayed correctly ");
					break;
				} else {
					writeFailure("Element["+elementname+"] with Actuals Text - ["+actualtext+"]Text did not match Expected Text - ["+expectedtext+"]");
				}			
			} catch (Exception e) {

			}
			Thread.sleep(1000);
		}
	}


	public void waitForElementPresentVerifyContainsTextWebdriver(String attributename,String attributevalue,String expectedtext,String elementname) throws Exception{
		Reporter.log("Wait for Element("+elementname+") Present and Verify Contains Text("+expectedtext+")");
		for (int second = 0;; second++) {
			if (second >= 120) {
				writeFailure("Element ["+elementname+" ] was Not Present after waiting for 2 minute");
			}
			try {// try catch block is used handle 'Permission Denied Error' when waiting for element
				writeConsole("Element["+attributename+", "+attributevalue+"]");
				WebElement element = attributeNameValue(attributename, attributevalue);
				String actualtext = element.getText().trim();
				writeConsole("Element Actual getText["+actualtext+"]");
				if (actualtext.equals(expectedtext)) {
					Reporter.log("Element["+elementname+"] Contains ["+actualtext+"]Text was displayed correctly ");
					break;
				} else {
					writeFailure("Element["+elementname+"] with Actuals Text - ["+actualtext+"]Text did not match Expected Text - ["+expectedtext+"]");
				}			
			} catch (Exception e) {

			}
			Thread.sleep(1000);
		}
	}

	public void waitForElementVisibleVerifyTextWebdriver(String attributename,String attributevalue,String expectedtext,String elementname) throws Exception{
		Reporter.log("Wait for Element("+elementname+") Visible and Verify with Text("+expectedtext+")");
		for (int second = 0;; second++) {
			if (second >= 120) {
				writeFailure("Element ["+elementname+" ] was Not Visible after waiting for 2 minute");
			}
			try {// try catch block is used handle 'Permission Denied Error' when waiting for element
				writeConsole("Element Displayed["+attributename+", "+attributevalue+"]");
				WebElement element = attributeNameValue(attributename, attributevalue);
				if (element.isDisplayed()) {
					String actualtext = element.getText().trim();
					writeConsole("Element Actual getText["+actualtext+"]");
					if (expectedtext.equals(actualtext)) {
						Reporter.log("Element ["+elementname+"] with ["+actualtext+"]Text was Visible correctly ");
						break;
					} else {
						writeFailure("Element ["+elementname+"] with Actuals Text - ["+actualtext+"]Text did not match Expected Text - ["+expectedtext+"]");
					}
				}
			} catch (Exception e) {

			}
			Thread.sleep(1000);
		}
	}

	public void waitForElementVisibleVerifyContainsTextWebdriver(String attributename,String attributevalue,String expectedtext,String elementname) throws Exception{
		Reporter.log("Wait for Element("+elementname+") Visible and Verify Contains Text("+expectedtext+")");
		for (int second = 0;; second++) {
			if (second >= 120) {
				writeFailure("Element ["+elementname+" ] was Not Visible after waiting for 2 minute");
			}
			try {// try catch block is used handle 'Permission Denied Error' when waiting for element
				writeConsole("Element Displayed["+attributename+", "+attributevalue+"]");
				WebElement element = attributeNameValue(attributename, attributevalue);
				if (element.isDisplayed()) {
					String actualtext = element.getText().trim();
					writeConsole("Element Actual getText["+actualtext+"]");
					if (actualtext.contains(expectedtext)) {
						Reporter.log("Element ["+elementname+"] Contains ["+actualtext+"]Text was Visible correctly ");
						break;
					} else {
						writeFailure("Element ["+elementname+"] Contains Actuals Text - ["+actualtext+"]Text did not match Expected Text - ["+expectedtext+"]");
					}
				}
			} catch (Exception e) {

			}
			Thread.sleep(1000);
		}
	}


	public String getrownumberbasedonrowvaluecloumnnameusingcssWebdriver(String attributenametable,String attributevaluetable,String ColumnNames,String Rowvalues) throws Exception{
		String rownumber = null;
		String[] ColumnNamesArray = ColumnNames.split(";");  ///expected colmn names in a array from qc
		String[] RowvaluesArray = Rowvalues.split(";"); //////expected record values
		ArrayList<Integer> columnnumber = new ArrayList<Integer>();
		waitForElementVisibleWebdriver(attributenametable,attributevaluetable+">thead>tr>th:nth-child(1)", "Table First Column");
		int columncount = attributeNameValues(attributenametable,attributevaluetable+">thead>tr>th").size();
		writeConsole("Elements Column Count["+columncount+"]");
		for (int i = 0; i < ColumnNamesArray.length; i++) {		
			String column = "NotFound";
			for (int j = 1;j <= columncount; j++ ) {
				String currentcoulmnName = getTextWebdriver(attributenametable, attributevaluetable+">thead>tr>th:nth-child("+j+")");
				if (currentcoulmnName.equals(ColumnNamesArray[i])) {
					columnnumber.add(j);
					column = "Found";
					break;
				}
			}			
			if (column.equals("NotFound")) {					
				writeFailure("Column Name["+ColumnNamesArray[i]+"] was Not Found in the Table");
			}
		}		


		//		int columncounter = 0;
		String data = "NotFound";
		int k;

		int rowcount = attributeNameValues(attributenametable,attributevaluetable+">tbody>tr").size();
		writeConsole("Elements Row Count["+rowcount+"]");
		//						int rowcount = getCssCount(tablename+">tbody>tr");


		for (k = 1; k <= rowcount; k++) {				
			for (int x = 0; x < columnnumber.size(); x++) {
				String currentrowvalue = getTextWebdriver(attributenametable, attributevaluetable+">tbody>tr:nth-child("+k+")>td:nth-child("+columnnumber.get(x)+")");
				//								String currentrowvalue = selenium.getTable(tablename+"."+k+"."+columnnumber.get(x));
				if (currentrowvalue.equals(RowvaluesArray[x])) {					
					data = "Found";

				}else {
					data = "NotFound";
					break; // moving to next row
				}
			}
			if (data.equals("Found")) {					
				break;
			}
		}
		if (data.equals("NotFound")) {
			writeFailure("Row Values["+Rowvalues+"] was Not Found in the Table ");
		}
		if (data.equals("Found")) {				
			rownumber = String.valueOf(k);
		}


		return rownumber;
	}

	public String getrownumberusingxpathWebdriver(String attributenametable,String attributevaluetable,String ColumnNames,String Rowvalues) throws Exception{
		String rownumber = null;
		String[] ColumnNamesArray = ColumnNames.split(";");  ///expected colmn names in a array from qc
		String[] RowvaluesArray = Rowvalues.split(";"); //////expected record values
		ArrayList<Integer> columnnumber = new ArrayList<Integer>();
		waitForElementVisibleWebdriver(attributenametable,attributevaluetable+"/thead/tr/th", "Table First Column");
		int columncount = attributeNameValues(attributenametable,attributevaluetable+"/thead/tr/th").size();	
		writeConsole("Elements Column Count["+columncount+"]");
		for (int i = 0; i < ColumnNamesArray.length; i++) {		
			String column = "NotFound";
			for (int j = 1;j <= columncount;j++) {					
				String currentcoulmnName = getTextWebdriver(attributenametable, attributevaluetable+"/thead/tr/th["+j+"]");
				if (currentcoulmnName.equals(ColumnNamesArray[i])) {
					columnnumber.add(j);
					column = "Found";
					break;
				}
			}			
			if (column.equals("NotFound")) {					
				writeFailure("Column Name["+ColumnNamesArray[i]+"] was Not Found in the Table");
			}
		}		

		String data = "NotFound";
		int k;			

		int rowcount = attributeNameValues(attributenametable,attributevaluetable+"/tbody/tr").size();
		writeConsole("Elements Row Count["+rowcount+"]");
		//						int rowcount = getCssCount(tablename+">tbody>tr");


		for (k = 1; k <= rowcount; k++) {	
			for (int x = 0; x < columnnumber.size(); x++) {
				String currentrowvalue = getTextWebdriver(attributenametable, attributevaluetable+"/tbody/tr["+k+"]/td["+columnnumber.get(x)+"]");
				//								String currentrowvalue = selenium.getTable(tablename+"."+k+"."+columnnumber.get(x));
				if (currentrowvalue.equals(RowvaluesArray[x])) {					
					data = "Found";

				}else {
					data = "NotFound";
					break; // moving to next row
				}
			}
			if (data.equals("Found")) {
				break;
			}
		}
		if (data.equals("NotFound")) {
			writeFailure("Row Values["+Rowvalues+"] was Not Found in the Table ");
		}
		if (data.equals("Found")) {
			rownumber = String.valueOf(k);
		}


		return rownumber;
	}

	public void verifyrowvalueswithcolumnNamesusingCSSWebdriver(String attributenametable,String attributevaluetable,String ColumnNames,String Rowvalues) throws Exception{			
		String[] ColumnNamesArray = ColumnNames.split(";");  ///expected colmn names in a array from qc
		String[] RowvaluesArray = Rowvalues.split(";"); //////expected record values
		ArrayList<Integer> columnnumber = new ArrayList<Integer>();
		waitForElementVisibleWebdriver(attributenametable,attributevaluetable+">thead>tr>th:nth-child(1)", "Table First Column");
		int columncount = attributeNameValues(attributenametable,attributevaluetable+">thead>tr>th").size();			
		writeConsole("Elements Column Count["+columncount+"]");
		for (int i = 0; i < ColumnNamesArray.length; i++) {		
			String column = "NotFound";
			for (int j = 1;j<=columncount;j++) {
				String currentcoulmnName = getTextWebdriver(attributenametable, attributevaluetable+">thead>tr>th:nth-child("+j+")");
				if (currentcoulmnName.equals(ColumnNamesArray[i])) {
					columnnumber.add(j);
					column = "Found";
					break;
				}
			}			
			if (column.equals("NotFound")) {					
				writeFailure("Column Name["+ColumnNamesArray[i]+"] was Not Found in the Table");
			}
		}		
		String data = "NotFound";
		int k;
		int rowcount = attributeNameValues(attributenametable,attributevaluetable+">tbody>tr").size();
		writeConsole("Elements Row Count["+rowcount+"]");
		for (k = 1 ;k <= rowcount;k++) {					
			for (int x = 0; x < columnnumber.size(); x++) {
				String currentrowvalue = getTextWebdriver(attributenametable, attributevaluetable+">tbody>tr:nth-child("+k+")>td:nth-child("+columnnumber.get(x)+")");
				if (RowvaluesArray[x].equalsIgnoreCase("Null")) { // Below code used to verify value is empty and make parameter value  'Null' to ""
					RowvaluesArray[x] = " ";
				}
				if (currentrowvalue.equals(RowvaluesArray[x])) {
					data = "Found";								
				}else {
					data = "NotFound";
					break; // moving to next row
				}
			}	
			if (data.equals("Found")) {
				break;
			}
		}
		if (data.equals("NotFound")) {
			writeFailure("Row Values["+Rowvalues+"] respect with Column["+ColumnNames+"] was Not Found in the Table ");
		}
		if (data.equals("Found")) {
			Reporter.log("Row Values["+Rowvalues+"] respect with Column["+ColumnNames+"] was Found in the Table ");
		}		
	}

	//				This Procedure is used to Verify row value is not present repective to column Names in the Table

	public void verifyNorowvalueswithcolumnNamesusingcssWebdriver(String attributenametable,String attributevaluetable,String ColumnNames,String Rowvalues) throws Exception{			
		String[] ColumnNamesArray = ColumnNames.split(";");  ///expected colmn names in a array from qc
		String[] RowvaluesArray = Rowvalues.split(";"); //////expected record values
		ArrayList<Integer> columnnumber = new ArrayList<Integer>();
		waitForElementVisibleWebdriver(attributenametable,attributevaluetable+">thead>tr>th:nth-child(1)", "Table First Column");
		int columncount = attributeNameValues(attributenametable,attributevaluetable+">thead>tr>th").size();	
		writeConsole("Elements Column Count["+columncount+"]");
		for (int i = 0; i < ColumnNamesArray.length; i++) {		
			String column = "NotFound";
			for (int j = 1;j <= columncount;j++) {		
				String currentcoulmnName = getTextWebdriver(attributenametable, attributevaluetable+">thead>tr>th:nth-child("+j+")");
				if (currentcoulmnName.equals(ColumnNamesArray[i])) {
					columnnumber.add(j);
					column = "Found";
					break;
				}
			}			
			if (column.equals("NotFound")) {					
				writeFailure("Column Name["+ColumnNamesArray[i]+"] was Not Found in the Table");
			}
		}		
		String data = "Found";
		int k;
		int rowcount = attributeNameValues(attributenametable,attributevaluetable+">tbody>tr").size();
		writeConsole("Elements Row Count["+rowcount+"]");
		for (k =1; k <= rowcount; k++) {									
			for (int x = 0; x < columnnumber.size(); x++) {
				String currentrowvalue = getTextWebdriver(attributenametable, attributevaluetable+">tbody>tr:nth-child("+k+")>td:nth-child("+columnnumber.get(x)+")");
				if (RowvaluesArray[x].equalsIgnoreCase("Null")) { // Below code used to verify value is empty and make parameter value  'Null' to ""
					RowvaluesArray[x] = " ";
				}
				if (currentrowvalue.equals(RowvaluesArray[x])) {
					data = "Found";					
				}else {
					data = "NotFound";
					break; // moving to next row				
				}
			}
			if (data.equals("Found")) {
				break;
			}
		}
		if (data.equals("Found")) {
			writeFailure("Row Values["+Rowvalues+"] respect with Column["+ColumnNames+"] was Found in the Table ");				
		}
		if (data.equals("NotFound")) {
			Reporter.log("Row Values["+Rowvalues+"] respect with Column["+ColumnNames+"] was Not Found in the Table ");
		}

	}

	public void verifyrowvalueswithcolumnNamesusingxpathWebdriver(String attributenametable,String attributevaluetable,String ColumnNames,String Rowvalues) throws Exception{			
		String[] ColumnNamesArray = ColumnNames.split(";");  ///expected colmn names in a array from qc
		String[] RowvaluesArray = Rowvalues.split(";"); //////expected record values
		ArrayList<Integer> columnnumber = new ArrayList<Integer>();
		waitForElementVisibleWebdriver(attributenametable,attributevaluetable+"/thead/tr/th", "Table First Column");
		int columncount = attributeNameValues(attributenametable,attributevaluetable+"/thead/tr/th").size();			
		writeConsole("Elements Column Count["+columncount+"]");
		for (int i = 0; i < ColumnNamesArray.length; i++) {		
			String column = "NotFound";
			for (int j = 1;j<=columncount;j++) {
				String currentcoulmnName = getTextWebdriver(attributenametable, attributevaluetable+"/thead/tr/th["+j+"]");
				if (currentcoulmnName.equals(ColumnNamesArray[i])) {
					columnnumber.add(j);
					column = "Found";
					break;
				}
			}			
			if (column.equals("NotFound")) {					
				writeFailure("Column Name["+ColumnNamesArray[i]+"] was Not Found in the Table");
			}
		}		
		String data = "NotFound";
		int k;
		int rowcount = attributeNameValues(attributenametable,attributevaluetable+"/tbody/tr").size();
		writeConsole("Elements Row Count["+rowcount+"]");
		for (k = 1 ;k <= rowcount;k++) {					
			for (int x = 0; x < columnnumber.size(); x++) {
				String currentrowvalue = getTextWebdriver(attributenametable, attributevaluetable+"/tbody/tr["+k+"]/td["+columnnumber.get(x)+"]");
				if (RowvaluesArray[x].equalsIgnoreCase("Null")) { // Below code used to verify value is empty and make parameter value  'Null' to ""
					RowvaluesArray[x] = " ";
				}
				if (currentrowvalue.equals(RowvaluesArray[x])) {
					data = "Found";								
				}else {
					data = "NotFound";
					break; // moving to next row
				}
			}	
			if (data.equals("Found")) {
				break;
			}
		}
		if (data.equals("NotFound")) {
			writeFailure("Row Values["+Rowvalues+"] respect with Column["+ColumnNames+"] was Not Found in the Table ");
		}
		if (data.equals("Found")) {
			Reporter.log("Row Values["+Rowvalues+"] respect with Column["+ColumnNames+"] was Found in the Table ");
		}		
	}
	public void verifyRowvalueswithExactcolumnNamesusingxpathWebdriver(String attributenametable,String attributevaluetable,String ColumnNames,String Rowvalues) throws Exception{			
		String[] ColumnNamesArray = ColumnNames.split(";");  ///expected colmn names in a array from qc
		String[] RowvaluesArray = Rowvalues.split(";"); //////expected record values
		ArrayList<Integer> columnnumber = new ArrayList<Integer>();
		waitForElementVisibleWebdriver(attributenametable,attributevaluetable+"/tbody/tr/td", "Table First Column");
		int columncount = attributeNameValues(attributenametable,attributevaluetable+"/tbody/tr[2]/td").size();	// table header present in 2nd row(tr[2])	
		writeConsole("Elements Column Count["+columncount+"]");
		for (int i = 0; i < ColumnNamesArray.length; i++) {		
			String column = "NotFound";
			for (int j = 1;j<=columncount;j++) {
				String currentcoulmnName = getTextWebdriver(attributenametable, attributevaluetable+"/tbody/tr[2]/td["+j+"]");
				if (currentcoulmnName.equals(ColumnNamesArray[i])) {
					columnnumber.add(j);
					column = "Found";
					break;
				}
			}			
			if (column.equals("NotFound")) {					
				writeFailure("Column Name["+ColumnNamesArray[i]+"] was Not Found in the Table");
			}
		}		
		String data = "NotFound";
		int k;
		int rowcount = attributeNameValues(attributenametable,attributevaluetable+"/tbody/tr").size();
		writeConsole("Elements Row Count["+rowcount+"]");
		for (k = 4 ;k <= rowcount;k++) { // table data row starts with 4th row(tr[4]) so starting with count 4 					
			for (int x = 0; x < columnnumber.size(); x++) {
				String currentrowvalue = getTextWebdriver(attributenametable, attributevaluetable+"/tbody/tr["+k+"]/td["+columnnumber.get(x)+"]");
				if (RowvaluesArray[x].equalsIgnoreCase("Null")) { // Below code used to verify value is empty and make parameter value  'Null' to ""
					RowvaluesArray[x] = " ";
				}
				if (currentrowvalue.equals(RowvaluesArray[x])) {
					data = "Found";								
				}else {
					data = "NotFound";
					break; // moving to next row
				}
			}	
			if (data.equals("Found")) {
				break;
			}
		}
		if (data.equals("NotFound")) {
			writeFailure("Row Values["+Rowvalues+"] respect with Column["+ColumnNames+"] was Not Found in the Table ");
		}
		if (data.equals("Found")) {
			Reporter.log("Row Values["+Rowvalues+"] respect with Column["+ColumnNames+"] was Found in the Table ");
		}		
	}

	//				This Procedure is used to Verify row value is not present repective to column Names in the Table

	public void verifyNorowvalueswithcolumnNamesusingxpathWebdriver(String attributenametable,String attributevaluetable,String tablename,String ColumnNames,String Rowvalues) throws Exception{			
		String[] ColumnNamesArray = ColumnNames.split(";");  ///expected colmn names in a array from qc
		String[] RowvaluesArray = Rowvalues.split(";"); //////expected record values
		ArrayList<Integer> columnnumber = new ArrayList<Integer>();
		waitForElementVisibleWebdriver(attributenametable,attributevaluetable+"/thead/tr/th", "Table First Column");
		int columncount = attributeNameValues(attributenametable,attributevaluetable+"/thead/tr/th").size();	
		writeConsole("Elements Column Count["+columncount+"]");
		for (int i = 0; i < ColumnNamesArray.length; i++) {		
			String column = "NotFound";
			for (int j = 1;j <= columncount;j++) {		
				String currentcoulmnName = getTextWebdriver(attributenametable, attributevaluetable+"/thead/tr/th["+j+"]");
				if (currentcoulmnName.equals(ColumnNamesArray[i])) {
					columnnumber.add(j);
					column = "Found";
					break;
				}
			}			
			if (column.equals("NotFound")) {					
				writeFailure("Column Name["+ColumnNamesArray[i]+"] was Not Found in the Table");
			}
		}		
		String data = "Found";
		int k;
		int rowcount = attributeNameValues(attributenametable,attributevaluetable+"/tbody/tr").size();
		writeConsole("Elements Row Count["+rowcount+"]");
		for (k =1; k <= rowcount; k++) {									
			for (int x = 0; x < columnnumber.size(); x++) {
				String currentrowvalue = getTextWebdriver(attributenametable, attributevaluetable+"/tbody/tr["+k+"]/td["+columnnumber.get(x)+"]");
				if (RowvaluesArray[x].equalsIgnoreCase("Null")) { // Below code used to verify value is empty and make parameter value  'Null' to ""
					RowvaluesArray[x] = " ";
				}
				if (currentrowvalue.equals(RowvaluesArray[x])) {
					data = "Found";					
				}else {
					data = "NotFound";
					break; // moving to next row				
				}
			}
			if (data.equals("Found")) {
				break;
			}
		}
		if (data.equals("Found")) {
			writeFailure("Row Values["+Rowvalues+"] respect with Column["+ColumnNames+"] was Found in the Table ");				
		}
		if (data.equals("NotFound")) {
			Reporter.log("Row Values["+Rowvalues+"] respect with Column["+ColumnNames+"] was Not Found in the Table ");
		}

	}


	public void verifycheckrownumberbasedonrowvaluecloumnnameusingcssWebdriver(String attributenametable,String attributevaluetable,String ColumnNames,String Rowvalues,String check) throws Exception{
		//					String rownumber = null;
		String[] ColumnNamesArray = ColumnNames.split(";");  ///expected colmn names in a array from qc
		String[] RowvaluesArray = Rowvalues.split(";"); //////expected record values
		ArrayList<Integer> columnnumber = new ArrayList<Integer>();
		waitForElementVisibleWebdriver(attributenametable,attributevaluetable+">thead>tr>th:nth-child(1)", "Table First Column");
		int columncount = attributeNameValues(attributenametable,attributevaluetable+">thead>tr>th").size();					
		writeConsole("Elements Coulmn Count["+columncount+"]");
		for (int i = 0; i < ColumnNamesArray.length; i++) {		
			String column = "NotFound";
			for (int j = 0; j < columncount; j++) {					
				String currentcoulmnName = getTextWebdriver(attributenametable, attributevaluetable+">thead>tr>th:nth-child("+j+")");
				if (currentcoulmnName.equals(ColumnNamesArray[i])) {
					columnnumber.add(j);
					column = "Found";
					break;
				}
			}			
			if (column.equals("NotFound")) {					
				writeFailure("Column Name["+ColumnNamesArray[i]+"] was Not Found in the Table");
			}
		}				
		//						int columncounter = 0;
		String data = "NotFound";
		int k;
		int rowcount = attributeNameValues(attributenametable,attributevaluetable+">tbody>tr").size();			
		writeConsole("Elements Row Count["+rowcount+"]");
		for (k = 1; k <= rowcount; k++) {					
			for (int x = 0; x < columnnumber.size(); x++) {
				String currentrowvalue = getTextWebdriver(attributenametable, attributevaluetable+">tbody>tr:nth-child("+k+")>td:nth-child("+columnnumber.get(x)+")");						
				if (currentrowvalue.equals(RowvaluesArray[x])) {
					data = "Found";

				}else {
					data = "NotFound";
					break; // moving to next row
				}
			}
			if (data.equals("Found")) {
				break;
			}
		}
		if (data.equals("NotFound")) {
			writeFailure("Row Values["+Rowvalues+"] was Not Found in the Table ");
		}
		if (data.equals("Found")) {
			if (check.equalsIgnoreCase("Check")) {									
				verifyElementCheckedWebdriver(attributenametable, attributevaluetable+">tbody>tr:nth-child("+k+")>td>input[type='checkbox']", "Row Values["+Rowvalues+"] respect with Column["+ColumnNames+"]");
			}else if (check.equalsIgnoreCase("Uncheck")) {
				verifyElementNotCheckedWebdriver(attributenametable, attributevaluetable+">tbody>tr:nth-child("+k+")>td>input[type='checkbox']", "Row Values["+Rowvalues+"] respect with Column["+ColumnNames+"]");
			}

		}	

	}

	//				This Procedure is used to collect the table row value respective to Column Name and Store in array list
	public ArrayList<String> getrowvaluebasedoncloumnnameusingcssWebdriver(String attributenametable,String attributevaluetable,String ColumnNames) throws Exception{
		String column = "NotFound";
		int columnnumber;
		ArrayList<String> rowvalue = new ArrayList<String>();
		waitForElementVisibleWebdriver(attributenametable,attributevaluetable+">thead>tr>th:nth-child(1)", "Table First Column");
		int columncount = attributeNameValues(attributenametable,attributevaluetable+">thead>tr>th").size();
		writeConsole("Elements Column Count["+columncount+"]");
		for (columnnumber= 1; columnnumber <= columncount; columnnumber++) {	
			String currentcoulmnName = getTextWebdriver(attributenametable, attributevaluetable+">thead>tr>th:nth-child("+columnnumber+")");
			//						String currentcoulmnName = selenium.getTable(tablename+".0."+columnnumber);
			if (currentcoulmnName.equals(ColumnNames)) {
				column = "Found";
				break;					
			}
		}
		if (column.equals("NotFound")) {					
			writeFailure("Column Name["+ColumnNames+"] was Not Found in the Table");
		}
		int rowcount = attributeNameValues(attributenametable,attributevaluetable+">tbody>tr").size();
		writeConsole("Elements Row Count["+rowcount+"]");
		//						int rowcount = getCssCount(tablename+">tbody>tr");
		for (int j = 1; j <= rowcount; j++) {
			String currentrowvalue = getTextWebdriver(attributenametable, attributevaluetable+">tbody>tr:nth-child("+j+")>td:nth-child("+columnnumber+")");				
			rowvalue.add(currentrowvalue);						
		}


		return rowvalue;
	}
	// This method is used to Verify Expected array[contains before sort Table row value respective to column Name] with actual array[contains After sort[Ascending or Descending] Table row value respective to column Name] 
	public void veriftytableascendingdescendingorderbasedoncloumnnameusingcss(String attributenametable,String attributevaluetable,String ColumnNames,ArrayList<String> expectedrowvalue,String arrayorder,String tablename) throws Exception{
		String column = "NotFound";
		int columnnumber;
		String actualrowvaluestring = "";
		String expectedrowvaluestring = "";
		waitForElementVisibleWebdriver(attributenametable,attributevaluetable+">thead>tr>th:nth-child(1)", "Table First Column");
		int columncount = attributeNameValues(attributenametable,attributevaluetable+">thead>tr>th").size();
		writeConsole("Elements Column Count["+columncount+"]");
		ArrayList<String> actualrowvalue = new ArrayList<String>();		

		for (columnnumber= 1; columnnumber <= columncount; columnnumber++) {	
			String currentcoulmnName = getTextWebdriver(attributenametable, attributevaluetable+">thead>tr>th:nth-child("+columnnumber+")");
			if (currentcoulmnName.equals(ColumnNames)) {
				column = "Found";
				break;					
			}
		}
		if (column.equals("NotFound")) {					
			writeFailure("Column Name["+ColumnNames+"] was Not Found in the Table");
		}
		int rowcount = attributeNameValues(attributenametable,attributevaluetable+">tbody>tr").size();			
		writeConsole("Elements Row Count["+rowcount+"]");
		for (int j = 1; j <= rowcount; j++) {
			String currentrowvalue = getTextWebdriver(attributenametable, attributevaluetable+">tbody>tr:nth-child("+j+")>td:nth-child("+columnnumber+")");
			actualrowvalue.add(currentrowvalue);					
			actualrowvaluestring = actualrowvaluestring+currentrowvalue+";";
		}


		//	
		//					for (int k = 0;k<expectedrowvalue.size();k++) {
		//						expectedrowvaluestring = expectedrowvaluestring+expectedrowvalue.get(k)+";";
		//					}

		if (arrayorder.equalsIgnoreCase("Ascending")) {
			for (int k = 0;k<expectedrowvalue.size();k++) {
				expectedrowvaluestring = expectedrowvaluestring+expectedrowvalue.get(k)+";";
			}
			if (actualrowvalue.equals(expectedrowvalue)) {					
				Reporter.log("Table["+tablename+"] was sorted in Ascending Order["+actualrowvaluestring+"]");
			} else {
				writeFailure("Table["+tablename+"] was Not sorted in Ascending Order - Actual Order ["+actualrowvaluestring+"] did not match with Expected Order["+expectedrowvaluestring+"]");
			}

		}else if (arrayorder.equalsIgnoreCase("Descending")) {				
			Collections.sort(expectedrowvalue, Collections.reverseOrder());
			for (int k = 0;k<expectedrowvalue.size();k++) {
				expectedrowvaluestring = expectedrowvaluestring+expectedrowvalue.get(k)+";";
			}
			if (actualrowvalue.equals(expectedrowvalue)) {					
				Reporter.log("Table["+tablename+"] was sorted in Descending Order["+actualrowvaluestring+"]");
			} else {
				writeFailure("Table["+tablename+"] was Not sorted in Descending Order - Actual Order ["+actualrowvaluestring+"] did not match with Expected Order["+expectedrowvaluestring+"]");
			}

		}
	}

	public void verifytablerowcountusingcss(String attributenametable,String attributevaluetable,String rowcount,String tablename){
		Reporter.log("Verify Table["+tablename+"] with Record["+rowcount+"] is displayed");
		int tablerowcount = attributeNameValues(attributenametable,attributevaluetable+">tbody>tr").size();
		writeConsole("Elements Row Count["+tablerowcount+"]");
		if (tablerowcount == Integer.parseInt(rowcount)) {
			Reporter.log("Table ["+tablename+"] with Record["+tablerowcount +"] was displayed");
		} else {
			writeFailure("Table ["+tablename+"] with Actual Record["+tablerowcount +"] did not match with Expected Record["+rowcount+"]");
		}			
	}

	// This Method is used to wait for Three element
	public void waitForThreeElementPresentWebdriver(String attributenameone, String attributevalueone,String elementonename,String attributenametwo, String attributevaluetwo,String elementtwoname,String attributenamethree, String attributevaluethree,String elementthreename) throws Exception{
		for (int second = 0;; second++) {

			// try catch block is used handle 'Permission Denied Error' when waiting for element
			try {
				writeConsole("Elements Present["+attributenameone+", "+attributevalueone+"]");
				WebElement elementone = attributeNameValue(attributenameone, attributevalueone);
				break;
			} catch (Exception e) {				

			}
			try {
				writeConsole("Elements Present["+attributenametwo+", "+attributevaluetwo+"]");
				WebElement elementtwo = attributeNameValue(attributenametwo, attributevaluetwo);
				break;
			} catch (Exception e) {

			}
			try {
				writeConsole("Elements Present["+attributenamethree+", "+attributevaluethree+"]");
				WebElement elementthree = attributeNameValue(attributenamethree, attributevaluethree);
				break;					
			} catch (Exception e) {

			}				
			if (second>=60) {
				writeFailure("Elements["+elementonename+" and "+elementtwoname+" and "+elementthreename+"] was Not Found after waiting for 1 Minute");
			}
			Thread.sleep(1000);
		}			

	}

	// This Method is used to wait for Three element
	public void waitForTwoElementPresentWebdriver(String attributenameone, String attributevalueone,String elementonename,String attributenametwo, String attributevaluetwo,String elementtwoname) throws Exception{
		for (int second = 0;; second++) {

			// try catch block is used handle 'Permission Denied Error' when waiting for element
			try {	
				writeConsole("Elements Present["+attributenameone+", "+attributevalueone+"]");
				WebElement elementone = attributeNameValue(attributenameone, attributevalueone);
				break;
			} catch (Exception e) {				

			}
			try {
				writeConsole("Elements Present["+attributenametwo+", "+attributevaluetwo+"]");
				WebElement elementtwo = attributeNameValue(attributenametwo, attributevaluetwo);
				break;
			} catch (Exception e) {

			}

			if (second>=60) {
				writeFailure("Elements["+elementonename+" and "+elementtwoname+"] was Not Found after waiting for 1 Minute");
			}
			Thread.sleep(1000);
		}
	}

	// This Method is used to wait for Three element
	public void waitForThreeElementVisisbleWebdriver(String attributenameone, String attributevalueone,String elementonename,String attributenametwo, String attributevaluetwo,String elementtwoname,String attributenamethree, String attributevaluethree,String elementthreename) throws Exception{
		for (int second = 0;; second++) {

			// try catch block is used handle 'Permission Denied Error' when waiting for element
			try {
				writeConsole("Elements Displayed["+attributenameone+", "+attributevalueone+"]");
				WebElement elementone = attributeNameValue(attributenameone, attributevalueone);
				if (elementone.isDisplayed()) {							
					break;
				}						
			} catch (Exception e) {				

			}
			try {
				writeConsole("Elements Displayed["+attributenametwo+", "+attributevaluetwo+"]");
				WebElement elementtwo = attributeNameValue(attributenametwo, attributevaluetwo);
				if (elementtwo.isDisplayed()) {
					break;
				}	
			} catch (Exception e) {

			}
			try {
				writeConsole("Elements Displayed["+attributenamethree+", "+attributevaluethree+"]");
				WebElement elementthree = attributeNameValue(attributenamethree, attributevaluethree);
				if (elementthree.isDisplayed()) {
					break;
				}				
			} catch (Exception e) {

			}				
			if (second>=60) {
				writeFailure("Elements["+elementonename+" and "+elementtwoname+" and "+elementthreename+"] was Not Visible after waiting for 1 Minute");
			}
			Thread.sleep(1000);
		}			

	}

	// This Method is used to wait for Three element
	public void waitForTwoElementVisisbleWebdriver(String attributenameone, String attributevalueone,String elementonename,String attributenametwo, String attributevaluetwo,String elementtwoname) throws Exception{
		for (int second = 0;; second++) {

			// try catch block is used handle 'Permission Denied Error' when waiting for element
			try {	
				writeConsole("Elements Displayed["+attributenameone+", "+attributevalueone+"]");
				WebElement elementone = attributeNameValue(attributenameone, attributevalueone);
				if (elementone.isDisplayed()) {
					break;
				}

			} catch (Exception e) {				

			}
			try {
				writeConsole("Elements Displayed["+attributenametwo+", "+attributevaluetwo+"]");
				WebElement elementtwo = attributeNameValue(attributenametwo, attributevaluetwo);
				if (elementtwo.isDisplayed()) {
					break;
				}

			} catch (Exception e) {

			}

			if (second>=60) {
				writeFailure("Elements["+elementonename+" and "+elementtwoname+"] was Not Visible after waiting for 1 Minute");
			}
			Thread.sleep(1000);
		}
	}

	//				 This Method is used to get the ID of the Element by using its label where ID is Generated during Run-time(Dynamic ID) 
	//				and also get respective element from Property File and replace the element ID(Static ID) in Property file with Dynamic ID. 
	public String getElementIDbyLabelusingXpathWebdirver(String Label,String attributevalue) throws Exception {
		//					System.out.println("Proceed to Get the Element ID by Its Label ");
		String FinaleleId = null;
		//					String eleText = selenium.getText("//label[contains]");
		//					String elementID = selenium.getAttribute("//label[text()=\""+Label+"\"]/@htmlfor"); // Getting Dynamic ID
		//					String elementID = selenium.getAttribute("//label[text()=\""+Label+"\"]/@for"); // Getting Dynamic ID					
		String elementID = driver.findElement(By.xpath("//label[text()='"+Label+"']")).getAttribute("for");
		//					String elementID = selenium.getAttribute("//label[text()='"+Label+"']/@for"); // Getting Dynamic ID
		//					System.out.println("First ID "+elementID);		
		String[] OrSplit = attributevalue.split("'");
		//					System.out.println("First part 0 "+OrSplit[0]);
		//					System.out.println("First part 1 "+OrSplit[1]);
		//					System.out.println("First part 2 "+OrSplit[2]);
		FinaleleId = OrSplit[0]+"'"+elementID ; // replacing Element Static ID With Dynamic ID
		for (int i = 2; i < OrSplit.length; i++) {
			//						System.out.println("Array value  "+OrSplit[i]);
			FinaleleId = FinaleleId+"'"+OrSplit[i];	
			//						System.out.println("Total Element for loop  "+FinaleleId);
		}
		//					System.out.println("Total Element   "+FinaleleId);
		return FinaleleId;
	}

	//				 This Method is used to get the ID of the Element by using its label where ID is Generated during Run-time(Dynamic ID) 
	//				and also get respective element from Property File and replace the element ID(Static ID) in Property file with Dynamic ID. 
	public String getElementIDbyLabelContainsusingXpathWebdirver(String LabelContains,String attributevalue) throws Exception {
		//					System.out.println("Proceed to Get the Element ID by Its Label ");
		String FinaleleId = null;
		//					String eleText = selenium.getText("//label[contains]");
		//					String elementID = selenium.getAttribute("//label[text()=\""+Label+"\"]/@htmlfor"); // Getting Dynamic ID
		//					String elementID = selenium.getAttribute("//label[contains(text(),\""+LabelContains+"\")]/@for"); // Getting Dynamic ID
		String elementID = driver.findElement(By.xpath("//label[contains(text(),'"+LabelContains+"')]")).getAttribute("for");
		//					String elementID = selenium.getAttribute("//label[text()='"+Label+"']/@for"); // Getting Dynamic ID
		//					System.out.println("First ID "+elementID);		
		String[] OrSplit = attributevalue.split("'");
		//					System.out.println("First part 0 "+OrSplit[0]);
		//					System.out.println("First part 1 "+OrSplit[1]);
		//					System.out.println("First part 2 "+OrSplit[2]);
		FinaleleId = OrSplit[0]+"'"+elementID ; // replacing Element Static ID With Dynamic ID
		for (int i = 2; i < OrSplit.length; i++) {
			//						System.out.println("Array value  "+OrSplit[i]);
			FinaleleId = FinaleleId+"'"+OrSplit[i];	
			//						System.out.println("Total Element for loop  "+FinaleleId);
		}
		//					System.out.println("Total Element   "+FinaleleId);
		return FinaleleId;
	}


	//				 This Method is used to get the ID of the Element by using its label where ID is Generated during Run-time(Dynamic ID) 
	//				and also get respective element from Property File and replace the element ID(Static ID) in Property file with Dynamic ID. 
	public String getElementIDbyLabelusingCSSWebdirver(String Label,String attributevalue) throws Exception {
		//					System.out.println("Proceed to Get the Element ID by Its Label ");
		String FinaleleId = null;
		//					String eleText = selenium.getText("//label[contains]");
		//					String elementID = selenium.getAttribute("//label[text()=\""+Label+"\"]/@htmlfor"); // Getting Dynamic ID
		//					String elementID = selenium.getAttribute("//label[text()=\""+Label+"\"]/@for"); // Getting Dynamic ID
		String elementID = driver.findElement(By.cssSelector("label[innerHTML='"+Label+"']")).getAttribute("for");
		//					String elementID = selenium.getAttribute("//label[text()='"+Label+"']/@for"); // Getting Dynamic ID
		//					System.out.println("First ID "+elementID);		
		String[] OrSplit = attributevalue.split("'");
		//					System.out.println("First part 0 "+OrSplit[0]);
		//					System.out.println("First part 1 "+OrSplit[1]);
		//					System.out.println("First part 2 "+OrSplit[2]);
		FinaleleId = OrSplit[0]+"'"+elementID ; // replacing Element Static ID With Dynamic ID
		for (int i = 2; i < OrSplit.length; i++) {
			//						System.out.println("Array value  "+OrSplit[i]);
			FinaleleId = FinaleleId+"'"+OrSplit[i];	
			//						System.out.println("Total Element for loop  "+FinaleleId);
		}
		//					System.out.println("Total Element   "+FinaleleId);
		return FinaleleId;
	}

	//				 This Method is used to get the ID of the Element by using its label where ID is Generated during Run-time(Dynamic ID) 
	//				and also get respective element from Property File and replace the element ID(Static ID) in Property file with Dynamic ID. 
	public String getElementIDbyLabelContainsusingCSSWebdirver(String LabelContains,String attributevalue) throws Exception {
		//					System.out.println("Proceed to Get the Element ID by Its Label ");
		String FinaleleId = null;
		//					String eleText = selenium.getText("//label[contains]");
		//					String elementID = selenium.getAttribute("//label[text()=\""+Label+"\"]/@htmlfor"); // Getting Dynamic ID
		//					String elementID = selenium.getAttribute("//label[contains(text(),\""+LabelContains+"\")]/@for"); // Getting Dynamic ID
		String elementID = driver.findElement(By.cssSelector("label[innerHTML*='"+LabelContains+"']")).getAttribute("for");
		//					String elementID = selenium.getAttribute("//label[text()='"+Label+"']/@for"); // Getting Dynamic ID
		//					System.out.println("First ID "+elementID);		
		String[] OrSplit = attributevalue.split("'");
		//					System.out.println("First part 0 "+OrSplit[0]);
		//					System.out.println("First part 1 "+OrSplit[1]);
		//					System.out.println("First part 2 "+OrSplit[2]);
		FinaleleId = OrSplit[0]+"'"+elementID ; // replacing Element Static ID With Dynamic ID
		for (int i = 2; i < OrSplit.length; i++) {
			//						System.out.println("Array value  "+OrSplit[i]);
			FinaleleId = FinaleleId+"'"+OrSplit[i];	
			//						System.out.println("Total Element for loop  "+FinaleleId);
		}
		//					System.out.println("Total Element   "+FinaleleId);
		return FinaleleId;
	}


	public void verifyElementWithTitleWebdriver(String attributename, String attributevalue,String expectedtitle,String elementname) throws Exception{
		Reporter.log("Verify Element("+elementname+") With Title Text("+expectedtitle+")");
		if (isDisplayedWebdriver(attributename, attributevalue)) {
			String actualtile = getAttributeWebdriver(attributename, attributevalue, "title");
			if (expectedtitle.equals(actualtile)) {
				Reporter.log("Element["+elementname+"] With Title Text["+actualtile+"] was displayed correctly ");
			} else {
				writeFailure("Element["+elementname+"] With Actuals Title Text - ["+actualtile+"]Text did not match Expected Title Text - ["+expectedtitle+"]");
			}

		} else {
			writeFailure("Element ["+elementname+" ] was Not Present");
		}
	}
	public void checkWebdriverCheckbox(String attributename,String attributevalue) throws Exception{
		WebElement checkBox = attributeNameValue(attributename, attributevalue);
		if(!checkBox.getAttribute("type").toLowerCase().equals("checkbox")){
			throw new Exception("This element is not a checkbox!");
		}
		if(checkBox.isSelected()){
			checkBox.click();
		}
	}
	public void uncheckWebdriverCheckbox(String attributename,String attributevalue) throws Exception{
		WebElement checkBox = attributeNameValue(attributename, attributevalue);
		if(!checkBox.getAttribute("type").toLowerCase().equals("checkbox")){
			throw new Exception("This element is not a checkbox!");
		}
		if(!checkBox.isSelected()){
			checkBox.click();
		}
	}
	public void VerifyDownloadedtxtFileExist(String FilePath) throws IOException {
		Reporter.log("Proceed to verfiy Downloaded Text File has Content");		
		Reporter.log("Proceed To Read The Text File From Specified Path Location");
		BufferedReader br = null;
		br = new BufferedReader(new FileReader(FilePath));
		if (br.readLine() != null) {
			Reporter.log("Downloaded form has content");				
		} else {
			writeFailure("Downloaded form is Empty");
		}		
	}

	public boolean isElementPresentWebdriver(String attributename, String attributevalue) throws Exception{
		writeConsole("Webdriver Element Present["+attributename+", "+attributevalue+"]");
		try {	
			attributeNameValue(attributename, attributevalue);
			writeConsole("Webdriver Element Present");
			return true;	
		} catch (Exception e) {
			writeConsole("Webdriver Element Not Present");
			return false;	
		}

	}
	public void verifyElementValueWebdriver(String attributename,String attributevalue,String expectedvalue,String elementname) throws Exception{
		Reporter.log("Verify Element("+elementname+") with Value("+expectedvalue+")");
		if (isElementPresentWebdriver( attributename,attributevalue)) {
			String actualvalue = getValueWebdriver(attributename, attributevalue);
			if (expectedvalue.equals(actualvalue)) {
				Reporter.log("Element["+elementname+"] with ["+actualvalue+"]Value was displayed correctly ");
			} else {
				writeFailure("Element["+elementname+"] with Actuals Value - ["+actualvalue+"]did not match Expected Value - ["+expectedvalue+"]");
			}

		} else {
			writeFailure("Element ["+elementname+" ] was Not Present");
		}
	}

	public void VerifyDownloadedtxtFile(String filepath,String filecontains) throws IOException {
		Reporter.log("Verify File contains text ("+filecontains+") present in the file location ("+filepath+")");
		Scanner br = null;
		//					String filepath = "C:\\Uploadform.txt";
		File b = new File(filepath);
		//					System.out.println("Downloaded form has content"+b.exists());
		Boolean a = false;
		br = new Scanner(b);
		//					br = new BufferedReader(new FileReader(filepath));
		while (br.hasNext()) {
			a=br.nextLine().contains(filecontains);
			Reporter.log("Downloaded form has content"+a);	
		}
		if(a)
		{
			Reporter.log("Downloaded form has been verified");
		}
		else
		{
			writeFailure("Downloaded form is Empty");
		}	
	}
	public void PackageSelection(String section,String index) {
		Reporter.log("Proceed to Click on Plus Buton With its respective Package Name");
		selenium.waitForCondition("selenium.isElementPresent(\"xpath=(//a[contains(text(),'"+section+"')])["+index+"]\")", "60000");
		//					selenium.waitForCondition("selenium.isVisible(\"xpath=(//a[contains(text(),'"+section+"')])["+index+"]\")", "60000");
		String seconclickName = selenium.getAttribute("xpath=(//a[contains(text(),'"+section+"')])["+index+"]/@onclick");
		writeConsole("Onclick Value for Section "+seconclickName);
		String[] secNamespl =seconclickName.split("\\(");
		String[] secnodespl = secNamespl[1].split("\\)");
		String secnode = secnodespl[0];
		writeConsole("Node Value for Section "+secnode);
		String nodePlus = selenium.getAttribute("//a[contains(@onclick,'toggle("+secnode+")')]/@onmouseover");
		writeConsole("Plus OuterHTML Value "+nodePlus);
		if (nodePlus.contains("Click to expand")) {
			clickWebdriver(attributeName_xpath, "//a[contains(@onclick,'toggle("+secnode+")')]");
			//						selenium.click("//a[contains(@onclick,'toggle("+secnode+")')]");
		}
	}
	public void PackageSelectionFieldDefinition(String section,String index) {
		Reporter.log("Proceed to Click on Plus Buton With its respective Package Name");
		selenium.waitForCondition("selenium.isElementPresent(\"xpath=(//b[font[text()='"+section+"']]/preceding-sibling::a[img[contains(@src,'plus')]])["+index+"]\")", "60000");
//		selenium.waitForCondition("selenium.isElementPresent(\"xpath=(//font[contains(text(),'"+section+"')])["+index+"]\")", "60000");
		//					selenium.waitForCondition("selenium.isVisible(\"xpath=(//a[contains(text(),'"+section+"')])["+index+"]\")", "60000");
		String seconclickName = selenium.getAttribute("xpath=(//b[font[text()='"+section+"']]/preceding-sibling::a[img[contains(@src,'plus')]])["+index+"]]/@onclick");
		writeConsole("Onclick Value for Section "+seconclickName);
		String[] secNamespl =seconclickName.split("\\(");
		String[] secnodespl = secNamespl[1].split("\\)");
		String secnode = secnodespl[0];
		writeConsole("Node Value for Section "+secnode);
		String nodePlus = selenium.getAttribute("//a[contains(@onclick,'toggle("+secnode+")')]/@onmouseover");
		writeConsole("Plus OuterHTML Value "+nodePlus);
		if (nodePlus.contains("Click to expand")) {
			clickWebdriver(attributeName_xpath, "//a[contains(@onclick,'toggle("+secnode+")')]");
			//						selenium.click("//a[contains(@onclick,'toggle("+secnode+")')]");
		}
	}
	public void ClosePackageSelection() throws Exception {
		Reporter.log("Proceed to Click on Minus Buton to Close package");
		//selenium.selectFrame("relative=up");
		//					selenium.selectFrame("//frame[@name='frmTreeMenu']");
		//					SelectTreeFrame();
		selenium.waitForCondition("selenium.isElementPresent(\"//img[contains(@src,'minus')]\")", "60000");
		int minusCount = selenium.getXpathCount("//img[contains(@src,'minus')]").intValue();
		writeConsole("Minus Count "+minusCount);
		for (int i = minusCount; i > 0; i--) {
			clickWebdriver(attributeName_xpath, "xpath=(//img[contains(@src,'minus')])["+i+"]");
			//						selenium.click("xpath=(//img[contains(@src,'minus')])["+i+"]");			
		}
	}
	public void waitForFile(String pathname) throws Exception{      
		Reporter.log("Wait for File is Exist in the Path["+pathname+"]");      
		for (int i = 0;; i++) {       
			File file = new File(pathname);       
			if (file.isFile()) {        
				writeConsole("File is Exist in the Location["+pathname+"]");        
				break;       
			}else { //       writeConsole("File is Not Exist in the Location["+pathname+"]");       }       Thread.sleep(1000);       if
			}
			Thread.sleep(1000);
			if (i > 60) {
				writeConsole("File is Not Exist");
			}

		}
	}
	public void verifyFile(String pathname) throws Exception{
		Reporter.log("Verify File is Exist in the Path["+pathname+"]");
		writeConsole("Verify File is Exist in the Path["+pathname+"]");
		File file = new File(pathname);
		if (file.isFile()) {
			Reporter.log("File is Exist in the Location["+pathname+"]");
			writeConsole("File is Exist in the Location["+pathname+"]");
		} else {
			writeFailure("File is Not Exist in the Location["+pathname+"]");
		}
	}
	public void verifyPageTitleWebdriver(String attributename, String attributevalue, String elementattributename, String expectedpagetitle) throws Exception{
		Reporter.log("Verify Page Title as ["+expectedpagetitle+"]");
		String actualpagetile = getAttributeWebdriver(attributename, attributevalue, elementattributename);
		if (actualpagetile.equals(expectedpagetitle)) {
			Reporter.log("Page with Title["+actualpagetile+"] was displayed Correctly");
		} else {
			writeFailure("Page With Actual Title - ["+actualpagetile+"] did not Match Expected Title - ["+expectedpagetitle+"]");
		}
	}
	public void waitForPageToLoadWebdriver() {
		writeConsole("Webdriver pageLoadTimeout 30 Second");
		driver.manage().timeouts().pageLoadTimeout(STANDARD_PAGE_LOAD_WAIT_TIME_WEBDRIVER, TimeUnit.SECONDS);
	}

	//				******************************End of Selenium Webdriver*******************************************************
	public void verifyTabelRowvalueswithcolumnNamesusingxpathWebdriver(String attributenametable,String attributevaluetable,String ColumnNames,String Rowvalues) throws Exception{			
		String[] ColumnNamesArray = ColumnNames.split(";");  ///expected colmn names in a array from qc
		String[] RowvaluesArray = Rowvalues.split(";"); //////expected record values
		ArrayList<Integer> columnnumber = new ArrayList<Integer>();
		waitForElementPresentWebdriver(attributenametable,attributevaluetable+"/*/tr/th", "Table First Column");
		int columncount = attributeNameValues(attributenametable,attributevaluetable+"/*/tr/th").size();			
		writeConsole("Elements Column Count["+columncount+"]");
		for (int i = 0; i < ColumnNamesArray.length; i++) {		
			String column = "NotFound";
			for (int j = 1;j<=columncount;j++) {
				String currentcoulmnName = getTextWebdriver(attributenametable, attributevaluetable+"/*/tr/th["+j+"]");
				if (currentcoulmnName.equals(ColumnNamesArray[i])) {
					columnnumber.add(j);
					column = "Found";
					break;
				}
			}			
			if (column.equals("NotFound")) {					
				writeFailure("Column Name["+ColumnNamesArray[i]+"] was Not Found in the Table");
			}
		}		
		String data = "NotFound";
		int k;
		int rowcount = attributeNameValues(attributenametable,attributevaluetable+"/tbody/tr").size();
		writeConsole("Elements Row Count["+rowcount+"]");
		for (k = 1 ;k <= rowcount;k++) {					
			for (int x = 0; x < columnnumber.size(); x++) {
				String currentrowvalue = getTextWebdriver(attributenametable, attributevaluetable+"/tbody/tr["+k+"]/*["+columnnumber.get(x)+"]");
				if (RowvaluesArray[x].equalsIgnoreCase("Null")) { // Below code used to verify value is empty and make parameter value  'Null' to ""
					RowvaluesArray[x] = " ";
				}
				if (currentrowvalue.equals(RowvaluesArray[x])) {
					data = "Found";								
				}else {
					data = "NotFound";
					break; // moving to next row
				}
			}	
			if (data.equals("Found")) {
				break;
			}
		}
		if (data.equals("NotFound")) {
			writeFailure("Row Values["+Rowvalues+"] respect with Column["+ColumnNames+"] was Not Found in the Table ");
		}
		if (data.equals("Found")) {
			Reporter.log("Row Values["+Rowvalues+"] respect with Column["+ColumnNames+"] was Found in the Table ");
		}		
	}


}
