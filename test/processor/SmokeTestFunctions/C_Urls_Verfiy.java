package processor.SmokeTestFunctions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Reporter;
import processor.CommonSeleniumActions;
import static processor.Processor.driver;

public class C_Urls_Verfiy extends CommonSeleniumActions {


    public void AY_urls_verify  ()throws Exception{

        try {
            //WebDriverManager.chromedriver().setup();
            //WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            writeMessageInBold("About Verify Datatransfer import URL is accessible");

            Reporter.log(" https://import.applyyourself.com/aydatatransferws.asmx ");

             get("https://import.applyyourself.com/aydatatransferws.asmx");
            writeMessageInBold("About Verify Datatransfer exports URL is accessible");

            Reporter.log("https://export.applyyourself.com/aydatatransferws.asmx ");
            get("https://export.applyyourself.com/aydatatransferws.asmx");

            writeMessageInBold("About Verify Clients Info page is accessible.");

            Reporter.log("https://ayws.applyyourself.com/IClassService.svc");
             get("https://ayws.applyyourself.com/IClassService.svc");



        } catch (Exception e) {
            writeFailure(e.getLocalizedMessage());
        }
    }

    }

