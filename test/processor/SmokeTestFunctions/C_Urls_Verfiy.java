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


    public void AY_urls_verify( String Import,String Export,String IClassService)throws Exception{

        try {
            //WebDriverManager.chromedriver().setup();
            //WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            writeMessageInBold("About Verify Datatransfer import URL is accessible");

            Reporter.log(Import);

             get(Import);
            writeMessageInBold("About Verify Datatransfer exports URL is accessible");

            Reporter.log(Export);
            get(Export);

            writeMessageInBold("About Verify Clients Info page is accessible.");

            Reporter.log(IClassService);
             get(IClassService);



        } catch (Exception e) {
            writeFailure(e.getLocalizedMessage());
        }
    }

    }

