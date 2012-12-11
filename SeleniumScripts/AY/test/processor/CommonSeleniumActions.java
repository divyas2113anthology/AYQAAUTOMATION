package processor;

import java.io.File;
import java.io.IOException;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import org.testng.Assert;
import org.testng.Reporter;

public class CommonSeleniumActions extends Processor{
	
	public void open(String url){		
		selenium.open(url);
	}
	
	public void click(String locator){
//		elementexception(locator);
		selenium.click(locator);
	}
	
	public void type(String locator,String value){
//		elementexception(locator);
		selenium.type(locator, value);
	}
	
	public void doubleClick(String locator){
		elementexception(locator);
		selenium.doubleClick(locator);
	}
		
	public void dragAndDrop(String locator,String movementsString){
		//elementexception(locator);
		selenium.dragAndDrop(locator, movementsString);
	}
	
	public void selectWindow(String windowName) {
		//elementexception(windowName);
		selenium.selectWindow(windowName);
	}
	
	public void selectMainWindow() {
//		Reporter.log("Proceed to Select Main Window");
		selenium.selectWindow(null);
	}
	
	public String getText(String locator){
		//elementexception(locator);
		return selenium.getText(locator);
	}	

	public String getValue(String locator){
		//elementexception(locator);
		return selenium.getValue(locator);
	}

	public void select(String selectLocator,String optionLocator){
		//elementexception(selectLocator);
		selenium.select(selectLocator,optionLocator);
	}
	
	public void waitForPageToLoad(){
		selenium.waitForPageToLoad(STANDARD_PAGE_LOAD_WAIT_TIME);
	}
	
    protected void focus(String locator){
    	//elementexception(locator);
    	selenium.focus(locator);
    }
    protected void highlight(String locator) {
    	//elementexception(locator);
		selenium.highlight(locator);
	}
	
	public void check(String locator){
		//elementexception(locator);
		selenium.check(locator);
	}
	
	public void uncheck(String locator){
		//elementexception(locator);
		selenium.uncheck(locator);
	}
	
	public void chooseCancelOnNextConfirmation(){
		selenium.chooseCancelOnNextConfirmation();
	}
	
	public void chooseOkOnNextConfirmation(){
		selenium.chooseOkOnNextConfirmation();
	}
	
	public void typeKeys(String locator,String value){
		//elementexception(locator);
		selenium.typeKeys(locator, value);
	}
	
	public void clickAt(String locator,String coordString){
		//elementexception(locator);
		selenium.clickAt(locator, coordString);
	}
	
	public void fireEvent(String locator, String eventName){
		//elementexception(locator);
		selenium.fireEvent(locator, eventName);
	}
	
	public void close() {
		selenium.close();
	}
	public void verifyTextPresent(String myString) {
		Assert.assertTrue(selenium.isTextPresent(myString), "Expected text '" + myString + "' was not found");
	}

	public void verifyTextNotPresent(String myString) {
		Assert.assertFalse(selenium.isTextPresent(myString), "Unexpected text '" + myString + "' was found");
	}

	public void verifyElementPresent(String elementLocator) {
		Assert.assertTrue(selenium.isElementPresent(elementLocator), "Expected element '" + elementLocator + "' was not found");      //Runs dog-slow in IE!  How come?
	}

	public void verifyElementNotPresent(String elementLocator) {
		Assert.assertFalse(selenium.isElementPresent(elementLocator), "Unexpected element '" + elementLocator + "' was found");
	}

	public void selectDefaultWindowAndWait() {
		selenium.selectWindow("");
		selenium.waitForPageToLoad(STANDARD_PAGE_LOAD_WAIT_TIME);
	}
	
	public void buttonDisabled(String locator){
		if(selenium.isElementPresent(locator))
		{
			System.out.println("Button is disabled");
		}
		else
		{
			System.out.println("Button is enabled");
		}
	}

	

	public void performAssertEqual(String actual,String expected){
		Assert.assertEquals(actual,expected);
	}
	
	public void performMouseOver(String locator) throws Exception{
		//elementexception(locator);
		selenium.mouseOver(locator);    	
	}	

	public void waitForElement(String elementLocater, String message)throws Exception{
		for (int second = 0;; second++) {
			if (second >= 60) writeFailure(message+" Timeout after 1 minute..");
			try { if (selenium.isElementPresent(elementLocater)) break; } catch (Exception e) {}
			Thread.sleep(30);
		}
	}
	public void waitForLongElement(String elementLocater, String message)throws Exception{
		for (int second = 0;; second++) {
			if (second >= 120) writeFailure(message+" Timeout after 2 minute..");
			try { if (selenium.isElementPresent(elementLocater)) break; } catch (Exception e) {}
			Thread.sleep(30);
		}
	}
	public void waitForElementNotPresent(String elementLocater,String message)throws Exception{
		for (int second = 0;; second++) {
			if (second >= 60) writeFailure(message+" Timeout after 1 minute..");
			try { if (selenium.isElementPresent(elementLocater)==false) break; } catch (Exception e) {}
			Thread.sleep(30);
		}
	}
	public void waitForElementVisible(String elementLocater, String message)throws Exception{
		for (int second = 0;; second++) {
			if (second >= 60) writeFailure(message+" Timeout after 2 minute..");
			try { if (selenium.isVisible(elementLocater)) break; } catch (Exception e) {}
			Thread.sleep(30);
		}
	}
	public void waitForElementNotVisible(String elementLocater, String message)throws Exception{
		for (int second = 0;; second++) {
			if (second >= 60) writeFailure(message+" Timeout after 1 minute..");
			try { if (!selenium.isVisible(elementLocater)) break; } catch (Exception e) {}
			Thread.sleep(30);
		}
	}
	public void waitForElementNotVisibleLong(String elementLocater, String message)throws Exception{
		for (int second = 0;; second++) {
			if (second >= 3600) writeFailure(message+" Timeout after 2 Hours..");
			try { if (!selenium.isVisible(elementLocater)) break; } catch (Exception e) {}
			Thread.sleep(30);
		}
	}
	public void waitForElementNotVisibleLongForFTP(String elementLocater, String message)throws Exception{
		for (int second = 0;; second++) {
			if (second >= 900) writeFailure(message+" Timeout after 10 Minute..");
			try { if (!selenium.isVisible(elementLocater)) break; } catch (Exception e) {}
			Thread.sleep(30);
		}
	}
	public boolean verifyCheckboxIsChecked(String checkboxLocator) {
		//elementexception(checkboxLocator);
		//elementexception(checkboxLocator);
		return selenium.isChecked(checkboxLocator);
	}



	public void verifyAttribute(String elementLocator, String attributeType, String expectedAttributeValue) {
		Assert.assertEquals(selenium.getAttribute(elementLocator + "@" + attributeType), expectedAttributeValue,
				"The attribute of type '" + attributeType + "' at element '" + elementLocator + "' did not equal expected value '"
				+ expectedAttributeValue + "'");
	}


	public void waitForPopup(){
		selenium.waitForPopUp("galeChildWindow","20000");
	}

	public void performGoBack(){
		selenium.goBack();
	}

	public void waitForText(String pattern, String message)throws Exception{
		for (int second = 0;; second++) {
			if (second >= 60) writeFailure(message+" Timeout after 1 minute..");
			try { if (selenium.isTextPresent(pattern)) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}
	}
	public void waitForTextLong(String pattern, String message)throws Exception{
		for (int second = 0;; second++) {
			if (second >= 72000) writeFailure(message+" Timeout after 2 Hour..");
			try { if (selenium.isTextPresent(pattern)) break; } catch (Exception e) {}
			Thread.sleep(100);
		}
	}
	public void waitForTextForSchedule(String pattern, String message)throws Exception{
		for (int second = 0;; second++) {
			if (second >= 300) writeFailure(message+" Timeout after 5 Minute..");
			try { if (selenium.isTextPresent(pattern)) break; } catch (Exception e) {}
			Thread.sleep(100);
		}
	}
	public void waitForTextNotPresent(String pattern, String message)throws Exception{
		for (int second = 0;; second++) {
			if (second >= 60) writeFailure(message+" Timeout after 1 minute..");
			try { if (!selenium.isTextPresent(pattern)) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}
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
			 System.out.println(" usedCol "+usedCol);
			 System.out.println(" usedrow "+usedrow );
			 System.out.println(" runrow "+runrow );
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
			int wintotal = windowsOpen.length-1;
//			System.out.println("Window lenght -->"+wintotal);
//			for (int i = 0; i <= wintotal; i++) {
//			System.out.println("Window for Loop -->"+windowsOpen[i]);
//			}
//			System.out.println("Window-->"+windowsOpen[wintotal]);
			Reporter.log("Waiting for popup...");	
			selenium.waitForPopUp(windowsOpen[wintotal], STANDARD_PAGE_LOAD_WAIT_TIME);
			Reporter.log("Popup Window is selected....");
			selenium.selectWindow("name="+windowsOpen[wintotal]);		
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
	
//	This Method is used to wait till object is Present
	public void waitForConditionisElementPresent(String OR,String wait){
		try {
//			selenium.waitForCondition("selenium.isElementPresent("+OR+")", wait);
			selenium.waitForCondition("selenium.isElementPresent(\""+OR+"\")", wait);
		} catch (Exception e) {
			writeFailure("Element["+OR+"] was not Found after waiting for ("+wait+") Second'");
		}
		
	}

//	This Method is used to Click 'Ok' Button in the Confirmation Pop up
	public void clickchooseokgetconfirmationpagepload(String OR){
		Reporter.log("Proceed to Click 'OK' button in Confirmation Popup");
		selenium.chooseOkOnNextConfirmation();
		click(OR);
		String confirmation = selenium.getConfirmation();
		Reporter.log("["+confirmation+"] Confirmation Pop up has been handled");
		waitForPageToLoad();	
	}
	
	
	public void headerStatement(String passsatment){
		Reporter.log("<tr><td><b><font size='4' color='Green'><a id=\"m"+golbalProcedureOrder+"\"\">Procedure Name - "+passsatment+"</a></font></b></td></tr>");
	}
	public void startExecutionOrder(int exeorder){
		Reporter.log("<b><font size='3' color='Green'>Procedure No. - "+exeorder+"</font></b>");
	}
	
	
//	public void writeParametersList1(String[] parameterNamesArray, String [] parameterValuesArray){
//		Reporter.log("<table border=\"3\" cellspacing=\"0\"<tr><td><b><font size='4' align=\"left\" color='Green'>Parameter Name</font></b></td><td><b><font size='4' color='Green'>Parameter Value(s)</font></b></td></tr>");
//		int numberOfParameters = parameterNamesArray.length - 1;
//		for (int i=0; i<=numberOfParameters; i++) {
//			Reporter.log("<tr><td><b><font size='4' align=\"left\" color='Green'>" + parameterNamesArray[i] + "</font></b></td><td><b><font size='4' color='Green'>" + parameterValuesArray[i] + "</font></b></td></tr>"); //starting a new row
//		}	
//		Reporter.log("</table>");
//	}
	
//	public void writeParametersList2(String[] parameterNamesArray, String [] parameterValuesArray){
//			String paramtername = "<table border=\"3\" cellspacing=\"0\"<tr>";
//		for (int i = 0; i < parameterNamesArray.length; i++) {
//			paramtername = paramtername+"<td><b><font size='4' align=\"left\" color='Green'> "+ parameterNamesArray[i] +"</font></b></td>";
//		}
//		String paramtervalue = "<tr>";
//		for (int i = 0; i < parameterValuesArray.length; i++) {
//			paramtervalue = paramtervalue+"<td><b><font size='4' align=\"left\" color='Green'>" + parameterValuesArray[i] + "</font></b></td>";
//		}		
//		Reporter.log(paramtername);
//		Reporter.log(paramtervalue);
//		Reporter.log("</table>");
//	}
	
	public void writeParametersTable(){		
		String paramtername = "<table border=\"3\" cellspacing=\"0\"<tr>";
	for (int i = 0; i < parameternames.length; i++) {
		paramtername = paramtername+"<td><b><font size='4' align=\"left\" color='Green'> "+ parameternames[i] +"</font></b></td>";
	}
	String paramtervalue = "<tr>";
	for (int i = 0; i < datacontainer.length; i++) {
		paramtervalue = paramtervalue+"<td><b><font size='4' align=\"left\" color='Green'>" + datacontainer[i] + "</font></b></td>";
	}		
	Reporter.log(paramtername);
	Reporter.log(paramtervalue);
	Reporter.log("</table>");
}
	
//	public void writeParametersList(String[] parameterNamesArray, String [] parameterValuesArray){
//		Reporter.log("<table cellspacing=0 cellpadding=0 class=\"param\">");
//		Reporter.log("<tr>"); //starting a new row
//		Reporter.log("<td><b><font size='4' color='Green'>Parameter Name</font></b></td>"); //writing the heading 'Parameter Name' in the first 'td'
//		Reporter.log("<td><b><font size='4' color='Green'>Parameter Value(s)</font></b></td>"); //writing the heading 'Parameter Value' in the second 'td'
//		Reporter.log("</tr>"); //ending the new row
//		
//		int numberOfParameters = parameterNamesArray.length - 1;
//		for (int i=0; i<=numberOfParameters; i++) {
//			Reporter.log("<tr>"); //starting a new row
//			Reporter.log("<td><b><font size='4' color='Green'>" + parameterNamesArray[i] + "</font></b></td>"); //writing the actual 'Parameter Name' in the first 'td'
//			Reporter.log("<td><b><font size='4' color='Green'>" + parameterValuesArray[i] + "</font></b></td>"); //writing the actual 'Parameter Value' in the second 'td'
//			Reporter.log("</tr>"); //ending the new row
//			
//		}	
//		Reporter.log("</table>");
//	}
	
	public void endExecutionOrder(int exeorder){
		//Reporter.log("<b><font size='3' color='Green'>##########End of Execution Order ["+exeorder+"]##########</font></b>");
		Reporter.log("<b><font size='3' color='Green'>End of Execution Order ["+exeorder+"]</font></b>");
	}
	
	public static void backtodetails(){
		Reporter.log("<p><a href=\"#Detail\">back to details</a></p>");
		Reporter.log("<hr noshade=\"noshade\"/> ");
		
	}
	public static void writeFailure(String failmessage){
		Reporter.log("<b><font size='3' color='Red'><strong>"+failmessage+"</strong></font></b>");
		Assert.fail(failmessage);
	}
	
	public void elementexception(String elementexception){
		if (!selenium.isElementPresent(elementexception)) {
			Reporter.log("<b><font size='3' color='Red'>Element("+elementexception+") was not found</font></b>");
		}
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
		
		public void getConfirmation(){		
		String confirmation = selenium.getConfirmation();
		Reporter.log("["+confirmation+"]Comfirmation Pop Up has been Handled");
		}
}
		
