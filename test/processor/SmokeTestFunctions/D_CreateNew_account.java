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
    protected B_SmokeTestCommon smokeTestCommon;

    public void AY_App_creationSJCQA(String Applicationlogin) throws Exception {

        try {

            get(Applicationlogin);

            clickWebdriver(attributeName_xpath, Crtaccclick);
            writeMessageInBold("Creating Account SJC QA");

            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMMdd_yymms");

            LocalDateTime now = LocalDateTime.now();
            System.out.println(dtf.format(now));
            writeMessageInBold("Entering required field");
            sendKeys(attributeName_xpath, FrstName, "AY_Smoke");
            sendKeys(attributeName_xpath, lstName, dtf.format(now));
            waitForPageToLoad();
            sendKeys(attributeName_xpath, email, "sdfghjkl@gmail.com");
            sendKeys(attributeName_xpath, cnfemail, "sdfghjkl@gmail.com");
            sendKeys(attributeName_xpath, dob, "11/07/1995");
            sendKeys(attributeName_xpath, ZIP, "11995");
            sendKeys(attributeName_xpath, pwd, "Auto123+");
            sendKeys(attributeName_xpath, ConPwd, "Auto123+");

            Reporter.log("Check the acknowledge: I acknowledge by submitting this form my data is available to the institution.");
            clickWebdriver(attributeName_xpath, Checkboxlogin);

            clickWebdriver(attributeName_xpath, Crtsub);
            waitForPageToLoad();
            getTextWebdriver(attributeName_xpath, ayconfr);

            WebElement text = driver.findElementByXPath(ayconfr);
            text.getText();
            waitForPageToLoad();
            String generatepin = text.getText().substring(6, 18);
            System.out.println(generatepin);
            Reporter.log("Generating PIN " + generatepin);
            waitForPageToLoad();
            clickWebdriver(attributeName_xpath, aylogin);
            waitForPageToLoad();
            Reporter.log("Checking privacy policy Check Box");
            clickWebdriver(attributeName_xpath, checkpvt);

            ////UK CHANGES//////
            clickWebdriver(attributeName_xpath, chepresub);
            waitForPageToLoad();

            waitForPageToLoad();
            clickWebdriver(attributeName_xpath, conandcrt);
            waitForPageToLoad();
            String element = verifyhomepage;
            String value = "My Application(s)";
            verifyElementPresent(element, value);
            waitForPageToLoad();
            waitForPageToLoad();
            waitForPageToLoad();
            clickWebdriver(attributeName_xpath, clkapp);

            String element1 = clkmyapp;
            String value1 = "Application for QA Automation";
            verifyElementPresent(element1, value1);
            waitForPageToLoad();
            clickWebdriver(attributeName_xpath, clkperdata);

            sendKeys(attributeName_xpath, plfstname, "AY");
            sendKeys(attributeName_xpath, pllstname, "Smoke1");
            sendKeys(attributeName_xpath, pldob, "01/01/1990");
            sendKeys(attributeName_xpath, plnum, "245-52-5478");

            waitForPageToLoadWebdriver();

            selectByVisibleTextWebdriver(attributeName_xpath, drpdwngdn, "Male");
            sendKeys(attributeName_xpath, plnumber, "987-654-3210");

            clickWebdriver(attributeName_xpath, plcntry);
            waitForPageToLoadWebdriver();
            waitForPageToLoad();

            selectByVisibleTextWebdriver(attributeName_xpath, plcntry, "United States");
            clickWebdriver(attributeName_xpath, plstate);
            waitForPageToLoadWebdriver();

            selectByVisibleTextWebdriver(attributeName_xpath, plstate, "Michigan");

            clickWebdriver(attributeName_xpath, plgrd);

            sendKeys(attributeName_xpath, esywhoutattch, "ertyuklbvcdrtyukjhgfdsertyuiolkjh");

            clickWebdriver(attributeName_xpath, plsaveandcon);

            waitForPageToLoadWebdriver();


            ////////////uploading fuc//////////////////////////////////////////////////////////////////


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
            waitForPageToLoadWebdriver();


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
            waitForPageToLoadWebdriver();


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
            waitForPageToLoadWebdriver();
            clickWebdriver(attributeName_xpath, clkprnt);

            writeMessageInBold("New Account create and Submitted");

            waitForPageToLoadWebdriver();


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


    /////////////////// UKQA ///////////////////////////
    public void AY_App_creation_LHRQA(String Applicationlogin) throws Exception {

        try {

            get(Applicationlogin);

            clickWebdriver(attributeName_xpath, Crtaccclick);
            writeMessageInBold("Creating Account LHRQA ");

            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMMdd_yymms");

            LocalDateTime now = LocalDateTime.now();
            System.out.println(dtf.format(now));
            Reporter.log("");
            Reporter.log("");
            Reporter.log("");
            Reporter.log("");

            writeMessageInBold("Entering required field");
            sendKeys(attributeName_xpath, FrstName, "AY_Smoke");
            sendKeys(attributeName_xpath, lstName, dtf.format(now));
            waitForPageToLoad();
            sendKeys(attributeName_xpath, email, "sdfghjkl@gmail.com");
            sendKeys(attributeName_xpath, cnfemail, "sdfghjkl@gmail.com");
            sendKeys(attributeName_xpath, dob, "11/07/1995");
            sendKeys(attributeName_xpath, ZIP, "11995");
            sendKeys(attributeName_xpath, pwd, "Auto123+");
            sendKeys(attributeName_xpath, ConPwd, "Auto123+");

            Reporter.log("Check the acknowledge: I acknowledge by submitting this form my data is available to the institution.");
            clickWebdriver(attributeName_xpath, Checkboxlogin);

            clickWebdriver(attributeName_xpath, Crtsub);
            waitForPageToLoad();
            getTextWebdriver(attributeName_xpath, ayconfr);

            WebElement text = driver.findElementByXPath(ayconfr);
            text.getText();
            waitForPageToLoad();
            String generatepin = text.getText().substring(6, 18);
            System.out.println(generatepin);
            Reporter.log("Generating PIN " + generatepin);
            waitForPageToLoad();
            clickWebdriver(attributeName_xpath, aylogin);
            waitForPageToLoad();
            Reporter.log("Checking privacy policy Check Box");
            clickWebdriver(attributeName_xpath, checkpvt);

            ////UK CHANGES//////

            waitForPageToLoad();

            waitForPageToLoad();
            clickWebdriver(attributeName_xpath, conandcrt);
            waitForPageToLoad();
            String element = verifyhomepage;
            String value = "My Application(s)";
            verifyElementPresent(element, value);
            waitForPageToLoad();
            waitForPageToLoad();
            waitForPageToLoad();
            clickWebdriver(attributeName_xpath, clkapp);

            String element1 = clkmyapp;
            String value1 = "Application for QA Automation";
            verifyElementPresent(element1, value1);
            waitForPageToLoad();
            clickWebdriver(attributeName_xpath, clkperdata);
            writeMessageInBold("Personal data");
            sendKeys(attributeName_xpath, "//*[@id=\"q24297\"]", "AY");
            sendKeys(attributeName_xpath, "//*[@id=\"q24299\"]", "SMOKE1");
            sendKeys(attributeName_xpath, "//*[@id=\"q24300\"]", "01/01/1990");
            sendKeys(attributeName_xpath, "//*[@id=\"q24301\"]", "245-52-5478");
            sendKeys(attributeName_xpath, "//*[@id=\"q24306\"]", "245-523-5478");

            waitForPageToLoadWebdriver();

            clickWebdriver(attributeName_xpath, ukclk_1);
            waitForPageToLoadWebdriver();
            waitForPageToLoad();

            selectByVisibleTextWebdriver(attributeName_xpath, uk_clk_cty, "United States");
            clickWebdriver(attributeName_xpath, uk_clk02);
            waitForPageToLoadWebdriver();
            clickWebdriver(attributeName_xpath, uk_clk03);

            selectByVisibleTextWebdriver(attributeName_xpath, uk_clk04, "Michigan");

//            //new fuction for UK UPLOAD
//            clickWebdriver(attributeName_xpath, "//img[@alt='Upload Attachment']");
//            waitForPageToLoad();
//            Reporter.log("");
//            recentPopupSelectWebdriver("File Upload");
//            waitForElementPresentWebdriver(attributeName_xpath, EA_UploadBrowser, "Upload Browser");
//            attributeNameValue(attributeName_xpath, EA_UploadBrowser).sendKeys(fupldoc);
//            clickWebdriver(attributeName_xpath, fclkchosfile);
//
//            recentOpenedPopupSelectWebdriver("Window");

            clickWebdriver(attributeName_xpath, drpdwn01);
            clickWebdriver(attributeName_xpath, drpdwn2);
            sendKeys(attributeName_xpath, uk_zipcode, "45678");
            sendKeys(attributeName_xpath, uk_gmail, "dfghjkl@gmail.com");
            sleep(10);

            clickWebdriver(attributeName_xpath, fclksave);

            waitForPageToLoadWebdriver();


            ////////////uploading fuc//////////////////////////////////////////////////////////////////


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
            waitForPageToLoadWebdriver();


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
            waitForPageToLoadWebdriver();


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
            Reporter.log("");
            clickWebdriver(attributeName_xpath, fclksave);
            waitForPageToLoad();


///////////////////////////AVS LOOKUP/////////////////////////////

            writeMessageInBold("Verfiy AVS LOOKUP");
            clickWebdriver(attributeName_xpath, uk_clk_Personal_Information);
            sendKeys(attributeName_xpath, uk_avs_fstname, "Smoke1");
            sendKeys(attributeName_xpath, uk_avs_lstname, "Test");

            clickWebdriver(attributeName_xpath, uk_avslookupclk);
            recentPopupSelectWebdriver("Address Lookup");
            clickWebdriver(attributeName_xpath, uk_dropdownclk_india);

            sendKeys(attributeName_xpath, ukavs_1lineaddress, "No 43");
            sendKeys(attributeName_xpath, ukavs_2lineaddress, "Testing Street");
            sendKeys(attributeName_xpath, ukavs_3lineaddress, "Tech Nagar");
            sendKeys(attributeName_xpath, ukavs_city, "Banglore");

            clickWebdriver(attributeName_xpath, ukavs_dropdown1);
            sendKeys(attributeName_xpath, UKavs_zipcode, "45673");
            clickWebdriver(attributeName_xpath, uk_avs_btnclk);
            waitForPageToLoad();
            recentOpenedPopupSelectWebdriver("Education Background");
            clickWebdriver(attributeName_xpath, fclksave);
///////////////Business Rules/////////////
            Reporter.log("");
            Reporter.log("");
            Reporter.log("");
            Reporter.log("");
            writeMessageInBold("Verify Business Rules ");
            clickWebdriver(attributeName_xpath, uk_clkBusinessrules);


            clickWebdriver(attributeName_xpath, fclksave);

            /////////////////Education background/////////////
            writeMessageInBold("Verify CEEB LOOKUP ");
            clickWebdriver(attributeName_xpath, ukapp_btneduback);

            clickWebdriver(attributeName_xpath, ukap_lookupclick);

            recentPopupSelectWebdriver("LookUp");
            sendKeys(attributeName_xpath, uk_CEEBLOOKUP_1, "a");
            clickWebdriver(attributeName_xpath, UK_CEEBLOOKUP_CLKSEARCH);
            waitForPageToLoad();
            clickWebdriver(attributeName_xpath, UK_CEEBLOOKUP_CLK);
            waitForPageToLoad();

            sleep(20);

            recentOpenedPopupSelectWebdriver("Education Background");
            sleep(2);
            Reporter.log("Lookup");

            clickWebdriver(attributeName_xpath, fclksave);


            waitForPageToLoad();
//
//            Reporter.log("Click RegularSection ");
//            String element01 = clkRegularSection;
//            String elementname1 = "RegularSection";
//
//            waitForPageToLoadWebdriver();
//
//            clickWebdriver(attributeName_xpath, element01);
//
//
//            sendKeys(attributeName_xpath, Regsefst, "Test01");
//            sendKeys(attributeName_xpath, Reglst, "Smoke");
//            clickWebdriver(attributeName_xpath, RegSave);
//            waitForPageToLoad();


            //////////Recommendations//////////
            clickWebdriver(attributeName_xpath, UK_CLKRecommendations);
            clickWebdriver(attributeName_xpath, Clkrecprv);

            /////////////////////////////////////


            clickWebdriver(attributeName_xpath, clkaddprv);
            sendKeys(attributeName_xpath, recfstname, "flSmoke1");
            sendKeys(attributeName_xpath, reclstname, "Smoke");
            sendKeys(attributeName_xpath, recgmail, "AYsmokejan2023@proton.me");
            clickWebdriver(attributeName_xpath, UK_RECO_TYPE_DROPDOWN);
            radioWebdriver(attributeName_xpath, recq);
            clickWebdriver(attributeName_xpath, recadd);
            waitForPageToLoad();
            alertAccept();
            waitForPageToLoad();

            sleep(10);
            clickWebdriver(attributeName_xpath, Submitapp);
            sleep(10);
            checkWebdriver(attributeName_xpath, chkbox);
            clickWebdriver(attributeName_xpath, Sub1);

            checkWebdriver(attributeName_xpath, chckpay);
            clickWebdriver(attributeName_xpath, clkpay);
            alertAccept();
            sendKeys(attributeName_xpath, signname, "Smokeay");
            clickWebdriver(attributeName_xpath, Sub1);


            clickWebdriver(attributeName_xpath, clkprintbtn);
            waitForPageToLoadWebdriver();
            clickWebdriver(attributeName_xpath, clkprnt);

            writeMessageInBold("New Account create and Submitted Sucessfully ");

            waitForPageToLoadWebdriver();


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
