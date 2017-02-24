package procedures_NewFramework.AYSmoke.MaintenanceCenter;

		import or.OR;

		import org.openqa.selenium.By;
		import org.testng.Reporter;
		import org.testng.annotations.Test;

		import processor.CommonSeleniumActions;

import java.util.Iterator;

public class MC_FTPTestSucceded_Verify extends CommonSeleniumActions implements OR{
	@Test(description="This Procedure is to perform some Operation in 'FTP Test Succeded' page")
	public void MC_FTPTestSucceded_Verify()throws Exception{
		try{
			Reporter.log("Proceed to verify sucessfully login to Maintenance center");
			String[] testdata = datacontainer;
			String message = testdata[0];
			String closewindow = testdata[1];
			Reporter.log("Check login to Maintenance center");
			if (!message.equals("")) {
				Reporter.log("Step 1 - Verify message is ["+message+"]");
				waitForPageToLoadWebdriver();
				String Message = driver.findElement(By.xpath("//body")).getAttribute("innerHTML");
				//isDisplayedWebdriver(attributeName_xpath,"//body[contains(text(),'"+message+"')]");
				if(Message.equalsIgnoreCase(message)){
					verifyElementTextWebdriver(attributeName_xpath,"//body[contains(text(),'"+message+"')]",message,message);
					System.out.println("Message Verified ");
				}
				writeConsole(message);
			}
			if (!closewindow.equals("")) {
				Reporter.log("Step 2 - Close the Window");
				Thread.sleep(5000);
				recentPopupCloseWebdriver();
			}
		}catch(Exception e){
			writeFailure(e.getLocalizedMessage());
		}
	}

}

