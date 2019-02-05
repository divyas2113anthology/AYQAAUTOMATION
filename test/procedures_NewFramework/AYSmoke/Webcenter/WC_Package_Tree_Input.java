package procedures_NewFramework.AYSmoke.Webcenter;

import or.OR;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

public class WC_Package_Tree_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'Configure Data Dictionary' page")
	public void WC_Package_Tree_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Configure Data Dictionary' Page");
			String[] testdata = datacontainer;
			String logoutmain = testdata[0];
			String treepackage = testdata[1];
			Reporter.log("Input Test Data was retrieved for 'Configure Data Dictionary' Page");
//			writeFailure("Given Test Data["+yesno+"] either Incorrect or has not be Scripted ");
//			selenium.selectFrame("relative=up");
//			selenium.selectFrame("frmTreeMenu");
//			driver.switchTo().frame("relative=up");
//			driver.switchTo().frame("frmTreeMenu");\
//			switchToFrameNameIdWebdriver("relative=up");
			switchToDefaultContentWebdriver();
			switchToFrameNameIdWebdriver("frmTreeMenu");

			if (!logoutmain.equals("")) {
				if(logoutmain.equalsIgnoreCase("Application System Home")){
					waitForElementPresentWebdriver(attributeName_xpath,"//a[text()='"+logoutmain+"']","Wait for element to display");
					clickWebdriver(attributeName_xpath,"//a[text()='"+logoutmain+"']");
					sleep(5);

				}else{
					if(logoutmain.equalsIgnoreCase("Main Menu")){
						logoutmain = "ClientMain";
					}
					Reporter.log("Step 1 - Perform the operation to click the link as [" + logoutmain + "]");
					waitForElementPresentWebdriverWait(attributeName_xpath, MCG_MainLogout + logoutmain + "')]", logoutmain);
					clickWebdriver(attributeName_xpath, MCG_MainLogout + logoutmain + "')]");
					waitForPageToLoadWebdriver();
				}
			}
			if (!treepackage.equals("")) {
				Reporter.log("Step 2 - Perform the operation to click the Package as ["+treepackage+"]");
//				waitForElementPresentWebdriver(attributeName_xpath, "//div[@id='divTree']", "Package Page");
				String [] SplitPackage = treepackage.split(";");
				System.out.println("Length : "+SplitPackage.length);
				System.out.println("Package1"+SplitPackage[0]);
				if(isElementPresentWebdriver(attributeName_xpath,"//a[text()='"+SplitPackage[0]+"']/preceding-sibling::a[contains(@onmouseover,'Click to expand')]" )){
					clickWebdriver(attributeName_xpath,"//a[text()='"+SplitPackage[0]+"']/preceding-sibling::a[contains(@onmouseover,'Click to expand')]" );
					sleep(2);
				}
				for (int i = 0; i < SplitPackage.length; i++) {
					writeConsole("Tree Package"+i+":"+SplitPackage[i]);
					if (i== SplitPackage.length-1) {
						//clickWebdriver(attributeName_linktext, SplitPackage[i]);
						try {
							waitForPageToLoadWebdriver();
							clickWebdriver(attributeName_xpath, "//a[contains(text(),'" + SplitPackage[i] + "')]");
							sleep(2);
							waitForPageToLoadWebdriver();

						}catch(Exception e){
							//clickWebdriver(attributeName_xpath,"//img[contains(@src,'plus')]");
							waitForPageToLoadWebdriver();
							clickWebdriver(attributeName_xpath, "//a[contains(text(),'" + SplitPackage[i] + "')]");
							sleep(2);
							waitForPageToLoadWebdriver();
						}
					}else{
						//--start--Rahul Mehta
						System.out.println(SplitPackage[i]);
						//PackageSelection(SplitPackage[i], "1");
							waitForPageToLoadWebdriver();
							PackageSelectionWebdriver(attributeName_xpath, SplitPackage[i], "1");
							waitForPageToLoadWebdriver();
							if(SplitPackage[i].equalsIgnoreCase("Application for QA Automation")){
                                WebElement SeconclickName = driver.findElement(By.xpath("//a[contains(text(),'"+SplitPackage[i]+"')]/preceding-sibling::a[contains(@onclick,'rePaintTree')]"));
                                String seconclickName = SeconclickName.getAttribute("onmouseover");
                                if(seconclickName.contains("Click to expand")){
                                    PackageSelectionWebdriver(attributeName_xpath, SplitPackage[i], "1");
                                    sleep(2);
                                }
                            }
						//--End--Rahul Mehta
					}
				}
				/*try {
					if (isDisplayedWebdriver(attributeName_xpath, "//img[contains(@src,'minus')]")) {
						ClosePackageSelection();
					}
				}catch(Exception e){
					System.out.println("no Minus symbol");
				}*/
			}
			switchToDefaultContentWebdriver();
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}



