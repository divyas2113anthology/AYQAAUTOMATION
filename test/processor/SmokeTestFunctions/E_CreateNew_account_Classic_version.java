package processor.SmokeTestFunctions;

import or.Smoke_OR;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.testng.Reporter;
import processor.CommonSeleniumActions;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class    E_CreateNew_account_Classic_version extends CommonSeleniumActions implements Smoke_OR {

    protected B_SmokeTestCommon smokeTestCommon;

    public void AY_App_creation_Classic_SJCQA(String ClassicApp_login) throws Exception {
        try {
            writeMessageInBold("About to create new account in classic version ");
            get(ClassicApp_login);

            clickWebdriver(attributeName_xpath, clkcrtacc);
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMMdd_yymms");

            LocalDateTime now = LocalDateTime.now();
            System.out.println(dtf.format(now));
            sendKeys(attributeName_xpath, cfstname, "AySmoke");
            sendKeys(attributeName_xpath, clstname, dtf.format(now));
            waitForPageToLoad();
            sendKeys(attributeName_xpath, cemail, "fghjk@gmail.com");
            sendKeys(attributeName_xpath, ccemail, "fghjk@gmail.com");
            sendKeys(attributeName_xpath, cdob, "11/07/1995");
            sendKeys(attributeName_xpath, czip, "45673");
            sendKeys(attributeName_xpath, cpas, "Auto123+");
            sendKeys(attributeName_xpath, ccpas, "Auto123+");
            clickWebdriver(attributeName_xpath, ccheckack);
            clickWebdriver(attributeName_xpath, ccrtaccbtn);

            getTextWebdriver(attributeName_xpath, CCgeneratepin);
            WebElement text = driver.findElementByXPath(CCgeneratepin);
            text.getText();
            waitForPageToLoad();
            String generatepin = text.getText().substring(6, 18);
            System.out.println(generatepin);
            Reporter.log("Generating PIN " + generatepin);
            waitForPageToLoad();

            clickWebdriver(attributeName_xpath, cpinlogin);
            clickWebdriver(attributeName_xpath, checkpvt);
            clickWebdriver(attributeName_xpath, chepresub);
            clickWebdriver(attributeName_xpath, ccontinuebtn);

            String element = CCverifyhome;
            String value = "Univeristy of AYAUTO";
            verifyElementPresent(element, value);

            clickWebdriver(attributeName_xpath, cclkApplicationQA);
            clickWebdriver(attributeName_xpath, cclkpersonaldata);

            sendKeys(attributeName_xpath, plfstname, "AY");
            sendKeys(attributeName_xpath, pllstname, "Smoke1");
            sendKeys(attributeName_xpath, pldob, "07/02/1990");
            sendKeys(attributeName_xpath, plnum, "245-52-5478");

            selectByVisibleTextWebdriver(attributeName_xpath, drpdwngdn, "Male");
            sendKeys(attributeName_xpath, plnumber, "987-654-3210");


            clickWebdriver(attributeName_xpath, plcntry);
            waitForPageToLoad();

            selectByVisibleTextWebdriver(attributeName_xpath, plcntry, "United States");
            clickWebdriver(attributeName_xpath, plstate);
            waitForPageToLoad();

            selectByVisibleTextWebdriver(attributeName_xpath, plstate, "Michigan");
            selectByVisibleTextWebdriver(attributeName_xpath, "//select[@id='s40207']", "English");


            clickWebdriver(attributeName_xpath, plgrd);

            sendKeys(attributeName_xpath, esywhoutattch, "ertyuklbvcdrtyukjhgfdsertyuiolkjh");

            clickWebdriver(attributeName_xpath, CCsave);
            waitForPageToLoad();


            ////////////////////////////////////////////

            writeMessageInBold("About verify uploading DOC ");
            String Clkessay = fclkessay;
            String elementname3 = "Essay and Attachment";
            clickWebdriver(attributeName_xpath, ccclickessay_tab);

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
            waitForPageToLoad();


            Reporter.log("");
            writeMessageInBold("About to click View button");
            waitForPageToLoadWebdriver();

            clickWebdriver(attributeName_xpath, EA_EssaywithAttachment_ViewDocument);
            recentPopupSelectWebdriver("view document");
            waitForPageToLoadWebdriver();

            waitForPageToLoadWebdriver();

            writeMessageInBold("About to click Delete button");

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

            Reporter.log("");
            Reporter.log("About to click Delete button");

            recentPopupCloseWebdriver();

            clickWebdriver(attributeName_xpath, fclkdel1);

            alertAccept();
            waitForPageToLoadWebdriver();


            ///////////////////////////////////////////////


            String element01 = clkRegularSection;
            String elementname1 = "RegularSection";

            waitForPageToLoadWebdriver();

            clickWebdriver(attributeName_xpath, element01);

            sendKeys(attributeName_xpath, Regsefst, "Test01");
            sendKeys(attributeName_xpath, Reglst, "Smoke");
            clickWebdriver(attributeName_xpath, CCsave);
            waitForPageToLoad();
            clickWebdriver(attributeName_xpath, ccsub);
            clickWebdriver(attributeName_xpath, cclkaddrec);
            clickWebdriver(attributeName_xpath, recorvbutton);
            clickWebdriver(attributeName_xpath, ccrecadd);

            sendKeys(attributeName_xpath, recfstname, "ClsSmoke1");
            sendKeys(attributeName_xpath, reclstname, "Smoke");
            sendKeys(attributeName_xpath, recgmail, "AYsmokejan2023@proton.me");


            waitForPageToLoad();

            clickWebdriver(attributeName_xpath, ccrecradiobtn);

            clickWebdriver(attributeName_xpath, ccsave1);

            alertAccept();

            clickWebdriver(attributeName_xpath, ccsub);


            clickWebdriver(attributeName_xpath, cccheckredyforconf);
            waitForPageToLoad();
            clickWebdriver(attributeName_xpath, cccontains);
            clickWebdriver(attributeName_xpath, payfee);
            clickWebdriver(attributeName_xpath, chckpay);
            waitForPageToLoad();
            clickWebdriverWithCoordinates(attributeName_xpath, ccpaybtn);
            alertAccept();
            waitForPageToLoad();
            sendKeys(attributeName_xpath, signname, "AYSmokeclassic");
            writeMessageInBold("Payment done submitting application");
            clickWebdriver(attributeName_xpath, clksubbtn);
            waitForPageToLoad();

            writeMessageInBold("Verify payment voucher is clickable ");
            clickWebdriver(attributeName_xpath, clkpayvou);


            recentPopupCloseWebdriver();

            writeMessageInBold("About to verfiy Tech Support link ");

            clickWebdriver(attributeName_xpath, cctechsupt);

            switchToSecondPopupWindow();

            String element02 = ccverifytechsuptpage;
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

            clickWebdriver(attributeName_xpath, cclogout);


        } catch (Exception e) {
            writeFailure(e.getLocalizedMessage());
        }


    }

    //////////////LHRQA/////////////////////////////////////////

    public void AY_App_creation_Classic_LHRQA(String ClassicApp_login) throws Exception {
        try {
            writeMessageInBold("About to create new account in classic version ");
            get(ClassicApp_login);

            clickWebdriver(attributeName_xpath, clkcrtacc);
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMMdd_yymms");

            LocalDateTime now = LocalDateTime.now();
            System.out.println(dtf.format(now));
            sendKeys(attributeName_xpath, cfstname, "AySmoke");
            sendKeys(attributeName_xpath, clstname, dtf.format(now));
            waitForPageToLoad();
            sendKeys(attributeName_xpath, cemail, "fghjk@gmail.com");
            sendKeys(attributeName_xpath, ccemail, "fghjk@gmail.com");
            sendKeys(attributeName_xpath, cdob, "11/07/1995");
            sendKeys(attributeName_xpath, czip, "45673");
            sendKeys(attributeName_xpath, cpas, "Auto123+");
            sendKeys(attributeName_xpath, ccpas, "Auto123+");
            clickWebdriver(attributeName_xpath, ccheckack);
            clickWebdriver(attributeName_xpath, ccrtaccbtn);

            getTextWebdriver(attributeName_xpath, CCgeneratepin);
            WebElement text = driver.findElementByXPath(CCgeneratepin);
            text.getText();
            waitForPageToLoad();
            String generatepin = text.getText().substring(6, 18);
            System.out.println(generatepin);
            Reporter.log("Generating PIN " + generatepin);
            waitForPageToLoad();

            clickWebdriver(attributeName_xpath, cpinlogin);
            clickWebdriver(attributeName_xpath, checkpvt);
            clickWebdriver(attributeName_xpath, "//*[@id=\"Radio3\"]");
            clickWebdriver(attributeName_xpath, ccontinuebtn);

            String element = CCverifyhome;
            String value = "Univeristy of AYAUTO";
            verifyElementPresent(element, value);

            clickWebdriver(attributeName_xpath, cclkApplicationQA);

            clickWebdriver(attributeName_xpath, "//font[normalize-space(text())='Personal Data']");

            sendKeys(attributeName_xpath, "//input[@id=\"q24297\"]", "AY");
            sendKeys(attributeName_xpath, "//input[@id=\"q24299\"]", "SMOKE1");
            sendKeys(attributeName_xpath, "//input[@id=\"q24300\"]", "01/01/1990");
            sendKeys(attributeName_xpath, "//input[@id=\"q24301\"]", "245-52-5478");
            sendKeys(attributeName_xpath, "//input[@id=\"q24306\"]", "345-333-3332");

            clickWebdriver(attributeName_xpath, "//*[@id=\"s24303\"]/option[2]");
            clickWebdriver(attributeName_xpath, "(//img[@alt='Save'])[1]");
            waitForPageToLoad();


            ////////////////////////////////////////////

            writeMessageInBold("About verify uploading DOC ");
            String Clkessay = fclkessay;
            String elementname3 = "Essay and Attachment";
            clickWebdriver(attributeName_xpath, ccclickessay_tab);

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
            waitForPageToLoad();


            Reporter.log("");
            writeMessageInBold("About to click View button");
            waitForPageToLoadWebdriver();

            clickWebdriver(attributeName_xpath, EA_EssaywithAttachment_ViewDocument);
            recentPopupSelectWebdriver("view document");
            waitForPageToLoadWebdriver();

            waitForPageToLoadWebdriver();

            writeMessageInBold("About to click Delete button");

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

            Reporter.log("");
            Reporter.log("About to click Delete button");

            recentPopupCloseWebdriver();

            clickWebdriver(attributeName_xpath, fclkdel1);

            alertAccept();
            waitForPageToLoadWebdriver();


///////////////Business Rules/////////////
            Reporter.log("");
            Reporter.log("");
            Reporter.log("");
            Reporter.log("");
            writeMessageInBold("Verify Business Rules ");
            clickWebdriver(attributeName_xpath, uk_clkBusinessrules);


            clickWebdriver(attributeName_xpath, "(//img[@alt='Save'])[1]");


            ///////////////////////////////////////////////

            /////////////////Education background/////////////
            writeMessageInBold("Verify CEEB LOOKUP ");
            clickWebdriver(attributeName_xpath, ukapp_btneduback);

            clickWebdriver(attributeName_xpath, "//input[@name='cdelkpbutton']");

            recentPopupSelectWebdriver("LookUp");
            sendKeys(attributeName_xpath, uk_CEEBLOOKUP_1, "a");
            clickWebdriver(attributeName_xpath, "//img[@alt='search']");
            waitForPageToLoad();
            clickWebdriver(attributeName_xpath, UK_CEEBLOOKUP_CLK);
            waitForPageToLoad();

            sleep(20);

            recentOpenedPopupSelectWebdriver("Education Background");
            sleep(2);
            Reporter.log("Lookup");

            clickWebdriver(attributeName_xpath, "(//img[@alt='Save'])[1]");


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
            clickWebdriver(attributeName_xpath, "(//img[@alt='Save'])[1]");


//            String element01 = clkRegularSection;
//            String elementname1 = "RegularSection";
//
//            waitForPageToLoadWebdriver();
//
//            clickWebdriver(attributeName_xpath, element01);
//
//            sendKeys(attributeName_xpath, Regsefst, "Test01");
//            sendKeys(attributeName_xpath, Reglst, "Smoke");
//            clickWebdriver(attributeName_xpath, CCsave);
//            waitForPageToLoad();

            clickWebdriver(attributeName_xpath, "//font[normalize-space(text())='Recommendations']");
            clickWebdriver(attributeName_xpath, "//input[@name='RecList']");
            clickWebdriver(attributeName_xpath, "//img[@src='../Images/common_images/add_small_n.gif']");


            sendKeys(attributeName_xpath, recfstname, "ClsSmoke1");
            sendKeys(attributeName_xpath, reclstname, "Smoke");
            sendKeys(attributeName_xpath, recgmail, "AYsmokejan2023@proton.me");
            clickWebdriver(attributeName_xpath, "//*[@id=\"recommendationtype\"]/option[3]");

            waitForPageToLoad();

            clickWebdriver(attributeName_xpath, ccrecradiobtn);

            clickWebdriver(attributeName_xpath, ccsave1);

            alertAccept();

            clickWebdriver(attributeName_xpath, ccsub);


            clickWebdriver(attributeName_xpath, cccheckredyforconf);
            waitForPageToLoad();
            clickWebdriver(attributeName_xpath, cccontains);

            clickWebdriver(attributeName_xpath, chckpay);
            waitForPageToLoad();
            clickWebdriverWithCoordinates(attributeName_xpath, ccpaybtn);
            alertAccept();
            waitForPageToLoad();
            sendKeys(attributeName_xpath, signname, "AYSmokeclassic");
            writeMessageInBold("Payment done submitting application");
            clickWebdriver(attributeName_xpath, clksubbtn);
            waitForPageToLoad();

            writeMessageInBold("Verify payment voucher is clickable ");
            clickWebdriver(attributeName_xpath, clkpayvou);


            recentPopupCloseWebdriver();

            writeMessageInBold("About to verfiy Tech Support link ");

            clickWebdriver(attributeName_xpath, cctechsupt);

            switchToSecondPopupWindow();

            String element02 = ccverifytechsuptpage;
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

            clickWebdriver(attributeName_xpath, cclogout);


        } catch (Exception e) {
            writeFailure(e.getLocalizedMessage());
        }


    }


}
