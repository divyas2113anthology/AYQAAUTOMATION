package procedures_NewFramework.AYSmoke.Webcenter.ManageChoiceGroups;

import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import or.OR;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Calendar;

public class WC_EditSpecialChoiceGroup_Input extends CommonSeleniumActions implements OR {

	@Test(description = "This Procedure is used to perform some operation in 'Manage Choice Groups' page")

	public void WC_EditSpecialChoiceGroup_Input() throws Exception {
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Manage Choice Groups");
			String[] testdata = datacontainer;
			String groupname = testdata[0];
			String groupdescription = testdata[1];
			String statuscategory = testdata[2];
			String labelName = testdata[3];
			String code = testdata[4];
			String active = testdata[5];
			String delete = testdata[6];
			String savecanceladdrow = testdata[7];
			String addrow = testdata[8];

            implicitWait();

            try{
                switchToFrameNameIdWebdriver("frmContent");
            }catch(Exception e){
                System.out.println("Already Switched to the Frame");
            }

			if (!groupdescription.equals("")) {
                Reporter.log("Enter Group Description");
                sendKeys(attributeName_xpath, MCG_groupdescription, groupdescription);
            }

                if (!addrow.equals("")) {
                    Reporter.log("Create a new row");
                    waitForElementPresentWebdriver(attributeName_xpath, MCG_AddRow, "Plus");
                    clickWebdriver(attributeName_xpath, MCG_AddRow);
                }
                if (!statuscategory.equals("")) {
                    Reporter.log("Select (" + statuscategory + ")from Status Category");
                    //String RowNumber = getTextWebdriver(attributeName_xpath, MCG_RowValue);

                    String RowNumber = getTextWebdriver(attributeName_xpath, "//td[input[@name='txtStatusCategory' and @value='']]/preceding-sibling::td");
                    System.out.println("RowNumber is " + RowNumber);
                    selectByVisibleTextWebdriver(attributeName_xpath, MCG_StatusCategory + RowNumber + "')]", statuscategory);
                    Reporter.log("Select (" + statuscategory + ")from Status Category");
                    //selectByValueWebdriver(attributeName_xpath, MCG_StatusCategory, "4");
                }

                if (!labelName.equals("")) {
                    Reporter.log("Enter Label");
                    String Label = labelName;
                    sendKeys(attributeName_xpath, "//input[@name='chkSelect']//following::input[@name='txtLabel']", Label);
                    Runtimedatawrite(Label, labelName);
                }

                if (!code.equals("")) {

                    Reporter.log("Enter Code value");
                    String codeValue = code + Calendar.getInstance().getTimeInMillis();
                    sendKeys(attributeName_xpath, "//input[@name='chkSelect']//following::input[@name='txtChoiceValue']", codeValue);
                    Runtimedatawrite(codeValue, code);
                }

                if (!active.equals("")) {
                    if (active.contains("uncheck")) {
                        String[] data = active.split(";");
                        try {
                            String statusName = Runtimedataread(data[0]);
                            System.out.println("==");
                            String check = driver.findElement(By.xpath("//input[@value='" + statusName + "']/../..//input[@name='chkActive']")).getAttribute("value");
                            if (check.equalsIgnoreCase("true")) {
                                //driver.findElement(By.xpath("//input[@value='"+statusName+"']/../..//input[@name='chkDelete']")).click();
                                waitForElementPresentWebdriver(attributeName_xpath, "//input[@value='" + statusName + "']/../..//input[@name='chkActive']", data[1]);
                                clickWebdriver(attributeName_xpath, "//input[@value='" + statusName + "']/../..//input[@name='chkActive']");
                                //input[@value='1482150971328']/../..//input[@name='chkActive']
                            }
                        } catch (Exception e) {
                            String check = driver.findElement(By.xpath("//input[@value='" + active + "']/../..//input[@name='chkActive']")).getAttribute("value");
                            if (check.equalsIgnoreCase("true")) {
                                //driver.findElement(By.xpath("//input[@value='"+statusName+"']/../..//input[@name='chkDelete']")).click();
                                waitForElementPresentWebdriver(attributeName_xpath, "//input[@value='" + active + "']/../..//input[@name='chkActive']", data[1]);
                                clickWebdriver(attributeName_xpath, "//input[@value='" + active + "']/../..//input[@name='chkActive']");
                                //input[@value='1482150971328']/../..//input[@name='chkActive']
                            }
                        }
                    } else {
                        String Active = Runtimedataread(active);
                        waitForElementPresentWebdriver(attributeName_xpath, MCG_Active + Active + "']]/following-sibling::td[input[@type='checkbox']]", Active);
                        clickWebdriver(attributeName_xpath, MCG_Active + Active + "']]/following-sibling::td[input[@type='checkbox']]");
                        //td[input[@value='TestingSupport']]/following-sibling::td[input[@type='checkbox']]
                    }
                }
                if (!delete.equals("")) {
                    String[] data = delete.split(";");
                    String statusName = Runtimedataread(data[0]);
                    if (data[0].equalsIgnoreCase("check")) {
                        String Delete = Runtimedataread(data[1]);
                        waitForElementPresentWebdriver(attributeName_xpath, MCG_DeleteCheck + Delete + "']]/following-sibling::td[input[@name='chkDelete']]", Delete);
                        clickWebdriver(attributeName_xpath, MCG_DeleteCheck + Delete + "']]/following-sibling::td[input[@name='chkDelete']]");
                        //td[input[@value='TestingSupport']]/following-sibling::td[input[@name='chkDelete']]
                    } else {
                        System.out.println("==");
                        //driver.findElement(By.xpath("//input[@value='"+statusName+"']/../..//input[@name='chkDelete']")).click();
                        waitForElementPresentWebdriver(attributeName_xpath, MCG_DeleteCheck + statusName + "']]/following-sibling::td[input[@name='chkDelete']]", statusName);
                        clickWebdriver(attributeName_xpath, MCG_DeleteCheck + statusName + "']]/following-sibling::td[input[@name='chkDelete']]");
                        //waitForElementPresentWebdriver(attributeName_xpath, "//input[@value='" + statusName + "']/../..//input[@name='chkDelete']", data[1]);
                      //  clickWebdriver(attributeName_xpath, "//input[@value='" + statusName + "']/../..//input[@name='chkDelete']");

                    }
                }

                if (!savecanceladdrow.equals("")) {
                    Reporter.log("Check the Name of the Button as [" + savecanceladdrow + "]");
                    if (savecanceladdrow.equalsIgnoreCase("save")) {
                        waitForPageToLoadWebdriver();
                        waitForElementPresentWebdriver(attributeName_xpath, AID_save_button, "Save");
                        clickWebdriver(attributeName_xpath, AID_save_button);
                        sleep(2);//Added by Rahul Mehta on 14th March 2019
                        waitForPageToLoadWebdriver();

                      WebDriverWait wait = new WebDriverWait(driver, 10); // removed due to selenium dpncy version change
//                       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                        if (wait.until(ExpectedConditions.alertIsPresent()) != null) {
                            // Switch to the alert and accept it
                            Alert alert = driver.switchTo().alert();
                            alert.accept();
                        } else{

                    }

                        //driver.switchTo().frame(0);
                    }

                    if (savecanceladdrow.equalsIgnoreCase("addrow")) {
                        waitForElementPresentWebdriver(attributeName_xpath, MCG_AddRow, "Plus");
                        clickWebdriver(attributeName_xpath, MCG_AddRow);
                    }
                    if(savecanceladdrow.equalsIgnoreCase("cancel"))
                    {
                        waitForElementPresentWebdriver(attributeName_xpath,"//img[contains(@src,'cancel')]","cancel");
                        clickWebdriver(attributeName_xpath,"//img[contains(@src,'cancel')]");
                        sleep(2);
                        waitForPageToLoadWebdriver();
                    }
            }

		switchToDefaultContentWebdriver();
		} catch (IOException e) {
			e.printStackTrace();

		} catch (RowsExceededException e) {
			e.printStackTrace();
		} catch (BiffException e) {
			e.printStackTrace();
		} catch (WriteException e) {
			e.printStackTrace();
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}

	}


}
