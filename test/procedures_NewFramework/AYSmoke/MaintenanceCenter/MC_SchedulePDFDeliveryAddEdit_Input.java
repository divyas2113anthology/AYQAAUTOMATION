package procedures_NewFramework.AYSmoke.MaintenanceCenter;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class MC_SchedulePDFDeliveryAddEdit_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'Schedule PDF Delivery-Add' page")
	public void MC_SchedulePDFDeliveryAddEdit_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Schedule PDF Delivery-Add' Page");
			String[] testdata = datacontainer;
			String description = testdata[0];
			String printschedulebatch = testdata[1];
			String alternatepdf = testdata[2];
			String duplexprinting = testdata[3];
			String printbookmarks = testdata[4];
			String printselectionoption = testdata[5];
			String markssn = testdata[6];
			String markprinteddate = testdata[7];
			String listofessay = testdata[8];
			String alternatebatchfile = testdata[9];
			String servername = testdata[10];
			String serverdirectory = testdata[11];
			String username = testdata[12];
			String passwordauthentication = testdata[13];
			String authentication = testdata[14];
			String testftpconnection = testdata[15];
			String zipfilenamecheck = testdata[16];
			String zipfilename = testdata[17];
			String senddelivery = testdata[18];
			String senderrors = testdata[19];
			String emailaddress = testdata[20];
			String deleiveryschedule = testdata[21];
			String startdate = testdata[22];
			String starthour = testdata[23];
			String startminute = testdata[24];
			String enddate = testdata[25];
			String repeatcheck = testdata[26];
			String repeat = testdata[27];
			String button = testdata[28];
			String publickey = testdata[29];
			String sftpport = testdata[30];
			
			Reporter.log("Input Test Data was retrieved for 'Schedule PDF Delivery-Add' Page");

			if (!description.equals("")) {
					Reporter.log("Step 1 - Enter Description as ["+description+"]");
					System.out.println("Description");
					sendKeys(attributeName_xpath, QAE_Description, description);
				}
			
			if (!printschedulebatch.equals("")) {
				Reporter.log("Step 2 - Select printschedulebatch as ["+printschedulebatch+"]");
				selectByVisibleTextWebdriver(attributeName_xpath, SPDF_ScheduleBatch, printschedulebatch);
			}
			if (!alternatepdf.equals("")) {
				Reporter.log("Step 3 - Enter PDF name as ["+alternatepdf+"]");

			}
			if (!duplexprinting.equals("")) {
				Reporter.log("Enter value as ["+duplexprinting+"]");

			}
			if (!printbookmarks.equals("")) {
				Reporter.log("Enter value as ["+printbookmarks+"]");
				
			}
			if (!printselectionoption.equals("")) {
				Reporter.log("Enter value as ["+printselectionoption+"]");
				
			}
			if (!markssn.equals("")) {
				Reporter.log("Enter value as ["+markssn+"]");
				
			}
			if (!markprinteddate.equals("")) {
				Reporter.log("Enter value as ["+markprinteddate+"]");
				
			}
			if (!listofessay.equals("")) {
				Reporter.log("Enter value as ["+listofessay+"]");
				
			}
			if (!alternatebatchfile.equals("")) {
				Reporter.log("Enter value as ["+alternatebatchfile+"]");
				
			}
			if (!servername.equals("")) {
				Reporter.log("Enter the Server Name as ["+servername+"]");
				System.out.println("servername");
				sendKeys(attributeName_xpath, SPDF_ServerName, servername);
			}
			if (!serverdirectory.equals("")) {
				Reporter.log("Enter the Server Directory as ["+serverdirectory+"]");
				System.out.println("serverdirectory");
				sendKeys(attributeName_name, "txtFTPDirectory", serverdirectory);
			}
			if (!username.equals("")) {
				Reporter.log("Enter the User Name as ["+username+"]");
				System.out.println("username");
				sendKeys(attributeName_name, "txtFTPUsername", username);
			}
			if (!passwordauthentication.equals("")) {
				Reporter.log("Enter the Password as ["+passwordauthentication+"]");
				System.out.println("password");
				//sendKeys(attributeName_name, "txtFTPPassword", passwordauthentication);
				sendKeys(attributeName_xpath, "//input[@name='txtFTPPassword']", passwordauthentication);
				/*clickWebdriver(attributeName_xpath,"//td[@id='contentCol']/form/table//tr//td[@id='colSFTP0']/input[@type='radio']");
				isElementPresentWebdriver(attributeName_xpath, "//input[@name='txtSFTPPort']");
				//sendKeys(attributeName_xpath, "//input[@name='txtSFTPPort']", sftpport);
				clickWebdriver(attributeName_xpath,"//td[@id='contentCol']/form/table//tr//input[@value='0']");
				Thread.sleep(10000);*/
			}
			if (!authentication.equals("")) {
				Reporter.log("Click on Test FTP Connection Button ["+authentication+"]");
				System.out.println("authentication");
				clickWebdriver(attributeName_xpath, "//*[@name='btnTestFTP']");
				waitForPageToLoadWebdriver();
				recentPopupSelectWebdriver("Test FTP Connection");

			}
			
			if (!sftpport.equals("")) {
				Reporter.log("Click on Public key");
				System.out.println("port");

				Boolean check = driver.findElementByXPath("//*[@value='22']").isEnabled();
				System.out.println("Element is visible  :"  + check);
				//sendKeys(attributeName_name, "txtSFTPPort", sftpport);
				clickWebdriver(attributeName_xpath,"//input[@name='rdoLoginType' and @value='2']");
				sendKeys(attributeName_xpath, "//*[@value='22']", "26");
				clickWebdriver(attributeName_xpath,"//input[@name='rdoLoginType' and @value='1']");

			}
			if (!testftpconnection.equals("")) {
				Reporter.log("Click on Test FTP connection as["+testftpconnection+"]");
				System.out.println("Click on Test FTP connection as["+testftpconnection+"]");
				clickWebdriver(attributeName_name, "btnTestFTP");
				recentPopupSelectWebdriver("FTP Test");
			}
			if (!zipfilenamecheck.equals("")) {
				Reporter.log("Check zipfilename ["+zipfilenamecheck+"]");
				System.out.println("checkzip");
				waitForElementPresentWebdriverWait(attributeName_xpath, SPDF_ZipPdf, zipfilenamecheck);
				clickWebdriver(attributeName_xpath, SPDF_ZipPdf);
			}
	  		  if (!zipfilename.equals("")) {
				  Reporter.log("Enter the zip filename as ["+zipfilename+"]");
				  System.out.println("zipname");
				  waitForElementPresentWebdriverWait(attributeName_xpath, "//*[@name='txtZipFileName']", zipfilename);
				  System.out.println("File Name : "+zipfilename);
				  sendKeys(attributeName_xpath, "//*[@name='txtZipFileName']", zipfilename);
			  }
	  		if (!senddelivery.equals("")) {
				Reporter.log("Check ["+senddelivery+"]");
				System.out.println("senddelivery");
				clickWebdriver(attributeName_xpath, SPDF_SendDelivery);
			}
	  		if (!senderrors.equals("")) {
				Reporter.log("Enter value as ["+senderrors+"]");
				
			}
	  		if (!emailaddress.equals("")) {
				Reporter.log("Enter the Email Address as ["+emailaddress+"]");
				System.out.println("email");
				sendKeys(attributeName_name, "txtConfirmEmail", emailaddress);
			}
	  		if (!deleiveryschedule.equals("")) {
				Reporter.log("Enter value as ["+deleiveryschedule+"]");
				
			}
	  		if (!startdate.equals("")) {
				Reporter.log("Enter the Start Date as ["+startdate+"]");
				String getcurrentdate = requiredDateAndFormat("MM/dd/yyyy", startdate);
				System.out.println("Start Date is " + getcurrentdate );
				sendKeys(attributeName_name, "txtStartDate", getcurrentdate);

			}
			if (!starthour.equals("")) {
				Reporter.log("Enter the Start Hour as ["+starthour+"]");
				System.out.println("starthour");
				String StartHour = requiredHourAndMinute("hh", starthour);
				 selectByVisibleTextWebdriver(attributeName_name, "selHourStart", StartHour);
			}
			if (!startminute.equals("")) {
				Reporter.log("Enter the Start Minute as ["+startminute+"]");
				System.out.println("startminute");
				String StartMinute = requiredHourAndMinute("mm", startminute);
				selectByVisibleTextWebdriver(attributeName_name, "selMinutesStart", StartMinute);
			}
			if (!enddate.equals("")) {
				Reporter.log("Enter the Start Date as ["+enddate+"]");
				System.out.println("enddate");
				String getcurrentdate = requiredDateAndFormat("MM/dd/yyyy", enddate);
				sendKeys(attributeName_name, "txtEndDate", getcurrentdate+1);
			}
			if (!repeatcheck.equals("")) {
				Reporter.log("Enter value as ["+repeatcheck+"]");
				
			}
			if (!repeat.equals("")) {
				Reporter.log("Enter value as ["+repeat+"]");
				
			}
			if (!publickey.equals("")) {
				Reporter.log("Enter value as ["+publickey+"]");
				clickWebdriver(attributeName_xpath,"//input[@name='rdoLoginType' and @value='2']");
				Thread.sleep(10000);


			}
			if (!button.equals("")) {
				Reporter.log("Click the name of the button as ["+button+"]");
				System.out.println("button");
				if (button.equalsIgnoreCase("Save")) {
					clickWebdriver(attributeName_name, "imgSubmitBtnTop");
				}else if (button.equalsIgnoreCase("Cancel")) {
					clickWebdriver(attributeName_xpath, SAE_CancelButton);
					waitForPageToLoadWebdriver();
				}
			}
			}
		 catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}	
	}
