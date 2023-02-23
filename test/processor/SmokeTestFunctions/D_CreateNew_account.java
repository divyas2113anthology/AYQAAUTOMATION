package processor.SmokeTestFunctions;

import or.Smoke_OR;
import org.apache.tools.ant.taskdefs.Sleep;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.ClickElement;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.testng.Reporter;
import processor.CommonSeleniumActions;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class D_CreateNew_account extends CommonSeleniumActions implements Smoke_OR {

    public void AY_App_creation(String Applicationlogin) throws Exception {

        try {

            get(Applicationlogin);

            clickWebdriver(attributeName_xpath, Crtaccclick);
            writeMessageInBold("Creating Account");

            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMMdd_yymms");

            LocalDateTime now = LocalDateTime.now();
            System.out.println(dtf.format(now));
            writeMessageInBold("Entering required field");
            sendKeys(attributeName_xpath, FrstName, "AY_Smoke");
            sendKeys(attributeName_xpath, lstName, dtf.format(now));
            sleep(5);
            sendKeys(attributeName_xpath, email, "sdfghjkl@gmail.com");
            sendKeys(attributeName_xpath, cnfemail, "sdfghjkl@gmail.com");
            sendKeys(attributeName_xpath, dob, "11/07/1995");
            sendKeys(attributeName_xpath, ZIP, "11995");
            sendKeys(attributeName_xpath, pwd, "Auto123+");
            sendKeys(attributeName_xpath, ConPwd, "Auto123+");

            Reporter.log("Check the acknowledge: I acknowledge by submitting this form my data is available to the institution.");
            clickWebdriver(attributeName_xpath, Checkboxlogin);

            clickWebdriver(attributeName_xpath, Crtsub);
            sleep(10);
            getTextWebdriver(attributeName_xpath, ayconfr);

            WebElement text = driver.findElementByXPath(ayconfr);
            text.getText();
            waitForPageToLoad();
            String generatepin = text.getText().substring(6, 18);
            System.out.println(generatepin);
            Reporter.log("Generating PIN " + generatepin);
            sleep(10);
            clickWebdriver(attributeName_xpath, aylogin);
            sleep(10);
            Reporter.log("Checking privacy policy Check Box");
            clickWebdriver(attributeName_xpath, checkpvt);

            sleep(10);
            clickWebdriver(attributeName_xpath, chepresub);
            sleep(5);
            clickWebdriver(attributeName_xpath, conandcrt);
            sleep(10);
            String element = verifyhomepage;
            String value = "My Application(s)";
            verifyElementPresent(element, value);

            clickWebdriver(attributeName_xpath, clkapp);

            String element1 = clkmyapp;
            String value1 = "Application for QA Automation";
            verifyElementPresent(element1, value1);
            sleep(5);
            clickWebdriver(attributeName_xpath, clkperdata);

            sendKeys(attributeName_xpath, plfstname, "AY");
            sendKeys(attributeName_xpath, pllstname, "Smoke1");
            sendKeys(attributeName_xpath, pldob, "01/01/1990");
            sendKeys(attributeName_xpath, plnum, "245-52-5478");

            sleep(10);

            selectByVisibleTextWebdriver(attributeName_xpath, drpdwngdn, "Male");
            sendKeys(attributeName_xpath, plnumber, "987-654-3210");

            clickWebdriver(attributeName_xpath, plcntry);
            sleep(10);

            selectByVisibleTextWebdriver(attributeName_xpath, plcntry, "United States");
            clickWebdriver(attributeName_xpath, plstate);
            sleep(10);

            selectByVisibleTextWebdriver(attributeName_xpath, plstate, "Michigan");

            clickWebdriver(attributeName_xpath, plgrd);

            sendKeys(attributeName_xpath, esywhoutattch, "ertyuklbvcdrtyukjhgfdsertyuiolkjh");

            clickWebdriver(attributeName_xpath, plsaveandcon);

            sleep(10);


            writeMessageInBold("About verify uploading DOC ");
            String Clkessay = fclkessay;
            String elementname3 = "Essay and Attachment";
            clickWebdriver(attributeName_xpath, Clkessay);
            sendKeys(attributeName_xpath, Fwriteshortesy, "Smoketesting");
            clickWebdriver(attributeName_xpath, fclkupld);
            waitForPageToLoad();
            Reporter.log("");
            recentPopupSelectWebdriver("File Upload");
            waitForElementPresentWebdriver(attributeName_xpath, EA_UploadBrowser, "Upload Browser");
            attributeNameValue(attributeName_xpath, EA_UploadBrowser).sendKeys(fupldoc);
            clickWebdriver(attributeName_xpath, fclkchosfile);

            recentOpenedPopupSelectWebdriver("Window");
            Reporter.log("");
            sleep(10);


            Reporter.log("About to click View button");
            writeMessageInBold("");
            waitForPageToLoadWebdriver();

            clickWebdriver(attributeName_xpath, EA_EssaywithAttachment_ViewDocument);
            recentPopupSelectWebdriver("view document");
            waitForPageToLoadWebdriver();

            waitForPageToLoadWebdriver();

            Reporter.log("About to click Delete button");

            recentPopupCloseWebdriver();

            clickWebdriver(attributeName_xpath, fclkdel1);

            alertAccept();
            waitForPageToLoadWebdriver();

            //////////////////////////////////////////////////////////////////

            //about to verify media upload

            writeMessageInBold("About to verify media upload");
            Reporter.log("About to click upload button");
            clickWebdriver(attributeName_xpath, fclkupl);
            waitForPageToLoad();
            Reporter.log("");
            recentPopupSelectWebdriver("File Upload");
            waitForElementPresentWebdriver(attributeName_xpath, EA_UploadBrowser, "Upload Browser");
            attributeNameValue(attributeName_xpath, EA_UploadBrowser).sendKeys(fimgpath);
            clickWebdriver(attributeName_xpath, fclkmedia);

            recentOpenedPopupSelectWebdriver("Window");
            Reporter.log("");
            sleep(10);


            Reporter.log("About to click View button");

            waitForPageToLoadWebdriver();

            clickWebdriver(attributeName_xpath, EA_EssaywithAttachment_ViewDocument);
            recentPopupSelectWebdriver("view document");
            waitForPageToLoadWebdriver();

            waitForPageToLoadWebdriver();
            Reporter.log("About to click Delete button");


            recentPopupCloseWebdriver();

            clickWebdriver(attributeName_xpath, fdelatt);

            alertAccept();
            waitForPageToLoadWebdriver();


            /////////////////////////////////////////////////////////////////////


            Reporter.log("");
            clickWebdriver(attributeName_xpath, fclksave);
            waitForPageToLoad();


            waitForPageToLoad();

            Reporter.log("Click RegularSection ");
            String element01 = clkRegularSection;
            String elementname1 = "RegularSection";

            waitForPageToLoadWebdriver();

            clickWebdriver(attributeName_xpath, element01);


            sendKeys(attributeName_xpath, Regsefst, "Test01");
            sendKeys(attributeName_xpath, Reglst, "Smoke");
            clickWebdriver(attributeName_xpath, RegSave);
            waitForPageToLoad();
            clickWebdriver(attributeName_xpath, Regsub);
            waitForPageToLoad();


            clickWebdriver(attributeName_xpath, ClkAddrec);
            clickWebdriver(attributeName_xpath, Clkrecprv);
            clickWebdriver(attributeName_xpath, clkaddprv);
            sendKeys(attributeName_xpath, recfstname, "flSmoke1");
            sendKeys(attributeName_xpath, reclstname, "Smoke");
            sendKeys(attributeName_xpath, recgmail, "AYsmokejan2023@proton.me");
            radioWebdriver(attributeName_xpath, recq);
            clickWebdriver(attributeName_xpath, recadd);
            alertAccept();
            clickWebdriver(attributeName_xpath, Submitapp);
            checkWebdriver(attributeName_xpath, chkbox);
            clickWebdriver(attributeName_xpath, Sub1);
            checkWebdriver(attributeName_xpath, payfee);
            checkWebdriver(attributeName_xpath, chckpay);
            clickWebdriver(attributeName_xpath, clkpay);
            alertAccept();
            sendKeys(attributeName_xpath, signname, "Smokeay");
            clickWebdriver(attributeName_xpath, Sub1);

            String verifyelement = verifytext;
            String elementname01 = "AY Testing Purpose";
            verifyElementPresent(verifyelement, elementname01);
            clickWebdriver(attributeName_xpath, clkprintbtn);
            sleep(20);
            clickWebdriver(attributeName_xpath, clkprnt);

            writeMessageInBold("New Account create and Submitted");


            sleep(10);

            writeMessageInBold("About to verfiy Tech Support link ");

            clickWebdriver(attributeName_xpath, clktechsupt);

            switchToSecondPopupWindow();

            String element02 = verifytechsuptpage;
            String elementname2 = "Hi";
            verifyElementPresent(element02, elementname2);


            // Get the current window handle
            String currentWindowHandle = driver.getWindowHandle();
            // Close the current window
            driver.close();

            // Switch to the previous window
            for (String windowHandle : driver.getWindowHandles()) {
                if (!windowHandle.equals(currentWindowHandle)) {
                    driver.switchTo().window(windowHandle);
                    break;
                }
            }


            clickWebdriver(attributeName_xpath, logout);


        } catch (Exception e) {
            writeFailure(e.getLocalizedMessage());
        }
    }


}
