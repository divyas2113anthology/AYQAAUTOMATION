package processor.SmokeTestFunctions;

import or.Smoke_OR;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.testng.Reporter;
import processor.CommonSeleniumActions;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class E_CreateNew_account_Classic_version extends CommonSeleniumActions implements Smoke_OR {

    public void AY_App_creation_Classic(String ClassicApp_login) throws Exception {
        try {
            writeMessageInBold("About to create new account in classic version ");
            get(ClassicApp_login);

            clickWebdriver(attributeName_xpath, clkcrtacc);
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMMdd_yymms");

            LocalDateTime now = LocalDateTime.now();
            System.out.println(dtf.format(now));
            sendKeys(attributeName_xpath, cfstname, "AySmoke");
            sendKeys(attributeName_xpath, clstname, dtf.format(now));
            sleep(5);
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
            sleep(10);

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
            sendKeys(attributeName_xpath, pldob, "01/01/1990");
            sendKeys(attributeName_xpath, plnum, "245-52-5478");

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

            clickWebdriver(attributeName_xpath, CCsave);
            sleep(10);

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

            writeMessageInBold("Verify payment voucher is click ");
            clickWebdriver(attributeName_xpath, clkpayvou);


            recentPopupCloseWebdriver();

            clickWebdriver(attributeName_xpath, cclogout);


        } catch (Exception e) {
            writeFailure(e.getLocalizedMessage());
        }


    }


}
