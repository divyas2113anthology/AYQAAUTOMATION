package processor.SmokeTestFunctions;

import com.opencsv.CSVWriter;
import or.OR;

import or.Smoke_OR;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.CaptureScreenshot;
import org.testng.Reporter;
import processor.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


public class B_SmokeTestCommon extends CommonSeleniumActions implements OR, Smoke_OR {
    String Applicationlogin;

    public void aYWebcenterLogin(String strAYWebCenterUrl, String arSchoolId, String ayAdminUsername, String ayAdminPassword) throws Exception {
        writeMessageInBold("Function Name - 'loginAdmin'.  Parameters - Admin URL - '" + strAYWebCenterUrl + "', Username - '" + ayAdminUsername + "' and Password - '" + ayAdminPassword + "'");

        get(strAYWebCenterUrl);
        waitForPageToLoadWebdriver();


        Reporter.log("Waiting till either the 'Login' page or the 'Home' page gets loaded");
        int counter = 0;
        String result = "";
        do {
            waitTimeImplicit(5);
            counter = counter + 1;
            if (isElementPresentWebdriver(attributeName_cssselector, WCL_ClientID)) {
                Reporter.log("'Login' page displayed");
                result = "loginPageDisplayed";
            } else if (isElementPresentWebdriver(attributeName_cssselector, WCL_Logout)) {
                Reporter.log("'Welcome' page displayed");
                result = "homePageDisplayed";
            } else {
                // if neither the 'Login' page nor the 'Home' page is present, we are checking if the 'wait time' (represented by the 'counter' variable
                // had got past the 'paramWaitSeconds' seconds)
                if (counter > 10) {
                    writeFailure("Neither the 'Login' page nor the 'Home' page was displayed even after '" + counter + "' seconds");
                    result = "TimeElapsed";
                }
            }
        } while (result.equals(""));

        if (result.equalsIgnoreCase("loginPageDisplayed")) {
            Reporter.log("result = 'loginPageDisplayed'");

            Reporter.log("'Login username is displayed");
            sendKeys(attributeName_cssselector, WCL_ClientID, arSchoolId);
            sendKeys(attributeName_cssselector, WCL_UserID, ayAdminUsername);
            sendKeys(attributeName_cssselector, WCL_Password, ayAdminPassword);
            Reporter.log("About to click login button ");
            sleep(10);
            clickWebdriver(attributeName_xpath, WCL_Go);
            waitForPageToLoadWebdriver();

//            clickWebdriverWithCoordinates(attributeName_xpath,"//*[@id=\"oMenu_mnuSelMod\"]");
//
//            clickWebdriverWithCoordinates(attributeName_xpath,"//*[@id=\"oMenu_mnuAdm\"]");
//
//            clickWebdriverWithCoordinates(attributeName_xpath,"//*[@id=\"oMenu_oMenu4\"]");

//            clickWebdriverWithCoordinates(attributeName_xpath,"//*[@id=\"oMenu_mnuAddApp\"]");
//
//            clickWebdriverWithCoordinates(attributeName_xpath,"//*[@id=\"oMenu_oMenu3\"]");


            waitForElementPresentWebdriverWait(attributeName_cssselector, WCL_Logout, "Welcome");
            // At this point, the 'Home' page should be displayed
            if (isElementPresentWebdriver(attributeName_cssselector, WCL_Logout)) {
                Reporter.log("'Welcome' page display");
            } else {
                writeFailure("'Home' tab not present.  There might be an error after login");
            }
        }


        Reporter.log("End of the 'loginAdmin' function");
    }

    public void generateCsvFile(String FirstName, String filename) throws IOException {
        Reporter.log("Creating a DataImport.txt file  ");
        File file = new File(filename);
        file.delete();

        FileWriter outputfile = new FileWriter(filename);

        CSVWriter writer = new CSVWriter(outputfile, ',',
                CSVWriter.NO_QUOTE_CHARACTER,
                CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                CSVWriter.DEFAULT_LINE_END);

        // create a List which contains String array
        List<String[]> data = new ArrayList<String[]>();

        data.add(new String[]{"SMOKE", FirstName});

        writer.writeAll(data);
        writer.flush();
        writer.close();

        Reporter.log("DataImport.txt file is created ");
    }


    public void logoutAYWebCenter() throws Exception {
        writeMessageInBold("Function Name - 'logoutAdmin'.  Parameters - None");
        if (isElementPresentWebdriver(attributeName_cssselector, WCL_Logout)) {


            clickWebdriver(attributeName_cssselector, WCL_Logout);
            waitForPageToLoadWebdriver();
            waitForElementPresentWebdriver(attributeName_cssselector, WCL_UserID, "Login");

            waitTimeImplicit(5); // a '2-second' wait for a safer side


            if (isElementPresentWebdriver(attributeName_cssselector, WCL_UserID)) {
                Reporter.log("'Login' page displayed on clicking 'Logout'");
            } else {

                writeFailure("Login page was not displayed on clicking 'Logout'");
            }
        } else {
            writeFailure("Function Name - 'logoutAdmin'.  The 'Logout' link not present");
        }

        Reporter.log("End of the 'logoutAdmin' function");

    }

    public void verifyBuildNumber(String paramBuildNumber) throws Exception {
        Reporter.log("Function Name - 'verifyBuildNumber'.  Parameters - Build Number - '" + paramBuildNumber + "'");

        // Since the 'Build Number' would be displayed with a few leading spaces,
        // had verified its value via. the 'verifyTrimmedText' function, which
        // would trim the displayed value before comparing
        String elementLocator = "//div[@class='bottomText']";
        String elementName = "Build Number";
        String expectedText = paramBuildNumber;
        verifyElementPresent(elementLocator, elementName);
        elementLocator.substring(1, 11);
        verifyElementTextWebdriver(attributeName_xpath, elementLocator, expectedText, elementName);

    }

    public void Dynamic_section() throws Exception {

        clickWebdriverWithCoordinates(attributeName_xpath, wcselectsystem);
        clickWebdriver(attributeName_xpath, wcapplicationsystem);
        clickWebdriver(attributeName_xpath, wcapplicationqa);
        clickWebdriver(attributeName_xpath, wcapplicationadm);


        clickWebdriver(attributeName_xpath, wcconfigureforms);
        waitForPageToLoadWebdriver();
        sleep(2);
        switchToFrameNameIdWebdriver("frmTreeMenu");
        isElementPresentWebdriver(attributeName_xpath, wcckexpandbtn);
        clickWebdriver(attributeName_xpath, wcckexpandbtn);
        waitForElementPresentWebdriver(attributeName_xpath, wcclkmanagesectionrules, "Manage Section Rules");
        clickWebdriver(attributeName_xpath, wcclkmanagesectionrules);
        switchToDefaultContentWebdriver();

        switchToFrameNameIdWebdriver("frmContent");
        waitForPageToLoadWebdriver();
        clickWebdriver(attributeName_xpath, wcclkaddbtn);
        waitForPageToLoadWebdriver();
        sendKeys(attributeName_xpath, wcenter_name, "smokeTest");

        sendKeys(attributeName_xpath, wcenter_dspname, "Dymatic Section");

        clickWebdriver(attributeName_xpath, wcsectioninput);
        sleep(10);

        clickWebdriver(attributeName_xpath, wcselectatt);
        clickWebdriver(attributeName_xpath, wcselect_expand);
        sleep(10);

        clickWebdriver(attributeName_xpath, wcclkfield);
        // alertAccept();
        clickWebdriver(attributeName_xpath, wcclkselect);
        sleep(10);
        clickWebdriver(attributeName_xpath, wcclk2);
        clickWebdriver(attributeName_xpath, wcclkoper);
        clickWebdriver(attributeName_xpath, wcclkoperator);

        sendKeys(attributeName_xpath, wcentervalue, "07/18/1995");

        clickWebdriver(attributeName_xpath, wcclksave);

        switchToDefaultContentWebdriver();

        switchToFrameNameIdWebdriver("frmTreeMenu");
        waitForPageToLoadWebdriver();
        sleep(30);
        clickWebdriver(attributeName_xpath, wcclkxpand1);
        clickWebdriver(attributeName_xpath, wcclkpermanentandHomeaddress);
        waitForPageToLoadWebdriver();
        switchToDefaultContentWebdriver();
        switchToFrameNameIdWebdriver("frmContent");
        clickWebdriver(attributeName_xpath, wccbuildedit);
        waitForPageToLoadWebdriver();
        clickWebdriver(attributeName_xpath, wcclkprod);
        alertAccept();
        waitForPageToLoadWebdriver();
        waitForPageToLoadWebdriver();
        switchToDefaultContentWebdriver();
        switchToFrameNameIdWebdriver("frmTreeMenu");
        clickWebdriver(attributeName_xpath, wcclkpackage_publish);

        waitForPageToLoad();
        waitForPageToLoadWebdriver();
        sleep(20);
        switchToDefaultContentWebdriver();
        switchToFrameNameIdWebdriver("frmContent");
        clickWebdriver(attributeName_xpath, wcclkpublishprod);
        alertAccept();
        waitForPageToLoadWebdriver();
        waitForPageToLoadWebdriver();
        waitForPageToLoadWebdriver();
        waitForPageToLoadWebdriver();
        waitForPageToLoadWebdriver();
        waitForPageToLoadWebdriver();
        waitForPageToLoadWebdriver();
        waitForPageToLoadWebdriver();
        waitForPageToLoadWebdriver();
        waitForPageToLoadWebdriver();
        waitForPageToLoadWebdriver();
        waitForPageToLoadWebdriver();
        waitForPageToLoad();
        waitForPageToLoad();
        sleep(10);
        switchToDefaultContentWebdriver();
        switchToFrameNameIdWebdriver("frmTreeMenu");

        waitForPageToLoad();
        clickWebdriver(attributeName_xpath, wcclk_ApplicationSystemHome);

        switchToDefaultContentWebdriver();
        waitForPageToLoad();
        waitForPageToLoad();
        waitForPageToLoad();
        waitForPageToLoad();

    }

    public void ayapplication_login(String Applicationlogin) throws Exception {
//creating
        get(Applicationlogin);

        clickWebdriver(attributeName_xpath, Crtaccclick);
        writeMessageInBold("Creating Account");

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMMdd_yymms");

        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
        writeMessageInBold("Entering required field");
        sendKeys(attributeName_xpath, FrstName, "AY_Smoke");
        sendKeys(attributeName_xpath, lstName, dtf.format(now));
        waitForPageToLoad();
        sendKeys(attributeName_xpath, email, "sdfghjkl@gmail.com");
        sendKeys(attributeName_xpath, cnfemail, "sdfghjkl@gmail.com");
        sendKeys(attributeName_xpath, dob, "07/18/1995");
        sendKeys(attributeName_xpath, ZIP, "11995");
        sendKeys(attributeName_xpath, pwd, "Auto123+");
        sendKeys(attributeName_xpath, ConPwd, "Auto123+");

        Reporter.log("Check the acknowledge: I acknowledge by submitting this form my data is available to the institution.");
        clickWebdriver(attributeName_xpath, Checkboxlogin);

        clickWebdriver(attributeName_xpath, Crtsub);

        sleep(10);

        waitForPageToLoad();
        //using get text method we are getting pin
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

        waitForPageToLoad();
        clickWebdriver(attributeName_xpath, chepresub);
        waitForPageToLoad();
        clickWebdriver(attributeName_xpath, conandcrt);
        waitForPageToLoad();
        String element = verifyhomepage;
        String value = "My Application(s)";
        verifyElementPresent(element, value);

        clickWebdriver(attributeName_xpath, clkapp);

        String element1 = clkmyapp;
        String value1 = "Application for QA Automation";
        verifyElementPresent(element1, value1);
        waitForPageToLoad();
        clickWebdriver(attributeName_xpath, clkperdata);

        sendKeys(attributeName_xpath, plfstname, "AY");
        sendKeys(attributeName_xpath, pllstname, "Smoke1");
        sendKeys(attributeName_xpath, pldob, "07/18/1995");
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


    }

    public void verify_Dynamic_section_application() throws Exception {
        waitForPageToLoadWebdriver();
        //getting text and verfiy the section functionlity
        writeMessageInBold("About to verify Dynamic Section functionality ");
        getTextWebdriver(attributeName_xpath, fclkHomeAddress);
        verifyElementPresent(fclkHomeAddress, "Home Address");

    }


    public void Dynamic_section_delete() throws Exception {

        writeMessageInBold("About to delete the Dynamic Section");

        clickWebdriverWithCoordinates(attributeName_xpath, wcselectsystem);
        clickWebdriver(attributeName_xpath, wcapplicationsystem);
        clickWebdriver(attributeName_xpath, wcapplicationqa);
        clickWebdriver(attributeName_xpath, wcapplicationadm);


        clickWebdriver(attributeName_xpath, wcconfigureforms);
        waitForPageToLoadWebdriver();
        sleep(2);
        //switch frame
        switchToFrameNameIdWebdriver("frmTreeMenu");
//
        waitForElementPresentWebdriver(attributeName_xpath, wcclkmanagesectionrules, "Manage Section Rules");
        clickWebdriver(attributeName_xpath, wcclkmanagesectionrules);
        //Switch to default frame
        switchToDefaultContentWebdriver();
//switch frame
        switchToFrameNameIdWebdriver("frmContent");
///check all the checkbox with same name "Smoketest" using loop
        List<WebElement> checkBoxList = driver.findElements(By.xpath(wccheckbox));
        for (WebElement checkBox : checkBoxList) {
            checkBox.click();
        }


        clickWebdriver(attributeName_xpath, wcclkdelete);
        alertAccept();
        waitForPageToLoad();
        //Switch to default frame
        switchToDefaultContentWebdriver();
        switchToFrameNameIdWebdriver("frmTreeMenu");
        clickWebdriver(attributeName_xpath, wcclk_ApplicationSystemHome);


    }

    public void BR_Triggering() throws Exception {

        writeMessageInBold("About add Business Rule");
        clickWebdriverWithCoordinates(attributeName_xpath, wcselectsystem);
        clickWebdriver(attributeName_xpath, wcapplicationsystem);
        clickWebdriver(attributeName_xpath, wcapplicationqa);
        clickWebdriver(attributeName_xpath, wcapplicationadm);
        clickWebdriver(attributeName_xpath, wcclk_confrules);
        clickWebdriver(attributeName_xpath, wcclk_BR);
        clickWebdriver(attributeName_xpath, wcclk_BR_ADD);

        sendKeys(attributeName_xpath, wcclk_BR_RULENAME, "SmokeTest");

        sendKeys(attributeName_xpath, wcclk_BR_RULEDescription, "VerifyBR_Triggering");


        clickWebdriver(attributeName_xpath, Wc_BR_USERTYPE);

        clickWebdriver(attributeName_xpath, Wc_BR_UserDropdownselect);


        waitForPageToLoad();
        clickWebdriver(attributeName_xpath, Wc_BR_actionid);
        waitForPageToLoad();
        clickWebdriver(attributeName_xpath, wc_BR_actiondropdown);
        waitForPageToLoad();
        clickWebdriver(attributeName_xpath, wc_BR_sectionid);
        waitForPageToLoad();
        clickWebdriver(attributeName_xpath, Wc_BR_SectionidDropdown);
        clickWebdriver(attributeName_xpath, WC_BR_Questionid);
        waitForPageToLoad();
        clickWebdriver(attributeName_xpath, WC_BR_QUestionidDropdown);
        waitForPageToLoad();
        clickWebdriver(attributeName_xpath, WC_BR_EventTypeId);
        waitForPageToLoad();
        clickWebdriver(attributeName_xpath, WC_BR_EventTypeIdDropdown);
        waitForPageToLoad();
        clickWebdriver(attributeName_xpath, WC_BR_TargetFormId);
        waitForPageToLoad();
        clickWebdriver(attributeName_xpath, WC_BR_TargetFormIdDropdown);
        waitForPageToLoad();
        clickWebdriver(attributeName_xpath, WC_BR_TargetQuestionId);
        waitForPageToLoad();
        clickWebdriver(attributeName_xpath, WC_BR_TargetQuestionIddropdown);
        waitForPageToLoad();
        clickWebdriver(attributeName_xpath, WC_BR_TargetQuestionId01);
        waitForPageToLoad();
        clickWebdriver(attributeName_xpath, WC_BR_TargetQuestionId01Dropdown);
        waitForPageToLoad();
        clickWebdriver(attributeName_xpath, WC_BR_Save);


    }

    public void Verify_BR_Triggering_application() throws Exception {
        writeMessageInBold("About verify BR ");
        //getting error msg with display in application
        WebElement text = driver.findElementByXPath(BR_erro_msg);
        text.getText();
        String Geterrormessage = text.getText().substring(0, 60);

        System.out.println(Geterrormessage);

        Reporter.log("");
        Reporter.log("");
        Reporter.log("");
        writeMessageInBold(Geterrormessage);

        waitForPageToLoad();


    }

    public void Wc_Delete_BR_Triggering() throws Exception {

        writeMessageInBold("About to delete BR_Triggering  ");
        clickWebdriverWithCoordinates(attributeName_xpath, wcselectsystem);
        clickWebdriver(attributeName_xpath, wcapplicationsystem);
        clickWebdriver(attributeName_xpath, wcapplicationqa);
        clickWebdriver(attributeName_xpath, wcapplicationadm);
        clickWebdriver(attributeName_xpath, wcclk_confrules);
        clickWebdriver(attributeName_xpath, wcclk_BR);
///check all the checkbox with same name "Smoketest" using loop
        List<WebElement> checkBoxList = driver.findElements(By.xpath(WC_BR_checkbox));
        for (WebElement checkBox : checkBoxList) {
            checkBox.click();
        }


        clickWebdriver(attributeName_xpath, WC_BR_delete);

        alertAccept();
        waitForPageToLoad();

    }

    public void AY_Application_logout() throws Exception{
waitForPageToLoad();
        clickWebdriver(attributeName_xpath, logout);
    }




}





